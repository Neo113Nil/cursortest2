package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.u8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0996u8 extends MessageNano {

    /* renamed from: g, reason: collision with root package name */
    public static final int f12809g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final int f12810h = 1;

    /* renamed from: i, reason: collision with root package name */
    public static final int f12811i = 2;

    /* renamed from: j, reason: collision with root package name */
    public static final int f12812j = 3;

    /* renamed from: k, reason: collision with root package name */
    public static final int f12813k = 4;

    /* renamed from: l, reason: collision with root package name */
    public static final int f12814l = 5;

    /* renamed from: m, reason: collision with root package name */
    public static final int f12815m = 6;
    public static final int n = 7;
    public static volatile C0996u8[] o;

    /* renamed from: a, reason: collision with root package name */
    public int f12816a;

    /* renamed from: b, reason: collision with root package name */
    public C0970t8 f12817b;

    /* renamed from: c, reason: collision with root package name */
    public C0918r8 f12818c;

    /* renamed from: d, reason: collision with root package name */
    public C0944s8 f12819d;

    /* renamed from: e, reason: collision with root package name */
    public C0557d8 f12820e;

    /* renamed from: f, reason: collision with root package name */
    public C0711j8 f12821f;

    public C0996u8() {
        a();
    }

    public static C0996u8[] b() {
        if (o == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (o == null) {
                        o = new C0996u8[0];
                    }
                } finally {
                }
            }
        }
        return o;
    }

    public final C0996u8 a() {
        this.f12816a = 0;
        this.f12817b = null;
        this.f12818c = null;
        this.f12819d = null;
        this.f12820e = null;
        this.f12821f = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i4 = this.f12816a;
        if (i4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i4);
        }
        C0970t8 c0970t8 = this.f12817b;
        if (c0970t8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c0970t8);
        }
        C0918r8 c0918r8 = this.f12818c;
        if (c0918r8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c0918r8);
        }
        C0944s8 c0944s8 = this.f12819d;
        if (c0944s8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c0944s8);
        }
        C0557d8 c0557d8 = this.f12820e;
        if (c0557d8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c0557d8);
        }
        C0711j8 c0711j8 = this.f12821f;
        return c0711j8 != null ? CodedOutputByteBufferNano.computeMessageSize(6, c0711j8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i4 = this.f12816a;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeInt32(1, i4);
        }
        C0970t8 c0970t8 = this.f12817b;
        if (c0970t8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0970t8);
        }
        C0918r8 c0918r8 = this.f12818c;
        if (c0918r8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c0918r8);
        }
        C0944s8 c0944s8 = this.f12819d;
        if (c0944s8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0944s8);
        }
        C0557d8 c0557d8 = this.f12820e;
        if (c0557d8 != null) {
            codedOutputByteBufferNano.writeMessage(5, c0557d8);
        }
        C0711j8 c0711j8 = this.f12821f;
        if (c0711j8 != null) {
            codedOutputByteBufferNano.writeMessage(6, c0711j8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0996u8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0996u8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0996u8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                            this.f12816a = readInt32;
                            break;
                    }
                } else if (readTag == 18) {
                    if (this.f12817b == null) {
                        this.f12817b = new C0970t8();
                    }
                    codedInputByteBufferNano.readMessage(this.f12817b);
                } else if (readTag == 26) {
                    if (this.f12818c == null) {
                        this.f12818c = new C0918r8();
                    }
                    codedInputByteBufferNano.readMessage(this.f12818c);
                } else if (readTag == 34) {
                    if (this.f12819d == null) {
                        this.f12819d = new C0944s8();
                    }
                    codedInputByteBufferNano.readMessage(this.f12819d);
                } else if (readTag == 42) {
                    if (this.f12820e == null) {
                        this.f12820e = new C0557d8();
                    }
                    codedInputByteBufferNano.readMessage(this.f12820e);
                } else if (readTag != 50) {
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    }
                } else {
                    if (this.f12821f == null) {
                        this.f12821f = new C0711j8();
                    }
                    codedInputByteBufferNano.readMessage(this.f12821f);
                }
            }
        }
        return this;
    }

    public static C0996u8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0996u8) MessageNano.mergeFrom(new C0996u8(), bArr);
    }
}
