package d1;

import a2.InterfaceC0174c;

/* renamed from: d1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0356c implements InterfaceC0174c {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);


    /* renamed from: d, reason: collision with root package name */
    public final int f4640d;

    EnumC0356c(int i2) {
        this.f4640d = i2;
    }

    @Override // a2.InterfaceC0174c
    public final int getNumber() {
        return this.f4640d;
    }
}
