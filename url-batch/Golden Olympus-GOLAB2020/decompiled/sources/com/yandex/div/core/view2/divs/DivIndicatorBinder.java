package com.yandex.div.core.view2.divs;

import O1.AbstractC0738b7;
import O1.C0720a7;
import O1.C0742bb;
import O1.E9;
import O1.EnumC0779dc;
import O1.InterfaceC0752c3;
import O1.Nb;
import O1.Qc;
import O1.S5;
import O1.Z;
import W1.m;
import android.util.DisplayMetrics;
import android.util.Log;
import com.yandex.div.core.util.DivTreeWalkKt;
import com.yandex.div.core.util.ExpressionSubscribersKt;
import com.yandex.div.core.util.SearchRoute;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.pager.PagerIndicatorConnector;
import com.yandex.div.core.view2.divs.widgets.DivPagerIndicatorView;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.widget.indicator.IndicatorParams$Animation;
import com.yandex.div.internal.widget.indicator.IndicatorParams$ItemPlacement;
import com.yandex.div.internal.widget.indicator.IndicatorParams$Shape;
import com.yandex.div.internal.widget.indicator.IndicatorParams$Style;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivIndicatorBinder extends DivViewBinder<Z.i, C0720a7, DivPagerIndicatorView> {

    @NotNull
    private final PagerIndicatorConnector pagerIndicatorConnector;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivIndicatorBinder(@NotNull DivBaseBinder baseBinder, @NotNull PagerIndicatorConnector pagerIndicatorConnector) {
        super(baseBinder);
        Intrinsics.checkNotNullParameter(baseBinder, "baseBinder");
        Intrinsics.checkNotNullParameter(pagerIndicatorConnector, "pagerIndicatorConnector");
        this.pagerIndicatorConnector = pagerIndicatorConnector;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x003f, code lost:
    
        if (r1 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0099, code lost:
    
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void applyStyle(DivPagerIndicatorView divPagerIndicatorView, ExpressionResolver expressionResolver, C0720a7 c0720a7) {
        IndicatorParams$Shape indicatorParams$Shape;
        IndicatorParams$Shape indicatorParamsShape;
        DivIndicatorBinder divIndicatorBinder;
        ExpressionResolver expressionResolver2;
        IndicatorParams$Shape multiply;
        DisplayMetrics metrics;
        ExpressionResolver expressionResolver3;
        DivIndicatorBinder divIndicatorBinder2;
        IndicatorParams$Shape indicatorParams$Shape2;
        IndicatorParams$Shape multiply$default;
        AbstractC0738b7 itemsPlacementCompat;
        IndicatorParams$ItemPlacement stretch;
        int i4;
        DisplayMetrics metrics2 = divPagerIndicatorView.getResources().getDisplayMetrics();
        C0742bb c0742bb = c0720a7.f5675d;
        C0742bb c0742bb2 = c0720a7.f5692u;
        C0742bb c0742bb3 = c0720a7.f5691t;
        float doubleValue = (float) ((Number) c0720a7.f5674c.evaluate(expressionResolver)).doubleValue();
        float doubleValue2 = (float) ((Number) c0720a7.f5696y.evaluate(expressionResolver)).doubleValue();
        if (c0742bb2 != null) {
            Intrinsics.checkNotNullExpressionValue(metrics2, "metrics");
            indicatorParams$Shape = toIndicatorParamsShape$default(this, c0742bb2, metrics2, expressionResolver, c0720a7.f5690s, 0.0f, 8, (Object) null);
        }
        if (c0742bb == null) {
            if (c0742bb3 != null) {
                Intrinsics.checkNotNullExpressionValue(metrics2, "metrics");
                indicatorParams$Shape = toIndicatorParamsShape(c0742bb3, metrics2, expressionResolver, c0720a7.f5690s, doubleValue2);
            } else {
                indicatorParams$Shape = null;
            }
            if (indicatorParams$Shape == null) {
                Nb nb = c0720a7.f5657E;
                Intrinsics.checkNotNullExpressionValue(metrics2, "metrics");
                indicatorParams$Shape = toIndicatorParamsShape$default(this, nb, metrics2, expressionResolver, c0720a7.f5690s, 0.0f, 8, (Object) null);
            }
            indicatorParamsShape = indicatorParams$Shape;
            if (c0742bb == null) {
            }
            multiply = divIndicatorBinder.multiply(indicatorParamsShape, doubleValue, (Integer) c0720a7.f5673b.evaluate(expressionResolver2));
            IndicatorParams$Shape indicatorParams$Shape3 = multiply;
            if (c0742bb3 == null) {
            }
            divIndicatorBinder2 = this;
            indicatorParams$Shape2 = indicatorParamsShape;
            multiply$default = multiply$default(divIndicatorBinder2, indicatorParams$Shape2, doubleValue2, null, 2, null);
            IndicatorParams$Animation convert = divIndicatorBinder2.convert((C0720a7.a) c0720a7.f5679h.evaluate(expressionResolver3));
            itemsPlacementCompat = BaseDivViewExtensionsKt.getItemsPlacementCompat(c0720a7);
            if (itemsPlacementCompat instanceof AbstractC0738b7.c) {
            }
            divPagerIndicatorView.setStyle(new IndicatorParams$Style(convert, indicatorParams$Shape3, indicatorParams$Shape2, multiply$default, stretch));
        }
        Intrinsics.checkNotNullExpressionValue(metrics2, "metrics");
        indicatorParamsShape = toIndicatorParamsShape(c0742bb, metrics2, expressionResolver, c0720a7.f5690s, 1 / doubleValue);
        if (c0742bb == null) {
            Intrinsics.checkNotNullExpressionValue(metrics2, "metrics");
            divIndicatorBinder = this;
            expressionResolver2 = expressionResolver;
            multiply = toIndicatorParamsShape$default(divIndicatorBinder, c0742bb, metrics2, expressionResolver2, c0720a7.f5673b, 0.0f, 8, (Object) null);
        } else {
            divIndicatorBinder = this;
            expressionResolver2 = expressionResolver;
        }
        multiply = divIndicatorBinder.multiply(indicatorParamsShape, doubleValue, (Integer) c0720a7.f5673b.evaluate(expressionResolver2));
        IndicatorParams$Shape indicatorParams$Shape32 = multiply;
        if (c0742bb3 == null) {
            Intrinsics.checkNotNullExpressionValue(metrics2, "metrics");
            IndicatorParams$Shape indicatorParamsShape$default = toIndicatorParamsShape$default(divIndicatorBinder, c0742bb3, metrics2, expressionResolver2, c0720a7.f5690s, 0.0f, 8, (Object) null);
            metrics = metrics2;
            expressionResolver3 = expressionResolver2;
            if (indicatorParamsShape$default != null) {
                divIndicatorBinder2 = this;
                multiply$default = indicatorParamsShape$default;
                indicatorParams$Shape2 = indicatorParamsShape;
                IndicatorParams$Animation convert2 = divIndicatorBinder2.convert((C0720a7.a) c0720a7.f5679h.evaluate(expressionResolver3));
                itemsPlacementCompat = BaseDivViewExtensionsKt.getItemsPlacementCompat(c0720a7);
                if (itemsPlacementCompat instanceof AbstractC0738b7.c) {
                    S5 s5 = ((AbstractC0738b7.c) itemsPlacementCompat).c().f2823a;
                    Intrinsics.checkNotNullExpressionValue(metrics, "metrics");
                    stretch = new IndicatorParams$ItemPlacement.Default(BaseDivViewExtensionsKt.toPx(s5, metrics, expressionResolver3));
                } else {
                    if (!(itemsPlacementCompat instanceof AbstractC0738b7.d)) {
                        throw new m();
                    }
                    AbstractC0738b7.d dVar = (AbstractC0738b7.d) itemsPlacementCompat;
                    S5 s52 = dVar.c().f3900a;
                    Intrinsics.checkNotNullExpressionValue(metrics, "metrics");
                    float px = BaseDivViewExtensionsKt.toPx(s52, metrics, expressionResolver3);
                    long longValue = ((Number) dVar.c().f3901b.evaluate(expressionResolver3)).longValue();
                    long j4 = longValue >> 31;
                    if (j4 == 0 || j4 == -1) {
                        i4 = (int) longValue;
                    } else {
                        KAssert kAssert = KAssert.INSTANCE;
                        if (Assert.isEnabled()) {
                            Assert.fail("Unable convert '" + longValue + "' to Int");
                        }
                        i4 = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                    }
                    stretch = new IndicatorParams$ItemPlacement.Stretch(px, i4);
                }
                divPagerIndicatorView.setStyle(new IndicatorParams$Style(convert2, indicatorParams$Shape32, indicatorParams$Shape2, multiply$default, stretch));
            }
        } else {
            metrics = metrics2;
            expressionResolver3 = expressionResolver2;
        }
        divIndicatorBinder2 = this;
        indicatorParams$Shape2 = indicatorParamsShape;
        multiply$default = multiply$default(divIndicatorBinder2, indicatorParams$Shape2, doubleValue2, null, 2, null);
        IndicatorParams$Animation convert22 = divIndicatorBinder2.convert((C0720a7.a) c0720a7.f5679h.evaluate(expressionResolver3));
        itemsPlacementCompat = BaseDivViewExtensionsKt.getItemsPlacementCompat(c0720a7);
        if (itemsPlacementCompat instanceof AbstractC0738b7.c) {
        }
        divPagerIndicatorView.setStyle(new IndicatorParams$Style(convert22, indicatorParams$Shape32, indicatorParams$Shape2, multiply$default, stretch));
    }

    private final IndicatorParams$Shape multiply(IndicatorParams$Shape indicatorParams$Shape, float f4, Integer num) {
        if (indicatorParams$Shape instanceof IndicatorParams$Shape.RoundedRect) {
            int intValue = num != null ? num.intValue() : indicatorParams$Shape.getColor();
            IndicatorParams$Shape.RoundedRect roundedRect = (IndicatorParams$Shape.RoundedRect) indicatorParams$Shape;
            return BaseDivViewExtensionsKt.createRoundedRectangle(intValue, roundedRect.getItemSize().getItemWidth(), roundedRect.getItemSize().getItemHeight(), roundedRect.getItemSize().getCornerRadius(), f4, Float.valueOf(roundedRect.getStrokeWidth()), Integer.valueOf(roundedRect.getStrokeColor()));
        }
        if (indicatorParams$Shape instanceof IndicatorParams$Shape.Circle) {
            return BaseDivViewExtensionsKt.createCircle(num != null ? num.intValue() : indicatorParams$Shape.getColor(), ((IndicatorParams$Shape.Circle) indicatorParams$Shape).getItemSize().getRadius(), f4);
        }
        throw new m();
    }

    static /* synthetic */ IndicatorParams$Shape multiply$default(DivIndicatorBinder divIndicatorBinder, IndicatorParams$Shape indicatorParams$Shape, float f4, Integer num, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            num = null;
        }
        return divIndicatorBinder.multiply(indicatorParams$Shape, f4, num);
    }

    private final void observeWidthAndHeightSubscription(DivPagerIndicatorView divPagerIndicatorView, InterfaceC0752c3 interfaceC0752c3, ExpressionResolver expressionResolver, Function1<Object, Unit> function1) {
        Object b4 = interfaceC0752c3.getWidth().b();
        if (b4 instanceof S5) {
            ExpressionSubscribersKt.observeFixedSize(divPagerIndicatorView, (S5) b4, expressionResolver, function1);
        }
        Object b5 = interfaceC0752c3.getHeight().b();
        if (b5 instanceof S5) {
            ExpressionSubscribersKt.observeFixedSize(divPagerIndicatorView, (S5) b5, expressionResolver, function1);
        }
    }

    private final IndicatorParams$Shape toIndicatorParamsShape(C0742bb c0742bb, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver, Expression<Integer> expression, float f4) {
        EnumC0779dc enumC0779dc;
        Expression expression2;
        Expression expression3;
        Expression expression4;
        Qc qc = c0742bb.f5812e;
        if (qc == null || (expression4 = qc.f4478c) == null || (enumC0779dc = (EnumC0779dc) expression4.evaluate(expressionResolver)) == null) {
            enumC0779dc = EnumC0779dc.DP;
        }
        Qc qc2 = c0742bb.f5812e;
        Integer num = null;
        Integer valueOf = (qc2 == null || (expression3 = qc2.f4479d) == null) ? null : Integer.valueOf(BaseDivViewExtensionsKt.unitToPx(Double.valueOf(((Number) expression3.evaluate(expressionResolver)).doubleValue()), displayMetrics, enumC0779dc));
        Expression<Integer> expression5 = c0742bb.f5808a;
        if (expression5 != null) {
            expression = expression5;
        }
        int intValue = expression.evaluate(expressionResolver).intValue();
        float pxF = BaseDivViewExtensionsKt.toPxF(c0742bb.f5811d, displayMetrics, expressionResolver);
        float pxF2 = BaseDivViewExtensionsKt.toPxF(c0742bb.f5810c, displayMetrics, expressionResolver);
        float pxF3 = BaseDivViewExtensionsKt.toPxF(c0742bb.f5809b, displayMetrics, expressionResolver);
        Float valueOf2 = valueOf != null ? Float.valueOf(valueOf.intValue()) : null;
        Qc qc3 = c0742bb.f5812e;
        if (qc3 != null && (expression2 = qc3.f4476a) != null) {
            num = (Integer) expression2.evaluate(expressionResolver);
        }
        return BaseDivViewExtensionsKt.createRoundedRectangle(intValue, pxF, pxF2, pxF3, f4, valueOf2, num);
    }

    static /* synthetic */ IndicatorParams$Shape toIndicatorParamsShape$default(DivIndicatorBinder divIndicatorBinder, C0742bb c0742bb, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver, Expression expression, float f4, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            f4 = 1.0f;
        }
        return divIndicatorBinder.toIndicatorParamsShape(c0742bb, displayMetrics, expressionResolver, (Expression<Integer>) expression, f4);
    }

    public void bindView(@NotNull BindingContext context, @NotNull DivPagerIndicatorView view, @NotNull Z.i div) {
        InterfaceC0752c3 interfaceC0752c3;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(div, "div");
        Z rootDiv$div_release = context.getDivView().rootDiv$div_release();
        if (rootDiv$div_release != null) {
            ExpressionResolver expressionResolver = context.getExpressionResolver();
            InterfaceC0752c3 b4 = div.b();
            G g4 = new G();
            ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator withIndex = CollectionsKt.withIndex(DivTreeWalkKt.walk(rootDiv$div_release, expressionResolver).onEnter(new DivIndicatorBinder$bindView$lambda$2$$inlined$findNearest$1(arrayList, g4)).onLeave(new DivIndicatorBinder$bindView$lambda$2$$inlined$findNearest$2(arrayList, g4)).iterator());
            while (true) {
                interfaceC0752c3 = null;
                if (!withIndex.hasNext()) {
                    break;
                }
                InterfaceC0752c3 b5 = ((DivItemBuilderResult) ((IndexedValue) withIndex.next()).b()).getDiv().b();
                if (b5 == b4) {
                    int size = arrayList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj = arrayList.get(i4);
                        i4++;
                        SearchRoute searchRoute = (SearchRoute) obj;
                        if (((InterfaceC0752c3) searchRoute.getItem()) != null) {
                            linkedHashMap.put(searchRoute.getItem(), Integer.valueOf(searchRoute.distance()));
                        }
                    }
                    arrayList.clear();
                    g4.f41132b = new SearchRoute(null);
                }
                if (b5 instanceof E9) {
                    E9 e9 = (E9) b5;
                    if (div.c().f5653A == null || Intrinsics.areEqual(e9.getId(), div.c().f5653A)) {
                        Object obj2 = g4.f41132b;
                        if (obj2 != null) {
                            linkedHashMap.put(b5, Integer.valueOf(((SearchRoute) obj2).distance()));
                        } else {
                            arrayList.add(new SearchRoute(b5));
                        }
                    }
                }
            }
            Integer num = (Integer) CollectionsKt.minOrNull((Iterable) linkedHashMap.values());
            if (num != null) {
                int intValue = num.intValue();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (((Number) entry.getValue()).intValue() == intValue) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                Set keySet = linkedHashMap2.keySet();
                if (!keySet.isEmpty()) {
                    if (keySet.size() > 1) {
                        Log.w("SearchUtil", "Distance clash when searching for the nearest " + H.b(E9.class).e() + ". First found is taken");
                    }
                    interfaceC0752c3 = (InterfaceC0752c3) CollectionsKt.first(keySet);
                }
            }
            E9 e92 = (E9) interfaceC0752c3;
            if (e92 != null) {
                this.pagerIndicatorConnector.submitIndicator$div_release(view, e92);
            }
        }
        super.bindView(context, (BindingContext) view, (DivPagerIndicatorView) div);
    }

    @NotNull
    public final IndicatorParams$Animation convert(@NotNull C0720a7.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return aVar == C0720a7.a.WORM ? IndicatorParams$Animation.WORM : aVar == C0720a7.a.SLIDER ? IndicatorParams$Animation.SLIDER : IndicatorParams$Animation.SCALE;
    }

    static /* synthetic */ IndicatorParams$Shape toIndicatorParamsShape$default(DivIndicatorBinder divIndicatorBinder, Nb nb, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver, Expression expression, float f4, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            f4 = 1.0f;
        }
        return divIndicatorBinder.toIndicatorParamsShape(nb, displayMetrics, expressionResolver, (Expression<Integer>) expression, f4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(@NotNull DivPagerIndicatorView divPagerIndicatorView, @NotNull BindingContext bindingContext, @NotNull C0720a7 div, @Nullable C0720a7 c0720a7) {
        Intrinsics.checkNotNullParameter(divPagerIndicatorView, "<this>");
        Intrinsics.checkNotNullParameter(bindingContext, "bindingContext");
        Intrinsics.checkNotNullParameter(div, "div");
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        applyStyle(divPagerIndicatorView, expressionResolver, div);
        DivIndicatorBinder$bind$callback$1 divIndicatorBinder$bind$callback$1 = new DivIndicatorBinder$bind$callback$1(this, divPagerIndicatorView, expressionResolver, div);
        divPagerIndicatorView.addSubscription(div.f5679h.observe(expressionResolver, divIndicatorBinder$bind$callback$1));
        divPagerIndicatorView.addSubscription(div.f5673b.observe(expressionResolver, divIndicatorBinder$bind$callback$1));
        divPagerIndicatorView.addSubscription(div.f5674c.observe(expressionResolver, divIndicatorBinder$bind$callback$1));
        divPagerIndicatorView.addSubscription(div.f5690s.observe(expressionResolver, divIndicatorBinder$bind$callback$1));
        divPagerIndicatorView.addSubscription(div.f5696y.observe(expressionResolver, divIndicatorBinder$bind$callback$1));
        ExpressionSubscribersKt.observeShape(divPagerIndicatorView, div.f5657E, expressionResolver, divIndicatorBinder$bind$callback$1);
        ExpressionSubscribersKt.observeRoundedRectangleShape(divPagerIndicatorView, div.f5675d, expressionResolver, divIndicatorBinder$bind$callback$1);
        ExpressionSubscribersKt.observeRoundedRectangleShape(divPagerIndicatorView, div.f5692u, expressionResolver, divIndicatorBinder$bind$callback$1);
        ExpressionSubscribersKt.observeRoundedRectangleShape(divPagerIndicatorView, div.f5691t, expressionResolver, divIndicatorBinder$bind$callback$1);
        AbstractC0738b7 itemsPlacementCompat = BaseDivViewExtensionsKt.getItemsPlacementCompat(div);
        if (itemsPlacementCompat instanceof AbstractC0738b7.c) {
            AbstractC0738b7.c cVar = (AbstractC0738b7.c) itemsPlacementCompat;
            divPagerIndicatorView.addSubscription(cVar.c().f2823a.f4715b.observe(expressionResolver, divIndicatorBinder$bind$callback$1));
            divPagerIndicatorView.addSubscription(cVar.c().f2823a.f4714a.observe(expressionResolver, divIndicatorBinder$bind$callback$1));
        } else if (itemsPlacementCompat instanceof AbstractC0738b7.d) {
            AbstractC0738b7.d dVar = (AbstractC0738b7.d) itemsPlacementCompat;
            divPagerIndicatorView.addSubscription(dVar.c().f3900a.f4715b.observe(expressionResolver, divIndicatorBinder$bind$callback$1));
            divPagerIndicatorView.addSubscription(dVar.c().f3900a.f4714a.observe(expressionResolver, divIndicatorBinder$bind$callback$1));
            divPagerIndicatorView.addSubscription(dVar.c().f3901b.observe(expressionResolver, divIndicatorBinder$bind$callback$1));
        }
        observeWidthAndHeightSubscription(divPagerIndicatorView, div, expressionResolver, divIndicatorBinder$bind$callback$1);
    }

    private final IndicatorParams$Shape toIndicatorParamsShape(Nb nb, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver, Expression<Integer> expression, float f4) {
        if (nb instanceof Nb.d) {
            return toIndicatorParamsShape(((Nb.d) nb).c(), displayMetrics, expressionResolver, expression, f4);
        }
        if (!(nb instanceof Nb.a)) {
            throw new m();
        }
        return BaseDivViewExtensionsKt.createCircle(expression.evaluate(expressionResolver).intValue(), BaseDivViewExtensionsKt.toPxF(((Nb.a) nb).c().f1303b, displayMetrics, expressionResolver), f4);
    }
}
