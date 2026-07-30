package m5;

import java.io.UncheckedIOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.List;
import k5.C0602b;
import z5.InterfaceC1060a;

/* loaded from: classes.dex */
public abstract class i implements k5.m {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f6567a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public static final m[] f6568b = new m[0];

    public static k5.i a(C4.j jVar) {
        String str;
        switch (S.i.b(jVar.getType())) {
            case 0:
                return new e(k5.h.f((String) jVar.getValue()), 1);
            case 1:
                return new d(((Boolean) jVar.getValue()).booleanValue());
            case 2:
                return new l(((Long) jVar.getValue()).longValue());
            case 3:
                return new f(((Double) jVar.getValue()).doubleValue());
            case 4:
                return c.d((List) jVar.getValue(), new C4.a(24));
            case 5:
                List list = (List) jVar.getValue();
                int size = list.size();
                m[] mVarArr = new m[list.size()];
                for (int i2 = 0; i2 < size; i2++) {
                    C4.g gVar = (C4.g) list.get(i2);
                    mVarArr[i2] = new m(gVar.f310a.getBytes(StandardCharsets.UTF_8), a(gVar.f311b));
                }
                return new c(new C0692b(mVarArr), (byte) 0);
            case 6:
                ByteBuffer byteBuffer = (ByteBuffer) jVar.getValue();
                byte[] bArr = new byte[byteBuffer.remaining()];
                byteBuffer.get(bArr);
                return new e(bArr, 0);
            default:
                switch (jVar.getType()) {
                    case 1:
                        str = "STRING";
                        break;
                    case 2:
                        str = "BOOLEAN";
                        break;
                    case 3:
                        str = "LONG";
                        break;
                    case 4:
                        str = "DOUBLE";
                        break;
                    case 5:
                        str = "ARRAY";
                        break;
                    case 6:
                        str = "KEY_VALUE_LIST";
                        break;
                    case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                        str = "BYTES";
                        break;
                    default:
                        str = "null";
                        break;
                }
                throw new IllegalArgumentException("Unsupported Value type: ".concat(str));
        }
    }

    public static D4.b c(InterfaceC1060a interfaceC1060a) {
        if (interfaceC1060a instanceof A5.a) {
            return ((A5.a) interfaceC1060a).c();
        }
        throw new IllegalArgumentException("logRecordData must be ExtendedLogRecordData");
    }

    public static void e(k5.l lVar, C0602b c0602b, D4.b bVar, k5.g gVar) {
        lVar.T(c0602b);
        if (!bVar.isEmpty()) {
            try {
                bVar.forEach(new g(lVar, c0602b, gVar));
            } catch (UncheckedIOException e7) {
                throw e7.getCause();
            }
        }
        lVar.J();
    }

    public static int f(C0602b c0602b, D4.b bVar, k5.g gVar) {
        if (bVar.isEmpty()) {
            return 0;
        }
        int[] iArr = {0};
        bVar.forEach(new g(gVar, iArr, c0602b));
        return iArr[0];
    }
}
