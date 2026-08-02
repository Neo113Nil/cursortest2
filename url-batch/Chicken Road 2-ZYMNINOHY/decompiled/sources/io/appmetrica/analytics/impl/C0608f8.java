package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.f8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0608f8 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0608f8[] f11824b;

    /* renamed from: a, reason: collision with root package name */
    public byte[][] f11825a;

    public C0608f8() {
        a();
    }

    public static C0608f8[] b() {
        if (f11824b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f11824b == null) {
                        f11824b = new C0608f8[0];
                    }
                } finally {
                }
            }
        }
        return f11824b;
    }

    public final C0608f8 a() {
        this.f11825a = WireFormatNano.EMPTY_BYTES_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[][] bArr = this.f11825a;
        if (bArr == null || bArr.length <= 0) {
            return computeSerializedSize;
        }
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            byte[][] bArr2 = this.f11825a;
            if (i4 >= bArr2.length) {
                return computeSerializedSize + i5 + i6;
            }
            byte[] bArr3 = bArr2[i4];
            if (bArr3 != null) {
                i6++;
                i5 = CodedOutputByteBufferNano.computeBytesSizeNoTag(bArr3) + i5;
            }
            i4++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[][] bArr = this.f11825a;
        if (bArr != null && bArr.length > 0) {
            int i4 = 0;
            while (true) {
                byte[][] bArr2 = this.f11825a;
                if (i4 >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i4];
                if (bArr3 != null) {
                    codedOutputByteBufferNano.writeBytes(1, bArr3);
                }
                i4++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0608f8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                byte[][] bArr = this.f11825a;
                int length = bArr == null ? 0 : bArr.length;
                int i4 = repeatedFieldArrayLength + length;
                byte[][] bArr2 = new byte[i4][];
                if (length != 0) {
                    System.arraycopy(bArr, 0, bArr2, 0, length);
                }
                while (length < i4 - 1) {
                    bArr2[length] = codedInputByteBufferNano.readBytes();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                bArr2[length] = codedInputByteBufferNano.readBytes();
                this.f11825a = bArr2;
            }
        }
        return this;
    }

    public static C0608f8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0608f8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0608f8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0608f8) MessageNano.mergeFrom(new C0608f8(), bArr);
    }
}
