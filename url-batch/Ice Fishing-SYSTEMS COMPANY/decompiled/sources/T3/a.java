package T3;

import U3.f;
import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements R3.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3100a;

    @Override // R3.a
    public final void a(Object obj, Object obj2) {
        switch (this.f3100a) {
            case 0:
                throw new R3.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                R3.e eVar = (R3.e) obj2;
                eVar.a(f.f3288g, entry.getKey());
                eVar.a(f.f3289h, entry.getValue());
                return;
            default:
                throw new R3.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
