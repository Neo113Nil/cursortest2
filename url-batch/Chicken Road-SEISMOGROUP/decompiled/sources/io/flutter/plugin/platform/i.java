package io.flutter.plugin.platform;

import E.v;
import android.app.Activity;
import android.util.SparseArray;
import android.view.Surface;
import android.view.SurfaceControl;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i implements h {

    /* renamed from: b, reason: collision with root package name */
    public F.i f705b;

    /* renamed from: c, reason: collision with root package name */
    public Activity f706c;

    /* renamed from: d, reason: collision with root package name */
    public v f707d;

    /* renamed from: f, reason: collision with root package name */
    public B.k f709f;

    /* renamed from: e, reason: collision with root package name */
    public FlutterJNI f708e = null;

    /* renamed from: l, reason: collision with root package name */
    public Surface f715l = null;

    /* renamed from: m, reason: collision with root package name */
    public SurfaceControl f716m = null;

    /* renamed from: n, reason: collision with root package name */
    public final io.flutter.plugin.editing.a f717n = new io.flutter.plugin.editing.a(3, this);

    /* renamed from: g, reason: collision with root package name */
    public final a f710g = new a();

    /* renamed from: h, reason: collision with root package name */
    public final SparseArray f711h = new SparseArray();

    /* renamed from: i, reason: collision with root package name */
    public final SparseArray f712i = new SparseArray();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f713j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f714k = new ArrayList();

    public i() {
        if (A.a.f0e == null) {
            A.a.f0e = new A.a(2);
        }
    }

    @Override // io.flutter.plugin.platform.h
    public final void b() {
        this.f710g.f694a = null;
    }

    @Override // io.flutter.plugin.platform.h
    public final void d(io.flutter.view.g gVar) {
        this.f710g.f694a = gVar;
    }

    @Override // io.flutter.plugin.platform.h
    public final void f(int i2) {
        if (this.f711h.get(i2) != null) {
            throw new ClassCastException();
        }
    }

    @Override // io.flutter.plugin.platform.h
    public final boolean h(int i2) {
        return false;
    }
}
