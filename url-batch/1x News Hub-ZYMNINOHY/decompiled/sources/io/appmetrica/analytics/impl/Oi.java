package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class Oi extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f6409c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f6410d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f6411e = 2;
    public static final int f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static final int f6412g = 4;

    /* renamed from: h, reason: collision with root package name */
    public static volatile Oi[] f6413h;

    /* renamed from: a, reason: collision with root package name */
    public int f6414a;

    /* renamed from: b, reason: collision with root package name */
    public int f6415b;

    public Oi() {
        a();
    }

    public static Oi[] b() {
        if (f6413h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6413h == null) {
                        f6413h = new Oi[0];
                    }
                } finally {
                }
            }
        }
        return f6413h;
    }

    public final Oi a() {
        this.f6414a = 0;
        this.f6415b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i3 = this.f6414a;
        if (i3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i3);
        }
        int i4 = this.f6415b;
        return i4 != 0 ? CodedOutputByteBufferNano.computeInt32Size(2, i4) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i3 = this.f6414a;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i3);
        }
        int i4 = this.f6415b;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeInt32(2, i4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Oi mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f6414a = codedInputByteBufferNano.readUInt32();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3 || readInt32 == 4) {
                    this.f6415b = readInt32;
                }
            }
        }
        return this;
    }

    public static Oi b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Oi().mergeFrom(codedInputByteBufferNano);
    }

    public static Oi a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Oi) MessageNano.mergeFrom(new Oi(), bArr);
    }
}
