package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.control.ToggleObserver;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.nc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2831nc implements InterfaceC2753kc, ToggleObserver {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f39494a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f39495b = Ia.j().w().c();

    /* renamed from: c, reason: collision with root package name */
    public Hn f39496c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f39497d;

    public final void a(@Nullable Toggle toggle) {
        Hn hn = new Hn(toggle);
        this.f39496c = hn;
        hn.f37677c.registerObserver(this, true);
    }

    public final void b(@NotNull Object obj) {
        Hn hn = this.f39496c;
        if (hn == null) {
            Intrinsics.throwUninitializedPropertyAccessException("togglesHolder");
            hn = null;
        }
        hn.f37676b.b(obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.ToggleObserver
    public final void onStateChanged(final boolean z4) {
        this.f39495b.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.qp
            @Override // java.lang.Runnable
            public final void run() {
                C2831nc.a(C2831nc.this, z4);
            }
        });
    }

    public final void a(@NotNull final LocationControllerObserver locationControllerObserver, final boolean z4) {
        this.f39495b.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.pp
            @Override // java.lang.Runnable
            public final void run() {
                C2831nc.a(C2831nc.this, locationControllerObserver, z4);
            }
        });
    }

    public static final void a(C2831nc c2831nc, LocationControllerObserver locationControllerObserver, boolean z4) {
        c2831nc.f39494a.add(locationControllerObserver);
        if (z4) {
            if (c2831nc.f39497d) {
                locationControllerObserver.startLocationTracking();
            } else {
                locationControllerObserver.stopLocationTracking();
            }
        }
    }

    public static final void a(C2831nc c2831nc, boolean z4) {
        if (c2831nc.f39497d != z4) {
            c2831nc.f39497d = z4;
            Function1 function1 = z4 ? C2779lc.f39398a : C2805mc.f39445a;
            ArrayList arrayList = c2831nc.f39494a;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                function1.invoke((LocationControllerObserver) obj);
            }
        }
    }

    public final void a(@NotNull Object obj) {
        Hn hn = this.f39496c;
        if (hn == null) {
            Intrinsics.throwUninitializedPropertyAccessException("togglesHolder");
            hn = null;
        }
        hn.f37676b.a(obj);
    }

    public final void a(boolean z4) {
        Hn hn = this.f39496c;
        if (hn == null) {
            Intrinsics.throwUninitializedPropertyAccessException("togglesHolder");
            hn = null;
        }
        hn.f37675a.a(z4);
    }
}
