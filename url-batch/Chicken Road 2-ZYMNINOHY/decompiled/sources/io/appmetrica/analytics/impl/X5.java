package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import io.flutter.Build;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class X5 extends MessageNano {

    /* renamed from: l, reason: collision with root package name */
    public static final int f11241l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f11242m = 1;
    public static volatile X5[] n;
    public static byte[] o;

    /* renamed from: p, reason: collision with root package name */
    public static volatile boolean f11243p;

    /* renamed from: a, reason: collision with root package name */
    public C0503b6 f11244a;

    /* renamed from: b, reason: collision with root package name */
    public R5 f11245b;

    /* renamed from: c, reason: collision with root package name */
    public String f11246c;

    /* renamed from: d, reason: collision with root package name */
    public int f11247d;

    /* renamed from: e, reason: collision with root package name */
    public Z5[] f11248e;

    /* renamed from: f, reason: collision with root package name */
    public String f11249f;

    /* renamed from: g, reason: collision with root package name */
    public int f11250g;

    /* renamed from: h, reason: collision with root package name */
    public W5 f11251h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f11252i;

    /* renamed from: j, reason: collision with root package name */
    public byte[] f11253j;

    /* renamed from: k, reason: collision with root package name */
    public T5[] f11254k;

    public X5() {
        if (!f11243p) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!f11243p) {
                        o = InternalNano.bytesDefaultValue("JVM");
                        f11243p = true;
                    }
                } finally {
                }
            }
        }
        a();
    }

    public static X5[] b() {
        if (n == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (n == null) {
                        n = new X5[0];
                    }
                } finally {
                }
            }
        }
        return n;
    }

    public final X5 a() {
        this.f11244a = null;
        this.f11245b = null;
        this.f11246c = "";
        this.f11247d = -1;
        this.f11248e = Z5.b();
        this.f11249f = "";
        this.f11250g = 0;
        this.f11251h = null;
        this.f11252i = (byte[]) o.clone();
        this.f11253j = WireFormatNano.EMPTY_BYTES;
        this.f11254k = T5.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0503b6 c0503b6 = this.f11244a;
        if (c0503b6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0503b6);
        }
        R5 r5 = this.f11245b;
        if (r5 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, r5);
        }
        if (!this.f11246c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f11246c);
        }
        int i4 = this.f11247d;
        if (i4 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i4);
        }
        Z5[] z5Arr = this.f11248e;
        int i5 = 0;
        if (z5Arr != null && z5Arr.length > 0) {
            int i6 = 0;
            while (true) {
                Z5[] z5Arr2 = this.f11248e;
                if (i6 >= z5Arr2.length) {
                    break;
                }
                Z5 z5 = z5Arr2[i6];
                if (z5 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(5, z5) + computeSerializedSize;
                }
                i6++;
            }
        }
        if (!this.f11249f.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.f11249f);
        }
        int i7 = this.f11250g;
        if (i7 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(7, i7);
        }
        W5 w5 = this.f11251h;
        if (w5 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(8, w5);
        }
        if (!Arrays.equals(this.f11252i, o)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f11252i);
        }
        if (!Arrays.equals(this.f11253j, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(10, this.f11253j);
        }
        T5[] t5Arr = this.f11254k;
        if (t5Arr != null && t5Arr.length > 0) {
            while (true) {
                T5[] t5Arr2 = this.f11254k;
                if (i5 >= t5Arr2.length) {
                    break;
                }
                T5 t5 = t5Arr2[i5];
                if (t5 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(11, t5) + computeSerializedSize;
                }
                i5++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0503b6 c0503b6 = this.f11244a;
        if (c0503b6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0503b6);
        }
        R5 r5 = this.f11245b;
        if (r5 != null) {
            codedOutputByteBufferNano.writeMessage(2, r5);
        }
        if (!this.f11246c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f11246c);
        }
        int i4 = this.f11247d;
        if (i4 != -1) {
            codedOutputByteBufferNano.writeInt32(4, i4);
        }
        Z5[] z5Arr = this.f11248e;
        int i5 = 0;
        if (z5Arr != null && z5Arr.length > 0) {
            int i6 = 0;
            while (true) {
                Z5[] z5Arr2 = this.f11248e;
                if (i6 >= z5Arr2.length) {
                    break;
                }
                Z5 z5 = z5Arr2[i6];
                if (z5 != null) {
                    codedOutputByteBufferNano.writeMessage(5, z5);
                }
                i6++;
            }
        }
        if (!this.f11249f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f11249f);
        }
        int i7 = this.f11250g;
        if (i7 != 0) {
            codedOutputByteBufferNano.writeInt32(7, i7);
        }
        W5 w5 = this.f11251h;
        if (w5 != null) {
            codedOutputByteBufferNano.writeMessage(8, w5);
        }
        if (!Arrays.equals(this.f11252i, o)) {
            codedOutputByteBufferNano.writeBytes(9, this.f11252i);
        }
        if (!Arrays.equals(this.f11253j, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(10, this.f11253j);
        }
        T5[] t5Arr = this.f11254k;
        if (t5Arr != null && t5Arr.length > 0) {
            while (true) {
                T5[] t5Arr2 = this.f11254k;
                if (i5 >= t5Arr2.length) {
                    break;
                }
                T5 t5 = t5Arr2[i5];
                if (t5 != null) {
                    codedOutputByteBufferNano.writeMessage(11, t5);
                }
                i5++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static X5 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new X5().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final X5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 10:
                    if (this.f11244a == null) {
                        this.f11244a = new C0503b6();
                    }
                    codedInputByteBufferNano.readMessage(this.f11244a);
                    break;
                case 18:
                    if (this.f11245b == null) {
                        this.f11245b = new R5();
                    }
                    codedInputByteBufferNano.readMessage(this.f11245b);
                    break;
                case 26:
                    this.f11246c = codedInputByteBufferNano.readString();
                    break;
                case Build.API_LEVELS.API_32 /* 32 */:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != -1 && readInt32 != 0 && readInt32 != 1) {
                        break;
                    } else {
                        this.f11247d = readInt32;
                        break;
                    }
                case C0583e9.f11752M /* 42 */:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                    Z5[] z5Arr = this.f11248e;
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
                    this.f11248e = z5Arr2;
                    break;
                case 50:
                    this.f11249f = codedInputByteBufferNano.readString();
                    break;
                case 56:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != 0 && readInt322 != 1) {
                        break;
                    } else {
                        this.f11250g = readInt322;
                        break;
                    }
                case 66:
                    if (this.f11251h == null) {
                        this.f11251h = new W5();
                    }
                    codedInputByteBufferNano.readMessage(this.f11251h);
                    break;
                case 74:
                    this.f11252i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    this.f11253j = codedInputByteBufferNano.readBytes();
                    break;
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                    T5[] t5Arr = this.f11254k;
                    int length2 = t5Arr == null ? 0 : t5Arr.length;
                    int i5 = repeatedFieldArrayLength2 + length2;
                    T5[] t5Arr2 = new T5[i5];
                    if (length2 != 0) {
                        System.arraycopy(t5Arr, 0, t5Arr2, 0, length2);
                    }
                    while (length2 < i5 - 1) {
                        T5 t5 = new T5();
                        t5Arr2[length2] = t5;
                        codedInputByteBufferNano.readMessage(t5);
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    T5 t52 = new T5();
                    t5Arr2[length2] = t52;
                    codedInputByteBufferNano.readMessage(t52);
                    this.f11254k = t5Arr2;
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

    public static X5 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (X5) MessageNano.mergeFrom(new X5(), bArr);
    }
}
