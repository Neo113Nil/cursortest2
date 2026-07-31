package com.onevcat.uniwebview;

import com.adjust.sdk.Constants;
import com.imaginationoverflow.unity.referrer.BuildConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class i2 extends Lambda implements Function1 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(String str, String str2) {
        super(1);
        this.a = str;
        this.b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s0 it = (s0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        b0 b0Var = it.p;
        String str = this.a;
        String str2 = this.b;
        b0Var.getClass();
        o oVar = o.b;
        oVar.a(n.INFO, d.a("UniWebView will load HTML string with base url: ", str2, oVar, "message"));
        String message = "Input HTML content: \n" + str;
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.VERBOSE, message);
        o0 o0Var = b0Var.e;
        o0Var.f = 200;
        o0Var.d = true;
        o0Var.c = false;
        o0Var.e = false;
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        b0Var.loadDataWithBaseURL(str2, str, "text/html", Constants.ENCODING, null);
        return Unit.INSTANCE;
    }
}
