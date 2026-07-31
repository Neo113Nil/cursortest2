package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.internal.CounterConfiguration;

/* renamed from: io.appmetrica.analytics.impl.d4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2562d4 {

    /* renamed from: a, reason: collision with root package name */
    public final Pf f38817a;

    /* renamed from: b, reason: collision with root package name */
    public final CounterConfiguration f38818b;

    public C2562d4(Pf pf, CounterConfiguration counterConfiguration) {
        this.f38817a = pf;
        this.f38818b = counterConfiguration;
    }

    public static C2562d4 a(@NonNull Context context, @NonNull Bundle bundle) {
        Pf pf;
        CounterConfiguration fromBundle;
        String str = Pf.f38131c;
        if (bundle != null) {
            try {
                pf = (Pf) bundle.getParcelable("PROCESS_CFG_OBJ");
            } catch (Throwable unused) {
            }
            fromBundle = CounterConfiguration.fromBundle(bundle);
            if (fromBundle == null && pf != null && context.getPackageName().equals(pf.f38132a.getAsString("PROCESS_CFG_PACKAGE_NAME")) && pf.f38132a.getAsInteger("PROCESS_CFG_SDK_API_LEVEL").intValue() == AppMetrica.getLibraryApiLevel()) {
                return new C2562d4(pf, fromBundle);
            }
            return null;
        }
        pf = null;
        fromBundle = CounterConfiguration.fromBundle(bundle);
        if (fromBundle == null) {
        }
        return null;
    }

    @NonNull
    public final CounterConfiguration b() {
        return this.f38818b;
    }

    public final String toString() {
        return "ClientConfiguration{mProcessConfiguration=" + this.f38817a + ", mCounterConfiguration=" + this.f38818b + '}';
    }

    @NonNull
    public final Pf a() {
        return this.f38817a;
    }
}
