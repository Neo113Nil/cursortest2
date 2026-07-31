package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes3.dex */
public final class O8 extends MessageNano {

    /* renamed from: g, reason: collision with root package name */
    public static final int f38057g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final int f38058h = 1;

    /* renamed from: i, reason: collision with root package name */
    public static final int f38059i = 2;

    /* renamed from: j, reason: collision with root package name */
    public static final int f38060j = 3;

    /* renamed from: k, reason: collision with root package name */
    public static final int f38061k = 4;

    /* renamed from: l, reason: collision with root package name */
    public static final int f38062l = 5;

    /* renamed from: m, reason: collision with root package name */
    public static final int f38063m = 6;

    /* renamed from: n, reason: collision with root package name */
    public static final int f38064n = 7;

    /* renamed from: o, reason: collision with root package name */
    public static volatile O8[] f38065o;

    /* renamed from: a, reason: collision with root package name */
    public int f38066a;

    /* renamed from: b, reason: collision with root package name */
    public N8 f38067b;

    /* renamed from: c, reason: collision with root package name */
    public L8 f38068c;

    /* renamed from: d, reason: collision with root package name */
    public M8 f38069d;

    /* renamed from: e, reason: collision with root package name */
    public C3086x8 f38070e;

    /* renamed from: f, reason: collision with root package name */
    public D8 f38071f;

    public O8() {
        a();
    }

    public static O8[] b() {
        if (f38065o == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f38065o == null) {
                        f38065o = new O8[0];
                    }
                } finally {
                }
            }
        }
        return f38065o;
    }

    public final O8 a() {
        this.f38066a = 0;
        this.f38067b = null;
        this.f38068c = null;
        this.f38069d = null;
        this.f38070e = null;
        this.f38071f = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i4 = this.f38066a;
        if (i4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i4);
        }
        N8 n8 = this.f38067b;
        if (n8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, n8);
        }
        L8 l8 = this.f38068c;
        if (l8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, l8);
        }
        M8 m8 = this.f38069d;
        if (m8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, m8);
        }
        C3086x8 c3086x8 = this.f38070e;
        if (c3086x8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c3086x8);
        }
        D8 d8 = this.f38071f;
        return d8 != null ? CodedOutputByteBufferNano.computeMessageSize(6, d8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i4 = this.f38066a;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeInt32(1, i4);
        }
        N8 n8 = this.f38067b;
        if (n8 != null) {
            codedOutputByteBufferNano.writeMessage(2, n8);
        }
        L8 l8 = this.f38068c;
        if (l8 != null) {
            codedOutputByteBufferNano.writeMessage(3, l8);
        }
        M8 m8 = this.f38069d;
        if (m8 != null) {
            codedOutputByteBufferNano.writeMessage(4, m8);
        }
        C3086x8 c3086x8 = this.f38070e;
        if (c3086x8 != null) {
            codedOutputByteBufferNano.writeMessage(5, c3086x8);
        }
        D8 d8 = this.f38071f;
        if (d8 != null) {
            codedOutputByteBufferNano.writeMessage(6, d8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static O8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new O8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final O8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag != 0) {
                if (readTag == 8) {
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    switch (readInt32) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            this.f38066a = readInt32;
                            break;
                    }
                } else if (readTag == 18) {
                    if (this.f38067b == null) {
                        this.f38067b = new N8();
                    }
                    codedInputByteBufferNano.readMessage(this.f38067b);
                } else if (readTag == 26) {
                    if (this.f38068c == null) {
                        this.f38068c = new L8();
                    }
                    codedInputByteBufferNano.readMessage(this.f38068c);
                } else if (readTag == 34) {
                    if (this.f38069d == null) {
                        this.f38069d = new M8();
                    }
                    codedInputByteBufferNano.readMessage(this.f38069d);
                } else if (readTag == 42) {
                    if (this.f38070e == null) {
                        this.f38070e = new C3086x8();
                    }
                    codedInputByteBufferNano.readMessage(this.f38070e);
                } else if (readTag != 50) {
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    }
                } else {
                    if (this.f38071f == null) {
                        this.f38071f = new D8();
                    }
                    codedInputByteBufferNano.readMessage(this.f38071f);
                }
            }
        }
        return this;
    }

    public static O8 a(byte[] bArr) {
        return (O8) MessageNano.mergeFrom(new O8(), bArr);
    }
}
