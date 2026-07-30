package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.Ii, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2606Ii implements InterfaceC2470Ai {

    /* renamed from: a, reason: collision with root package name */
    public final Context f25583a;

    /* renamed from: b, reason: collision with root package name */
    public final t2.E f25584b = p2.j.f39798C.f39808h.g();

    public C2606Ii(Context context) {
        this.f25583a = context;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2470Ai
    public final void a(HashMap hashMap) {
        String str;
        if (hashMap.isEmpty() || (str = (String) hashMap.get("gad_idless")) == null) {
            return;
        }
        boolean parseBoolean = Boolean.parseBoolean(str);
        this.f25584b.s(parseBoolean);
        if (parseBoolean) {
            com.bumptech.glide.h.E(this.f25583a);
        }
    }
}
