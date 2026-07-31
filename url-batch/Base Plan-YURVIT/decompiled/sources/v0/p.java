package v0;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class p implements j {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f3093a = Charset.forName("UTF8");

    /* renamed from: b, reason: collision with root package name */
    public static final p f3094b = new p();

    public static String c(ByteBuffer byteBuffer) {
        byte[] bArr;
        int i2;
        if (byteBuffer == null) {
            return null;
        }
        int remaining = byteBuffer.remaining();
        if (byteBuffer.hasArray()) {
            bArr = byteBuffer.array();
            i2 = byteBuffer.arrayOffset();
        } else {
            bArr = new byte[remaining];
            byteBuffer.get(bArr);
            i2 = 0;
        }
        return new String(bArr, i2, remaining, f3093a);
    }

    public static ByteBuffer d(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(f3093a);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bytes.length);
        allocateDirect.put(bytes);
        return allocateDirect;
    }

    @Override // v0.j
    public final /* bridge */ /* synthetic */ ByteBuffer a(Object obj) {
        return d((String) obj);
    }

    @Override // v0.j
    public final /* bridge */ /* synthetic */ Object b(ByteBuffer byteBuffer) {
        return c(byteBuffer);
    }
}
