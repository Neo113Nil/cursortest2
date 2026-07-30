package s1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public String f8135a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f8136b = new int[2];

    public abstract int[] a(int i7);

    public final int[] b(int i7, int i8) {
        if (i7 < 0 || i8 < 0 || i7 == i8) {
            return null;
        }
        int[] iArr = this.f8136b;
        iArr[0] = i7;
        iArr[1] = i8;
        return iArr;
    }

    public final String c() {
        String str = this.f8135a;
        if (str != null) {
            return str;
        }
        r6.k.j("text");
        throw null;
    }

    public abstract int[] d(int i7);
}
