package y1;

import java.io.File;

/* renamed from: y1.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5222B implements InterfaceC5244s {

    /* renamed from: b, reason: collision with root package name */
    public static final C5222B f41814b = new C5222B(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41815a;

    public /* synthetic */ C5222B(int i) {
        this.f41815a = i;
    }

    @Override // y1.InterfaceC5244s
    public final boolean a(Object obj) {
        switch (this.f41815a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // y1.InterfaceC5244s
    public final C5243r b(Object obj, int i, int i4, s1.h hVar) {
        switch (this.f41815a) {
            case 0:
                return new C5243r(new M1.d(obj), new C5229d(1, obj));
            case 1:
                File file = (File) obj;
                return new C5243r(new M1.d(file), new C5229d(0, file));
            default:
                return null;
        }
    }
}
