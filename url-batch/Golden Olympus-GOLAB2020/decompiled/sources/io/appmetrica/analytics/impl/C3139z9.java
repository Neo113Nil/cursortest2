package io.appmetrica.analytics.impl;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.InterfaceC1490j3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.z9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3139z9 extends MessageNano {

    /* renamed from: A, reason: collision with root package name */
    public static final int f40324A = 17;

    /* renamed from: B, reason: collision with root package name */
    public static final int f40325B = 18;

    /* renamed from: C, reason: collision with root package name */
    public static final int f40326C = 19;

    /* renamed from: D, reason: collision with root package name */
    public static final int f40327D = 20;

    /* renamed from: E, reason: collision with root package name */
    public static final int f40328E = 21;

    /* renamed from: F, reason: collision with root package name */
    public static final int f40329F = 25;

    /* renamed from: G, reason: collision with root package name */
    public static final int f40330G = 26;

    /* renamed from: H, reason: collision with root package name */
    public static final int f40331H = 27;

    /* renamed from: I, reason: collision with root package name */
    public static final int f40332I = 29;

    /* renamed from: J, reason: collision with root package name */
    public static final int f40333J = 35;

    /* renamed from: K, reason: collision with root package name */
    public static final int f40334K = 38;

    /* renamed from: L, reason: collision with root package name */
    public static final int f40335L = 40;

    /* renamed from: M, reason: collision with root package name */
    public static final int f40336M = 42;

    /* renamed from: N, reason: collision with root package name */
    public static final int f40337N = 0;

    /* renamed from: O, reason: collision with root package name */
    public static final int f40338O = 1;

    /* renamed from: P, reason: collision with root package name */
    public static final int f40339P = 2;

    /* renamed from: Q, reason: collision with root package name */
    public static final int f40340Q = 0;

    /* renamed from: R, reason: collision with root package name */
    public static final int f40341R = 1;

    /* renamed from: S, reason: collision with root package name */
    public static final int f40342S = 2;

    /* renamed from: T, reason: collision with root package name */
    public static volatile C3139z9[] f40343T = null;

    /* renamed from: t, reason: collision with root package name */
    public static final int f40344t = 1;

    /* renamed from: u, reason: collision with root package name */
    public static final int f40345u = 2;

    /* renamed from: v, reason: collision with root package name */
    public static final int f40346v = 4;

    /* renamed from: w, reason: collision with root package name */
    public static final int f40347w = 5;

    /* renamed from: x, reason: collision with root package name */
    public static final int f40348x = 7;

    /* renamed from: y, reason: collision with root package name */
    public static final int f40349y = 13;

    /* renamed from: z, reason: collision with root package name */
    public static final int f40350z = 16;

    /* renamed from: a, reason: collision with root package name */
    public long f40351a;

    /* renamed from: b, reason: collision with root package name */
    public long f40352b;

    /* renamed from: c, reason: collision with root package name */
    public int f40353c;

    /* renamed from: d, reason: collision with root package name */
    public String f40354d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f40355e;

    /* renamed from: f, reason: collision with root package name */
    public C3009u9 f40356f;

    /* renamed from: g, reason: collision with root package name */
    public C3113y9 f40357g;

    /* renamed from: h, reason: collision with root package name */
    public String f40358h;

    /* renamed from: i, reason: collision with root package name */
    public int f40359i;

    /* renamed from: j, reason: collision with root package name */
    public int f40360j;

    /* renamed from: k, reason: collision with root package name */
    public int f40361k;

    /* renamed from: l, reason: collision with root package name */
    public byte[] f40362l;

    /* renamed from: m, reason: collision with root package name */
    public int f40363m;

    /* renamed from: n, reason: collision with root package name */
    public long f40364n;

    /* renamed from: o, reason: collision with root package name */
    public long f40365o;

    /* renamed from: p, reason: collision with root package name */
    public int f40366p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f40367q;

    /* renamed from: r, reason: collision with root package name */
    public long f40368r;

    /* renamed from: s, reason: collision with root package name */
    public C3087x9[] f40369s;

    public C3139z9() {
        a();
    }

    public static C3139z9[] b() {
        if (f40343T == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f40343T == null) {
                        f40343T = new C3139z9[0];
                    }
                } finally {
                }
            }
        }
        return f40343T;
    }

    public final C3139z9 a() {
        this.f40351a = 0L;
        this.f40352b = 0L;
        this.f40353c = 0;
        this.f40354d = "";
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f40355e = bArr;
        this.f40356f = null;
        this.f40357g = null;
        this.f40358h = "";
        this.f40359i = 0;
        this.f40360j = 0;
        this.f40361k = -1;
        this.f40362l = bArr;
        this.f40363m = -1;
        this.f40364n = 0L;
        this.f40365o = 0L;
        this.f40366p = 0;
        this.f40367q = false;
        this.f40368r = 1L;
        this.f40369s = C3087x9.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeUInt32Size = CodedOutputByteBufferNano.computeUInt32Size(3, this.f40353c) + CodedOutputByteBufferNano.computeUInt64Size(2, this.f40352b) + CodedOutputByteBufferNano.computeUInt64Size(1, this.f40351a) + super.computeSerializedSize();
        if (!this.f40354d.equals("")) {
            computeUInt32Size += CodedOutputByteBufferNano.computeStringSize(4, this.f40354d);
        }
        byte[] bArr = this.f40355e;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeUInt32Size += CodedOutputByteBufferNano.computeBytesSize(5, this.f40355e);
        }
        C3009u9 c3009u9 = this.f40356f;
        if (c3009u9 != null) {
            computeUInt32Size += CodedOutputByteBufferNano.computeMessageSize(6, c3009u9);
        }
        C3113y9 c3113y9 = this.f40357g;
        if (c3113y9 != null) {
            computeUInt32Size += CodedOutputByteBufferNano.computeMessageSize(7, c3113y9);
        }
        if (!this.f40358h.equals("")) {
            computeUInt32Size += CodedOutputByteBufferNano.computeStringSize(8, this.f40358h);
        }
        int i4 = this.f40359i;
        if (i4 != 0) {
            computeUInt32Size += CodedOutputByteBufferNano.computeUInt32Size(10, i4);
        }
        int i5 = this.f40360j;
        if (i5 != 0) {
            computeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(12, i5);
        }
        int i6 = this.f40361k;
        if (i6 != -1) {
            computeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(13, i6);
        }
        if (!Arrays.equals(this.f40362l, bArr2)) {
            computeUInt32Size += CodedOutputByteBufferNano.computeBytesSize(14, this.f40362l);
        }
        int i7 = this.f40363m;
        if (i7 != -1) {
            computeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(15, i7);
        }
        long j4 = this.f40364n;
        if (j4 != 0) {
            computeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(16, j4);
        }
        long j5 = this.f40365o;
        if (j5 != 0) {
            computeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(17, j5);
        }
        int i8 = this.f40366p;
        if (i8 != 0) {
            computeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(22, i8);
        }
        boolean z4 = this.f40367q;
        if (z4) {
            computeUInt32Size += CodedOutputByteBufferNano.computeBoolSize(23, z4);
        }
        long j6 = this.f40368r;
        if (j6 != 1) {
            computeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(24, j6);
        }
        C3087x9[] c3087x9Arr = this.f40369s;
        if (c3087x9Arr != null && c3087x9Arr.length > 0) {
            int i9 = 0;
            while (true) {
                C3087x9[] c3087x9Arr2 = this.f40369s;
                if (i9 >= c3087x9Arr2.length) {
                    break;
                }
                C3087x9 c3087x9 = c3087x9Arr2[i9];
                if (c3087x9 != null) {
                    computeUInt32Size = CodedOutputByteBufferNano.computeMessageSize(25, c3087x9) + computeUInt32Size;
                }
                i9++;
            }
        }
        return computeUInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeUInt64(1, this.f40351a);
        codedOutputByteBufferNano.writeUInt64(2, this.f40352b);
        codedOutputByteBufferNano.writeUInt32(3, this.f40353c);
        if (!this.f40354d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f40354d);
        }
        byte[] bArr = this.f40355e;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f40355e);
        }
        C3009u9 c3009u9 = this.f40356f;
        if (c3009u9 != null) {
            codedOutputByteBufferNano.writeMessage(6, c3009u9);
        }
        C3113y9 c3113y9 = this.f40357g;
        if (c3113y9 != null) {
            codedOutputByteBufferNano.writeMessage(7, c3113y9);
        }
        if (!this.f40358h.equals("")) {
            codedOutputByteBufferNano.writeString(8, this.f40358h);
        }
        int i4 = this.f40359i;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeUInt32(10, i4);
        }
        int i5 = this.f40360j;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeInt32(12, i5);
        }
        int i6 = this.f40361k;
        if (i6 != -1) {
            codedOutputByteBufferNano.writeInt32(13, i6);
        }
        if (!Arrays.equals(this.f40362l, bArr2)) {
            codedOutputByteBufferNano.writeBytes(14, this.f40362l);
        }
        int i7 = this.f40363m;
        if (i7 != -1) {
            codedOutputByteBufferNano.writeInt32(15, i7);
        }
        long j4 = this.f40364n;
        if (j4 != 0) {
            codedOutputByteBufferNano.writeUInt64(16, j4);
        }
        long j5 = this.f40365o;
        if (j5 != 0) {
            codedOutputByteBufferNano.writeUInt64(17, j5);
        }
        int i8 = this.f40366p;
        if (i8 != 0) {
            codedOutputByteBufferNano.writeInt32(22, i8);
        }
        boolean z4 = this.f40367q;
        if (z4) {
            codedOutputByteBufferNano.writeBool(23, z4);
        }
        long j6 = this.f40368r;
        if (j6 != 1) {
            codedOutputByteBufferNano.writeUInt64(24, j6);
        }
        C3087x9[] c3087x9Arr = this.f40369s;
        if (c3087x9Arr != null && c3087x9Arr.length > 0) {
            int i9 = 0;
            while (true) {
                C3087x9[] c3087x9Arr2 = this.f40369s;
                if (i9 >= c3087x9Arr2.length) {
                    break;
                }
                C3087x9 c3087x9 = c3087x9Arr2[i9];
                if (c3087x9 != null) {
                    codedOutputByteBufferNano.writeMessage(25, c3087x9);
                }
                i9++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C3139z9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C3139z9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3139z9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 8:
                    this.f40351a = codedInputByteBufferNano.readUInt64();
                    break;
                case 16:
                    this.f40352b = codedInputByteBufferNano.readUInt64();
                    break;
                case 24:
                    this.f40353c = codedInputByteBufferNano.readUInt32();
                    break;
                case 34:
                    this.f40354d = codedInputByteBufferNano.readString();
                    break;
                case 42:
                    this.f40355e = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    if (this.f40356f == null) {
                        this.f40356f = new C3009u9();
                    }
                    codedInputByteBufferNano.readMessage(this.f40356f);
                    break;
                case 58:
                    if (this.f40357g == null) {
                        this.f40357g = new C3113y9();
                    }
                    codedInputByteBufferNano.readMessage(this.f40357g);
                    break;
                case 66:
                    this.f40358h = codedInputByteBufferNano.readString();
                    break;
                case 80:
                    this.f40359i = codedInputByteBufferNano.readUInt32();
                    break;
                case 96:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != 0 && readInt32 != 1 && readInt32 != 2) {
                        break;
                    } else {
                        this.f40360j = readInt32;
                        break;
                    }
                case 104:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != -1 && readInt322 != 0 && readInt322 != 1) {
                        break;
                    } else {
                        this.f40361k = readInt322;
                        break;
                    }
                case IronSourceConstants.FIRST_INSTANCE_RESULT /* 114 */:
                    this.f40362l = codedInputByteBufferNano.readBytes();
                    break;
                case 120:
                    int readInt323 = codedInputByteBufferNano.readInt32();
                    if (readInt323 != -1 && readInt323 != 0 && readInt323 != 1) {
                        break;
                    } else {
                        this.f40363m = readInt323;
                        break;
                    }
                case UserVerificationMethods.USER_VERIFY_PATTERN /* 128 */:
                    this.f40364n = codedInputByteBufferNano.readUInt64();
                    break;
                case 136:
                    this.f40365o = codedInputByteBufferNano.readUInt64();
                    break;
                case 176:
                    int readInt324 = codedInputByteBufferNano.readInt32();
                    if (readInt324 != 0 && readInt324 != 1 && readInt324 != 2) {
                        break;
                    } else {
                        this.f40366p = readInt324;
                        break;
                    }
                case 184:
                    this.f40367q = codedInputByteBufferNano.readBool();
                    break;
                case 192:
                    this.f40368r = codedInputByteBufferNano.readUInt64();
                    break;
                case InterfaceC1490j3.c.b.f16802c /* 202 */:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, InterfaceC1490j3.c.b.f16802c);
                    C3087x9[] c3087x9Arr = this.f40369s;
                    int length = c3087x9Arr == null ? 0 : c3087x9Arr.length;
                    int i4 = repeatedFieldArrayLength + length;
                    C3087x9[] c3087x9Arr2 = new C3087x9[i4];
                    if (length != 0) {
                        System.arraycopy(c3087x9Arr, 0, c3087x9Arr2, 0, length);
                    }
                    while (length < i4 - 1) {
                        C3087x9 c3087x9 = new C3087x9();
                        c3087x9Arr2[length] = c3087x9;
                        codedInputByteBufferNano.readMessage(c3087x9);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C3087x9 c3087x92 = new C3087x9();
                    c3087x9Arr2[length] = c3087x92;
                    codedInputByteBufferNano.readMessage(c3087x92);
                    this.f40369s = c3087x9Arr2;
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

    public static C3139z9 a(byte[] bArr) {
        return (C3139z9) MessageNano.mergeFrom(new C3139z9(), bArr);
    }
}
