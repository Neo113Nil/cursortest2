package androidx.activity;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.w;
import androidx.lifecycle.AbstractC1346l;
import androidx.lifecycle.InterfaceC1351q;
import androidx.lifecycle.InterfaceC1354u;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.C3218h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f9896a;

    /* renamed from: b, reason: collision with root package name */
    private final A.a f9897b;

    /* renamed from: c, reason: collision with root package name */
    private final C3218h f9898c;

    /* renamed from: d, reason: collision with root package name */
    private v f9899d;

    /* renamed from: e, reason: collision with root package name */
    private OnBackInvokedCallback f9900e;

    /* renamed from: f, reason: collision with root package name */
    private OnBackInvokedDispatcher f9901f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f9902g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f9903h;

    static final class a extends kotlin.jvm.internal.s implements Function1 {
        a() {
            super(1);
        }

        public final void a(C1249b backEvent) {
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
            w.this.n(backEvent);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C1249b) obj);
            return Unit.f41027a;
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function1 {
        b() {
            super(1);
        }

        public final void a(C1249b backEvent) {
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
            w.this.m(backEvent);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C1249b) obj);
            return Unit.f41027a;
        }
    }

    static final class c extends kotlin.jvm.internal.s implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m1invoke();
            return Unit.f41027a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m1invoke() {
            w.this.l();
        }
    }

    static final class d extends kotlin.jvm.internal.s implements Function0 {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m2invoke();
            return Unit.f41027a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m2invoke() {
            w.this.k();
        }
    }

    static final class e extends kotlin.jvm.internal.s implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m3invoke();
            return Unit.f41027a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3invoke() {
            w.this.l();
        }
    }

    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public static final f f9909a = new f();

        private f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(Function0 onBackInvoked) {
            Intrinsics.checkNotNullParameter(onBackInvoked, "$onBackInvoked");
            onBackInvoked.invoke();
        }

        public final OnBackInvokedCallback b(final Function0<Unit> onBackInvoked) {
            Intrinsics.checkNotNullParameter(onBackInvoked, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: androidx.activity.x
                public final void onBackInvoked() {
                    w.f.c(Function0.this);
                }
            };
        }

        public final void d(Object dispatcher, int i4, Object callback) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i4, (OnBackInvokedCallback) callback);
        }

        public final void e(Object dispatcher, Object callback) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }
    }

    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public static final g f9910a = new g();

        public static final class a implements OnBackAnimationCallback {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1 f9911a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1 f9912b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0 f9913c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function0 f9914d;

            a(Function1 function1, Function1 function12, Function0 function0, Function0 function02) {
                this.f9911a = function1;
                this.f9912b = function12;
                this.f9913c = function0;
                this.f9914d = function02;
            }

            public void onBackCancelled() {
                this.f9914d.invoke();
            }

            public void onBackInvoked() {
                this.f9913c.invoke();
            }

            public void onBackProgressed(BackEvent backEvent) {
                Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                this.f9912b.invoke(new C1249b(backEvent));
            }

            public void onBackStarted(BackEvent backEvent) {
                Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                this.f9911a.invoke(new C1249b(backEvent));
            }
        }

        private g() {
        }

        public final OnBackInvokedCallback a(Function1<? super C1249b, Unit> onBackStarted, Function1<? super C1249b, Unit> onBackProgressed, Function0<Unit> onBackInvoked, Function0<Unit> onBackCancelled) {
            Intrinsics.checkNotNullParameter(onBackStarted, "onBackStarted");
            Intrinsics.checkNotNullParameter(onBackProgressed, "onBackProgressed");
            Intrinsics.checkNotNullParameter(onBackInvoked, "onBackInvoked");
            Intrinsics.checkNotNullParameter(onBackCancelled, "onBackCancelled");
            return new a(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
        }
    }

    private final class h implements InterfaceC1351q, androidx.activity.c {

        /* renamed from: b, reason: collision with root package name */
        private final AbstractC1346l f9915b;

        /* renamed from: c, reason: collision with root package name */
        private final v f9916c;

        /* renamed from: d, reason: collision with root package name */
        private androidx.activity.c f9917d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ w f9918e;

        public h(w wVar, AbstractC1346l lifecycle, v onBackPressedCallback) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            this.f9918e = wVar;
            this.f9915b = lifecycle;
            this.f9916c = onBackPressedCallback;
            lifecycle.addObserver(this);
        }

        @Override // androidx.activity.c
        public void cancel() {
            this.f9915b.removeObserver(this);
            this.f9916c.removeCancellable(this);
            androidx.activity.c cVar = this.f9917d;
            if (cVar != null) {
                cVar.cancel();
            }
            this.f9917d = null;
        }

        @Override // androidx.lifecycle.InterfaceC1351q
        public void onStateChanged(InterfaceC1354u source, AbstractC1346l.a event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event == AbstractC1346l.a.ON_START) {
                this.f9917d = this.f9918e.j(this.f9916c);
                return;
            }
            if (event != AbstractC1346l.a.ON_STOP) {
                if (event == AbstractC1346l.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                androidx.activity.c cVar = this.f9917d;
                if (cVar != null) {
                    cVar.cancel();
                }
            }
        }
    }

    private final class i implements androidx.activity.c {

        /* renamed from: b, reason: collision with root package name */
        private final v f9919b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ w f9920c;

        public i(w wVar, v onBackPressedCallback) {
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            this.f9920c = wVar;
            this.f9919b = onBackPressedCallback;
        }

        @Override // androidx.activity.c
        public void cancel() {
            this.f9920c.f9898c.remove(this.f9919b);
            if (Intrinsics.areEqual(this.f9920c.f9899d, this.f9919b)) {
                this.f9919b.handleOnBackCancelled();
                this.f9920c.f9899d = null;
            }
            this.f9919b.removeCancellable(this);
            Function0<Unit> enabledChangedCallback$activity_release = this.f9919b.getEnabledChangedCallback$activity_release();
            if (enabledChangedCallback$activity_release != null) {
                enabledChangedCallback$activity_release.invoke();
            }
            this.f9919b.setEnabledChangedCallback$activity_release(null);
        }
    }

    /* synthetic */ class j extends kotlin.jvm.internal.p implements Function0 {
        j(Object obj) {
            super(0, obj, w.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        public final void i() {
            ((w) this.receiver).q();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            i();
            return Unit.f41027a;
        }
    }

    /* synthetic */ class k extends kotlin.jvm.internal.p implements Function0 {
        k(Object obj) {
            super(0, obj, w.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        public final void i() {
            ((w) this.receiver).q();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            i();
            return Unit.f41027a;
        }
    }

    public w(Runnable runnable, A.a aVar) {
        this.f9896a = runnable;
        this.f9897b = aVar;
        this.f9898c = new C3218h();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 33) {
            this.f9900e = i4 >= 34 ? g.f9910a.a(new a(), new b(), new c(), new d()) : f.f9909a.b(new e());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void k() {
        v vVar;
        v vVar2 = this.f9899d;
        if (vVar2 == null) {
            C3218h c3218h = this.f9898c;
            ListIterator listIterator = c3218h.listIterator(c3218h.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    vVar = 0;
                    break;
                } else {
                    vVar = listIterator.previous();
                    if (((v) vVar).isEnabled()) {
                        break;
                    }
                }
            }
            vVar2 = vVar;
        }
        this.f9899d = null;
        if (vVar2 != null) {
            vVar2.handleOnBackCancelled();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    public final void m(C1249b c1249b) {
        v vVar;
        v vVar2 = this.f9899d;
        if (vVar2 == null) {
            C3218h c3218h = this.f9898c;
            ListIterator listIterator = c3218h.listIterator(c3218h.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    vVar = 0;
                    break;
                } else {
                    vVar = listIterator.previous();
                    if (((v) vVar).isEnabled()) {
                        break;
                    }
                }
            }
            vVar2 = vVar;
        }
        if (vVar2 != null) {
            vVar2.handleOnBackProgressed(c1249b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(C1249b c1249b) {
        Object obj;
        C3218h c3218h = this.f9898c;
        ListIterator<E> listIterator = c3218h.listIterator(c3218h.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            } else {
                obj = listIterator.previous();
                if (((v) obj).isEnabled()) {
                    break;
                }
            }
        }
        v vVar = (v) obj;
        if (this.f9899d != null) {
            k();
        }
        this.f9899d = vVar;
        if (vVar != null) {
            vVar.handleOnBackStarted(c1249b);
        }
    }

    private final void p(boolean z4) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f9901f;
        OnBackInvokedCallback onBackInvokedCallback = this.f9900e;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z4 && !this.f9902g) {
            f.f9909a.d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f9902g = true;
        } else {
            if (z4 || !this.f9902g) {
                return;
            }
            f.f9909a.e(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f9902g = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        boolean z4 = this.f9903h;
        C3218h c3218h = this.f9898c;
        boolean z5 = false;
        if (c3218h == null || !c3218h.isEmpty()) {
            Iterator<E> it = c3218h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((v) it.next()).isEnabled()) {
                    z5 = true;
                    break;
                }
            }
        }
        this.f9903h = z5;
        if (z5 != z4) {
            A.a aVar = this.f9897b;
            if (aVar != null) {
                aVar.accept(Boolean.valueOf(z5));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                p(z5);
            }
        }
    }

    public final void h(v onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        j(onBackPressedCallback);
    }

    public final void i(InterfaceC1354u owner, v onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        AbstractC1346l lifecycle = owner.getLifecycle();
        if (lifecycle.getCurrentState() == AbstractC1346l.b.DESTROYED) {
            return;
        }
        onBackPressedCallback.addCancellable(new h(this, lifecycle, onBackPressedCallback));
        q();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new j(this));
    }

    public final androidx.activity.c j(v onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        this.f9898c.add(onBackPressedCallback);
        i iVar = new i(this, onBackPressedCallback);
        onBackPressedCallback.addCancellable(iVar);
        q();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new k(this));
        return iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void l() {
        v vVar;
        v vVar2 = this.f9899d;
        if (vVar2 == null) {
            C3218h c3218h = this.f9898c;
            ListIterator listIterator = c3218h.listIterator(c3218h.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    vVar = 0;
                    break;
                } else {
                    vVar = listIterator.previous();
                    if (((v) vVar).isEnabled()) {
                        break;
                    }
                }
            }
            vVar2 = vVar;
        }
        this.f9899d = null;
        if (vVar2 != null) {
            vVar2.handleOnBackPressed();
            return;
        }
        Runnable runnable = this.f9896a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void o(OnBackInvokedDispatcher invoker) {
        Intrinsics.checkNotNullParameter(invoker, "invoker");
        this.f9901f = invoker;
        p(this.f9903h);
    }

    public w(Runnable runnable) {
        this(runnable, null);
    }
}
