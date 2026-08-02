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
public final class m extends MessageNano {

    /* renamed from: h, reason: collision with root package name */
    public static volatile m[] f5655h;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f5656a;

    /* renamed from: b, reason: collision with root package name */
    public l f5657b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f5658c;

    /* renamed from: d, reason: collision with root package name */
    public k[] f5659d;

    /* renamed from: e, reason: collision with root package name */
    public long f5660e;
    public long f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f5661g;

    public m() {
        a();
    }

    public static m[] b() {
        if (f5655h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5655h == null) {
                        f5655h = new m[0];
                    }
                } finally {
                }
            }
        }
        return f5655h;
    }

    public final m a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f5656a = bArr;
        this.f5657b = null;
        this.f5658c = bArr;
        this.f5659d = k.b();
        this.f5660e = 86400000L;
        this.f = 3600000L;
        this.f5661g = WireFormatNano.EMPTY_INT_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f5656a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f5656a);
        }
        l lVar = this.f5657b;
        if (lVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, lVar);
        }
        if (!Arrays.equals(this.f5658c, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.f5658c);
        }
        k[] kVarArr = this.f5659d;
        int i3 = 0;
        if (kVarArr != null && kVarArr.length > 0) {
            int i4 = 0;
            while (true) {
                k[] kVarArr2 = this.f5659d;
                if (i4 >= kVarArr2.length) {
                    break;
                }
                k kVar = kVarArr2[i4];
                if (kVar != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(4, kVar) + computeSerializedSize;
                }
                i4++;
            }
        }
        long j3 = this.f5660e;
        if (j3 != 86400000) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(5, j3);
        }
        long j4 = this.f;
        if (j4 != 3600000) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(6, j4);
        }
        int[] iArr = this.f5661g;
        if (iArr == null || iArr.length <= 0) {
            return computeSerializedSize;
        }
        int i5 = 0;
        while (true) {
            int[] iArr2 = this.f5661g;
            if (i3 >= iArr2.length) {
                return computeSerializedSize + i5 + iArr2.length;
            }
            i5 += CodedOutputByteBufferNano.computeUInt32SizeNoTag(iArr2[i3]);
            i3++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f5656a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f5656a);
        }
        l lVar = this.f5657b;
        if (lVar != null) {
            codedOutputByteBufferNano.writeMessage(2, lVar);
        }
        if (!Arrays.equals(this.f5658c, bArr2)) {
            codedOutputByteBufferNano.writeBytes(3, this.f5658c);
        }
        k[] kVarArr = this.f5659d;
        int i3 = 0;
        if (kVarArr != null && kVarArr.length > 0) {
            int i4 = 0;
            while (true) {
                k[] kVarArr2 = this.f5659d;
                if (i4 >= kVarArr2.length) {
                    break;
                }
                k kVar = kVarArr2[i4];
                if (kVar != null) {
                    codedOutputByteBufferNano.writeMessage(4, kVar);
                }
                i4++;
            }
        }
        long j3 = this.f5660e;
        if (j3 != 86400000) {
            codedOutputByteBufferNano.writeUInt64(5, j3);
        }
        long j4 = this.f;
        if (j4 != 3600000) {
            codedOutputByteBufferNano.writeUInt64(6, j4);
        }
        int[] iArr = this.f5661g;
        if (iArr != null && iArr.length > 0) {
            while (true) {
                int[] iArr2 = this.f5661g;
                if (i3 >= iArr2.length) {
                    break;
                }
                codedOutputByteBufferNano.writeUInt32(7, iArr2[i3]);
                i3++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static m b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new m().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final m mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f5656a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                if (this.f5657b == null) {
                    this.f5657b = new l();
                }
                codedInputByteBufferNano.readMessage(this.f5657b);
            } else if (readTag == 26) {
                this.f5658c = codedInputByteBufferNano.readBytes();
            } else if (readTag == 34) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                k[] kVarArr = this.f5659d;
                int length = kVarArr == null ? 0 : kVarArr.length;
                int i3 = repeatedFieldArrayLength + length;
                k[] kVarArr2 = new k[i3];
                if (length != 0) {
                    System.arraycopy(kVarArr, 0, kVarArr2, 0, length);
                }
                while (length < i3 - 1) {
                    k kVar = new k();
                    kVarArr2[length] = kVar;
                    codedInputByteBufferNano.readMessage(kVar);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                k kVar2 = new k();
                kVarArr2[length] = kVar2;
                codedInputByteBufferNano.readMessage(kVar2);
                this.f5659d = kVarArr2;
            } else if (readTag == 40) {
                this.f5660e = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 48) {
                this.f = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 56) {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 56);
                int[] iArr = this.f5661g;
                int length2 = iArr == null ? 0 : iArr.length;
                int i4 = repeatedFieldArrayLength2 + length2;
                int[] iArr2 = new int[i4];
                if (length2 != 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, length2);
                }
                while (length2 < i4 - 1) {
                    iArr2[length2] = codedInputByteBufferNano.readUInt32();
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                iArr2[length2] = codedInputByteBufferNano.readUInt32();
                this.f5661g = iArr2;
            } else if (readTag != 58) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int pushLimit = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                int position = codedInputByteBufferNano.getPosition();
                int i5 = 0;
                while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                    codedInputByteBufferNano.readUInt32();
                    i5++;
                }
                codedInputByteBufferNano.rewindToPosition(position);
                int[] iArr3 = this.f5661g;
                int length3 = iArr3 == null ? 0 : iArr3.length;
                int i6 = i5 + length3;
                int[] iArr4 = new int[i6];
                if (length3 != 0) {
                    System.arraycopy(iArr3, 0, iArr4, 0, length3);
                }
                while (length3 < i6) {
                    iArr4[length3] = codedInputByteBufferNano.readUInt32();
                    length3++;
                }
                this.f5661g = iArr4;
                codedInputByteBufferNano.popLimit(pushLimit);
            }
        }
        return this;
    }

    public static m a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (m) MessageNano.mergeFrom(new m(), bArr);
    }
}
