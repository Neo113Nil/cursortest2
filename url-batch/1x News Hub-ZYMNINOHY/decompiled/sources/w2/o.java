package w2;

import d2.InterfaceC0300c;
import e2.EnumC0317a;
import f2.AbstractC0326c;
import t2.U;

/* loaded from: classes.dex */
public final class o extends AbstractC0326c {

    /* renamed from: d, reason: collision with root package name */
    public p f10679d;

    /* renamed from: e, reason: collision with root package name */
    public e f10680e;
    public r f;

    /* renamed from: g, reason: collision with root package name */
    public U f10681g;

    /* renamed from: h, reason: collision with root package name */
    public Object f10682h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f10683i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f10684j;

    /* renamed from: k, reason: collision with root package name */
    public int f10685k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, InterfaceC0300c interfaceC0300c) {
        super(interfaceC0300c);
        this.f10684j = pVar;
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        this.f10683i = obj;
        this.f10685k |= Integer.MIN_VALUE;
        this.f10684j.n(null, this);
        return EnumC0317a.f4969a;
    }
}
