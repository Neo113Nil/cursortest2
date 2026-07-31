package I1;

import w1.InterfaceC0715c;

/* loaded from: classes.dex */
public enum a implements InterfaceC0715c {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_EVENT(0),
    MESSAGE_DELIVERED(1),
    /* JADX INFO: Fake field, exist only in values array */
    MESSAGE_OPEN(2);


    /* renamed from: f, reason: collision with root package name */
    public final int f1168f;

    a(int i7) {
        this.f1168f = i7;
    }

    @Override // w1.InterfaceC0715c
    public final int getNumber() {
        return this.f1168f;
    }
}
