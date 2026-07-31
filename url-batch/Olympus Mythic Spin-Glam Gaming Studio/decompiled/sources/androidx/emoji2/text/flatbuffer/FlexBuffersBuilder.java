package androidx.emoji2.text.flatbuffer;

import java.util.Comparator;

/* loaded from: classes11.dex */
public class FlexBuffersBuilder {
    private final ReadWriteBuf bb;

    private static class Value {
        int key;
    }

    /* renamed from: androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$1, reason: invalid class name */
    class AnonymousClass1 implements Comparator<Value> {
        final /* synthetic */ FlexBuffersBuilder this$0;

        @Override // java.util.Comparator
        public int compare(Value value, Value value2) {
            byte b;
            byte b2;
            int i = value.key;
            int i2 = value2.key;
            do {
                b = this.this$0.bb.get(i);
                b2 = this.this$0.bb.get(i2);
                if (b == 0) {
                    return b - b2;
                }
                i++;
                i2++;
            } while (b == b2);
            return b - b2;
        }
    }
}
