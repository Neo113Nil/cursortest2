package androidx.constraintlayout.core;

/* loaded from: classes14.dex */
public class GoalRow extends ArrayRow {
    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public void addError(SolverVariable solverVariable) {
        super.addError(solverVariable);
        solverVariable.usageInRowCount--;
    }
}
