package androidx.constraintlayout.core;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import cn.hutool.core.text.l;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ArrayRow implements LinearSystem.Row {
    private static final boolean DEBUG = false;
    private static final boolean FULL_NEW_CHECK = false;
    public ArrayRowVariables variables;
    SolverVariable mVariable = null;
    float mConstantValue = 0.0f;
    boolean mUsed = false;
    ArrayList<SolverVariable> mVariablesToUpdate = new ArrayList<>();
    boolean mIsSimpleDefinition = false;

    public interface ArrayRowVariables {
        void add(SolverVariable solverVariable, float f8, boolean z7);

        void clear();

        boolean contains(SolverVariable solverVariable);

        void display();

        void divideByAmount(float f8);

        float get(SolverVariable solverVariable);

        int getCurrentSize();

        SolverVariable getVariable(int i8);

        float getVariableValue(int i8);

        int indexOf(SolverVariable solverVariable);

        void invert();

        void put(SolverVariable solverVariable, float f8);

        float remove(SolverVariable solverVariable, boolean z7);

        int sizeInBytes();

        float use(ArrayRow arrayRow, boolean z7);
    }

    public ArrayRow() {
    }

    private boolean isNew(SolverVariable solverVariable, LinearSystem linearSystem) {
        return solverVariable.usageInRowCount <= 1;
    }

    private SolverVariable pickPivotInVariables(boolean[] zArr, SolverVariable solverVariable) {
        SolverVariable.Type type;
        int currentSize = this.variables.getCurrentSize();
        SolverVariable solverVariable2 = null;
        float f8 = 0.0f;
        for (int i8 = 0; i8 < currentSize; i8++) {
            float variableValue = this.variables.getVariableValue(i8);
            if (variableValue < 0.0f) {
                SolverVariable variable = this.variables.getVariable(i8);
                if ((zArr == null || !zArr[variable.id]) && variable != solverVariable && (((type = variable.mType) == SolverVariable.Type.SLACK || type == SolverVariable.Type.ERROR) && variableValue < f8)) {
                    f8 = variableValue;
                    solverVariable2 = variable;
                }
            }
        }
        return solverVariable2;
    }

    public ArrayRow addError(LinearSystem linearSystem, int i8) {
        this.variables.put(linearSystem.createErrorVariable(i8, "ep"), 1.0f);
        this.variables.put(linearSystem.createErrorVariable(i8, "em"), -1.0f);
        return this;
    }

    ArrayRow addSingleError(SolverVariable solverVariable, int i8) {
        this.variables.put(solverVariable, i8);
        return this;
    }

    boolean chooseSubject(LinearSystem linearSystem) {
        boolean z7;
        SolverVariable chooseSubjectInVariables = chooseSubjectInVariables(linearSystem);
        if (chooseSubjectInVariables == null) {
            z7 = true;
        } else {
            pivot(chooseSubjectInVariables);
            z7 = false;
        }
        if (this.variables.getCurrentSize() == 0) {
            this.mIsSimpleDefinition = true;
        }
        return z7;
    }

    SolverVariable chooseSubjectInVariables(LinearSystem linearSystem) {
        boolean isNew;
        boolean isNew2;
        int currentSize = this.variables.getCurrentSize();
        SolverVariable solverVariable = null;
        SolverVariable solverVariable2 = null;
        boolean z7 = false;
        boolean z8 = false;
        float f8 = 0.0f;
        float f9 = 0.0f;
        for (int i8 = 0; i8 < currentSize; i8++) {
            float variableValue = this.variables.getVariableValue(i8);
            SolverVariable variable = this.variables.getVariable(i8);
            if (variable.mType == SolverVariable.Type.UNRESTRICTED) {
                if (solverVariable == null) {
                    isNew2 = isNew(variable, linearSystem);
                } else if (f8 > variableValue) {
                    isNew2 = isNew(variable, linearSystem);
                } else if (!z7 && isNew(variable, linearSystem)) {
                    f8 = variableValue;
                    solverVariable = variable;
                    z7 = true;
                }
                z7 = isNew2;
                f8 = variableValue;
                solverVariable = variable;
            } else if (solverVariable == null && variableValue < 0.0f) {
                if (solverVariable2 == null) {
                    isNew = isNew(variable, linearSystem);
                } else if (f9 > variableValue) {
                    isNew = isNew(variable, linearSystem);
                } else if (!z8 && isNew(variable, linearSystem)) {
                    f9 = variableValue;
                    solverVariable2 = variable;
                    z8 = true;
                }
                z8 = isNew;
                f9 = variableValue;
                solverVariable2 = variable;
            }
        }
        return solverVariable != null ? solverVariable : solverVariable2;
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void clear() {
        this.variables.clear();
        this.mVariable = null;
        this.mConstantValue = 0.0f;
    }

    ArrayRow createRowCentering(SolverVariable solverVariable, SolverVariable solverVariable2, int i8, float f8, SolverVariable solverVariable3, SolverVariable solverVariable4, int i9) {
        if (solverVariable2 == solverVariable3) {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable4, 1.0f);
            this.variables.put(solverVariable2, -2.0f);
            return this;
        }
        if (f8 == 0.5f) {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable3, -1.0f);
            this.variables.put(solverVariable4, 1.0f);
            if (i8 > 0 || i9 > 0) {
                this.mConstantValue = (-i8) + i9;
            }
        } else if (f8 <= 0.0f) {
            this.variables.put(solverVariable, -1.0f);
            this.variables.put(solverVariable2, 1.0f);
            this.mConstantValue = i8;
        } else if (f8 >= 1.0f) {
            this.variables.put(solverVariable4, -1.0f);
            this.variables.put(solverVariable3, 1.0f);
            this.mConstantValue = -i9;
        } else {
            float f9 = 1.0f - f8;
            this.variables.put(solverVariable, f9 * 1.0f);
            this.variables.put(solverVariable2, f9 * (-1.0f));
            this.variables.put(solverVariable3, (-1.0f) * f8);
            this.variables.put(solverVariable4, 1.0f * f8);
            if (i8 > 0 || i9 > 0) {
                this.mConstantValue = ((-i8) * f9) + (i9 * f8);
            }
        }
        return this;
    }

    ArrayRow createRowDefinition(SolverVariable solverVariable, int i8) {
        this.mVariable = solverVariable;
        float f8 = i8;
        solverVariable.computedValue = f8;
        this.mConstantValue = f8;
        this.mIsSimpleDefinition = true;
        return this;
    }

    ArrayRow createRowDimensionPercent(SolverVariable solverVariable, SolverVariable solverVariable2, float f8) {
        this.variables.put(solverVariable, -1.0f);
        this.variables.put(solverVariable2, f8);
        return this;
    }

    public ArrayRow createRowDimensionRatio(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f8) {
        this.variables.put(solverVariable, -1.0f);
        this.variables.put(solverVariable2, 1.0f);
        this.variables.put(solverVariable3, f8);
        this.variables.put(solverVariable4, -f8);
        return this;
    }

    public ArrayRow createRowEqualDimension(float f8, float f9, float f10, SolverVariable solverVariable, int i8, SolverVariable solverVariable2, int i9, SolverVariable solverVariable3, int i10, SolverVariable solverVariable4, int i11) {
        if (f9 == 0.0f || f8 == f10) {
            this.mConstantValue = ((-i8) - i9) + i10 + i11;
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable4, 1.0f);
            this.variables.put(solverVariable3, -1.0f);
        } else {
            float f11 = (f8 / f9) / (f10 / f9);
            this.mConstantValue = ((-i8) - i9) + (i10 * f11) + (i11 * f11);
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable4, f11);
            this.variables.put(solverVariable3, -f11);
        }
        return this;
    }

    public ArrayRow createRowEqualMatchDimensions(float f8, float f9, float f10, SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4) {
        this.mConstantValue = 0.0f;
        if (f9 == 0.0f || f8 == f10) {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable4, 1.0f);
            this.variables.put(solverVariable3, -1.0f);
        } else if (f8 == 0.0f) {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
        } else if (f10 == 0.0f) {
            this.variables.put(solverVariable3, 1.0f);
            this.variables.put(solverVariable4, -1.0f);
        } else {
            float f11 = (f8 / f9) / (f10 / f9);
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable4, f11);
            this.variables.put(solverVariable3, -f11);
        }
        return this;
    }

    public ArrayRow createRowEquals(SolverVariable solverVariable, int i8) {
        if (i8 < 0) {
            this.mConstantValue = i8 * (-1);
            this.variables.put(solverVariable, 1.0f);
        } else {
            this.mConstantValue = i8;
            this.variables.put(solverVariable, -1.0f);
        }
        return this;
    }

    public ArrayRow createRowGreaterThan(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i8) {
        boolean z7;
        if (i8 != 0) {
            if (i8 < 0) {
                i8 *= -1;
                z7 = true;
            } else {
                z7 = false;
            }
            this.mConstantValue = i8;
            if (z7) {
                this.variables.put(solverVariable, 1.0f);
                this.variables.put(solverVariable2, -1.0f);
                this.variables.put(solverVariable3, -1.0f);
                return this;
            }
        }
        this.variables.put(solverVariable, -1.0f);
        this.variables.put(solverVariable2, 1.0f);
        this.variables.put(solverVariable3, 1.0f);
        return this;
    }

    public ArrayRow createRowLowerThan(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i8) {
        boolean z7;
        if (i8 != 0) {
            if (i8 < 0) {
                i8 *= -1;
                z7 = true;
            } else {
                z7 = false;
            }
            this.mConstantValue = i8;
            if (z7) {
                this.variables.put(solverVariable, 1.0f);
                this.variables.put(solverVariable2, -1.0f);
                this.variables.put(solverVariable3, 1.0f);
                return this;
            }
        }
        this.variables.put(solverVariable, -1.0f);
        this.variables.put(solverVariable2, 1.0f);
        this.variables.put(solverVariable3, -1.0f);
        return this;
    }

    public ArrayRow createRowWithAngle(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f8) {
        this.variables.put(solverVariable3, 0.5f);
        this.variables.put(solverVariable4, 0.5f);
        this.variables.put(solverVariable, -0.5f);
        this.variables.put(solverVariable2, -0.5f);
        this.mConstantValue = -f8;
        return this;
    }

    void ensurePositiveConstant() {
        float f8 = this.mConstantValue;
        if (f8 < 0.0f) {
            this.mConstantValue = f8 * (-1.0f);
            this.variables.invert();
        }
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public SolverVariable getKey() {
        return this.mVariable;
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public SolverVariable getPivotCandidate(LinearSystem linearSystem, boolean[] zArr) {
        return pickPivotInVariables(zArr, null);
    }

    boolean hasKeyVariable() {
        SolverVariable solverVariable = this.mVariable;
        return solverVariable != null && (solverVariable.mType == SolverVariable.Type.UNRESTRICTED || this.mConstantValue >= 0.0f);
    }

    boolean hasVariable(SolverVariable solverVariable) {
        return this.variables.contains(solverVariable);
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void initFromRow(LinearSystem.Row row) {
        if (row instanceof ArrayRow) {
            ArrayRow arrayRow = (ArrayRow) row;
            this.mVariable = null;
            this.variables.clear();
            for (int i8 = 0; i8 < arrayRow.variables.getCurrentSize(); i8++) {
                this.variables.add(arrayRow.variables.getVariable(i8), arrayRow.variables.getVariableValue(i8), true);
            }
        }
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public boolean isEmpty() {
        return this.mVariable == null && this.mConstantValue == 0.0f && this.variables.getCurrentSize() == 0;
    }

    public SolverVariable pickPivot(SolverVariable solverVariable) {
        return pickPivotInVariables(null, solverVariable);
    }

    void pivot(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.mVariable;
        if (solverVariable2 != null) {
            this.variables.put(solverVariable2, -1.0f);
            this.mVariable.mDefinitionId = -1;
            this.mVariable = null;
        }
        float remove = this.variables.remove(solverVariable, true) * (-1.0f);
        this.mVariable = solverVariable;
        if (remove == 1.0f) {
            return;
        }
        this.mConstantValue /= remove;
        this.variables.divideByAmount(remove);
    }

    public void reset() {
        this.mVariable = null;
        this.variables.clear();
        this.mConstantValue = 0.0f;
        this.mIsSimpleDefinition = false;
    }

    int sizeInBytes() {
        return (this.mVariable != null ? 4 : 0) + 8 + this.variables.sizeInBytes();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    String toReadableString() {
        boolean z7;
        String str = (this.mVariable == null ? "0" : "" + this.mVariable) + " = ";
        if (this.mConstantValue != 0.0f) {
            str = str + this.mConstantValue;
            z7 = true;
        } else {
            z7 = false;
        }
        int currentSize = this.variables.getCurrentSize();
        for (int i8 = 0; i8 < currentSize; i8++) {
            SolverVariable variable = this.variables.getVariable(i8);
            if (variable != null) {
                float variableValue = this.variables.getVariableValue(i8);
                if (variableValue != 0.0f) {
                    String solverVariable = variable.toString();
                    if (!z7) {
                        if (variableValue < 0.0f) {
                            str = str + "- ";
                            variableValue *= -1.0f;
                        }
                        str = variableValue == 1.0f ? str + solverVariable : str + variableValue + l.SPACE + solverVariable;
                        z7 = true;
                    } else if (variableValue > 0.0f) {
                        str = str + " + ";
                        if (variableValue == 1.0f) {
                        }
                        z7 = true;
                    } else {
                        str = str + " - ";
                        variableValue *= -1.0f;
                        if (variableValue == 1.0f) {
                        }
                        z7 = true;
                    }
                }
            }
        }
        if (z7) {
            return str;
        }
        return str + "0.0";
    }

    public String toString() {
        return toReadableString();
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void updateFromFinalVariable(LinearSystem linearSystem, SolverVariable solverVariable, boolean z7) {
        if (solverVariable == null || !solverVariable.isFinalValue) {
            return;
        }
        this.mConstantValue += solverVariable.computedValue * this.variables.get(solverVariable);
        this.variables.remove(solverVariable, z7);
        if (z7) {
            solverVariable.removeFromRow(this);
        }
        if (LinearSystem.SIMPLIFY_SYNONYMS && this.variables.getCurrentSize() == 0) {
            this.mIsSimpleDefinition = true;
            linearSystem.hasSimpleDefinition = true;
        }
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void updateFromRow(LinearSystem linearSystem, ArrayRow arrayRow, boolean z7) {
        this.mConstantValue += arrayRow.mConstantValue * this.variables.use(arrayRow, z7);
        if (z7) {
            arrayRow.mVariable.removeFromRow(this);
        }
        if (LinearSystem.SIMPLIFY_SYNONYMS && this.mVariable != null && this.variables.getCurrentSize() == 0) {
            this.mIsSimpleDefinition = true;
            linearSystem.hasSimpleDefinition = true;
        }
    }

    public void updateFromSynonymVariable(LinearSystem linearSystem, SolverVariable solverVariable, boolean z7) {
        if (solverVariable == null || !solverVariable.mIsSynonym) {
            return;
        }
        float f8 = this.variables.get(solverVariable);
        this.mConstantValue += solverVariable.mSynonymDelta * f8;
        this.variables.remove(solverVariable, z7);
        if (z7) {
            solverVariable.removeFromRow(this);
        }
        this.variables.add(linearSystem.mCache.mIndexedVariables[solverVariable.mSynonym], f8, z7);
        if (LinearSystem.SIMPLIFY_SYNONYMS && this.variables.getCurrentSize() == 0) {
            this.mIsSimpleDefinition = true;
            linearSystem.hasSimpleDefinition = true;
        }
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void updateFromSystem(LinearSystem linearSystem) {
        if (linearSystem.mRows.length == 0) {
            return;
        }
        boolean z7 = false;
        while (!z7) {
            int currentSize = this.variables.getCurrentSize();
            for (int i8 = 0; i8 < currentSize; i8++) {
                SolverVariable variable = this.variables.getVariable(i8);
                if (variable.mDefinitionId != -1 || variable.isFinalValue || variable.mIsSynonym) {
                    this.mVariablesToUpdate.add(variable);
                }
            }
            int size = this.mVariablesToUpdate.size();
            if (size > 0) {
                for (int i9 = 0; i9 < size; i9++) {
                    SolverVariable solverVariable = this.mVariablesToUpdate.get(i9);
                    if (solverVariable.isFinalValue) {
                        updateFromFinalVariable(linearSystem, solverVariable, true);
                    } else if (solverVariable.mIsSynonym) {
                        updateFromSynonymVariable(linearSystem, solverVariable, true);
                    } else {
                        updateFromRow(linearSystem, linearSystem.mRows[solverVariable.mDefinitionId], true);
                    }
                }
                this.mVariablesToUpdate.clear();
            } else {
                z7 = true;
            }
        }
        if (LinearSystem.SIMPLIFY_SYNONYMS && this.mVariable != null && this.variables.getCurrentSize() == 0) {
            this.mIsSimpleDefinition = true;
            linearSystem.hasSimpleDefinition = true;
        }
    }

    public ArrayRow(Cache cache) {
        this.variables = new ArrayLinkedVariables(this, cache);
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void addError(SolverVariable solverVariable) {
        int i8 = solverVariable.strength;
        float f8 = 1.0f;
        if (i8 != 1) {
            if (i8 == 2) {
                f8 = 1000.0f;
            } else if (i8 == 3) {
                f8 = 1000000.0f;
            } else if (i8 == 4) {
                f8 = 1.0E9f;
            } else if (i8 == 5) {
                f8 = 1.0E12f;
            }
        }
        this.variables.put(solverVariable, f8);
    }

    public ArrayRow createRowEquals(SolverVariable solverVariable, SolverVariable solverVariable2, int i8) {
        boolean z7;
        if (i8 != 0) {
            if (i8 < 0) {
                i8 *= -1;
                z7 = true;
            } else {
                z7 = false;
            }
            this.mConstantValue = i8;
            if (z7) {
                this.variables.put(solverVariable, 1.0f);
                this.variables.put(solverVariable2, -1.0f);
                return this;
            }
        }
        this.variables.put(solverVariable, -1.0f);
        this.variables.put(solverVariable2, 1.0f);
        return this;
    }

    public ArrayRow createRowGreaterThan(SolverVariable solverVariable, int i8, SolverVariable solverVariable2) {
        this.mConstantValue = i8;
        this.variables.put(solverVariable, -1.0f);
        return this;
    }
}
