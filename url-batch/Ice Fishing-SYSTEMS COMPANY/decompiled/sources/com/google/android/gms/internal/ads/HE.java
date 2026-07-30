package com.google.android.gms.internal.ads;

import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class HE {

    /* renamed from: c, reason: collision with root package name */
    public static final HE f25328c;

    /* renamed from: d, reason: collision with root package name */
    public static final HE f25329d;

    /* renamed from: e, reason: collision with root package name */
    public static final HE f25330e;

    /* renamed from: f, reason: collision with root package name */
    public static final HE f25331f;

    /* renamed from: g, reason: collision with root package name */
    public static final HE f25332g;

    /* renamed from: h, reason: collision with root package name */
    public static final HE f25333h;
    public static final HE i;

    /* renamed from: j, reason: collision with root package name */
    public static final HE f25334j;

    /* renamed from: k, reason: collision with root package name */
    public static final HE f25335k;

    /* renamed from: l, reason: collision with root package name */
    public static final HE f25336l;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25337a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25338b;

    static {
        int i4 = 0;
        f25328c = new HE("TINK", i4);
        f25329d = new HE("CRUNCHY", i4);
        f25330e = new HE("NO_PREFIX", i4);
        int i9 = 1;
        f25331f = new HE("TINK", i9);
        f25332g = new HE("CRUNCHY", i9);
        f25333h = new HE("NO_PREFIX", i9);
        int i10 = 2;
        i = new HE("TINK", i10);
        f25334j = new HE("NO_PREFIX", i10);
        int i11 = 3;
        f25335k = new HE("IEEE_P1363", i11);
        f25336l = new HE("DER", i11);
    }

    public /* synthetic */ HE(String str, int i4) {
        this.f25337a = i4;
        this.f25338b = str;
    }

    public static String e(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e6) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e6);
                String join = TextUtils.join(", ", objArr);
                int length = str2.length();
                str2 = com.anythink.basead.b.c.i.q(new StringBuilder(String.valueOf(join).length() + length + 2 + 1), str2, " [", join, "]");
            }
        }
        return D.y.o(new StringBuilder(str.length() + 3 + String.valueOf(str2).length()), str, " : ", str2);
    }

    public void a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", e(this.f25338b, str, objArr));
        }
    }

    public void b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", e(this.f25338b, str, objArr));
        }
    }

    public void c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", e(this.f25338b, str, objArr));
        }
    }

    public void d(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", e(this.f25338b, str, objArr), remoteException);
        }
    }

    public String toString() {
        switch (this.f25337a) {
            case 0:
                return this.f25338b;
            case 1:
                return this.f25338b;
            case 2:
                return this.f25338b;
            case 3:
                return this.f25338b;
            default:
                return super.toString();
        }
    }

    public HE(String str) {
        this.f25337a = 5;
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        StringBuilder sb = new StringBuilder(String.valueOf(myUid).length() + 15 + String.valueOf(myPid).length() + 2);
        AbstractC5051n.i(sb, "UID: [", myUid, "]  PID: [", myPid);
        sb.append("] ");
        this.f25338b = sb.toString().concat(str);
    }
}
