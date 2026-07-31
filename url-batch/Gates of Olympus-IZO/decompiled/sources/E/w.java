package E;

import I.InterfaceC0088c0;
import h1.C0438i;
import java.util.ArrayList;
import java.util.List;
import q1.C0784h;
import s.C0864g;
import u.InterfaceC0953v;

/* loaded from: classes.dex */
public final class w extends Z1.j implements Y1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f706e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0088c0 f707f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(InterfaceC0088c0 interfaceC0088c0, int i3) {
        super(0);
        this.f706e = i3;
        this.f707f = interfaceC0088c0;
    }

    @Override // Y1.a
    public final Object b() {
        switch (this.f706e) {
            case 0:
                return (C0027i) this.f707f.getValue();
            case 1:
                List list = (List) this.f707f.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (Z1.i.a(((C0784h) obj).f6895e.f6962d, "composable")) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                return new C0864g((Y1.c) this.f707f.getValue());
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                return new t.g((Y1.c) this.f707f.getValue());
            default:
                return (InterfaceC0953v) ((Y1.a) this.f707f.getValue()).b();
        }
    }
}
