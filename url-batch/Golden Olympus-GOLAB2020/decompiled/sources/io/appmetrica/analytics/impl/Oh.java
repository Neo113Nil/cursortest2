package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.ICrashTransformer;

/* loaded from: classes3.dex */
public final class Oh extends F6 {

    /* renamed from: d, reason: collision with root package name */
    public final Tn f38086d;

    public Oh(@NonNull Context context, @NonNull Tn tn, @NonNull E6 e6, ICrashTransformer iCrashTransformer) {
        this(tn, e6, iCrashTransformer, new C2674ha(context));
    }

    public Oh(Tn tn, E6 e6, ICrashTransformer iCrashTransformer, C2674ha c2674ha) {
        super(e6, iCrashTransformer, c2674ha);
        this.f38086d = tn;
    }
}
