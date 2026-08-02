package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum jpr {
    SMALL("version 1-9"),
    MEDIUM("version 10-26"),
    LARGE("version 27-40");

    private final String e;

    jpr(String str) {
        this.e = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.e;
    }
}
