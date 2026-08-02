package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum leu implements jkr {
    UNKNOWN(0),
    SUCCESS(1),
    FAILURE(2),
    CANCELED(3),
    TIMEOUT(4),
    INTERRUPTED(5),
    INCOMPLETE(6);

    public final int h;

    leu(int i2) {
        this.h = i2;
    }

    @Override // defpackage.jkr
    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
