package u0;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: u0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0986n extends Z1.g implements Y1.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f8377l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0986n(int i3, Object obj, Class cls, String str, String str2, int i4, int i5) {
        super(i3, i4, cls, obj, str, str2);
        this.f8377l = i5;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f8377l) {
            case 0:
                return Boolean.valueOf(C0997t.f((C0997t) this.f3461e, (Z.a) obj, (a0.d) obj2));
            default:
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                int intValue = ((Number) obj2).intValue();
                Z1.i.f(serialDescriptor, "p0");
                y2.d dVar = (y2.d) this.f3461e;
                dVar.getClass();
                boolean z3 = !serialDescriptor.j(intValue) && serialDescriptor.h(intValue).f();
                dVar.f8836b = z3;
                return Boolean.valueOf(z3);
        }
    }
}
