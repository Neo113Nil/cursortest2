package o;

import G.C0235z;
import G.InterfaceC0191c0;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: o.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0895k0 extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8816d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f8817e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0895k0(int i2, InterfaceC0191c0 interfaceC0191c0) {
        super(1);
        this.f8816d = i2;
        this.f8817e = interfaceC0191c0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC0191c0 interfaceC0191c0 = this.f8817e;
        switch (this.f8816d) {
            case 0:
                break;
            case 1:
                Configuration configuration = new Configuration((Configuration) obj);
                C0235z c0235z = AndroidCompositionLocals_androidKt.f5212a;
                interfaceC0191c0.setValue(configuration);
                break;
            default:
                ((Function1) interfaceC0191c0.getValue()).invoke(new Y.c(((Y.c) obj).f4372a));
                break;
        }
        return Unit.f7487a;
    }
}
