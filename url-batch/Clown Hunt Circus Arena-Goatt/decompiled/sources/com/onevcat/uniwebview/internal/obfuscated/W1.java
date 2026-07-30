package com.onevcat.uniwebview.internal.obfuscated;

import android.graphics.Color;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class W1 extends Lambda implements Function0 {
    public final /* synthetic */ String a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W1(String str, float f, float f2, float f3) {
        super(0);
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        B3 a = G.b.a(this.a);
        if (a != null) {
            float f = this.b;
            float f2 = this.c;
            float f3 = this.d;
            if (a.i) {
                B b = B.b;
                b.a(A.INFO, AbstractC0094p0.a(new StringBuilder("Safe browsing '"), a.b, "' already disposed. Skip setToolbarColor", b, "message"));
            } else {
                float f4 = 255;
                a.l = Integer.valueOf(Color.rgb((int) (f * f4), (int) (f2 * f4), (int) (f3 * f4)));
            }
        }
        return Unit.INSTANCE;
    }
}
