package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class i extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile i[] f9922c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f9923a;

    /* renamed from: b, reason: collision with root package name */
    public byte[][] f9924b;

    public i() {
        a();
    }

    public static i[] b() {
        if (f9922c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9922c == null) {
                        f9922c = new i[0];
                    }
                } finally {
                }
            }
        }
        return f9922c;
    }

    public final i a() {
        this.f9923a = WireFormatNano.EMPTY_BYTES;
        this.f9924b = WireFormatNano.EMPTY_BYTES_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f9923a, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f9923a);
        }
        byte[][] bArr = this.f9924b;
        if (bArr == null || bArr.length <= 0) {
            return computeSerializedSize;
        }
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            byte[][] bArr2 = this.f9924b;
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
        if (!Arrays.equals(this.f9923a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f9923a);
        }
        byte[][] bArr = this.f9924b;
        if (bArr != null && bArr.length > 0) {
            int i4 = 0;
            while (true) {
                byte[][] bArr2 = this.f9924b;
                if (i4 >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i4];
                if (bArr3 != null) {
                    codedOutputByteBufferNano.writeBytes(2, bArr3);
                }
                i4++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final i mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f9923a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                byte[][] bArr = this.f9924b;
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
                this.f9924b = bArr2;
            }
        }
        return this;
    }

    public static i b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new i().mergeFrom(codedInputByteBufferNano);
    }

    public static i a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (i) MessageNano.mergeFrom(new i(), bArr);
    }
}
