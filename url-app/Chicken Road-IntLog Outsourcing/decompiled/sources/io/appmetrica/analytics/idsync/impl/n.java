package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class n extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile n[] f6432c;

    /* renamed from: a, reason: collision with root package name */
    public long f6433a;

    /* renamed from: b, reason: collision with root package name */
    public m[] f6434b;

    public n() {
        a();
    }

    public static n[] b() {
        if (f6432c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6432c == null) {
                        f6432c = new n[0];
                    }
                } finally {
                }
            }
        }
        return f6432c;
    }

    public final n a() {
        this.f6433a = 10000L;
        this.f6434b = m.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j2 = this.f6433a;
        if (j2 != 10000) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(1, j2);
        }
        m[] mVarArr = this.f6434b;
        if (mVarArr != null && mVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                m[] mVarArr2 = this.f6434b;
                if (i2 >= mVarArr2.length) {
                    break;
                }
                m mVar = mVarArr2[i2];
                if (mVar != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, mVar) + computeSerializedSize;
                }
                i2++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        long j2 = this.f6433a;
        if (j2 != 10000) {
            codedOutputByteBufferNano.writeUInt64(1, j2);
        }
        m[] mVarArr = this.f6434b;
        if (mVarArr != null && mVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                m[] mVarArr2 = this.f6434b;
                if (i2 >= mVarArr2.length) {
                    break;
                }
                m mVar = mVarArr2[i2];
                if (mVar != null) {
                    codedOutputByteBufferNano.writeMessage(2, mVar);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final n mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f6433a = codedInputByteBufferNano.readUInt64();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                m[] mVarArr = this.f6434b;
                int length = mVarArr == null ? 0 : mVarArr.length;
                int i2 = repeatedFieldArrayLength + length;
                m[] mVarArr2 = new m[i2];
                if (length != 0) {
                    System.arraycopy(mVarArr, 0, mVarArr2, 0, length);
                }
                while (length < i2 - 1) {
                    m mVar = new m();
                    mVarArr2[length] = mVar;
                    codedInputByteBufferNano.readMessage(mVar);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                m mVar2 = new m();
                mVarArr2[length] = mVar2;
                codedInputByteBufferNano.readMessage(mVar2);
                this.f6434b = mVarArr2;
            }
        }
    }

    public static n b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new n().mergeFrom(codedInputByteBufferNano);
    }

    public static n a(byte[] bArr) {
        return (n) MessageNano.mergeFrom(new n(), bArr);
    }
}
