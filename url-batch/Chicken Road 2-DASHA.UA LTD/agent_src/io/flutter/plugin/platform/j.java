package io.flutter.plugin.platform;

import D.u;
import D.y;
import android.app.Activity;
import android.util.SparseArray;
import android.view.Surface;
import android.view.SurfaceControl;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j implements i {

    /* renamed from: b, reason: collision with root package name */
    public E.i f652b;

    /* renamed from: c, reason: collision with root package name */
    public Activity f653c;

    /* renamed from: d, reason: collision with root package name */
    public y f654d;

    /* renamed from: f, reason: collision with root package name */
    public u f656f;

    /* renamed from: e, reason: collision with root package name */
    public FlutterJNI f655e = null;

    /* renamed from: l, reason: collision with root package name */
    public Surface f662l = null;

    /* renamed from: m, reason: collision with root package name */
    public SurfaceControl f663m = null;

    /* renamed from: n, reason: collision with root package name */
    public final c f664n = new c(2, this);

    /* renamed from: g, reason: collision with root package name */
    public final a f657g = new a();

    /* renamed from: h, reason: collision with root package name */
    public final SparseArray f658h = new SparseArray();

    /* renamed from: i, reason: collision with root package name */
    public final SparseArray f659i = new SparseArray();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f660j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f661k = new ArrayList();

    public j() {
        if (B.a.f0e == null) {
            B.a.f0e = new B.a(2);
        }
    }

    @Override // io.flutter.plugin.platform.i
    public final void b() {
        this.f657g.f639a = null;
    }

    @Override // io.flutter.plugin.platform.i
    public final void d(io.flutter.view.h hVar) {
        this.f657g.f639a = hVar;
    }

    @Override // io.flutter.plugin.platform.i
    public final void f(int i2) {
        if (this.f658h.get(i2) != null) {
            throw new ClassCastException();
        }
    }

    @Override // io.flutter.plugin.platform.i
    public final boolean h(int i2) {
        return false;
    }
}
