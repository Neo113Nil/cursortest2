package X1;

import P1.t;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class c extends t {

    /* renamed from: a, reason: collision with root package name */
    public static final c f1731a = new c();

    @Override // P1.t
    public final Object readValueOfType(byte b3, ByteBuffer byteBuffer) {
        if (b3 != -127) {
            if (b3 != -126) {
                return super.readValueOfType(b3, byteBuffer);
            }
            ArrayList arrayList = (ArrayList) readValue(byteBuffer);
            a aVar = new a();
            Boolean bool = (Boolean) arrayList.get(0);
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"showTitle\" is null.");
            }
            aVar.f1729a = bool;
            return aVar;
        }
        ArrayList arrayList2 = (ArrayList) readValue(byteBuffer);
        e eVar = new e();
        Boolean bool2 = (Boolean) arrayList2.get(0);
        if (bool2 == null) {
            throw new IllegalStateException("Nonnull field \"enableJavaScript\" is null.");
        }
        eVar.f1734a = bool2;
        Boolean bool3 = (Boolean) arrayList2.get(1);
        if (bool3 == null) {
            throw new IllegalStateException("Nonnull field \"enableDomStorage\" is null.");
        }
        eVar.f1735b = bool3;
        Map map = (Map) arrayList2.get(2);
        if (map == null) {
            throw new IllegalStateException("Nonnull field \"headers\" is null.");
        }
        eVar.f1736c = map;
        return eVar;
    }

    @Override // P1.t
    public final void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (obj instanceof e) {
            byteArrayOutputStream.write(129);
            e eVar = (e) obj;
            eVar.getClass();
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(eVar.f1734a);
            arrayList.add(eVar.f1735b);
            arrayList.add(eVar.f1736c);
            writeValue(byteArrayOutputStream, arrayList);
            return;
        }
        if (!(obj instanceof a)) {
            super.writeValue(byteArrayOutputStream, obj);
            return;
        }
        byteArrayOutputStream.write(130);
        a aVar = (a) obj;
        aVar.getClass();
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add(aVar.f1729a);
        writeValue(byteArrayOutputStream, arrayList2);
    }
}
