package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class l extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile l[] f6422b;

    /* renamed from: a, reason: collision with root package name */
    public int f6423a;

    public l() {
        a();
    }

    public static l[] b() {
        if (f6422b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6422b == null) {
                        f6422b = new l[0];
                    }
                } finally {
                }
            }
        }
        return f6422b;
    }

    public final l a() {
        this.f6423a = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.f6423a;
        return i2 != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(1, i2) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i2 = this.f6423a;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(1, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final l mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag != 8) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1) {
                    this.f6423a = readInt32;
                }
            }
        }
    }

    public static l a(byte[] bArr) {
        return (l) MessageNano.mergeFrom(new l(), bArr);
    }

    public static l b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new l().mergeFrom(codedInputByteBufferNano);
    }
}
