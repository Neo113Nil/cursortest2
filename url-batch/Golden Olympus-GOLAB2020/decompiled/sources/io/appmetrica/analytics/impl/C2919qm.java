package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.qm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2919qm extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C2919qm[] f39665c;

    /* renamed from: a, reason: collision with root package name */
    public String f39666a;

    /* renamed from: b, reason: collision with root package name */
    public String[] f39667b;

    public C2919qm() {
        a();
    }

    public static C2919qm[] b() {
        if (f39665c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f39665c == null) {
                        f39665c = new C2919qm[0];
                    }
                } finally {
                }
            }
        }
        return f39665c;
    }

    public final C2919qm a() {
        this.f39666a = "";
        this.f39667b = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f39666a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f39666a);
        }
        String[] strArr = this.f39667b;
        if (strArr == null || strArr.length <= 0) {
            return computeSerializedSize;
        }
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            String[] strArr2 = this.f39667b;
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
        if (!this.f39666a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f39666a);
        }
        String[] strArr = this.f39667b;
        if (strArr != null && strArr.length > 0) {
            int i4 = 0;
            while (true) {
                String[] strArr2 = this.f39667b;
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
    public final C2919qm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f39666a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                String[] strArr = this.f39667b;
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
                this.f39667b = strArr2;
            }
        }
        return this;
    }

    public static C2919qm b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2919qm().mergeFrom(codedInputByteBufferNano);
    }

    public static C2919qm a(byte[] bArr) {
        return (C2919qm) MessageNano.mergeFrom(new C2919qm(), bArr);
    }
}
