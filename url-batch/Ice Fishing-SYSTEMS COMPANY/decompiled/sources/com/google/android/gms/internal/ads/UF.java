package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class UF {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f27952c = Logger.getLogger(UF.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public static final UF f27953d = new UF();

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f27954a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f27955b = new ConcurrentHashMap();

    public final synchronized void a(C2921aG c2921aG, boolean z8) {
        c(c2921aG, 1, z8);
    }

    public final C2921aG b(Class cls, String str) {
        C2921aG d2 = d(str);
        if (d2.f29190b.equals(cls)) {
            return d2;
        }
        String name = cls.getName();
        String valueOf = String.valueOf(d2.getClass());
        String obj = d2.f29190b.toString();
        StringBuilder sb = new StringBuilder(AbstractC5051n.a(name.length() + 53, 23, valueOf) + obj.length());
        AbstractC5051n.j(sb, "Primitive type ", name, " not supported by key manager of type ", valueOf);
        throw new GeneralSecurityException(AbstractC5051n.g(sb, ", which only supports: ", obj));
    }

    public final synchronized void c(C2921aG c2921aG, int i, boolean z8) {
        if (!XC.e(i)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        e(c2921aG, z8);
    }

    public final synchronized C2921aG d(String str) {
        ConcurrentHashMap concurrentHashMap;
        concurrentHashMap = this.f27954a;
        if (!concurrentHashMap.containsKey(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 98);
            sb.append("No key manager found for key type ");
            sb.append(str);
            sb.append(", see https://developers.google.com/tink/faq/registration_errors");
            throw new GeneralSecurityException(sb.toString());
        }
        return (C2921aG) concurrentHashMap.get(str);
    }

    public final synchronized void e(C2921aG c2921aG, boolean z8) {
        try {
            String str = c2921aG.f29189a;
            if (z8) {
                ConcurrentHashMap concurrentHashMap = this.f27955b;
                if (concurrentHashMap.containsKey(str) && !((Boolean) concurrentHashMap.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
                }
            }
            ConcurrentHashMap concurrentHashMap2 = this.f27954a;
            C2921aG c2921aG2 = (C2921aG) concurrentHashMap2.get(str);
            if (c2921aG2 != null && !c2921aG2.getClass().equals(c2921aG.getClass())) {
                f27952c.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(str));
                throw new GeneralSecurityException("typeUrl (" + str + ") is already registered with " + c2921aG2.getClass().getName() + ", cannot be re-registered with " + c2921aG.getClass().getName());
            }
            concurrentHashMap2.putIfAbsent(str, c2921aG);
            this.f27955b.put(str, Boolean.valueOf(z8));
        } catch (Throwable th) {
            throw th;
        }
    }
}
