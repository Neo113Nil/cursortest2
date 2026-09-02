package I1;

import w1.InterfaceC0715c;

/* loaded from: classes.dex */
public enum c implements InterfaceC0715c {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_OS(0),
    ANDROID(1),
    /* JADX INFO: Fake field, exist only in values array */
    IOS(2),
    /* JADX INFO: Fake field, exist only in values array */
    WEB(3);


    /* renamed from: f, reason: collision with root package name */
    public final int f1175f;

    c(int i7) {
        this.f1175f = i7;
    }

    @Override // w1.InterfaceC0715c
    public final int getNumber() {
        return this.f1175f;
    }
}
