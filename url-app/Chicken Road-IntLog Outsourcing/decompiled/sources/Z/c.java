package Z;

import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class c implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final int f3736a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3737b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3738c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3739d;

    public c(String str, int i2, int i3, String str2) {
        this.f3736a = i2;
        this.f3737b = i3;
        this.f3738c = str;
        this.f3739d = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c other = (c) obj;
        i.e(other, "other");
        int i2 = this.f3736a - other.f3736a;
        return i2 == 0 ? this.f3737b - other.f3737b : i2;
    }
}
