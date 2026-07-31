package F4;

import D4.o;
import N.p;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.io.UncheckedIOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* loaded from: classes.dex */
public abstract class i implements o {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f768a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public static final m[] f769b = new m[0];

    public static D4.k b(V3.g gVar) {
        String str;
        switch (p.c(gVar.a())) {
            case 0:
                return new e(1, D4.j.f((String) gVar.getValue()));
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return new d(((Boolean) gVar.getValue()).booleanValue());
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return new l(((Long) gVar.getValue()).longValue());
            case 3:
                return new f(((Double) gVar.getValue()).doubleValue());
            case 4:
                return c.d((List) gVar.getValue(), new A4.b(10));
            case 5:
                List list = (List) gVar.getValue();
                int size = list.size();
                m[] mVarArr = new m[list.size()];
                for (int i7 = 0; i7 < size; i7++) {
                    V3.d dVar = (V3.d) list.get(i7);
                    mVarArr[i7] = new m(dVar.f2716a.getBytes(StandardCharsets.UTF_8), b(dVar.f2717b));
                }
                return new c(new b(mVarArr), (byte) 0);
            case 6:
                ByteBuffer byteBuffer = (ByteBuffer) gVar.getValue();
                byte[] bArr = new byte[byteBuffer.remaining()];
                byteBuffer.get(bArr);
                return new e(0, bArr);
            default:
                switch (gVar.a()) {
                    case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                        str = "STRING";
                        break;
                    case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
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
                    case 7:
                        str = "BYTES";
                        break;
                    default:
                        str = "null";
                        break;
                }
                throw new IllegalArgumentException("Unsupported Value type: ".concat(str));
        }
    }

    public static W3.b c(S4.a aVar) {
        if (aVar instanceof T4.a) {
            return ((T4.a) aVar).c();
        }
        throw new IllegalArgumentException("logRecordData must be ExtendedLogRecordData");
    }

    public static void e(D4.n nVar, D4.b bVar, W3.b bVar2, D4.i iVar) {
        nVar.T(bVar);
        if (!bVar2.isEmpty()) {
            try {
                bVar2.forEach(new g(nVar, bVar, iVar));
            } catch (UncheckedIOException e4) {
                throw e4.getCause();
            }
        }
        nVar.J();
    }

    public static int f(D4.b bVar, W3.b bVar2, D4.i iVar) {
        if (bVar2.isEmpty()) {
            return 0;
        }
        int[] iArr = {0};
        bVar2.forEach(new g(iVar, iArr, bVar));
        return iArr[0];
    }
}
