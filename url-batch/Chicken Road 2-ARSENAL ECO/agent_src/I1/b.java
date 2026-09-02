package I1;

import w1.InterfaceC0715c;

/* loaded from: classes.dex */
public enum b implements InterfaceC0715c {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(0),
    DATA_MESSAGE(1),
    /* JADX INFO: Fake field, exist only in values array */
    TOPIC(2),
    DISPLAY_NOTIFICATION(3);


    /* renamed from: f, reason: collision with root package name */
    public final int f1172f;

    b(int i7) {
        this.f1172f = i7;
    }

    @Override // w1.InterfaceC0715c
    public final int getNumber() {
        return this.f1172f;
    }
}
