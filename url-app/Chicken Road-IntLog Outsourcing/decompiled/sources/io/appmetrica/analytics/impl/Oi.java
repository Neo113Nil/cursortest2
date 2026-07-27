package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class Oi extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f7219c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f7220d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f7221e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f7222f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static final int f7223g = 4;

    /* renamed from: h, reason: collision with root package name */
    public static volatile Oi[] f7224h;

    /* renamed from: a, reason: collision with root package name */
    public int f7225a;

    /* renamed from: b, reason: collision with root package name */
    public int f7226b;

    public Oi() {
        a();
    }

    public static Oi[] b() {
        if (f7224h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7224h == null) {
                        f7224h = new Oi[0];
                    }
                } finally {
                }
            }
        }
        return f7224h;
    }

    public final Oi a() {
        this.f7225a = 0;
        this.f7226b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.f7225a;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i2);
        }
        int i3 = this.f7226b;
        return i3 != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i3) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i2 = this.f7225a;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i2);
        }
        int i3 = this.f7226b;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeInt32(2, i3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Oi mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f7225a = codedInputByteBufferNano.readUInt32();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3 || readInt32 == 4) {
                    this.f7226b = readInt32;
                }
            }
        }
    }

    public static Oi b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Oi().mergeFrom(codedInputByteBufferNano);
    }

    public static Oi a(byte[] bArr) {
        return (Oi) MessageNano.mergeFrom(new Oi(), bArr);
    }
}
