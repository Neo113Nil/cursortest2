package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.l9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0642l9 extends MessageNano {

    /* renamed from: A, reason: collision with root package name */
    public static final int f7775A = 17;

    /* renamed from: B, reason: collision with root package name */
    public static final int f7776B = 18;

    /* renamed from: C, reason: collision with root package name */
    public static final int f7777C = 19;

    /* renamed from: D, reason: collision with root package name */
    public static final int f7778D = 20;

    /* renamed from: E, reason: collision with root package name */
    public static final int f7779E = 21;

    /* renamed from: F, reason: collision with root package name */
    public static final int f7780F = 25;

    /* renamed from: G, reason: collision with root package name */
    public static final int f7781G = 26;

    /* renamed from: H, reason: collision with root package name */
    public static final int f7782H = 27;

    /* renamed from: I, reason: collision with root package name */
    public static final int f7783I = 29;

    /* renamed from: J, reason: collision with root package name */
    public static final int f7784J = 35;

    /* renamed from: K, reason: collision with root package name */
    public static final int f7785K = 38;
    public static final int L = 40;

    /* renamed from: M, reason: collision with root package name */
    public static final int f7786M = 42;

    /* renamed from: N, reason: collision with root package name */
    public static final int f7787N = 0;

    /* renamed from: O, reason: collision with root package name */
    public static final int f7788O = 1;

    /* renamed from: P, reason: collision with root package name */
    public static final int f7789P = 2;

    /* renamed from: Q, reason: collision with root package name */
    public static final int f7790Q = 0;

    /* renamed from: R, reason: collision with root package name */
    public static final int f7791R = 1;

    /* renamed from: S, reason: collision with root package name */
    public static final int f7792S = 2;

    /* renamed from: T, reason: collision with root package name */
    public static volatile C0642l9[] f7793T = null;

    /* renamed from: t, reason: collision with root package name */
    public static final int f7794t = 1;

    /* renamed from: u, reason: collision with root package name */
    public static final int f7795u = 2;
    public static final int v = 4;

    /* renamed from: w, reason: collision with root package name */
    public static final int f7796w = 5;

    /* renamed from: x, reason: collision with root package name */
    public static final int f7797x = 7;

    /* renamed from: y, reason: collision with root package name */
    public static final int f7798y = 13;
    public static final int z = 16;

    /* renamed from: a, reason: collision with root package name */
    public long f7799a;

    /* renamed from: b, reason: collision with root package name */
    public long f7800b;

    /* renamed from: c, reason: collision with root package name */
    public int f7801c;

    /* renamed from: d, reason: collision with root package name */
    public String f7802d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f7803e;
    public C0513g9 f;

    /* renamed from: g, reason: collision with root package name */
    public C0616k9 f7804g;

    /* renamed from: h, reason: collision with root package name */
    public String f7805h;

    /* renamed from: i, reason: collision with root package name */
    public int f7806i;

    /* renamed from: j, reason: collision with root package name */
    public int f7807j;

    /* renamed from: k, reason: collision with root package name */
    public int f7808k;

    /* renamed from: l, reason: collision with root package name */
    public byte[] f7809l;

    /* renamed from: m, reason: collision with root package name */
    public int f7810m;

    /* renamed from: n, reason: collision with root package name */
    public long f7811n;
    public long o;

    /* renamed from: p, reason: collision with root package name */
    public int f7812p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f7813q;

    /* renamed from: r, reason: collision with root package name */
    public long f7814r;

    /* renamed from: s, reason: collision with root package name */
    public C0590j9[] f7815s;

    public C0642l9() {
        a();
    }

    public static C0642l9[] b() {
        if (f7793T == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7793T == null) {
                        f7793T = new C0642l9[0];
                    }
                } finally {
                }
            }
        }
        return f7793T;
    }

    public final C0642l9 a() {
        this.f7799a = 0L;
        this.f7800b = 0L;
        this.f7801c = 0;
        this.f7802d = "";
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f7803e = bArr;
        this.f = null;
        this.f7804g = null;
        this.f7805h = "";
        this.f7806i = 0;
        this.f7807j = 0;
        this.f7808k = -1;
        this.f7809l = bArr;
        this.f7810m = -1;
        this.f7811n = 0L;
        this.o = 0L;
        this.f7812p = 0;
        this.f7813q = false;
        this.f7814r = 1L;
        this.f7815s = C0590j9.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeUInt32Size = CodedOutputByteBufferNano.computeUInt32Size(3, this.f7801c) + CodedOutputByteBufferNano.computeUInt64Size(2, this.f7800b) + CodedOutputByteBufferNano.computeUInt64Size(1, this.f7799a) + super.computeSerializedSize();
        if (!this.f7802d.equals("")) {
            computeUInt32Size += CodedOutputByteBufferNano.computeStringSize(4, this.f7802d);
        }
        byte[] bArr = this.f7803e;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeUInt32Size += CodedOutputByteBufferNano.computeBytesSize(5, this.f7803e);
        }
        C0513g9 c0513g9 = this.f;
        if (c0513g9 != null) {
            computeUInt32Size += CodedOutputByteBufferNano.computeMessageSize(6, c0513g9);
        }
        C0616k9 c0616k9 = this.f7804g;
        if (c0616k9 != null) {
            computeUInt32Size += CodedOutputByteBufferNano.computeMessageSize(7, c0616k9);
        }
        if (!this.f7805h.equals("")) {
            computeUInt32Size += CodedOutputByteBufferNano.computeStringSize(8, this.f7805h);
        }
        int i3 = this.f7806i;
        if (i3 != 0) {
            computeUInt32Size += CodedOutputByteBufferNano.computeUInt32Size(10, i3);
        }
        int i4 = this.f7807j;
        if (i4 != 0) {
            computeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(12, i4);
        }
        int i5 = this.f7808k;
        if (i5 != -1) {
            computeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(13, i5);
        }
        if (!Arrays.equals(this.f7809l, bArr2)) {
            computeUInt32Size += CodedOutputByteBufferNano.computeBytesSize(14, this.f7809l);
        }
        int i6 = this.f7810m;
        if (i6 != -1) {
            computeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(15, i6);
        }
        long j3 = this.f7811n;
        if (j3 != 0) {
            computeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(16, j3);
        }
        long j4 = this.o;
        if (j4 != 0) {
            computeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(17, j4);
        }
        int i7 = this.f7812p;
        if (i7 != 0) {
            computeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(22, i7);
        }
        boolean z2 = this.f7813q;
        if (z2) {
            computeUInt32Size += CodedOutputByteBufferNano.computeBoolSize(23, z2);
        }
        long j5 = this.f7814r;
        if (j5 != 1) {
            computeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(24, j5);
        }
        C0590j9[] c0590j9Arr = this.f7815s;
        if (c0590j9Arr != null && c0590j9Arr.length > 0) {
            int i8 = 0;
            while (true) {
                C0590j9[] c0590j9Arr2 = this.f7815s;
                if (i8 >= c0590j9Arr2.length) {
                    break;
                }
                C0590j9 c0590j9 = c0590j9Arr2[i8];
                if (c0590j9 != null) {
                    computeUInt32Size = CodedOutputByteBufferNano.computeMessageSize(25, c0590j9) + computeUInt32Size;
                }
                i8++;
            }
        }
        return computeUInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeUInt64(1, this.f7799a);
        codedOutputByteBufferNano.writeUInt64(2, this.f7800b);
        codedOutputByteBufferNano.writeUInt32(3, this.f7801c);
        if (!this.f7802d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f7802d);
        }
        byte[] bArr = this.f7803e;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f7803e);
        }
        C0513g9 c0513g9 = this.f;
        if (c0513g9 != null) {
            codedOutputByteBufferNano.writeMessage(6, c0513g9);
        }
        C0616k9 c0616k9 = this.f7804g;
        if (c0616k9 != null) {
            codedOutputByteBufferNano.writeMessage(7, c0616k9);
        }
        if (!this.f7805h.equals("")) {
            codedOutputByteBufferNano.writeString(8, this.f7805h);
        }
        int i3 = this.f7806i;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeUInt32(10, i3);
        }
        int i4 = this.f7807j;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeInt32(12, i4);
        }
        int i5 = this.f7808k;
        if (i5 != -1) {
            codedOutputByteBufferNano.writeInt32(13, i5);
        }
        if (!Arrays.equals(this.f7809l, bArr2)) {
            codedOutputByteBufferNano.writeBytes(14, this.f7809l);
        }
        int i6 = this.f7810m;
        if (i6 != -1) {
            codedOutputByteBufferNano.writeInt32(15, i6);
        }
        long j3 = this.f7811n;
        if (j3 != 0) {
            codedOutputByteBufferNano.writeUInt64(16, j3);
        }
        long j4 = this.o;
        if (j4 != 0) {
            codedOutputByteBufferNano.writeUInt64(17, j4);
        }
        int i7 = this.f7812p;
        if (i7 != 0) {
            codedOutputByteBufferNano.writeInt32(22, i7);
        }
        boolean z2 = this.f7813q;
        if (z2) {
            codedOutputByteBufferNano.writeBool(23, z2);
        }
        long j5 = this.f7814r;
        if (j5 != 1) {
            codedOutputByteBufferNano.writeUInt64(24, j5);
        }
        C0590j9[] c0590j9Arr = this.f7815s;
        if (c0590j9Arr != null && c0590j9Arr.length > 0) {
            int i8 = 0;
            while (true) {
                C0590j9[] c0590j9Arr2 = this.f7815s;
                if (i8 >= c0590j9Arr2.length) {
                    break;
                }
                C0590j9 c0590j9 = c0590j9Arr2[i8];
                if (c0590j9 != null) {
                    codedOutputByteBufferNano.writeMessage(25, c0590j9);
                }
                i8++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0642l9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0642l9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0642l9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 8:
                    this.f7799a = codedInputByteBufferNano.readUInt64();
                    break;
                case 16:
                    this.f7800b = codedInputByteBufferNano.readUInt64();
                    break;
                case 24:
                    this.f7801c = codedInputByteBufferNano.readUInt32();
                    break;
                case 34:
                    this.f7802d = codedInputByteBufferNano.readString();
                    break;
                case f7786M /* 42 */:
                    this.f7803e = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    if (this.f == null) {
                        this.f = new C0513g9();
                    }
                    codedInputByteBufferNano.readMessage(this.f);
                    break;
                case 58:
                    if (this.f7804g == null) {
                        this.f7804g = new C0616k9();
                    }
                    codedInputByteBufferNano.readMessage(this.f7804g);
                    break;
                case 66:
                    this.f7805h = codedInputByteBufferNano.readString();
                    break;
                case 80:
                    this.f7806i = codedInputByteBufferNano.readUInt32();
                    break;
                case 96:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != 0 && readInt32 != 1 && readInt32 != 2) {
                        break;
                    } else {
                        this.f7807j = readInt32;
                        break;
                    }
                case 104:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != -1 && readInt322 != 0 && readInt322 != 1) {
                        break;
                    } else {
                        this.f7808k = readInt322;
                        break;
                    }
                case 114:
                    this.f7809l = codedInputByteBufferNano.readBytes();
                    break;
                case 120:
                    int readInt323 = codedInputByteBufferNano.readInt32();
                    if (readInt323 != -1 && readInt323 != 0 && readInt323 != 1) {
                        break;
                    } else {
                        this.f7810m = readInt323;
                        break;
                    }
                case 128:
                    this.f7811n = codedInputByteBufferNano.readUInt64();
                    break;
                case 136:
                    this.o = codedInputByteBufferNano.readUInt64();
                    break;
                case 176:
                    int readInt324 = codedInputByteBufferNano.readInt32();
                    if (readInt324 != 0 && readInt324 != 1 && readInt324 != 2) {
                        break;
                    } else {
                        this.f7812p = readInt324;
                        break;
                    }
                case 184:
                    this.f7813q = codedInputByteBufferNano.readBool();
                    break;
                case 192:
                    this.f7814r = codedInputByteBufferNano.readUInt64();
                    break;
                case 202:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 202);
                    C0590j9[] c0590j9Arr = this.f7815s;
                    int length = c0590j9Arr == null ? 0 : c0590j9Arr.length;
                    int i3 = repeatedFieldArrayLength + length;
                    C0590j9[] c0590j9Arr2 = new C0590j9[i3];
                    if (length != 0) {
                        System.arraycopy(c0590j9Arr, 0, c0590j9Arr2, 0, length);
                    }
                    while (length < i3 - 1) {
                        C0590j9 c0590j9 = new C0590j9();
                        c0590j9Arr2[length] = c0590j9;
                        codedInputByteBufferNano.readMessage(c0590j9);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C0590j9 c0590j92 = new C0590j9();
                    c0590j9Arr2[length] = c0590j92;
                    codedInputByteBufferNano.readMessage(c0590j92);
                    this.f7815s = c0590j9Arr2;
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

    public static C0642l9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0642l9) MessageNano.mergeFrom(new C0642l9(), bArr);
    }
}
