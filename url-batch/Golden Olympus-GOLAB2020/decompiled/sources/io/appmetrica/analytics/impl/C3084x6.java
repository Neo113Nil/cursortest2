package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.x6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3084x6 extends MessageNano {

    /* renamed from: f, reason: collision with root package name */
    public static volatile C3084x6[] f40149f;

    /* renamed from: a, reason: collision with root package name */
    public String f40150a;

    /* renamed from: b, reason: collision with root package name */
    public String f40151b;

    /* renamed from: c, reason: collision with root package name */
    public C3032v6[] f40152c;

    /* renamed from: d, reason: collision with root package name */
    public C3084x6 f40153d;

    /* renamed from: e, reason: collision with root package name */
    public C3084x6[] f40154e;

    public C3084x6() {
        a();
    }

    public static C3084x6[] b() {
        if (f40149f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f40149f == null) {
                        f40149f = new C3084x6[0];
                    }
                } finally {
                }
            }
        }
        return f40149f;
    }

    public final C3084x6 a() {
        this.f40150a = "";
        this.f40151b = "";
        this.f40152c = C3032v6.b();
        this.f40153d = null;
        this.f40154e = b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeStringSize = CodedOutputByteBufferNano.computeStringSize(1, this.f40150a) + super.computeSerializedSize();
        if (!this.f40151b.equals("")) {
            computeStringSize += CodedOutputByteBufferNano.computeStringSize(2, this.f40151b);
        }
        C3032v6[] c3032v6Arr = this.f40152c;
        int i4 = 0;
        if (c3032v6Arr != null && c3032v6Arr.length > 0) {
            int i5 = 0;
            while (true) {
                C3032v6[] c3032v6Arr2 = this.f40152c;
                if (i5 >= c3032v6Arr2.length) {
                    break;
                }
                C3032v6 c3032v6 = c3032v6Arr2[i5];
                if (c3032v6 != null) {
                    computeStringSize = CodedOutputByteBufferNano.computeMessageSize(3, c3032v6) + computeStringSize;
                }
                i5++;
            }
        }
        C3084x6 c3084x6 = this.f40153d;
        if (c3084x6 != null) {
            computeStringSize += CodedOutputByteBufferNano.computeMessageSize(4, c3084x6);
        }
        C3084x6[] c3084x6Arr = this.f40154e;
        if (c3084x6Arr != null && c3084x6Arr.length > 0) {
            while (true) {
                C3084x6[] c3084x6Arr2 = this.f40154e;
                if (i4 >= c3084x6Arr2.length) {
                    break;
                }
                C3084x6 c3084x62 = c3084x6Arr2[i4];
                if (c3084x62 != null) {
                    computeStringSize = CodedOutputByteBufferNano.computeMessageSize(5, c3084x62) + computeStringSize;
                }
                i4++;
            }
        }
        return computeStringSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeString(1, this.f40150a);
        if (!this.f40151b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f40151b);
        }
        C3032v6[] c3032v6Arr = this.f40152c;
        int i4 = 0;
        if (c3032v6Arr != null && c3032v6Arr.length > 0) {
            int i5 = 0;
            while (true) {
                C3032v6[] c3032v6Arr2 = this.f40152c;
                if (i5 >= c3032v6Arr2.length) {
                    break;
                }
                C3032v6 c3032v6 = c3032v6Arr2[i5];
                if (c3032v6 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c3032v6);
                }
                i5++;
            }
        }
        C3084x6 c3084x6 = this.f40153d;
        if (c3084x6 != null) {
            codedOutputByteBufferNano.writeMessage(4, c3084x6);
        }
        C3084x6[] c3084x6Arr = this.f40154e;
        if (c3084x6Arr != null && c3084x6Arr.length > 0) {
            while (true) {
                C3084x6[] c3084x6Arr2 = this.f40154e;
                if (i4 >= c3084x6Arr2.length) {
                    break;
                }
                C3084x6 c3084x62 = c3084x6Arr2[i4];
                if (c3084x62 != null) {
                    codedOutputByteBufferNano.writeMessage(5, c3084x62);
                }
                i4++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C3084x6 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C3084x6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3084x6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f40150a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.f40151b = codedInputByteBufferNano.readString();
            } else if (readTag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C3032v6[] c3032v6Arr = this.f40152c;
                int length = c3032v6Arr == null ? 0 : c3032v6Arr.length;
                int i4 = repeatedFieldArrayLength + length;
                C3032v6[] c3032v6Arr2 = new C3032v6[i4];
                if (length != 0) {
                    System.arraycopy(c3032v6Arr, 0, c3032v6Arr2, 0, length);
                }
                while (length < i4 - 1) {
                    C3032v6 c3032v6 = new C3032v6();
                    c3032v6Arr2[length] = c3032v6;
                    codedInputByteBufferNano.readMessage(c3032v6);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C3032v6 c3032v62 = new C3032v6();
                c3032v6Arr2[length] = c3032v62;
                codedInputByteBufferNano.readMessage(c3032v62);
                this.f40152c = c3032v6Arr2;
            } else if (readTag == 34) {
                if (this.f40153d == null) {
                    this.f40153d = new C3084x6();
                }
                codedInputByteBufferNano.readMessage(this.f40153d);
            } else if (readTag != 42) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                C3084x6[] c3084x6Arr = this.f40154e;
                int length2 = c3084x6Arr == null ? 0 : c3084x6Arr.length;
                int i5 = repeatedFieldArrayLength2 + length2;
                C3084x6[] c3084x6Arr2 = new C3084x6[i5];
                if (length2 != 0) {
                    System.arraycopy(c3084x6Arr, 0, c3084x6Arr2, 0, length2);
                }
                while (length2 < i5 - 1) {
                    C3084x6 c3084x6 = new C3084x6();
                    c3084x6Arr2[length2] = c3084x6;
                    codedInputByteBufferNano.readMessage(c3084x6);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                C3084x6 c3084x62 = new C3084x6();
                c3084x6Arr2[length2] = c3084x62;
                codedInputByteBufferNano.readMessage(c3084x62);
                this.f40154e = c3084x6Arr2;
            }
        }
        return this;
    }

    public static C3084x6 a(byte[] bArr) {
        return (C3084x6) MessageNano.mergeFrom(new C3084x6(), bArr);
    }
}
