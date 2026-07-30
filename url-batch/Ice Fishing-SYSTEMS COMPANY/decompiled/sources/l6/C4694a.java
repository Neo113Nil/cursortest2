package l6;

/* renamed from: l6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4694a {

    /* renamed from: b, reason: collision with root package name */
    public static final C4694a f39054b = new C4694a(new Object[0]);

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f39055a;

    public C4694a(Object[] objArr) {
        this.f39055a = objArr;
    }

    public static C4694a a() {
        C4694a j9 = AbstractC4698e.f39059b.j();
        return j9 != null ? j9 : f39054b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        int i = 0;
        while (true) {
            Object[] objArr = this.f39055a;
            if (i >= objArr.length) {
                break;
            }
            sb.append(objArr[i]);
            sb.append('=');
            sb.append(objArr[i + 1]);
            sb.append(", ");
            i += 2;
        }
        if (sb.length() > 1) {
            sb.setLength(sb.length() - 2);
        }
        sb.append('}');
        return sb.toString();
    }
}
