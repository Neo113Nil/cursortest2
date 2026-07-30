package com.google.android.gms.internal.ads;

import java.util.LinkedList;

/* renamed from: com.google.android.gms.internal.ads.ru, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3871ru {

    /* renamed from: b, reason: collision with root package name */
    public final int f34138b;

    /* renamed from: c, reason: collision with root package name */
    public final int f34139c;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f34137a = new LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public final Eu f34140d = new Eu();

    public C3871ru(int i, int i4) {
        this.f34138b = i;
        this.f34139c = i4;
    }

    public final void a() {
        while (true) {
            LinkedList linkedList = this.f34137a;
            if (linkedList.isEmpty()) {
                return;
            }
            C4141wu c4141wu = (C4141wu) linkedList.getFirst();
            p2.j.f39798C.f39810k.getClass();
            if (System.currentTimeMillis() - c4141wu.f35088d < this.f34139c) {
                return;
            }
            Eu eu = this.f34140d;
            eu.f24847f++;
            eu.f24843b.f24602u++;
            linkedList.remove();
        }
    }
}
