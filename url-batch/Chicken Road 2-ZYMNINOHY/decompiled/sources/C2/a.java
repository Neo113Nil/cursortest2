package C2;

import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements A2.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f262a;

    public /* synthetic */ a(int i4) {
        this.f262a = i4;
    }

    @Override // A2.a
    public final void a(Object obj, Object obj2) {
        switch (this.f262a) {
            case 0:
                throw new A2.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                A2.e eVar = (A2.e) obj2;
                eVar.a(D2.e.f358g, entry.getKey());
                eVar.a(D2.e.f359h, entry.getValue());
                return;
            default:
                throw new A2.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
