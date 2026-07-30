package com.baidu.platform.comapi.map.d0.f;

import android.util.Pair;
import android.view.MotionEvent;
import com.baidu.platform.comapi.map.MapController;
import com.baidu.platform.comapi.map.d0.a;
import com.baidu.platform.comapi.map.d0.e.b;
import com.github.mikephil.charting.utils.i;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes2.dex */
public class b implements b.a {

    /* renamed from: a, reason: collision with root package name */
    private LinkedList<a.C0115a> f9639a = new LinkedList<>();

    /* renamed from: b, reason: collision with root package name */
    private com.baidu.platform.comapi.map.d0.d f9640b;

    /* renamed from: c, reason: collision with root package name */
    private MapController f9641c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f9642d;

    /* renamed from: e, reason: collision with root package name */
    private a f9643e;

    /* renamed from: f, reason: collision with root package name */
    private int f9644f;

    public b(MapController mapController) {
        com.baidu.platform.comapi.map.d0.d dVar = new com.baidu.platform.comapi.map.d0.d();
        this.f9640b = dVar;
        this.f9642d = false;
        this.f9641c = mapController;
        this.f9644f = dVar.f9625c / 3;
    }

    private void c(com.baidu.platform.comapi.map.d0.e.b bVar) {
        if (this.f9641c.isOverlookGestureEnable()) {
            this.f9643e.a(bVar, (Pair<a.d, a.d>) null);
            c cVar = new c(this.f9641c);
            this.f9643e = cVar;
            cVar.a(bVar);
        }
    }

    private void d(com.baidu.platform.comapi.map.d0.e.b bVar) {
        if (this.f9639a.size() < 5) {
            this.f9639a.addLast(bVar.f9633c);
            this.f9640b.a(bVar.f9634d);
        } else if (!this.f9642d && this.f9639a.size() == 5 && a()) {
            c(bVar);
        }
    }

    @Override // com.baidu.platform.comapi.map.d0.e.b.a
    public boolean a(com.baidu.platform.comapi.map.d0.e.b bVar, MotionEvent motionEvent) {
        d(bVar);
        if (this.f9639a.size() == 1) {
            this.f9643e.a(bVar);
        }
        this.f9643e.a(bVar, motionEvent);
        return true;
    }

    @Override // com.baidu.platform.comapi.map.d0.e.b.a
    public boolean b(com.baidu.platform.comapi.map.d0.e.b bVar) {
        this.f9639a.clear();
        this.f9640b.b();
        this.f9643e = new d(this.f9641c);
        this.f9642d = false;
        return true;
    }

    @Override // com.baidu.platform.comapi.map.d0.e.b.a
    public boolean a(com.baidu.platform.comapi.map.d0.e.b bVar) {
        Pair<a.d, a.d> c8 = this.f9640b.c();
        this.f9640b.a();
        this.f9643e.a(bVar, c8);
        return true;
    }

    private boolean a() {
        int a8;
        double a9;
        this.f9642d = true;
        Iterator<a.C0115a> it = this.f9639a.iterator();
        while (it.hasNext()) {
            Double valueOf = Double.valueOf(a.d.a(com.baidu.platform.comapi.map.d0.a.f9592a.c(), it.next().c()));
            if (Math.abs(valueOf.doubleValue()) > 45.0d && Math.abs(valueOf.doubleValue()) < 135.0d) {
                return false;
            }
        }
        Pair<a.d, a.d> c8 = this.f9640b.c();
        a.d dVar = (a.d) c8.first;
        a.d dVar2 = (a.d) c8.second;
        boolean z7 = Math.abs(dVar.f9603b) > ((double) this.f9644f) && Math.abs(dVar2.f9603b) > ((double) this.f9644f);
        a.C0115a first = this.f9639a.getFirst();
        a.C0115a last = this.f9639a.getLast();
        a.C0115a c0115a = new a.C0115a(last.f9595a, first.f9595a);
        a.C0115a c0115a2 = new a.C0115a(last.f9596b, first.f9596b);
        if (dVar.f9603b > i.DOUBLE_EPSILON && dVar2.f9603b > i.DOUBLE_EPSILON) {
            a.d c9 = c0115a.c();
            a.C0115a c0115a3 = com.baidu.platform.comapi.map.d0.a.f9594c;
            a8 = (int) a.d.a(c9, c0115a3.c());
            a9 = a.d.a(c0115a2.c(), c0115a3.c());
        } else {
            a.d c10 = c0115a.c();
            a.C0115a c0115a4 = com.baidu.platform.comapi.map.d0.a.f9593b;
            a8 = (int) a.d.a(c10, c0115a4.c());
            a9 = a.d.a(c0115a2.c(), c0115a4.c());
        }
        return z7 && (Math.abs(a8) < 40 && Math.abs((int) a9) < 40);
    }
}
