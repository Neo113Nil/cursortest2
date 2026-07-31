package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes3.dex */
public final class P9 extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile P9[] f38120e;

    /* renamed from: a, reason: collision with root package name */
    public boolean f38121a;

    /* renamed from: b, reason: collision with root package name */
    public int f38122b;

    /* renamed from: c, reason: collision with root package name */
    public int f38123c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f38124d;

    public P9() {
        a();
    }

    public static P9[] b() {
        if (f38120e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f38120e == null) {
                        f38120e = new P9[0];
                    }
                } finally {
                }
            }
        }
        return f38120e;
    }

    public final P9 a() {
        this.f38121a = false;
        this.f38122b = 0;
        this.f38123c = 0;
        this.f38124d = WireFormatNano.EMPTY_INT_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeUInt32Size = CodedOutputByteBufferNano.computeUInt32Size(3, this.f38123c) + CodedOutputByteBufferNano.computeUInt32Size(2, this.f38122b) + CodedOutputByteBufferNano.computeBoolSize(1, this.f38121a) + super.computeSerializedSize();
        int[] iArr = this.f38124d;
        if (iArr == null || iArr.length <= 0) {
            return computeUInt32Size;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr2 = this.f38124d;
            if (i4 >= iArr2.length) {
                return computeUInt32Size + i5 + iArr2.length;
            }
            i5 += CodedOutputByteBufferNano.computeInt32SizeNoTag(iArr2[i4]);
            i4++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeBool(1, this.f38121a);
        codedOutputByteBufferNano.writeUInt32(2, this.f38122b);
        codedOutputByteBufferNano.writeUInt32(3, this.f38123c);
        int[] iArr = this.f38124d;
        if (iArr != null && iArr.length > 0) {
            int i4 = 0;
            while (true) {
                int[] iArr2 = this.f38124d;
                if (i4 >= iArr2.length) {
                    break;
                }
                codedOutputByteBufferNano.writeInt32(4, iArr2[i4]);
                i4++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final P9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f38121a = codedInputByteBufferNano.readBool();
            } else if (readTag == 16) {
                this.f38122b = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 24) {
                this.f38123c = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 32) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 32);
                int[] iArr = this.f38124d;
                int length = iArr == null ? 0 : iArr.length;
                int i4 = repeatedFieldArrayLength + length;
                int[] iArr2 = new int[i4];
                if (length != 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, length);
                }
                while (length < i4 - 1) {
                    iArr2[length] = codedInputByteBufferNano.readInt32();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                iArr2[length] = codedInputByteBufferNano.readInt32();
                this.f38124d = iArr2;
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int pushLimit = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                int position = codedInputByteBufferNano.getPosition();
                int i5 = 0;
                while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                    codedInputByteBufferNano.readInt32();
                    i5++;
                }
                codedInputByteBufferNano.rewindToPosition(position);
                int[] iArr3 = this.f38124d;
                int length2 = iArr3 == null ? 0 : iArr3.length;
                int i6 = i5 + length2;
                int[] iArr4 = new int[i6];
                if (length2 != 0) {
                    System.arraycopy(iArr3, 0, iArr4, 0, length2);
                }
                while (length2 < i6) {
                    iArr4[length2] = codedInputByteBufferNano.readInt32();
                    length2++;
                }
                this.f38124d = iArr4;
                codedInputByteBufferNano.popLimit(pushLimit);
            }
        }
        return this;
    }

    public static P9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new P9().mergeFrom(codedInputByteBufferNano);
    }

    public static P9 a(byte[] bArr) {
        return (P9) MessageNano.mergeFrom(new P9(), bArr);
    }
}
