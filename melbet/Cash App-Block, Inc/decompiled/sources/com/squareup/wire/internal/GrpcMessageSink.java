package com.squareup.wire.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.db.WireAdapter;
import com.squareup.wire.ProtoAdapter;
import java.io.Closeable;
import kotlin.ExceptionsKt__ExceptionsKt;
import okio.Buffer;
import okio.BufferedSink;
import okio.RealBufferedSink;

/* loaded from: classes.dex */
public final class GrpcMessageSink implements Closeable {
    public final WireAdapter callForCancel;
    public boolean closed;
    public final ProtoAdapter messageAdapter;
    public final long minMessageToCompress;
    public final RealBufferedSink sink;

    public GrpcMessageSink(RealBufferedSink realBufferedSink, long j, ProtoAdapter protoAdapter, WireAdapter wireAdapter) {
        protoAdapter.getClass();
        this.sink = realBufferedSink;
        this.minMessageToCompress = j;
        this.messageAdapter = protoAdapter;
        this.callForCancel = wireAdapter;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.sink.close();
    }

    public final void write(Object obj) {
        obj.getClass();
        if (this.closed) {
            a$$ExternalSyntheticBUOutline0.m$1("closed");
            return;
        }
        Buffer buffer = new Buffer();
        this.messageAdapter.encode(buffer, obj);
        long j = buffer.size;
        long j2 = this.minMessageToCompress;
        RealBufferedSink realBufferedSink = this.sink;
        if (j < j2) {
            realBufferedSink.writeByte(0);
            realBufferedSink.writeInt((int) buffer.size);
            realBufferedSink.writeAll(buffer);
        } else {
            Buffer buffer2 = new Buffer();
            BufferedSink encode = InstantJsonFormatter.INSTANCE$2.encode(buffer2);
            try {
                RealBufferedSink realBufferedSink2 = (RealBufferedSink) encode;
                realBufferedSink2.writeAll(buffer);
                realBufferedSink2.close();
                realBufferedSink.writeByte(1);
                realBufferedSink.writeInt((int) buffer2.size);
                realBufferedSink.writeAll(buffer2);
            } catch (Throwable th) {
                try {
                    ((RealBufferedSink) encode).close();
                } catch (Throwable th2) {
                    ExceptionsKt__ExceptionsKt.addSuppressed(th, th2);
                }
                throw th;
            }
        }
        realBufferedSink.flush();
    }
}
