package i0;

/* loaded from: classes.dex */
public final class c implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final int f3010a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3011b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3012c;
    public final String d;

    public c(int i, int i2, String str, String str2) {
        this.f3010a = i;
        this.f3011b = i2;
        this.f3012c = str;
        this.d = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c cVar = (c) obj;
        k1.e.e(cVar, "other");
        int i = this.f3010a - cVar.f3010a;
        return i == 0 ? this.f3011b - cVar.f3011b : i;
    }
}
