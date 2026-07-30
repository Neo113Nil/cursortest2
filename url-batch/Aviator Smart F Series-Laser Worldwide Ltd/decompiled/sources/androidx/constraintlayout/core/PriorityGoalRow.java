package androidx.constraintlayout.core;

import androidx.constraintlayout.core.ArrayRow;
import cn.hutool.core.text.l;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
public class PriorityGoalRow extends ArrayRow {
    private static final boolean DEBUG = false;
    private static final float EPSILON = 1.0E-4f;
    static final int NOT_FOUND = -1;
    GoalVariableAccessor mAccessor;
    private SolverVariable[] mArrayGoals;
    Cache mCache;
    private int mNumGoals;
    private SolverVariable[] mSortArray;
    private int mTableSize;

    class GoalVariableAccessor {
        PriorityGoalRow mRow;
        SolverVariable mVariable;

        GoalVariableAccessor(PriorityGoalRow priorityGoalRow) {
            this.mRow = priorityGoalRow;
        }

        public void add(SolverVariable solverVariable) {
            for (int i8 = 0; i8 < 9; i8++) {
                float[] fArr = this.mVariable.mGoalStrengthVector;
                float f8 = fArr[i8] + solverVariable.mGoalStrengthVector[i8];
                fArr[i8] = f8;
                if (Math.abs(f8) < 1.0E-4f) {
                    this.mVariable.mGoalStrengthVector[i8] = 0.0f;
                }
            }
        }

        public boolean addToGoal(SolverVariable solverVariable, float f8) {
            boolean z7 = true;
            if (!this.mVariable.inGoal) {
                for (int i8 = 0; i8 < 9; i8++) {
                    float f9 = solverVariable.mGoalStrengthVector[i8];
                    if (f9 != 0.0f) {
                        float f10 = f9 * f8;
                        if (Math.abs(f10) < 1.0E-4f) {
                            f10 = 0.0f;
                        }
                        this.mVariable.mGoalStrengthVector[i8] = f10;
                    } else {
                        this.mVariable.mGoalStrengthVector[i8] = 0.0f;
                    }
                }
                return true;
            }
            for (int i9 = 0; i9 < 9; i9++) {
                float[] fArr = this.mVariable.mGoalStrengthVector;
                float f11 = fArr[i9] + (solverVariable.mGoalStrengthVector[i9] * f8);
                fArr[i9] = f11;
                if (Math.abs(f11) < 1.0E-4f) {
                    this.mVariable.mGoalStrengthVector[i9] = 0.0f;
                } else {
                    z7 = false;
                }
            }
            if (z7) {
                PriorityGoalRow.this.removeGoal(this.mVariable);
            }
            return false;
        }

        public void init(SolverVariable solverVariable) {
            this.mVariable = solverVariable;
        }

