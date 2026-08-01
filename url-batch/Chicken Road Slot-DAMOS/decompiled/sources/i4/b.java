package i4;

import androidx.lifecycle.u;
import j0.a0;
import j0.f0;
import j0.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import n0.h;
import n0.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4638d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4639e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4640i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f4641r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f4642s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ hd.c f4643t;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, hd.c cVar, int i3, int i10) {
        this.f4638d = i10;
        this.f4640i = obj;
        this.f4641r = obj2;
        this.f4642s = obj3;
        this.f4643t = cVar;
        this.f4639e = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4638d) {
            case 0:
                ((Integer) obj2).getClass();
                cf.c.f((Boolean) this.f4640i, this.f4641r, (u) this.f4642s, (Function1) this.f4643t, (i0) obj, h.z(this.f4639e | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                r.b((j0.a) this.f4640i, (a0) this.f4641r, (f0) this.f4642s, (x0.d) this.f4643t, (i0) obj, h.z(this.f4639e | 1));
                break;
        }
        return Unit.f5554a;
    }
}
