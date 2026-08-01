package n0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6799d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6800e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f6801i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ hd.c f6802r;

    public /* synthetic */ r(int i3, Function0 function0, Function0 function02, int i10) {
        this.f6799d = 2;
        this.f6800e = i3;
        this.f6801i = function0;
        this.f6802r = function02;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6799d) {
            case 0:
                ((Integer) obj2).getClass();
                h.a((q1) this.f6801i, (x0.d) this.f6802r, (i0) obj, h.z(this.f6800e | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                h.b((q1[]) this.f6801i, (Function2) this.f6802r, (i0) obj, h.z(this.f6800e | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                int z10 = h.z(1);
                cf.c.c(this.f6800e, (Function0) this.f6801i, (Function0) this.f6802r, (i0) obj, z10);
                break;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                ((Integer) obj2).intValue();
                g8.b.d((j9.c) this.f6801i, (Function0) this.f6802r, (i0) obj, h.z(this.f6800e | 1));
                break;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                ((Integer) obj2).intValue();
                x.g.a(h.z(this.f6800e | 1), (d1.l) this.f6801i, (Function1) this.f6802r, (i0) obj);
                break;
            default:
                ((Integer) obj2).getClass();
                int z11 = h.z(this.f6800e) | 1;
                ((x0.d) this.f6802r).e(this.f6801i, (i0) obj, z11);
                break;
        }
        return Unit.f5554a;
    }

    public /* synthetic */ r(Object obj, hd.c cVar, int i3, int i10) {
        this.f6799d = i10;
        this.f6801i = obj;
        this.f6802r = cVar;
        this.f6800e = i3;
    }

    public /* synthetic */ r(x0.d dVar, Object obj, int i3) {
        this.f6799d = 5;
        this.f6802r = dVar;
        this.f6801i = obj;
        this.f6800e = i3;
    }
}
