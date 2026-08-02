package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class O extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile O[] f13426d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f13427a;

    /* renamed from: b, reason: collision with root package name */
    public long f13428b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f13429c;

    public O() {
        a();
    }

    public static O[] b() {
        if (f13426d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f13426d == null) {
                        f13426d = new O[0];
                    }
                } finally {
                }
            }
        }
        return f13426d;
    }

    public final O a() {
        this.f13427a = true;
        this.f13428b = 5L;
        this.f13429c = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z = this.f13427a;
        if (!z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z);
        }
        long j4 = this.f13428b;
        if (j4 != 5) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(2, j4);
        }
        String[] strArr = this.f13429c;
        if (strArr == null || strArr.length <= 0) {
            return computeSerializedSize;
        }
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            String[] strArr2 = this.f13429c;
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
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z = this.f13427a;
        if (!z) {
            codedOutputByteBufferNano.writeBool(1, z);
        }
        long j4 = this.f13428b;
        if (j4 != 5) {
            codedOutputByteBufferNano.writeInt64(2, j4);
        }
        String[] strArr = this.f13429c;
        if (strArr != null && strArr.length > 0) {
            int i4 = 0;
            while (true) {
                String[] strArr2 = this.f13429c;
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
    public final O mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f13427a = codedInputByteBufferNano.readBool();
            } else if (readTag == 16) {
                this.f13428b = codedInputByteBufferNano.readInt64();
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                String[] strArr = this.f13429c;
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
                this.f13429c = strArr2;
            }
        }
        return this;
    }

    public static O b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new O().mergeFrom(codedInputByteBufferNano);
    }

    public static O a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (O) MessageNano.mergeFrom(new O(), bArr);
    }
}
