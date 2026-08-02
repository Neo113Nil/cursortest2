package b;

import c3.C0297i;
import o3.InterfaceC1328a;

/* loaded from: classes.dex */
public final class s extends kotlin.jvm.internal.j implements InterfaceC1328a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5241e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0238A f5242f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(C0238A c0238a, int i4) {
        super(0);
        this.f5241e = i4;
        this.f5242f = c0238a;
    }

    @Override // o3.InterfaceC1328a
    public final Object invoke() {
        switch (this.f5241e) {
            case 0:
                this.f5242f.c();
                break;
            case 1:
                this.f5242f.b();
                break;
            default:
                this.f5242f.c();
                break;
        }
        return C0297i.f5732a;
    }
}
