package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class A8 extends MessageNano {

    /* renamed from: g, reason: collision with root package name */
    public static final int f6508g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final int f6509h = 1;

    /* renamed from: i, reason: collision with root package name */
    public static final int f6510i = 2;

    /* renamed from: j, reason: collision with root package name */
    public static final int f6511j = 3;

    /* renamed from: k, reason: collision with root package name */
    public static final int f6512k = 4;

    /* renamed from: l, reason: collision with root package name */
    public static final int f6513l = 5;

    /* renamed from: m, reason: collision with root package name */
    public static final int f6514m = 6;

    /* renamed from: n, reason: collision with root package name */
    public static final int f6515n = 7;

    /* renamed from: o, reason: collision with root package name */
    public static volatile A8[] f6516o;

    /* renamed from: a, reason: collision with root package name */
    public int f6517a;

    /* renamed from: b, reason: collision with root package name */
    public C1153z8 f6518b;

    /* renamed from: c, reason: collision with root package name */
    public C1103x8 f6519c;

    /* renamed from: d, reason: collision with root package name */
    public C1128y8 f6520d;

    /* renamed from: e, reason: collision with root package name */
    public C0740j8 f6521e;

    /* renamed from: f, reason: collision with root package name */
    public C0896p8 f6522f;

    public A8() {
        a();
    }

    public static A8[] b() {
        if (f6516o == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6516o == null) {
                        f6516o = new A8[0];
                    }
                } finally {
                }
            }
        }
        return f6516o;
    }

    public final A8 a() {
        this.f6517a = 0;
        this.f6518b = null;
        this.f6519c = null;
        this.f6520d = null;
        this.f6521e = null;
        this.f6522f = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.f6517a;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i2);
        }
        C1153z8 c1153z8 = this.f6518b;
        if (c1153z8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c1153z8);
        }
        C1103x8 c1103x8 = this.f6519c;
        if (c1103x8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c1103x8);
        }
        C1128y8 c1128y8 = this.f6520d;
        if (c1128y8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c1128y8);
        }
        C0740j8 c0740j8 = this.f6521e;
        if (c0740j8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c0740j8);
        }
        C0896p8 c0896p8 = this.f6522f;
        return c0896p8 != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(6, c0896p8) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i2 = this.f6517a;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(1, i2);
        }
        C1153z8 c1153z8 = this.f6518b;
        if (c1153z8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c1153z8);
        }
        C1103x8 c1103x8 = this.f6519c;
        if (c1103x8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c1103x8);
        }
        C1128y8 c1128y8 = this.f6520d;
        if (c1128y8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c1128y8);
        }
        C0740j8 c0740j8 = this.f6521e;
        if (c0740j8 != null) {
            codedOutputByteBufferNano.writeMessage(5, c0740j8);
        }
        C0896p8 c0896p8 = this.f6522f;
        if (c0896p8 != null) {
            codedOutputByteBufferNano.writeMessage(6, c0896p8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static A8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new A8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final A8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
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
                        this.f6517a = readInt32;
                        break;
                }
            } else if (readTag == 18) {
                if (this.f6518b == null) {
                    this.f6518b = new C1153z8();
                }
                codedInputByteBufferNano.readMessage(this.f6518b);
            } else if (readTag == 26) {
                if (this.f6519c == null) {
                    this.f6519c = new C1103x8();
                }
                codedInputByteBufferNano.readMessage(this.f6519c);
            } else if (readTag == 34) {
                if (this.f6520d == null) {
                    this.f6520d = new C1128y8();
                }
                codedInputByteBufferNano.readMessage(this.f6520d);
            } else if (readTag == 42) {
                if (this.f6521e == null) {
                    this.f6521e = new C0740j8();
                }
                codedInputByteBufferNano.readMessage(this.f6521e);
            } else if (readTag != 50) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f6522f == null) {
                    this.f6522f = new C0896p8();
                }
                codedInputByteBufferNano.readMessage(this.f6522f);
            }
        }
    }

    public static A8 a(byte[] bArr) {
        return (A8) MessageNano.mergeFrom(new A8(), bArr);
    }
}
