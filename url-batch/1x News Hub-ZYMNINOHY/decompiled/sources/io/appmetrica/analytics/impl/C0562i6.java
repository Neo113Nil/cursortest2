package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.i6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0562i6 extends MessageNano {
    public static volatile C0562i6[] f;

    /* renamed from: a, reason: collision with root package name */
    public String f7504a;

    /* renamed from: b, reason: collision with root package name */
    public String f7505b;

    /* renamed from: c, reason: collision with root package name */
    public C0510g6[] f7506c;

    /* renamed from: d, reason: collision with root package name */
    public C0562i6 f7507d;

    /* renamed from: e, reason: collision with root package name */
    public C0562i6[] f7508e;

    public C0562i6() {
        a();
    }

    public static C0562i6[] b() {
        if (f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f == null) {
                        f = new C0562i6[0];
                    }
                } finally {
                }
            }
        }
        return f;
    }

    public final C0562i6 a() {
        this.f7504a = "";
        this.f7505b = "";
        this.f7506c = C0510g6.b();
        this.f7507d = null;
        this.f7508e = b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeStringSize = CodedOutputByteBufferNano.computeStringSize(1, this.f7504a) + super.computeSerializedSize();
        if (!this.f7505b.equals("")) {
            computeStringSize += CodedOutputByteBufferNano.computeStringSize(2, this.f7505b);
        }
        C0510g6[] c0510g6Arr = this.f7506c;
        int i3 = 0;
        if (c0510g6Arr != null && c0510g6Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C0510g6[] c0510g6Arr2 = this.f7506c;
                if (i4 >= c0510g6Arr2.length) {
                    break;
                }
                C0510g6 c0510g6 = c0510g6Arr2[i4];
                if (c0510g6 != null) {
                    computeStringSize = CodedOutputByteBufferNano.computeMessageSize(3, c0510g6) + computeStringSize;
                }
                i4++;
            }
        }
        C0562i6 c0562i6 = this.f7507d;
        if (c0562i6 != null) {
            computeStringSize += CodedOutputByteBufferNano.computeMessageSize(4, c0562i6);
        }
        C0562i6[] c0562i6Arr = this.f7508e;
        if (c0562i6Arr != null && c0562i6Arr.length > 0) {
            while (true) {
                C0562i6[] c0562i6Arr2 = this.f7508e;
                if (i3 >= c0562i6Arr2.length) {
                    break;
                }
                C0562i6 c0562i62 = c0562i6Arr2[i3];
                if (c0562i62 != null) {
                    computeStringSize = CodedOutputByteBufferNano.computeMessageSize(5, c0562i62) + computeStringSize;
                }
                i3++;
            }
        }
        return computeStringSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f7504a);
        if (!this.f7505b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f7505b);
        }
        C0510g6[] c0510g6Arr = this.f7506c;
        int i3 = 0;
        if (c0510g6Arr != null && c0510g6Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C0510g6[] c0510g6Arr2 = this.f7506c;
                if (i4 >= c0510g6Arr2.length) {
                    break;
                }
                C0510g6 c0510g6 = c0510g6Arr2[i4];
                if (c0510g6 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c0510g6);
                }
                i4++;
            }
        }
        C0562i6 c0562i6 = this.f7507d;
        if (c0562i6 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0562i6);
        }
        C0562i6[] c0562i6Arr = this.f7508e;
        if (c0562i6Arr != null && c0562i6Arr.length > 0) {
            while (true) {
                C0562i6[] c0562i6Arr2 = this.f7508e;
                if (i3 >= c0562i6Arr2.length) {
                    break;
                }
                C0562i6 c0562i62 = c0562i6Arr2[i3];
                if (c0562i62 != null) {
                    codedOutputByteBufferNano.writeMessage(5, c0562i62);
                }
                i3++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0562i6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0562i6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0562i6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f7504a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.f7505b = codedInputByteBufferNano.readString();
            } else if (readTag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C0510g6[] c0510g6Arr = this.f7506c;
                int length = c0510g6Arr == null ? 0 : c0510g6Arr.length;
                int i3 = repeatedFieldArrayLength + length;
                C0510g6[] c0510g6Arr2 = new C0510g6[i3];
                if (length != 0) {
                    System.arraycopy(c0510g6Arr, 0, c0510g6Arr2, 0, length);
                }
                while (length < i3 - 1) {
                    C0510g6 c0510g6 = new C0510g6();
                    c0510g6Arr2[length] = c0510g6;
                    codedInputByteBufferNano.readMessage(c0510g6);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0510g6 c0510g62 = new C0510g6();
                c0510g6Arr2[length] = c0510g62;
                codedInputByteBufferNano.readMessage(c0510g62);
                this.f7506c = c0510g6Arr2;
            } else if (readTag == 34) {
                if (this.f7507d == null) {
                    this.f7507d = new C0562i6();
                }
                codedInputByteBufferNano.readMessage(this.f7507d);
            } else if (readTag != 42) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                C0562i6[] c0562i6Arr = this.f7508e;
                int length2 = c0562i6Arr == null ? 0 : c0562i6Arr.length;
                int i4 = repeatedFieldArrayLength2 + length2;
                C0562i6[] c0562i6Arr2 = new C0562i6[i4];
                if (length2 != 0) {
                    System.arraycopy(c0562i6Arr, 0, c0562i6Arr2, 0, length2);
                }
                while (length2 < i4 - 1) {
                    C0562i6 c0562i6 = new C0562i6();
                    c0562i6Arr2[length2] = c0562i6;
                    codedInputByteBufferNano.readMessage(c0562i6);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                C0562i6 c0562i62 = new C0562i6();
                c0562i6Arr2[length2] = c0562i62;
                codedInputByteBufferNano.readMessage(c0562i62);
                this.f7508e = c0562i6Arr2;
            }
        }
        return this;
    }

    public static C0562i6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0562i6) MessageNano.mergeFrom(new C0562i6(), bArr);
    }
}
