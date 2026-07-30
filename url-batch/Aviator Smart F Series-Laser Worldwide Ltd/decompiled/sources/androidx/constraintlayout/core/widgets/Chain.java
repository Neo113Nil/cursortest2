package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.ArrayRow;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class Chain {
    private static final boolean DEBUG = false;
    public static final boolean USE_CHAIN_OPTIMIZATION = false;

    public static void applyChainConstraints(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, ArrayList<ConstraintWidget> arrayList, int i8) {
        int i9;
        ChainHead[] chainHeadArr;
        int i10;
        if (i8 == 0) {
            i9 = constraintWidgetContainer.mHorizontalChainsSize;
            chainHeadArr = constraintWidgetContainer.mHorizontalChainsArray;
            i10 = 0;
        } else {
            i9 = constraintWidgetContainer.mVerticalChainsSize;
            chainHeadArr = constraintWidgetContainer.mVerticalChainsArray;
            i10 = 2;
        }
        for (int i11 = 0; i11 < i9; i11++) {
            ChainHead chainHead = chainHeadArr[i11];
            chainHead.define();
            if (arrayList == null || arrayList.contains(chainHead.mFirst)) {
                applyChainConstraints(constraintWidgetContainer, linearSystem, i8, i10, chainHead);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        if (r7 == 2) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0035, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x004b, code lost:
    
        if (r7 == 2) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0261 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x051d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b4  */
    /* JADX WARN: Type inference failed for: r1v40, types: [androidx.constraintlayout.core.widgets.ConstraintWidget] */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [androidx.constraintlayout.core.widgets.ConstraintWidget] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void applyChainConstraints(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, int i8, int i9, ChainHead chainHead) {
        boolean z7;
        boolean z8;
        boolean z9;
        ArrayList<ConstraintWidget> arrayList;
        ConstraintWidget constraintWidget;
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintWidget constraintWidget2;
        int i10;
        ConstraintWidget constraintWidget3;
        ConstraintAnchor constraintAnchor4;
        SolverVariable solverVariable;
        SolverVariable solverVariable2;
        ConstraintWidget constraintWidget4;
        ConstraintAnchor constraintAnchor5;
        ConstraintWidget constraintWidget5;
        SolverVariable solverVariable3;
        ConstraintWidget constraintWidget6;
        ConstraintWidget constraintWidget7;
        SolverVariable solverVariable4;
        float f8;
        int size;
        int i11;
        ArrayList<ConstraintWidget> arrayList2;
        int i12;
        boolean z10;
        boolean z11;
        ConstraintWidget constraintWidget8;
        ConstraintWidget constraintWidget9;
        int i13;
        int i14 = i8;
        ConstraintWidget constraintWidget10 = chainHead.mFirst;
        ConstraintWidget constraintWidget11 = chainHead.mLast;
        ConstraintWidget constraintWidget12 = chainHead.mFirstVisibleWidget;
        ConstraintWidget constraintWidget13 = chainHead.mLastVisibleWidget;
        ConstraintWidget constraintWidget14 = chainHead.mHead;
        float f9 = chainHead.mTotalWeight;
        boolean z12 = constraintWidgetContainer.mListDimensionBehaviors[i14] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (i14 == 0) {
            int i15 = constraintWidget14.mHorizontalChainStyle;
            z7 = i15 == 0;
            z8 = i15 == 1;
        } else {
            int i16 = constraintWidget14.mVerticalChainStyle;
            z7 = i16 == 0;
            z8 = i16 == 1;
        }
        boolean z13 = z8;
        boolean z14 = false;
        boolean z15 = z7;
        ?? r8 = constraintWidget10;
        while (true) {
            if (z14) {
                break;
            }
            ConstraintAnchor constraintAnchor6 = r8.mListAnchors[i9];
            int i17 = z9 ? 1 : 4;
            int margin = constraintAnchor6.getMargin();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = r8.mListDimensionBehaviors[i14];
            float f10 = f9;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (dimensionBehaviour == dimensionBehaviour2 && r8.mResolvedMatchConstraintDefault[i14] == 0) {
                z10 = z14;
                z11 = true;
            } else {
                z10 = z14;
                z11 = false;
            }
            ConstraintAnchor constraintAnchor7 = constraintAnchor6.mTarget;
            if (constraintAnchor7 != null && r8 != constraintWidget10) {
                margin += constraintAnchor7.getMargin();
            }
            int i18 = margin;
            if (!z9 || r8 == constraintWidget10 || r8 == constraintWidget12) {
                constraintWidget8 = constraintWidget14;
            } else {
                constraintWidget8 = constraintWidget14;
                i17 = 8;
            }
            ConstraintAnchor constraintAnchor8 = constraintAnchor6.mTarget;
            if (constraintAnchor8 != null) {
                if (r8 == constraintWidget12) {
                    constraintWidget9 = constraintWidget10;
                    linearSystem.addGreaterThan(constraintAnchor6.mSolverVariable, constraintAnchor8.mSolverVariable, i18, 6);
                } else {
                    constraintWidget9 = constraintWidget10;
                    linearSystem.addGreaterThan(constraintAnchor6.mSolverVariable, constraintAnchor8.mSolverVariable, i18, 8);
                }
                if (z11 && !z9) {
                    i17 = 5;
                }
                linearSystem.addEquality(constraintAnchor6.mSolverVariable, constraintAnchor6.mTarget.mSolverVariable, i18, (r8 == constraintWidget12 && z9 && r8.isInBarrier(i14)) ? 5 : i17);
            } else {
                constraintWidget9 = constraintWidget10;
            }
            if (z12) {
                if (r8.getVisibility() == 8 || r8.mListDimensionBehaviors[i14] != dimensionBehaviour2) {
                    i13 = 0;
                } else {
                    ConstraintAnchor[] constraintAnchorArr = r8.mListAnchors;
                    i13 = 0;
                    linearSystem.addGreaterThan(constraintAnchorArr[i9 + 1].mSolverVariable, constraintAnchorArr[i9].mSolverVariable, 0, 5);
                }
                linearSystem.addGreaterThan(r8.mListAnchors[i9].mSolverVariable, constraintWidgetContainer.mListAnchors[i9].mSolverVariable, i13, 8);
            }
            ConstraintAnchor constraintAnchor9 = r8.mListAnchors[i9 + 1].mTarget;
            if (constraintAnchor9 != null) {
                ?? r12 = constraintAnchor9.mOwner;
                ConstraintAnchor constraintAnchor10 = r12.mListAnchors[i9].mTarget;
                if (constraintAnchor10 != null && constraintAnchor10.mOwner == r8) {
                    r21 = r12;
                }
            }
            if (r21 != null) {
                r8 = r21;
                z14 = z10;
            } else {
                z14 = true;
            }
            constraintWidget14 = constraintWidget8;
            f9 = f10;
            constraintWidget10 = constraintWidget9;
            r8 = r8;
        }
        ConstraintWidget constraintWidget15 = constraintWidget14;
        float f11 = f9;
        ConstraintWidget constraintWidget16 = constraintWidget10;
        if (constraintWidget13 != null) {
            int i19 = i9 + 1;
            if (constraintWidget11.mListAnchors[i19].mTarget != null) {
                ConstraintAnchor constraintAnchor11 = constraintWidget13.mListAnchors[i19];
                if (constraintWidget13.mListDimensionBehaviors[i14] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget13.mResolvedMatchConstraintDefault[i14] == 0 && !z9) {
                    ConstraintAnchor constraintAnchor12 = constraintAnchor11.mTarget;
                    if (constraintAnchor12.mOwner == constraintWidgetContainer) {
                        linearSystem.addEquality(constraintAnchor11.mSolverVariable, constraintAnchor12.mSolverVariable, -constraintAnchor11.getMargin(), 5);
                        linearSystem.addLowerThan(constraintAnchor11.mSolverVariable, constraintWidget11.mListAnchors[i19].mTarget.mSolverVariable, -constraintAnchor11.getMargin(), 6);
                        if (z12) {
                            int i20 = i9 + 1;
                            SolverVariable solverVariable5 = constraintWidgetContainer.mListAnchors[i20].mSolverVariable;
                            ConstraintAnchor constraintAnchor13 = constraintWidget11.mListAnchors[i20];
                            linearSystem.addGreaterThan(solverVariable5, constraintAnchor13.mSolverVariable, constraintAnchor13.getMargin(), 8);
                        }
                        arrayList = chainHead.mWeightedMatchConstraintsWidgets;
                        if (arrayList != null && (size = arrayList.size()) > 1) {
                            float f12 = (chainHead.mHasUndefinedWeights || chainHead.mHasComplexMatchWeights) ? f11 : chainHead.mWidgetsMatchCount;
                            float f13 = 0.0f;
                            ConstraintWidget constraintWidget17 = null;
                            i11 = 0;
                            float f14 = 0.0f;
                            while (i11 < size) {
                                ConstraintWidget constraintWidget18 = arrayList.get(i11);
                                float f15 = constraintWidget18.mWeight[i14];
                                if (f15 < f13) {
                                    if (chainHead.mHasComplexMatchWeights) {
                                        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget18.mListAnchors;
                                        linearSystem.addEquality(constraintAnchorArr2[i9 + 1].mSolverVariable, constraintAnchorArr2[i9].mSolverVariable, 0, 4);
                                        arrayList2 = arrayList;
                                        i12 = size;
                                        i11++;
                                        size = i12;
                                        arrayList = arrayList2;
                                        f13 = 0.0f;
                                    } else {
                                        f15 = 1.0f;
                                    }
                                }
                                if (f15 == 0.0f) {
                                    ConstraintAnchor[] constraintAnchorArr3 = constraintWidget18.mListAnchors;
                                    linearSystem.addEquality(constraintAnchorArr3[i9 + 1].mSolverVariable, constraintAnchorArr3[i9].mSolverVariable, 0, 8);
                                    arrayList2 = arrayList;
                                    i12 = size;
                                    i11++;
                                    size = i12;
                                    arrayList = arrayList2;
                                    f13 = 0.0f;
                                } else {
                                    if (constraintWidget17 != null) {
                                        ConstraintAnchor[] constraintAnchorArr4 = constraintWidget17.mListAnchors;
                                        SolverVariable solverVariable6 = constraintAnchorArr4[i9].mSolverVariable;
                                        int i21 = i9 + 1;
                                        SolverVariable solverVariable7 = constraintAnchorArr4[i21].mSolverVariable;
                                        ConstraintAnchor[] constraintAnchorArr5 = constraintWidget18.mListAnchors;
                                        arrayList2 = arrayList;
                                        SolverVariable solverVariable8 = constraintAnchorArr5[i9].mSolverVariable;
                                        SolverVariable solverVariable9 = constraintAnchorArr5[i21].mSolverVariable;
                                        i12 = size;
                                        ArrayRow createRow = linearSystem.createRow();
                                        createRow.createRowEqualMatchDimensions(f14, f12, f15, solverVariable6, solverVariable7, solverVariable8, solverVariable9);
                                        linearSystem.addConstraint(createRow);
                                    } else {
                                        arrayList2 = arrayList;
                                        i12 = size;
                                    }
                                    constraintWidget17 = constraintWidget18;
                                    f14 = f15;
                                    i11++;
                                    size = i12;
                                    arrayList = arrayList2;
                                    f13 = 0.0f;
                                }
                            }
                        }
                        if (constraintWidget12 == null && (constraintWidget12 == constraintWidget13 || z9)) {
                            ConstraintAnchor constraintAnchor14 = constraintWidget16.mListAnchors[i9];
                            int i22 = i9 + 1;
                            ConstraintAnchor constraintAnchor15 = constraintWidget11.mListAnchors[i22];
                            ConstraintAnchor constraintAnchor16 = constraintAnchor14.mTarget;
                            SolverVariable solverVariable10 = constraintAnchor16 != null ? constraintAnchor16.mSolverVariable : null;
                            ConstraintAnchor constraintAnchor17 = constraintAnchor15.mTarget;
                            SolverVariable solverVariable11 = constraintAnchor17 != null ? constraintAnchor17.mSolverVariable : null;
                            ConstraintAnchor constraintAnchor18 = constraintWidget12.mListAnchors[i9];
                            if (constraintWidget13 != null) {
                                constraintAnchor15 = constraintWidget13.mListAnchors[i22];
                            }
                            if (solverVariable10 != null && solverVariable11 != null) {
                                if (i14 == 0) {
                                    f8 = constraintWidget15.mHorizontalBiasPercent;
                                } else {
                                    f8 = constraintWidget15.mVerticalBiasPercent;
                                }
                                linearSystem.addCentering(constraintAnchor18.mSolverVariable, solverVariable10, constraintAnchor18.getMargin(), f8, solverVariable11, constraintAnchor15.mSolverVariable, constraintAnchor15.getMargin(), 7);
                            }
                        } else if (z15 || constraintWidget12 == null) {
                            int i23 = 8;
                            if (z13 && constraintWidget12 != null) {
                                int i24 = chainHead.mWidgetsMatchCount;
                                boolean z16 = i24 <= 0 && chainHead.mWidgetsCount == i24;
                                ConstraintWidget constraintWidget19 = constraintWidget12;
                                constraintWidget = constraintWidget19;
                                while (constraintWidget != null) {
                                    ConstraintWidget constraintWidget20 = constraintWidget.mNextChainWidget[i14];
                                    while (constraintWidget20 != null && constraintWidget20.getVisibility() == i23) {
                                        constraintWidget20 = constraintWidget20.mNextChainWidget[i14];
                                    }
                                    if (constraintWidget == constraintWidget12 || constraintWidget == constraintWidget13 || constraintWidget20 == null) {
                                        constraintWidget2 = constraintWidget19;
                                        i10 = 8;
                                    } else {
                                        ConstraintWidget constraintWidget21 = constraintWidget20 == constraintWidget13 ? null : constraintWidget20;
                                        ConstraintAnchor constraintAnchor19 = constraintWidget.mListAnchors[i9];
                                        SolverVariable solverVariable12 = constraintAnchor19.mSolverVariable;
                                        ConstraintAnchor constraintAnchor20 = constraintAnchor19.mTarget;
                                        if (constraintAnchor20 != null) {
                                            SolverVariable solverVariable13 = constraintAnchor20.mSolverVariable;
                                        }
                                        int i25 = i9 + 1;
                                        SolverVariable solverVariable14 = constraintWidget19.mListAnchors[i25].mSolverVariable;
                                        int margin2 = constraintAnchor19.getMargin();
                                        int margin3 = constraintWidget.mListAnchors[i25].getMargin();
                                        if (constraintWidget21 != null) {
                                            constraintAnchor4 = constraintWidget21.mListAnchors[i9];
                                            SolverVariable solverVariable15 = constraintAnchor4.mSolverVariable;
                                            constraintWidget3 = constraintWidget21;
                                            ConstraintAnchor constraintAnchor21 = constraintAnchor4.mTarget;
                                            solverVariable2 = constraintAnchor21 != null ? constraintAnchor21.mSolverVariable : null;
                                            solverVariable = solverVariable15;
                                        } else {
                                            constraintWidget3 = constraintWidget21;
                                            constraintAnchor4 = constraintWidget13.mListAnchors[i9];
                                            solverVariable = constraintAnchor4 != null ? constraintAnchor4.mSolverVariable : null;
                                            solverVariable2 = constraintWidget.mListAnchors[i25].mSolverVariable;
                                        }
                                        if (constraintAnchor4 != null) {
                                            margin3 += constraintAnchor4.getMargin();
                                        }
                                        int i26 = margin3;
                                        int margin4 = constraintWidget19.mListAnchors[i25].getMargin() + margin2;
                                        int i27 = z16 ? 8 : 4;
                                        if (solverVariable12 == null || solverVariable14 == null || solverVariable == null || solverVariable2 == null) {
                                            constraintWidget4 = constraintWidget3;
                                            constraintWidget2 = constraintWidget19;
                                            i10 = 8;
                                        } else {
                                            constraintWidget4 = constraintWidget3;
                                            constraintWidget2 = constraintWidget19;
                                            i10 = 8;
                                            linearSystem.addCentering(solverVariable12, solverVariable14, margin4, 0.5f, solverVariable, solverVariable2, i26, i27);
                                        }
                                        constraintWidget20 = constraintWidget4;
                                    }
                                    constraintWidget19 = constraintWidget.getVisibility() != i10 ? constraintWidget : constraintWidget2;
                                    i14 = i8;
                                    constraintWidget = constraintWidget20;
                                    i23 = 8;
                                }
                                ConstraintAnchor constraintAnchor22 = constraintWidget12.mListAnchors[i9];
                                constraintAnchor = constraintWidget16.mListAnchors[i9].mTarget;
                                int i28 = i9 + 1;
                                constraintAnchor2 = constraintWidget13.mListAnchors[i28];
                                constraintAnchor3 = constraintWidget11.mListAnchors[i28].mTarget;
                                if (constraintAnchor != null) {
                                    if (constraintWidget12 != constraintWidget13) {
                                        linearSystem.addEquality(constraintAnchor22.mSolverVariable, constraintAnchor.mSolverVariable, constraintAnchor22.getMargin(), 5);
                                    } else if (constraintAnchor3 != null) {
                                        linearSystem.addCentering(constraintAnchor22.mSolverVariable, constraintAnchor.mSolverVariable, constraintAnchor22.getMargin(), 0.5f, constraintAnchor2.mSolverVariable, constraintAnchor3.mSolverVariable, constraintAnchor2.getMargin(), 5);
                                    }
                                }
                                if (constraintAnchor3 != null && constraintWidget12 != constraintWidget13) {
                                    linearSystem.addEquality(constraintAnchor2.mSolverVariable, constraintAnchor3.mSolverVariable, -constraintAnchor2.getMargin(), 5);
                                }
                            }
                        } else {
                            int i29 = chainHead.mWidgetsMatchCount;
                            boolean z17 = i29 > 0 && chainHead.mWidgetsCount == i29;
                            ConstraintWidget constraintWidget22 = constraintWidget12;
                            ConstraintWidget constraintWidget23 = constraintWidget22;
                            while (constraintWidget23 != null) {
                                ConstraintWidget constraintWidget24 = constraintWidget23.mNextChainWidget[i14];
                                while (constraintWidget24 != null && constraintWidget24.getVisibility() == 8) {
                                    constraintWidget24 = constraintWidget24.mNextChainWidget[i14];
                                }
                                if (constraintWidget24 != null || constraintWidget23 == constraintWidget13) {
                                    ConstraintAnchor constraintAnchor23 = constraintWidget23.mListAnchors[i9];
                                    SolverVariable solverVariable16 = constraintAnchor23.mSolverVariable;
                                    ConstraintAnchor constraintAnchor24 = constraintAnchor23.mTarget;
                                    SolverVariable solverVariable17 = constraintAnchor24 != null ? constraintAnchor24.mSolverVariable : null;
                                    if (constraintWidget22 != constraintWidget23) {
                                        solverVariable17 = constraintWidget22.mListAnchors[i9 + 1].mSolverVariable;
                                    } else if (constraintWidget23 == constraintWidget12) {
                                        ConstraintAnchor constraintAnchor25 = constraintWidget16.mListAnchors[i9].mTarget;
                                        solverVariable17 = constraintAnchor25 != null ? constraintAnchor25.mSolverVariable : null;
                                    }
                                    int margin5 = constraintAnchor23.getMargin();
                                    int i30 = i9 + 1;
                                    int margin6 = constraintWidget23.mListAnchors[i30].getMargin();
                                    if (constraintWidget24 != null) {
                                        constraintAnchor5 = constraintWidget24.mListAnchors[i9];
                                        solverVariable3 = constraintAnchor5.mSolverVariable;
                                    } else {
                                        constraintAnchor5 = constraintWidget11.mListAnchors[i30].mTarget;
                                        if (constraintAnchor5 != null) {
                                            solverVariable3 = constraintAnchor5.mSolverVariable;
                                        } else {
                                            constraintWidget5 = constraintWidget24;
                                            solverVariable3 = null;
                                            SolverVariable solverVariable18 = constraintWidget23.mListAnchors[i30].mSolverVariable;
                                            if (constraintAnchor5 != null) {
                                                margin6 += constraintAnchor5.getMargin();
                                            }
                                            int margin7 = margin5 + constraintWidget22.mListAnchors[i30].getMargin();
                                            if (solverVariable16 != null || solverVariable17 == null || solverVariable3 == null || solverVariable18 == null) {
                                                constraintWidget6 = constraintWidget5;
                                            } else {
                                                if (constraintWidget23 == constraintWidget12) {
                                                    margin7 = constraintWidget12.mListAnchors[i9].getMargin();
                                                }
                                                int i31 = margin7;
                                                constraintWidget6 = constraintWidget5;
                                                constraintWidget7 = constraintWidget22;
                                                linearSystem.addCentering(solverVariable16, solverVariable17, i31, 0.5f, solverVariable3, solverVariable18, constraintWidget23 == constraintWidget13 ? constraintWidget13.mListAnchors[i30].getMargin() : margin6, z17 ? 8 : 5);
                                                if (constraintWidget23.getVisibility() != 8) {
                                                    constraintWidget23 = constraintWidget7;
                                                }
                                                constraintWidget22 = constraintWidget23;
                                                constraintWidget23 = constraintWidget6;
                                            }
                                        }
                                    }
                                    constraintWidget5 = constraintWidget24;
                                    SolverVariable solverVariable182 = constraintWidget23.mListAnchors[i30].mSolverVariable;
                                    if (constraintAnchor5 != null) {
                                    }
                                    int margin72 = margin5 + constraintWidget22.mListAnchors[i30].getMargin();
                                    if (solverVariable16 != null) {
                                    }
                                    constraintWidget6 = constraintWidget5;
                                } else {
                                    constraintWidget6 = constraintWidget24;
                                }
                                constraintWidget7 = constraintWidget22;
                                if (constraintWidget23.getVisibility() != 8) {
                                }
                                constraintWidget22 = constraintWidget23;
                                constraintWidget23 = constraintWidget6;
                            }
                        }
                        if ((z15 && !z13) || constraintWidget12 == null || constraintWidget12 == constraintWidget13) {
                            return;
                        }
                        ConstraintAnchor[] constraintAnchorArr6 = constraintWidget12.mListAnchors;
                        ConstraintAnchor constraintAnchor26 = constraintAnchorArr6[i9];
                        if (constraintWidget13 == null) {
                            constraintWidget13 = constraintWidget12;
                        }
                        int i32 = i9 + 1;
                        ConstraintAnchor constraintAnchor27 = constraintWidget13.mListAnchors[i32];
                        ConstraintAnchor constraintAnchor28 = constraintAnchor26.mTarget;
                        solverVariable4 = constraintAnchor28 != null ? constraintAnchor28.mSolverVariable : null;
                        ConstraintAnchor constraintAnchor29 = constraintAnchor27.mTarget;
                        SolverVariable solverVariable19 = constraintAnchor29 != null ? constraintAnchor29.mSolverVariable : null;
                        if (constraintWidget11 != constraintWidget13) {
                            ConstraintAnchor constraintAnchor30 = constraintWidget11.mListAnchors[i32].mTarget;
                            solverVariable19 = constraintAnchor30 != null ? constraintAnchor30.mSolverVariable : null;
                        }
                        if (constraintWidget12 == constraintWidget13) {
                            constraintAnchor27 = constraintAnchorArr6[i32];
                        }
                        if (solverVariable4 == null || solverVariable19 == null) {
                            return;
                        }
                        linearSystem.addCentering(constraintAnchor26.mSolverVariable, solverVariable4, constraintAnchor26.getMargin(), 0.5f, solverVariable19, constraintAnchor27.mSolverVariable, constraintWidget13.mListAnchors[i32].getMargin(), 5);
                        return;
                    }
                }
                if (z9) {
                    ConstraintAnchor constraintAnchor31 = constraintAnchor11.mTarget;
                    if (constraintAnchor31.mOwner == constraintWidgetContainer) {
                        linearSystem.addEquality(constraintAnchor11.mSolverVariable, constraintAnchor31.mSolverVariable, -constraintAnchor11.getMargin(), 4);
                    }
                }
                linearSystem.addLowerThan(constraintAnchor11.mSolverVariable, constraintWidget11.mListAnchors[i19].mTarget.mSolverVariable, -constraintAnchor11.getMargin(), 6);
                if (z12) {
                }
                arrayList = chainHead.mWeightedMatchConstraintsWidgets;
                if (arrayList != null) {
                    if (chainHead.mHasUndefinedWeights) {
                    }
                    float f132 = 0.0f;
                    ConstraintWidget constraintWidget172 = null;
                    i11 = 0;
                    float f142 = 0.0f;
                    while (i11 < size) {
                    }
                }
                if (constraintWidget12 == null) {
                }
                if (z15) {
                }
                int i232 = 8;
                if (z13) {
                    int i242 = chainHead.mWidgetsMatchCount;
                    if (i242 <= 0) {
                    }
                    ConstraintWidget constraintWidget192 = constraintWidget12;
                    constraintWidget = constraintWidget192;
                    while (constraintWidget != null) {
                    }
                    ConstraintAnchor constraintAnchor222 = constraintWidget12.mListAnchors[i9];
                    constraintAnchor = constraintWidget16.mListAnchors[i9].mTarget;
                    int i282 = i9 + 1;
                    constraintAnchor2 = constraintWidget13.mListAnchors[i282];
                    constraintAnchor3 = constraintWidget11.mListAnchors[i282].mTarget;
                    if (constraintAnchor != null) {
                    }
                    if (constraintAnchor3 != null) {
                        linearSystem.addEquality(constraintAnchor2.mSolverVariable, constraintAnchor3.mSolverVariable, -constraintAnchor2.getMargin(), 5);
                    }
                }
                if (z15) {
                }
                ConstraintAnchor[] constraintAnchorArr62 = constraintWidget12.mListAnchors;
                ConstraintAnchor constraintAnchor262 = constraintAnchorArr62[i9];
                if (constraintWidget13 == null) {
                }
                int i322 = i9 + 1;
                ConstraintAnchor constraintAnchor272 = constraintWidget13.mListAnchors[i322];
                ConstraintAnchor constraintAnchor282 = constraintAnchor262.mTarget;
                if (constraintAnchor282 != null) {
                }
                ConstraintAnchor constraintAnchor292 = constraintAnchor272.mTarget;
                if (constraintAnchor292 != null) {
                }
                if (constraintWidget11 != constraintWidget13) {
                }
                if (constraintWidget12 == constraintWidget13) {
                }
                if (solverVariable4 == null) {
                    return;
                } else {
                    return;
                }
            }
        }
        if (z12) {
        }
        arrayList = chainHead.mWeightedMatchConstraintsWidgets;
        if (arrayList != null) {
        }
        if (constraintWidget12 == null) {
        }
        if (z15) {
        }
        int i2322 = 8;
        if (z13) {
        }
        if (z15) {
        }
        ConstraintAnchor[] constraintAnchorArr622 = constraintWidget12.mListAnchors;
        ConstraintAnchor constraintAnchor2622 = constraintAnchorArr622[i9];
        if (constraintWidget13 == null) {
        }
        int i3222 = i9 + 1;
        ConstraintAnchor constraintAnchor2722 = constraintWidget13.mListAnchors[i3222];
        ConstraintAnchor constraintAnchor2822 = constraintAnchor2622.mTarget;
        if (constraintAnchor2822 != null) {
        }
        ConstraintAnchor constraintAnchor2922 = constraintAnchor2722.mTarget;
        if (constraintAnchor2922 != null) {
        }
        if (constraintWidget11 != constraintWidget13) {
        }
        if (constraintWidget12 == constraintWidget13) {
        }
        if (solverVariable4 == null) {
        }
    }
}
