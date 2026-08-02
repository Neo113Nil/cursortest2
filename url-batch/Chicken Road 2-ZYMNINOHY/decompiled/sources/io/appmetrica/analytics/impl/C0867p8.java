package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.p8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0867p8 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C0867p8[] f12567d;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f12568a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f12569b;

    /* renamed from: c, reason: collision with root package name */
    public C0893q8 f12570c;

    public C0867p8() {
        a();
    }

    public static C0867p8[] b() {
        if (f12567d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f12567d == null) {
                        f12567d = new C0867p8[0];
                    }
                } finally {
                }
            }
        }
        return f12567d;
    }

    public final C0867p8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f12568a = bArr;
        this.f12569b = bArr;
        this.f12570c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f12568a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f12568a);
        }
        if (!Arrays.equals(this.f12569b, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f12569b);
        }
        C0893q8 c0893q8 = this.f12570c;
        return c0893q8 != null ? CodedOutputByteBufferNano.computeMessageSize(3, c0893q8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f12568a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f12568a);
        }
        if (!Arrays.equals(this.f12569b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f12569b);
        }
        C0893q8 c0893q8 = this.f12570c;
        if (c0893q8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c0893q8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0867p8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f12568a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                this.f12569b = codedInputByteBufferNano.readBytes();
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f12570c == null) {
                    this.f12570c = new C0893q8();
                }
                codedInputByteBufferNano.readMessage(this.f12570c);
            }
        }
        return this;
    }

    public static C0867p8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0867p8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0867p8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0867p8) MessageNano.mergeFrom(new C0867p8(), bArr);
    }
}
