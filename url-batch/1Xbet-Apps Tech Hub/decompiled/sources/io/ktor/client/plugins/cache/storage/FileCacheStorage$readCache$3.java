package io.ktor.client.plugins.cache.storage;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.internal.ImagesContract;
import io.ktor.utils.io.ByteReadChannel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.objectweb.asm.Opcodes;

/* compiled from: FileCacheStorage.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", i = {0, 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 13, 13, 13, 13, 13, 13, 13, 13, 13, 14, 14, 14, 14, 14, 14, 14, 14, 14}, l = {Opcodes.IF_ICMPEQ, Opcodes.IF_ICMPNE, Opcodes.IF_ICMPNE, Opcodes.IF_ICMPLT, Opcodes.IF_ICMPGE, Opcodes.IF_ACMPEQ, Opcodes.IF_ACMPNE, Opcodes.RET, Opcodes.TABLESWITCH, Opcodes.LOOKUPSWITCH, Opcodes.IRETURN, Opcodes.DRETURN, Opcodes.ARETURN, Opcodes.GETFIELD, Opcodes.INVOKEVIRTUAL}, m = "readCache", n = {"channel", "channel", ImagesContract.URL, "channel", ImagesContract.URL, "channel", ImagesContract.URL, NotificationCompat.CATEGORY_STATUS, "channel", ImagesContract.URL, NotificationCompat.CATEGORY_STATUS, "version", "channel", ImagesContract.URL, NotificationCompat.CATEGORY_STATUS, "version", "headers", "headersCount", "j", "channel", ImagesContract.URL, NotificationCompat.CATEGORY_STATUS, "version", "headers", "key", "headersCount", "j", "channel", ImagesContract.URL, NotificationCompat.CATEGORY_STATUS, "version", "headers", "channel", ImagesContract.URL, NotificationCompat.CATEGORY_STATUS, "version", "headers", "requestTime", "channel", ImagesContract.URL, NotificationCompat.CATEGORY_STATUS, "version", "headers", "requestTime", "responseTime", "channel", ImagesContract.URL, NotificationCompat.CATEGORY_STATUS, "version", "headers", "requestTime", "responseTime", "expirationTime", "channel", ImagesContract.URL, NotificationCompat.CATEGORY_STATUS, "version", "headers", "requestTime", "responseTime", "expirationTime", "$this$readCache_u24lambda_u244", "varyKeysCount", "j", "channel", ImagesContract.URL, NotificationCompat.CATEGORY_STATUS, "version", "headers", "requestTime", "responseTime", "expirationTime", "$this$readCache_u24lambda_u244", "key", "varyKeysCount", "j", "channel", ImagesContract.URL, NotificationCompat.CATEGORY_STATUS, "version", "headers", "requestTime", "responseTime", "expirationTime", "varyKeys", ImagesContract.URL, NotificationCompat.CATEGORY_STATUS, "version", "headers", "requestTime", "responseTime", "expirationTime", "varyKeys", "body"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$9", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$9", "L$10", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8"})
/* loaded from: classes3.dex */
final class FileCacheStorage$readCache$3 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FileCacheStorage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileCacheStorage$readCache$3(FileCacheStorage fileCacheStorage, Continuation<? super FileCacheStorage$readCache$3> continuation) {
        super(continuation);
        this.this$0 = fileCacheStorage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object readCache;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        readCache = this.this$0.readCache((ByteReadChannel) null, (Continuation<? super CachedResponseData>) this);
        return readCache;
    }
}
