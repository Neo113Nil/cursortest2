package io.flutter.plugins.sharedpreferences;

import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
class MessagesAsyncPigeonCodec extends StandardMessageCodec {
    @Override // io.flutter.plugin.common.StandardMessageCodec
    public Object readValueOfType(byte b4, ByteBuffer buffer) {
        i.e(buffer, "buffer");
        if (b4 == -127) {
            Long l4 = (Long) readValue(buffer);
            if (l4 != null) {
                return StringListLookupResultType.Companion.ofRaw((int) l4.longValue());
            }
            return null;
        }
        if (b4 == -126) {
            Object readValue = readValue(buffer);
            List<? extends Object> list = readValue instanceof List ? (List) readValue : null;
            if (list != null) {
                return SharedPreferencesPigeonOptions.Companion.fromList(list);
            }
            return null;
        }
        if (b4 != -125) {
            return super.readValueOfType(b4, buffer);
        }
        Object readValue2 = readValue(buffer);
        List<? extends Object> list2 = readValue2 instanceof List ? (List) readValue2 : null;
        if (list2 != null) {
            return StringListResult.Companion.fromList(list2);
        }
        return null;
    }

    @Override // io.flutter.plugin.common.StandardMessageCodec
    public void writeValue(ByteArrayOutputStream stream, Object obj) {
        i.e(stream, "stream");
        if (obj instanceof StringListLookupResultType) {
            stream.write(129);
            writeValue(stream, Long.valueOf(((StringListLookupResultType) obj).getRaw()));
        } else if (obj instanceof SharedPreferencesPigeonOptions) {
            stream.write(130);
            writeValue(stream, ((SharedPreferencesPigeonOptions) obj).toList());
        } else if (!(obj instanceof StringListResult)) {
            super.writeValue(stream, obj);
        } else {
            stream.write(131);
            writeValue(stream, ((StringListResult) obj).toList());
        }
    }
}
