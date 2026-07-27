package M0;

import H2.r;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class h extends r {
    @Override // H2.r
    public final Object readValueOfType(byte b6, ByteBuffer buffer) {
        i.e(buffer, "buffer");
        return super.readValueOfType(b6, buffer);
    }

    @Override // H2.r
    public final void writeValue(ByteArrayOutputStream stream, Object obj) {
        i.e(stream, "stream");
        super.writeValue(stream, obj);
    }
}
