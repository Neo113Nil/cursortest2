package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class S5 extends MessageNano {
    public static volatile S5[] d;

    /* renamed from: a, reason: collision with root package name */
    public C0064b6 f1039a;
    public C0064b6[] b;
    public String c;

    public S5() {
        a();
    }

    public static S5[] b() {
        if (d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (d == null) {
                    d = new S5[0];
                }
            }
        }
        return d;
    }

    public final S5 a() {
        this.f1039a = null;
        this.b = C0064b6.b();
        this.c = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0064b6 c0064b6 = this.f1039a;
        if (c0064b6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0064b6);
        }
        C0064b6[] c0064b6Arr = this.b;
        if (c0064b6Arr != null && c0064b6Arr.length > 0) {
            int i = 0;
            while (true) {
                C0064b6[] c0064b6Arr2 = this.b;
                if (i >= c0064b6Arr2.length) {
                    break;
                }
                C0064b6 c0064b62 = c0064b6Arr2[i];
                if (c0064b62 != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c0064b62);
                }
                i++;
            }
        }
        return !this.c.equals("") ? CodedOutputByteBufferNano.computeStringSize(3, this.c) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0064b6 c0064b6 = this.f1039a;
        if (c0064b6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0064b6);
        }
        C0064b6[] c0064b6Arr = this.b;
        if (c0064b6Arr != null && c0064b6Arr.length > 0) {
            int i = 0;
            while (true) {
                C0064b6[] c0064b6Arr2 = this.b;
                if (i >= c0064b6Arr2.length) {
                    break;
                }
                C0064b6 c0064b62 = c0064b6Arr2[i];
                if (c0064b62 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c0064b62);
                }
                i++;
            }
        }
        if (!this.c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.c);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final S5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f1039a == null) {
                    this.f1039a = new C0064b6();
                }
                codedInputByteBufferNano.readMessage(this.f1039a);
            } else if (readTag == 18) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C0064b6[] c0064b6Arr = this.b;
                int length = c0064b6Arr == null ? 0 : c0064b6Arr.length;
                int i = repeatedFieldArrayLength + length;
                C0064b6[] c0064b6Arr2 = new C0064b6[i];
                if (length != 0) {
                    System.arraycopy(c0064b6Arr, 0, c0064b6Arr2, 0, length);
                }
                while (length < i - 1) {
                    C0064b6 c0064b6 = new C0064b6();
                    c0064b6Arr2[length] = c0064b6;
                    codedInputByteBufferNano.readMessage(c0064b6);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0064b6 c0064b62 = new C0064b6();
                c0064b6Arr2[length] = c0064b62;
                codedInputByteBufferNano.readMessage(c0064b62);
                this.b = c0064b6Arr2;
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.c = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static S5 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new S5().mergeFrom(codedInputByteBufferNano);
    }

    public static S5 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (S5) MessageNano.mergeFrom(new S5(), bArr);
    }
}
