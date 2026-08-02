package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.q8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0893q8 extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C0893q8[] f12607e;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f12608a;

    /* renamed from: b, reason: collision with root package name */
    public C0608f8 f12609b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f12610c;

    /* renamed from: d, reason: collision with root package name */
    public C0763l8 f12611d;

    public C0893q8() {
        a();
    }

    public static C0893q8[] b() {
        if (f12607e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f12607e == null) {
                        f12607e = new C0893q8[0];
                    }
                } finally {
                }
            }
        }
        return f12607e;
    }

    public final C0893q8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f12608a = bArr;
        this.f12609b = null;
        this.f12610c = bArr;
        this.f12611d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f12608a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f12608a);
        }
        C0608f8 c0608f8 = this.f12609b;
        if (c0608f8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c0608f8);
        }
        if (!Arrays.equals(this.f12610c, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.f12610c);
        }
        C0763l8 c0763l8 = this.f12611d;
        return c0763l8 != null ? CodedOutputByteBufferNano.computeMessageSize(4, c0763l8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f12608a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f12608a);
        }
        C0608f8 c0608f8 = this.f12609b;
        if (c0608f8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0608f8);
        }
        if (!Arrays.equals(this.f12610c, bArr2)) {
            codedOutputByteBufferNano.writeBytes(3, this.f12610c);
        }
        C0763l8 c0763l8 = this.f12611d;
        if (c0763l8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0763l8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0893q8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f12608a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                if (this.f12609b == null) {
                    this.f12609b = new C0608f8();
                }
                codedInputByteBufferNano.readMessage(this.f12609b);
            } else if (readTag == 26) {
                this.f12610c = codedInputByteBufferNano.readBytes();
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f12611d == null) {
                    this.f12611d = new C0763l8();
                }
                codedInputByteBufferNano.readMessage(this.f12611d);
            }
        }
        return this;
    }

    public static C0893q8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0893q8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0893q8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0893q8) MessageNano.mergeFrom(new C0893q8(), bArr);
    }
}
