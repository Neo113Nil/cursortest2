package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.v8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0900v8 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C0900v8[] f8503d;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f8504a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f8505b;

    /* renamed from: c, reason: collision with root package name */
    public C0926w8 f8506c;

    public C0900v8() {
        a();
    }

    public static C0900v8[] b() {
        if (f8503d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8503d == null) {
                        f8503d = new C0900v8[0];
                    }
                } finally {
                }
            }
        }
        return f8503d;
    }

    public final C0900v8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f8504a = bArr;
        this.f8505b = bArr;
        this.f8506c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f8504a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f8504a);
        }
        if (!Arrays.equals(this.f8505b, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f8505b);
        }
        C0926w8 c0926w8 = this.f8506c;
        return c0926w8 != null ? CodedOutputByteBufferNano.computeMessageSize(3, c0926w8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f8504a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f8504a);
        }
        if (!Arrays.equals(this.f8505b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f8505b);
        }
        C0926w8 c0926w8 = this.f8506c;
        if (c0926w8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c0926w8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0900v8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f8504a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                this.f8505b = codedInputByteBufferNano.readBytes();
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f8506c == null) {
                    this.f8506c = new C0926w8();
                }
                codedInputByteBufferNano.readMessage(this.f8506c);
            }
        }
        return this;
    }

    public static C0900v8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0900v8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0900v8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0900v8) MessageNano.mergeFrom(new C0900v8(), bArr);
    }
}
