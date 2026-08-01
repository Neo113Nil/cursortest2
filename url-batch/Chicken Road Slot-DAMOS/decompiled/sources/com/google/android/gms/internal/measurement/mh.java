package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class mh {

    /* renamed from: e, reason: collision with root package name */
    public static final kh f2547e;

    /* renamed from: f, reason: collision with root package name */
    public static final lh f2548f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2549a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f2550b;

    /* renamed from: c, reason: collision with root package name */
    public final kh f2551c;

    /* renamed from: d, reason: collision with root package name */
    public lh f2552d;

    static {
        int i3 = 0;
        f2547e = new kh(i3);
        f2548f = new lh(i3);
    }

    public mh(mh mhVar) {
        HashMap hashMap = new HashMap();
        this.f2549a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f2550b = hashMap2;
        hashMap.putAll(mhVar.f2549a);
        hashMap2.putAll(mhVar.f2550b);
        this.f2551c = mhVar.f2551c;
        this.f2552d = mhVar.f2552d;
    }

    public void a(vg vgVar, Object obj, hh hhVar) {
        kh khVar = (kh) this.f2549a.get(vgVar);
        if (khVar != null) {
            khVar.a(vgVar, obj, hhVar);
        } else {
            this.f2551c.a(vgVar, obj, hhVar);
        }
    }

    public void b(vg vgVar, Iterator it, hh hhVar) {
        lh lhVar = (lh) this.f2550b.get(vgVar);
        if (lhVar != null) {
            lhVar.a(vgVar, it, hhVar);
            return;
        }
        lh lhVar2 = this.f2552d;
        if (lhVar2 != null && !this.f2549a.containsKey(vgVar)) {
            lhVar2.a(vgVar, it, hhVar);
        } else {
            while (it.hasNext()) {
                a(vgVar, it.next(), hhVar);
            }
        }
    }

    public /* synthetic */ mh() {
        this.f2549a = new HashMap();
        this.f2550b = new HashMap();
        this.f2552d = null;
        this.f2551c = hg.f2382d;
    }
}
