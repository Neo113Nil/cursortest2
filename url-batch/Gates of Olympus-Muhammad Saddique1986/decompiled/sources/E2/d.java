package E2;

import a0.C0239d;
import e2.InterfaceC0426e;
import kotlinx.serialization.descriptors.SerialDescriptor;
import u0.C1123s;

/* loaded from: classes.dex */
public final /* synthetic */ class d extends f2.h implements InterfaceC0426e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1048l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i3, Object obj, Class cls, String str, String str2, int i4, int i5) {
        super(i3, i4, cls, obj, str, str2);
        this.f1048l = i5;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        switch (this.f1048l) {
            case 0:
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                int intValue = ((Number) obj2).intValue();
                f2.j.f(serialDescriptor, "p0");
                e eVar = (e) this.f5813e;
                eVar.getClass();
                boolean z3 = !serialDescriptor.j(intValue) && serialDescriptor.h(intValue).f();
                eVar.f1050b = z3;
                return Boolean.valueOf(z3);
            default:
                return Boolean.valueOf(C1123s.g((C1123s) this.f5813e, (Z.b) obj, (C0239d) obj2));
        }
    }
}
