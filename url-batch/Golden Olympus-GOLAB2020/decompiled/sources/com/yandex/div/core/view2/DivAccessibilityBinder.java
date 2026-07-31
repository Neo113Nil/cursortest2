package com.yandex.div.core.view2;

import B.w;
import O1.Ab;
import O1.C0839h0;
import O1.C0886jc;
import O1.C0892k0;
import O1.C0939mb;
import O1.C0970o6;
import O1.C1013qd;
import O1.C1060t7;
import O1.InterfaceC0752c3;
import O1.Kd;
import O1.O6;
import W1.m;
import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import androidx.core.view.AbstractC1281a0;
import androidx.core.view.C1280a;
import com.yandex.div.core.util.AccessibilityStateProvider;
import com.yandex.div.core.view2.backbutton.BackHandlingRecyclerView;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import com.yandex.div.core.view2.divs.widgets.DivSliderView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public class DivAccessibilityBinder {

    @NotNull
    private final AccessibilityStateProvider accessibilityStateProvider;
    private final boolean enabled;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata
    enum AccessibilityType {
        NONE,
        BUTTON,
        EDIT_TEXT,
        HEADER,
        IMAGE,
        LIST,
        SLIDER,
        SELECT,
        TAB_WIDGET,
        PAGER,
        TEXT,
        RADIO_BUTTON,
        CHECK_BOX
    }

    @Metadata
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[AccessibilityType.values().length];
            try {
                iArr[AccessibilityType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccessibilityType.BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccessibilityType.EDIT_TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AccessibilityType.HEADER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AccessibilityType.IMAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AccessibilityType.LIST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AccessibilityType.PAGER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AccessibilityType.SLIDER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AccessibilityType.SELECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[AccessibilityType.TAB_WIDGET.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[AccessibilityType.TEXT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[AccessibilityType.CHECK_BOX.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[AccessibilityType.RADIO_BUTTON.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[C0839h0.c.values().length];
            try {
                iArr2[C0839h0.c.EXCLUDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[C0839h0.c.MERGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[C0839h0.c.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[C0839h0.d.values().length];
            try {
                iArr3[C0839h0.d.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[C0839h0.d.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[C0839h0.d.BUTTON.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[C0839h0.d.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[C0839h0.d.TEXT.ordinal()] = 5;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[C0839h0.d.EDIT_TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[C0839h0.d.HEADER.ordinal()] = 7;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[C0839h0.d.LIST.ordinal()] = 8;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[C0839h0.d.SELECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr3[C0839h0.d.TAB_BAR.ordinal()] = 10;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr3[C0839h0.d.RADIO.ordinal()] = 11;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr3[C0839h0.d.CHECKBOX.ordinal()] = 12;
            } catch (NoSuchFieldError unused28) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public DivAccessibilityBinder(boolean z4, @NotNull AccessibilityStateProvider accessibilityStateProvider) {
        Intrinsics.checkNotNullParameter(accessibilityStateProvider, "accessibilityStateProvider");
        this.enabled = z4;
        this.accessibilityStateProvider = accessibilityStateProvider;
    }

    private void applyAccessibilityMode(View view, C0839h0.c cVar, Div2View div2View, boolean z4) {
        int i4 = WhenMappings.$EnumSwitchMapping$1[cVar.ordinal()];
        if (i4 == 1) {
            view.setImportantForAccessibility(4);
            view.setFocusable(false);
            if (view instanceof DivInputView) {
                ((DivInputView) view).setFocusableInTouchMode(true);
            }
        } else if (i4 == 2) {
            view.setImportantForAccessibility(1);
            if (z4) {
                setActionable(view, false);
            } else {
                view.setFocusable(!(view instanceof DivSliderView));
            }
        } else if (i4 == 3) {
            view.setImportantForAccessibility(0);
            view.setFocusable(!(view instanceof DivSliderView));
        }
        div2View.setPropagatedAccessibilityMode$div_release(view, cVar);
    }

    private C0839h0.c getGetDefaultAccessibilityMode(InterfaceC0752c3 interfaceC0752c3) {
        Ab ab;
        List list;
        List list2;
        List list3;
        O6 o6;
        List list4;
        List list5;
        List list6;
        return interfaceC0752c3 instanceof O6 ? (interfaceC0752c3.d() == null && ((list4 = (o6 = (O6) interfaceC0752c3).f4258r) == null || list4.isEmpty()) && (((list5 = o6.f4243d) == null || list5.isEmpty()) && ((list6 = o6.f4214D) == null || list6.isEmpty()))) ? C0839h0.c.EXCLUDE : C0839h0.c.DEFAULT : interfaceC0752c3 instanceof Ab ? (interfaceC0752c3.d() == null && ((list = (ab = (Ab) interfaceC0752c3).f1369o) == null || list.isEmpty()) && (((list2 = ab.f1358d) == null || list2.isEmpty()) && ((list3 = ab.f1378x) == null || list3.isEmpty()))) ? C0839h0.c.EXCLUDE : C0839h0.c.DEFAULT : C0839h0.c.DEFAULT;
    }

    private int getPriority(C0839h0.c cVar) {
        int i4 = WhenMappings.$EnumSwitchMapping$1[cVar.ordinal()];
        if (i4 == 1) {
            return 0;
        }
        if (i4 == 2) {
            return 1;
        }
        if (i4 == 3) {
            return 2;
        }
        throw new m();
    }

    private C0839h0.c getPropagatedMode(C0839h0.c cVar, C0839h0.c cVar2) {
        return getPriority(cVar) < getPriority(cVar2) ? cVar : cVar2;
    }

    private boolean isClickable(O6 o6, ExpressionResolver expressionResolver) {
        Expression expression;
        C0892k0 c0892k0 = o6.f4239b;
        if (c0892k0 != null && c0892k0 != null && (expression = c0892k0.f6753b) != null && ((Boolean) expression.evaluate(expressionResolver)).booleanValue()) {
            return true;
        }
        List list = o6.f4243d;
        if (list != null && list != null) {
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (((Boolean) ((C0892k0) it.next()).f6753b.evaluate(expressionResolver)).booleanValue()) {
                        return true;
                    }
                }
            }
        }
        List list3 = o6.f4214D;
        if (list3 == null || list3 == null) {
            return false;
        }
        List list4 = list3;
        if ((list4 instanceof Collection) && list4.isEmpty()) {
            return false;
        }
        Iterator it2 = list4.iterator();
        while (it2.hasNext()) {
            if (((Boolean) ((C0892k0) it2.next()).f6753b.evaluate(expressionResolver)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    private void setActionable(View view, boolean z4) {
        view.setClickable(z4);
        view.setLongClickable(z4);
        view.setFocusable(z4);
    }

    private AccessibilityType toAccessibilityType(C0839h0.d dVar, InterfaceC0752c3 interfaceC0752c3, ExpressionResolver expressionResolver) {
        Expression expression;
        switch (WhenMappings.$EnumSwitchMapping$2[dVar.ordinal()]) {
            case 1:
                C0839h0 d4 = interfaceC0752c3.d();
                if (((d4 == null || (expression = d4.f6318d) == null) ? null : (C0839h0.c) expression.evaluate(expressionResolver)) == C0839h0.c.EXCLUDE) {
                    return AccessibilityType.NONE;
                }
                if (interfaceC0752c3 instanceof C1060t7) {
                    return AccessibilityType.EDIT_TEXT;
                }
                if (interfaceC0752c3 instanceof Kd) {
                    return AccessibilityType.TEXT;
                }
                if (interfaceC0752c3 instanceof C1013qd) {
                    return AccessibilityType.TAB_WIDGET;
                }
                if (interfaceC0752c3 instanceof C0939mb) {
                    return AccessibilityType.SELECT;
                }
                if (interfaceC0752c3 instanceof C0886jc) {
                    return AccessibilityType.SLIDER;
                }
                if ((interfaceC0752c3 instanceof O6) && (interfaceC0752c3.d() != null || isClickable((O6) interfaceC0752c3, expressionResolver))) {
                    return AccessibilityType.IMAGE;
                }
                if (interfaceC0752c3 instanceof C0970o6) {
                    C0839h0 d5 = interfaceC0752c3.d();
                    if ((d5 != null ? d5.f6315a : null) != null) {
                        return AccessibilityType.PAGER;
                    }
                }
                return interfaceC0752c3 instanceof RadioButton ? AccessibilityType.RADIO_BUTTON : interfaceC0752c3 instanceof CheckBox ? AccessibilityType.CHECK_BOX : AccessibilityType.NONE;
            case 2:
                return AccessibilityType.NONE;
            case 3:
                return AccessibilityType.BUTTON;
            case 4:
                return AccessibilityType.IMAGE;
            case 5:
                return AccessibilityType.TEXT;
            case 6:
                return AccessibilityType.EDIT_TEXT;
            case 7:
                return AccessibilityType.HEADER;
            case 8:
                return AccessibilityType.LIST;
            case 9:
                return AccessibilityType.SELECT;
            case 10:
                return AccessibilityType.TAB_WIDGET;
            case 11:
                return AccessibilityType.RADIO_BUTTON;
            case 12:
                return AccessibilityType.CHECK_BOX;
            default:
                throw new m();
        }
    }

    public void bindAccessibilityMode(@NotNull View view, @NotNull Div2View divView, @Nullable C0839h0.c cVar, @NotNull InterfaceC0752c3 divBase) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(divView, "divView");
        Intrinsics.checkNotNullParameter(divBase, "divBase");
        if (getEnabled()) {
            Object parent = view.getParent();
            View view2 = parent instanceof View ? (View) parent : null;
            C0839h0.c propagatedAccessibilityMode$div_release = view2 != null ? divView.getPropagatedAccessibilityMode$div_release(view2) : null;
            if (propagatedAccessibilityMode$div_release == null) {
                if (cVar == null) {
                    cVar = getGetDefaultAccessibilityMode(divBase);
                }
                applyAccessibilityMode(view, cVar, divView, false);
            } else {
                if (cVar == null) {
                    cVar = getGetDefaultAccessibilityMode(divBase);
                }
                C0839h0.c propagatedMode = getPropagatedMode(propagatedAccessibilityMode$div_release, cVar);
                applyAccessibilityMode(view, propagatedMode, divView, propagatedAccessibilityMode$div_release == propagatedMode);
            }
        }
    }

    public void bindType(@NotNull View view, @NotNull InterfaceC0752c3 divBase, @NotNull C0839h0.d type, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(divBase, "divBase");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        AccessibilityStateProvider accessibilityStateProvider = this.accessibilityStateProvider;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        if (accessibilityStateProvider.isAccessibilityEnabled(context)) {
            C1280a n4 = AbstractC1281a0.n(view);
            AccessibilityType accessibilityType = toAccessibilityType(type, divBase, resolver);
            if (accessibilityType == AccessibilityType.LIST && (view instanceof BackHandlingRecyclerView)) {
                n4 = new AccessibilityListDelegate((BackHandlingRecyclerView) view);
            } else if (n4 instanceof AccessibilityDelegateWrapper) {
                ((AccessibilityDelegateWrapper) n4).setInitializeAccessibilityNodeInfo(new DivAccessibilityBinder$bindType$accessibilityDelegate$1$1(this, accessibilityType));
            } else {
                n4 = new AccessibilityDelegateWrapper(n4, new DivAccessibilityBinder$bindType$accessibilityDelegate$2(this, accessibilityType), null, 4, null);
            }
            AbstractC1281a0.o0(view, n4);
        }
    }

    public boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bindType(w wVar, AccessibilityType accessibilityType) {
        String str = "";
        switch (WhenMappings.$EnumSwitchMapping$0[accessibilityType.ordinal()]) {
            case 1:
            case 6:
                break;
            case 2:
                str = "android.widget.Button";
                break;
            case 3:
                str = "android.widget.EditText";
                break;
            case 4:
            case 11:
                str = "android.widget.TextView";
                break;
            case 5:
                str = "android.widget.ImageView";
                break;
            case 7:
                str = "androidx.viewpager.widget.ViewPager";
                break;
            case 8:
                str = "android.widget.SeekBar";
                break;
            case 9:
                str = "android.widget.Spinner";
                break;
            case 10:
                str = "android.widget.TabWidget";
                break;
            case 12:
                str = "android.widget.CheckBox";
                break;
            case 13:
                str = "android.widget.RadioButton";
                break;
            default:
                throw new m();
        }
        wVar.k0(str);
        if (AccessibilityType.HEADER == accessibilityType) {
            wVar.u0(true);
        }
    }
}
