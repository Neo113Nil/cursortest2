package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class S1 extends Lambda implements Function0 {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S1(String str, boolean z, String str2) {
        super(0);
        this.a = str;
        this.b = z;
        this.c = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        B3 a = G.b.a(this.a);
        if (a != null) {
            boolean z = this.b;
            String str = this.c;
            if (a.i) {
                B b = B.b;
                b.a(A.INFO, AbstractC0094p0.a(new StringBuilder("Safe browsing '"), a.b, "' already disposed. Skip setPrefetch", b, "message"));
            } else if (z) {
                if (str == null || str.length() == 0) {
                    str = a.c;
                }
                a.y = str;
                B b2 = B.b;
                String message = "Preloading " + a.y + '.';
                b2.getClass();
                Intrinsics.checkNotNullParameter(message, "message");
                b2.a(A.DEBUG, message);
                a.a();
            } else {
                a.y = null;
            }
        }
        return Unit.INSTANCE;
    }
}
