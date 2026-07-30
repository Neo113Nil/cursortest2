package U1;

/* loaded from: classes.dex */
public final class d extends S1.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3247b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(String str, int i) {
        super(str, 1);
        this.f3247b = i;
    }

    @Override // S1.a
    public final void a(int i, Object obj) {
        switch (this.f3247b) {
            case 0:
                ((e) obj).setAlpha(i);
                break;
            case 1:
                ((e) obj).f3273z = i;
                break;
            case 2:
                ((e) obj).f3260D = i;
                break;
            case 3:
                ((e) obj).f3257A = i;
                break;
            case 4:
                ((e) obj).f3258B = i;
                break;
            default:
                ((e) obj).f3259C = i;
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f3247b) {
            case 0:
                return Integer.valueOf(((e) obj).f3264H);
            case 1:
                return Integer.valueOf(((e) obj).f3273z);
            case 2:
                return Integer.valueOf(((e) obj).f3260D);
            case 3:
                return Integer.valueOf(((e) obj).f3257A);
            case 4:
                return Integer.valueOf(((e) obj).f3258B);
            default:
                return Integer.valueOf(((e) obj).f3259C);
        }
    }
}
