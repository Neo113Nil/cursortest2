package o;

import G.Y0;
import f1.C0607a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import l.C0796w;
import r0.AbstractC1065f;
import s0.AbstractC1144g0;

/* renamed from: o.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0872E extends M2.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8611d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0891i0 f8612e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0872E(C0891i0 c0891i0, int i2) {
        super(0);
        this.f8611d = i2;
        this.f8612e = c0891i0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        if (r0 != false) goto L13;
     */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        boolean z4;
        boolean z5;
        switch (this.f8611d) {
            case 0:
                Y2.e eVar = this.f8612e.f8801z;
                if (eVar != null) {
                    eVar.o(r.f8864a);
                }
                return Unit.f7487a;
            case 1:
                C0908r0 c0908r0 = this.f8612e.f8791I;
                if (!c0908r0.f8865a.d()) {
                    m.i0 i0Var = c0908r0.f8866b;
                    z4 = false;
                    if (i0Var == null) {
                        z5 = false;
                        break;
                    } else {
                        z5 = i0Var.e();
                        break;
                    }
                }
                z4 = true;
                return Boolean.valueOf(!z4);
            default:
                Y0 y02 = AbstractC1144g0.f10218f;
                C0891i0 c0891i0 = this.f8612e;
                c0891i0.f8790H.f8828a = new C0796w(new C0607a((M0.b) AbstractC1065f.i(c0891i0, y02)));
                return Unit.f7487a;
        }
    }
}
