package t;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements p6.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6735d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f6736e;

    public /* synthetic */ a(u uVar, int i) {
        this.f6735d = i;
        this.f6736e = uVar;
    }

    @Override // p6.a
    public final Object b() {
        w1.k kVar;
        switch (this.f6735d) {
            case 0:
                m0.b0 b0Var = androidx.compose.foundation.c.f484a;
                u uVar = this.f6736e;
                i0 i0Var = (i0) w1.f.i(uVar, b0Var);
                if (i0Var == null) {
                    w.a.a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. You can also use ComposeFoundationFlags.isNonComposedClickableEnabled to temporarily opt-out; note that this flag will be removed in a future release and is only intended to be a temporary migration aid. The Indication instance provided here was: " + i0Var);
                }
                i0 i0Var2 = uVar.A;
                uVar.A = i0Var;
                if (i0Var2 != null && !q6.i.a(i0Var, i0Var2) && ((kVar = uVar.B) != null || !uVar.H)) {
                    if (kVar != null) {
                        uVar.s0(kVar);
                    }
                    uVar.B = null;
                    uVar.x0();
                }
                return c6.m.f1757a;
            default:
                this.f6736e.f6865y.b();
                return Boolean.TRUE;
        }
    }
}
