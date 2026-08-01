package X0;

import i1.InterfaceC0192l;

/* loaded from: classes.dex */
public final class a extends j1.i implements InterfaceC0192l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1367b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1368c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i, Object obj) {
        super(1);
        this.f1367b = i;
        this.f1368c = obj;
    }

    @Override // i1.InterfaceC0192l
    public final Object g(Object obj) {
        switch (this.f1367b) {
            case 0:
                return obj == ((e) this.f1368c) ? "(this Collection)" : String.valueOf(obj);
            default:
                n1.c cVar = (n1.c) obj;
                j1.h.e(cVar, "it");
                String str = (String) this.f1368c;
                j1.h.e(str, "<this>");
                return str.subSequence(cVar.f3755a, cVar.f3756b + 1).toString();
        }
    }
}
