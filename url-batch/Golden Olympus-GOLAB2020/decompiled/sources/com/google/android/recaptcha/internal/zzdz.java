package com.google.android.recaptcha.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
final /* synthetic */ class zzdz extends p implements Function1 {
    zzdz(Object obj) {
        super(1, obj, zzec.class, "isRetriable", "isRetriable(Ljava/lang/Exception;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean zzo;
        zzo = zzec.zzo((Exception) obj);
        return Boolean.valueOf(zzo);
    }
}
