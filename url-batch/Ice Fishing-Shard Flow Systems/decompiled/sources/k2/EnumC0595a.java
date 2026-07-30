package k2;

import a2.InterfaceC0174c;

/* renamed from: k2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0595a implements InterfaceC0174c {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_EVENT(0),
    MESSAGE_DELIVERED(1),
    /* JADX INFO: Fake field, exist only in values array */
    MESSAGE_OPEN(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f6035d;

    EnumC0595a(int i2) {
        this.f6035d = i2;
    }

    @Override // a2.InterfaceC0174c
    public final int getNumber() {
        return this.f6035d;
    }
}
