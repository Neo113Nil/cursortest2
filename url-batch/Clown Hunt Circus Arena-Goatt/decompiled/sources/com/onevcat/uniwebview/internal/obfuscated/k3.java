package com.onevcat.uniwebview.internal.obfuscated;

import android.graphics.Rect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class k3 extends Lambda implements Function1 {
    public final /* synthetic */ long a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(long j, int i, int i2, int i3, int i4) {
        super(1);
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.onevcat.uniwebview.d it = (com.onevcat.uniwebview.d) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        long j = this.a;
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        int i4 = this.e;
        it.getClass();
        Rect rect = (i == -1 && i2 == -1 && i3 == -1 && i4 == -1) ? null : new Rect(i, i2, i3 + i, i4 + i2);
        it.a(j);
        it.o.put(Long.valueOf(j), new C0105s0(j, j, rect));
        return Boolean.TRUE;
    }
}
