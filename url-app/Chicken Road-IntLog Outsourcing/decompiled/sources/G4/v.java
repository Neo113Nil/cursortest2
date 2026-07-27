package G4;

import D4.X;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.AbstractC1295c;

/* loaded from: classes.dex */
public final class v extends AbstractC1295c {

    /* renamed from: a, reason: collision with root package name */
    public w f1106a;

    /* renamed from: b, reason: collision with root package name */
    public e f1107b;

    /* renamed from: c, reason: collision with root package name */
    public y f1108c;

    /* renamed from: d, reason: collision with root package name */
    public X f1109d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1110e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f1111f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w f1112g;

    /* renamed from: h, reason: collision with root package name */
    public int f1113h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.f1112g = wVar;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.f1111f = obj;
        this.f1113h |= Integer.MIN_VALUE;
        this.f1112g.i(null, this);
        return EnumC1260a.f11058a;
    }
}
