package r0;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import r0.i;

/* loaded from: classes.dex */
public final class r extends r2 {

    /* renamed from: p, reason: collision with root package name */
    public static final i.a<r> f20896p = new i.a() { // from class: r0.q
        @Override // r0.i.a
        public final i a(Bundle bundle) {
            return r.e(bundle);
        }
    };

    /* renamed from: i, reason: collision with root package name */
    public final int f20897i;

    /* renamed from: j, reason: collision with root package name */
    public final String f20898j;

    /* renamed from: k, reason: collision with root package name */
    public final int f20899k;

    /* renamed from: l, reason: collision with root package name */
    public final s1 f20900l;

    /* renamed from: m, reason: collision with root package name */
    public final int f20901m;

    /* renamed from: n, reason: collision with root package name */
    public final t1.v f20902n;

    /* renamed from: o, reason: collision with root package name */
    final boolean f20903o;

    private r(int i7, Throwable th, int i8) {
        this(i7, th, null, i8, null, -1, null, 4, false);
    }

    private r(int i7, Throwable th, String str, int i8, String str2, int i9, s1 s1Var, int i10, boolean z6) {
        this(k(i7, str, str2, i9, s1Var, i10), th, i8, i7, str2, i9, s1Var, i10, null, SystemClock.elapsedRealtime(), z6);
    }

    private r(Bundle bundle) {
        super(bundle);
        this.f20897i = bundle.getInt(r2.d(1001), 2);
        this.f20898j = bundle.getString(r2.d(1002));
        this.f20899k = bundle.getInt(r2.d(1003), -1);
        Bundle bundle2 = bundle.getBundle(r2.d(1004));
        this.f20900l = bundle2 == null ? null : s1.M.a(bundle2);
        this.f20901m = bundle.getInt(r2.d(1005), 4);
        this.f20903o = bundle.getBoolean(r2.d(1006), false);
        this.f20902n = null;
    }

    private r(String str, Throwable th, int i7, int i8, String str2, int i9, s1 s1Var, int i10, t1.v vVar, long j7, boolean z6) {
        super(str, th, i7, j7);
        o2.a.a(!z6 || i8 == 1);
        o2.a.a(th != null || i8 == 3);
        this.f20897i = i8;
        this.f20898j = str2;
        this.f20899k = i9;
        this.f20900l = s1Var;
        this.f20901m = i10;
        this.f20902n = vVar;
        this.f20903o = z6;
    }

    public static /* synthetic */ r e(Bundle bundle) {
        return new r(bundle);
    }

    public static r g(Throwable th, String str, int i7, s1 s1Var, int i8, boolean z6, int i9) {
        return new r(1, th, null, i9, str, i7, s1Var, s1Var == null ? 4 : i8, z6);
    }

    public static r h(IOException iOException, int i7) {
        return new r(0, iOException, i7);
    }

    @Deprecated
    public static r i(RuntimeException runtimeException) {
        return j(runtimeException, 1000);
    }

    public static r j(RuntimeException runtimeException, int i7) {
        return new r(2, runtimeException, i7);
    }

    private static String k(int i7, String str, String str2, int i8, s1 s1Var, int i9) {
        String str3;
        if (i7 == 0) {
            str3 = "Source error";
        } else if (i7 != 1) {
            str3 = i7 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i8 + ", format=" + s1Var + ", format_supported=" + o2.m0.W(i9);
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    r f(t1.v vVar) {
        return new r((String) o2.m0.j(getMessage()), getCause(), this.f20907f, this.f20897i, this.f20898j, this.f20899k, this.f20900l, this.f20901m, vVar, this.f20908g, this.f20903o);
    }

    public Exception l() {
        o2.a.f(this.f20897i == 1);
        return (Exception) o2.a.e(getCause());
    }

    public IOException m() {
        o2.a.f(this.f20897i == 0);
        return (IOException) o2.a.e(getCause());
    }

    public RuntimeException n() {
        o2.a.f(this.f20897i == 2);
        return (RuntimeException) o2.a.e(getCause());
    }
}
