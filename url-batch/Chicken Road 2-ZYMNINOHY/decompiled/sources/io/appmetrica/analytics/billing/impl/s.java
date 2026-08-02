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
    public static volatile s[] f9474c;

    /* renamed from: a, reason: collision with root package name */
    public int f9475a;

    /* renamed from: b, reason: collision with root package name */
    public int f9476b;

    public s() {
        a();
    }

    public static s[] b() {
        if (f9474c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9474c == null) {
                        f9474c = new s[0];
                    }
                } finally {
                }
            }
        }
        return f9474c;
    }

    public final s a() {
        this.f9475a = 86400;
        this.f9476b = 86400;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i4 = this.f9475a;
        if (i4 != 86400) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i4);
        }
        int i5 = this.f9476b;
        return i5 != 86400 ? CodedOutputByteBufferNano.computeInt32Size(2, i5) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i4 = this.f9475a;
        if (i4 != 86400) {
            codedOutputByteBufferNano.writeInt32(1, i4);
        }
        int i5 = this.f9476b;
        if (i5 != 86400) {
            codedOutputByteBufferNano.writeInt32(2, i5);
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
                this.f9475a = codedInputByteBufferNano.readInt32();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f9476b = codedInputByteBufferNano.readInt32();
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
