package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum cff implements ibs {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);

    public final int h;

    cff(int i2) {
        this.h = i2;
    }

    @Override // defpackage.ibs
    public final int a() {
        return this.h;
    }
}
