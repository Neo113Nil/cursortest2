package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class s extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile s[] f5232c;

    /* renamed from: a, reason: collision with root package name */
    public int f5233a;

    /* renamed from: b, reason: collision with root package name */
    public int f5234b;

    public s() {
        a();
    }

    public static s[] b() {
        if (f5232c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5232c == null) {
                        f5232c = new s[0];
                    }
                } finally {
                }
            }
        }
        return f5232c;
    }

    public final s a() {
        this.f5233a = 86400;
        this.f5234b = 86400;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i3 = this.f5233a;
        if (i3 != 86400) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i3);
        }
        int i4 = this.f5234b;
        return i4 != 86400 ? CodedOutputByteBufferNano.computeInt32Size(2, i4) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i3 = this.f5233a;
        if (i3 != 86400) {
            codedOutputByteBufferNano.writeInt32(1, i3);
        }
        int i4 = this.f5234b;
        if (i4 != 86400) {
            codedOutputByteBufferNano.writeInt32(2, i4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final s mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f5233a = codedInputByteBufferNano.readInt32();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f5234b = codedInputByteBufferNano.readInt32();
            }
        }
        return this;
    }

    public static s b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new s().mergeFrom(codedInputByteBufferNano);
    }

    public static s a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (s) MessageNano.mergeFrom(new s(), bArr);
    }
}
