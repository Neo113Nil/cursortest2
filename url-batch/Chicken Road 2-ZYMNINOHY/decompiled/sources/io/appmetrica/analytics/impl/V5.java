package io.appmetrica.analytics.impl;

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
public final class V5 extends MessageNano {

    /* renamed from: k, reason: collision with root package name */
    public static final int f11096k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static final int f11097l = 1;

    /* renamed from: m, reason: collision with root package name */
    public static volatile V5[] f11098m;
    public static byte[] n;
    public static volatile boolean o;

    /* renamed from: a, reason: collision with root package name */
    public C0503b6 f11099a;

    /* renamed from: b, reason: collision with root package name */
    public R5 f11100b;

    /* renamed from: c, reason: collision with root package name */
    public String f11101c;

    /* renamed from: d, reason: collision with root package name */
    public int f11102d;

    /* renamed from: e, reason: collision with root package name */
    public Z5[] f11103e;

    /* renamed from: f, reason: collision with root package name */
    public int f11104f;

    /* renamed from: g, reason: collision with root package name */
    public U5 f11105g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f11106h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f11107i;

    /* renamed from: j, reason: collision with root package name */
    public T5[] f11108j;

    public V5() {
        if (!o) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!o) {
                        n = InternalNano.bytesDefaultValue("JVM");
                        o = true;
                    }
                } finally {
                }
            }
        }
        a();
    }

    public static V5[] b() {
        if (f11098m == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f11098m == null) {
                        f11098m = new V5[0];
                    }
                } finally {
                }
            }
        }
        return f11098m;
    }

    public final V5 a() {
        this.f11099a = null;
        this.f11100b = null;
        this.f11101c = "";
        this.f11102d = -1;
        this.f11103e = Z5.b();
        this.f11104f = 0;
        this.f11105g = null;
        this.f11106h = (byte[]) n.clone();
        this.f11107i = WireFormatNano.EMPTY_BYTES;
        this.f11108j = T5.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0503b6 c0503b6 = this.f11099a;
        if (c0503b6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0503b6);
        }
        R5 r5 = this.f11100b;
        if (r5 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, r5);
        }
        if (!this.f11101c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f11101c);
        }
        int i4 = this.f11102d;
        if (i4 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i4);
        }
        Z5[] z5Arr = this.f11103e;
        int i5 = 0;
        if (z5Arr != null && z5Arr.length > 0) {
            int i6 = 0;
            while (true) {
                Z5[] z5Arr2 = this.f11103e;
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
        int i7 = this.f11104f;
        if (i7 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, i7);
        }
        U5 u5 = this.f11105g;
        if (u5 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(7, u5);
        }
        if (!Arrays.equals(this.f11106h, n)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(8, this.f11106h);
        }
        if (!Arrays.equals(this.f11107i, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f11107i);
        }
        T5[] t5Arr = this.f11108j;
        if (t5Arr != null && t5Arr.length > 0) {
            while (true) {
                T5[] t5Arr2 = this.f11108j;
                if (i5 >= t5Arr2.length) {
                    break;
                }
                T5 t5 = t5Arr2[i5];
                if (t5 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(10, t5) + computeSerializedSize;
                }
                i5++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0503b6 c0503b6 = this.f11099a;
        if (c0503b6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0503b6);
        }
        R5 r5 = this.f11100b;
        if (r5 != null) {
            codedOutputByteBufferNano.writeMessage(2, r5);
        }
        if (!this.f11101c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f11101c);
        }
        int i4 = this.f11102d;
        if (i4 != -1) {
            codedOutputByteBufferNano.writeInt32(4, i4);
        }
        Z5[] z5Arr = this.f11103e;
        int i5 = 0;
        if (z5Arr != null && z5Arr.length > 0) {
            int i6 = 0;
            while (true) {
                Z5[] z5Arr2 = this.f11103e;
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
        int i7 = this.f11104f;
        if (i7 != 0) {
            codedOutputByteBufferNano.writeInt32(6, i7);
        }
        U5 u5 = this.f11105g;
        if (u5 != null) {
            codedOutputByteBufferNano.writeMessage(7, u5);
        }
        if (!Arrays.equals(this.f11106h, n)) {
            codedOutputByteBufferNano.writeBytes(8, this.f11106h);
        }
        if (!Arrays.equals(this.f11107i, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(9, this.f11107i);
        }
        T5[] t5Arr = this.f11108j;
        if (t5Arr != null && t5Arr.length > 0) {
            while (true) {
                T5[] t5Arr2 = this.f11108j;
                if (i5 >= t5Arr2.length) {
                    break;
                }
                T5 t5 = t5Arr2[i5];
                if (t5 != null) {
                    codedOutputByteBufferNano.writeMessage(10, t5);
                }
                i5++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static V5 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new V5().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final V5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 10:
                    if (this.f11099a == null) {
                        this.f11099a = new C0503b6();
                    }
                    codedInputByteBufferNano.readMessage(this.f11099a);
                    break;
                case 18:
                    if (this.f11100b == null) {
                        this.f11100b = new R5();
                    }
                    codedInputByteBufferNano.readMessage(this.f11100b);
                    break;
                case 26:
                    this.f11101c = codedInputByteBufferNano.readString();
                    break;
                case Build.API_LEVELS.API_32 /* 32 */:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != -1 && readInt32 != 0 && readInt32 != 1) {
                        break;
                    } else {
                        this.f11102d = readInt32;
                        break;
                    }
                case C0583e9.f11752M /* 42 */:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                    Z5[] z5Arr = this.f11103e;
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
                    this.f11103e = z5Arr2;
                    break;
                case 48:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != 0 && readInt322 != 1) {
                        break;
                    } else {
                        this.f11104f = readInt322;
                        break;
                    }
                case 58:
                    if (this.f11105g == null) {
                        this.f11105g = new U5();
                    }
                    codedInputByteBufferNano.readMessage(this.f11105g);
                    break;
                case 66:
                    this.f11106h = codedInputByteBufferNano.readBytes();
                    break;
                case 74:
                    this.f11107i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                    T5[] t5Arr = this.f11108j;
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
                    this.f11108j = t5Arr2;
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

    public static V5 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (V5) MessageNano.mergeFrom(new V5(), bArr);
    }
}
