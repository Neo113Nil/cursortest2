package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.vl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1064vl {

    /* renamed from: a, reason: collision with root package name */
    public final Jc f9480a;

    /* renamed from: b, reason: collision with root package name */
    public final Ic f9481b;

    public C1064vl(PublicLogger publicLogger, String str) {
        this(new Jc(str, publicLogger), new Ic(str, publicLogger));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized boolean a(Mc mc, String str, String str2) {
        try {
            int size = mc.size();
            int i2 = this.f9480a.f7005c.f9276a;
            if (size >= i2 && (i2 != mc.size() || !mc.containsKey(str))) {
                Jc jc = this.f9480a;
                jc.f7006d.warning("The %s has reached the limit of %d items. Item with key %s will be ignored", jc.f7007e, Integer.valueOf(jc.f7005c.f9276a), str);
                return false;
            }
            this.f9481b.getClass();
            int i3 = mc.f7140a;
            if (str2 != null) {
                i3 += str2.length();
            }
            if (mc.containsKey(str)) {
                String str3 = (String) mc.get(str);
                if (str3 != null) {
                    i3 -= str3.length();
                }
            } else {
                i3 += str.length();
            }
            if (i3 <= 4500) {
                mc.put(str, str2);
                return true;
            }
            Ic ic = this.f9481b;
            ic.f6950b.warning("The %s has reached the total size limit that equals %d symbols. Item with key %s will be ignored", ic.f6949a, 4500, str);
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean b(Mc mc, String str, String str2) {
        if (mc == null) {
            return false;
        }
        String a6 = this.f9480a.f7003a.a(str);
        String a7 = this.f9480a.f7004b.a(str2);
        if (!mc.containsKey(a6)) {
            if (a7 != null) {
                return a(mc, a6, a7);
            }
            return false;
        }
        String str3 = (String) mc.get(a6);
        if (a7 == null || !a7.equals(str3)) {
            return a(mc, a6, a7);
        }
        return false;
    }

    public C1064vl(Jc jc, Ic ic) {
        this.f9480a = jc;
        this.f9481b = ic;
    }
}
