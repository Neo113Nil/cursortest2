package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.gG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3249gG {

    /* renamed from: b, reason: collision with root package name */
    public static final C3249gG f30974b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f30975a = new HashMap();

    static {
        DE de = DE.f24374k;
        C3249gG c3249gG = new C3249gG();
        try {
            c3249gG.a(de, C3139eG.class);
            f30974b = c3249gG;
        } catch (GeneralSecurityException e6) {
            throw new IllegalStateException("unexpected error.", e6);
        }
    }

    public final synchronized void a(TF tf, Class cls) {
        try {
            HashMap hashMap = this.f30975a;
            TF tf2 = (TF) hashMap.get(cls);
            if (tf2 != null && !tf2.equals(tf)) {
                String obj = cls.toString();
                StringBuilder sb = new StringBuilder(obj.length() + 60);
                sb.append("Different key creator for parameters class ");
                sb.append(obj);
                sb.append(" already inserted");
                throw new GeneralSecurityException(sb.toString());
            }
            hashMap.put(cls, tf);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final XC b(AbstractC4000uE abstractC4000uE, Integer num) {
        XC a9;
        synchronized (this) {
            TF tf = (TF) this.f30975a.get(abstractC4000uE.getClass());
            if (tf == null) {
                String obj = abstractC4000uE.toString();
                StringBuilder sb = new StringBuilder(obj.length() + 86);
                sb.append("Cannot create a new key for parameters ");
                sb.append(obj);
                sb.append(": no key creator for this class was registered.");
                throw new GeneralSecurityException(sb.toString());
            }
            a9 = tf.a(abstractC4000uE, num);
        }
        return a9;
    }
}
