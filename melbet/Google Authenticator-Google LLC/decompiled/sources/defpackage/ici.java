package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum ici implements jkr {
    DEFAULT_CACHE_OK_IF_VALID(0),
    CACHE_OK_IF_AVAILABLE(1),
    SKIP_CACHE(2),
    CACHE_ONLY(3),
    VALID_CACHE_ONLY(4);

    private final int g;

    ici(int i) {
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
