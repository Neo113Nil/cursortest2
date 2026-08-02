package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface kmr {
    public static final kmr a;

    static {
        khj khjVar;
        try {
            Class.forName("java.time.Instant");
            khjVar = new khj(0);
        } catch (ClassNotFoundException unused) {
            khjVar = new khj(1);
        }
        a = khjVar;
    }

    long a();
}
