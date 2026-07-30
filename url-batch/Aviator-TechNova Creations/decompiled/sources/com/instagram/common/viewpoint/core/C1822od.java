package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;

/* renamed from: com.facebook.ads.redexgen.X.od, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1822od extends Exception implements C1S {
    public final int A00;
    public final long A01;
    public static final String A03 = AbstractC01484a.A0h(0);
    public static final String A04 = AbstractC01484a.A0h(1);
    public static final String A07 = AbstractC01484a.A0h(2);
    public static final String A05 = AbstractC01484a.A0h(3);
    public static final String A06 = AbstractC01484a.A0h(4);
    public static final C1R<C1822od> A02 = new C1R() { // from class: com.facebook.ads.redexgen.X.oe
        @Override // com.instagram.common.viewpoint.core.C1R
        public final C1S A6X(Bundle bundle) {
            return new C1822od(bundle);
        }
    };

    public C1822od(Bundle bundle) {
        this(bundle.getString(A07), A09(bundle), bundle.getInt(A03, 1000), bundle.getLong(A04, SystemClock.elapsedRealtime()));
    }

    public C1822od(String str, Throwable th, int i, long j) {
        super(str, th);
        this.A00 = i;
        this.A01 = j;
    }

    public static RemoteException A08(String str) {
        return new RemoteException(str);
    }

    public static Throwable A09(Bundle bundle) {
        String string = bundle.getString(A05);
        String causeClassName = A06;
        String string2 = bundle.getString(causeClassName);
        Throwable th = null;
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, C1822od.class.getClassLoader());
            if (Throwable.class.isAssignableFrom(cls)) {
                th = A0A(cls, string2);
            }
        } catch (Throwable unused) {
            if (th != null) {
                return th;
            }
        }
        if (th == null) {
            return A08(string2);
        }
        return th;
    }

    public static Throwable A0A(Class<?> clazz, String str) throws Exception {
        return (Throwable) clazz.getConstructor(String.class).newInstance(str);
    }
}
