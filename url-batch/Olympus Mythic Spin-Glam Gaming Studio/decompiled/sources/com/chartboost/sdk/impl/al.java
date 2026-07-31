package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.e3;
import com.chartboost.sdk.internal.Model.CBError;
import java.io.File;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class al extends e3 {
    public final j3 k;
    public final a l;
    public final String m;

    public interface a {
        void a(String str, String str2);

        void a(String str, String str2, long j, t0 t0Var);

        void a(String str, String str2, CBError cBError);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al(j3 j3Var, File outputFile, String uri, a aVar, af priority, String appId) {
        super(e3.c.b, uri, priority, outputFile);
        Intrinsics.checkNotNullParameter(outputFile, "outputFile");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(appId, "appId");
        this.k = j3Var;
        this.l = aVar;
        this.m = appId;
        this.i = e3.b.c;
    }

    @Override // com.chartboost.sdk.impl.e3
    public f3 a() {
        HashMap hashMap = new HashMap();
        hashMap.put("X-Chartboost-App", this.m);
        hashMap.put("X-Chartboost-Client", p3.b());
        j3 j3Var = this.k;
        hashMap.put("X-Chartboost-Reachability", String.valueOf(j3Var != null ? j3Var.c() : null));
        return new f3(hashMap, null, null);
    }

    @Override // com.chartboost.sdk.impl.e3
    public void a(CBError cBError, h3 h3Var) {
        a aVar = this.l;
        if (aVar != null) {
            String e = e();
            File file = this.d;
            Intrinsics.checkNotNull(file);
            String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            aVar.a(e, name, cBError);
        }
    }

    @Override // com.chartboost.sdk.impl.e3
    public void a(Object obj, h3 h3Var) {
        a aVar = this.l;
        if (aVar != null) {
            String e = e();
            File file = this.d;
            Intrinsics.checkNotNull(file);
            String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            aVar.a(e, name);
        }
    }

    @Override // com.chartboost.sdk.impl.e3
    public void a(String uri, long j) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        a aVar = this.l;
        if (aVar != null) {
            File file = this.d;
            Intrinsics.checkNotNull(file);
            String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            aVar.a(uri, name, j, null);
        }
    }
}
