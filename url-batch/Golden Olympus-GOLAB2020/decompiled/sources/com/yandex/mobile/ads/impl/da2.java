package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.huawei.hms.framework.common.ExceptionCode;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Map;
import java.util.Random;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
final class da2 extends kotlin.jvm.internal.s implements Function1<cn1, cn1> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ea2 f24531b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ x92 f24532c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2286v2 f24533d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Context f24534e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    da2(ea2 ea2Var, x92 x92Var, C2286v2 c2286v2, Context context) {
        super(1);
        this.f24531b = ea2Var;
        this.f24532c = x92Var;
        this.f24533d = c2286v2;
        this.f24534e = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        dn1 dn1Var;
        zw1 zw1Var;
        up upVar;
        cn1 queryParams = (cn1) obj;
        Intrinsics.checkNotNullParameter(queryParams, "queryParams");
        ea2 ea2Var = this.f24531b;
        x92 x92Var = this.f24532c;
        C2286v2 c2286v2 = this.f24533d;
        Context context = this.f24534e;
        queryParams.a(com.ironsource.cc.f15720M, "UTF-8");
        dn1Var = ea2Var.f25161a;
        dn1Var.getClass();
        queryParams.a("rnd", String.valueOf(new Random().nextInt(89999999) + ExceptionCode.CRASH_EXCEPTION));
        Map<String, String> a4 = x92Var.a();
        if (a4 != null) {
            for (Map.Entry<String, String> entry : a4.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!StringsKt.z(key)) {
                    queryParams.a(key, value);
                }
            }
        }
        d50 j4 = c2286v2.j();
        zw1Var = ea2Var.f25163c;
        zw1Var.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        if (!zw1.a(context)) {
            queryParams.a(CommonUrlParts.UUID, j4.g());
            queryParams.a("mauid", j4.e());
        }
        upVar = ea2Var.f25162b;
        upVar.getClass();
        up.a(context, queryParams);
        new f50(context, c2286v2).a(context, queryParams);
        return queryParams;
    }
}
