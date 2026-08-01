package b8;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1424a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1425b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1426c;

    public h(Object obj, Object obj2, Object obj3) {
        this.f1424a = obj;
        this.f1425b = obj2;
        this.f1426c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f1424a;
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(this.f1425b);
        String valueOf3 = String.valueOf(obj);
        String valueOf4 = String.valueOf(this.f1426c);
        StringBuilder sb2 = new StringBuilder(valueOf4.length() + valueOf3.length() + valueOf2.length() + valueOf.length() + 39);
        sb2.append("Multiple entries with same key: ");
        sb2.append(valueOf);
        sb2.append("=");
        sb2.append(valueOf2);
        sb2.append(" and ");
        sb2.append(valueOf3);
        sb2.append("=");
        sb2.append(valueOf4);
        return new IllegalArgumentException(sb2.toString());
    }
}
