package io.flutter.plugin.platform;

import android.util.SparseArray;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.View;
import h4.AbstractActivityC0488c;
import h4.C0486a;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;
import java.util.HashSet;
import n4.C0758a;

/* loaded from: classes.dex */
public final class t implements m {

    /* renamed from: d, reason: collision with root package name */
    public q f5730d;

    /* renamed from: e, reason: collision with root package name */
    public C0486a f5731e;

    /* renamed from: i, reason: collision with root package name */
    public AbstractActivityC0488c f5732i;

    /* renamed from: l, reason: collision with root package name */
    public h4.p f5733l;

    /* renamed from: n, reason: collision with root package name */
    public io.flutter.plugin.editing.i f5735n;

    /* renamed from: o, reason: collision with root package name */
    public P0.l f5736o;

    /* renamed from: s, reason: collision with root package name */
    public final P0.c f5740s;

    /* renamed from: m, reason: collision with root package name */
    public FlutterJNI f5734m = null;

    /* renamed from: v, reason: collision with root package name */
    public Surface f5743v = null;

    /* renamed from: w, reason: collision with root package name */
    public SurfaceControl f5744w = null;

    /* renamed from: x, reason: collision with root package name */
    public final HashSet f5745x = new HashSet();

    /* renamed from: y, reason: collision with root package name */
    public final q f5746y = new q(3, this);

    /* renamed from: p, reason: collision with root package name */
    public final C0555a f5737p = new C0555a();

    /* renamed from: q, reason: collision with root package name */
    public final SparseArray f5738q = new SparseArray();

    /* renamed from: r, reason: collision with root package name */
    public final SparseArray f5739r = new SparseArray();

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f5741t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f5742u = new ArrayList();

    public t() {
        if (P0.c.f2186l == null) {
            P0.c.f2186l = new P0.c(7);
        }
        this.f5740s = P0.c.f2186l;
    }

    public final boolean a(int i2) {
        InterfaceC0561g interfaceC0561g = (InterfaceC0561g) this.f5738q.get(i2);
        if (interfaceC0561g == null) {
            return false;
        }
        SparseArray sparseArray = this.f5739r;
        if (sparseArray.get(i2) != null) {
            return true;
        }
        View view = interfaceC0561g.getView();
        if (view == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        if (view.getParent() != null) {
            throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
        }
        AbstractActivityC0488c abstractActivityC0488c = this.f5732i;
        C0758a c0758a = new C0758a(abstractActivityC0488c, abstractActivityC0488c.getResources().getDisplayMetrics().density, this.f5731e);
        c0758a.setOnDescendantFocusChangeListener(new n(this, i2, 1));
        sparseArray.put(i2, c0758a);
        view.setImportantForAccessibility(4);
        c0758a.addView(view);
        this.f5733l.addView(c0758a);
        return true;
    }

    @Override // io.flutter.plugin.platform.m
    public final void d(io.flutter.view.g gVar) {
        this.f5737p.f5690a = gVar;
    }

    @Override // io.flutter.plugin.platform.m
    public final boolean j(int i2) {
        return false;
    }

    @Override // io.flutter.plugin.platform.m
    public final View m(int i2) {
        InterfaceC0561g interfaceC0561g = (InterfaceC0561g) this.f5738q.get(i2);
        if (interfaceC0561g == null) {
            return null;
        }
        return interfaceC0561g.getView();
    }

    @Override // io.flutter.plugin.platform.m
    public final void q() {
        this.f5737p.f5690a = null;
    }
}
