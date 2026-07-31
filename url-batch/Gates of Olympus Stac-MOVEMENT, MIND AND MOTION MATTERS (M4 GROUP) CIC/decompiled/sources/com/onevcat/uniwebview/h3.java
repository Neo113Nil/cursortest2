package com.onevcat.uniwebview;

import android.webkit.WebSettings;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class h3 extends Lambda implements Function1 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(int i) {
        super(1);
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s0 it = (s0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        WebSettings settings = it.p.getSettings();
        int i = b0.i;
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
