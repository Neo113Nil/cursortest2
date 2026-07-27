package a3;

/* renamed from: a3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0182a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0182a f3858b = new C0182a(new Object[0]);

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f3859a;

    public C0182a(Object[] objArr) {
        this.f3859a = objArr;
    }

    public static C0182a a() {
        C0182a a6 = AbstractC0186e.f3863b.a();
        return a6 != null ? a6 : f3858b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        int i2 = 0;
        while (true) {
            Object[] objArr = this.f3859a;
            if (i2 >= objArr.length) {
                break;
            }
            sb.append(objArr[i2]);
            sb.append('=');
            sb.append(objArr[i2 + 1]);
            sb.append(", ");
            i2 += 2;
        }
        if (sb.length() > 1) {
            sb.setLength(sb.length() - 2);
        }
        sb.append('}');
        return sb.toString();
    }
}
