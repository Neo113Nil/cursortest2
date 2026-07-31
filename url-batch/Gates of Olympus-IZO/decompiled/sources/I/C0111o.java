package I;

/* renamed from: I.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0111o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2290a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2291b;

    public /* synthetic */ C0111o(int i3, Object obj) {
        this.f2290a = i3;
        this.f2291b = obj;
    }

    public final void a() {
        switch (this.f2290a) {
            case 0:
                C0113p c0113p = (C0113p) this.f2291b;
                c0113p.f2331z--;
                break;
            default:
                S.v vVar = (S.v) this.f2291b;
                vVar.f3259j--;
                break;
        }
    }

    public final void b() {
        switch (this.f2290a) {
            case 0:
                ((C0113p) this.f2291b).f2331z++;
                break;
            default:
                ((S.v) this.f2291b).f3259j++;
                break;
        }
    }
}
