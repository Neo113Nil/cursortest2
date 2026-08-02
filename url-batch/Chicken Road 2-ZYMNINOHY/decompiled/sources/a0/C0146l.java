package a0;

import E.AbstractC0005f;
import T.C0097o;
import a.AbstractC0124a;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import q0.C1353B;

/* renamed from: a0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0146l extends T.H {

    /* renamed from: c, reason: collision with root package name */
    public final int f4175c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4176d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4177e;

    /* renamed from: f, reason: collision with root package name */
    public final C0097o f4178f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4179g;

    /* renamed from: h, reason: collision with root package name */
    public final C1353B f4180h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f4181i;

    public C0146l(int i4, Exception exc, int i5) {
        this(i4, exc, i5, null, -1, null, 4, null, false);
    }

    public final C0146l a(C1353B c1353b) {
        String message = getMessage();
        String str = W.J.f3263a;
        return new C0146l(message, getCause(), this.f2661a, this.f4175c, this.f4176d, this.f4177e, this.f4178f, this.f4179g, c1353b, this.f2662b, this.f4181i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0146l(String str, Throwable th, int i4, int i5, String str2, int i6, C0097o c0097o, int i7, C1353B c1353b, long j4, boolean z) {
        super(str, th, i4, j4);
        Bundle bundle = Bundle.EMPTY;
        AbstractC0124a.h(!z || i5 == 1);
        AbstractC0124a.h(th != null || i5 == 3);
        this.f4175c = i5;
        this.f4176d = str2;
        this.f4177e = i6;
        this.f4178f = c0097o;
        this.f4179g = i7;
        this.f4180h = c1353b;
        this.f4181i = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0146l(int i4, Exception exc, int i5, String str, int i6, C0097o c0097o, int i7, C1353B c1353b, boolean z) {
        this(TextUtils.isEmpty(null) ? r0 : AbstractC0005f.z(r0, ": null"), exc, i5, i4, r5, r6, r7, i7, c1353b, SystemClock.elapsedRealtime(), z);
        String str2;
        int i8;
        C0097o c0097o2;
        String str3;
        String str4;
        if (i4 == 0) {
            str2 = str;
            i8 = i6;
            c0097o2 = c0097o;
            str3 = "Source error";
        } else if (i4 != 1) {
            if (i4 != 3) {
                str3 = "Unexpected runtime error";
            } else {
                str3 = "Remote error";
            }
            str2 = str;
            i8 = i6;
            c0097o2 = c0097o;
        } else {
            StringBuilder sb = new StringBuilder();
            str2 = str;
            sb.append(str2);
            sb.append(" error, index=");
            i8 = i6;
            sb.append(i8);
            sb.append(", format=");
            c0097o2 = c0097o;
            sb.append(c0097o2);
            sb.append(", format_supported=");
            String str5 = W.J.f3263a;
            if (i7 == 0) {
                str4 = "NO";
            } else if (i7 == 1) {
                str4 = "NO_UNSUPPORTED_SUBTYPE";
            } else if (i7 == 2) {
                str4 = "NO_UNSUPPORTED_DRM";
            } else if (i7 == 3) {
                str4 = "NO_EXCEEDS_CAPABILITIES";
            } else if (i7 == 4) {
                str4 = "YES";
            } else {
                throw new IllegalStateException();
            }
            sb.append(str4);
            str3 = sb.toString();
        }
    }
}
