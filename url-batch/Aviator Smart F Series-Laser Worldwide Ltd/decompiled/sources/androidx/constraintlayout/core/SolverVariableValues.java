package androidx.constraintlayout.core;

import androidx.constraintlayout.core.ArrayRow;
import cn.hutool.core.text.l;
import java.util.Arrays;

/* loaded from: classes.dex */
public class SolverVariableValues implements ArrayRow.ArrayRowVariables {
    private static final boolean DEBUG = false;
    private static final boolean HASH = true;
    private static float sEpsilon = 0.001f;
    protected final Cache mCache;
    private final ArrayRow mRow;
    private final int mNone = -1;
    private int mSize = 16;
    private int mHashSize = 16;
    int[] mKeys = new int[16];
    int[] mNextKeys = new int[16];
    int[] mVariables = new int[16];
    float[] mValues = new float[16];
    int[] mPrevious = new int[16];
    int[] mNext = new int[16];
    int mCount = 0;
    int mHead = -1;

    SolverVariableValues(ArrayRow arrayRow, Cache cache) {
        this.mRow = arrayRow;
        this.mCache = cache;
        clear();
    }

    private void addToHashMap(SolverVariable solverVariable, int i8) {
        int[] iArr;
        int i9 = solverVariable.id % this.mHashSize;
        int[] iArr2 = this.mKeys;
        int i10 = iArr2[i9];
        if (i10 == -1) {
            iArr2[i9] = i8;
        } else {
            while (true) {
                iArr = this.mNextKeys;
                int i11 = iArr[i10];
                if (i11 == -1) {
                    break;
                } else {
                    i10 = i11;
                }
            }
            iArr[i10] = i8;
        }
        this.mNextKeys[i8] = -1;
    }

    private void addVariable(int i8, SolverVariable solverVariable, float f8) {
        this.mVariables[i8] = solverVariable.id;
        this.mValues[i8] = f8;
        this.mPrevious[i8] = -1;
        this.mNext[i8] = -1;
        solverVariable.addToRow(this.mRow);
        solverVariable.usageInRowCount++;
        this.mCount++;
    }

    private void displayHash() {
        for (int i8 = 0; i8 < this.mHashSize; i8++) {
            if (this.mKeys[i8] != -1) {
                String str = hashCode() + " hash [" + i8 + "] => ";
                int i9 = this.mKeys[i8];
                boolean z7 = false;
                while (!z7) {
                    str = str + l.SPACE + this.mVariables[i9];
                    int i10 = this.mNextKeys[i9];
                    if (i10 != -1) {
                        i9 = i10;
                    } else {
                        z7 = true;
                    }
                }
                System.out.println(str);
            }
        }
    }

    private int findEmptySlot() {
        for (int i8 = 0; i8 < this.mSize; i8++) {
            if (this.mVariables[i8] == -1) {
                return i8;
            }
        }
        return -1;
    }

    private void increaseSize() {
        int i8 = this.mSize * 2;
        this.mVariables = Arrays.copyOf(this.mVariables, i8);
        this.mValues = Arrays.copyOf(this.mValues, i8);
        this.mPrevious = Arrays.copyOf(this.mPrevious, i8);
        this.mNext = Arrays.copyOf(this.mNext, i8);
        this.mNextKeys = Arrays.copyOf(this.mNextKeys, i8);
        for (int i9 = this.mSize; i9 < i8; i9++) {
            this.mVariables[i9] = -1;
            this.mNextKeys[i9] = -1;
        }
        this.mSize = i8;
    }

    private void insertVariable(int i8, SolverVariable solverVariable, float f8) {
        int findEmptySlot = findEmptySlot();
        addVariable(findEmptySlot, solverVariable, f8);
        if (i8 != -1) {
            this.mPrevious[findEmptySlot] = i8;
            int[] iArr = this.mNext;
            iArr[findEmptySlot] = iArr[i8];
            iArr[i8] = findEmptySlot;
        } else {
            this.mPrevious[findEmptySlot] = -1;
            if (this.mCount > 0) {
                this.mNext[findEmptySlot] = this.mHead;
                this.mHead = findEmptySlot;
            } else {
                this.mNext[findEmptySlot] = -1;
            }
        }
        int i9 = this.mNext[findEmptySlot];
        if (i9 != -1) {
            this.mPrevious[i9] = findEmptySlot;
        }
        addToHashMap(solverVariable, findEmptySlot);
    }

