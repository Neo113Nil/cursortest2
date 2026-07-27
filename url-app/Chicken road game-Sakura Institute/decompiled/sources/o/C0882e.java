package o;

import G.C0192d;
import G.InterfaceC0213n0;
import G.Y0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function1;
import l0.AbstractC0819q;

/* renamed from: o.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0882e extends M2.p implements Function1 {

    /* renamed from: e, reason: collision with root package name */
    public static final C0882e f8758e = new C0882e(1, 0);

    /* renamed from: i, reason: collision with root package name */
    public static final C0882e f8759i = new C0882e(1, 1);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8760d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0882e(int i2, int i4) {
        super(i2);
        this.f8760d = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f8760d) {
            case 0:
                InterfaceC0213n0 interfaceC0213n0 = (InterfaceC0213n0) obj;
                Y0 y02 = AndroidCompositionLocals_androidKt.f5213b;
                interfaceC0213n0.getClass();
                if (((Context) C0192d.L(interfaceC0213n0, y02)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return AbstractC0886g.f8768b;
                }
                InterfaceC0880d.f8754a.getClass();
                return C0878c.f8751c;
            default:
                return Boolean.valueOf(!AbstractC0819q.e(((l0.s) obj).f7931i, 2));
        }
    }
}
