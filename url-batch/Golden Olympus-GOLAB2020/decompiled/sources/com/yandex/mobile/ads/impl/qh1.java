package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.yandex.mobile.ads.impl.InterfaceC2259tl;

/* loaded from: classes3.dex */
public class qh1 extends Exception implements InterfaceC2259tl {

    /* renamed from: b, reason: collision with root package name */
    public final int f30778b;

    /* renamed from: c, reason: collision with root package name */
    public final long f30779c;

    static {
        new InterfaceC2259tl.a() { // from class: com.yandex.mobile.ads.impl.Ic
            @Override // com.yandex.mobile.ads.impl.InterfaceC2259tl.a
            public final InterfaceC2259tl fromBundle(Bundle bundle) {
                return new qh1(bundle);
            }
        };
    }

    protected qh1(Bundle bundle) {
        this(bundle.getString(a(2)), a(bundle), bundle.getInt(a(0), 1000), bundle.getLong(a(1), SystemClock.elapsedRealtime()));
    }

    private static Throwable a(Bundle bundle) {
        String string = bundle.getString(Integer.toString(3, 36));
        String string2 = bundle.getString(Integer.toString(4, 36));
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, qh1.class.getClassLoader());
            Throwable th = Throwable.class.isAssignableFrom(cls) ? (Throwable) cls.getConstructor(String.class).newInstance(string2) : null;
            return th == null ? new RemoteException(string2) : th;
        } catch (Throwable unused) {
            return new RemoteException(string2);
        }
    }

    protected qh1(String str, Throwable th, int i4, long j4) {
        super(str, th);
        this.f30778b = i4;
        this.f30779c = j4;
    }

    protected static String a(int i4) {
        return Integer.toString(i4, 36);
    }
}
