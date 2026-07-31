package io.appmetrica.analytics.impl;

import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.ac, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2489ac {

    /* renamed from: a, reason: collision with root package name */
    public final C2507b3 f38669a;

    /* renamed from: b, reason: collision with root package name */
    public final C2795m2 f38670b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f38671c;

    public C2489ac(C2507b3 c2507b3, C2795m2 c2795m2) {
        ArrayList arrayList = new ArrayList();
        this.f38671c = arrayList;
        this.f38669a = c2507b3;
        arrayList.add(c2507b3);
        this.f38670b = c2795m2;
        arrayList.add(c2795m2);
    }

    public final synchronized void a() {
        ArrayList arrayList = this.f38671c;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((InterfaceC2968sk) obj).onCreate();
        }
    }

    public final synchronized void a(Ha ha) {
        this.f38671c.add(ha);
    }
}
