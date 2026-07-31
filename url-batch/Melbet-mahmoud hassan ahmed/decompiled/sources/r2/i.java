package r2;

import androidx.annotation.RecentlyNonNull;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final int f21161a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21162b;

    /* renamed from: c, reason: collision with root package name */
    private final long f21163c;

    private i(int i7, String str, long j7) {
        this.f21161a = i7;
        this.f21162b = str;
        this.f21163c = j7;
    }

    @RecentlyNonNull
    public static i d(int i7, @RecentlyNonNull String str, long j7) {
        return new i(i7, str, j7);
    }

    @RecentlyNonNull
    public String a() {
        return this.f21162b;
    }

    public int b() {
        return this.f21161a;
    }

    public long c() {
        return this.f21163c;
    }
}
