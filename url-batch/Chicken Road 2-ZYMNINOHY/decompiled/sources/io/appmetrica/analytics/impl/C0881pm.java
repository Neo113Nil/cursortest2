package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.pm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0881pm extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0881pm[] f12592c;

    /* renamed from: a, reason: collision with root package name */
    public String f12593a;

    /* renamed from: b, reason: collision with root package name */
    public String[] f12594b;

    public C0881pm() {
        a();
    }

    public static C0881pm[] b() {
        if (f12592c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f12592c == null) {
                        f12592c = new C0881pm[0];
                    }
                } finally {
                }
            }
        }
        return f12592c;
    }

    public final C0881pm a() {
        this.f12593a = "";
        this.f12594b = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f12593a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f12593a);
        }
        String[] strArr = this.f12594b;
        if (strArr == null || strArr.length <= 0) {
            return computeSerializedSize;
        }
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            String[] strArr2 = this.f12594b;
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
        if (!this.f12593a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f12593a);
        }
        String[] strArr = this.f12594b;
        if (strArr != null && strArr.length > 0) {
            int i4 = 0;
            while (true) {
                String[] strArr2 = this.f12594b;
                if (i4 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i4];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(2, str);
                }
                i4++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0881pm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f12593a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                String[] strArr = this.f12594b;
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
                this.f12594b = strArr2;
            }
        }
        return this;
    }

    public static C0881pm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0881pm().mergeFrom(codedInputByteBufferNano);
    }

    public static C0881pm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0881pm) MessageNano.mergeFrom(new C0881pm(), bArr);
    }
}
