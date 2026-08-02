package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hwn {
    public static final hwn a = new hwn("SHA1");
    public static final hwn b = new hwn("SHA224");
    public static final hwn c = new hwn("SHA256");
    public static final hwn d = new hwn("SHA384");
    public static final hwn e = new hwn("SHA512");
    private final String f;

    private hwn(String str) {
        this.f = str;
    }

    public final String toString() {
        return this.f;
    }
}
