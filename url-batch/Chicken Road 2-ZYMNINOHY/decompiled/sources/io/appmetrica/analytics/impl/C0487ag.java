package io.appmetrica.analytics.impl;

import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.ag, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0487ag implements Wf {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0590eg f11438a;

    public C0487ag(C0590eg c0590eg) {
        this.f11438a = c0590eg;
    }

    @Override // io.appmetrica.analytics.impl.Wf
    public final void a() {
        C0590eg c0590eg = this.f11438a;
        ArrayList arrayList = c0590eg.f11800g;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            C0823ng c0823ng = (C0823ng) obj;
            c0590eg.f11796c.getClass();
            String str = c0823ng != null ? c0823ng.f12464a : null;
            if (!(str == null || str.length() == 0)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        while (i4 < size2) {
            Object obj2 = arrayList2.get(i4);
            i4++;
            if (obj2 != null) {
                arrayList3.add(obj2);
            }
        }
        c0590eg.a(c0590eg.f11796c.a(arrayList3));
    }
}
