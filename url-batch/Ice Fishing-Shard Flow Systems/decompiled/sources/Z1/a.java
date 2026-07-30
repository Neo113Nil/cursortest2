package Z1;

import a2.f;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements X1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3009a;

    @Override // X1.a
    public final void a(Object obj, Object obj2) {
        switch (this.f3009a) {
            case 0:
                throw new X1.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                X1.e eVar = (X1.e) obj2;
                eVar.e(f.f3088g, entry.getKey());
                eVar.e(f.f3089h, entry.getValue());
                return;
            default:
                throw new X1.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
