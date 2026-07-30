package io.flutter.plugin.platform;

import L.Q;
import android.app.Activity;
import android.util.SparseArray;
import android.view.Surface;
import android.view.SurfaceControl;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;
import java.util.HashSet;
import m0.C0193c;

/* loaded from: classes.dex */
public final class j implements h {

    /* renamed from: e, reason: collision with root package name */
    public d0.j f2464e;

    /* renamed from: f, reason: collision with root package name */
    public Activity f2465f;

    /* renamed from: g, reason: collision with root package name */
    public c0.r f2466g;

    /* renamed from: i, reason: collision with root package name */
    public C0193c f2468i;

    /* renamed from: h, reason: collision with root package name */
    public FlutterJNI f2467h = null;

    /* renamed from: o, reason: collision with root package name */
    public Surface f2474o = null;

    /* renamed from: p, reason: collision with root package name */
    public SurfaceControl f2475p = null;

    /* renamed from: q, reason: collision with root package name */
    public final HashSet f2476q = new HashSet();
    public final A.j r = new A.j(27, this);

    /* renamed from: j, reason: collision with root package name */
    public final a f2469j = new a();

    /* renamed from: k, reason: collision with root package name */
    public final SparseArray f2470k = new SparseArray();

    /* renamed from: l, reason: collision with root package name */
    public final SparseArray f2471l = new SparseArray();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f2472m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f2473n = new ArrayList();

    public j() {
        if (Q.f512h == null) {
            Q.f512h = new Q(8);
        }
    }

    @Override // io.flutter.plugin.platform.h
    public final void a() {
        this.f2469j.f2452a = null;
    }

    @Override // io.flutter.plugin.platform.h
    public final void c(io.flutter.view.h hVar) {
        this.f2469j.f2452a = hVar;
    }

    @Override // io.flutter.plugin.platform.h
    public final void f(int i2) {
        if (this.f2470k.get(i2) != null) {
            throw new ClassCastException();
        }
    }

    @Override // io.flutter.plugin.platform.h
    public final boolean g(int i2) {
        return false;
    }
}
