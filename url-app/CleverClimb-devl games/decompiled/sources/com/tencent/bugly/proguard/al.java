package com.tencent.bugly.proguard;

import java.util.ArrayList;
import java.util.Collection;

/* compiled from: BUGLY */
/* loaded from: classes2.dex */
public final class al extends k implements Cloneable {

    /* renamed from: b, reason: collision with root package name */
    private static ArrayList<ak> f8714b;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList<ak> f8715a = null;

    @Override // com.tencent.bugly.proguard.k
    public final void a(StringBuilder sb, int i) {
    }

    @Override // com.tencent.bugly.proguard.k
    public final void a(j jVar) {
        jVar.a((Collection) this.f8715a, 0);
    }

    @Override // com.tencent.bugly.proguard.k
    public final void a(i iVar) {
        if (f8714b == null) {
            f8714b = new ArrayList<>();
            f8714b.add(new ak());
        }
        this.f8715a = (ArrayList) iVar.a((i) f8714b, 0, true);
    }
}
