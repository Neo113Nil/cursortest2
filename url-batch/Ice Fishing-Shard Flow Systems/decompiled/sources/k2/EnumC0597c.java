package k2;

import a2.InterfaceC0174c;

/* renamed from: k2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0597c implements InterfaceC0174c {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_OS(0),
    ANDROID(1),
    /* JADX INFO: Fake field, exist only in values array */
    IOS(2),
    /* JADX INFO: Fake field, exist only in values array */
    WEB(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f6042d;

    EnumC0597c(int i2) {
        this.f6042d = i2;
    }

    @Override // a2.InterfaceC0174c
    public final int getNumber() {
        return this.f6042d;
    }
}
