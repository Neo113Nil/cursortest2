package m5;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class s implements i<String> {

    /* renamed from: a, reason: collision with root package name */
    private static final Charset f19264a = Charset.forName("UTF8");

    /* renamed from: b, reason: collision with root package name */
    public static final s f19265b = new s();

    private s() {
    }

    @Override // m5.i
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public String b(ByteBuffer byteBuffer) {
        byte[] bArr;
        int i7;
        if (byteBuffer == null) {
            return null;
        }
        int remaining = byteBuffer.remaining();
        if (byteBuffer.hasArray()) {
            bArr = byteBuffer.array();
            i7 = byteBuffer.arrayOffset();
        } else {
            bArr = new byte[remaining];
            byteBuffer.get(bArr);
            i7 = 0;
        }
        return new String(bArr, i7, remaining, f19264a);
    }

    @Override // m5.i
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public ByteBuffer a(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(f19264a);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bytes.length);
        allocateDirect.put(bytes);
        return allocateDirect;
    }
}
