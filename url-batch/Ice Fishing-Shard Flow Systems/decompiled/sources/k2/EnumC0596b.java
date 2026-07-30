package k2;

import a2.InterfaceC0174c;

/* renamed from: k2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0596b implements InterfaceC0174c {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(0),
    DATA_MESSAGE(1),
    /* JADX INFO: Fake field, exist only in values array */
    TOPIC(2),
    DISPLAY_NOTIFICATION(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f6039d;

    EnumC0596b(int i2) {
        this.f6039d = i2;
    }

    @Override // a2.InterfaceC0174c
    public final int getNumber() {
        return this.f6039d;
    }
}
