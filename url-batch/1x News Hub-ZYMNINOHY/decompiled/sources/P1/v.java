package P1;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class v implements k {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f1274a = Charset.forName("UTF8");

    /* renamed from: b, reason: collision with root package name */
    public static final v f1275b = new v();

    public static String a(ByteBuffer byteBuffer) {
        byte[] bArr;
        int i3;
        if (byteBuffer == null) {
            return null;
        }
        int remaining = byteBuffer.remaining();
        if (byteBuffer.hasArray()) {
            bArr = byteBuffer.array();
            i3 = byteBuffer.arrayOffset();
        } else {
            bArr = new byte[remaining];
            byteBuffer.get(bArr);
            i3 = 0;
        }
        return new String(bArr, i3, remaining, f1274a);
    }

    public static ByteBuffer b(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(f1274a);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bytes.length);
        allocateDirect.put(bytes);
        return allocateDirect;
    }

    @Override // P1.k
    public final /* bridge */ /* synthetic */ Object decodeMessage(ByteBuffer byteBuffer) {
        return a(byteBuffer);
    }

    @Override // P1.k
    public final /* bridge */ /* synthetic */ ByteBuffer encodeMessage(Object obj) {
        return b((String) obj);
    }
}
