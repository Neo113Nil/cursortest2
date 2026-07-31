package p0;

import androidx.annotation.RecentlyNonNull;
import r2.h;

@Deprecated
/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    @RecentlyNonNull
    public static final c f19948b = new c(-1, -2, "mb");

    /* renamed from: c, reason: collision with root package name */
    @RecentlyNonNull
    public static final c f19949c = new c(320, 50, "mb");

    /* renamed from: d, reason: collision with root package name */
    @RecentlyNonNull
    public static final c f19950d = new c(300, 250, "as");

    /* renamed from: e, reason: collision with root package name */
    @RecentlyNonNull
    public static final c f19951e = new c(468, 60, "as");

    /* renamed from: f, reason: collision with root package name */
    @RecentlyNonNull
    public static final c f19952f = new c(728, 90, "as");

    /* renamed from: g, reason: collision with root package name */
    @RecentlyNonNull
    public static final c f19953g = new c(160, 600, "as");

    /* renamed from: a, reason: collision with root package name */
    private final h f19954a;

    private c(int i7, int i8, String str) {
        this(new h(i7, i8));
    }

    public c(@RecentlyNonNull h hVar) {
        this.f19954a = hVar;
    }

    public int a() {
        return this.f19954a.c();
    }

    public int b() {
        return this.f19954a.j();
    }

    public boolean equals(@RecentlyNonNull Object obj) {
        if (obj instanceof c) {
            return this.f19954a.equals(((c) obj).f19954a);
        }
        return false;
    }

    public int hashCode() {
        return this.f19954a.hashCode();
    }

    @RecentlyNonNull
    public String toString() {
        return this.f19954a.toString();
    }
}
