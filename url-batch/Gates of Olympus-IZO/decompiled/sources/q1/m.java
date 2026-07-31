package q1;

/* loaded from: classes.dex */
public final class m extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6925e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0775D f6926f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(C0775D c0775d, int i3) {
        super(1);
        this.f6925e = i3;
        this.f6926f = c0775d;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        switch (this.f6925e) {
            case 0:
                Z1.i.f((w) obj, "destination");
                return Boolean.valueOf(!this.f6926f.f6840m.containsKey(Integer.valueOf(r2.f6967i)));
            default:
                Z1.i.f((w) obj, "destination");
                return Boolean.valueOf(!this.f6926f.f6840m.containsKey(Integer.valueOf(r2.f6967i)));
        }
    }
}
