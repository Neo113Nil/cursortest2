package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.kn3;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public final class cn3<T_WRAPPER extends kn3<T_ENGINE>, T_ENGINE> {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f3888b = Logger.getLogger(cn3.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final List<Provider> f3889c;

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f3890d;

    /* renamed from: e, reason: collision with root package name */
    public static final cn3<dn3, Cipher> f3891e;

    /* renamed from: f, reason: collision with root package name */
    public static final cn3<hn3, Mac> f3892f;

    /* renamed from: g, reason: collision with root package name */
    public static final cn3<jn3, Signature> f3893g;

    /* renamed from: h, reason: collision with root package name */
    public static final cn3<in3, MessageDigest> f3894h;

    /* renamed from: i, reason: collision with root package name */
    public static final cn3<en3, KeyAgreement> f3895i;

    /* renamed from: j, reason: collision with root package name */
    public static final cn3<gn3, KeyPairGenerator> f3896j;

    /* renamed from: k, reason: collision with root package name */
    public static final cn3<fn3, KeyFactory> f3897k;

    /* renamed from: a, reason: collision with root package name */
    private final T_WRAPPER f3898a;

    static {
        if (rf3.b()) {
            f3889c = b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt");
            f3890d = false;
        } else {
            f3889c = vn3.b() ? b("GmsCore_OpenSSL", "AndroidOpenSSL") : new ArrayList<>();
            f3890d = true;
        }
        f3891e = new cn3<>(new dn3());
        f3892f = new cn3<>(new hn3());
        f3893g = new cn3<>(new jn3());
        f3894h = new cn3<>(new in3());
        f3895i = new cn3<>(new en3());
        f3896j = new cn3<>(new gn3());
        f3897k = new cn3<>(new fn3());
    }

    public cn3(T_WRAPPER t_wrapper) {
        this.f3898a = t_wrapper;
    }

    public static List<Provider> b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                f3888b.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", str));
            }
        }
        return arrayList;
    }

    public final T_ENGINE a(String str) {
        Iterator<Provider> it = f3889c.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return (T_ENGINE) this.f3898a.a(str, it.next());
            } catch (Exception e7) {
                if (exc == null) {
                    exc = e7;
                }
            }
        }
        if (f3890d) {
            return (T_ENGINE) this.f3898a.a(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
