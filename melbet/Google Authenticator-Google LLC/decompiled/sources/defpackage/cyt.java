package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum cyt implements jkr {
    UNKNOWN(0),
    NONE(1),
    EXACT(2),
    SUBSTRING(3),
    HEURISTIC(4),
    SHEEPDOG_ELIGIBLE(5);

    public final int g;

    cyt(int i) {
        this.g = i;
    }

    @Override // defpackage.jkr
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
