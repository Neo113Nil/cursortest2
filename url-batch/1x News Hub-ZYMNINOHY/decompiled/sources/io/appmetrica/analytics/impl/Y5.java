package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class Y5 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile Y5[] f6887d;

    /* renamed from: a, reason: collision with root package name */
    public C0536h6 f6888a;

    /* renamed from: b, reason: collision with root package name */
    public C0536h6[] f6889b;

    /* renamed from: c, reason: collision with root package name */
    public String f6890c;

    public Y5() {
        a();
    }

    public static Y5[] b() {
        if (f6887d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6887d == null) {
                        f6887d = new Y5[0];
                    }
                } finally {
                }
            }
        }
        return f6887d;
    }

    public final Y5 a() {
        this.f6888a = null;
        this.f6889b = C0536h6.b();
        this.f6890c = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0536h6 c0536h6 = this.f6888a;
        if (c0536h6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0536h6);
        }
        C0536h6[] c0536h6Arr = this.f6889b;
        if (c0536h6Arr != null && c0536h6Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C0536h6[] c0536h6Arr2 = this.f6889b;
                if (i3 >= c0536h6Arr2.length) {
                    break;
                }
                C0536h6 c0536h62 = c0536h6Arr2[i3];
                if (c0536h62 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c0536h62) + computeSerializedSize;
                }
                i3++;
            }
        }
        return !this.f6890c.equals("") ? CodedOutputByteBufferNano.computeStringSize(3, this.f6890c) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0536h6 c0536h6 = this.f6888a;
        if (c0536h6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0536h6);
        }
        C0536h6[] c0536h6Arr = this.f6889b;
        if (c0536h6Arr != null && c0536h6Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C0536h6[] c0536h6Arr2 = this.f6889b;
                if (i3 >= c0536h6Arr2.length) {
                    break;
                }
                C0536h6 c0536h62 = c0536h6Arr2[i3];
                if (c0536h62 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c0536h62);
                }
                i3++;
            }
        }
        if (!this.f6890c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f6890c);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Y5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f6888a == null) {
                    this.f6888a = new C0536h6();
                }
                codedInputByteBufferNano.readMessage(this.f6888a);
            } else if (readTag == 18) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C0536h6[] c0536h6Arr = this.f6889b;
                int length = c0536h6Arr == null ? 0 : c0536h6Arr.length;
                int i3 = repeatedFieldArrayLength + length;
                C0536h6[] c0536h6Arr2 = new C0536h6[i3];
                if (length != 0) {
                    System.arraycopy(c0536h6Arr, 0, c0536h6Arr2, 0, length);
                }
                while (length < i3 - 1) {
                    C0536h6 c0536h6 = new C0536h6();
                    c0536h6Arr2[length] = c0536h6;
                    codedInputByteBufferNano.readMessage(c0536h6);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0536h6 c0536h62 = new C0536h6();
                c0536h6Arr2[length] = c0536h62;
                codedInputByteBufferNano.readMessage(c0536h62);
                this.f6889b = c0536h6Arr2;
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f6890c = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static Y5 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Y5().mergeFrom(codedInputByteBufferNano);
    }

    public static Y5 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Y5) MessageNano.mergeFrom(new Y5(), bArr);
    }
}
