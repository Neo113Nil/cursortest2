package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

/* loaded from: classes9.dex */
public class LazyFieldLite {
    public volatile MessageLite value;

    public int getSerializedSize() {
        return this.value.getSerializedSize();
    }

    public MessageLite getValue(MessageLite messageLite) {
        if (this.value == null) {
            synchronized (this) {
                if (this.value == null) {
                    try {
                        this.value = messageLite;
                    } catch (IOException unused) {
                    }
                }
            }
        }
        return this.value;
    }

    public MessageLite setValue(MessageLite messageLite) {
        MessageLite messageLite2 = this.value;
        this.value = messageLite;
        return messageLite2;
    }
}
