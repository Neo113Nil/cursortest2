package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.sA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3888sA implements InterfaceC3673oA {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f34206a = new ArrayList();

    @Override // com.google.android.gms.internal.ads.InterfaceC3673oA
    public final synchronized void d(HashMap hashMap, Context context, View view) {
        ArrayList arrayList = this.f34206a;
        hashMap.put(com.anythink.expressad.foundation.d.d.f18715E, new ArrayList(arrayList));
        arrayList.clear();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3673oA
    public final void b(HashMap hashMap) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3673oA
    public final void c(HashMap hashMap) {
    }
}
