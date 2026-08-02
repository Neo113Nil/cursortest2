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
    public static volatile O[] f8997d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f8998a;

    /* renamed from: b, reason: collision with root package name */
    public long f8999b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f9000c;

    public O() {
        a();
    }

    public static O[] b() {
        if (f8997d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8997d == null) {
                        f8997d = new O[0];
                    }
                } finally {
                }
            }
        }
        return f8997d;
    }

    public final O a() {
        this.f8998a = true;
        this.f8999b = 5L;
        this.f9000c = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z = this.f8998a;
        if (!z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z);
        }
        long j3 = this.f8999b;
        if (j3 != 5) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(2, j3);
        }
        String[] strArr = this.f9000c;
        if (strArr == null || strArr.length <= 0) {
            return computeSerializedSize;
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            String[] strArr2 = this.f9000c;
            if (i3 >= strArr2.length) {
                return computeSerializedSize + i4 + i5;
            }
            String str = strArr2[i3];
            if (str != null) {
                i5++;
                i4 = CodedOutputByteBufferNano.computeStringSizeNoTag(str) + i4;
            }
            i3++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z = this.f8998a;
        if (!z) {
            codedOutputByteBufferNano.writeBool(1, z);
        }
        long j3 = this.f8999b;
        if (j3 != 5) {
            codedOutputByteBufferNano.writeInt64(2, j3);
        }
        String[] strArr = this.f9000c;
        if (strArr != null && strArr.length > 0) {
            int i3 = 0;
            while (true) {
                String[] strArr2 = this.f9000c;
                if (i3 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i3];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(3, str);
                }
                i3++;
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
                this.f8998a = codedInputByteBufferNano.readBool();
            } else if (readTag == 16) {
                this.f8999b = codedInputByteBufferNano.readInt64();
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                String[] strArr = this.f9000c;
                int length = strArr == null ? 0 : strArr.length;
                int i3 = repeatedFieldArrayLength + length;
                String[] strArr2 = new String[i3];
                if (length != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length);
                }
                while (length < i3 - 1) {
                    strArr2[length] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                strArr2[length] = codedInputByteBufferNano.readString();
                this.f9000c = strArr2;
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