        public final boolean isNegative() {
            for (int i8 = 8; i8 >= 0; i8--) {
                float f8 = this.mVariable.mGoalStrengthVector[i8];
                if (f8 > 0.0f) {
                    return false;
                }
                if (f8 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean isNull() {
            for (int i8 = 0; i8 < 9; i8++) {
                if (this.mVariable.mGoalStrengthVector[i8] != 0.0f) {
                    return false;
                }
            }
            return true;
        }

        public final boolean isSmallerThan(SolverVariable solverVariable) {
            for (int i8 = 8; i8 >= 0; i8--) {
                float f8 = solverVariable.mGoalStrengthVector[i8];
                float f9 = this.mVariable.mGoalStrengthVector[i8];
                if (f9 != f8) {
                    return f9 < f8;
                }
            }
            return false;
        }

        public void reset() {
            Arrays.fill(this.mVariable.mGoalStrengthVector, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.mVariable != null) {
                for (int i8 = 0; i8 < 9; i8++) {
                    str = str + this.mVariable.mGoalStrengthVector[i8] + l.SPACE;
                }
            }
            return str + "] " + this.mVariable;
        }
    }

    public PriorityGoalRow(Cache cache) {
        super(cache);
        this.mTableSize = 128;
        this.mArrayGoals = new SolverVariable[128];
        this.mSortArray = new SolverVariable[128];
        this.mNumGoals = 0;
        this.mAccessor = new GoalVariableAccessor(this);
        this.mCache = cache;
    }

    private void addToGoal(SolverVariable solverVariable) {
        int i8;
        int i9 = this.mNumGoals + 1;
        SolverVariable[] solverVariableArr = this.mArrayGoals;
        if (i9 > solverVariableArr.length) {
            SolverVariable[] solverVariableArr2 = (SolverVariable[]) Arrays.copyOf(solverVariableArr, solverVariableArr.length * 2);
            this.mArrayGoals = solverVariableArr2;
            this.mSortArray = (SolverVariable[]) Arrays.copyOf(solverVariableArr2, solverVariableArr2.length * 2);
        }
        SolverVariable[] solverVariableArr3 = this.mArrayGoals;
        int i10 = this.mNumGoals;
        solverVariableArr3[i10] = solverVariable;
        int i11 = i10 + 1;
        this.mNumGoals = i11;
        if (i11 > 1 && solverVariableArr3[i10].id > solverVariable.id) {
            int i12 = 0;
            while (true) {
                i8 = this.mNumGoals;
                if (i12 >= i8) {
                    break;
                }
                this.mSortArray[i12] = this.mArrayGoals[i12];
                i12++;
            }
            Arrays.sort(this.mSortArray, 0, i8, new Comparator<SolverVariable>() { // from class: androidx.constraintlayout.core.PriorityGoalRow.1
                @Override // java.util.Comparator
                public int compare(SolverVariable solverVariable2, SolverVariable solverVariable3) {
                    return solverVariable2.id - solverVariable3.id;
                }
            });
            for (int i13 = 0; i13 < this.mNumGoals; i13++) {
                this.mArrayGoals[i13] = this.mSortArray[i13];
            }
        }
        solverVariable.inGoal = true;
        solverVariable.addToRow(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeGoal(SolverVariable solverVariable) {
        int i8 = 0;
        while (i8 < this.mNumGoals) {
            if (this.mArrayGoals[i8] == solverVariable) {
                while (true) {
                    int i9 = this.mNumGoals;
                    if (i8 >= i9 - 1) {
                        this.mNumGoals = i9 - 1;
                        solverVariable.inGoal = false;
                        return;
                    } else {
                        SolverVariable[] solverVariableArr = this.mArrayGoals;
                        int i10 = i8 + 1;
                        solverVariableArr[i8] = solverVariableArr[i10];
                        i8 = i10;
                    }
                }
            } else {
                i8++;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public void addError(SolverVariable solverVariable) {
        this.mAccessor.init(solverVariable);
        this.mAccessor.reset();
        solverVariable.mGoalStrengthVector[solverVariable.strength] = 1.0f;
        addToGoal(solverVariable);
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public void clear() {
        this.mNumGoals = 0;
        this.mConstantValue = 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public SolverVariable getPivotCandidate(LinearSystem linearSystem, boolean[] zArr) {
        int i8 = -1;
        for (int i9 = 0; i9 < this.mNumGoals; i9++) {
            SolverVariable solverVariable = this.mArrayGoals[i9];
            if (!zArr[solverVariable.id]) {
                this.mAccessor.init(solverVariable);
                if (i8 == -1) {
                    if (!this.mAccessor.isNegative()) {
                    }
                    i8 = i9;
                } else {
                    if (!this.mAccessor.isSmallerThan(this.mArrayGoals[i8])) {
                    }
                    i8 = i9;
                }
            }
        }
        if (i8 == -1) {
            return null;
        }
        return this.mArrayGoals[i8];
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public boolean isEmpty() {
        return this.mNumGoals == 0;
    }

    @Override // androidx.constraintlayout.core.ArrayRow
    public String toString() {
        String str = " goal -> (" + this.mConstantValue + ") : ";
        for (int i8 = 0; i8 < this.mNumGoals; i8++) {
            this.mAccessor.init(this.mArrayGoals[i8]);
            str = str + this.mAccessor + l.SPACE;
        }
        return str;
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public void updateFromRow(LinearSystem linearSystem, ArrayRow arrayRow, boolean z7) {
        SolverVariable solverVariable = arrayRow.mVariable;
        if (solverVariable == null) {
            return;
        }
        ArrayRow.ArrayRowVariables arrayRowVariables = arrayRow.variables;
        int currentSize = arrayRowVariables.getCurrentSize();
        for (int i8 = 0; i8 < currentSize; i8++) {
            SolverVariable variable = arrayRowVariables.getVariable(i8);
            float variableValue = arrayRowVariables.getVariableValue(i8);
            this.mAccessor.init(variable);
            if (this.mAccessor.addToGoal(solverVariable, variableValue)) {
                addToGoal(variable);
            }
            this.mConstantValue += arrayRow.mConstantValue * variableValue;
        }
        removeGoal(solverVariable);
    }
}
