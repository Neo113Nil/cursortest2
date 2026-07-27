package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.tg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1007tg extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static final int f9313e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f9314f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f9315g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static volatile C1007tg[] f9316h;

    /* renamed from: a, reason: collision with root package name */
    public String f9317a;

    /* renamed from: b, reason: collision with root package name */
    public long f9318b;

    /* renamed from: c, reason: collision with root package name */
    public long f9319c;

    /* renamed from: d, reason: collision with root package name */
    public int f9320d;

    public C1007tg() {
        a();
    }

    public static C1007tg[] b() {
        if (f9316h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9316h == null) {
                        f9316h = new C1007tg[0];
                    }
                } finally {
                }
            }
        }
        return f9316h;
    }

    public final C1007tg a() {
        this.f9317a = "";
        this.f9318b = 0L;
        this.f9319c = 0L;
        this.f9320d = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f9317a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f9317a);
        }
        long j2 = this.f9318b;
        if (j2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j2);
        }
        long j6 = this.f9319c;
        if (j6 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(3, j6);
        }
        int i2 = this.f9320d;
        return i2 != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(4, i2) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f9317a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f9317a);
        }
        long j2 = this.f9318b;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j2);
        }
        long j6 = this.f9319c;
        if (j6 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j6);
        }
        int i2 = this.f9320d;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(4, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1007tg mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f9317a = codedInputByteBufferNano.readString();
            } else if (readTag == 16) {
                this.f9318b = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 24) {
                this.f9319c = codedInputByteBufferNano.readUInt64();
            } else if (readTag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f9320d = readInt32;
                }
            }
        }
    }

    public static C1007tg b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1007tg().mergeFrom(codedInputByteBufferNano);
    }

    public static C1007tg a(byte[] bArr) {
        return (C1007tg) MessageNano.mergeFrom(new C1007tg(), bArr);
    }
}
