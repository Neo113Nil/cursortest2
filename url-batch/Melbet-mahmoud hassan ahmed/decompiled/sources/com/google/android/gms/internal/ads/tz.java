package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class tz extends l90 {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ uz f12417f;

    /* synthetic */ tz(uz uzVar, sz szVar) {
        this.f12417f = uzVar;
    }

    @Override // com.google.android.gms.internal.ads.m90
    public final void j3(List<f90> list) {
        x2.b t6;
        ArrayList arrayList;
        ArrayList arrayList2;
        this.f12417f.f13046d = false;
        this.f12417f.f13047e = true;
        uz uzVar = this.f12417f;
        t6 = uz.t(list);
        arrayList = uz.e().f13043a;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((x2.c) arrayList.get(i7)).a(t6);
        }
        arrayList2 = uz.e().f13043a;
        arrayList2.clear();
    }
}
