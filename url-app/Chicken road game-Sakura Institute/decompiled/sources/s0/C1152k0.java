package s0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import v1.C1248e;

/* renamed from: s0.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1152k0 extends M2.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10246d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f10247e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f10248i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f10249j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1152k0(w.P p4, X.p pVar, boolean z4) {
        super(0);
        this.f10248i = p4;
        this.f10249j = pVar;
        this.f10247e = z4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        L0 l02;
        switch (this.f10246d) {
            case 0:
                if (this.f10247e) {
                    C1248e c1248e = (C1248e) this.f10248i;
                    c1248e.getClass();
                    String key = (String) this.f10249j;
                    Intrinsics.checkNotNullParameter(key, "key");
                    c1248e.f10979a.h(key);
                }
                return Unit.f7487a;
            default:
                w.P p4 = (w.P) this.f10248i;
                if (!p4.b()) {
                    ((X.p) this.f10249j).a(X.i.f4327k);
                } else if (!this.f10247e && (l02 = p4.f11056c) != null) {
                    ((C1146h0) l02).b();
                }
                return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1152k0(boolean z4, C1248e c1248e, String str) {
        super(0);
        this.f10247e = z4;
        this.f10248i = c1248e;
        this.f10249j = str;
    }
}
