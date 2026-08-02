package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class A8 extends MessageNano {

    /* renamed from: g, reason: collision with root package name */
    public static final int f5733g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final int f5734h = 1;

    /* renamed from: i, reason: collision with root package name */
    public static final int f5735i = 2;

    /* renamed from: j, reason: collision with root package name */
    public static final int f5736j = 3;

    /* renamed from: k, reason: collision with root package name */
    public static final int f5737k = 4;

    /* renamed from: l, reason: collision with root package name */
    public static final int f5738l = 5;

    /* renamed from: m, reason: collision with root package name */
    public static final int f5739m = 6;

    /* renamed from: n, reason: collision with root package name */
    public static final int f5740n = 7;
    public static volatile A8[] o;

    /* renamed from: a, reason: collision with root package name */
    public int f5741a;

    /* renamed from: b, reason: collision with root package name */
    public C1002z8 f5742b;

    /* renamed from: c, reason: collision with root package name */
    public C0952x8 f5743c;

    /* renamed from: d, reason: collision with root package name */
    public C0977y8 f5744d;

    /* renamed from: e, reason: collision with root package name */
    public C0589j8 f5745e;
    public C0745p8 f;

    public A8() {
        a();
    }

    public static A8[] b() {
        if (o == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (o == null) {
                        o = new A8[0];
                    }
                } finally {
                }
            }
        }
        return o;
    }

    public final A8 a() {
        this.f5741a = 0;
        this.f5742b = null;
        this.f5743c = null;
        this.f5744d = null;
        this.f5745e = null;
        this.f = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i3 = this.f5741a;
        if (i3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i3);
        }
        C1002z8 c1002z8 = this.f5742b;
        if (c1002z8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c1002z8);
        }
        C0952x8 c0952x8 = this.f5743c;
        if (c0952x8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c0952x8);
        }
        C0977y8 c0977y8 = this.f5744d;
        if (c0977y8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c0977y8);
        }
        C0589j8 c0589j8 = this.f5745e;
        if (c0589j8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c0589j8);
        }
        C0745p8 c0745p8 = this.f;
        return c0745p8 != null ? CodedOutputByteBufferNano.computeMessageSize(6, c0745p8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i3 = this.f5741a;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeInt32(1, i3);
        }
        C1002z8 c1002z8 = this.f5742b;
        if (c1002z8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c1002z8);
        }
        C0952x8 c0952x8 = this.f5743c;
        if (c0952x8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c0952x8);
        }
        C0977y8 c0977y8 = this.f5744d;
        if (c0977y8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0977y8);
        }
        C0589j8 c0589j8 = this.f5745e;
        if (c0589j8 != null) {
            codedOutputByteBufferNano.writeMessage(5, c0589j8);
        }
        C0745p8 c0745p8 = this.f;
        if (c0745p8 != null) {
            codedOutputByteBufferNano.writeMessage(6, c0745p8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static A8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new A8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final A8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                            this.f5741a = readInt32;
                            break;
                    }
                } else if (readTag == 18) {
                    if (this.f5742b == null) {
                        this.f5742b = new C1002z8();
                    }
                    codedInputByteBufferNano.readMessage(this.f5742b);
                } else if (readTag == 26) {
                    if (this.f5743c == null) {
                        this.f5743c = new C0952x8();
                    }
                    codedInputByteBufferNano.readMessage(this.f5743c);
                } else if (readTag == 34) {
                    if (this.f5744d == null) {
                        this.f5744d = new C0977y8();
                    }
                    codedInputByteBufferNano.readMessage(this.f5744d);
                } else if (readTag == 42) {
                    if (this.f5745e == null) {
                        this.f5745e = new C0589j8();
                    }
                    codedInputByteBufferNano.readMessage(this.f5745e);
                } else if (readTag != 50) {
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    }
                } else {
                    if (this.f == null) {
                        this.f = new C0745p8();
                    }
                    codedInputByteBufferNano.readMessage(this.f);
                }
            }
        }
        return this;
    }

    public static A8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (A8) MessageNano.mergeFrom(new A8(), bArr);
    }
}
