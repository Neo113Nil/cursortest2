package io.flutter.plugin.platform;

import E1.C0025a;
import android.app.Activity;
import android.util.SparseArray;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.View;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class q implements k {

    /* renamed from: a, reason: collision with root package name */
    public o f9279a;

    /* renamed from: b, reason: collision with root package name */
    public C0025a f9280b;

    /* renamed from: c, reason: collision with root package name */
    public Activity f9281c;

    /* renamed from: d, reason: collision with root package name */
    public E1.t f9282d;
    public io.flutter.plugin.editing.k f;

    /* renamed from: g, reason: collision with root package name */
    public V0.e f9284g;

    /* renamed from: k, reason: collision with root package name */
    public final V0.e f9288k;

    /* renamed from: e, reason: collision with root package name */
    public FlutterJNI f9283e = null;

    /* renamed from: n, reason: collision with root package name */
    public Surface f9291n = null;
    public SurfaceControl o = null;

    /* renamed from: p, reason: collision with root package name */
    public final HashSet f9292p = new HashSet();

    /* renamed from: q, reason: collision with root package name */
    public final o f9293q = new o(3, this);

    /* renamed from: h, reason: collision with root package name */
    public final C1043a f9285h = new C1043a();

    /* renamed from: i, reason: collision with root package name */
    public final SparseArray f9286i = new SparseArray();

    /* renamed from: j, reason: collision with root package name */
    public final SparseArray f9287j = new SparseArray();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f9289l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f9290m = new ArrayList();

    public q() {
        if (V0.e.f1597e == null) {
            V0.e.f1597e = new V0.e(5);
        }
        this.f9288k = V0.e.f1597e;
    }

    public final boolean a(int i3) {
        g gVar = (g) this.f9286i.get(i3);
        if (gVar == null) {
            return false;
        }
        SparseArray sparseArray = this.f9287j;
        if (sparseArray.get(i3) != null) {
            return true;
        }
        View view = gVar.getView();
        if (view == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        if (view.getParent() != null) {
            throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
        }
        Activity activity = this.f9281c;
        K1.b bVar = new K1.b(activity, activity.getResources().getDisplayMetrics().density, this.f9280b);
        bVar.setOnDescendantFocusChangeListener(new l(this, i3, 1));
        sparseArray.put(i3, bVar);
        view.setImportantForAccessibility(4);
        bVar.addView(view);
        this.f9282d.addView(bVar);
        return true;
    }

    @Override // io.flutter.plugin.platform.k
    public final void c(io.flutter.view.i iVar) {
        this.f9285h.f9244a = iVar;
    }

    @Override // io.flutter.plugin.platform.k
    public final boolean f(int i3) {
        return false;
    }

    @Override // io.flutter.plugin.platform.k
    public final View j(int i3) {
        g gVar = (g) this.f9286i.get(i3);
        if (gVar == null) {
            return null;
        }
        return gVar.getView();
    }

    @Override // io.flutter.plugin.platform.k
    public final void m() {
        this.f9285h.f9244a = null;
    }
}
