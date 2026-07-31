package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes3.dex */
public final class B9 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static final int f37217d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f37218e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f37219f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final int f37220g = 3;

    /* renamed from: h, reason: collision with root package name */
    public static final int f37221h = 4;

    /* renamed from: i, reason: collision with root package name */
    public static final int f37222i = 5;

    /* renamed from: j, reason: collision with root package name */
    public static final int f37223j = 6;

    /* renamed from: k, reason: collision with root package name */
    public static final int f37224k = 7;

    /* renamed from: l, reason: collision with root package name */
    public static final int f37225l = 8;

    /* renamed from: m, reason: collision with root package name */
    public static final int f37226m = 9;

    /* renamed from: n, reason: collision with root package name */
    public static final int f37227n = 10;

    /* renamed from: o, reason: collision with root package name */
    public static final int f37228o = 11;

    /* renamed from: p, reason: collision with root package name */
    public static final int f37229p = 12;

    /* renamed from: q, reason: collision with root package name */
    public static volatile B9[] f37230q;

    /* renamed from: a, reason: collision with root package name */
    public long f37231a;

    /* renamed from: b, reason: collision with root package name */
    public A9 f37232b;

    /* renamed from: c, reason: collision with root package name */
    public C3139z9[] f37233c;

    public B9() {
        a();
    }

    public static B9[] b() {
        if (f37230q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f37230q == null) {
                        f37230q = new B9[0];
                    }
                } finally {
                }
            }
        }
        return f37230q;
    }

    public final B9 a() {
        this.f37231a = 0L;
        this.f37232b = null;
        this.f37233c = C3139z9.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeUInt64Size = CodedOutputByteBufferNano.computeUInt64Size(1, this.f37231a) + super.computeSerializedSize();
        A9 a9 = this.f37232b;
        if (a9 != null) {
            computeUInt64Size += CodedOutputByteBufferNano.computeMessageSize(2, a9);
        }
        C3139z9[] c3139z9Arr = this.f37233c;
        if (c3139z9Arr != null && c3139z9Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C3139z9[] c3139z9Arr2 = this.f37233c;
                if (i4 >= c3139z9Arr2.length) {
                    break;
                }
                C3139z9 c3139z9 = c3139z9Arr2[i4];
                if (c3139z9 != null) {
                    computeUInt64Size = CodedOutputByteBufferNano.computeMessageSize(3, c3139z9) + computeUInt64Size;
                }
                i4++;
            }
        }
        return computeUInt64Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeUInt64(1, this.f37231a);
        A9 a9 = this.f37232b;
        if (a9 != null) {
            codedOutputByteBufferNano.writeMessage(2, a9);
        }
        C3139z9[] c3139z9Arr = this.f37233c;
        if (c3139z9Arr != null && c3139z9Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C3139z9[] c3139z9Arr2 = this.f37233c;
                if (i4 >= c3139z9Arr2.length) {
                    break;
                }
                C3139z9 c3139z9 = c3139z9Arr2[i4];
                if (c3139z9 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c3139z9);
                }
                i4++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final B9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f37231a = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 18) {
                if (this.f37232b == null) {
                    this.f37232b = new A9();
                }
                codedInputByteBufferNano.readMessage(this.f37232b);
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C3139z9[] c3139z9Arr = this.f37233c;
                int length = c3139z9Arr == null ? 0 : c3139z9Arr.length;
                int i4 = repeatedFieldArrayLength + length;
                C3139z9[] c3139z9Arr2 = new C3139z9[i4];
                if (length != 0) {
                    System.arraycopy(c3139z9Arr, 0, c3139z9Arr2, 0, length);
                }
                while (length < i4 - 1) {
                    C3139z9 c3139z9 = new C3139z9();
                    c3139z9Arr2[length] = c3139z9;
                    codedInputByteBufferNano.readMessage(c3139z9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C3139z9 c3139z92 = new C3139z9();
                c3139z9Arr2[length] = c3139z92;
                codedInputByteBufferNano.readMessage(c3139z92);
                this.f37233c = c3139z9Arr2;
            }
        }
        return this;
    }

    public static B9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new B9().mergeFrom(codedInputByteBufferNano);
    }

    public static B9 a(byte[] bArr) {
        return (B9) MessageNano.mergeFrom(new B9(), bArr);
    }
}
