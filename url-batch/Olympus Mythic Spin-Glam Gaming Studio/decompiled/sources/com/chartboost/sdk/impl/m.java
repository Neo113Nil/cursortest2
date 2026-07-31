package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.graphics.Insets;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.events.ChartboostError;
import com.chartboost.sdk.impl.i4;
import com.chartboost.sdk.impl.u9;
import com.chartboost.sdk.impl.wf;
import com.chartboost.sdk.internal.interruption.InterruptionController;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes9.dex */
public final class m extends FrameLayout implements jb, c7, a1, zf {
    public final od a;
    public l b;
    public final u c;
    public final Mediation d;
    public final g6 e;
    public final dh f;
    public View g;
    public boolean h;
    public boolean i;
    public GestureDetector j;
    public boolean k;
    public ImageView l;
    public Float m;
    public Float n;
    public final t5 o;
    public final w0 p;
    public dg q;
    public final CoroutineScope r;
    public Job s;
    public Job t;
    public long u;
    public long v;
    public Job w;
    public long x;
    public long y;

    public static final class b extends SuspendLambda implements Function2 {
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ long d;
        public final /* synthetic */ m e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, m mVar, Continuation continuation) {
            super(2, continuation);
            this.d = j;
            this.e = mVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = new b(this.d, this.e, continuation);
            bVar.c = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.c;
                long j = this.d;
                this.c = coroutineScope2;
                this.b = 1;
                if (DelayKt.delay(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                coroutineScope = coroutineScope2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.c;
                ResultKt.throwOnFailure(obj);
            }
            if (CoroutineScopeKt.isActive(coroutineScope)) {
                this.e.c(false);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class c extends SuspendLambda implements Function2 {
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ long d;
        public final /* synthetic */ m e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j, m mVar, Continuation continuation) {
            super(2, continuation);
            this.d = j;
            this.e = mVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            c cVar = new c(this.d, this.e, continuation);
            cVar.c = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Unit unit;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.c;
                long j = this.d;
                this.c = coroutineScope2;
                this.b = 1;
                if (DelayKt.delay(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                coroutineScope = coroutineScope2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.c;
                ResultKt.throwOnFailure(obj);
            }
            if (CoroutineScopeKt.isActive(coroutineScope) && !this.e.k) {
                this.e.k = true;
                this.e.p.k();
                l adContainerListener$ChartboostMonetization_9_12_1_productionRelease = this.e.getAdContainerListener$ChartboostMonetization_9_12_1_productionRelease();
                if (adContainerListener$ChartboostMonetization_9_12_1_productionRelease != null) {
                    adContainerListener$ChartboostMonetization_9_12_1_productionRelease.d();
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    xb.e("AdContainerListener null when onAdRewarded()", null, 2, null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class d extends SuspendLambda implements Function2 {
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ long d;
        public final /* synthetic */ m e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j, m mVar, Continuation continuation) {
            super(2, continuation);
            this.d = j;
            this.e = mVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            d dVar = new d(this.d, this.e, continuation);
            dVar.c = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.c;
                long j = this.d * 1000;
                this.c = coroutineScope2;
                this.b = 1;
                if (DelayKt.delay(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                coroutineScope = coroutineScope2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.c;
                ResultKt.throwOnFailure(obj);
            }
            if (CoroutineScopeKt.isActive(coroutineScope) && this.e.p.e()) {
                this.e.p.a(z0.f, true);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, od multiRenderable, l lVar, u adFormat, Mediation mediation, g6 densityProvider, dh sharedPrefsHelper) {
        super(context);
        Object obj;
        List<Object> w;
        il b2;
        il b3;
        nj o;
        wf w2;
        nj o2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(multiRenderable, "multiRenderable");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(densityProvider, "densityProvider");
        Intrinsics.checkNotNullParameter(sharedPrefsHelper, "sharedPrefsHelper");
        this.a = multiRenderable;
        this.b = lVar;
        this.c = adFormat;
        this.d = mediation;
        this.e = densityProvider;
        this.f = sharedPrefsHelper;
        Iterator it = multiRenderable.w().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            nj o3 = ((m2) obj).w().o();
            if ((o3 != null ? o3.a() : null) != null) {
                break;
            }
        }
        m2 m2Var = (m2) obj;
        t5 a2 = (m2Var == null || (w2 = m2Var.w()) == null || (o2 = w2.o()) == null) ? null : o2.a();
        this.o = a2;
        w0 w0Var = new w0(context, a2, this.c, this.a.q(), this.d);
        this.p = w0Var;
        this.r = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().plus(SupervisorKt.SupervisorJob$default(null, 1, null)));
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setBackgroundColor(-16777216);
        addView(w0Var, new FrameLayout.LayoutParams(-1, -1));
        InterruptionController interruptionController = InterruptionController.a;
        interruptionController.a((jb) this);
        interruptionController.a((c7) this);
        w0Var.setAdViewOverlayListener(this);
        this.a.a(this);
        View k = this.a.k();
        if (k != null) {
            a(k);
        }
        t();
        m2 t = this.a.t();
        if (t != null && ((o = t.w().o()) == null || o.f())) {
            a(this, this, false, 2, null);
        }
        for (Object obj2 : this.a.w()) {
            if (obj2 instanceof pj) {
                od z = ((pj) obj2).z();
                if (z != null && (w = z.w()) != null) {
                    for (Object obj3 : w) {
                        if ((obj3 instanceof hl) && (b2 = ((hl) obj3).b()) != null) {
                            this.p.a(b2);
                        }
                    }
                }
            } else if ((obj2 instanceof hl) && (b3 = ((hl) obj2).b()) != null) {
                this.p.a(b3);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Logger.d("Chartboost|SafeDK: Execution> Lcom/chartboost/sdk/impl/m;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z");
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.c, this, motionEvent);
        return safedk_m_dispatchTouchEvent_b9b0c7f702de5cee2a5fea9339e61183(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        GestureDetector gestureDetector = this.j;
        return gestureDetector != null ? gestureDetector.onTouchEvent(event) : super.onTouchEvent(event);
    }

    public boolean safedk_m_dispatchTouchEvent_b9b0c7f702de5cee2a5fea9339e61183(MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        if (ev.getAction() == 0) {
            if (this.g != null) {
                this.m = Float.valueOf(ev.getX() - r0.getLeft());
                this.n = Float.valueOf(ev.getY() - r0.getTop());
            } else {
                this.m = Float.valueOf(ev.getX());
                this.n = Float.valueOf(ev.getY());
            }
        }
        return super.dispatchTouchEvent(ev);
    }

    @Nullable
    public final l getAdContainerListener$ChartboostMonetization_9_12_1_productionRelease() {
        return this.b;
    }

    public final void setAdContainerListener$ChartboostMonetization_9_12_1_productionRelease(@Nullable l lVar) {
        this.b = lVar;
    }

    @Nullable
    public final dg getRenderingContainerCalculator() {
        return this.q;
    }

    public final void setRenderingContainerCalculator(@Nullable dg dgVar) {
        this.q = dgVar;
        y();
    }

    public final boolean l() {
        return this.a.t() instanceof rl;
    }

    public final void t() {
        a0 q;
        wf w;
        m2 t = this.a.t();
        if (t != null && (w = t.w()) != null) {
            w.g();
        }
        m2 t2 = this.a.t();
        if (t2 == null || (q = t2.q()) == null) {
            q = this.a.q();
        }
        ab g = q.g();
        q2 j = q.j();
        if (j == null) {
            j = q2.d.a();
        }
        w0 w0Var = this.p;
        y0 y0Var = y0.d;
        x0 x0Var = new x0(j.e().b(), j.e().a());
        x0 x0Var2 = new x0(j.f().b(), j.f().a());
        x0 x0Var3 = new x0(j.g().b(), j.g().a());
        String b2 = g.b();
        if (b2 == null) {
            b2 = "";
        }
        String str = b2;
        String a2 = g.a();
        if (a2 == null) {
            a2 = "https://docs.chartboost.com/opt-out";
        }
        w0Var.a(true, y0Var, x0Var, x0Var2, x0Var3, str, a2, (r19 & 128) != 0 ? false : false);
        w0 w0Var2 = this.p;
        z0 z0Var = z0.c;
        w0Var2.a(z0Var, false);
        this.p.a(z0.f, false);
        w0 w0Var3 = this.p;
        z0 z0Var2 = z0.e;
        w0Var3.a(z0Var2, false);
        w0 w0Var4 = this.p;
        z0 z0Var3 = z0.d;
        w0Var4.a(z0Var3, false);
        this.p.a(z0.g, false);
        if (this.c == u.b) {
            return;
        }
        long s = this.a.s();
        long h = this.a.h();
        boolean z = h > 0 && !(this.a.t() instanceof rl);
        if (s > 0 && z) {
            s = Math.min(s, h);
        } else if (s <= 0) {
            s = h;
        }
        boolean z2 = s > 0;
        if (!this.p.e()) {
            if (z2) {
                this.p.setTimer(s * 1000);
            } else if (this.a.i()) {
                this.p.a(z0Var2, true);
                this.p.a(z0Var3, false);
            } else {
                this.p.a(z0Var2, false);
                this.p.a(z0Var3, true);
            }
        }
        this.p.a(z0Var, this.a.t() instanceof pj);
        q2 k = q.k();
        if (k == null) {
            k = q2.d.a();
        }
        this.p.a(true, y0.e, new x0(k.e().b(), k.e().a()), new x0(k.f().b(), k.f().a()), new x0(k.g().b(), k.g().a()));
        m2 t3 = this.a.t();
        pj pjVar = t3 instanceof pj ? (pj) t3 : null;
        boolean z3 = (pjVar != null && pjVar.B()) || this.a.u() > 0;
        Integer i = q.i();
        int intValue = i != null ? i.intValue() : -1;
        if (this.c == u.d) {
            this.p.setRewardedMode(true);
            if (this.k) {
                this.p.k();
            } else if (z3 && q.b() && intValue > 0) {
                this.k = true;
                Job job = this.t;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, null, 1, null);
                }
                this.p.k();
                l lVar = this.b;
                if (lVar != null) {
                    lVar.d();
                }
            } else {
                Job job2 = this.t;
                if (job2 != null && job2.isActive()) {
                    this.p.a(z0.h, true);
                } else if (intValue > 0) {
                    this.p.setupRewardChip(intValue * 1000);
                } else if (intValue == 0) {
                    this.p.setupRewardChip(0L);
                    this.p.k();
                }
            }
        }
        t5 t5Var = this.o;
        if (t5Var != null) {
            w0.a(this.p, !z3 || t5Var.d(), (String) null, 2, (Object) null);
        }
    }

    public static final class a extends Lambda implements Function2 {
        public final /* synthetic */ View c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(2);
            this.c = view;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
            return Unit.INSTANCE;
        }

        public final void a(float f, float f2) {
            View view = m.this.g;
            if (view != null) {
                f -= view.getLeft();
            }
            if (view != null) {
                f2 -= view.getTop();
            }
            s6 s6Var = s6.a;
            Context context = this.c.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int a = s6Var.a((int) f, context);
            Context context2 = this.c.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            vf.a(m.this.a, true, Integer.valueOf(a), Integer.valueOf(s6Var.a((int) f2, context2)), null, 8, null);
        }
    }

    public final void v() {
        a0 q;
        if (this.i) {
            return;
        }
        this.i = true;
        if (!l()) {
            InterruptionController.a.h();
        }
        this.a.y();
        this.p.h(this.a.x());
        m2 t = this.a.t();
        if (t == null || (q = t.q()) == null) {
            q = this.a.q();
        }
        Integer i = q.i();
        int intValue = i != null ? i.intValue() : -1;
        if (this.c == u.d && !this.k && this.t == null) {
            if (intValue == 0) {
                this.k = true;
                this.p.k();
                l lVar = this.b;
                if (lVar != null) {
                    lVar.d();
                }
            } else if (intValue > 0) {
                this.p.a(z0.h, true);
                this.p.l();
                b(intValue * 1000);
            }
        }
        x();
    }

    public final void m() {
        this.a.l();
    }

    public final void x() {
        Job launch$default;
        if (this.c != u.b && this.p.d()) {
            long r = this.a.r();
            if (r >= 0) {
                if (!this.p.e() && r != 0) {
                    Job job = this.s;
                    if (job != null) {
                        Job.DefaultImpls.cancel$default(job, null, 1, null);
                    }
                    launch$default = BuildersKt__Builders_commonKt.launch$default(this.r, null, null, new d(r, this, null), 3, null);
                    this.s = launch$default;
                } else {
                    this.p.a(z0.f, true);
                }
            }
            this.p.m();
        }
    }

    public final void q() {
        Job job = this.t;
        if (job == null || !job.isActive()) {
            return;
        }
        this.u = RangesKt.coerceAtLeast(this.u - (SystemClock.uptimeMillis() - this.v), 0L);
        Job job2 = this.t;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, null, 1, null);
        }
    }

    public final void s() {
        if (this.k) {
            return;
        }
        long j = this.u;
        if (j <= 0) {
            return;
        }
        b(j);
    }

    public final void p() {
        Job job = this.w;
        if (job == null || !job.isActive()) {
            return;
        }
        this.x = RangesKt.coerceAtLeast(this.x - (SystemClock.uptimeMillis() - this.y), 0L);
        Job job2 = this.w;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, null, 1, null);
        }
    }

    public final void r() {
        long j = this.x;
        if (j <= 0) {
            return;
        }
        a(j);
    }

    public final void a(final View view) {
        h();
        removeView(this.g);
        this.g = view;
        super.addView(view, 0, new FrameLayout.LayoutParams(-1, -1));
        if (this.a.t() instanceof rl) {
            post(new Runnable() { // from class: com.chartboost.sdk.impl.m$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    m.a(m.this, view);
                }
            });
        }
        t();
    }

    public static final void a(m this$0, View adView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adView, "$adView");
        this$0.b(adView);
    }

    public final void b(View view) {
        m2 t = this.a.t();
        if (t instanceof rl) {
            wf w = ((rl) t).w();
            if (w.h() == wf.b.e) {
                return;
            }
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            if (width <= 0 || height <= 0) {
                return;
            }
            r6 b2 = xf.a.b(w, this.e, width, height);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(b2.b(), b2.a());
            layoutParams.gravity = 17;
            view.setLayoutParams(layoutParams);
        }
    }

    @Override // com.chartboost.sdk.impl.zf
    public void f() {
        l lVar = this.b;
        if (lVar != null) {
            lVar.a();
        }
    }

    public final void n() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.a.m();
        this.p.g();
        this.p.f();
        q();
        p();
    }

