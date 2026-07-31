package androidx.emoji2.text.flatbuffer;

import androidx.emoji2.text.flatbuffer.Utf8Old;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;

/* loaded from: classes6.dex */
public class Utf8Old extends Utf8 {
    private static final ThreadLocal CACHE;

    /* JADX INFO: Access modifiers changed from: private */
    static class Cache {
        final CharsetDecoder decoder;
        final CharsetEncoder encoder;
        CharSequence lastInput = null;
        ByteBuffer lastOutput = null;

        Cache() {
            Charset charset = StandardCharsets.UTF_8;
            this.encoder = charset.newEncoder();
            this.decoder = charset.newDecoder();
        }
    }

    static {
        final Supplier supplier = new Supplier() { // from class: androidx.emoji2.text.flatbuffer.Utf8Old$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final Object get() {
                Utf8Old.Cache lambda$static$0;
                lambda$static$0 = Utf8Old.lambda$static$0();
                return lambda$static$0;
            }
        };
        CACHE = new ThreadLocal() { // from class: androidx.emoji2.text.flatbuffer.Utf8Old$$ExternalSyntheticThreadLocal1
            @Override // java.lang.ThreadLocal
            protected /* synthetic */ Object initialValue() {
                return supplier.get();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Cache lambda$static$0() {
        return new Cache();
    }
}
