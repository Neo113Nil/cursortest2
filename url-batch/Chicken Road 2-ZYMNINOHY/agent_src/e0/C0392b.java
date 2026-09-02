package e0;

import java.util.Objects;

/* renamed from: e0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0392b {

    /* renamed from: a, reason: collision with root package name */
    public final String f8342a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8343b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8344c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8345d;

    public C0392b(int i4, int i5, String str, String str2) {
        this.f8342a = str;
        this.f8343b = str2;
        this.f8344c = i4;
        this.f8345d = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0392b)) {
            return false;
        }
        C0392b c0392b = (C0392b) obj;
        return this.f8344c == c0392b.f8344c && this.f8345d == c0392b.f8345d && Objects.equals(this.f8342a, c0392b.f8342a) && Objects.equals(this.f8343b, c0392b.f8343b);
    }

    public final int hashCode() {
        return Objects.hash(this.f8342a, this.f8343b, Integer.valueOf(this.f8344c), Integer.valueOf(this.f8345d));
    }
}
