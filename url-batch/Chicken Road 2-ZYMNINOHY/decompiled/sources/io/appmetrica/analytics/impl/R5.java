package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class R5 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile R5[] f10871d;

    /* renamed from: a, reason: collision with root package name */
    public C0477a6 f10872a;

    /* renamed from: b, reason: collision with root package name */
    public C0477a6[] f10873b;

    /* renamed from: c, reason: collision with root package name */
    public String f10874c;

    public R5() {
        a();
    }

    public static R5[] b() {
        if (f10871d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f10871d == null) {
                        f10871d = new R5[0];
                    }
                } finally {
                }
            }
        }
        return f10871d;
    }

    public final R5 a() {
        this.f10872a = null;
        this.f10873b = C0477a6.b();
        this.f10874c = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0477a6 c0477a6 = this.f10872a;
        if (c0477a6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0477a6);
        }
        C0477a6[] c0477a6Arr = this.f10873b;
        if (c0477a6Arr != null && c0477a6Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C0477a6[] c0477a6Arr2 = this.f10873b;
                if (i4 >= c0477a6Arr2.length) {
                    break;
                }
                C0477a6 c0477a62 = c0477a6Arr2[i4];
                if (c0477a62 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c0477a62) + computeSerializedSize;
                }
                i4++;
            }
        }
        return !this.f10874c.equals("") ? CodedOutputByteBufferNano.computeStringSize(3, this.f10874c) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0477a6 c0477a6 = this.f10872a;
        if (c0477a6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0477a6);
        }
        C0477a6[] c0477a6Arr = this.f10873b;
        if (c0477a6Arr != null && c0477a6Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C0477a6[] c0477a6Arr2 = this.f10873b;
                if (i4 >= c0477a6Arr2.length) {
                    break;
                }
                C0477a6 c0477a62 = c0477a6Arr2[i4];
                if (c0477a62 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c0477a62);
                }
                i4++;
            }
        }
        if (!this.f10874c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f10874c);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final R5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f10872a == null) {
                    this.f10872a = new C0477a6();
                }
                codedInputByteBufferNano.readMessage(this.f10872a);
            } else if (readTag == 18) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C0477a6[] c0477a6Arr = this.f10873b;
                int length = c0477a6Arr == null ? 0 : c0477a6Arr.length;
                int i4 = repeatedFieldArrayLength + length;
                C0477a6[] c0477a6Arr2 = new C0477a6[i4];
                if (length != 0) {
                    System.arraycopy(c0477a6Arr, 0, c0477a6Arr2, 0, length);
                }
                while (length < i4 - 1) {
                    C0477a6 c0477a6 = new C0477a6();
                    c0477a6Arr2[length] = c0477a6;
                    codedInputByteBufferNano.readMessage(c0477a6);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0477a6 c0477a62 = new C0477a6();
                c0477a6Arr2[length] = c0477a62;
                codedInputByteBufferNano.readMessage(c0477a62);
                this.f10873b = c0477a6Arr2;
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f10874c = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static R5 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new R5().mergeFrom(codedInputByteBufferNano);
    }

    public static R5 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (R5) MessageNano.mergeFrom(new R5(), bArr);
    }
}
