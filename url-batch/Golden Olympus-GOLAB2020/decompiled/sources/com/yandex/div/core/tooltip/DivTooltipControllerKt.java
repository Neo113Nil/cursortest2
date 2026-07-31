package com.yandex.div.core.tooltip;

import O1.C1081ua;
import O1.J4;
import O1.Se;
import O1.Ve;
import W1.m;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.activity.v;
import androidx.core.view.AbstractC1293g0;
import com.yandex.div.R$id;
import com.yandex.div.core.util.AccessibilityStateProvider;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class DivTooltipControllerKt {

    @Metadata
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Se.c.values().length];
            try {
                iArr[Se.c.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Se.c.TOP_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Se.c.BOTTOM_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Se.c.TOP_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Se.c.RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Se.c.BOTTOM_RIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Se.c.TOP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Se.c.BOTTOM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Se.c.CENTER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final Point calcPopupLocation(@NotNull View popupView, @NotNull View anchor, @NotNull Se divTooltip, @NotNull ExpressionResolver resolver) {
        int i4;
        int height;
        int i5;
        J4 j4;
        J4 j42;
        Intrinsics.checkNotNullParameter(popupView, "popupView");
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        Intrinsics.checkNotNullParameter(divTooltip, "divTooltip");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        int[] iArr = new int[2];
        anchor.getLocationInWindow(iArr);
        int i6 = 0;
        Point point = new Point(iArr[0], iArr[1]);
        Se.c cVar = (Se.c) divTooltip.f4821j.evaluate(resolver);
        int i7 = point.x;
        int[] iArr2 = WhenMappings.$EnumSwitchMapping$0;
        switch (iArr2[cVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
                i4 = -popupView.getWidth();
                break;
            case 4:
            case 5:
            case 6:
                i4 = anchor.getWidth();
                break;
            case 7:
            case 8:
            case 9:
                i4 = (anchor.getWidth() - popupView.getWidth()) / 2;
                break;
            default:
                throw new m();
        }
        point.x = i7 + i4;
        int i8 = point.y;
        switch (iArr2[cVar.ordinal()]) {
            case 1:
            case 5:
            case 9:
                height = (anchor.getHeight() - popupView.getHeight()) / 2;
                break;
            case 2:
            case 4:
            case 7:
                height = -popupView.getHeight();
                break;
            case 3:
            case 6:
            case 8:
                height = anchor.getHeight();
                break;
            default:
                throw new m();
        }
        point.y = i8 + height;
        DisplayMetrics displayMetrics = anchor.getResources().getDisplayMetrics();
        int i9 = point.x;
        C1081ua c1081ua = divTooltip.f4820i;
        if (c1081ua == null || (j42 = c1081ua.f8167a) == null) {
            i5 = 0;
        } else {
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "displayMetrics");
            i5 = BaseDivViewExtensionsKt.toPx(j42, displayMetrics, resolver);
        }
        point.x = i9 + i5;
        int i10 = point.y;
        C1081ua c1081ua2 = divTooltip.f4820i;
        if (c1081ua2 != null && (j4 = c1081ua2.f8168b) != null) {
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "displayMetrics");
            i6 = BaseDivViewExtensionsKt.toPx(j4, displayMetrics, resolver);
        }
        point.y = i10 + i6;
        return point;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair<Se, View> findChildWithTooltip(String str, View view) {
        Object tag = view.getTag(R$id.div_tooltips_tag);
        List<Se> list = tag instanceof List ? (List) tag : null;
        if (list != null) {
            for (Se se : list) {
                if (Intrinsics.areEqual(se.f4818g, str)) {
                    return TuplesKt.to(se, view);
                }
            }
        }
        if (view instanceof ViewGroup) {
            Iterator it = AbstractC1293g0.b((ViewGroup) view).iterator();
            while (it.hasNext()) {
                Pair<Se, View> findChildWithTooltip = findChildWithTooltip(str, (View) it.next());
                if (findChildWithTooltip != null) {
                    return findChildWithTooltip;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect getWindowFrame(Div2View div2View) {
        Rect rect = new Rect();
        div2View.getWindowVisibleDisplayFrame(rect);
        return rect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isModal(Se se) {
        return se.f4819h instanceof Ve.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeBackPressedCallback(PopupWindow popupWindow, TooltipData tooltipData, AccessibilityStateProvider accessibilityStateProvider) {
        BaseDivViewExtensionsKt.sendAccessibilityEventUnchecked(32, popupWindow.getContentView(), accessibilityStateProvider);
        v onBackPressedCallback = tooltipData.getOnBackPressedCallback();
        if (onBackPressedCallback == null) {
            return;
        }
        onBackPressedCallback.setEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldDismissByOutsideTouch(Se se, ExpressionResolver expressionResolver) {
        return ((Boolean) se.f4815d.evaluate(expressionResolver)).booleanValue();
    }
}
