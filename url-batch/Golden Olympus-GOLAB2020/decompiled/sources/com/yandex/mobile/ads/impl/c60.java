package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.yandex.mobile.ads.impl.InterfaceC2259tl;
import com.yandex.mobile.ads.impl.dw0;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class c60 extends qh1 {

    /* renamed from: d, reason: collision with root package name */
    public final int f24064d;

    /* renamed from: e, reason: collision with root package name */
    public final String f24065e;

    /* renamed from: f, reason: collision with root package name */
    public final int f24066f;

    /* renamed from: g, reason: collision with root package name */
    public final yb0 f24067g;

    /* renamed from: h, reason: collision with root package name */
    public final int f24068h;

    /* renamed from: i, reason: collision with root package name */
    public final zv0 f24069i;

    /* renamed from: j, reason: collision with root package name */
    final boolean f24070j;

    static {
        new InterfaceC2259tl.a() { // from class: com.yandex.mobile.ads.impl.J0
            @Override // com.yandex.mobile.ads.impl.InterfaceC2259tl.a
            public final InterfaceC2259tl fromBundle(Bundle bundle) {
                return c60.b(bundle);
            }
        };
    }

    private c60(int i4, Throwable th, int i5, int i6) {
        this(a(i4, null, null, -1, null, 4), th, i5, i4, null, -1, null, 4, null, SystemClock.elapsedRealtime(), false);
    }

    public static c60 a() {
        return new c60(a(3, "Video load error occurred", null, -1, null, 4), null, 1001, 3, null, -1, null, 4, null, SystemClock.elapsedRealtime(), false);
    }

    public static /* synthetic */ c60 b(Bundle bundle) {
        return new c60(bundle);
    }

    private c60(Bundle bundle) {
        super(bundle);
        this.f24064d = bundle.getInt(qh1.a(1001), 2);
        this.f24065e = bundle.getString(qh1.a(1002));
        this.f24066f = bundle.getInt(qh1.a(1003), -1);
        Bundle bundle2 = bundle.getBundle(qh1.a(1004));
        this.f24067g = bundle2 == null ? null : yb0.f34972I.fromBundle(bundle2);
        this.f24068h = bundle.getInt(qh1.a(1005), 4);
        this.f24070j = bundle.getBoolean(qh1.a(1006), false);
        this.f24069i = null;
    }

    public static c60 a(Exception exc, String str, int i4, yb0 yb0Var, int i5, boolean z4, int i6) {
        int i7 = yb0Var == null ? 4 : i5;
        return new c60(a(1, null, str, i4, yb0Var, i7), exc, i6, 1, str, i4, yb0Var, i7, null, SystemClock.elapsedRealtime(), z4);
    }

    @Deprecated
    public static c60 a(IllegalStateException illegalStateException) {
        return new c60(2, illegalStateException, 1000, 0);
    }

    private static String a(int i4, String str, String str2, int i5, yb0 yb0Var, int i6) {
        String str3;
        String str4;
        if (i4 == 0) {
            str3 = "Source error";
        } else if (i4 == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(" error, index=");
            sb.append(i5);
            sb.append(", format=");
            sb.append(yb0Var);
            sb.append(", format_supported=");
            int i7 = u82.f32873a;
            if (i6 == 0) {
                str4 = "NO";
            } else if (i6 == 1) {
                str4 = "NO_UNSUPPORTED_TYPE";
            } else if (i6 == 2) {
                str4 = "NO_UNSUPPORTED_DRM";
            } else if (i6 == 3) {
                str4 = "NO_EXCEEDS_CAPABILITIES";
            } else if (i6 == 4) {
                str4 = "YES";
            } else {
                throw new IllegalStateException();
            }
            sb.append(str4);
            str3 = sb.toString();
        } else if (i4 != 3) {
            str3 = "Unexpected runtime error";
        } else {
            str3 = "Remote error";
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    private c60(String str, Throwable th, int i4, int i5, String str2, int i6, yb0 yb0Var, int i7, dw0.b bVar, long j4, boolean z4) {
        super(str, th, i4, j4);
        C2253tf.a(!z4 || i5 == 1);
        C2253tf.a(th != null || i5 == 3);
        this.f24064d = i5;
        this.f24065e = str2;
        this.f24066f = i6;
        this.f24067g = yb0Var;
        this.f24068h = i7;
        this.f24069i = bVar;
        this.f24070j = z4;
    }

    public static c60 a(IOException iOException, int i4) {
        return new c60(0, iOException, i4, 0);
    }

    public static c60 a(RuntimeException runtimeException, int i4) {
        return new c60(2, runtimeException, i4, 0);
    }

    final c60 a(dw0.b bVar) {
        String message = getMessage();
        int i4 = u82.f32873a;
        return new c60(message, getCause(), this.f30778b, this.f24064d, this.f24065e, this.f24066f, this.f24067g, this.f24068h, bVar, this.f30779c, this.f24070j);
    }
}
