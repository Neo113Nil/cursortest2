package com.onevcat.uniwebview;

import android.graphics.Color;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class t2 extends Lambda implements Function0 {
    public final /* synthetic */ String a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(String str, float f, float f2, float f3) {
        super(0);
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        t tVar = t.b;
        String name = this.a;
        tVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        f5 f5Var = (f5) tVar.a.get(name);
        if (f5Var != null) {
            float f = 255;
            f5Var.g = Integer.valueOf(Color.rgb((int) (this.b * f), (int) (this.c * f), (int) (this.d * f)));
        }
        return Unit.INSTANCE;
    }
}
