package y1;

import java.io.File;

/* renamed from: y1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5228c implements InterfaceC5244s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41826a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f41827b;

    public /* synthetic */ C5228c(int i, Object obj) {
        this.f41826a = i;
        this.f41827b = obj;
    }

    @Override // y1.InterfaceC5244s
    public final boolean a(Object obj) {
        switch (this.f41826a) {
            case 0:
                return true;
            case 1:
                return obj.toString().startsWith("data:image");
            default:
                return true;
        }
    }

    @Override // y1.InterfaceC5244s
    public final C5243r b(Object obj, int i, int i4, s1.h hVar) {
        switch (this.f41826a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new C5243r(new M1.d(bArr), new C5239n(1, bArr, (C5221A) this.f41827b));
            case 1:
                return new C5243r(new M1.d(obj), new t1.c(obj.toString(), (C5221A) this.f41827b, 1));
            default:
                File file = (File) obj;
                return new C5243r(new M1.d(file), new t1.c(file, (C5221A) this.f41827b, 2));
        }
    }
}
