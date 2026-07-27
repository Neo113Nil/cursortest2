package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.tm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1013tm extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C1013tm[] f9325c;

    /* renamed from: a, reason: collision with root package name */
    public String f9326a;

    /* renamed from: b, reason: collision with root package name */
    public String[] f9327b;

    public C1013tm() {
        a();
    }

    public static C1013tm[] b() {
        if (f9325c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9325c == null) {
                        f9325c = new C1013tm[0];
                    }
                } finally {
                }
            }
        }
        return f9325c;
    }

    public final C1013tm a() {
        this.f9326a = "";
        this.f9327b = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f9326a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f9326a);
        }
        String[] strArr = this.f9327b;
        if (strArr == null || strArr.length <= 0) {
            return computeSerializedSize;
        }
        int i2 = 0;
        int i3 = 0;
        int i6 = 0;
        while (true) {
            String[] strArr2 = this.f9327b;
            if (i2 >= strArr2.length) {
                return computeSerializedSize + i3 + i6;
            }
            String str = strArr2[i2];
            if (str != null) {
                i6++;
                i3 = CodedOutputByteBufferNano.computeStringSizeNoTag(str) + i3;
            }
            i2++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f9326a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f9326a);
        }
        String[] strArr = this.f9327b;
        if (strArr != null && strArr.length > 0) {
            int i2 = 0;
            while (true) {
                String[] strArr2 = this.f9327b;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i2];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(2, str);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1013tm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f9326a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                String[] strArr = this.f9327b;
                int length = strArr == null ? 0 : strArr.length;
                int i2 = repeatedFieldArrayLength + length;
                String[] strArr2 = new String[i2];
                if (length != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length);
                }
                while (length < i2 - 1) {
                    strArr2[length] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                strArr2[length] = codedInputByteBufferNano.readString();
                this.f9327b = strArr2;
            }
        }
    }

    public static C1013tm b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1013tm().mergeFrom(codedInputByteBufferNano);
    }

    public static C1013tm a(byte[] bArr) {
        return (C1013tm) MessageNano.mergeFrom(new C1013tm(), bArr);
    }
}
