package io.appmetrica.analytics.impl;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.rl, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2943rl {

    /* renamed from: a, reason: collision with root package name */
    public final Xc f39752a;

    /* renamed from: b, reason: collision with root package name */
    public final Wc f39753b;

    public C2943rl(PublicLogger publicLogger, String str) {
        this(new Xc(str, publicLogger), new Wc(str, publicLogger));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized boolean a(C2490ad c2490ad, String str, String str2) {
        try {
            int size = c2490ad.size();
            int i4 = this.f39752a.f38520c.f37603a;
            if (size >= i4 && (i4 != c2490ad.size() || !c2490ad.containsKey(str))) {
                Xc xc = this.f39752a;
                xc.f38521d.warning("The %s has reached the limit of %d items. Item with key %s will be ignored", xc.f38522e, Integer.valueOf(xc.f38520c.f37603a), str);
                return false;
            }
            this.f39753b.getClass();
            int i5 = c2490ad.f38672a;
            if (str2 != null) {
                i5 += str2.length();
            }
            if (c2490ad.containsKey(str)) {
                String str3 = (String) c2490ad.get(str);
                if (str3 != null) {
                    i5 -= str3.length();
                }
            } else {
                i5 += str.length();
            }
            if (i5 <= 4500) {
                c2490ad.put(str, str2);
                return true;
            }
            Wc wc = this.f39753b;
            wc.f38469b.warning("The %s has reached the total size limit that equals %d symbols. Item with key %s will be ignored", wc.f38468a, Integer.valueOf(IronSourceConstants.NT_AUCTION_REQUEST), str);
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean b(C2490ad c2490ad, String str, String str2) {
        if (c2490ad == null) {
            return false;
        }
        String a4 = this.f39752a.f38518a.a(str);
        String a5 = this.f39752a.f38519b.a(str2);
        if (!c2490ad.containsKey(a4)) {
            if (a5 != null) {
                return a(c2490ad, a4, a5);
            }
            return false;
        }
        String str3 = (String) c2490ad.get(a4);
        if (a5 == null || !a5.equals(str3)) {
            return a(c2490ad, a4, a5);
        }
        return false;
    }

    public C2943rl(Xc xc, Wc wc) {
        this.f39752a = xc;
        this.f39753b = wc;
    }
}
