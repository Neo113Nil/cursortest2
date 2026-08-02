package g1;

import e1.C0311b;
import e1.InterfaceC0313d;
import e1.InterfaceC0314e;
import java.util.Map;

/* renamed from: g1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0332a implements InterfaceC0313d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5037a;

    @Override // e1.InterfaceC0310a
    public final void a(Object obj, Object obj2) {
        switch (this.f5037a) {
            case 0:
                throw new C0311b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                InterfaceC0314e interfaceC0314e = (InterfaceC0314e) obj2;
                interfaceC0314e.d(h1.e.f5058g, entry.getKey());
                interfaceC0314e.d(h1.e.f5059h, entry.getValue());
                return;
            default:
                throw new C0311b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
