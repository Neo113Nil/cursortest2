package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.w2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0123w2 extends Lambda implements Function1 {
    public final /* synthetic */ String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0123w2(String str) {
        super(1);
        this.a = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.onevcat.uniwebview.d it = (com.onevcat.uniwebview.d) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        String json = this.a;
        it.getClass();
        Intrinsics.checkNotNullParameter(json, "json");
        boolean z = true;
        if (!Intrinsics.areEqual(json, it.x)) {
            C0132z a = r.a(json);
            if (a == null) {
                z = false;
            } else {
                it.c(a.a);
                it.b(a.b != EnumC0116v.Bottom);
                C0133z0 c0133z0 = it.w;
                Float f = a.c;
                c0133z0.setMaxHeight(f == null ? Integer.MAX_VALUE : Math.max(0, (int) f.floatValue()));
                it.w.a(a);
                it.z.requestLayout();
                it.x = json;
            }
        }
        return Boolean.valueOf(z);
    }
}
