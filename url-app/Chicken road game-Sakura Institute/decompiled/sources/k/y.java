package k;

import kotlin.jvm.functions.Function1;
import l.InterfaceC0799z;
import l.h0;
import y2.C1338m;

/* loaded from: classes.dex */
public final class y extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7348d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0730F f7349e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0731G f7350i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(C0730F c0730f, C0731G c0731g, int i2) {
        super(1);
        this.f7348d = i2;
        this.f7349e = c0730f;
        this.f7350i = c0731g;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC0799z interfaceC0799z;
        InterfaceC0799z interfaceC0799z2;
        switch (this.f7348d) {
            case 0:
                h0 h0Var = (h0) obj;
                w wVar = w.f7338d;
                w wVar2 = w.f7339e;
                if (h0Var.a(wVar, wVar2)) {
                    C0732H c0732h = this.f7349e.f7253a.f7268a;
                    return (c0732h == null || (interfaceC0799z2 = c0732h.f7258b) == null) ? AbstractC0725A.f7230b : interfaceC0799z2;
                }
                if (!h0Var.a(wVar2, w.f7340i)) {
                    return AbstractC0725A.f7230b;
                }
                C0732H c0732h2 = this.f7350i.f7256a.f7268a;
                return (c0732h2 == null || (interfaceC0799z = c0732h2.f7258b) == null) ? AbstractC0725A.f7230b : interfaceC0799z;
            case 1:
                int ordinal = ((w) obj).ordinal();
                float f4 = 1.0f;
                if (ordinal == 0) {
                    C0732H c0732h3 = this.f7349e.f7253a.f7268a;
                    if (c0732h3 != null) {
                        f4 = c0732h3.f7257a;
                    }
                } else if (ordinal != 1) {
                    if (ordinal != 2) {
                        throw new C1338m();
                    }
                    C0732H c0732h4 = this.f7350i.f7256a.f7268a;
                    if (c0732h4 != null) {
                        f4 = c0732h4.f7257a;
                    }
                }
                return Float.valueOf(f4);
            case 2:
                h0 h0Var2 = (h0) obj;
                w wVar3 = w.f7338d;
                w wVar4 = w.f7339e;
                if (!h0Var2.a(wVar3, wVar4) && h0Var2.a(wVar4, w.f7340i)) {
                    O o4 = this.f7350i.f7256a;
                    return AbstractC0725A.f7230b;
                }
                return AbstractC0725A.f7230b;
            default:
                int ordinal2 = ((w) obj).ordinal();
                if (ordinal2 != 0 && ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        throw new C1338m();
                    }
                    O o5 = this.f7350i.f7256a;
                }
                return Float.valueOf(1.0f);
        }
    }
}
