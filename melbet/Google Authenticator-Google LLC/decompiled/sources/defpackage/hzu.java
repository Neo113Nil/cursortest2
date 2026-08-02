package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum hzu implements jkr {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);

    private final int i;

    hzu(int i) {
        this.i = i;
    }

    @Override // defpackage.jkr
    public final int a() {
        return this == UNRECOGNIZED ? jky.c() : this.i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.i);
    }
}
