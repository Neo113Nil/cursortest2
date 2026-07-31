package io.flutter.plugin.platform;

import B0.E;
import N.P;
import android.util.SparseArray;
import android.view.Surface;
import android.view.SurfaceControl;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;
import k0.AbstractActivityC0187d;
import o0.C0211b;

/* loaded from: classes.dex */
public final class k implements h {

    /* renamed from: e, reason: collision with root package name */
    public l0.h f2467e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractActivityC0187d f2468f;

    /* renamed from: g, reason: collision with root package name */
    public k0.o f2469g;

    /* renamed from: i, reason: collision with root package name */
    public C0211b f2471i;

    /* renamed from: h, reason: collision with root package name */
    public FlutterJNI f2470h = null;

    /* renamed from: o, reason: collision with root package name */
    public Surface f2477o = null;

    /* renamed from: p, reason: collision with root package name */
    public SurfaceControl f2478p = null;

    /* renamed from: q, reason: collision with root package name */
    public final E f2479q = new E(25, this);

    /* renamed from: j, reason: collision with root package name */
    public final a f2472j = new a();

    /* renamed from: k, reason: collision with root package name */
    public final SparseArray f2473k = new SparseArray();

    /* renamed from: l, reason: collision with root package name */
    public final SparseArray f2474l = new SparseArray();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f2475m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f2476n = new ArrayList();

    public k() {
        if (P.f695h == null) {
            P.f695h = new P(13);
        }
    }

    @Override // io.flutter.plugin.platform.h
    public final void a(io.flutter.view.i iVar) {
        this.f2472j.f2456a = iVar;
    }

    @Override // io.flutter.plugin.platform.h
    public final boolean e(int i2) {
        return false;
    }

    @Override // io.flutter.plugin.platform.h
    public final void f(int i2) {
        if (this.f2473k.get(i2) != null) {
            throw new ClassCastException();
        }
    }

    @Override // io.flutter.plugin.platform.h
    public final void g() {
        this.f2472j.f2456a = null;
    }
}
