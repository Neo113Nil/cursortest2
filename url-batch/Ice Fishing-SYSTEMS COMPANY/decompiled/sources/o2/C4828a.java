package o2;

/* renamed from: o2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4828a {

    /* renamed from: a, reason: collision with root package name */
    public final String f39687a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f39688b;

    public C4828a(String str, boolean z8) {
        this.f39687a = str;
        this.f39688b = z8;
    }

    public static String a() {
        throw null;
    }

    public final String toString() {
        String str = this.f39687a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
        sb.append("{");
        sb.append(str);
        sb.append("}");
        sb.append(this.f39688b);
        return sb.toString();
    }
}
