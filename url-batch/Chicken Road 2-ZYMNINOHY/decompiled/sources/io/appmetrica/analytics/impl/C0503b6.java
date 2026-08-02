package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.b6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0503b6 extends MessageNano {

    /* renamed from: f, reason: collision with root package name */
    public static volatile C0503b6[] f11477f;

    /* renamed from: a, reason: collision with root package name */
    public String f11478a;

    /* renamed from: b, reason: collision with root package name */
    public String f11479b;

    /* renamed from: c, reason: collision with root package name */
    public Z5[] f11480c;

    /* renamed from: d, reason: collision with root package name */
    public C0503b6 f11481d;

    /* renamed from: e, reason: collision with root package name */
    public C0503b6[] f11482e;

    public C0503b6() {
        a();
    }

    public static C0503b6[] b() {
        if (f11477f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f11477f == null) {
                        f11477f = new C0503b6[0];
                    }
                } finally {
                }
            }
        }
        return f11477f;
    }

    public final C0503b6 a() {
        this.f11478a = "";
        this.f11479b = "";
        this.f11480c = Z5.b();
        this.f11481d = null;
        this.f11482e = b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeStringSize = CodedOutputByteBufferNano.computeStringSize(1, this.f11478a) + super.computeSerializedSize();
        if (!this.f11479b.equals("")) {
            computeStringSize += CodedOutputByteBufferNano.computeStringSize(2, this.f11479b);
        }
        Z5[] z5Arr = this.f11480c;
        int i4 = 0;
        if (z5Arr != null && z5Arr.length > 0) {
            int i5 = 0;
            while (true) {
                Z5[] z5Arr2 = this.f11480c;
                if (i5 >= z5Arr2.length) {
                    break;
                }
                Z5 z5 = z5Arr2[i5];
                if (z5 != null) {
                    computeStringSize = CodedOutputByteBufferNano.computeMessageSize(3, z5) + computeStringSize;
                }
                i5++;
            }
        }
        C0503b6 c0503b6 = this.f11481d;
        if (c0503b6 != null) {
            computeStringSize += CodedOutputByteBufferNano.computeMessageSize(4, c0503b6);
        }
        C0503b6[] c0503b6Arr = this.f11482e;
        if (c0503b6Arr != null && c0503b6Arr.length > 0) {
            while (true) {
                C0503b6[] c0503b6Arr2 = this.f11482e;
                if (i4 >= c0503b6Arr2.length) {
                    break;
                }
                C0503b6 c0503b62 = c0503b6Arr2[i4];
                if (c0503b62 != null) {
                    computeStringSize = CodedOutputByteBufferNano.computeMessageSize(5, c0503b62) + computeStringSize;
                }
                i4++;
            }
        }
        return computeStringSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f11478a);
        if (!this.f11479b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f11479b);
        }
        Z5[] z5Arr = this.f11480c;
        int i4 = 0;
        if (z5Arr != null && z5Arr.length > 0) {
            int i5 = 0;
            while (true) {
                Z5[] z5Arr2 = this.f11480c;
                if (i5 >= z5Arr2.length) {
                    break;
                }
                Z5 z5 = z5Arr2[i5];
                if (z5 != null) {
                    codedOutputByteBufferNano.writeMessage(3, z5);
                }
                i5++;
            }
        }
        C0503b6 c0503b6 = this.f11481d;
        if (c0503b6 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0503b6);
        }
        C0503b6[] c0503b6Arr = this.f11482e;
        if (c0503b6Arr != null && c0503b6Arr.length > 0) {
            while (true) {
                C0503b6[] c0503b6Arr2 = this.f11482e;
                if (i4 >= c0503b6Arr2.length) {
                    break;
                }
                C0503b6 c0503b62 = c0503b6Arr2[i4];
                if (c0503b62 != null) {
                    codedOutputByteBufferNano.writeMessage(5, c0503b62);
                }
                i4++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0503b6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0503b6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0503b6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f11478a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.f11479b = codedInputByteBufferNano.readString();
            } else if (readTag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                Z5[] z5Arr = this.f11480c;
                int length = z5Arr == null ? 0 : z5Arr.length;
                int i4 = repeatedFieldArrayLength + length;
                Z5[] z5Arr2 = new Z5[i4];
                if (length != 0) {
                    System.arraycopy(z5Arr, 0, z5Arr2, 0, length);
                }
                while (length < i4 - 1) {
                    Z5 z5 = new Z5();
                    z5Arr2[length] = z5;
                    codedInputByteBufferNano.readMessage(z5);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                Z5 z52 = new Z5();
                z5Arr2[length] = z52;
                codedInputByteBufferNano.readMessage(z52);
                this.f11480c = z5Arr2;
            } else if (readTag == 34) {
                if (this.f11481d == null) {
                    this.f11481d = new C0503b6();
                }
                codedInputByteBufferNano.readMessage(this.f11481d);
            } else if (readTag != 42) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                C0503b6[] c0503b6Arr = this.f11482e;
                int length2 = c0503b6Arr == null ? 0 : c0503b6Arr.length;
                int i5 = repeatedFieldArrayLength2 + length2;
                C0503b6[] c0503b6Arr2 = new C0503b6[i5];
                if (length2 != 0) {
                    System.arraycopy(c0503b6Arr, 0, c0503b6Arr2, 0, length2);
                }
                while (length2 < i5 - 1) {
                    C0503b6 c0503b6 = new C0503b6();
                    c0503b6Arr2[length2] = c0503b6;
                    codedInputByteBufferNano.readMessage(c0503b6);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                C0503b6 c0503b62 = new C0503b6();
                c0503b6Arr2[length2] = c0503b62;
                codedInputByteBufferNano.readMessage(c0503b62);
                this.f11482e = c0503b6Arr2;
            }
        }
        return this;
    }

    public static C0503b6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0503b6) MessageNano.mergeFrom(new C0503b6(), bArr);
    }
}
