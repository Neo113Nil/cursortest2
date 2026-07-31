package A0;

import R1.y;
import e2.InterfaceC0424c;
import k2.C0572d;
import l2.InterfaceC0604e;

/* loaded from: classes.dex */
public final class m extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f135e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f136f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(String str, int i3) {
        super(1);
        this.f135e = i3;
        this.f136f = str;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        y yVar = y.f4171a;
        String str = this.f136f;
        switch (this.f135e) {
            case 0:
                InterfaceC0604e[] interfaceC0604eArr = u.f193a;
                ((i) obj).c(s.f166a, O2.l.l0(str));
                return yVar;
            case 1:
                InterfaceC0604e[] interfaceC0604eArr2 = u.f193a;
                v vVar = s.f169d;
                InterfaceC0604e interfaceC0604e = u.f193a[2];
                vVar.a((i) obj, str);
                return yVar;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                i iVar = (i) obj;
                InterfaceC0604e[] interfaceC0604eArr3 = u.f193a;
                iVar.c(s.f166a, O2.l.l0(str));
                u.d(iVar, 5);
                return yVar;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                InterfaceC0604e[] interfaceC0604eArr4 = u.f193a;
                ((i) obj).c(s.D, str);
                return yVar;
            default:
                C0572d c0572d = (C0572d) obj;
                f2.j.f(c0572d, "it");
                f2.j.f(str, "<this>");
                return str.subSequence(c0572d.f6419d, c0572d.f6420e + 1).toString();
        }
    }
}
