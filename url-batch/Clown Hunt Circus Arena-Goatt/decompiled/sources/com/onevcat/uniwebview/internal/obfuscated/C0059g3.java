package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.g3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0059g3 extends Lambda implements Function1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0059g3(boolean z, int i, float f, String str) {
        super(1);
        this.a = z;
        this.b = i;
        this.c = f;
        this.d = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.onevcat.uniwebview.d it = (com.onevcat.uniwebview.d) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(it.a(true, this.a, this.b, this.c, this.d));
    }
}
