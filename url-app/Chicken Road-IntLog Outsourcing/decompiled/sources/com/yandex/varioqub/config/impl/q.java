package com.yandex.varioqub.config.impl;

import com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.InternalNano;
import com.yandex.varioqub.protobuf.nano.MessageNano;
import com.yandex.varioqub.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class q extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile q[] f5449c;

    /* renamed from: a, reason: collision with root package name */
    public String f5450a;

    /* renamed from: b, reason: collision with root package name */
    public s[] f5451b;

    public q() {
        a();
    }

    public final void a() {
        this.f5450a = "";
        if (s.f5456d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (s.f5456d == null) {
                        s.f5456d = new s[0];
                    }
                } finally {
                }
            }
        }
        this.f5451b = s.f5456d;
        this.cachedSize = -1;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f5450a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f5450a);
        }
        s[] sVarArr = this.f5451b;
        if (sVarArr != null && sVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                s[] sVarArr2 = this.f5451b;
                if (i2 >= sVarArr2.length) {
                    break;
                }
                s sVar = sVarArr2[i2];
                if (sVar != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, sVar) + computeSerializedSize;
                }
                i2++;
            }
        }
        return computeSerializedSize;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f5450a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                s[] sVarArr = this.f5451b;
                int length = sVarArr == null ? 0 : sVarArr.length;
                int i2 = repeatedFieldArrayLength + length;
                s[] sVarArr2 = new s[i2];
                if (length != 0) {
                    System.arraycopy(sVarArr, 0, sVarArr2, 0, length);
                }
                while (length < i2 - 1) {
                    s sVar = new s();
                    sVarArr2[length] = sVar;
                    codedInputByteBufferNano.readMessage(sVar);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                s sVar2 = new s();
                sVarArr2[length] = sVar2;
                codedInputByteBufferNano.readMessage(sVar2);
                this.f5451b = sVarArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f5450a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f5450a);
        }
        s[] sVarArr = this.f5451b;
        if (sVarArr != null && sVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                s[] sVarArr2 = this.f5451b;
                if (i2 >= sVarArr2.length) {
                    break;
                }
                s sVar = sVarArr2[i2];
                if (sVar != null) {
                    codedOutputByteBufferNano.writeMessage(2, sVar);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
