package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class K8 extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile K8[] f37872e;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f37873a;

    /* renamed from: b, reason: collision with root package name */
    public C3138z8 f37874b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f37875c;

    /* renamed from: d, reason: collision with root package name */
    public F8 f37876d;

    public K8() {
        a();
    }

    public static K8[] b() {
        if (f37872e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f37872e == null) {
                        f37872e = new K8[0];
                    }
                } finally {
                }
            }
        }
        return f37872e;
    }

    public final K8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f37873a = bArr;
        this.f37874b = null;
        this.f37875c = bArr;
        this.f37876d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f37873a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f37873a);
        }
        C3138z8 c3138z8 = this.f37874b;
        if (c3138z8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c3138z8);
        }
        if (!Arrays.equals(this.f37875c, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.f37875c);
        }
        F8 f8 = this.f37876d;
        return f8 != null ? CodedOutputByteBufferNano.computeMessageSize(4, f8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f37873a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f37873a);
        }
        C3138z8 c3138z8 = this.f37874b;
        if (c3138z8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c3138z8);
        }
        if (!Arrays.equals(this.f37875c, bArr2)) {
            codedOutputByteBufferNano.writeBytes(3, this.f37875c);
        }
        F8 f8 = this.f37876d;
        if (f8 != null) {
            codedOutputByteBufferNano.writeMessage(4, f8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final K8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f37873a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                if (this.f37874b == null) {
                    this.f37874b = new C3138z8();
                }
                codedInputByteBufferNano.readMessage(this.f37874b);
            } else if (readTag == 26) {
                this.f37875c = codedInputByteBufferNano.readBytes();
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f37876d == null) {
                    this.f37876d = new F8();
                }
                codedInputByteBufferNano.readMessage(this.f37876d);
            }
        }
        return this;
    }

    public static K8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new K8().mergeFrom(codedInputByteBufferNano);
    }

    public static K8 a(byte[] bArr) {
        return (K8) MessageNano.mergeFrom(new K8(), bArr);
    }
}
