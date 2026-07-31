package com.google.android.gms.internal.ads;

import java.util.UUID;

/* loaded from: classes.dex */
public final class a02 implements kv3<String> {
    public static a02 b() {
        a02 a02Var;
        a02Var = zz1.f15360a;
        return a02Var;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* synthetic */ Object a() {
        y2.t.q();
        String uuid = UUID.randomUUID().toString();
        sv3.b(uuid);
        return uuid;
    }
}
