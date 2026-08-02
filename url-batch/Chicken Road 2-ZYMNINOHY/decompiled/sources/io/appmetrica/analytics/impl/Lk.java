package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Lk extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile Lk[] f10609c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f10610a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f10611b;

    public Lk() {
        a();
    }

    public static Lk[] b() {
        if (f10609c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f10609c == null) {
                        f10609c = new Lk[0];
                    }
                } finally {
                }
            }
        }
        return f10609c;
    }

    public final Lk a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f10610a = bArr;
        this.f10611b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f10610a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f10610a);
        }
        return !Arrays.equals(this.f10611b, bArr2) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f10611b) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f10610a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f10610a);
        }
        if (!Arrays.equals(this.f10611b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f10611b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Lk mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f10610a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f10611b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static Lk b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Lk().mergeFrom(codedInputByteBufferNano);
    }

    public static Lk a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Lk) MessageNano.mergeFrom(new Lk(), bArr);
    }
}
