package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class M0 extends Lambda implements Function0 {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M0(String str, boolean z) {
        super(0);
        this.a = str;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C0040d c0040d = C0040d.b;
        String name = this.a;
        c0040d.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        T t = (T) c0040d.a.get(name);
        if (t != null) {
            t.i = this.b;
        }
        return Unit.INSTANCE;
    }
}
