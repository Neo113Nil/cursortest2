package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum bxe implements jkr {
    SYNC_STATUS_NONE(0),
    FAILED(1),
    IN_PROGRESS(2),
    SUCCESSFUL(3);

    public final int e;

    bxe(int i) {
        this.e = i;
    }

    public static bxe b(int i) {
        if (i == 0) {
            return SYNC_STATUS_NONE;
        }
        if (i == 1) {
            return FAILED;
        }
        if (i == 2) {
            return IN_PROGRESS;
        }
        if (i != 3) {
            return null;
        }
        return SUCCESSFUL;
    }

    @Override // defpackage.jkr
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
