package M4;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f1742b = new a(new Object[0]);

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f1743a;

    public a(Object[] objArr) {
        this.f1743a = objArr;
    }

    public static a a() {
        a current = e.f1747b.current();
        return current != null ? current : f1742b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        int i2 = 0;
        while (true) {
            Object[] objArr = this.f1743a;
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
