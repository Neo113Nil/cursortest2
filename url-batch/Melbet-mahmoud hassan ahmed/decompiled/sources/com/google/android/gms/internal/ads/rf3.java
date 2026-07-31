package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class rf3 {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f11139a = Logger.getLogger(rf3.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f11140b = new AtomicBoolean(false);

    private rf3() {
    }

    static Boolean a() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            f11139a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    public static boolean b() {
        return f11140b.get();
    }
}
