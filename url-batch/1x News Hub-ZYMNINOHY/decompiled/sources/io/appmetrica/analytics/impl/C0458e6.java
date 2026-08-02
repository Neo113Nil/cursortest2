package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.e6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0458e6 extends MessageNano {

    /* renamed from: l, reason: collision with root package name */
    public static final int f7244l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f7245m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static volatile C0458e6[] f7246n;
    public static byte[] o;

    /* renamed from: p, reason: collision with root package name */
    public static volatile boolean f7247p;

    /* renamed from: a, reason: collision with root package name */
    public C0562i6 f7248a;

    /* renamed from: b, reason: collision with root package name */
    public Y5 f7249b;

    /* renamed from: c, reason: collision with root package name */
    public String f7250c;

    /* renamed from: d, reason: collision with root package name */
    public int f7251d;

    /* renamed from: e, reason: collision with root package name */
    public C0510g6[] f7252e;
    public String f;

    /* renamed from: g, reason: collision with root package name */
    public int f7253g;

    /* renamed from: h, reason: collision with root package name */
    public C0433d6 f7254h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f7255i;

    /* renamed from: j, reason: collision with root package name */
    public byte[] f7256j;

    /* renamed from: k, reason: collision with root package name */
    public C0355a6[] f7257k;

    public C0458e6() {
        if (!f7247p) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!f7247p) {
                        o = InternalNano.bytesDefaultValue("JVM");
                        f7247p = true;
                    }
                } finally {
                }
            }
        }
        a();
    }

    public static C0458e6[] b() {
        if (f7246n == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7246n == null) {
                        f7246n = new C0458e6[0];
                    }
                } finally {
                }
            }
        }
        return f7246n;
    }

    public final C0458e6 a() {
        this.f7248a = null;
        this.f7249b = null;
        this.f7250c = "";
        this.f7251d = -1;
        this.f7252e = C0510g6.b();
        this.f = "";
        this.f7253g = 0;
        this.f7254h = null;
        this.f7255i = (byte[]) o.clone();
        this.f7256j = WireFormatNano.EMPTY_BYTES;
        this.f7257k = C0355a6.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0562i6 c0562i6 = this.f7248a;
        if (c0562i6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0562i6);
        }
        Y5 y5 = this.f7249b;
        if (y5 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, y5);
        }
        if (!this.f7250c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f7250c);
        }
        int i3 = this.f7251d;
        if (i3 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i3);
        }
        C0510g6[] c0510g6Arr = this.f7252e;
        int i4 = 0;
        if (c0510g6Arr != null && c0510g6Arr.length > 0) {
            int i5 = 0;
            while (true) {
                C0510g6[] c0510g6Arr2 = this.f7252e;
                if (i5 >= c0510g6Arr2.length) {
                    break;
                }
                C0510g6 c0510g6 = c0510g6Arr2[i5];
                if (c0510g6 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(5, c0510g6) + computeSerializedSize;
                }
                i5++;
            }
        }
        if (!this.f.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.f);
        }
        int i6 = this.f7253g;
        if (i6 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(7, i6);
        }
        C0433d6 c0433d6 = this.f7254h;
        if (c0433d6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(8, c0433d6);
        }
        if (!Arrays.equals(this.f7255i, o)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f7255i);
        }
        if (!Arrays.equals(this.f7256j, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(10, this.f7256j);
        }
        C0355a6[] c0355a6Arr = this.f7257k;
        if (c0355a6Arr != null && c0355a6Arr.length > 0) {
            while (true) {
                C0355a6[] c0355a6Arr2 = this.f7257k;
                if (i4 >= c0355a6Arr2.length) {
                    break;
                }
                C0355a6 c0355a6 = c0355a6Arr2[i4];
                if (c0355a6 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(11, c0355a6) + computeSerializedSize;
                }
                i4++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0562i6 c0562i6 = this.f7248a;
        if (c0562i6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0562i6);
        }
        Y5 y5 = this.f7249b;
        if (y5 != null) {
            codedOutputByteBufferNano.writeMessage(2, y5);
        }
        if (!this.f7250c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f7250c);
        }
        int i3 = this.f7251d;
        if (i3 != -1) {
            codedOutputByteBufferNano.writeInt32(4, i3);
        }
        C0510g6[] c0510g6Arr = this.f7252e;
        int i4 = 0;
        if (c0510g6Arr != null && c0510g6Arr.length > 0) {
            int i5 = 0;
            while (true) {
                C0510g6[] c0510g6Arr2 = this.f7252e;
                if (i5 >= c0510g6Arr2.length) {
                    break;
                }
                C0510g6 c0510g6 = c0510g6Arr2[i5];
                if (c0510g6 != null) {
                    codedOutputByteBufferNano.writeMessage(5, c0510g6);
                }
                i5++;
            }
        }
        if (!this.f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f);
        }
        int i6 = this.f7253g;
        if (i6 != 0) {
            codedOutputByteBufferNano.writeInt32(7, i6);
        }
        C0433d6 c0433d6 = this.f7254h;
        if (c0433d6 != null) {
            codedOutputByteBufferNano.writeMessage(8, c0433d6);
        }
        if (!Arrays.equals(this.f7255i, o)) {
            codedOutputByteBufferNano.writeBytes(9, this.f7255i);
        }
        if (!Arrays.equals(this.f7256j, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(10, this.f7256j);
        }
        C0355a6[] c0355a6Arr = this.f7257k;
        if (c0355a6Arr != null && c0355a6Arr.length > 0) {
            while (true) {
                C0355a6[] c0355a6Arr2 = this.f7257k;
                if (i4 >= c0355a6Arr2.length) {
                    break;
                }
                C0355a6 c0355a6 = c0355a6Arr2[i4];
                if (c0355a6 != null) {
                    codedOutputByteBufferNano.writeMessage(11, c0355a6);
                }
                i4++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0458e6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0458e6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0458e6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 10:
                    if (this.f7248a == null) {
                        this.f7248a = new C0562i6();
                    }
                    codedInputByteBufferNano.readMessage(this.f7248a);
                    break;
                case 18:
                    if (this.f7249b == null) {
                        this.f7249b = new Y5();
                    }
                    codedInputByteBufferNano.readMessage(this.f7249b);
                    break;
                case C0642l9.f7781G /* 26 */:
                    this.f7250c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != -1 && readInt32 != 0 && readInt32 != 1) {
                        break;
                    } else {
                        this.f7251d = readInt32;
                        break;
                    }
                case C0642l9.f7786M /* 42 */:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                    C0510g6[] c0510g6Arr = this.f7252e;
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
                    this.f7252e = c0510g6Arr2;
                    break;
                case 50:
                    this.f = codedInputByteBufferNano.readString();
                    break;
                case 56:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != 0 && readInt322 != 1) {
                        break;
                    } else {
                        this.f7253g = readInt322;
                        break;
                    }
                case 66:
                    if (this.f7254h == null) {
                        this.f7254h = new C0433d6();
                    }
                    codedInputByteBufferNano.readMessage(this.f7254h);
                    break;
                case 74:
                    this.f7255i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    this.f7256j = codedInputByteBufferNano.readBytes();
                    break;
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                    C0355a6[] c0355a6Arr = this.f7257k;
                    int length2 = c0355a6Arr == null ? 0 : c0355a6Arr.length;
                    int i4 = repeatedFieldArrayLength2 + length2;
                    C0355a6[] c0355a6Arr2 = new C0355a6[i4];
                    if (length2 != 0) {
                        System.arraycopy(c0355a6Arr, 0, c0355a6Arr2, 0, length2);
                    }
                    while (length2 < i4 - 1) {
                        C0355a6 c0355a6 = new C0355a6();
                        c0355a6Arr2[length2] = c0355a6;
                        codedInputByteBufferNano.readMessage(c0355a6);
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    C0355a6 c0355a62 = new C0355a6();
                    c0355a6Arr2[length2] = c0355a62;
                    codedInputByteBufferNano.readMessage(c0355a62);
                    this.f7257k = c0355a6Arr2;
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }

    public static C0458e6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0458e6) MessageNano.mergeFrom(new C0458e6(), bArr);
    }
}
