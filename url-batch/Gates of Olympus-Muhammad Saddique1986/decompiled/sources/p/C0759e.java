package p;

import I.C0143d;
import I.InterfaceC0164n0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e2.InterfaceC0424c;

/* renamed from: p.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0759e extends f2.k implements InterfaceC0424c {

    /* renamed from: f, reason: collision with root package name */
    public static final C0759e f7656f = new C0759e(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C0759e f7657g = new C0759e(1, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7658e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0759e(int i3, int i4) {
        super(i3);
        this.f7658e = i4;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f7658e) {
            case 0:
                InterfaceC0164n0 interfaceC0164n0 = (InterfaceC0164n0) obj;
                I.X0 x02 = AndroidCompositionLocals_androidKt.f4938b;
                interfaceC0164n0.getClass();
                if (((Context) C0143d.L(interfaceC0164n0, x02)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return AbstractC0763g.f7668b;
                }
                InterfaceC0757d.f7652a.getClass();
                return C0755c.f7649c;
            default:
                return Boolean.valueOf(!n0.q.e(((n0.s) obj).f7316i, 2));
        }
    }
}
