package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.recyclerview.widget.RecyclerView;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.steps.ui.ComponentView;
import com.withpersona.sdk2.inquiry.steps.ui.view.StackGapView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes9.dex */
public abstract class StacksKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StyleElements.PositionType.values().length];
            try {
                iArr[StyleElements.PositionType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StyleElements.PositionType.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v8 */
    public static final void setupHorizontalStack(ConstraintLayout constraintLayout, ConstraintSet constraintSet, ArrayList arrayList, ArrayList arrayList2, int[] iArr, StyleElements.PositionType positionType, int i) {
        ?? r9;
        int i2;
        Integer orNull;
        Object obj;
        Object obj2;
        ArrayList associatedViews;
        ConstraintLayout constraintLayout2 = constraintLayout;
        constraintLayout2.getClass();
        double sum = iArr != null ? ArraysKt___ArraysKt.sum(iArr) : 0.0d;
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = 1;
            if (!it.hasNext()) {
                int i6 = 0;
                for (Object obj3 : arrayList2) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        ?? r18 = r13;
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw r18;
                    }
                    int intValue = ((Number) obj3).intValue();
                    ?? r11 = i6 > 0 ? (Integer) arrayList3.get(i6 - 1) : r13;
                    HideableComponent hideableComponent = r13;
                    if (i6 == arrayList2.size() - i5) {
                        constraintSet.connect$1(intValue, 7, i3, 7);
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj = it2.next();
                                if (((ComponentView) obj).view.getId() == intValue) {
                                    break;
                                }
                            } else {
                                obj = hideableComponent;
                                break;
                            }
                        }
                        ComponentView componentView = (ComponentView) obj;
                        if ((componentView != null ? componentView.component : hideableComponent) != null && r11 != 0) {
                            ((StackGapView) constraintLayout2.findViewById(r11.intValue())).associatedComponents.add(new WeakReference(componentView.component));
                        }
                        r9 = hideableComponent;
                    } else {
                        Integer num = (Integer) arrayList3.get(i6);
                        constraintSet.connect$1(intValue, 7, num.intValue(), 6);
                        constraintSet.connect$1(num.intValue(), 7, ((Number) arrayList2.get(i7)).intValue(), 6);
                        constraintSet.connect$1(num.intValue(), 6, intValue, 7);
                        r9 = num;
                    }
                    if (r11 != 0) {
                        constraintSet.connect$1(intValue, 6, r11.intValue(), 7);
                    } else {
                        constraintSet.connect$1(intValue, 6, 0, 6);
                    }
                    constraintSet.get(intValue).layout.mHeight = -2;
                    constraintSet.get(intValue).layout.constrainedHeight = true;
                    if (sum > 0.0d) {
                        double intValue2 = ((iArr == null || (orNull = ArraysKt___ArraysKt.getOrNull(i6, iArr)) == null) ? 0 : orNull.intValue()) / sum;
                        if (intValue2 > 0.0d) {
                            constraintSet.get(intValue).layout.horizontalWeight = (float) intValue2;
                        } else {
                            constraintSet.get(intValue).layout.mWidth = -2;
                        }
                        i2 = 0;
                    } else {
                        i2 = 0;
                        constraintSet.get(intValue).layout.widthDefault = 0;
                    }
                    constraintSet.connect$1(intValue, 3, i2, 3);
                    constraintSet.connect$1(intValue, 4, i2, 4);
                    if (r9 != 0) {
                        constraintSet.connect$1(r9.intValue(), 3, i2, 3);
                        constraintSet.connect$1(r9.intValue(), 4, i2, 4);
                    }
                    int i8 = positionType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[positionType.ordinal()];
                    i5 = 1;
                    if (i8 == 1) {
                        constraintSet.setVerticalBias(RecyclerView.DECELERATION_RATE, intValue);
                    } else if (i8 != 2) {
                        constraintSet.setVerticalBias(0.5f, intValue);
                    } else {
                        constraintSet.setVerticalBias(1.0f, intValue);
                    }
                    constraintLayout2 = constraintLayout;
                    i3 = i2;
                    i6 = i7;
                    r13 = hideableComponent;
                }
                return;
            }
            Object next = it.next();
            int i9 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            int intValue3 = ((Number) next).intValue();
            Context context = constraintLayout2.getContext();
            context.getClass();
            StackGapView stackGapView = new StackGapView(context);
            stackGapView.setId(View.generateViewId());
            stackGapView.setSaveEnabled(false);
            if (i4 != arrayList2.size() - 1) {
                Iterator it3 = arrayList.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj2 = it3.next();
                        if (((ComponentView) obj2).view.getId() == intValue3) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                ComponentView componentView2 = (ComponentView) obj2;
                Object obj4 = componentView2 != null ? componentView2.component : null;
                r13 = obj4 instanceof HideableComponent ? (HideableComponent) obj4 : null;
                if (r13 != null && (associatedViews = r13.getAssociatedViews()) != null) {
                    associatedViews.add(stackGapView);
                }
                constraintLayout2.addView(stackGapView);
                constraintSet.get(stackGapView.getId()).layout.mWidth = i;
                constraintSet.get(stackGapView.getId()).layout.constrainedWidth = true;
                constraintSet.get(stackGapView.getId()).layout.mHeight = 1;
                constraintSet.get(stackGapView.getId()).layout.constrainedHeight = true;
                arrayList3.add(Integer.valueOf(stackGapView.getId()));
            }
            i4 = i9;
        }
    }

    public static final void setupVerticalStack(ConstraintLayout constraintLayout, ConstraintSet constraintSet, ArrayList arrayList, ArrayList arrayList2, StyleElements.PositionType positionType, int i) {
        Integer num;
        Object obj;
        Object obj2;
        ArrayList associatedViews;
        constraintLayout.getClass();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                int i3 = 0;
                for (Object obj3 : arrayList2) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    int intValue = ((Number) obj3).intValue();
                    Integer num2 = i3 > 0 ? (Integer) arrayList3.get(i3 - 1) : null;
                    if (i3 == arrayList2.size() - 1) {
                        constraintSet.connect$1(intValue, 4, 0, 4);
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj = it2.next();
                                if (((ComponentView) obj).view.getId() == intValue) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        ComponentView componentView = (ComponentView) obj;
                        if ((componentView != null ? componentView.component : null) != null && num2 != null) {
                            ((StackGapView) constraintLayout.findViewById(num2.intValue())).associatedComponents.add(new WeakReference(componentView.component));
                        }
                        num = null;
                    } else {
                        num = (Integer) arrayList3.get(i3);
                        constraintSet.connect$1(num.intValue(), 3, intValue, 4);
                    }
                    if (i3 == 0) {
                        constraintSet.connect$1(intValue, 3, 0, 3);
                    }
                    if (num2 != null) {
                        constraintSet.connect$1(num2.intValue(), 4, intValue, 3);
                        constraintSet.connect$1(intValue, 3, num2.intValue(), 4);
                    }
                    constraintSet.connect$1(intValue, 6, 0, 6);
                    constraintSet.connect$1(intValue, 7, 0, 7);
                    if (num != null) {
                        constraintSet.connect$1(num.intValue(), 6, 0, 6);
                        constraintSet.connect$1(num.intValue(), 7, 0, 7);
                    }
                    constraintSet.get(intValue).layout.mHeight = -2;
                    constraintSet.get(intValue).layout.mWidth = 0;
                    int i5 = positionType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[positionType.ordinal()];
                    if (i5 == 1) {
                        constraintSet.get(intValue).layout.horizontalBias = RecyclerView.DECELERATION_RATE;
                    } else if (i5 != 2) {
                        constraintSet.get(intValue).layout.horizontalBias = 0.5f;
                    } else {
                        constraintSet.get(intValue).layout.horizontalBias = 1.0f;
                    }
                    i3 = i4;
                }
                return;
            }
            Object next = it.next();
            int i6 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            int intValue2 = ((Number) next).intValue();
            Context context = constraintLayout.getContext();
            context.getClass();
            StackGapView stackGapView = new StackGapView(context);
            stackGapView.setId(View.generateViewId());
            stackGapView.setSaveEnabled(false);
            if (i2 != arrayList2.size() - 1) {
                Iterator it3 = arrayList.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj2 = it3.next();
                        if (((ComponentView) obj2).view.getId() == intValue2) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                ComponentView componentView2 = (ComponentView) obj2;
                Object obj4 = componentView2 != null ? componentView2.component : null;
                HideableComponent hideableComponent = obj4 instanceof HideableComponent ? (HideableComponent) obj4 : null;
                if (hideableComponent != null && (associatedViews = hideableComponent.getAssociatedViews()) != null) {
                    associatedViews.add(stackGapView);
                }
                constraintLayout.addView(stackGapView);
                constraintSet.get(stackGapView.getId()).layout.mWidth = 1;
                constraintSet.get(stackGapView.getId()).layout.constrainedWidth = true;
                constraintSet.get(stackGapView.getId()).layout.mHeight = i;
                constraintSet.get(stackGapView.getId()).layout.constrainedHeight = true;
                arrayList3.add(Integer.valueOf(stackGapView.getId()));
            }
            i2 = i6;
        }
    }
}
