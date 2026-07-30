package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.ArrayRow;
import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.ArrayList;

/* loaded from: classes.dex */
class Chain {
    private static final boolean DEBUG = false;

    Chain() {
    }

    static void applyChainConstraints(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, int i) {
        int i2;
        ChainHead[] chainHeadArr;
        int i3;
        if (i == 0) {
            i2 = constraintWidgetContainer.mHorizontalChainsSize;
            chainHeadArr = constraintWidgetContainer.mHorizontalChainsArray;
            i3 = 0;
        } else {
            i2 = constraintWidgetContainer.mVerticalChainsSize;
            chainHeadArr = constraintWidgetContainer.mVerticalChainsArray;
            i3 = 2;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            ChainHead chainHead = chainHeadArr[i4];
            chainHead.define();
            applyChainConstraints(constraintWidgetContainer, linearSystem, i, i3, chainHead);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (r2.mHorizontalChainStyle == 2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x004a, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0048, code lost:
    
        if (r2.mVerticalChainStyle == 2) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e4  */
    /* JADX WARN: Type inference failed for: r2v63, types: [androidx.constraintlayout.solver.widgets.ConstraintWidget] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [androidx.constraintlayout.solver.widgets.ConstraintWidget] */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void applyChainConstraints(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, int i, int i2, ChainHead chainHead) {
        boolean z;
        boolean z2;
        boolean z3;
        ArrayList<ConstraintWidget> arrayList;
        ConstraintWidget constraintWidget;
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintWidget constraintWidget2;
        int i3;
        ConstraintAnchor constraintAnchor4;
        SolverVariable solverVariable;
        SolverVariable solverVariable2;
        ConstraintWidget constraintWidget3;
        ConstraintAnchor constraintAnchor5;
        SolverVariable solverVariable3;
        SolverVariable solverVariable4;
        ConstraintWidget constraintWidget4;
        SolverVariable solverVariable5;
        SolverVariable solverVariable6;
        float f;
        int size;
        int i4;
        ArrayList<ConstraintWidget> arrayList2;
        int i5;
        boolean z4;
        ConstraintWidget constraintWidget5;
        boolean z5;
        int i6;
        ConstraintWidget constraintWidget6 = chainHead.mFirst;
        ConstraintWidget constraintWidget7 = chainHead.mLast;
        ConstraintWidget constraintWidget8 = chainHead.mFirstVisibleWidget;
        ConstraintWidget constraintWidget9 = chainHead.mLastVisibleWidget;
        ConstraintWidget constraintWidget10 = chainHead.mHead;
        float f2 = chainHead.mTotalWeight;
        ConstraintWidget constraintWidget11 = chainHead.mFirstMatchConstraintWidget;
        ConstraintWidget constraintWidget12 = chainHead.mLastMatchConstraintWidget;
        boolean z6 = constraintWidgetContainer.mListDimensionBehaviors[i] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (i == 0) {
            z = constraintWidget10.mHorizontalChainStyle == 0;
            z2 = constraintWidget10.mHorizontalChainStyle == 1;
        } else {
            z = constraintWidget10.mVerticalChainStyle == 0;
            z2 = constraintWidget10.mVerticalChainStyle == 1;
        }
        ?? r6 = constraintWidget6;
        boolean z7 = z2;
        boolean z8 = z;
        boolean z9 = false;
        while (true) {
            if (z9) {
                break;
            }
            ConstraintAnchor constraintAnchor6 = r6.mListAnchors[i2];
            int i7 = z3 ? 1 : 4;
            int margin = constraintAnchor6.getMargin();
            float f3 = f2;
            boolean z10 = z9;
            boolean z11 = r6.mListDimensionBehaviors[i] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && r6.mResolvedMatchConstraintDefault[i] == 0;
            if (constraintAnchor6.mTarget != null && r6 != constraintWidget6) {
                margin += constraintAnchor6.mTarget.getMargin();
            }
            int i8 = margin;
            if (!z3 || r6 == constraintWidget6 || r6 == constraintWidget8) {
                z4 = z7;
            } else {
                z4 = z7;
                i7 = 5;
            }
            if (constraintAnchor6.mTarget != null) {
                if (r6 == constraintWidget8) {
                    z5 = z8;
                    constraintWidget5 = constraintWidget10;
                    linearSystem.addGreaterThan(constraintAnchor6.mSolverVariable, constraintAnchor6.mTarget.mSolverVariable, i8, 6);
                } else {
                    constraintWidget5 = constraintWidget10;
                    z5 = z8;
                    linearSystem.addGreaterThan(constraintAnchor6.mSolverVariable, constraintAnchor6.mTarget.mSolverVariable, i8, 8);
                }
                linearSystem.addEquality(constraintAnchor6.mSolverVariable, constraintAnchor6.mTarget.mSolverVariable, i8, (!z11 || z3) ? i7 : 5);
            } else {
                constraintWidget5 = constraintWidget10;
                z5 = z8;
            }
            if (z6) {
                if (r6.getVisibility() == 8 || r6.mListDimensionBehaviors[i] != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i6 = 0;
                } else {
                    i6 = 0;
                    linearSystem.addGreaterThan(r6.mListAnchors[i2 + 1].mSolverVariable, r6.mListAnchors[i2].mSolverVariable, 0, 5);
                }
                linearSystem.addGreaterThan(r6.mListAnchors[i2].mSolverVariable, constraintWidgetContainer.mListAnchors[i2].mSolverVariable, i6, 8);
            }
            ConstraintAnchor constraintAnchor7 = r6.mListAnchors[i2 + 1].mTarget;
            if (constraintAnchor7 != null) {
                ?? r2 = constraintAnchor7.mOwner;
                if (r2.mListAnchors[i2].mTarget != null && r2.mListAnchors[i2].mTarget.mOwner == r6) {
                    r21 = r2;
                }
            }
            if (r21 != null) {
                r6 = r21;
                z9 = z10;
            } else {
                z9 = true;
            }
            z7 = z4;
            f2 = f3;
            z8 = z5;
            constraintWidget10 = constraintWidget5;
            r6 = r6;
        }
        ConstraintWidget constraintWidget13 = constraintWidget10;
        float f4 = f2;
        boolean z12 = z8;
        boolean z13 = z7;
        if (constraintWidget9 != null) {
            int i9 = i2 + 1;
            if (constraintWidget7.mListAnchors[i9].mTarget != null) {
                ConstraintAnchor constraintAnchor8 = constraintWidget9.mListAnchors[i9];
                if (constraintWidget9.mListDimensionBehaviors[i] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget9.mResolvedMatchConstraintDefault[i] == 0 && !z3 && constraintAnchor8.mTarget.mOwner == constraintWidgetContainer) {
                    linearSystem.addEquality(constraintAnchor8.mSolverVariable, constraintAnchor8.mTarget.mSolverVariable, -constraintAnchor8.getMargin(), 5);
                } else if (z3 && constraintAnchor8.mTarget.mOwner == constraintWidgetContainer) {
                    linearSystem.addEquality(constraintAnchor8.mSolverVariable, constraintAnchor8.mTarget.mSolverVariable, -constraintAnchor8.getMargin(), 4);
                }
                linearSystem.addLowerThan(constraintAnchor8.mSolverVariable, constraintWidget7.mListAnchors[i9].mTarget.mSolverVariable, -constraintAnchor8.getMargin(), 6);
                if (z6) {
                    int i10 = i2 + 1;
                    linearSystem.addGreaterThan(constraintWidgetContainer.mListAnchors[i10].mSolverVariable, constraintWidget7.mListAnchors[i10].mSolverVariable, constraintWidget7.mListAnchors[i10].getMargin(), 8);
                }
                arrayList = chainHead.mWeightedMatchConstraintsWidgets;
                if (arrayList != null && (size = arrayList.size()) > 1) {
                    float f5 = (chainHead.mHasUndefinedWeights || chainHead.mHasComplexMatchWeights) ? f4 : chainHead.mWidgetsMatchCount;
                    float f6 = 0.0f;
                    float f7 = 0.0f;
                    ConstraintWidget constraintWidget14 = null;
                    i4 = 0;
                    while (i4 < size) {
                        ConstraintWidget constraintWidget15 = arrayList.get(i4);
                        float f8 = constraintWidget15.mWeight[i];
                        if (f8 < f6) {
                            if (chainHead.mHasComplexMatchWeights) {
                                linearSystem.addEquality(constraintWidget15.mListAnchors[i2 + 1].mSolverVariable, constraintWidget15.mListAnchors[i2].mSolverVariable, 0, 4);
                                arrayList2 = arrayList;
                                i5 = size;
                                i4++;
                                size = i5;
                                arrayList = arrayList2;
                                f6 = 0.0f;
                            } else {
                                f8 = 1.0f;
                                f6 = 0.0f;
                            }
                        }
                        if (f8 == f6) {
                            linearSystem.addEquality(constraintWidget15.mListAnchors[i2 + 1].mSolverVariable, constraintWidget15.mListAnchors[i2].mSolverVariable, 0, 8);
                            arrayList2 = arrayList;
                            i5 = size;
                            i4++;
                            size = i5;
                            arrayList = arrayList2;
                            f6 = 0.0f;
                        } else {
                            if (constraintWidget14 != null) {
                                SolverVariable solverVariable7 = constraintWidget14.mListAnchors[i2].mSolverVariable;
                                int i11 = i2 + 1;
                                SolverVariable solverVariable8 = constraintWidget14.mListAnchors[i11].mSolverVariable;
                                SolverVariable solverVariable9 = constraintWidget15.mListAnchors[i2].mSolverVariable;
                                arrayList2 = arrayList;
                                SolverVariable solverVariable10 = constraintWidget15.mListAnchors[i11].mSolverVariable;
                                i5 = size;
                                ArrayRow createRow = linearSystem.createRow();
                                createRow.createRowEqualMatchDimensions(f7, f5, f8, solverVariable7, solverVariable8, solverVariable9, solverVariable10);
                                linearSystem.addConstraint(createRow);
                            } else {
                                arrayList2 = arrayList;
                                i5 = size;
                            }
                            f7 = f8;
                            constraintWidget14 = constraintWidget15;
                            i4++;
                            size = i5;
                            arrayList = arrayList2;
                            f6 = 0.0f;
                        }
                    }
                }
                if (constraintWidget8 == null && (constraintWidget8 == constraintWidget9 || z3)) {
                    ConstraintAnchor constraintAnchor9 = constraintWidget6.mListAnchors[i2];
                    int i12 = i2 + 1;
                    ConstraintAnchor constraintAnchor10 = constraintWidget7.mListAnchors[i12];
                    SolverVariable solverVariable11 = constraintAnchor9.mTarget != null ? constraintAnchor9.mTarget.mSolverVariable : null;
                    SolverVariable solverVariable12 = constraintAnchor10.mTarget != null ? constraintAnchor10.mTarget.mSolverVariable : null;
                    ConstraintAnchor constraintAnchor11 = constraintWidget8.mListAnchors[i2];
                    ConstraintAnchor constraintAnchor12 = constraintWidget9.mListAnchors[i12];
                    if (solverVariable11 != null && solverVariable12 != null) {
                        if (i == 0) {
                            f = constraintWidget13.mHorizontalBiasPercent;
                        } else {
                            f = constraintWidget13.mVerticalBiasPercent;
                        }
                        linearSystem.addCentering(constraintAnchor11.mSolverVariable, solverVariable11, constraintAnchor11.getMargin(), f, solverVariable12, constraintAnchor12.mSolverVariable, constraintAnchor12.getMargin(), 7);
                    }
                } else if (z12 || constraintWidget8 == null) {
                    int i13 = 8;
                    if (z13 && constraintWidget8 != null) {
                        boolean z14 = chainHead.mWidgetsMatchCount <= 0 && chainHead.mWidgetsCount == chainHead.mWidgetsMatchCount;
                        constraintWidget = constraintWidget8;
                        ConstraintWidget constraintWidget16 = constraintWidget;
                        while (constraintWidget != null) {
                            ConstraintWidget constraintWidget17 = constraintWidget.mNextChainWidget[i];
                            while (constraintWidget17 != null && constraintWidget17.getVisibility() == i13) {
                                constraintWidget17 = constraintWidget17.mNextChainWidget[i];
                            }
                            if (constraintWidget == constraintWidget8 || constraintWidget == constraintWidget9 || constraintWidget17 == null) {
                                constraintWidget2 = constraintWidget16;
                                i3 = i13;
                            } else {
                                ConstraintWidget constraintWidget18 = constraintWidget17 == constraintWidget9 ? null : constraintWidget17;
                                ConstraintAnchor constraintAnchor13 = constraintWidget.mListAnchors[i2];
                                SolverVariable solverVariable13 = constraintAnchor13.mSolverVariable;
                                if (constraintAnchor13.mTarget != null) {
                                    SolverVariable solverVariable14 = constraintAnchor13.mTarget.mSolverVariable;
                                }
                                int i14 = i2 + 1;
                                SolverVariable solverVariable15 = constraintWidget16.mListAnchors[i14].mSolverVariable;
                                int margin2 = constraintAnchor13.getMargin();
                                int margin3 = constraintWidget.mListAnchors[i14].getMargin();
                                if (constraintWidget18 != null) {
                                    constraintAnchor4 = constraintWidget18.mListAnchors[i2];
                                    solverVariable = constraintAnchor4.mSolverVariable;
                                    solverVariable2 = constraintAnchor4.mTarget != null ? constraintAnchor4.mTarget.mSolverVariable : null;
                                } else {
                                    constraintAnchor4 = constraintWidget9.mListAnchors[i2];
                                    solverVariable = constraintAnchor4 != null ? constraintAnchor4.mSolverVariable : null;
                                    solverVariable2 = constraintWidget.mListAnchors[i14].mSolverVariable;
                                }
                                if (constraintAnchor4 != null) {
                                    margin3 += constraintAnchor4.getMargin();
                                }
                                int i15 = margin3;
                                if (constraintWidget16 != null) {
                                    margin2 += constraintWidget16.mListAnchors[i14].getMargin();
                                }
                                int i16 = margin2;
                                int i17 = z14 ? 8 : 4;
                                if (solverVariable13 == null || solverVariable15 == null || solverVariable == null || solverVariable2 == null) {
                                    constraintWidget3 = constraintWidget18;
                                    constraintWidget2 = constraintWidget16;
                                    i3 = 8;
                                } else {
                                    constraintWidget3 = constraintWidget18;
                                    constraintWidget2 = constraintWidget16;
                                    i3 = 8;
                                    linearSystem.addCentering(solverVariable13, solverVariable15, i16, 0.5f, solverVariable, solverVariable2, i15, i17);
                                }
                                constraintWidget17 = constraintWidget3;
                            }
                            if (constraintWidget.getVisibility() == i3) {
                                constraintWidget = constraintWidget2;
                            }
                            i13 = i3;
                            constraintWidget16 = constraintWidget;
                            constraintWidget = constraintWidget17;
                        }
                        ConstraintAnchor constraintAnchor14 = constraintWidget8.mListAnchors[i2];
                        constraintAnchor = constraintWidget6.mListAnchors[i2].mTarget;
                        int i18 = i2 + 1;
                        constraintAnchor2 = constraintWidget9.mListAnchors[i18];
                        constraintAnchor3 = constraintWidget7.mListAnchors[i18].mTarget;
                        if (constraintAnchor != null) {
                            if (constraintWidget8 != constraintWidget9) {
                                linearSystem.addEquality(constraintAnchor14.mSolverVariable, constraintAnchor.mSolverVariable, constraintAnchor14.getMargin(), 5);
                            } else if (constraintAnchor3 != null) {
                                linearSystem.addCentering(constraintAnchor14.mSolverVariable, constraintAnchor.mSolverVariable, constraintAnchor14.getMargin(), 0.5f, constraintAnchor2.mSolverVariable, constraintAnchor3.mSolverVariable, constraintAnchor2.getMargin(), 5);
                            }
                        }
                        if (constraintAnchor3 != null && constraintWidget8 != constraintWidget9) {
                            linearSystem.addEquality(constraintAnchor2.mSolverVariable, constraintAnchor3.mSolverVariable, -constraintAnchor2.getMargin(), 5);
                        }
                    }
                } else {
                    boolean z15 = chainHead.mWidgetsMatchCount > 0 && chainHead.mWidgetsCount == chainHead.mWidgetsMatchCount;
                    ConstraintWidget constraintWidget19 = constraintWidget8;
                    ConstraintWidget constraintWidget20 = constraintWidget19;
                    while (constraintWidget19 != null) {
                        ConstraintWidget constraintWidget21 = constraintWidget19.mNextChainWidget[i];
                        while (constraintWidget21 != null && constraintWidget21.getVisibility() == 8) {
                            constraintWidget21 = constraintWidget21.mNextChainWidget[i];
                        }
                        if (constraintWidget21 != null || constraintWidget19 == constraintWidget9) {
                            ConstraintAnchor constraintAnchor15 = constraintWidget19.mListAnchors[i2];
                            SolverVariable solverVariable16 = constraintAnchor15.mSolverVariable;
                            SolverVariable solverVariable17 = constraintAnchor15.mTarget != null ? constraintAnchor15.mTarget.mSolverVariable : null;
                            if (constraintWidget20 != constraintWidget19) {
                                solverVariable17 = constraintWidget20.mListAnchors[i2 + 1].mSolverVariable;
                            } else if (constraintWidget19 == constraintWidget8 && constraintWidget20 == constraintWidget19) {
                                solverVariable17 = constraintWidget6.mListAnchors[i2].mTarget != null ? constraintWidget6.mListAnchors[i2].mTarget.mSolverVariable : null;
                            }
                            int margin4 = constraintAnchor15.getMargin();
                            int i19 = i2 + 1;
                            int margin5 = constraintWidget19.mListAnchors[i19].getMargin();
                            if (constraintWidget21 != null) {
                                constraintAnchor5 = constraintWidget21.mListAnchors[i2];
                                solverVariable3 = constraintAnchor5.mSolverVariable;
                                solverVariable4 = constraintWidget19.mListAnchors[i19].mSolverVariable;
                            } else {
                                constraintAnchor5 = constraintWidget7.mListAnchors[i19].mTarget;
                                solverVariable3 = constraintAnchor5 != null ? constraintAnchor5.mSolverVariable : null;
                                solverVariable4 = constraintWidget19.mListAnchors[i19].mSolverVariable;
                            }
                            if (constraintAnchor5 != null) {
                                margin5 += constraintAnchor5.getMargin();
                            }
                            if (constraintWidget20 != null) {
                                margin4 += constraintWidget20.mListAnchors[i19].getMargin();
                            }
                            if (solverVariable16 != null && solverVariable17 != null && solverVariable3 != null && solverVariable4 != null) {
                                if (constraintWidget19 == constraintWidget8) {
                                    margin4 = constraintWidget8.mListAnchors[i2].getMargin();
                                }
                                int i20 = margin4;
                                constraintWidget4 = constraintWidget21;
                                linearSystem.addCentering(solverVariable16, solverVariable17, i20, 0.5f, solverVariable3, solverVariable4, constraintWidget19 == constraintWidget9 ? constraintWidget9.mListAnchors[i19].getMargin() : margin5, z15 ? 8 : 5);
                                if (constraintWidget19.getVisibility() == 8) {
                                    constraintWidget20 = constraintWidget19;
                                }
                                constraintWidget19 = constraintWidget4;
                            }
                        }
                        constraintWidget4 = constraintWidget21;
                        if (constraintWidget19.getVisibility() == 8) {
                        }
                        constraintWidget19 = constraintWidget4;
                    }
                }
                if ((z12 && !z13) || constraintWidget8 == null || constraintWidget8 == constraintWidget9) {
                    return;
                }
                ConstraintAnchor constraintAnchor16 = constraintWidget8.mListAnchors[i2];
                int i21 = i2 + 1;
                ConstraintAnchor constraintAnchor17 = constraintWidget9.mListAnchors[i21];
                solverVariable5 = constraintAnchor16.mTarget == null ? constraintAnchor16.mTarget.mSolverVariable : null;
                SolverVariable solverVariable18 = constraintAnchor17.mTarget == null ? constraintAnchor17.mTarget.mSolverVariable : null;
                if (constraintWidget7 == constraintWidget9) {
                    ConstraintAnchor constraintAnchor18 = constraintWidget7.mListAnchors[i21];
                    solverVariable6 = constraintAnchor18.mTarget != null ? constraintAnchor18.mTarget.mSolverVariable : null;
                } else {
                    solverVariable6 = solverVariable18;
                }
                if (constraintWidget8 == constraintWidget9) {
                    constraintAnchor16 = constraintWidget8.mListAnchors[i2];
                    constraintAnchor17 = constraintWidget8.mListAnchors[i21];
                }
                if (solverVariable5 != null || solverVariable6 == null) {
                }
                int margin6 = constraintAnchor16.getMargin();
                if (constraintWidget9 != null) {
                    constraintWidget7 = constraintWidget9;
                }
                linearSystem.addCentering(constraintAnchor16.mSolverVariable, solverVariable5, margin6, 0.5f, solverVariable6, constraintAnchor17.mSolverVariable, constraintWidget7.mListAnchors[i21].getMargin(), 5);
                return;
            }
        }
        if (z6) {
        }
        arrayList = chainHead.mWeightedMatchConstraintsWidgets;
        if (arrayList != null) {
            if (chainHead.mHasUndefinedWeights) {
            }
            float f62 = 0.0f;
            float f72 = 0.0f;
            ConstraintWidget constraintWidget142 = null;
            i4 = 0;
            while (i4 < size) {
            }
        }
        if (constraintWidget8 == null) {
        }
        if (z12) {
        }
        int i132 = 8;
        if (z13) {
            if (chainHead.mWidgetsMatchCount <= 0) {
            }
            constraintWidget = constraintWidget8;
            ConstraintWidget constraintWidget162 = constraintWidget;
            while (constraintWidget != null) {
            }
            ConstraintAnchor constraintAnchor142 = constraintWidget8.mListAnchors[i2];
            constraintAnchor = constraintWidget6.mListAnchors[i2].mTarget;
            int i182 = i2 + 1;
            constraintAnchor2 = constraintWidget9.mListAnchors[i182];
            constraintAnchor3 = constraintWidget7.mListAnchors[i182].mTarget;
            if (constraintAnchor != null) {
            }
            if (constraintAnchor3 != null) {
                linearSystem.addEquality(constraintAnchor2.mSolverVariable, constraintAnchor3.mSolverVariable, -constraintAnchor2.getMargin(), 5);
            }
        }
        if (z12) {
        }
        ConstraintAnchor constraintAnchor162 = constraintWidget8.mListAnchors[i2];
        int i212 = i2 + 1;
        ConstraintAnchor constraintAnchor172 = constraintWidget9.mListAnchors[i212];
        if (constraintAnchor162.mTarget == null) {
        }
        if (constraintAnchor172.mTarget == null) {
        }
        if (constraintWidget7 == constraintWidget9) {
        }
        if (constraintWidget8 == constraintWidget9) {
        }
        if (solverVariable5 != null) {
        }
    }
}
