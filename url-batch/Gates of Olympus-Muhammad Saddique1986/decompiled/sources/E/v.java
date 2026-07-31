package E;

import I.InterfaceC0142c0;
import e2.InterfaceC0422a;
import e2.InterfaceC0424c;
import java.util.ArrayList;
import java.util.List;
import s.C0937f;
import s.C0939h;
import t1.C1028h;

/* loaded from: classes.dex */
public final class v extends f2.k implements InterfaceC0422a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1006e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0142c0 f1007f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(InterfaceC0142c0 interfaceC0142c0, int i3) {
        super(0);
        this.f1006e = i3;
        this.f1007f = interfaceC0142c0;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        switch (this.f1006e) {
            case 0:
                return (C0080h) this.f1007f.getValue();
            case 1:
                return new C0937f((InterfaceC0424c) this.f1007f.getValue());
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                return (C0939h) ((InterfaceC0422a) this.f1007f.getValue()).b();
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                List list = (List) this.f1007f.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (f2.j.a(((C1028h) obj).f8874e.f8931d, "composable")) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            default:
                Boolean bool = (Boolean) this.f1007f.getValue();
                bool.booleanValue();
                return bool;
        }
    }
}
