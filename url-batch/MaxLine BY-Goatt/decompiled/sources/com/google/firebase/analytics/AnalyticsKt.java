package com.google.firebase.analytics;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AnalyticsKt {
    private static volatile FirebaseAnalytics zza;
    private static final Object zzb = new Object();

    public static final FirebaseAnalytics getANALYTICS() {
        return zza;
    }

    public static final FirebaseAnalytics getAnalytics(Firebase firebase) {
        firebase.getClass();
        if (zza == null) {
            synchronized (zzb) {
                try {
                    if (zza == null) {
                        zza = FirebaseAnalytics.getInstance(FirebaseKt.getApp(Firebase.INSTANCE).getApplicationContext());
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        FirebaseAnalytics firebaseAnalytics = zza;
        firebaseAnalytics.getClass();
        return firebaseAnalytics;
    }

    public static final Object getLOCK() {
        return zzb;
    }

    public static final void logEvent(FirebaseAnalytics firebaseAnalytics, String str, Function1<? super ParametersBuilder, Unit> function1) {
        firebaseAnalytics.getClass();
        str.getClass();
        function1.getClass();
        ParametersBuilder parametersBuilder = new ParametersBuilder();
        function1.invoke(parametersBuilder);
        firebaseAnalytics.logEvent(str, parametersBuilder.getBundle());
    }

    public static final void setANALYTICS(FirebaseAnalytics firebaseAnalytics) {
        zza = firebaseAnalytics;
    }

    public static final void setConsent(FirebaseAnalytics firebaseAnalytics, Function1<? super ConsentBuilder, Unit> function1) {
        firebaseAnalytics.getClass();
        function1.getClass();
        ConsentBuilder consentBuilder = new ConsentBuilder();
        function1.invoke(consentBuilder);
        firebaseAnalytics.setConsent(consentBuilder.asMap());
    }
}
