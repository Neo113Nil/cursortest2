package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class Y5 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile Y5[] f11287c;

    /* renamed from: a, reason: collision with root package name */
    public int f11288a;

    /* renamed from: b, reason: collision with root package name */
    public String f11289b;

    public Y5() {
        a();
    }

    public static Y5[] b() {
        if (f11287c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f11287c == null) {
                        f11287c = new Y5[0];
                    }
                } finally {
                }
            }
        }
        return f11287c;
    }

    public final Y5 a() {
        this.f11288a = 0;
        this.f11289b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i4 = this.f11288a;
        if (i4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i4);
        }
        return !this.f11289b.equals("") ? CodedOutputByteBufferNano.computeStringSize(2, this.f11289b) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i4 = this.f11288a;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeInt32(1, i4);
        }
        if (!this.f11289b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f11289b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Y5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 3) {
                    this.f11288a = readInt32;
                }
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f11289b = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static Y5 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Y5().mergeFrom(codedInputByteBufferNano);
    }

    public static Y5 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Y5) MessageNano.mergeFrom(new Y5(), bArr);
    }
}
