package com.yandex.div.core.view2;

import O1.AbstractC1092v3;
import O1.C0797ec;
import O1.EnumC1163z2;
import O1.J4;
import O1.O2;
import W1.m;
import android.content.Context;
import android.util.DisplayMetrics;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.view2.animations.Fade;
import com.yandex.div.core.view2.animations.Scale;
import com.yandex.div.core.view2.animations.Slide;
import com.yandex.div.core.view2.animations.TransitionsKt;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k0.AbstractC3204l;
import k0.C3195c;
import k0.C3208p;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public class DivTransitionBuilder {

    @NotNull
    private final Context context;

    @NotNull
    private final DivViewIdProvider viewIdProvider;

    @Metadata
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[C0797ec.c.values().length];
            try {
                iArr[C0797ec.c.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C0797ec.c.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C0797ec.c.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C0797ec.c.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DivTransitionBuilder(@NotNull Context context, @NotNull DivViewIdProvider viewIdProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewIdProvider, "viewIdProvider");
        this.context = context;
        this.viewIdProvider = viewIdProvider;
    }

    private List<AbstractC3204l> buildChangeTransitions(Sequence<DivItemBuilderResult> sequence, ExpressionResolver expressionResolver) {
        ArrayList arrayList = new ArrayList();
        for (DivItemBuilderResult divItemBuilderResult : sequence) {
            String id = divItemBuilderResult.getDiv().b().getId();
            AbstractC1092v3 z4 = divItemBuilderResult.getDiv().b().z();
            if (id != null && z4 != null) {
                AbstractC3204l androidTransition = toAndroidTransition(z4, expressionResolver);
                androidTransition.addTarget(this.viewIdProvider.getViewId(id));
                arrayList.add(androidTransition);
            }
        }
        return arrayList;
    }

    private List<AbstractC3204l> buildIncomingTransitions(Sequence<DivItemBuilderResult> sequence, ExpressionResolver expressionResolver) {
        ArrayList arrayList = new ArrayList();
        for (DivItemBuilderResult divItemBuilderResult : sequence) {
            String id = divItemBuilderResult.getDiv().b().getId();
            O2 t4 = divItemBuilderResult.getDiv().b().t();
            if (id != null && t4 != null) {
                AbstractC3204l androidTransition = toAndroidTransition(t4, 1, expressionResolver);
                androidTransition.addTarget(this.viewIdProvider.getViewId(id));
                arrayList.add(androidTransition);
            }
        }
        return arrayList;
    }

    private List<AbstractC3204l> buildOutgoingTransitions(Sequence<DivItemBuilderResult> sequence, ExpressionResolver expressionResolver) {
        ArrayList arrayList = new ArrayList();
        for (DivItemBuilderResult divItemBuilderResult : sequence) {
            String id = divItemBuilderResult.getDiv().b().getId();
            O2 y4 = divItemBuilderResult.getDiv().b().y();
            if (id != null && y4 != null) {
                AbstractC3204l androidTransition = toAndroidTransition(y4, 2, expressionResolver);
                androidTransition.addTarget(this.viewIdProvider.getViewId(id));
                arrayList.add(androidTransition);
            }
        }
        return arrayList;
    }

    private DisplayMetrics getDisplayMetrics() {
        DisplayMetrics displayMetrics = this.context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "context.resources.displayMetrics");
        return displayMetrics;
    }

    private AbstractC3204l toAndroidTransition(O2 o22, int i4, ExpressionResolver expressionResolver) {
        if (o22 instanceof O2.e) {
            C3208p c3208p = new C3208p();
            Iterator it = ((O2.e) o22).c().f3372a.iterator();
            while (it.hasNext()) {
                AbstractC3204l androidTransition = toAndroidTransition((O2) it.next(), i4, expressionResolver);
                c3208p.setDuration(Math.max(c3208p.getDuration(), androidTransition.getStartDelay() + androidTransition.getDuration()));
                c3208p.p(androidTransition);
            }
            return c3208p;
        }
        if (o22 instanceof O2.c) {
            O2.c cVar = (O2.c) o22;
            Fade fade = new Fade((float) ((Number) cVar.c().f7772a.evaluate(expressionResolver)).doubleValue());
            fade.setMode(i4);
            fade.setDuration(((Number) cVar.c().b().evaluate(expressionResolver)).longValue());
            fade.setStartDelay(((Number) cVar.c().d().evaluate(expressionResolver)).longValue());
            fade.setInterpolator(DivUtilKt.getAndroidInterpolator((EnumC1163z2) cVar.c().c().evaluate(expressionResolver)));
            return fade;
        }
        if (o22 instanceof O2.d) {
            O2.d dVar = (O2.d) o22;
            Scale scale = new Scale((float) ((Number) dVar.c().f6111e.evaluate(expressionResolver)).doubleValue(), (float) ((Number) dVar.c().f6109c.evaluate(expressionResolver)).doubleValue(), (float) ((Number) dVar.c().f6110d.evaluate(expressionResolver)).doubleValue());
            scale.setMode(i4);
            scale.setDuration(((Number) dVar.c().b().evaluate(expressionResolver)).longValue());
            scale.setStartDelay(((Number) dVar.c().d().evaluate(expressionResolver)).longValue());
            scale.setInterpolator(DivUtilKt.getAndroidInterpolator((EnumC1163z2) dVar.c().c().evaluate(expressionResolver)));
            return scale;
        }
        if (!(o22 instanceof O2.f)) {
            throw new m();
        }
        O2.f fVar = (O2.f) o22;
        J4 j4 = fVar.c().f6121a;
        Slide slide = new Slide(j4 != null ? BaseDivViewExtensionsKt.toPx(j4, getDisplayMetrics(), expressionResolver) : -1, toGravity((C0797ec.c) fVar.c().f6123c.evaluate(expressionResolver)));
        slide.setMode(i4);
        slide.setDuration(((Number) fVar.c().b().evaluate(expressionResolver)).longValue());
        slide.setStartDelay(((Number) fVar.c().d().evaluate(expressionResolver)).longValue());
        slide.setInterpolator(DivUtilKt.getAndroidInterpolator((EnumC1163z2) fVar.c().c().evaluate(expressionResolver)));
        return slide;
    }

    private int toGravity(C0797ec.c cVar) {
        int i4 = WhenMappings.$EnumSwitchMapping$0[cVar.ordinal()];
        if (i4 == 1) {
            return 3;
        }
        if (i4 == 2) {
            return 48;
        }
        if (i4 == 3) {
            return 5;
        }
        if (i4 == 4) {
            return 80;
        }
        throw new m();
    }

    @NotNull
    public C3208p buildTransitions(@Nullable Sequence<DivItemBuilderResult> sequence, @Nullable Sequence<DivItemBuilderResult> sequence2, @NotNull ExpressionResolver fromResolver, @NotNull ExpressionResolver toResolver) {
        Intrinsics.checkNotNullParameter(fromResolver, "fromResolver");
        Intrinsics.checkNotNullParameter(toResolver, "toResolver");
        C3208p c3208p = new C3208p();
        c3208p.x(0);
        if (sequence != null) {
            TransitionsKt.plusAssign(c3208p, buildOutgoingTransitions(sequence, fromResolver));
        }
        if (sequence != null && sequence2 != null) {
            TransitionsKt.plusAssign(c3208p, buildChangeTransitions(sequence, fromResolver));
        }
        if (sequence2 != null) {
            TransitionsKt.plusAssign(c3208p, buildIncomingTransitions(sequence2, toResolver));
        }
        return c3208p;
    }

    @Nullable
    public AbstractC3204l createAndroidTransition(@Nullable O2 o22, int i4, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        if (o22 == null) {
            return null;
        }
        return toAndroidTransition(o22, i4, resolver);
    }

    private AbstractC3204l toAndroidTransition(AbstractC1092v3 abstractC1092v3, ExpressionResolver expressionResolver) {
        if (abstractC1092v3 instanceof AbstractC1092v3.d) {
            C3208p c3208p = new C3208p();
            Iterator it = ((AbstractC1092v3.d) abstractC1092v3).c().f7757a.iterator();
            while (it.hasNext()) {
                c3208p.p(toAndroidTransition((AbstractC1092v3) it.next(), expressionResolver));
            }
            return c3208p;
        }
        if (abstractC1092v3 instanceof AbstractC1092v3.a) {
            C3195c c3195c = new C3195c();
            AbstractC1092v3.a aVar = (AbstractC1092v3.a) abstractC1092v3;
            c3195c.setDuration(((Number) aVar.c().b().evaluate(expressionResolver)).longValue());
            c3195c.setStartDelay(((Number) aVar.c().d().evaluate(expressionResolver)).longValue());
            c3195c.setInterpolator(DivUtilKt.getAndroidInterpolator((EnumC1163z2) aVar.c().c().evaluate(expressionResolver)));
            return c3195c;
        }
        throw new m();
    }
}
