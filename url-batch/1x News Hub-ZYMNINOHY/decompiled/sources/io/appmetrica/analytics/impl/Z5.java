package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class Z5 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile Z5[] f6931d;

    /* renamed from: a, reason: collision with root package name */
    public Y5 f6932a;

    /* renamed from: b, reason: collision with root package name */
    public String f6933b;

    /* renamed from: c, reason: collision with root package name */
    public int f6934c;

    public Z5() {
        a();
    }

    public static Z5[] b() {
        if (f6931d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6931d == null) {
                        f6931d = new Z5[0];
                    }
                } finally {
                }
            }
        }
        return f6931d;
    }

    public final Z5 a() {
        this.f6932a = null;
        this.f6933b = "";
        this.f6934c = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Y5 y5 = this.f6932a;
        if (y5 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, y5);
        }
        if (!this.f6933b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f6933b);
        }
        int i3 = this.f6934c;
        return i3 != -1 ? CodedOutputByteBufferNano.computeInt32Size(3, i3) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        Y5 y5 = this.f6932a;
        if (y5 != null) {
            codedOutputByteBufferNano.writeMessage(1, y5);
        }
        if (!this.f6933b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f6933b);
        }
        int i3 = this.f6934c;
        if (i3 != -1) {
            codedOutputByteBufferNano.writeInt32(3, i3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Z5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f6932a == null) {
                    this.f6932a = new Y5();
                }
                codedInputByteBufferNano.readMessage(this.f6932a);
            } else if (readTag == 18) {
                this.f6933b = codedInputByteBufferNano.readString();
            } else if (readTag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == -1 || readInt32 == 0 || readInt32 == 1) {
                    this.f6934c = readInt32;
                }
            }
        }
        return this;
    }

    public static Z5 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Z5().mergeFrom(codedInputByteBufferNano);
    }

    public static Z5 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Z5) MessageNano.mergeFrom(new Z5(), bArr);
    }
}
