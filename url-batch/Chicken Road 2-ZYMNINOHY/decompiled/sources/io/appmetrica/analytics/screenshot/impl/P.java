package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class P extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile P[] f13430c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f13431a;

    /* renamed from: b, reason: collision with root package name */
    public long f13432b;

    public P() {
        a();
    }

    public static P[] b() {
        if (f13430c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f13430c == null) {
                        f13430c = new P[0];
                    }
                } finally {
                }
            }
        }
        return f13430c;
    }

    public final P a() {
        this.f13431a = true;
        this.f13432b = 1L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z = this.f13431a;
        if (!z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z);
        }
        long j4 = this.f13432b;
        return j4 != 1 ? CodedOutputByteBufferNano.computeInt64Size(2, j4) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z = this.f13431a;
        if (!z) {
            codedOutputByteBufferNano.writeBool(1, z);
        }
        long j4 = this.f13432b;
        if (j4 != 1) {
            codedOutputByteBufferNano.writeInt64(2, j4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final P mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f13431a = codedInputByteBufferNano.readBool();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f13432b = codedInputByteBufferNano.readInt64();
            }
        }
        return this;
    }

    public static P b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new P().mergeFrom(codedInputByteBufferNano);
    }

    public static P a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (P) MessageNano.mergeFrom(new P(), bArr);
    }
}
