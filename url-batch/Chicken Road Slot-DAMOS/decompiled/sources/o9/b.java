package o9;

import d1.l;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import n0.h;
import n0.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7555d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f7556e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7557i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l f7558r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Function0 f7559s;

    public /* synthetic */ b(String str, int i3, l lVar, Function0 function0, int i10, int i11) {
        this.f7555d = i11;
        this.f7556e = str;
        this.f7557i = i3;
        this.f7558r = lVar;
        this.f7559s = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7555d) {
            case 0:
                ((Integer) obj2).getClass();
                int z10 = h.z(1);
                cf.c.i(this.f7556e, this.f7557i, this.f7558r, this.f7559s, (i0) obj, z10);
                break;
            default:
                ((Integer) obj2).getClass();
                int z11 = h.z(1);
                g8.b.b(this.f7556e, this.f7557i, this.f7558r, this.f7559s, (i0) obj, z11);
                break;
        }
        return Unit.f5554a;
    }
}
