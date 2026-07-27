package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.i6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0713i6 extends MessageNano {

    /* renamed from: f, reason: collision with root package name */
    public static volatile C0713i6[] f8387f;

    /* renamed from: a, reason: collision with root package name */
    public String f8388a;

    /* renamed from: b, reason: collision with root package name */
    public String f8389b;

    /* renamed from: c, reason: collision with root package name */
    public C0661g6[] f8390c;

    /* renamed from: d, reason: collision with root package name */
    public C0713i6 f8391d;

    /* renamed from: e, reason: collision with root package name */
    public C0713i6[] f8392e;

    public C0713i6() {
        a();
    }

    public static C0713i6[] b() {
        if (f8387f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8387f == null) {
                        f8387f = new C0713i6[0];
                    }
                } finally {
                }
            }
        }
        return f8387f;
    }

    public final C0713i6 a() {
        this.f8388a = "";
        this.f8389b = "";
        this.f8390c = C0661g6.b();
        this.f8391d = null;
        this.f8392e = b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeStringSize = CodedOutputByteBufferNano.computeStringSize(1, this.f8388a) + super.computeSerializedSize();
        if (!this.f8389b.equals("")) {
            computeStringSize += CodedOutputByteBufferNano.computeStringSize(2, this.f8389b);
        }
        C0661g6[] c0661g6Arr = this.f8390c;
        int i2 = 0;
        if (c0661g6Arr != null && c0661g6Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C0661g6[] c0661g6Arr2 = this.f8390c;
                if (i3 >= c0661g6Arr2.length) {
                    break;
                }
                C0661g6 c0661g6 = c0661g6Arr2[i3];
                if (c0661g6 != null) {
                    computeStringSize = CodedOutputByteBufferNano.computeMessageSize(3, c0661g6) + computeStringSize;
                }
                i3++;
            }
        }
        C0713i6 c0713i6 = this.f8391d;
        if (c0713i6 != null) {
            computeStringSize += CodedOutputByteBufferNano.computeMessageSize(4, c0713i6);
        }
        C0713i6[] c0713i6Arr = this.f8392e;
        if (c0713i6Arr != null && c0713i6Arr.length > 0) {
            while (true) {
                C0713i6[] c0713i6Arr2 = this.f8392e;
                if (i2 >= c0713i6Arr2.length) {
                    break;
                }
                C0713i6 c0713i62 = c0713i6Arr2[i2];
                if (c0713i62 != null) {
                    computeStringSize = CodedOutputByteBufferNano.computeMessageSize(5, c0713i62) + computeStringSize;
                }
                i2++;
            }
        }
        return computeStringSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeString(1, this.f8388a);
        if (!this.f8389b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f8389b);
        }
        C0661g6[] c0661g6Arr = this.f8390c;
        int i2 = 0;
        if (c0661g6Arr != null && c0661g6Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C0661g6[] c0661g6Arr2 = this.f8390c;
                if (i3 >= c0661g6Arr2.length) {
                    break;
                }
                C0661g6 c0661g6 = c0661g6Arr2[i3];
                if (c0661g6 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c0661g6);
                }
                i3++;
            }
        }
        C0713i6 c0713i6 = this.f8391d;
        if (c0713i6 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0713i6);
        }
        C0713i6[] c0713i6Arr = this.f8392e;
        if (c0713i6Arr != null && c0713i6Arr.length > 0) {
            while (true) {
                C0713i6[] c0713i6Arr2 = this.f8392e;
                if (i2 >= c0713i6Arr2.length) {
                    break;
                }
                C0713i6 c0713i62 = c0713i6Arr2[i2];
                if (c0713i62 != null) {
                    codedOutputByteBufferNano.writeMessage(5, c0713i62);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0713i6 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0713i6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0713i6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f8388a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.f8389b = codedInputByteBufferNano.readString();
            } else if (readTag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C0661g6[] c0661g6Arr = this.f8390c;
                int length = c0661g6Arr == null ? 0 : c0661g6Arr.length;
                int i2 = repeatedFieldArrayLength + length;
                C0661g6[] c0661g6Arr2 = new C0661g6[i2];
                if (length != 0) {
                    System.arraycopy(c0661g6Arr, 0, c0661g6Arr2, 0, length);
                }
                while (length < i2 - 1) {
                    C0661g6 c0661g6 = new C0661g6();
                    c0661g6Arr2[length] = c0661g6;
                    codedInputByteBufferNano.readMessage(c0661g6);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0661g6 c0661g62 = new C0661g6();
                c0661g6Arr2[length] = c0661g62;
                codedInputByteBufferNano.readMessage(c0661g62);
                this.f8390c = c0661g6Arr2;
            } else if (readTag == 34) {
                if (this.f8391d == null) {
                    this.f8391d = new C0713i6();
                }
                codedInputByteBufferNano.readMessage(this.f8391d);
            } else if (readTag != 42) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                C0713i6[] c0713i6Arr = this.f8392e;
                int length2 = c0713i6Arr == null ? 0 : c0713i6Arr.length;
                int i3 = repeatedFieldArrayLength2 + length2;
                C0713i6[] c0713i6Arr2 = new C0713i6[i3];
                if (length2 != 0) {
                    System.arraycopy(c0713i6Arr, 0, c0713i6Arr2, 0, length2);
                }
                while (length2 < i3 - 1) {
                    C0713i6 c0713i6 = new C0713i6();
                    c0713i6Arr2[length2] = c0713i6;
                    codedInputByteBufferNano.readMessage(c0713i6);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                C0713i6 c0713i62 = new C0713i6();
                c0713i6Arr2[length2] = c0713i62;
                codedInputByteBufferNano.readMessage(c0713i62);
                this.f8392e = c0713i6Arr2;
            }
        }
    }

    public static C0713i6 a(byte[] bArr) {
        return (C0713i6) MessageNano.mergeFrom(new C0713i6(), bArr);
    }
}
