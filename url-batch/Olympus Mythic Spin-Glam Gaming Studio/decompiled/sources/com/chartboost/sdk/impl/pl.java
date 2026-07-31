package com.chartboost.sdk.impl;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* loaded from: classes4.dex */
public final class pl {
    public static final a r = new a(null);
    public final View a;
    public final View b;
    public final int c;
    public final int d;
    public final long e;
    public final int f;
    public final boolean g;
    public b h;
    public final WeakReference i;
    public Job j;
    public WeakReference k;
    public ViewTreeObserver.OnPreDrawListener l;
    public boolean m;
    public Long n;
    public boolean o;
    public Long p;
    public final Rect q;

    public interface b {
        void a();
    }

    public static final class d extends SuspendLambda implements Function2 {
        public int b;
        public /* synthetic */ Object c;

        public static final class a extends SuspendLambda implements Function2 {
            public int b;
            public final /* synthetic */ pl c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(pl plVar, Continuation continuation) {
                super(2, continuation);
                this.c = plVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.b;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    long j = this.c.e;
                    this.b = 1;
                    if (DelayKt.delay(j, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            d dVar = pl.this.new d(continuation);
            dVar.c = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            CoroutineDispatcher io2;
            a aVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.c;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.c;
                ResultKt.throwOnFailure(obj);
            }
            do {
                if (CoroutineScopeKt.isActive(coroutineScope) && (!pl.this.m || (pl.this.g && !pl.this.o))) {
                    if (!pl.this.m && pl.this.f()) {
                        pl plVar = pl.this;
                        Long l = plVar.n;
                        if (l == null) {
                            l = Boxing.boxLong(SystemClock.uptimeMillis());
                        }
                        plVar.n = l;
                        if (pl.this.d()) {
                            pl.this.m = true;
                            if (!pl.this.g || pl.this.o) {
                                b c = pl.this.c();
                                if (c != null) {
                                    c.a();
                                }
                            }
                        }
                    } else if (!pl.this.m) {
                        pl.this.n = null;
                    }
                    if (pl.this.g && !pl.this.o) {
                        if (!pl.this.e()) {
                            pl.this.p = null;
                        } else if (pl.this.p == null) {
                            pl.this.p = Boxing.boxLong(SystemClock.uptimeMillis());
                        } else {
                            long uptimeMillis = SystemClock.uptimeMillis();
                            Long l2 = pl.this.p;
                            Intrinsics.checkNotNull(l2);
                            if (uptimeMillis - l2.longValue() >= 2000) {
                                pl.this.o = true;
                                if (pl.this.m) {
                                    b c2 = pl.this.c();
                                    if (c2 != null) {
                                        c2.a();
                                    }
                                }
                            }
                        }
                    }
                    io2 = Dispatchers.getIO();
                    aVar = new a(pl.this, null);
                    this.c = coroutineScope;
                    this.b = 1;
                }
                return Unit.INSTANCE;
            } while (BuildersKt.withContext(io2, aVar, this) != coroutine_suspended);
            return coroutine_suspended;
        }
    }

    public pl(Context context, View trackedView, View rootView, int i, int i2, long j, int i3, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(trackedView, "trackedView");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        this.a = trackedView;
        this.b = rootView;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = i3;
        this.g = z;
        this.i = new WeakReference(context instanceof Activity ? (Activity) context : null);
        this.k = new WeakReference(null);
        this.l = new ViewTreeObserver.OnPreDrawListener() { // from class: com.chartboost.sdk.impl.pl$$ExternalSyntheticLambda0
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return pl.j(pl.this);
            }
        };
        this.q = new Rect();
    }

    public static final boolean j(pl this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.g();
        return true;
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final View a(Context context, View view) {
            View findViewById;
            View rootView;
            Window window;
            View decorView;
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null || (findViewById = decorView.findViewById(R.id.content)) == null) {
                findViewById = (view == null || (rootView = view.getRootView()) == null) ? null : rootView.findViewById(R.id.content);
                if (findViewById == null) {
                    if (view != null) {
                        return view.getRootView();
                    }
                    return null;
                }
            }
            return findViewById;
        }
    }

    public static final class c extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public c(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            xb.a("Visibility check ran into a problem: " + th, (Throwable) null, 2, (Object) null);
        }
    }

    public final b c() {
        return this.h;
    }

    public /* synthetic */ pl(Context context, View view, View view2, int i, int i2, long j, int i3, boolean z, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, view, view2, i, i2, j, i3, (i4 & 128) != 0 ? false : z);
    }

    public final void i() {
        h();
    }

    public final void h() {
        try {
            ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.k.get();
            if (viewTreeObserver != null) {
                if (viewTreeObserver.isAlive()) {
                    return;
                }
            }
        } catch (Exception unused) {
            xb.a("Exception when accessing view tree observer.", (Throwable) null, 2, (Object) null);
        }
        View a2 = r.a((Context) this.i.get(), this.a);
        ViewTreeObserver viewTreeObserver2 = a2 != null ? a2.getViewTreeObserver() : null;
        if (viewTreeObserver2 == null) {
            return;
        }
        if (!viewTreeObserver2.isAlive()) {
            xb.b("Unable to set ViewTreeObserver since it is not alive", (Throwable) null, 2, (Object) null);
        } else {
            this.k = new WeakReference(viewTreeObserver2);
            viewTreeObserver2.addOnPreDrawListener(this.l);
        }
    }

    public final void g() {
        Job launch$default;
        if (this.j != null) {
            return;
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), new c(CoroutineExceptionHandler.Key), null, new d(null), 2, null);
        this.j = launch$default;
    }

    public final boolean d() {
        Long l = this.n;
        if (l != null) {
            if (SystemClock.uptimeMillis() - l.longValue() >= this.d) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        if (this.a.getVisibility() != 0 || this.b.getParent() == null || this.a.getWidth() <= 0 || this.a.getHeight() <= 0) {
            return false;
        }
        int i = 0;
        for (ViewParent parent = this.a.getParent(); parent != null && i < this.f; parent = parent.getParent()) {
            if ((parent instanceof View) && ((View) parent).getVisibility() != 0) {
                return false;
            }
            i++;
        }
        if (!this.a.getGlobalVisibleRect(this.q)) {
            return false;
        }
        int width = this.q.width();
        Context context = this.a.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int a2 = a(width, context);
        int height = this.q.height();
        Context context2 = this.a.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        return a2 * a(height, context2) >= this.c;
    }

    public final boolean e() {
        if (this.a.getVisibility() != 0 || this.b.getParent() == null || this.a.getWidth() <= 0 || this.a.getHeight() <= 0 || !this.a.getGlobalVisibleRect(this.q)) {
            return false;
        }
        return ((float) (this.q.width() * this.q.height())) / ((float) (this.a.getWidth() * this.a.getHeight())) >= 0.5f;
    }

    public final void b() {
        a();
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.k.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.l);
        }
        this.k.clear();
        this.h = null;
    }

    public final void a() {
        Job job = this.j;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        this.j = null;
    }

    public final int a(int i, Context context) {
        return MathKt.roundToInt(i / context.getResources().getDisplayMetrics().density);
    }

    public final void a(b bVar) {
        this.h = bVar;
    }
}
