package n6;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public enum c implements s8.c {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);


    /* renamed from: d, reason: collision with root package name */
    public final int f7161d;

    c(int i3) {
        this.f7161d = i3;
    }

    @Override // s8.c
    public final int getNumber() {
        return this.f7161d;
    }
}
