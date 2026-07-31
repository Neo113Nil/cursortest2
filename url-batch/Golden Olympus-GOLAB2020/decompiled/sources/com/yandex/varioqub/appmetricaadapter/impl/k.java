package com.yandex.varioqub.appmetricaadapter.impl;

import com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.MessageNano;
import com.yandex.varioqub.protobuf.nano.WireFormatNano;

/* loaded from: classes3.dex */
public final class k extends MessageNano {

    /* renamed from: a, reason: collision with root package name */
    public String f36148a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f36149b;

    public k() {
        a();
    }

    public final void a() {
        this.f36148a = "";
        this.f36149b = WireFormatNano.EMPTY_LONG_ARRAY;
        this.cachedSize = -1;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f36148a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f36148a);
        }
        long[] jArr = this.f36149b;
        if (jArr == null || jArr.length <= 0) {
            return computeSerializedSize;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            long[] jArr2 = this.f36149b;
            if (i4 >= jArr2.length) {
                return computeSerializedSize + i5 + jArr2.length;
            }
            i5 += CodedOutputByteBufferNano.computeInt64SizeNoTag(jArr2[i4]);
            i4++;
        }
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f36148a = codedInputByteBufferNano.readString();
            } else if (readTag == 16) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 16);
                long[] jArr = this.f36149b;
                int length = jArr == null ? 0 : jArr.length;
                int i4 = repeatedFieldArrayLength + length;
                long[] jArr2 = new long[i4];
                if (length != 0) {
                    System.arraycopy(jArr, 0, jArr2, 0, length);
                }
                while (length < i4 - 1) {
                    jArr2[length] = codedInputByteBufferNano.readInt64();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                jArr2[length] = codedInputByteBufferNano.readInt64();
                this.f36149b = jArr2;
            } else if (readTag == 18) {
                int pushLimit = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                int position = codedInputByteBufferNano.getPosition();
                int i5 = 0;
                while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                    codedInputByteBufferNano.readInt64();
                    i5++;
                }
                codedInputByteBufferNano.rewindToPosition(position);
                long[] jArr3 = this.f36149b;
                int length2 = jArr3 == null ? 0 : jArr3.length;
                int i6 = i5 + length2;
                long[] jArr4 = new long[i6];
                if (length2 != 0) {
                    System.arraycopy(jArr3, 0, jArr4, 0, length2);
                }
                while (length2 < i6) {
                    jArr4[length2] = codedInputByteBufferNano.readInt64();
                    length2++;
                }
                this.f36149b = jArr4;
                codedInputByteBufferNano.popLimit(pushLimit);
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f36148a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f36148a);
        }
        long[] jArr = this.f36149b;
        if (jArr != null && jArr.length > 0) {
            int i4 = 0;
            while (true) {
                long[] jArr2 = this.f36149b;
                if (i4 >= jArr2.length) {
                    break;
                }
                codedOutputByteBufferNano.writeInt64(2, jArr2[i4]);
                i4++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
