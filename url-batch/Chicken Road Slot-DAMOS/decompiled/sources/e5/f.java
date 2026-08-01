package e5;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final int f3899d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3900e;

    /* renamed from: i, reason: collision with root package name */
    public final String f3901i;

    /* renamed from: r, reason: collision with root package name */
    public final String f3902r;

    public f(int i3, int i10, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f3899d = i3;
        this.f3900e = i10;
        this.f3901i = str;
        this.f3902r = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        f fVar = (f) obj;
        fVar.getClass();
        int i3 = this.f3899d - fVar.f3899d;
        return i3 == 0 ? this.f3900e - fVar.f3900e : i3;
    }
}
