package j0;

import java.util.ArrayList;
import java.util.List;
import m0.t2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class j1 implements p6.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3715d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t2 f3716e;

    public /* synthetic */ j1(t2 t2Var, int i) {
        this.f3715d = i;
        this.f3716e = t2Var;
    }

    @Override // p6.a
    public final Object b() {
        float floatValue;
        switch (this.f3715d) {
            case 0:
                floatValue = ((Number) this.f3716e.getValue()).floatValue();
                break;
            case 1:
                floatValue = ((Number) this.f3716e.getValue()).floatValue();
                break;
            default:
                List list = (List) this.f3716e.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (q6.i.a(((o4.d) obj).f5621e.f5670d, "composable")) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
        }
        return Float.valueOf(floatValue);
    }
}
