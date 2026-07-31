package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.e3;
import com.chartboost.sdk.internal.Model.CBError;
import java.io.File;
import java.util.HashMap;

/* loaded from: classes9.dex */
public class a2 extends e3 {
    public final a7 k;
    public final j3 l;
    public final z1 m;
    public final String n;

    public a2(a7 a7Var, j3 j3Var, z1 z1Var, File file, String str) {
        super(e3.c.b, z1Var.d, af.e, file);
        this.i = e3.b.c;
        this.k = a7Var;
        this.l = j3Var;
        this.m = z1Var;
        this.n = str;
    }

    @Override // com.chartboost.sdk.impl.e3
    public void a(CBError cBError, h3 h3Var) {
        this.k.a(this, cBError, h3Var);
    }

    @Override // com.chartboost.sdk.impl.e3
    public void a(Void r1, h3 h3Var) {
        this.k.a(this, null, null);
    }

    @Override // com.chartboost.sdk.impl.e3
    public f3 a() {
        HashMap hashMap = new HashMap();
        hashMap.put("X-Chartboost-App", this.n);
        hashMap.put("X-Chartboost-Client", p3.b());
        hashMap.put("X-Chartboost-Reachability", Integer.toString(this.l.c().b()));
        return new f3(hashMap, null, null);
    }
}
