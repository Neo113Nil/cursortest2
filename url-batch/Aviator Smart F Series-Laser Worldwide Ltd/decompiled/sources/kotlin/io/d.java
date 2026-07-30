package kotlin.io;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
final class d extends ByteArrayOutputStream {
    public d(int i8) {
        super(i8);
    }

    public final byte[] getBuffer() {
        byte[] buf = ((ByteArrayOutputStream) this).buf;
        s.checkNotNullExpressionValue(buf, "buf");
        return buf;
    }
}
