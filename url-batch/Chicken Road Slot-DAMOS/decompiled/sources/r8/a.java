package r8;

import java.util.Map;
import s8.f;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements p8.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8211a;

    @Override // p8.a
    public final void a(Object obj, Object obj2) {
        switch (this.f8211a) {
            case 0:
                throw new p8.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                p8.e eVar = (p8.e) obj2;
                eVar.a(f.g, entry.getKey());
                eVar.a(f.f9156h, entry.getValue());
                return;
            default:
                throw new p8.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
