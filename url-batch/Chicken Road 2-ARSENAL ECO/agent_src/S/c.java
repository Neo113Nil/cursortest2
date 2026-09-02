package S;

import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class c implements Comparable {

    /* renamed from: f, reason: collision with root package name */
    public final int f2188f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2189g;

    /* renamed from: h, reason: collision with root package name */
    public final String f2190h;

    /* renamed from: i, reason: collision with root package name */
    public final String f2191i;

    public c(int i7, int i8, String str, String str2) {
        this.f2188f = i7;
        this.f2189g = i8;
        this.f2190h = str;
        this.f2191i = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c other = (c) obj;
        i.e(other, "other");
        int i7 = this.f2188f - other.f2188f;
        return i7 == 0 ? this.f2189g - other.f2189g : i7;
    }
}
