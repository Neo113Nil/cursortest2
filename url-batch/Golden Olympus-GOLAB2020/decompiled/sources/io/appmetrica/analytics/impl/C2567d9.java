package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.d9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2567d9 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C2567d9[] f38846c;

    /* renamed from: a, reason: collision with root package name */
    public String f38847a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f38848b;

    public C2567d9() {
        a();
    }

    public static C2567d9[] b() {
        if (f38846c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f38846c == null) {
                        f38846c = new C2567d9[0];
                    }
                } finally {
                }
            }
        }
        return f38846c;
    }

    public final C2567d9 a() {
        this.f38847a = "";
        this.f38848b = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f38847a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f38847a);
        }
        return !Arrays.equals(this.f38848b, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f38848b) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f38847a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f38847a);
        }
        if (!Arrays.equals(this.f38848b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f38848b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2567d9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f38847a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f38848b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static C2567d9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2567d9().mergeFrom(codedInputByteBufferNano);
    }

    public static C2567d9 a(byte[] bArr) {
        return (C2567d9) MessageNano.mergeFrom(new C2567d9(), bArr);
    }
}
