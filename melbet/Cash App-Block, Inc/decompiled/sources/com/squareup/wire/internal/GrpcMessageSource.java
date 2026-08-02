package com.squareup.wire.internal;

import androidx.room.Room;
import com.squareup.wire.ProtoAdapter;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Closeable;
import java.net.ProtocolException;
import kotlin.ExceptionsKt__ExceptionsKt;
import okio.Buffer;
import okio.BufferedSource;
import okio.RealBufferedSource;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class GrpcMessageSource implements Closeable {
    public final String grpcEncoding;
    public final ProtoAdapter messageAdapter;
    public final BufferedSource source;

    public GrpcMessageSource(BufferedSource bufferedSource, ProtoAdapter protoAdapter, String str) {
        bufferedSource.getClass();
        protoAdapter.getClass();
        this.source = bufferedSource;
        this.messageAdapter = protoAdapter;
        this.grpcEncoding = str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.source.close();
    }

    public final Object read() {
        Room grpcDecoding;
        BufferedSource bufferedSource = this.source;
        if (bufferedSource.exhausted()) {
            return null;
        }
        byte readByte = bufferedSource.readByte();
        if (readByte == 0) {
            grpcDecoding = GrpcDecoder$IdentityGrpcDecoder.INSTANCE;
        } else {
            if (readByte != 1) {
                throw new ProtocolException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(readByte, "unexpected compressed-flag: "));
            }
            String str = this.grpcEncoding;
            if (str == null) {
                throw new ProtocolException("message is encoded but message-encoding header was omitted");
            }
            grpcDecoding = GrpcDecoderKt.toGrpcDecoding(str);
        }
        long readInt = bufferedSource.readInt() & BodyPartID.bodyIdMax;
        Buffer buffer = new Buffer();
        buffer.write(bufferedSource, readInt);
        RealBufferedSource realBufferedSource = new RealBufferedSource(grpcDecoding.decode(buffer));
        try {
            Object decode = this.messageAdapter.decode(realBufferedSource);
            realBufferedSource.close();
            return decode;
        } catch (Throwable th) {
            try {
                realBufferedSource.close();
            } catch (Throwable th2) {
                ExceptionsKt__ExceptionsKt.addSuppressed(th, th2);
            }
            throw th;
        }
    }
}
