package v2;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public final Object f15573a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15574b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f15575c;

    public K(Object obj, Object obj2, Object obj3) {
        this.f15573a = obj;
        this.f15574b = obj2;
        this.f15575c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f15573a;
        sb.append(obj);
        sb.append("=");
        sb.append(this.f15574b);
        sb.append(" and ");
        sb.append(obj);
        sb.append("=");
        sb.append(this.f15575c);
        return new IllegalArgumentException(sb.toString());
    }
}
