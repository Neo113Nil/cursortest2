package p;

import I.C0186z;
import I.InterfaceC0142c0;
import a0.C0238c;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e2.InterfaceC0424c;

/* renamed from: p.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0780o0 extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7742e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0142c0 f7743f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0780o0(InterfaceC0142c0 interfaceC0142c0, int i3) {
        super(1);
        this.f7742e = i3;
        this.f7743f = interfaceC0142c0;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        R1.y yVar = R1.y.f4171a;
        InterfaceC0142c0 interfaceC0142c0 = this.f7743f;
        switch (this.f7742e) {
            case 0:
                break;
            case 1:
                Configuration configuration = new Configuration((Configuration) obj);
                C0186z c0186z = AndroidCompositionLocals_androidKt.f4937a;
                interfaceC0142c0.setValue(configuration);
                break;
            default:
                ((InterfaceC0424c) interfaceC0142c0.getValue()).n(new C0238c(((C0238c) obj).f4722a));
                break;
        }
        return yVar;
    }
}
