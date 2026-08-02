package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hwy {
    public static final hwy a = new hwy("TINK");
    public static final hwy b = new hwy("NO_PREFIX");
    private final String c;

    private hwy(String str) {
        this.c = str;
    }

    public final String toString() {
        return this.c;
    }
}
