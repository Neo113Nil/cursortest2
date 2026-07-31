package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.d8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0118d8 extends MessageNano {
    public static volatile C0118d8[] c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f1211a;
    public C0221h8 b;

    public C0118d8() {
        a();
    }

    public static C0118d8[] b() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (c == null) {
                    c = new C0118d8[0];
                }
            }
        }
        return c;
    }

    public final C0118d8 a() {
        this.f1211a = WireFormatNano.EMPTY_BYTES;
        this.b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f1211a, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f1211a);
        }
        C0221h8 c0221h8 = this.b;
        return c0221h8 != null ? CodedOutputByteBufferNano.computeMessageSize(2, c0221h8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f1211a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f1211a);
        }
        C0221h8 c0221h8 = this.b;
        if (c0221h8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0221h8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0118d8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f1211a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.b == null) {
                    this.b = new C0221h8();
                }
                codedInputByteBufferNano.readMessage(this.b);
            }
        }
        return this;
    }

    public static C0118d8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0118d8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0118d8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0118d8) MessageNano.mergeFrom(new C0118d8(), bArr);
    }
}
