package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class B9 extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile B9[] f6591e;

    /* renamed from: a, reason: collision with root package name */
    public boolean f6592a;

    /* renamed from: b, reason: collision with root package name */
    public int f6593b;

    /* renamed from: c, reason: collision with root package name */
    public int f6594c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f6595d;

    public B9() {
        a();
    }

    public static B9[] b() {
        if (f6591e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6591e == null) {
                        f6591e = new B9[0];
                    }
                } finally {
                }
            }
        }
        return f6591e;
    }

    public final B9 a() {
        this.f6592a = false;
        this.f6593b = 0;
        this.f6594c = 0;
        this.f6595d = WireFormatNano.EMPTY_INT_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeUInt32Size = CodedOutputByteBufferNano.computeUInt32Size(3, this.f6594c) + CodedOutputByteBufferNano.computeUInt32Size(2, this.f6593b) + CodedOutputByteBufferNano.computeBoolSize(1, this.f6592a) + super.computeSerializedSize();
        int[] iArr = this.f6595d;
        if (iArr == null || iArr.length <= 0) {
            return computeUInt32Size;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr2 = this.f6595d;
            if (i2 >= iArr2.length) {
                return computeUInt32Size + i3 + iArr2.length;
            }
            i3 += CodedOutputByteBufferNano.computeInt32SizeNoTag(iArr2[i2]);
            i2++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeBool(1, this.f6592a);
        codedOutputByteBufferNano.writeUInt32(2, this.f6593b);
        codedOutputByteBufferNano.writeUInt32(3, this.f6594c);
        int[] iArr = this.f6595d;
        if (iArr != null && iArr.length > 0) {
            int i2 = 0;
            while (true) {
                int[] iArr2 = this.f6595d;
                if (i2 >= iArr2.length) {
                    break;
                }
                codedOutputByteBufferNano.writeInt32(4, iArr2[i2]);
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final B9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f6592a = codedInputByteBufferNano.readBool();
            } else if (readTag == 16) {
                this.f6593b = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 24) {
                this.f6594c = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 32) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 32);
                int[] iArr = this.f6595d;
                int length = iArr == null ? 0 : iArr.length;
                int i2 = repeatedFieldArrayLength + length;
                int[] iArr2 = new int[i2];
                if (length != 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, length);
                }
                while (length < i2 - 1) {
                    iArr2[length] = codedInputByteBufferNano.readInt32();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                iArr2[length] = codedInputByteBufferNano.readInt32();
                this.f6595d = iArr2;
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int pushLimit = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                int position = codedInputByteBufferNano.getPosition();
                int i3 = 0;
                while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                    codedInputByteBufferNano.readInt32();
                    i3++;
                }
                codedInputByteBufferNano.rewindToPosition(position);
                int[] iArr3 = this.f6595d;
                int length2 = iArr3 == null ? 0 : iArr3.length;
                int i6 = i3 + length2;
                int[] iArr4 = new int[i6];
                if (length2 != 0) {
                    System.arraycopy(iArr3, 0, iArr4, 0, length2);
                }
                while (length2 < i6) {
                    iArr4[length2] = codedInputByteBufferNano.readInt32();
                    length2++;
                }
                this.f6595d = iArr4;
                codedInputByteBufferNano.popLimit(pushLimit);
            }
        }
    }

    public static B9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new B9().mergeFrom(codedInputByteBufferNano);
    }

    public static B9 a(byte[] bArr) {
        return (B9) MessageNano.mergeFrom(new B9(), bArr);
    }
}
