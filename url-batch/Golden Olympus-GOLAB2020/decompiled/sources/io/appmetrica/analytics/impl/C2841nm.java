package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.nm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2841nm extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C2841nm[] f39525b;

    /* renamed from: a, reason: collision with root package name */
    public C2815mm[] f39526a;

    public C2841nm() {
        a();
    }

    public static C2841nm[] b() {
        if (f39525b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f39525b == null) {
                        f39525b = new C2841nm[0];
                    }
                } finally {
                }
            }
        }
        return f39525b;
    }

    public final C2841nm a() {
        this.f39526a = C2815mm.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C2815mm[] c2815mmArr = this.f39526a;
        if (c2815mmArr != null && c2815mmArr.length > 0) {
            int i4 = 0;
            while (true) {
                C2815mm[] c2815mmArr2 = this.f39526a;
                if (i4 >= c2815mmArr2.length) {
                    break;
                }
                C2815mm c2815mm = c2815mmArr2[i4];
                if (c2815mm != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c2815mm) + computeSerializedSize;
                }
                i4++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C2815mm[] c2815mmArr = this.f39526a;
        if (c2815mmArr != null && c2815mmArr.length > 0) {
            int i4 = 0;
            while (true) {
                C2815mm[] c2815mmArr2 = this.f39526a;
                if (i4 >= c2815mmArr2.length) {
                    break;
                }
                C2815mm c2815mm = c2815mmArr2[i4];
                if (c2815mm != null) {
                    codedOutputByteBufferNano.writeMessage(1, c2815mm);
                }
                i4++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2841nm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C2815mm[] c2815mmArr = this.f39526a;
                int length = c2815mmArr == null ? 0 : c2815mmArr.length;
                int i4 = repeatedFieldArrayLength + length;
                C2815mm[] c2815mmArr2 = new C2815mm[i4];
                if (length != 0) {
                    System.arraycopy(c2815mmArr, 0, c2815mmArr2, 0, length);
                }
                while (length < i4 - 1) {
                    C2815mm c2815mm = new C2815mm();
                    c2815mmArr2[length] = c2815mm;
                    codedInputByteBufferNano.readMessage(c2815mm);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C2815mm c2815mm2 = new C2815mm();
                c2815mmArr2[length] = c2815mm2;
                codedInputByteBufferNano.readMessage(c2815mm2);
                this.f39526a = c2815mmArr2;
            }
        }
        return this;
    }

    public static C2841nm b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2841nm().mergeFrom(codedInputByteBufferNano);
    }

    public static C2841nm a(byte[] bArr) {
        return (C2841nm) MessageNano.mergeFrom(new C2841nm(), bArr);
    }
}
