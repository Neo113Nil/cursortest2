package com.onevcat.uniwebview.internal.obfuscated;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.q2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0100q2 extends Lambda implements Function1 {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0100q2(float f, float f2, float f3, float f4) {
        super(1);
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.onevcat.uniwebview.d it = (com.onevcat.uniwebview.d) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        float f = this.a;
        float f2 = this.b;
        float f3 = this.c;
        float f4 = this.d;
        it.getClass();
        float coerceAtLeast = RangesKt.coerceAtLeast(f, 0.0f);
        float coerceAtLeast2 = RangesKt.coerceAtLeast(f2, 0.0f);
        float coerceAtLeast3 = RangesKt.coerceAtLeast(f3, 0.0f);
        float coerceAtLeast4 = RangesKt.coerceAtLeast(f4, 0.0f);
        C0101r0 c0101r0 = new C0101r0(coerceAtLeast, coerceAtLeast2, coerceAtLeast3, coerceAtLeast4);
        if (!Intrinsics.areEqual(it.u, c0101r0)) {
            it.u = c0101r0;
            it.z.a(coerceAtLeast, coerceAtLeast2, coerceAtLeast3, coerceAtLeast4);
            D3 d3 = it.y;
            d3.getClass();
            float[] fArr = {RangesKt.coerceAtLeast(coerceAtLeast, 0.0f), RangesKt.coerceAtLeast(coerceAtLeast2, 0.0f), RangesKt.coerceAtLeast(coerceAtLeast3, 0.0f), RangesKt.coerceAtLeast(coerceAtLeast4, 0.0f)};
            if (!Arrays.equals(d3.b, fArr)) {
                d3.b = fArr;
                d3.invalidate();
            }
            it.f();
        }
        return Unit.INSTANCE;
    }
}
