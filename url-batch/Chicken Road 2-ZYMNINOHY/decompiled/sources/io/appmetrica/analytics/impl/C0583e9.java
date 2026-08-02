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

/* renamed from: io.appmetrica.analytics.impl.e9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0583e9 extends MessageNano {

    /* renamed from: A, reason: collision with root package name */
    public static final int f11741A = 17;

    /* renamed from: B, reason: collision with root package name */
    public static final int f11742B = 18;

    /* renamed from: C, reason: collision with root package name */
    public static final int f11743C = 19;

    /* renamed from: D, reason: collision with root package name */
    public static final int f11744D = 20;

    /* renamed from: E, reason: collision with root package name */
    public static final int f11745E = 21;

    /* renamed from: F, reason: collision with root package name */
    public static final int f11746F = 25;

    /* renamed from: G, reason: collision with root package name */
    public static final int f11747G = 26;

    /* renamed from: H, reason: collision with root package name */
    public static final int f11748H = 27;

    /* renamed from: I, reason: collision with root package name */
    public static final int f11749I = 29;

    /* renamed from: J, reason: collision with root package name */
    public static final int f11750J = 35;

    /* renamed from: K, reason: collision with root package name */
    public static final int f11751K = 38;
    public static final int L = 40;

    /* renamed from: M, reason: collision with root package name */
    public static final int f11752M = 42;

    /* renamed from: N, reason: collision with root package name */
    public static final int f11753N = 0;

    /* renamed from: O, reason: collision with root package name */
    public static final int f11754O = 1;

    /* renamed from: P, reason: collision with root package name */
    public static final int f11755P = 2;

    /* renamed from: Q, reason: collision with root package name */
    public static final int f11756Q = 0;

    /* renamed from: R, reason: collision with root package name */
    public static final int f11757R = 1;

    /* renamed from: S, reason: collision with root package name */
    public static final int f11758S = 2;

    /* renamed from: T, reason: collision with root package name */
    public static volatile C0583e9[] f11759T = null;

    /* renamed from: t, reason: collision with root package name */
    public static final int f11760t = 1;

    /* renamed from: u, reason: collision with root package name */
    public static final int f11761u = 2;
    public static final int v = 4;

    /* renamed from: w, reason: collision with root package name */
    public static final int f11762w = 5;

    /* renamed from: x, reason: collision with root package name */
    public static final int f11763x = 7;

    /* renamed from: y, reason: collision with root package name */
    public static final int f11764y = 13;
    public static final int z = 16;

    /* renamed from: a, reason: collision with root package name */
    public long f11765a;

    /* renamed from: b, reason: collision with root package name */
    public long f11766b;

    /* renamed from: c, reason: collision with root package name */
    public int f11767c;

    /* renamed from: d, reason: collision with root package name */
    public String f11768d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f11769e;

    /* renamed from: f, reason: collision with root package name */
    public Z8 f11770f;

    /* renamed from: g, reason: collision with root package name */
    public C0558d9 f11771g;

    /* renamed from: h, reason: collision with root package name */
    public String f11772h;

    /* renamed from: i, reason: collision with root package name */
    public int f11773i;

    /* renamed from: j, reason: collision with root package name */
    public int f11774j;

    /* renamed from: k, reason: collision with root package name */
    public int f11775k;

    /* renamed from: l, reason: collision with root package name */
    public byte[] f11776l;

    /* renamed from: m, reason: collision with root package name */
    public int f11777m;
    public long n;
    public long o;

    /* renamed from: p, reason: collision with root package name */
    public int f11778p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f11779q;

    /* renamed from: r, reason: collision with root package name */
    public long f11780r;

    /* renamed from: s, reason: collision with root package name */
    public C0532c9[] f11781s;

    public C0583e9() {
        a();
    }

    public static C0583e9[] b() {
        if (f11759T == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f11759T == null) {
                        f11759T = new C0583e9[0];
                    }
                } finally {
                }
            }
        }
        return f11759T;
    }

    public final C0583e9 a() {
        this.f11765a = 0L;
        this.f11766b = 0L;
        this.f11767c = 0;
        this.f11768d = "";
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f11769e = bArr;
        this.f11770f = null;
        this.f11771g = null;
        this.f11772h = "";
        this.f11773i = 0;
        this.f11774j = 0;
        this.f11775k = -1;
        this.f11776l = bArr;
        this.f11777m = -1;
        this.n = 0L;
        this.o = 0L;
        this.f11778p = 0;
        this.f11779q = false;
        this.f11780r = 1L;
        this.f11781s = C0532c9.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeUInt32Size = CodedOutputByteBufferNano.computeUInt32Size(3, this.f11767c) + CodedOutputByteBufferNano.computeUInt64Size(2, this.f11766b) + CodedOutputByteBufferNano.computeUInt64Size(1, this.f11765a) + super.computeSerializedSize();
        if (!this.f11768d.equals("")) {
            computeUInt32Size += CodedOutputByteBufferNano.computeStringSize(4, this.f11768d);
        }
        byte[] bArr = this.f11769e;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeUInt32Size += CodedOutputByteBufferNano.computeBytesSize(5, this.f11769e);
        }
        Z8 z8 = this.f11770f;
        if (z8 != null) {
            computeUInt32Size += CodedOutputByteBufferNano.computeMessageSize(6, z8);
        }
        C0558d9 c0558d9 = this.f11771g;
        if (c0558d9 != null) {
            computeUInt32Size += CodedOutputByteBufferNano.computeMessageSize(7, c0558d9);
        }
        if (!this.f11772h.equals("")) {
            computeUInt32Size += CodedOutputByteBufferNano.computeStringSize(8, this.f11772h);
        }
        int i4 = this.f11773i;
        if (i4 != 0) {
            computeUInt32Size += CodedOutputByteBufferNano.computeUInt32Size(10, i4);
        }
        int i5 = this.f11774j;
        if (i5 != 0) {
            computeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(12, i5);
        }
        int i6 = this.f11775k;
        if (i6 != -1) {
            computeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(13, i6);
        }
        if (!Arrays.equals(this.f11776l, bArr2)) {
            computeUInt32Size += CodedOutputByteBufferNano.computeBytesSize(14, this.f11776l);
        }
        int i7 = this.f11777m;
        if (i7 != -1) {
            computeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(15, i7);
        }
        long j4 = this.n;
        if (j4 != 0) {
            computeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(16, j4);
        }
        long j5 = this.o;
        if (j5 != 0) {
            computeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(17, j5);
        }
        int i8 = this.f11778p;
        if (i8 != 0) {
            computeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(22, i8);
        }
        boolean z4 = this.f11779q;
        if (z4) {
            computeUInt32Size += CodedOutputByteBufferNano.computeBoolSize(23, z4);
        }
        long j6 = this.f11780r;
        if (j6 != 1) {
            computeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(24, j6);
        }
        C0532c9[] c0532c9Arr = this.f11781s;
        if (c0532c9Arr != null && c0532c9Arr.length > 0) {
            int i9 = 0;
            while (true) {
                C0532c9[] c0532c9Arr2 = this.f11781s;
                if (i9 >= c0532c9Arr2.length) {
                    break;
                }
                C0532c9 c0532c9 = c0532c9Arr2[i9];
                if (c0532c9 != null) {
                    computeUInt32Size = CodedOutputByteBufferNano.computeMessageSize(25, c0532c9) + computeUInt32Size;
                }
                i9++;
            }
        }
        return computeUInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeUInt64(1, this.f11765a);
        codedOutputByteBufferNano.writeUInt64(2, this.f11766b);
        codedOutputByteBufferNano.writeUInt32(3, this.f11767c);
        if (!this.f11768d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f11768d);
        }
        byte[] bArr = this.f11769e;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f11769e);
        }
        Z8 z8 = this.f11770f;
        if (z8 != null) {
            codedOutputByteBufferNano.writeMessage(6, z8);
        }
        C0558d9 c0558d9 = this.f11771g;
        if (c0558d9 != null) {
            codedOutputByteBufferNano.writeMessage(7, c0558d9);
        }
        if (!this.f11772h.equals("")) {
            codedOutputByteBufferNano.writeString(8, this.f11772h);
        }
        int i4 = this.f11773i;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeUInt32(10, i4);
        }
        int i5 = this.f11774j;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeInt32(12, i5);
        }
        int i6 = this.f11775k;
        if (i6 != -1) {
            codedOutputByteBufferNano.writeInt32(13, i6);
        }
        if (!Arrays.equals(this.f11776l, bArr2)) {
            codedOutputByteBufferNano.writeBytes(14, this.f11776l);
        }
        int i7 = this.f11777m;
        if (i7 != -1) {
            codedOutputByteBufferNano.writeInt32(15, i7);
        }
        long j4 = this.n;
        if (j4 != 0) {
            codedOutputByteBufferNano.writeUInt64(16, j4);
        }
        long j5 = this.o;
        if (j5 != 0) {
            codedOutputByteBufferNano.writeUInt64(17, j5);
        }
        int i8 = this.f11778p;
        if (i8 != 0) {
            codedOutputByteBufferNano.writeInt32(22, i8);
        }
        boolean z4 = this.f11779q;
        if (z4) {
            codedOutputByteBufferNano.writeBool(23, z4);
        }
        long j6 = this.f11780r;
        if (j6 != 1) {
            codedOutputByteBufferNano.writeUInt64(24, j6);
        }
        C0532c9[] c0532c9Arr = this.f11781s;
        if (c0532c9Arr != null && c0532c9Arr.length > 0) {
            int i9 = 0;
            while (true) {
                C0532c9[] c0532c9Arr2 = this.f11781s;
                if (i9 >= c0532c9Arr2.length) {
                    break;
                }
                C0532c9 c0532c9 = c0532c9Arr2[i9];
                if (c0532c9 != null) {
                    codedOutputByteBufferNano.writeMessage(25, c0532c9);
                }
                i9++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0583e9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0583e9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0583e9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 8:
                    this.f11765a = codedInputByteBufferNano.readUInt64();
                    break;
                case 16:
                    this.f11766b = codedInputByteBufferNano.readUInt64();
                    break;
                case 24:
                    this.f11767c = codedInputByteBufferNano.readUInt32();
                    break;
                case Build.API_LEVELS.API_34 /* 34 */:
                    this.f11768d = codedInputByteBufferNano.readString();
                    break;
                case f11752M /* 42 */:
                    this.f11769e = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    if (this.f11770f == null) {
                        this.f11770f = new Z8();
                    }
                    codedInputByteBufferNano.readMessage(this.f11770f);
                    break;
                case 58:
                    if (this.f11771g == null) {
                        this.f11771g = new C0558d9();
                    }
                    codedInputByteBufferNano.readMessage(this.f11771g);
                    break;
                case 66:
                    this.f11772h = codedInputByteBufferNano.readString();
                    break;
                case 80:
                    this.f11773i = codedInputByteBufferNano.readUInt32();
                    break;
                case 96:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != 0 && readInt32 != 1 && readInt32 != 2) {
                        break;
                    } else {
                        this.f11774j = readInt32;
                        break;
                    }
                case 104:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != -1 && readInt322 != 0 && readInt322 != 1) {
                        break;
                    } else {
                        this.f11775k = readInt322;
                        break;
                    }
                case 114:
                    this.f11776l = codedInputByteBufferNano.readBytes();
                    break;
                case 120:
                    int readInt323 = codedInputByteBufferNano.readInt32();
                    if (readInt323 != -1 && readInt323 != 0 && readInt323 != 1) {
                        break;
                    } else {
                        this.f11777m = readInt323;
                        break;
                    }
                case 128:
                    this.n = codedInputByteBufferNano.readUInt64();
                    break;
                case 136:
                    this.o = codedInputByteBufferNano.readUInt64();
                    break;
                case 176:
                    int readInt324 = codedInputByteBufferNano.readInt32();
                    if (readInt324 != 0 && readInt324 != 1 && readInt324 != 2) {
                        break;
                    } else {
                        this.f11778p = readInt324;
                        break;
                    }
                case 184:
                    this.f11779q = codedInputByteBufferNano.readBool();
                    break;
                case 192:
                    this.f11780r = codedInputByteBufferNano.readUInt64();
                    break;
                case 202:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 202);
                    C0532c9[] c0532c9Arr = this.f11781s;
                    int length = c0532c9Arr == null ? 0 : c0532c9Arr.length;
                    int i4 = repeatedFieldArrayLength + length;
                    C0532c9[] c0532c9Arr2 = new C0532c9[i4];
                    if (length != 0) {
                        System.arraycopy(c0532c9Arr, 0, c0532c9Arr2, 0, length);
                    }
                    while (length < i4 - 1) {
                        C0532c9 c0532c9 = new C0532c9();
                        c0532c9Arr2[length] = c0532c9;
                        codedInputByteBufferNano.readMessage(c0532c9);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C0532c9 c0532c92 = new C0532c9();
                    c0532c9Arr2[length] = c0532c92;
                    codedInputByteBufferNano.readMessage(c0532c92);
                    this.f11781s = c0532c9Arr2;
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

    public static C0583e9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0583e9) MessageNano.mergeFrom(new C0583e9(), bArr);
    }
}
