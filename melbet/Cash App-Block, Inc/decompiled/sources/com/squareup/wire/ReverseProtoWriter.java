package com.squareup.wire;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import okio.Buffer;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;
import okio.Segment;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.Handlers$$ExternalSyntheticLambda1;
import papa.internal.AppUpdateDetector$$ExternalSyntheticLambda0;

/* loaded from: classes.dex */
public final class ReverseProtoWriter {
    public static final byte[] EMPTY_ARRAY = new byte[0];
    public int arrayLimit;
    public final Lazy forwardBuffer$delegate;
    public final Lazy forwardWriter$delegate;
    public Buffer tail = new Buffer();
    public Buffer head = new Buffer();
    public final Buffer.UnsafeCursor cursor = new Buffer.UnsafeCursor();

    /* renamed from: array, reason: collision with root package name */
    public byte[] f1419array = EMPTY_ARRAY;

    public ReverseProtoWriter() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        int i = 10;
        this.forwardBuffer$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Handlers$$ExternalSyntheticLambda1(i));
        this.forwardWriter$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new AppUpdateDetector$$ExternalSyntheticLambda0(this, i));
    }

    public final void emitCurrentSegment() {
        byte[] bArr = this.f1419array;
        byte[] bArr2 = EMPTY_ARRAY;
        if (bArr == bArr2) {
            return;
        }
        this.cursor.close();
        this.head.skip(this.arrayLimit);
        this.head.writeAll(this.tail);
        Buffer buffer = this.tail;
        this.tail = this.head;
        this.head = buffer;
        this.f1419array = bArr2;
        this.arrayLimit = 0;
    }

    public final int getByteCount() {
        return (this.f1419array.length - this.arrayLimit) + ((int) this.tail.size);
    }

    public final void require(int i) {
        if (this.arrayLimit >= i) {
            return;
        }
        emitCurrentSegment();
        Buffer buffer = this.head;
        Buffer.UnsafeCursor unsafeCursor = this.cursor;
        buffer.readAndWriteUnsafe(unsafeCursor);
        if (i <= 0) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "minByteCount <= 0: "));
            return;
        }
        if (i > 8192) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "minByteCount > Segment.SIZE: "));
            return;
        }
        Buffer buffer2 = unsafeCursor.buffer;
        if (buffer2 == null) {
            a$$ExternalSyntheticBUOutline0.m$1("not attached to a buffer");
            return;
        }
        if (!unsafeCursor.readWrite) {
            a$$ExternalSyntheticBUOutline0.m$1("expandBuffer() only permitted for read/write buffers");
            return;
        }
        long j = buffer2.size;
        Segment writableSegment$okio = buffer2.writableSegment$okio(i);
        int i2 = 8192 - writableSegment$okio.limit;
        writableSegment$okio.limit = PKIFailureInfo.certRevoked;
        buffer2.size = i2 + j;
        unsafeCursor.segment = writableSegment$okio;
        unsafeCursor.offset = j;
        byte[] bArr = writableSegment$okio.data;
        unsafeCursor.data = bArr;
        unsafeCursor.start = 8192 - i2;
        unsafeCursor.end = PKIFailureInfo.certRevoked;
        if (j == 0) {
            bArr.getClass();
            if (8192 == bArr.length) {
                byte[] bArr2 = unsafeCursor.data;
                bArr2.getClass();
                this.f1419array = bArr2;
                this.arrayLimit = unsafeCursor.end;
                return;
            }
        }
        a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
    }

    public final void writeBytes(ByteString byteString) {
        byteString.getClass();
        int size$okio = byteString.getSize$okio();
        while (size$okio != 0) {
            require(1);
            int min = Math.min(this.arrayLimit, size$okio);
            int i = this.arrayLimit - min;
            this.arrayLimit = i;
            size$okio -= min;
            byteString.copyInto(size$okio, i, min, this.f1419array);
        }
    }

    public final void writeFixed32(int i) {
        require(4);
        int i2 = this.arrayLimit;
        int i3 = i2 - 4;
        this.arrayLimit = i3;
        byte[] bArr = this.f1419array;
        bArr[i3] = (byte) (i & 255);
        bArr[i2 - 3] = (byte) ((i >>> 8) & 255);
        bArr[i2 - 2] = (byte) ((i >>> 16) & 255);
        bArr[i2 - 1] = (byte) ((i >>> 24) & 255);
    }

    public final void writeFixed64(long j) {
        require(8);
        int i = this.arrayLimit;
        int i2 = i - 8;
        this.arrayLimit = i2;
        byte[] bArr = this.f1419array;
        bArr[i2] = (byte) (j & 255);
        bArr[i - 7] = (byte) ((j >>> 8) & 255);
        bArr[i - 6] = (byte) ((j >>> 16) & 255);
        bArr[i - 5] = (byte) ((j >>> 24) & 255);
        bArr[i - 4] = (byte) ((j >>> 32) & 255);
        bArr[i - 3] = (byte) ((j >>> 40) & 255);
        bArr[i - 2] = (byte) ((j >>> 48) & 255);
        bArr[i - 1] = (byte) ((j >>> 56) & 255);
    }

    public final void writeTag(int i, FieldEncoding fieldEncoding) {
        fieldEncoding.getClass();
        writeVarint32((i << 3) | fieldEncoding.value);
    }

    public final void writeVarint32(int i) {
        int i2 = (i & (-128)) == 0 ? 1 : (i & (-16384)) == 0 ? 2 : ((-2097152) & i) == 0 ? 3 : ((-268435456) & i) == 0 ? 4 : 5;
        require(i2);
        int i3 = this.arrayLimit - i2;
        this.arrayLimit = i3;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.f1419array;
            if (i4 == 0) {
                bArr[i3] = (byte) i;
                return;
            } else {
                bArr[i3] = (byte) ((i & 127) | 128);
                i >>>= 7;
                i3++;
            }
        }
    }

    public final void writeVarint64(long j) {
        int varint64Size$wire_runtime = Countries.varint64Size$wire_runtime(j);
        require(varint64Size$wire_runtime);
        int i = this.arrayLimit - varint64Size$wire_runtime;
        this.arrayLimit = i;
        while (true) {
            long j2 = (-128) & j;
            byte[] bArr = this.f1419array;
            if (j2 == 0) {
                bArr[i] = (byte) j;
                return;
            } else {
                bArr[i] = (byte) ((127 & j) | 128);
                j >>>= 7;
                i++;
            }
        }
    }
}
