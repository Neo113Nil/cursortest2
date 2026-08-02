package V1;

import P1.t;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class b extends t {

    /* renamed from: a, reason: collision with root package name */
    public static final b f1607a = new b();

    @Override // P1.t
    public final Object readValueOfType(byte b3, ByteBuffer byteBuffer) {
        if (b3 != -127) {
            return super.readValueOfType(b3, byteBuffer);
        }
        Object readValue = readValue(byteBuffer);
        if (readValue == null) {
            return null;
        }
        return c.values()[((Long) readValue).intValue()];
    }

    @Override // P1.t
    public final void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (!(obj instanceof c)) {
            super.writeValue(byteArrayOutputStream, obj);
        } else {
            byteArrayOutputStream.write(129);
            writeValue(byteArrayOutputStream, obj == null ? null : Integer.valueOf(((c) obj).f1609a));
        }
    }
}