    private void removeFromHashMap(SolverVariable solverVariable) {
        int[] iArr;
        int i8;
        int i9 = solverVariable.id;
        int i10 = i9 % this.mHashSize;
        int[] iArr2 = this.mKeys;
        int i11 = iArr2[i10];
        if (i11 == -1) {
            return;
        }
        if (this.mVariables[i11] == i9) {
            int[] iArr3 = this.mNextKeys;
            iArr2[i10] = iArr3[i11];
            iArr3[i11] = -1;
            return;
        }
        while (true) {
            iArr = this.mNextKeys;
            i8 = iArr[i11];
            if (i8 == -1 || this.mVariables[i8] == i9) {
                break;
            } else {
                i11 = i8;
            }
        }
        if (i8 == -1 || this.mVariables[i8] != i9) {
            return;
        }
        iArr[i11] = iArr[i8];
        iArr[i8] = -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void add(SolverVariable solverVariable, float f8, boolean z7) {
        float f9 = sEpsilon;
        if (f8 <= (-f9) || f8 >= f9) {
            int indexOf = indexOf(solverVariable);
            if (indexOf == -1) {
                put(solverVariable, f8);
                return;
            }
            float[] fArr = this.mValues;
            float f10 = fArr[indexOf] + f8;
            fArr[indexOf] = f10;
            float f11 = sEpsilon;
            if (f10 <= (-f11) || f10 >= f11) {
                return;
            }
            fArr[indexOf] = 0.0f;
            remove(solverVariable, z7);
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void clear() {
        int i8 = this.mCount;
        for (int i9 = 0; i9 < i8; i9++) {
            SolverVariable variable = getVariable(i9);
            if (variable != null) {
                variable.removeFromRow(this.mRow);
            }
        }
        for (int i10 = 0; i10 < this.mSize; i10++) {
            this.mVariables[i10] = -1;
            this.mNextKeys[i10] = -1;
        }
        for (int i11 = 0; i11 < this.mHashSize; i11++) {
            this.mKeys[i11] = -1;
        }
        this.mCount = 0;
        this.mHead = -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public boolean contains(SolverVariable solverVariable) {
        return indexOf(solverVariable) != -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void display() {
        int i8 = this.mCount;
        System.out.print("{ ");
        for (int i9 = 0; i9 < i8; i9++) {
            SolverVariable variable = getVariable(i9);
            if (variable != null) {
                System.out.print(variable + " = " + getVariableValue(i9) + l.SPACE);
            }
        }
        System.out.println(" }");
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void divideByAmount(float f8) {
        int i8 = this.mCount;
        int i9 = this.mHead;
        for (int i10 = 0; i10 < i8; i10++) {
            float[] fArr = this.mValues;
            fArr[i9] = fArr[i9] / f8;
            i9 = this.mNext[i9];
            if (i9 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float get(SolverVariable solverVariable) {
        int indexOf = indexOf(solverVariable);
        if (indexOf != -1) {
            return this.mValues[indexOf];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int getCurrentSize() {
        return this.mCount;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public SolverVariable getVariable(int i8) {
        int i9 = this.mCount;
        if (i9 == 0) {
            return null;
        }
        int i10 = this.mHead;
        for (int i11 = 0; i11 < i9; i11++) {
            if (i11 == i8 && i10 != -1) {
                return this.mCache.mIndexedVariables[this.mVariables[i10]];
            }
            i10 = this.mNext[i10];
            if (i10 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float getVariableValue(int i8) {
        int i9 = this.mCount;
        int i10 = this.mHead;
        for (int i11 = 0; i11 < i9; i11++) {
            if (i11 == i8) {
                return this.mValues[i10];
            }
            i10 = this.mNext[i10];
            if (i10 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int indexOf(SolverVariable solverVariable) {
        if (this.mCount != 0 && solverVariable != null) {
            int i8 = solverVariable.id;
            int i9 = this.mKeys[i8 % this.mHashSize];
            if (i9 == -1) {
                return -1;
            }
            if (this.mVariables[i9] == i8) {
                return i9;
            }
            do {
                i9 = this.mNextKeys[i9];
                if (i9 == -1) {
                    break;
                }
            } while (this.mVariables[i9] != i8);
            if (i9 != -1 && this.mVariables[i9] == i8) {
                return i9;
            }
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void invert() {
        int i8 = this.mCount;
        int i9 = this.mHead;
        for (int i10 = 0; i10 < i8; i10++) {
            float[] fArr = this.mValues;
            fArr[i9] = fArr[i9] * (-1.0f);
            i9 = this.mNext[i9];
            if (i9 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void put(SolverVariable solverVariable, float f8) {
        float f9 = sEpsilon;
        if (f8 > (-f9) && f8 < f9) {
            remove(solverVariable, true);
            return;
        }
        if (this.mCount == 0) {
            addVariable(0, solverVariable, f8);
            addToHashMap(solverVariable, 0);
            this.mHead = 0;
            return;
        }
        int indexOf = indexOf(solverVariable);
        if (indexOf != -1) {
            this.mValues[indexOf] = f8;
            return;
        }
        if (this.mCount + 1 >= this.mSize) {
            increaseSize();
        }
        int i8 = this.mCount;
        int i9 = this.mHead;
        int i10 = -1;
        for (int i11 = 0; i11 < i8; i11++) {
            int i12 = this.mVariables[i9];
            int i13 = solverVariable.id;
            if (i12 == i13) {
                this.mValues[i9] = f8;
                return;
            }
            if (i12 < i13) {
                i10 = i9;
            }
            i9 = this.mNext[i9];
            if (i9 == -1) {
                break;
            }
        }
        insertVariable(i10, solverVariable, f8);
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float remove(SolverVariable solverVariable, boolean z7) {
        int indexOf = indexOf(solverVariable);
        if (indexOf == -1) {
            return 0.0f;
        }
        removeFromHashMap(solverVariable);
        float f8 = this.mValues[indexOf];
        if (this.mHead == indexOf) {
            this.mHead = this.mNext[indexOf];
        }
        this.mVariables[indexOf] = -1;
        int[] iArr = this.mPrevious;
        int i8 = iArr[indexOf];
        if (i8 != -1) {
            int[] iArr2 = this.mNext;
            iArr2[i8] = iArr2[indexOf];
        }
        int i9 = this.mNext[indexOf];
        if (i9 != -1) {
            iArr[i9] = iArr[indexOf];
        }
        this.mCount--;
        solverVariable.usageInRowCount--;
        if (z7) {
            solverVariable.removeFromRow(this.mRow);
        }
        return f8;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int sizeInBytes() {
        return 0;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i8 = this.mCount;
        for (int i9 = 0; i9 < i8; i9++) {
            SolverVariable variable = getVariable(i9);
            if (variable != null) {
                String str2 = str + variable + " = " + getVariableValue(i9) + l.SPACE;
                int indexOf = indexOf(variable);
                String str3 = str2 + "[p: ";
                String str4 = (this.mPrevious[indexOf] != -1 ? str3 + this.mCache.mIndexedVariables[this.mVariables[this.mPrevious[indexOf]]] : str3 + "none") + ", n: ";
                str = (this.mNext[indexOf] != -1 ? str4 + this.mCache.mIndexedVariables[this.mVariables[this.mNext[indexOf]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float use(ArrayRow arrayRow, boolean z7) {
        float f8 = get(arrayRow.mVariable);
        remove(arrayRow.mVariable, z7);
        SolverVariableValues solverVariableValues = (SolverVariableValues) arrayRow.variables;
        int currentSize = solverVariableValues.getCurrentSize();
        int i8 = 0;
        int i9 = 0;
        while (i8 < currentSize) {
            int i10 = solverVariableValues.mVariables[i9];
            if (i10 != -1) {
                add(this.mCache.mIndexedVariables[i10], solverVariableValues.mValues[i9] * f8, z7);
                i8++;
            }
            i9++;
        }
        return f8;
    }
}
