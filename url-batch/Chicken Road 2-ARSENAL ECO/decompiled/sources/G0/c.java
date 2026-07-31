package G0;

import w1.InterfaceC0715c;

/* loaded from: classes.dex */
public enum c implements InterfaceC0715c {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);


    /* renamed from: f, reason: collision with root package name */
    public final int f823f;

    c(int i7) {
        this.f823f = i7;
    }

    @Override // w1.InterfaceC0715c
    public final int getNumber() {
        return this.f823f;
    }
}
