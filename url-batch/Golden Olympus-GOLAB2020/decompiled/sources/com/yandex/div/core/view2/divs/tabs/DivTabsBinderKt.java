package com.yandex.div.core.view2.divs.tabs;

import O1.C0754c5;
import O1.C1013qd;
import O1.EnumC0791e6;
import O1.Yb;
import W1.m;
import com.yandex.div.core.font.DivTypefaceType;
import com.yandex.div.core.view2.divs.TextViewExtensionsKt;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.widget.tabs.TabView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class DivTabsBinderKt {

    @Metadata
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC0791e6.values().length];
            try {
                iArr[EnumC0791e6.MEDIUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0791e6.REGULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC0791e6.LIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC0791e6.BOLD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observe(C0754c5 c0754c5, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber, Function1<Object, Unit> function1) {
        expressionSubscriber.addSubscription(c0754c5.f5852c.observe(expressionResolver, function1));
        expressionSubscriber.addSubscription(c0754c5.f5853d.observe(expressionResolver, function1));
        expressionSubscriber.addSubscription(c0754c5.f5855f.observe(expressionResolver, function1));
        expressionSubscriber.addSubscription(c0754c5.f5850a.observe(expressionResolver, function1));
        function1.invoke(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeFixedHeightChange(List<C1013qd.c> list, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber, Function1<Object, Unit> function1) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Yb height = ((C1013qd.c) it.next()).f7643a.b().getHeight();
            if (height instanceof Yb.c) {
                Yb.c cVar = (Yb.c) height;
                expressionSubscriber.addSubscription(cVar.c().f4714a.observe(expressionResolver, function1));
                expressionSubscriber.addSubscription(cVar.c().f4715b.observe(expressionResolver, function1));
            }
        }
    }

    public static final void observeStyle(@NotNull TabView tabView, @NotNull C1013qd.e style, @NotNull ExpressionResolver resolver, @NotNull ExpressionSubscriber subscriber) {
        Intrinsics.checkNotNullParameter(tabView, "<this>");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        TextViewExtensionsKt.observeFontSize(tabView, style.f7679j, style.f7680k, null, null, resolver, subscriber);
        TextViewExtensionsKt.observeLetterSpacing(tabView, style.f7687r, style.f7679j, null, null, resolver, subscriber);
        TextViewExtensionsKt.observeLineHeight(tabView, style.f7688s, style.f7680k, null, null, resolver, subscriber);
        C0754c5 c0754c5 = style.f7689t;
        DivTabsBinderKt$observeStyle$applyTabPaddings$1 divTabsBinderKt$observeStyle$applyTabPaddings$1 = new DivTabsBinderKt$observeStyle$applyTabPaddings$1(c0754c5, tabView, resolver, tabView.getResources().getDisplayMetrics());
        subscriber.addSubscription(c0754c5.f5855f.observe(resolver, divTabsBinderKt$observeStyle$applyTabPaddings$1));
        subscriber.addSubscription(c0754c5.f5850a.observe(resolver, divTabsBinderKt$observeStyle$applyTabPaddings$1));
        Expression expression = c0754c5.f5854e;
        if (expression == null && c0754c5.f5851b == null) {
            subscriber.addSubscription(c0754c5.f5852c.observe(resolver, divTabsBinderKt$observeStyle$applyTabPaddings$1));
            subscriber.addSubscription(c0754c5.f5853d.observe(resolver, divTabsBinderKt$observeStyle$applyTabPaddings$1));
        } else {
            subscriber.addSubscription(expression != null ? expression.observe(resolver, divTabsBinderKt$observeStyle$applyTabPaddings$1) : null);
            Expression expression2 = c0754c5.f5851b;
            subscriber.addSubscription(expression2 != null ? expression2.observe(resolver, divTabsBinderKt$observeStyle$applyTabPaddings$1) : null);
        }
        divTabsBinderKt$observeStyle$applyTabPaddings$1.invoke((Object) null);
        Expression expression3 = style.f7684o;
        if (expression3 == null) {
            expression3 = style.f7681l;
        }
        observeStyle$addToSubscriber(expression3, subscriber, resolver, new DivTabsBinderKt$observeStyle$1(tabView));
        Expression expression4 = style.f7672c;
        if (expression4 == null) {
            expression4 = style.f7681l;
        }
        observeStyle$addToSubscriber(expression4, subscriber, resolver, new DivTabsBinderKt$observeStyle$2(tabView));
    }

    private static final void observeStyle$addToSubscriber(Expression<EnumC0791e6> expression, ExpressionSubscriber expressionSubscriber, ExpressionResolver expressionResolver, Function1<? super EnumC0791e6, Unit> function1) {
        expressionSubscriber.addSubscription(expression.observeAndGet(expressionResolver, function1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivTypefaceType toTypefaceType(EnumC0791e6 enumC0791e6) {
        int i4 = WhenMappings.$EnumSwitchMapping$0[enumC0791e6.ordinal()];
        if (i4 == 1) {
            return DivTypefaceType.MEDIUM;
        }
        if (i4 == 2) {
            return DivTypefaceType.REGULAR;
        }
        if (i4 == 3) {
            return DivTypefaceType.LIGHT;
        }
        if (i4 == 4) {
            return DivTypefaceType.BOLD;
        }
        throw new m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivTabsAdapter tryReuse(DivTabsAdapter divTabsAdapter, C1013qd c1013qd, ExpressionResolver expressionResolver) {
        if (divTabsAdapter != null && divTabsAdapter.isDynamicHeight() == ((Boolean) c1013qd.f7623j.evaluate(expressionResolver)).booleanValue()) {
            return divTabsAdapter;
        }
        return null;
    }
}
