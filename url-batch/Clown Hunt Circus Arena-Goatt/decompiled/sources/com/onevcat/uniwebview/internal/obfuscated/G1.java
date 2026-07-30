package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class G1 extends Lambda implements Function0 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G1(String str, String str2) {
        super(0);
        this.a = str;
        this.b = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        B3 a = G.b.a(this.a);
        String str = this.b;
        if (str != null && str.length() != 0 && a != null) {
            String url = this.b;
            Intrinsics.checkNotNullParameter(url, "url");
            if (a.i) {
                B b = B.b;
                b.a(A.INFO, AbstractC0094p0.a(new StringBuilder("Safe browsing '"), a.b, "' already disposed. Skip setUrl", b, "message"));
            } else {
                String str2 = a.c;
                a.c = url;
                String str3 = a.y;
                if (str3 != null && Intrinsics.areEqual(str3, str2)) {
                    a.y = url;
                    a.a();
                }
            }
        }
        return Unit.INSTANCE;
    }
}
