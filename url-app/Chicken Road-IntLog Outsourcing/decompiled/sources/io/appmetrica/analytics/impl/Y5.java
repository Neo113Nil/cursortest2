package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class Y5 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile Y5[] f7725d;

    /* renamed from: a, reason: collision with root package name */
    public C0687h6 f7726a;

    /* renamed from: b, reason: collision with root package name */
    public C0687h6[] f7727b;

    /* renamed from: c, reason: collision with root package name */
    public String f7728c;

    public Y5() {
        a();
    }

    public static Y5[] b() {
        if (f7725d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7725d == null) {
                        f7725d = new Y5[0];
                    }
                } finally {
                }
            }
        }
        return f7725d;
    }

    public final Y5 a() {
        this.f7726a = null;
        this.f7727b = C0687h6.b();
        this.f7728c = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0687h6 c0687h6 = this.f7726a;
        if (c0687h6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0687h6);
        }
        C0687h6[] c0687h6Arr = this.f7727b;
        if (c0687h6Arr != null && c0687h6Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C0687h6[] c0687h6Arr2 = this.f7727b;
                if (i2 >= c0687h6Arr2.length) {
                    break;
                }
                C0687h6 c0687h62 = c0687h6Arr2[i2];
                if (c0687h62 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c0687h62) + computeSerializedSize;
                }
                i2++;
            }
        }
        return !this.f7728c.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(3, this.f7728c) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C0687h6 c0687h6 = this.f7726a;
        if (c0687h6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0687h6);
        }
        C0687h6[] c0687h6Arr = this.f7727b;
        if (c0687h6Arr != null && c0687h6Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C0687h6[] c0687h6Arr2 = this.f7727b;
                if (i2 >= c0687h6Arr2.length) {
                    break;
                }
                C0687h6 c0687h62 = c0687h6Arr2[i2];
                if (c0687h62 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c0687h62);
                }
                i2++;
            }
        }
        if (!this.f7728c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f7728c);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Y5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f7726a == null) {
                    this.f7726a = new C0687h6();
                }
                codedInputByteBufferNano.readMessage(this.f7726a);
            } else if (readTag == 18) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C0687h6[] c0687h6Arr = this.f7727b;
                int length = c0687h6Arr == null ? 0 : c0687h6Arr.length;
                int i2 = repeatedFieldArrayLength + length;
                C0687h6[] c0687h6Arr2 = new C0687h6[i2];
                if (length != 0) {
                    System.arraycopy(c0687h6Arr, 0, c0687h6Arr2, 0, length);
                }
                while (length < i2 - 1) {
                    C0687h6 c0687h6 = new C0687h6();
                    c0687h6Arr2[length] = c0687h6;
                    codedInputByteBufferNano.readMessage(c0687h6);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0687h6 c0687h62 = new C0687h6();
                c0687h6Arr2[length] = c0687h62;
                codedInputByteBufferNano.readMessage(c0687h62);
                this.f7727b = c0687h6Arr2;
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f7728c = codedInputByteBufferNano.readString();
            }
        }
    }

    public static Y5 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Y5().mergeFrom(codedInputByteBufferNano);
    }

    public static Y5 a(byte[] bArr) {
        return (Y5) MessageNano.mergeFrom(new Y5(), bArr);
    }
}
