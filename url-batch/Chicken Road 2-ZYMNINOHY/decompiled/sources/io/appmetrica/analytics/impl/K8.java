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
public final class K8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile K8[] f10521c;

    /* renamed from: a, reason: collision with root package name */
    public String f10522a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f10523b;

    public K8() {
        a();
    }

    public static K8[] b() {
        if (f10521c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f10521c == null) {
                        f10521c = new K8[0];
                    }
                } finally {
                }
            }
        }
        return f10521c;
    }

    public final K8 a() {
        this.f10522a = "";
        this.f10523b = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f10522a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f10522a);
        }
        return !Arrays.equals(this.f10523b, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f10523b) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f10522a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f10522a);
        }
        if (!Arrays.equals(this.f10523b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f10523b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final K8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f10522a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f10523b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static K8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new K8().mergeFrom(codedInputByteBufferNano);
    }

    public static K8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (K8) MessageNano.mergeFrom(new K8(), bArr);
    }
}
