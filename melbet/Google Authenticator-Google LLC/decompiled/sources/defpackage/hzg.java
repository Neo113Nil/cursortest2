package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hzg {
    public static final hzg a = new hzg("SHA1");
    public static final hzg b = new hzg("SHA224");
    public static final hzg c = new hzg("SHA256");
    public static final hzg d = new hzg("SHA384");
    public static final hzg e = new hzg("SHA512");
    private final String f;

    private hzg(String str) {
        this.f = str;
    }

    public final String toString() {
        return this.f;
    }
}
