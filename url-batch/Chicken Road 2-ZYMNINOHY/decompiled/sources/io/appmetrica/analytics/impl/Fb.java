package io.appmetrica.analytics.impl;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class Fb {

    /* renamed from: a, reason: collision with root package name */
    public final O2 f10275a;

    /* renamed from: b, reason: collision with root package name */
    public final C0628g2 f10276b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f10277c;

    public Fb(O2 o22, C0628g2 c0628g2) {
        ArrayList arrayList = new ArrayList();
        this.f10277c = arrayList;
        this.f10275a = o22;
        arrayList.add(o22);
        this.f10276b = c0628g2;
        arrayList.add(c0628g2);
    }

    public final synchronized void a() {
        ArrayList arrayList = this.f10277c;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((InterfaceC0775lk) obj).onCreate();
        }
    }

    public final synchronized void a(C0791ma c0791ma) {
        this.f10277c.add(c0791ma);
    }
}
