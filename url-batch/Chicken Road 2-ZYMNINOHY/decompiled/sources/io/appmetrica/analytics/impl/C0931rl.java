package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.rl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0931rl {

    /* renamed from: a, reason: collision with root package name */
    public final Cc f12682a;

    /* renamed from: b, reason: collision with root package name */
    public final Bc f12683b;

    public C0931rl(PublicLogger publicLogger, String str) {
        this(new Cc(str, publicLogger), new Bc(str, publicLogger));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized boolean a(Fc fc, String str, String str2) {
        try {
            int size = fc.size();
            int i4 = this.f12682a.f10156c.f12323a;
            if (size >= i4 && (i4 != fc.size() || !fc.containsKey(str))) {
                Cc cc = this.f12682a;
                cc.f10157d.warning("The %s has reached the limit of %d items. Item with key %s will be ignored", cc.f10158e, Integer.valueOf(cc.f10156c.f12323a), str);
                return false;
            }
            this.f12683b.getClass();
            int i5 = fc.f10278a;
            if (str2 != null) {
                i5 += str2.length();
            }
            if (fc.containsKey(str)) {
                String str3 = (String) fc.get(str);
                if (str3 != null) {
                    i5 -= str3.length();
                }
            } else {
                i5 += str.length();
            }
            if (i5 <= 4500) {
                fc.put(str, str2);
                return true;
            }
            Bc bc = this.f12683b;
            bc.f10103b.warning("The %s has reached the total size limit that equals %d symbols. Item with key %s will be ignored", bc.f10102a, 4500, str);
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean b(Fc fc, String str, String str2) {
        if (fc == null) {
            return false;
        }
        String a3 = this.f12682a.f10154a.a(str);
        String a4 = this.f12682a.f10155b.a(str2);
        if (!fc.containsKey(a3)) {
            if (a4 != null) {
                return a(fc, a3, a4);
            }
            return false;
        }
        String str3 = (String) fc.get(a3);
        if (a4 == null || !a4.equals(str3)) {
            return a(fc, a3, a4);
        }
        return false;
    }

    public C0931rl(Cc cc, Bc bc) {
        this.f12682a = cc;
        this.f12683b = bc;
    }
}
