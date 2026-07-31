package F;

import a.AbstractC0157a;
import e2.C0380d;
import f2.InterfaceC0390e;

/* loaded from: classes.dex */
public final class Z extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1172e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f1173f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Z(String str, int i3) {
        super(1);
        this.f1172e = i3;
        this.f1173f = str;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        L1.z zVar = L1.z.f2729a;
        String str = this.f1173f;
        switch (this.f1172e) {
            case 0:
                z0.i iVar = (z0.i) obj;
                InterfaceC0390e[] interfaceC0390eArr = z0.s.f9036a;
                iVar.d(z0.q.f9010a, AbstractC0157a.M(str));
                z0.s.c(iVar, 5);
                return zVar;
            case 1:
                C0380d c0380d = (C0380d) obj;
                Z1.i.f(c0380d, "it");
                Z1.i.f(str, "<this>");
                return str.subSequence(c0380d.f4768d, c0380d.f4769e + 1).toString();
            default:
                InterfaceC0390e[] interfaceC0390eArr2 = z0.s.f9036a;
                ((z0.i) obj).d(z0.q.f9010a, AbstractC0157a.M(str));
                return zVar;
        }
    }
}
