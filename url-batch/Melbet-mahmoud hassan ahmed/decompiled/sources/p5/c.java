package p5;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import m5.q;

/* loaded from: classes.dex */
public class c extends q {

    /* renamed from: d, reason: collision with root package name */
    private final Map<Integer, k4.b> f20137d = new HashMap();

    c() {
    }

    private List<String> q(Object obj) {
        if (obj == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                if (obj2 instanceof String) {
                    arrayList.add((String) obj2);
                }
            }
        }
        return arrayList;
    }

    @Override // m5.q
    protected Object g(byte b7, ByteBuffer byteBuffer) {
        switch (b7) {
            case -127:
                return new b((Boolean) g(byteBuffer.get(), byteBuffer), (a) g(byteBuffer.get(), byteBuffer));
            case -126:
                return new a((Integer) g(byteBuffer.get(), byteBuffer), q(g(byteBuffer.get(), byteBuffer)));
            case -125:
                return this.f20137d.get((Integer) g(byteBuffer.get(), byteBuffer));
            default:
                return super.g(b7, byteBuffer);
        }
    }

    @Override // m5.q
    protected void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        Object c7;
        if (obj instanceof b) {
            byteArrayOutputStream.write(-127);
            b bVar = (b) obj;
            p(byteArrayOutputStream, bVar.c());
            c7 = bVar.b();
        } else {
            if (!(obj instanceof a)) {
                if (!(obj instanceof k4.b)) {
                    super.p(byteArrayOutputStream, obj);
                    return;
                } else {
                    byteArrayOutputStream.write(-125);
                    p(byteArrayOutputStream, Integer.valueOf(obj.hashCode()));
                    return;
                }
            }
            byteArrayOutputStream.write(-126);
            a aVar = (a) obj;
            p(byteArrayOutputStream, aVar.b());
            c7 = aVar.c();
        }
        p(byteArrayOutputStream, c7);
    }

    void r(k4.b bVar) {
        this.f20137d.remove(Integer.valueOf(bVar.hashCode()));
    }

    void s(k4.b bVar) {
        this.f20137d.put(Integer.valueOf(bVar.hashCode()), bVar);
    }
}