    public final void o() {
        if (this.h) {
            this.h = false;
            this.a.n();
            y();
            this.p.h(this.a.x());
            this.p.m();
            this.p.l();
            s();
            r();
        }
    }

    public final void y() {
        if (this.q == null || this.c == u.b) {
            return;
        }
        m2 t = this.a.t();
        int u = t != null ? t.u() : 0;
        dg dgVar = this.q;
        cg b2 = dgVar != null ? dgVar.b() : null;
        Insets c2 = b2 != null ? b2.c() : null;
        if (c2 != null) {
            u9.a aVar = u9.c;
            setPadding(aVar.b(u) ? 0 : c2.left, aVar.d(u) ? 0 : c2.top, aVar.c(u) ? 0 : c2.right, aVar.a(u) ? 0 : c2.bottom);
            final View view = this.g;
            if (view != null) {
                post(new Runnable() { // from class: com.chartboost.sdk.impl.m$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        m.b(m.this, view);
                    }
                });
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
        Job job = this.s;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        this.s = null;
        Job job2 = this.t;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, null, 1, null);
        }
        this.t = null;
        Job job3 = this.w;
        if (job3 != null) {
            Job.DefaultImpls.cancel$default(job3, null, 1, null);
        }
        this.w = null;
        CoroutineScopeKt.cancel$default(this.r, "AdContainerView detached from window", null, 2, null);
        InterruptionController interruptionController = InterruptionController.a;
        interruptionController.b((jb) this);
        if (!l()) {
            interruptionController.a();
        }
        interruptionController.b((c7) this);
        this.p.b();
        if (this.c != u.b) {
            this.a.a(nh.c);
        }
    }

    public final void i() {
        a0 q;
        Unit unit;
        Unit unit2;
        m2 t = this.a.t();
        if (t == null || (q = t.q()) == null) {
            q = this.a.q();
        }
        Integer i = q.i();
        int intValue = i != null ? i.intValue() : -1;
        if (this.c == u.d && !this.k && intValue < 0) {
            this.k = true;
            l lVar = this.b;
            if (lVar != null) {
                lVar.d();
                unit2 = Unit.INSTANCE;
            } else {
                unit2 = null;
            }
            if (unit2 == null) {
                xb.e("AdContainerListener null when onAdRewarded()", null, 2, null);
            }
        }
        Job job = this.t;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        this.t = null;
        Job job2 = this.w;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, null, 1, null);
        }
        this.w = null;
        this.a.a(nh.c);
        l lVar2 = this.b;
        if (lVar2 != null) {
            lVar2.b();
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            xb.e("AdContainerListener null when onAdClosed()", null, 2, null);
        }
    }

    @Override // com.chartboost.sdk.impl.a1
    public void g() {
        a0 q;
        l lVar;
        m2 t = this.a.t();
        if (t == null || (q = t.q()) == null) {
            q = this.a.q();
        }
        String a2 = q.g().a();
        if (a2.length() <= 0 || (lVar = this.b) == null) {
            return;
        }
        lVar.a(a2);
    }

    @Override // com.chartboost.sdk.impl.a1
    public void e() {
        i();
    }

    @Override // com.chartboost.sdk.impl.a1
    public void d() {
        wf w;
        l lVar = this.b;
        if (lVar != null) {
            lVar.c();
        }
        this.p.a(z0.f, false);
        if (this.a.i()) {
            this.p.a(z0.e, true);
            m2 t = this.a.t();
            long c2 = (t == null || (w = t.w()) == null) ? -1L : w.c();
            if (this.a.h() <= 0 && c2 > 0) {
                a(c2 * 1000);
            }
        } else if (this.c != u.b) {
            this.p.a(z0.d, true);
        }
        vf.a(this.a, h7.b, (v5) null, 2, (Object) null);
    }

    public final void w() {
        View k = this.a.k();
        if (k != null) {
            a(k);
            t();
            x();
        }
    }

    public final void j() {
        h();
        Job job = this.s;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        this.s = null;
        Job job2 = this.t;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, null, 1, null);
        }
        this.t = null;
        Job job3 = this.w;
        if (job3 != null) {
            Job.DefaultImpls.cancel$default(job3, null, 1, null);
        }
        this.w = null;
        CoroutineScopeKt.cancel$default(this.r, "AdContainerView destroyed", null, 2, null);
        this.a.a(nh.c);
        removeAllViews();
    }

    @Override // com.chartboost.sdk.impl.a1
    public void c() {
        c(true);
    }

    public final void u() {
        Bitmap g;
        m2 t = this.a.t();
        if (t == null || (g = t.g()) == null) {
            return;
        }
        Bitmap a2 = p2.a(g, 0, 2, null);
        g.recycle();
        if (a2 == null) {
            return;
        }
        ImageView imageView = new ImageView(getContext());
        imageView.setImageBitmap(a2);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.l = imageView;
        addView(imageView, 0, new FrameLayout.LayoutParams(-1, -1));
        View view = this.g;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    public final void h() {
        ImageView imageView = this.l;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
            Bitmap bitmap = bitmapDrawable != null ? bitmapDrawable.getBitmap() : null;
            removeView(imageView);
            imageView.setImageDrawable(null);
            if (bitmap != null) {
                if (bitmap.isRecycled()) {
                    bitmap = null;
                }
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
        }
        this.l = null;
    }

    public final boolean k() {
        return this.p.c();
    }

    @Override // com.chartboost.sdk.impl.a1
    public void b() {
        List emptyList;
        Integer num;
        Integer num2;
        mk A;
        m2 t = this.a.t();
        if (t == null) {
            xb.e("CTA clicked but currentAd is null.", null, 2, null);
            return;
        }
        pj pjVar = t instanceof pj ? (pj) t : null;
        nj o = t.w().o();
        t5 a2 = o != null ? o.a() : null;
        if (a2 == null || (emptyList = a2.c()) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        String a3 = (pjVar == null || (A = pjVar.A()) == null) ? null : A.a();
        Float f = this.m;
        if (f != null) {
            float floatValue = f.floatValue();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            num = Integer.valueOf(s6.a.a((int) floatValue, context));
        } else {
            num = null;
        }
        Float f2 = this.n;
        if (f2 != null) {
            float floatValue2 = f2.floatValue();
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            num2 = Integer.valueOf(s6.a.a((int) floatValue2, context2));
        } else {
            num2 = null;
        }
        this.m = null;
        this.n = null;
        t.a(true, num, num2, (i4) new i4.a(emptyList, a3));
    }

    public final void c(boolean z) {
        Job job = this.w;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        this.w = null;
        this.a.c(z);
        m2 t = this.a.t();
        if (t != null) {
            t.a(nh.b);
        }
        if (this.a.i()) {
            w();
        } else {
            i();
        }
    }

    @Override // com.chartboost.sdk.impl.zf
    public void a() {
        View k;
        a0 q;
        if (!l()) {
            InterruptionController.a.a();
        }
        if (!this.a.i()) {
            u();
            m2 t = this.a.t();
            if (t == null || (q = t.q()) == null) {
                q = this.a.q();
            }
            Integer i = q.i();
            int intValue = i != null ? i.intValue() : -1;
            if (this.c == u.d && !this.k && q.b() && intValue > 0) {
                this.k = true;
                Job job = this.t;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, null, 1, null);
                }
                this.p.k();
                l lVar = this.b;
                if (lVar != null) {
                    lVar.d();
                }
            }
        }
        m2 t2 = this.a.t();
        if (t2 != null) {
            t2.a(nh.e);
        }
        if (!this.a.i() || (k = this.a.k()) == null) {
            return;
        }
        this.a.c(false);
        a(k);
        if (!this.p.e()) {
            this.p.h();
        }
        t();
        x();
        if (!l()) {
            InterruptionController.a.h();
        }
        this.a.y();
        m2 t3 = this.a.t();
        if (t3 != null) {
            nj o = t3.w().o();
            a((View) this, o != null ? o.f() : true);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ m(Context context, od odVar, l lVar, u uVar, Mediation mediation, g6 g6Var, dh dhVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, odVar, lVar, r4, mediation, r6, r7);
        dh dhVar2;
        u uVar2 = (i & 8) != 0 ? u.b : uVar;
        g6 a6Var = (i & 32) != 0 ? new a6(context) : g6Var;
        if ((i & 64) != 0) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("cbPrefs", 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
            dhVar2 = new dh(sharedPreferences);
        } else {
            dhVar2 = dhVar;
        }
    }

    @Override // com.chartboost.sdk.impl.jb
    public void a(Set activeInterruptions) {
        Intrinsics.checkNotNullParameter(activeInterruptions, "activeInterruptions");
        if (activeInterruptions.isEmpty()) {
            o();
        } else {
            n();
        }
    }

    @Override // com.chartboost.sdk.impl.c7
    public void b(boolean z) {
        this.a.b(z);
        this.p.h(this.a.x());
    }

    @Override // com.chartboost.sdk.impl.zf
    public void b(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (error instanceof ChartboostError.Render.WebViewMraidUnload) {
            xb.a("MRAID unload() called. Skipping the current renderable.", (Throwable) null, 2, (Object) null);
            Job job = this.s;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, null, 1, null);
            }
            d();
        }
    }

    @Override // com.chartboost.sdk.impl.zf
    public void a(re request) {
        Intrinsics.checkNotNullParameter(request, "request");
        l lVar = this.b;
        if (lVar != null) {
            lVar.a(request);
        }
    }

    public final void b(long j) {
        Job launch$default;
        this.u = j;
        this.v = SystemClock.uptimeMillis();
        Job job = this.t;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.r, null, null, new c(j, this, null), 3, null);
        this.t = launch$default;
    }

    public static final void b(m this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "$view");
        this$0.b(view);
    }

    @Override // com.chartboost.sdk.impl.a1
    public void a(boolean z) {
        if (z) {
            vf.a((vf) this.a, false, 1, (Object) null);
        } else {
            vf.a((vf) this.a, 0.0f, false, 3, (Object) null);
        }
        this.f.b("cb_video_mute_state", z);
    }

    public final void a(View view, boolean z) {
        this.j = z ? new GestureDetector(view.getContext(), new n(0.0f, new a(view), 1, null)) : null;
    }

    public static /* synthetic */ void a(m mVar, View view, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        mVar.a(view, z);
    }

    public final void a(long j) {
        Job launch$default;
        this.x = j;
        this.y = SystemClock.uptimeMillis();
        Job job = this.w;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.r, null, null, new b(j, this, null), 3, null);
        this.w = launch$default;
    }
}
