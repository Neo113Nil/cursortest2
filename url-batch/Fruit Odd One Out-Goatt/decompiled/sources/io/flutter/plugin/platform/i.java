package io.flutter.plugin.platform;

import android.util.SparseArray;
import android.view.Surface;
import android.view.SurfaceControl;
import e0.u;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class i implements h {

    /* renamed from: b, reason: collision with root package name */
    public f0.k f500b;

    /* renamed from: c, reason: collision with root package name */
    public e0.f f501c;

    /* renamed from: d, reason: collision with root package name */
    public u f502d;

    /* renamed from: f, reason: collision with root package name */
    public androidx.lifecycle.n f504f;

    /* renamed from: e, reason: collision with root package name */
    public FlutterJNI f503e = null;

    /* renamed from: l, reason: collision with root package name */
    public Surface f510l = null;
    public SurfaceControl m = null;

    /* renamed from: n, reason: collision with root package name */
    public final HashSet f511n = new HashSet();

    /* renamed from: o, reason: collision with root package name */
    public final androidx.lifecycle.n f512o = new androidx.lifecycle.n(9, this);

    /* renamed from: g, reason: collision with root package name */
    public final a f505g = new a();

    /* renamed from: h, reason: collision with root package name */
    public final SparseArray f506h = new SparseArray();

    /* renamed from: i, reason: collision with root package name */
    public final SparseArray f507i = new SparseArray();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f508j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f509k = new ArrayList();

    public i() {
        if (c0.a.f63f == null) {
            c0.a.f63f = new c0.a(3);
        }
    }

    @Override // io.flutter.plugin.platform.h
    public final void b() {
        this.f505g.f488a = null;
    }

    @Override // io.flutter.plugin.platform.h
    public final void e(io.flutter.view.i iVar) {
        this.f505g.f488a = iVar;
    }

    @Override // io.flutter.plugin.platform.h
    public final boolean k(int i2) {
        return false;
    }

    @Override // io.flutter.plugin.platform.h
    public final void q(int i2) {
        if (this.f506h.get(i2) == null) {
            return;
        }
        f0.l.a();
    }
}
