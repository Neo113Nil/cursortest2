package com.onevcat.uniwebview.internal.obfuscated;

import android.webkit.WebSettings;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.o2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0092o2 extends Lambda implements Function1 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0092o2(int i) {
        super(1);
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.onevcat.uniwebview.d it = (com.onevcat.uniwebview.d) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        WebSettings settings = it.v.getSettings();
        int i = com.onevcat.uniwebview.a.o;
        int i2 = this.a;
        int i3 = 2;
        if (i2 != 1) {
            if (i2 != 2) {
                i3 = 3;
                if (i2 != 3) {
                    i3 = -1;
                }
            } else {
                i3 = 1;
            }
        }
        settings.setCacheMode(i3);
        return Unit.INSTANCE;
    }
}
