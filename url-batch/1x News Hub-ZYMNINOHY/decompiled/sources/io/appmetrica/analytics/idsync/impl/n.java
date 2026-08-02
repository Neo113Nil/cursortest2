package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class n extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile n[] f5662c;

    /* renamed from: a, reason: collision with root package name */
    public long f5663a;

    /* renamed from: b, reason: collision with root package name */
    public m[] f5664b;

    public n() {
        a();
    }

    public static n[] b() {
        if (f5662c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5662c == null) {
                        f5662c = new n[0];
                    }
                } finally {
                }
            }
        }
        return f5662c;
    }

    public final n a() {
        this.f5663a = 10000L;
        this.f5664b = m.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j3 = this.f5663a;
        if (j3 != 10000) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(1, j3);
        }
        m[] mVarArr = this.f5664b;
        if (mVarArr != null && mVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                m[] mVarArr2 = this.f5664b;
                if (i3 >= mVarArr2.length) {
                    break;
                }
                m mVar = mVarArr2[i3];
                if (mVar != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, mVar) + computeSerializedSize;
                }
                i3++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j3 = this.f5663a;
        if (j3 != 10000) {
            codedOutputByteBufferNano.writeUInt64(1, j3);
        }
        m[] mVarArr = this.f5664b;
        if (mVarArr != null && mVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                m[] mVarArr2 = this.f5664b;
                if (i3 >= mVarArr2.length) {
                    break;
                }
                m mVar = mVarArr2[i3];
                if (mVar != null) {
                    codedOutputByteBufferNano.writeMessage(2, mVar);
                }
                i3++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final n mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f5663a = codedInputByteBufferNano.readUInt64();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                m[] mVarArr = this.f5664b;
                int length = mVarArr == null ? 0 : mVarArr.length;
                int i3 = repeatedFieldArrayLength + length;
                m[] mVarArr2 = new m[i3];
                if (length != 0) {
                    System.arraycopy(mVarArr, 0, mVarArr2, 0, length);
                }
                while (length < i3 - 1) {
                    m mVar = new m();
                    mVarArr2[length] = mVar;
                    codedInputByteBufferNano.readMessage(mVar);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                m mVar2 = new m();
                mVarArr2[length] = mVar2;
                codedInputByteBufferNano.readMessage(mVar2);
                this.f5664b = mVarArr2;
            }
        }
        return this;
    }

    public static n b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new n().mergeFrom(codedInputByteBufferNano);
    }

    public static n a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (n) MessageNano.mergeFrom(new n(), bArr);
    }
}
