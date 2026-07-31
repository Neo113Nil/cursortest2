package com.onevcat.uniwebview;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class y3 extends Lambda implements Function1 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(String str, String str2) {
        super(1);
        this.a = str;
        this.b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s0 it = (s0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        b0 b0Var = it.p;
        String key = this.a;
        String str = this.b;
        b0Var.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        if (StringsKt.isBlank(key)) {
            o oVar = o.b;
            oVar.getClass();
            Intrinsics.checkNotNullParameter("Trying to set null or empty key for header field. Please check you have set correct key.", "message");
            oVar.a(n.CRITICAL, "Trying to set null or empty key for header field. Please check you have set correct key.");
        } else if (str == null) {
            b0Var.e.g.remove(key);
        } else {
            b0Var.e.g.put(key, str);
        }
        return Unit.INSTANCE;
    }
}
