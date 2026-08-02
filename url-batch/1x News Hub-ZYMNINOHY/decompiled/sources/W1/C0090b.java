package W1;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: W1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0090b extends P1.t {

    /* renamed from: b, reason: collision with root package name */
    public static final C0090b f1663b = new C0090b(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1664a;

    public /* synthetic */ C0090b(int i3) {
        this.f1664a = i3;
    }

    @Override // P1.t
    public Object readValueOfType(byte b3, ByteBuffer byteBuffer) {
        switch (this.f1664a) {
            case 1:
                if (b3 == -127) {
                    Long l3 = (Long) readValue(byteBuffer);
                    if (l3 != null) {
                        int longValue = (int) l3.longValue();
                        M.f1654b.getClass();
                        M[] values = M.values();
                        int length = values.length;
                        for (int i3 = 0; i3 < length; i3++) {
                            M m3 = values[i3];
                            if (m3.f1658a == longValue) {
                                break;
                            }
                        }
                        break;
                    }
                } else if (b3 == -126) {
                    Object readValue = readValue(byteBuffer);
                    List list = readValue instanceof List ? (List) readValue : null;
                    if (list != null) {
                        String str = (String) list.get(0);
                        Object obj = list.get(1);
                        kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.Boolean");
                        break;
                    }
                } else if (b3 == -125) {
                    Object readValue2 = readValue(byteBuffer);
                    List list2 = readValue2 instanceof List ? (List) readValue2 : null;
                    if (list2 != null) {
                        String str2 = (String) list2.get(0);
                        Object obj2 = list2.get(1);
                        kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.StringListLookupResultType");
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return super.readValueOfType(b3, byteBuffer);
    }

    @Override // P1.t
    public void writeValue(ByteArrayOutputStream stream, Object obj) {
        switch (this.f1664a) {
            case 1:
                kotlin.jvm.internal.j.e(stream, "stream");
                if (!(obj instanceof M)) {
                    if (!(obj instanceof C0096h)) {
                        if (!(obj instanceof O)) {
                            super.writeValue(stream, obj);
                            break;
                        } else {
                            stream.write(131);
                            O o = (O) obj;
                            writeValue(stream, c2.f.L(o.f1659a, o.f1660b));
                            break;
                        }
                    } else {
                        stream.write(130);
                        writeValue(stream, ((C0096h) obj).a());
                        break;
                    }
                } else {
                    stream.write(129);
                    writeValue(stream, Long.valueOf(((M) obj).f1658a));
                    break;
                }
            default:
                super.writeValue(stream, obj);
                break;
        }
    }
}
