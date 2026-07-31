package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.q6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2903q6 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C2903q6[] f39648c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f39649a;

    /* renamed from: b, reason: collision with root package name */
    public C3006u6 f39650b;

    public C2903q6() {
        a();
    }

    public static C2903q6[] b() {
        if (f39648c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f39648c == null) {
                        f39648c = new C2903q6[0];
                    }
                } finally {
                }
            }
        }
        return f39648c;
    }

    public final C2903q6 a() {
        this.f39649a = WireFormatNano.EMPTY_BYTES;
        this.f39650b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f39649a, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f39649a);
        }
        C3006u6 c3006u6 = this.f39650b;
        return c3006u6 != null ? CodedOutputByteBufferNano.computeMessageSize(2, c3006u6) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!Arrays.equals(this.f39649a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f39649a);
        }
        C3006u6 c3006u6 = this.f39650b;
        if (c3006u6 != null) {
            codedOutputByteBufferNano.writeMessage(2, c3006u6);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2903q6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f39649a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f39650b == null) {
                    this.f39650b = new C3006u6();
                }
                codedInputByteBufferNano.readMessage(this.f39650b);
            }
        }
        return this;
    }

    public static C2903q6 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2903q6().mergeFrom(codedInputByteBufferNano);
    }

    public static C2903q6 a(byte[] bArr) {
        return (C2903q6) MessageNano.mergeFrom(new C2903q6(), bArr);
    }
}
