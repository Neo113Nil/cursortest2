package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes3.dex */
public final class L extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile L[] f40705d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f40706a;

    /* renamed from: b, reason: collision with root package name */
    public long f40707b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f40708c;

    public L() {
        a();
    }

    public static L[] b() {
        if (f40705d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f40705d == null) {
                        f40705d = new L[0];
                    }
                } finally {
                }
            }
        }
        return f40705d;
    }

    public final L a() {
        this.f40706a = true;
        this.f40707b = 5L;
        this.f40708c = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z4 = this.f40706a;
        if (!z4) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z4);
        }
        long j4 = this.f40707b;
        if (j4 != 5) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(2, j4);
        }
        String[] strArr = this.f40708c;
        if (strArr == null || strArr.length <= 0) {
            return computeSerializedSize;
        }
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            String[] strArr2 = this.f40708c;
            if (i4 >= strArr2.length) {
                return computeSerializedSize + i5 + i6;
            }
            String str = strArr2[i4];
            if (str != null) {
                i6++;
                i5 = CodedOutputByteBufferNano.computeStringSizeNoTag(str) + i5;
            }
            i4++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        boolean z4 = this.f40706a;
        if (!z4) {
            codedOutputByteBufferNano.writeBool(1, z4);
        }
        long j4 = this.f40707b;
        if (j4 != 5) {
            codedOutputByteBufferNano.writeInt64(2, j4);
        }
        String[] strArr = this.f40708c;
        if (strArr != null && strArr.length > 0) {
            int i4 = 0;
            while (true) {
                String[] strArr2 = this.f40708c;
                if (i4 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i4];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(3, str);
                }
                i4++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final L mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f40706a = codedInputByteBufferNano.readBool();
            } else if (readTag == 16) {
                this.f40707b = codedInputByteBufferNano.readInt64();
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                String[] strArr = this.f40708c;
                int length = strArr == null ? 0 : strArr.length;
                int i4 = repeatedFieldArrayLength + length;
                String[] strArr2 = new String[i4];
                if (length != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length);
                }
                while (length < i4 - 1) {
                    strArr2[length] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                strArr2[length] = codedInputByteBufferNano.readString();
                this.f40708c = strArr2;
            }
        }
        return this;
    }

    public static L b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new L().mergeFrom(codedInputByteBufferNano);
    }

    public static L a(byte[] bArr) {
        return (L) MessageNano.mergeFrom(new L(), bArr);
    }
}
