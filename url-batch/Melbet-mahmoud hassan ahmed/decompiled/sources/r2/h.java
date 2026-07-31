package r2;

import android.content.Context;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.bo0;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.pv;
import com.google.android.gms.internal.ads.qw;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final int f21153a;

    /* renamed from: b, reason: collision with root package name */
    private final int f21154b;

    /* renamed from: c, reason: collision with root package name */
    private final String f21155c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f21156d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f21157e;

    /* renamed from: f, reason: collision with root package name */
    private int f21158f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f21159g;

    /* renamed from: h, reason: collision with root package name */
    private int f21160h;

    /* renamed from: i, reason: collision with root package name */
    @RecentlyNonNull
    public static final h f21142i = new h(320, 50, "320x50_mb");

    /* renamed from: j, reason: collision with root package name */
    @RecentlyNonNull
    public static final h f21143j = new h(468, 60, "468x60_as");

    /* renamed from: k, reason: collision with root package name */
    @RecentlyNonNull
    public static final h f21144k = new h(320, 100, "320x100_as");

    /* renamed from: l, reason: collision with root package name */
    @RecentlyNonNull
    public static final h f21145l = new h(728, 90, "728x90_as");

    /* renamed from: m, reason: collision with root package name */
    @RecentlyNonNull
    public static final h f21146m = new h(300, 250, "300x250_as");

    /* renamed from: n, reason: collision with root package name */
    @RecentlyNonNull
    public static final h f21147n = new h(160, 600, "160x600_as");

    /* renamed from: o, reason: collision with root package name */
    @RecentlyNonNull
    @Deprecated
    public static final h f21148o = new h(-1, -2, "smart_banner");

    /* renamed from: p, reason: collision with root package name */
    @RecentlyNonNull
    public static final h f21149p = new h(-3, -4, "fluid");

    /* renamed from: q, reason: collision with root package name */
    @RecentlyNonNull
    public static final h f21150q = new h(0, 0, "invalid");

    /* renamed from: s, reason: collision with root package name */
    @RecentlyNonNull
    public static final h f21152s = new h(50, 50, "50x50_mb");

    /* renamed from: r, reason: collision with root package name */
    @RecentlyNonNull
    public static final h f21151r = new h(-3, 0, "search_v2");

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h(int i7, int i8) {
        this(i7, i8, r4.toString());
        String valueOf = i7 == -1 ? "FULL" : String.valueOf(i7);
        String valueOf2 = i8 == -2 ? "AUTO" : String.valueOf(i8);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 4 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("x");
        sb.append(valueOf2);
        sb.append("_as");
    }

    h(int i7, int i8, String str) {
        if (i7 < 0 && i7 != -1 && i7 != -3) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Invalid width for AdSize: ");
            sb.append(i7);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i8 >= 0 || i8 == -2 || i8 == -4) {
            this.f21153a = i7;
            this.f21154b = i8;
            this.f21155c = str;
        } else {
            StringBuilder sb2 = new StringBuilder(38);
            sb2.append("Invalid height for AdSize: ");
            sb2.append(i8);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    @RecentlyNonNull
    public static h a(@RecentlyNonNull Context context, int i7) {
        h c7 = bo0.c(context, i7, 50, 0);
        c7.f21156d = true;
        return c7;
    }

    @RecentlyNonNull
    public static h b(@RecentlyNonNull Context context, int i7) {
        int a7 = bo0.a(context, 0);
        if (a7 == -1) {
            return f21150q;
        }
        h hVar = new h(i7, 0);
        hVar.f21158f = a7;
        hVar.f21157e = true;
        return hVar;
    }

    @RecentlyNonNull
    public static h e(int i7, int i8) {
        h hVar = new h(i7, 0);
        hVar.f21158f = i8;
        hVar.f21157e = true;
        if (i8 < 32) {
            StringBuilder sb = new StringBuilder(129);
            sb.append("The maximum height set for the inline adaptive ad size was ");
            sb.append(i8);
            sb.append(" dp, which is below the minimum recommended value of 32 dp.");
            io0.g(sb.toString());
        }
        return hVar;
    }

    @RecentlyNonNull
    public static h f(@RecentlyNonNull Context context, int i7) {
        h c7 = bo0.c(context, i7, 50, 2);
        c7.f21156d = true;
        return c7;
    }

    @RecentlyNonNull
    public static h g(@RecentlyNonNull Context context, int i7) {
        int a7 = bo0.a(context, 2);
        h hVar = new h(i7, 0);
        if (a7 == -1) {
            return f21150q;
        }
        hVar.f21158f = a7;
        hVar.f21157e = true;
        return hVar;
    }

    @RecentlyNonNull
    public static h h(@RecentlyNonNull Context context, int i7) {
        h c7 = bo0.c(context, i7, 50, 1);
        c7.f21156d = true;
        return c7;
    }

    @RecentlyNonNull
    public static h i(@RecentlyNonNull Context context, int i7) {
        int a7 = bo0.a(context, 1);
        h hVar = new h(i7, 0);
        if (a7 == -1) {
            return f21150q;
        }
        hVar.f21158f = a7;
        hVar.f21157e = true;
        return hVar;
    }

    public int c() {
        return this.f21154b;
    }

    public int d(@RecentlyNonNull Context context) {
        int i7 = this.f21154b;
        if (i7 == -4 || i7 == -3) {
            return -1;
        }
        if (i7 == -2) {
            return pv.c(context.getResources().getDisplayMetrics());
        }
        qw.b();
        return bo0.s(context, this.f21154b);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f21153a == hVar.f21153a && this.f21154b == hVar.f21154b && this.f21155c.equals(hVar.f21155c);
    }

    public int hashCode() {
        return this.f21155c.hashCode();
    }

    public int j() {
        return this.f21153a;
    }

    public int k(@RecentlyNonNull Context context) {
        int i7 = this.f21153a;
        if (i7 == -3) {
            return -1;
        }
        if (i7 != -1) {
            qw.b();
            return bo0.s(context, this.f21153a);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Parcelable.Creator<pv> creator = pv.CREATOR;
        return displayMetrics.widthPixels;
    }

    public boolean l() {
        return this.f21153a == -3 && this.f21154b == -4;
    }

    final int m() {
        return this.f21160h;
    }

    final int n() {
        return this.f21158f;
    }

    final void o(int i7) {
        this.f21158f = i7;
    }

    final void p(int i7) {
        this.f21160h = i7;
    }

    final void q(boolean z6) {
        this.f21157e = true;
    }

    final void r(boolean z6) {
        this.f21159g = true;
    }

    final boolean s() {
        return this.f21156d;
    }

    final boolean t() {
        return this.f21157e;
    }

    @RecentlyNonNull
    public String toString() {
        return this.f21155c;
    }

    final boolean u() {
        return this.f21159g;
    }
}
