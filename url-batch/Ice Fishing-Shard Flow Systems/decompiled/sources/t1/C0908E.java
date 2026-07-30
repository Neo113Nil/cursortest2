package t1;

import java.util.Arrays;

/* renamed from: t1.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0908E {

    /* renamed from: a, reason: collision with root package name */
    public final String f7902a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7903b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7904c;

    public C0908E(String str, boolean z7) {
        u.c(str);
        this.f7902a = str;
        u.c("com.google.android.gms");
        this.f7903b = "com.google.android.gms";
        this.f7904c = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0908E)) {
            return false;
        }
        C0908E c0908e = (C0908E) obj;
        return u.i(this.f7902a, c0908e.f7902a) && u.i(this.f7903b, c0908e.f7903b) && u.i(null, null) && this.f7904c == c0908e.f7904c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7902a, this.f7903b, null, 4225, Boolean.valueOf(this.f7904c)});
    }

    public final String toString() {
        String str = this.f7902a;
        if (str != null) {
            return str;
        }
        u.f(null);
        throw null;
    }
}
