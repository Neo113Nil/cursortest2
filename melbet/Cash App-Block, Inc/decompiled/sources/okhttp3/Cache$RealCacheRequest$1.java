package okhttp3;

import com.squareup.moshi.JsonUtf8Reader;
import com.squareup.moshi.JsonValueWriter;
import net.oneformapp.PopEncryptorV2_;
import okio.Buffer;
import okio.ForwardingSink;
import okio.Path$$ExternalSyntheticBUOutline0;
import okio.Sink;

/* loaded from: classes9.dex */
public final class Cache$RealCacheRequest$1 extends ForwardingSink {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object this$0;
    public final /* synthetic */ Object this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cache$RealCacheRequest$1(JsonValueWriter jsonValueWriter, Buffer buffer, Buffer buffer2) {
        super(buffer);
        this.this$1 = jsonValueWriter;
        this.this$0 = buffer2;
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.$r8$classId) {
            case 0:
                Cache cache = (Cache) this.this$0;
                PopEncryptorV2_ popEncryptorV2_ = (PopEncryptorV2_) this.this$1;
                synchronized (cache) {
                    if (popEncryptorV2_.isInit) {
                        return;
                    }
                    popEncryptorV2_.isInit = true;
                    super.close();
                    ((com.android.volley.Response) ((PopEncryptorV2_) this.this$1).encryptionKey).commit();
                    return;
                }
            default:
                JsonValueWriter jsonValueWriter = (JsonValueWriter) this.this$1;
                if (jsonValueWriter.peekScope() == 9) {
                    Object[] objArr = jsonValueWriter.stack;
                    int i = jsonValueWriter.stackSize;
                    if (objArr[i] == null) {
                        jsonValueWriter.stackSize = i - 1;
                        Object readJsonValue = new JsonUtf8Reader((Buffer) this.this$0).readJsonValue();
                        boolean z = jsonValueWriter.serializeNulls;
                        jsonValueWriter.serializeNulls = true;
                        try {
                            jsonValueWriter.add(readJsonValue);
                            jsonValueWriter.serializeNulls = z;
                            int[] iArr = jsonValueWriter.pathIndices;
                            int i2 = jsonValueWriter.stackSize - 1;
                            iArr[i2] = iArr[i2] + 1;
                            return;
                        } catch (Throwable th) {
                            jsonValueWriter.serializeNulls = z;
                            throw th;
                        }
                    }
                }
                Path$$ExternalSyntheticBUOutline0.m$2();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cache$RealCacheRequest$1(Cache cache, PopEncryptorV2_ popEncryptorV2_, Sink sink) {
        super(sink);
        this.this$0 = cache;
        this.this$1 = popEncryptorV2_;
    }
}
