package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class l extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile l[] f9937c;

    /* renamed from: a, reason: collision with root package name */
    public long f9938a;

    /* renamed from: b, reason: collision with root package name */
    public k[] f9939b;

    public l() {
        a();
    }

    public static l[] b() {
        if (f9937c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9937c == null) {
                        f9937c = new l[0];
                    }
                } finally {
                }
            }
        }
        return f9937c;
    }

    public final l a() {
        this.f9938a = 10000L;
        this.f9939b = k.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j4 = this.f9938a;
        if (j4 != 10000) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(1, j4);
        }
        k[] kVarArr = this.f9939b;
        if (kVarArr != null && kVarArr.length > 0) {
            int i4 = 0;
            while (true) {
                k[] kVarArr2 = this.f9939b;
                if (i4 >= kVarArr2.length) {
                    break;
                }
                k kVar = kVarArr2[i4];
                if (kVar != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, kVar) + computeSerializedSize;
                }
                i4++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j4 = this.f9938a;
        if (j4 != 10000) {
            codedOutputByteBufferNano.writeUInt64(1, j4);
        }
        k[] kVarArr = this.f9939b;
        if (kVarArr != null && kVarArr.length > 0) {
            int i4 = 0;
            while (true) {
                k[] kVarArr2 = this.f9939b;
                if (i4 >= kVarArr2.length) {
                    break;
                }
                k kVar = kVarArr2[i4];
                if (kVar != null) {
                    codedOutputByteBufferNano.writeMessage(2, kVar);
                }
                i4++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final l mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f9938a = codedInputByteBufferNano.readUInt64();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                k[] kVarArr = this.f9939b;
                int length = kVarArr == null ? 0 : kVarArr.length;
                int i4 = repeatedFieldArrayLength + length;
                k[] kVarArr2 = new k[i4];
                if (length != 0) {
                    System.arraycopy(kVarArr, 0, kVarArr2, 0, length);
                }
                while (length < i4 - 1) {
                    k kVar = new k();
                    kVarArr2[length] = kVar;
                    codedInputByteBufferNano.readMessage(kVar);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                k kVar2 = new k();
                kVarArr2[length] = kVar2;
                codedInputByteBufferNano.readMessage(kVar2);
                this.f9939b = kVarArr2;
            }
        }
        return this;
    }

    public static l b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new l().mergeFrom(codedInputByteBufferNano);
    }

    public static l a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (l) MessageNano.mergeFrom(new l(), bArr);
    }
}
