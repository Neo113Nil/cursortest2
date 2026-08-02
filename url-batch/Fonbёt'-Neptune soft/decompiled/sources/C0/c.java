package C0;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import w0.n;
import w0.o;

/* loaded from: classes.dex */
public final class c extends o {

    /* renamed from: d, reason: collision with root package name */
    public static final c f220d = new c();

    @Override // w0.o
    public final Object f(byte b2, ByteBuffer byteBuffer) {
        if (b2 != -127) {
            if (b2 != -126) {
                return super.f(b2, byteBuffer);
            }
            ArrayList arrayList = (ArrayList) e(byteBuffer);
            a aVar = new a();
            Boolean bool = (Boolean) arrayList.get(0);
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"showTitle\" is null.");
            }
            aVar.f218a = bool;
            return aVar;
        }
        ArrayList arrayList2 = (ArrayList) e(byteBuffer);
        e eVar = new e();
        Boolean bool2 = (Boolean) arrayList2.get(0);
        if (bool2 == null) {
            throw new IllegalStateException("Nonnull field \"enableJavaScript\" is null.");
        }
        eVar.f223a = bool2;
        Boolean bool3 = (Boolean) arrayList2.get(1);
        if (bool3 == null) {
            throw new IllegalStateException("Nonnull field \"enableDomStorage\" is null.");
        }
        eVar.f224b = bool3;
        Map map = (Map) arrayList2.get(2);
        if (map == null) {
            throw new IllegalStateException("Nonnull field \"headers\" is null.");
        }
        eVar.f225c = map;
        return eVar;
    }

    @Override // w0.o
    public final void k(n nVar, Object obj) {
        if (obj instanceof e) {
            nVar.write(129);
            e eVar = (e) obj;
            eVar.getClass();
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(eVar.f223a);
            arrayList.add(eVar.f224b);
            arrayList.add(eVar.f225c);
            k(nVar, arrayList);
            return;
        }
        if (!(obj instanceof a)) {
            super.k(nVar, obj);
            return;
        }
        nVar.write(130);
        a aVar = (a) obj;
        aVar.getClass();
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add(aVar.f218a);
        k(nVar, arrayList2);
    }
}
