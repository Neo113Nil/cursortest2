package io.ktor.client.plugins.cache.storage;

import io.ktor.utils.io.ByteChannel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.objectweb.asm.Opcodes;

/* compiled from: FileCacheStorage.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 11, 12, 12, 13, 13}, l = {Opcodes.L2I, Opcodes.L2F, Opcodes.L2D, Opcodes.F2I, Opcodes.F2D, Opcodes.D2L, Opcodes.D2F, Opcodes.I2C, Opcodes.I2S, Opcodes.LCMP, Opcodes.FCMPL, Opcodes.DCMPL, Opcodes.DCMPG, 154, 155}, m = "writeCache", n = {"channel", "cache", "channel", "cache", "channel", "cache", "channel", "cache", "channel", "cache", "headers", "channel", "cache", "value", "channel", "cache", "channel", "cache", "channel", "cache", "channel", "cache", "channel", "cache", "channel", "cache", "value", "channel", "cache", "channel", "cache"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$3", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$3", "L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes3.dex */
final class FileCacheStorage$writeCache$3 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FileCacheStorage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileCacheStorage$writeCache$3(FileCacheStorage fileCacheStorage, Continuation<? super FileCacheStorage$writeCache$3> continuation) {
        super(continuation);
        this.this$0 = fileCacheStorage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object writeCache;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        writeCache = this.this$0.writeCache((ByteChannel) null, (CachedResponseData) null, (Continuation<? super Unit>) this);
        return writeCache;
    }
}
