package com.onevcat.uniwebview.internal.obfuscated;

import android.graphics.Color;
import android.widget.TextView;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.v2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0119v2 extends Lambda implements Function1 {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0119v2(float f, float f2, float f3, float f4) {
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
        it.x = null;
        C0133z0 c0133z0 = it.w;
        float f = this.a;
        float f2 = this.b;
        float f3 = this.c;
        float f4 = this.d;
        c0133z0.getClass();
        float f5 = 255;
        int argb = Color.argb((int) (f4 * f5), (int) (f * f5), (int) (f2 * f5), (int) (f3 * f5));
        Iterator it2 = c0133z0.e.iterator();
        while (it2.hasNext()) {
            ((TextView) it2.next()).setTextColor(argb);
        }
        return Unit.INSTANCE;
    }
}
