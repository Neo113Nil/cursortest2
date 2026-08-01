package Y0;

/* loaded from: classes.dex */
public final class a extends k1.f implements j1.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1503b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1504c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i, Object obj) {
        super(1);
        this.f1503b = i;
        this.f1504c = obj;
    }

    @Override // j1.l
    public final Object g(Object obj) {
        switch (this.f1503b) {
            case 0:
                return obj == ((d) this.f1504c) ? "(this Collection)" : String.valueOf(obj);
            default:
                o1.c cVar = (o1.c) obj;
                k1.e.e(cVar, "it");
                String str = (String) this.f1504c;
                k1.e.e(str, "<this>");
                return str.subSequence(cVar.f3595a, cVar.f3596b + 1).toString();
        }
    }
}
