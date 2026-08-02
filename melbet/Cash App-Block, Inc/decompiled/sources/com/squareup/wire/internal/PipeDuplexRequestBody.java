package com.squareup.wire.internal;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;
import okio.BufferedSink;
import okio.Pipe;

/* loaded from: classes.dex */
public final class PipeDuplexRequestBody extends RequestBody {
    public final MediaType contentType;
    public final Pipe pipe = new Pipe();

    public PipeDuplexRequestBody(MediaType mediaType) {
        this.contentType = mediaType;
    }

    @Override // okhttp3.RequestBody
    public final MediaType contentType() {
        return this.contentType;
    }

    @Override // okhttp3.RequestBody
    public final boolean isDuplex() {
        return true;
    }

    @Override // okhttp3.RequestBody
    public final boolean isOneShot() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0048, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("sinkBuffer");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0068, code lost:
    
        throw new java.lang.IllegalStateException("sink already folded");
     */
    @Override // okhttp3.RequestBody
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void writeTo(BufferedSink bufferedSink) {
        Buffer buffer;
        boolean z;
        Pipe pipe = this.pipe;
        Condition condition = pipe.condition;
        Buffer buffer2 = pipe.buffer;
        ReentrantLock reentrantLock = pipe.lock;
        while (true) {
            reentrantLock.lock();
            try {
                if (pipe.foldedSink != null) {
                    break;
                }
                boolean z2 = pipe.sinkClosed;
                if (buffer2.exhausted()) {
                    pipe.sourceClosed = true;
                    pipe.foldedSink = bufferedSink;
                    buffer = null;
                    z = true;
                } else {
                    buffer = new Buffer();
                    buffer.write(buffer2, buffer2.size);
                    condition.signalAll();
                    z = false;
                }
                if (z) {
                    if (z2) {
                        bufferedSink.close();
                        return;
                    }
                    return;
                }
                if (buffer == null) {
                    break;
                }
                try {
                    bufferedSink.write(buffer, buffer.size);
                    bufferedSink.flush();
                } catch (Throwable th) {
                    reentrantLock.lock();
                    pipe.sourceClosed = true;
                    condition.signalAll();
                    throw th;
                }
                reentrantLock.lock();
                try {
                    pipe.sourceClosed = true;
                    condition.signalAll();
                    throw th;
                } finally {
                    reentrantLock.unlock();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
