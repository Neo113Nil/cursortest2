package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.c6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0558c6 extends MessageNano {

    /* renamed from: k, reason: collision with root package name */
    public static final int f7972k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static final int f7973l = 1;

    /* renamed from: m, reason: collision with root package name */
    public static volatile C0558c6[] f7974m;

    /* renamed from: n, reason: collision with root package name */
    public static byte[] f7975n;

    /* renamed from: o, reason: collision with root package name */
    public static volatile boolean f7976o;

    /* renamed from: a, reason: collision with root package name */
    public C0713i6 f7977a;

    /* renamed from: b, reason: collision with root package name */
    public Y5 f7978b;

    /* renamed from: c, reason: collision with root package name */
    public String f7979c;

    /* renamed from: d, reason: collision with root package name */
    public int f7980d;

    /* renamed from: e, reason: collision with root package name */
    public C0661g6[] f7981e;

    /* renamed from: f, reason: collision with root package name */
    public int f7982f;

    /* renamed from: g, reason: collision with root package name */
    public C0532b6 f7983g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f7984h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f7985i;

    /* renamed from: j, reason: collision with root package name */
    public C0506a6[] f7986j;

    public C0558c6() {
        if (!f7976o) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!f7976o) {
                        f7975n = InternalNano.bytesDefaultValue("JVM");
                        f7976o = true;
                    }
                } finally {
                }
            }
        }
        a();
    }

    public static C0558c6[] b() {
        if (f7974m == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7974m == null) {
                        f7974m = new C0558c6[0];
                    }
                } finally {
                }
            }
        }
        return f7974m;
    }

    public final C0558c6 a() {
        this.f7977a = null;
        this.f7978b = null;
        this.f7979c = "";
        this.f7980d = -1;
        this.f7981e = C0661g6.b();
        this.f7982f = 0;
        this.f7983g = null;
        this.f7984h = (byte[]) f7975n.clone();
        this.f7985i = WireFormatNano.EMPTY_BYTES;
        this.f7986j = C0506a6.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0713i6 c0713i6 = this.f7977a;
        if (c0713i6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0713i6);
        }
        Y5 y5 = this.f7978b;
        if (y5 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, y5);
        }
        if (!this.f7979c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f7979c);
        }
        int i2 = this.f7980d;
        if (i2 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i2);
        }
        C0661g6[] c0661g6Arr = this.f7981e;
        int i3 = 0;
        if (c0661g6Arr != null && c0661g6Arr.length > 0) {
            int i6 = 0;
            while (true) {
                C0661g6[] c0661g6Arr2 = this.f7981e;
                if (i6 >= c0661g6Arr2.length) {
                    break;
                }
                C0661g6 c0661g6 = c0661g6Arr2[i6];
                if (c0661g6 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(5, c0661g6) + computeSerializedSize;
                }
                i6++;
            }
        }
        int i7 = this.f7982f;
        if (i7 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, i7);
        }
        C0532b6 c0532b6 = this.f7983g;
        if (c0532b6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(7, c0532b6);
        }
        if (!Arrays.equals(this.f7984h, f7975n)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(8, this.f7984h);
        }
        if (!Arrays.equals(this.f7985i, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f7985i);
        }
        C0506a6[] c0506a6Arr = this.f7986j;
        if (c0506a6Arr != null && c0506a6Arr.length > 0) {
            while (true) {
                C0506a6[] c0506a6Arr2 = this.f7986j;
                if (i3 >= c0506a6Arr2.length) {
                    break;
                }
                C0506a6 c0506a6 = c0506a6Arr2[i3];
                if (c0506a6 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(10, c0506a6) + computeSerializedSize;
                }
                i3++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C0713i6 c0713i6 = this.f7977a;
        if (c0713i6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0713i6);
        }
        Y5 y5 = this.f7978b;
        if (y5 != null) {
            codedOutputByteBufferNano.writeMessage(2, y5);
        }
        if (!this.f7979c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f7979c);
        }
        int i2 = this.f7980d;
        if (i2 != -1) {
            codedOutputByteBufferNano.writeInt32(4, i2);
        }
        C0661g6[] c0661g6Arr = this.f7981e;
        int i3 = 0;
        if (c0661g6Arr != null && c0661g6Arr.length > 0) {
            int i6 = 0;
            while (true) {
                C0661g6[] c0661g6Arr2 = this.f7981e;
                if (i6 >= c0661g6Arr2.length) {
                    break;
                }
                C0661g6 c0661g6 = c0661g6Arr2[i6];
                if (c0661g6 != null) {
                    codedOutputByteBufferNano.writeMessage(5, c0661g6);
                }
                i6++;
            }
        }
        int i7 = this.f7982f;
        if (i7 != 0) {
            codedOutputByteBufferNano.writeInt32(6, i7);
        }
        C0532b6 c0532b6 = this.f7983g;
        if (c0532b6 != null) {
            codedOutputByteBufferNano.writeMessage(7, c0532b6);
        }
        if (!Arrays.equals(this.f7984h, f7975n)) {
            codedOutputByteBufferNano.writeBytes(8, this.f7984h);
        }
        if (!Arrays.equals(this.f7985i, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(9, this.f7985i);
        }
        C0506a6[] c0506a6Arr = this.f7986j;
        if (c0506a6Arr != null && c0506a6Arr.length > 0) {
            while (true) {
                C0506a6[] c0506a6Arr2 = this.f7986j;
                if (i3 >= c0506a6Arr2.length) {
                    break;
                }
                C0506a6 c0506a6 = c0506a6Arr2[i3];
                if (c0506a6 != null) {
                    codedOutputByteBufferNano.writeMessage(10, c0506a6);
                }
                i3++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0558c6 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0558c6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0558c6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 10:
                    if (this.f7977a == null) {
                        this.f7977a = new C0713i6();
                    }
                    codedInputByteBufferNano.readMessage(this.f7977a);
                    break;
                case 18:
                    if (this.f7978b == null) {
                        this.f7978b = new Y5();
                    }
                    codedInputByteBufferNano.readMessage(this.f7978b);
                    break;
                case 26:
                    this.f7979c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != -1 && readInt32 != 0 && readInt32 != 1) {
                        break;
                    } else {
                        this.f7980d = readInt32;
                        break;
                    }
                case C0793l9.f8691M /* 42 */:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                    C0661g6[] c0661g6Arr = this.f7981e;
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
                    this.f7981e = c0661g6Arr2;
                    break;
                case 48:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != 0 && readInt322 != 1) {
                        break;
                    } else {
                        this.f7982f = readInt322;
                        break;
                    }
                case 58:
                    if (this.f7983g == null) {
                        this.f7983g = new C0532b6();
                    }
                    codedInputByteBufferNano.readMessage(this.f7983g);
                    break;
                case 66:
                    this.f7984h = codedInputByteBufferNano.readBytes();
                    break;
                case 74:
                    this.f7985i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                    C0506a6[] c0506a6Arr = this.f7986j;
                    int length2 = c0506a6Arr == null ? 0 : c0506a6Arr.length;
                    int i3 = repeatedFieldArrayLength2 + length2;
                    C0506a6[] c0506a6Arr2 = new C0506a6[i3];
                    if (length2 != 0) {
                        System.arraycopy(c0506a6Arr, 0, c0506a6Arr2, 0, length2);
                    }
                    while (length2 < i3 - 1) {
                        C0506a6 c0506a6 = new C0506a6();
                        c0506a6Arr2[length2] = c0506a6;
                        codedInputByteBufferNano.readMessage(c0506a6);
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    C0506a6 c0506a62 = new C0506a6();
                    c0506a6Arr2[length2] = c0506a62;
                    codedInputByteBufferNano.readMessage(c0506a62);
                    this.f7986j = c0506a6Arr2;
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        return this;
                    }
                    break;
            }
        }
    }

    public static C0558c6 a(byte[] bArr) {
        return (C0558c6) MessageNano.mergeFrom(new C0558c6(), bArr);
    }
}
