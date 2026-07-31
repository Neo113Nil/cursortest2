package O3;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class n implements h {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f1775a = Charset.forName("UTF8");

    /* renamed from: b, reason: collision with root package name */
    public static final n f1776b = new n();

    public static String a(ByteBuffer byteBuffer) {
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
        return new String(bArr, i7, remaining, f1775a);
    }

    public static ByteBuffer c(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(f1775a);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bytes.length);
        allocateDirect.put(bytes);
        return allocateDirect;
    }

    @Override // O3.h
    public final /* bridge */ /* synthetic */ ByteBuffer b(Object obj) {
        return c((String) obj);
    }

    @Override // O3.h
    public final /* bridge */ /* synthetic */ Object f(ByteBuffer byteBuffer) {
        return a(byteBuffer);
    }
}
