package f4;

/* renamed from: f4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0374a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0374a f4222b = new C0374a(new Object[0]);

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f4223a;

    public C0374a(Object[] objArr) {
        this.f4223a = objArr;
    }

    public static C0374a a() {
        C0374a current = AbstractC0378e.f4227b.current();
        return current != null ? current : f4222b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        int i7 = 0;
        while (true) {
            Object[] objArr = this.f4223a;
            if (i7 >= objArr.length) {
                break;
            }
            sb.append(objArr[i7]);
            sb.append('=');
            sb.append(objArr[i7 + 1]);
            sb.append(", ");
            i7 += 2;
        }
        if (sb.length() > 1) {
            sb.setLength(sb.length() - 2);
        }
        sb.append('}');
        return sb.toString();
    }
}
