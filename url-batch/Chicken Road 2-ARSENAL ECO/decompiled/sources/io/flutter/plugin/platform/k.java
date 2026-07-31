package io.flutter.plugin.platform;

import D3.AbstractActivityC0117e;
import D3.M;
import D3.t;
import android.util.SparseArray;
import android.view.Surface;
import android.view.SurfaceControl;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;
import java.util.HashSet;
import u0.C0675e;

/* loaded from: classes.dex */
public final class k implements i {

    /* renamed from: f, reason: collision with root package name */
    public E3.j f4561f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractActivityC0117e f4562g;

    /* renamed from: h, reason: collision with root package name */
    public t f4563h;

    /* renamed from: j, reason: collision with root package name */
    public M f4565j;

    /* renamed from: i, reason: collision with root package name */
    public FlutterJNI f4564i = null;

    /* renamed from: p, reason: collision with root package name */
    public Surface f4571p = null;

    /* renamed from: q, reason: collision with root package name */
    public SurfaceControl f4572q = null;

    /* renamed from: r, reason: collision with root package name */
    public final HashSet f4573r = new HashSet();

    /* renamed from: s, reason: collision with root package name */
    public final a6.d f4574s = new a6.d(this);

    /* renamed from: k, reason: collision with root package name */
    public final a f4566k = new a();

    /* renamed from: l, reason: collision with root package name */
    public final SparseArray f4567l = new SparseArray();

    /* renamed from: m, reason: collision with root package name */
    public final SparseArray f4568m = new SparseArray();

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f4569n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f4570o = new ArrayList();

    public k() {
        if (C0675e.f5972d == null) {
            C0675e.f5972d = new C0675e(2);
        }
    }

    @Override // io.flutter.plugin.platform.i
    public final void c(io.flutter.view.i iVar) {
        this.f4566k.f4549a = iVar;
    }

    @Override // io.flutter.plugin.platform.i
    public final boolean g(int i7) {
        return false;
    }

    @Override // io.flutter.plugin.platform.i
    public final void i(int i7) {
        if (this.f4567l.get(i7) != null) {
            throw new ClassCastException();
        }
    }

    @Override // io.flutter.plugin.platform.i
    public final void k() {
        this.f4566k.f4549a = null;
    }
}
