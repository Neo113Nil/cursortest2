package io.appmetrica.analytics.remotepermissions.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes3.dex */
public final class f extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile f[] f40679b;

    /* renamed from: a, reason: collision with root package name */
    public byte[][] f40680a;

    public f() {
        a();
    }

    public static f[] b() {
        if (f40679b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f40679b == null) {
                        f40679b = new f[0];
                    }
                } finally {
                }
            }
        }
        return f40679b;
    }

    public final f a() {
        this.f40680a = WireFormatNano.EMPTY_BYTES_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[][] bArr = this.f40680a;
        if (bArr == null || bArr.length <= 0) {
            return computeSerializedSize;
        }
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            byte[][] bArr2 = this.f40680a;
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
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[][] bArr = this.f40680a;
        if (bArr != null && bArr.length > 0) {
            int i4 = 0;
            while (true) {
                byte[][] bArr2 = this.f40680a;
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
    public final f mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
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
                byte[][] bArr = this.f40680a;
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
                this.f40680a = bArr2;
            }
        }
        return this;
    }

    public static f b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new f().mergeFrom(codedInputByteBufferNano);
    }

    public static f a(byte[] bArr) {
        return (f) MessageNano.mergeFrom(new f(), bArr);
    }
}
