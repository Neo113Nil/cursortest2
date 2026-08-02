package io.flutter.plugins.inapppurchase;

import O3.l;
import c3.C0294f;
import kotlin.jvm.internal.i;
import o3.InterfaceC1339l;

/* loaded from: classes.dex */
public final class ResultUtilsKt {
    public static final <T> void completeWithError(InterfaceC1339l callback, Throwable failure) {
        i.e(callback, "callback");
        i.e(failure, "failure");
        callback.invoke(new C0294f(l.h(failure)));
    }
}
