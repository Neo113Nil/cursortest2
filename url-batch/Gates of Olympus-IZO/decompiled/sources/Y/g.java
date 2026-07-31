package Y;

import L1.z;
import Z1.j;
import h1.C0438i;
import r0.G;
import r0.H;

/* loaded from: classes.dex */
public final class g extends j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3400e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ H f3401f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(H h3, int i3) {
        super(1);
        this.f3400e = i3;
        this.f3401f = h3;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        switch (this.f3400e) {
            case 0:
                G.f((G) obj, this.f3401f, 0, 0);
                break;
            case 1:
                G.d((G) obj, this.f3401f, 0, 0);
                break;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                G.d((G) obj, this.f3401f, 0, 0);
                break;
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                G.f((G) obj, this.f3401f, 0, 0);
                break;
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                G.f((G) obj, this.f3401f, 0, 0);
                break;
            case 5:
                G.f((G) obj, this.f3401f, 0, 0);
                break;
            case 6:
                G.f((G) obj, this.f3401f, 0, 0);
                break;
            case C0438i.DOUBLE_FIELD_NUMBER /* 7 */:
                G.g((G) obj, this.f3401f, 0, 0);
                break;
            case 8:
                G.d((G) obj, this.f3401f, 0, 0);
                break;
            default:
                G.d((G) obj, this.f3401f, 0, 0);
                break;
        }
        return z.f2729a;
    }
}
