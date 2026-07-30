package androidx.lifecycle;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.List;
import k0.C0593d;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.lifecycle.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0241g implements InterfaceC0254u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3902d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3903e;

    /* renamed from: i, reason: collision with root package name */
    public final Object f3904i;

    public C0241g(U.k defaultLifecycleObserver, InterfaceC0254u interfaceC0254u) {
        Intrinsics.checkNotNullParameter(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f3903e = defaultLifecycleObserver;
        this.f3904i = interfaceC0254u;
    }

    @Override // androidx.lifecycle.InterfaceC0254u
    public final void a(InterfaceC0256w owner, EnumC0248n event) {
        switch (this.f3902d) {
            case 0:
                U.k kVar = (U.k) this.f3903e;
                Intrinsics.checkNotNullParameter(owner, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                switch (AbstractC0240f.f3901a[event.ordinal()]) {
                    case 1:
                        Intrinsics.checkNotNullParameter(owner, "owner");
                        break;
                    case 2:
                        Intrinsics.checkNotNullParameter(owner, "owner");
                        break;
                    case 3:
                        (Build.VERSION.SDK_INT >= 28 ? U.b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new U.m(), 500L);
                        kVar.f2675d.b(kVar);
                        break;
                    case 4:
                        Intrinsics.checkNotNullParameter(owner, "owner");
                        break;
                    case 5:
                        Intrinsics.checkNotNullParameter(owner, "owner");
                        break;
                    case 6:
                        Intrinsics.checkNotNullParameter(owner, "owner");
                        break;
                    case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                InterfaceC0254u interfaceC0254u = (InterfaceC0254u) this.f3904i;
                if (interfaceC0254u != null) {
                    interfaceC0254u.a(owner, event);
                    return;
                }
                return;
            case 1:
                Intrinsics.checkNotNullParameter(owner, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == EnumC0248n.ON_START) {
                    ((AbstractC0250p) this.f3903e).b(this);
                    ((C0593d) this.f3904i).d();
                    return;
                }
                return;
            default:
                C0236b c0236b = (C0236b) this.f3904i;
                InterfaceC0255v interfaceC0255v = (InterfaceC0255v) this.f3903e;
                HashMap hashMap = c0236b.f3892a;
                C0236b.a((List) hashMap.get(event), owner, event, interfaceC0255v);
                C0236b.a((List) hashMap.get(EnumC0248n.ON_ANY), owner, event, interfaceC0255v);
                return;
        }
    }

    public C0241g(InterfaceC0255v interfaceC0255v) {
        this.f3903e = interfaceC0255v;
        C0238d c0238d = C0238d.f3897c;
        Class<?> cls = interfaceC0255v.getClass();
        C0236b c0236b = (C0236b) c0238d.f3898a.get(cls);
        this.f3904i = c0236b == null ? c0238d.a(cls, null) : c0236b;
    }

    public C0241g(AbstractC0250p abstractC0250p, C0593d c0593d) {
        this.f3903e = abstractC0250p;
        this.f3904i = c0593d;
    }
}
