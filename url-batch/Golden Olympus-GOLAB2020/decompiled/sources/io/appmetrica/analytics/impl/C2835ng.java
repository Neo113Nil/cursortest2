package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* renamed from: io.appmetrica.analytics.impl.ng, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2835ng implements InterfaceC2731jg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2938rg f39516a;

    public C2835ng(C2938rg c2938rg) {
        this.f39516a = c2938rg;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2731jg
    public final void a() {
        C2938rg c2938rg = this.f39516a;
        ArrayList arrayList = c2938rg.f39736g;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            Ag ag = (Ag) obj;
            c2938rg.f39732c.getClass();
            String str = ag != null ? ag.f37183a : null;
            if (!(str == null || str.length() == 0)) {
                arrayList2.add(obj);
            }
        }
        c2938rg.a(c2938rg.f39732c.a(CollectionsKt.filterNotNull(arrayList2)));
    }
}
