package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes3.dex */
public final class Wi extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f38474c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f38475d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f38476e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f38477f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static final int f38478g = 4;

    /* renamed from: h, reason: collision with root package name */
    public static volatile Wi[] f38479h;

    /* renamed from: a, reason: collision with root package name */
    public int f38480a;

    /* renamed from: b, reason: collision with root package name */
    public int f38481b;

    public Wi() {
        a();
    }

    public static Wi[] b() {
        if (f38479h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f38479h == null) {
                        f38479h = new Wi[0];
                    }
                } finally {
                }
            }
        }
        return f38479h;
    }

    public final Wi a() {
        this.f38480a = 0;
        this.f38481b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i4 = this.f38480a;
        if (i4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i4);
        }
        int i5 = this.f38481b;
        return i5 != 0 ? CodedOutputByteBufferNano.computeInt32Size(2, i5) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i4 = this.f38480a;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i4);
        }
        int i5 = this.f38481b;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeInt32(2, i5);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Wi mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f38480a = codedInputByteBufferNano.readUInt32();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3 || readInt32 == 4) {
                    this.f38481b = readInt32;
                }
            }
        }
        return this;
    }

    public static Wi b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Wi().mergeFrom(codedInputByteBufferNano);
    }

    public static Wi a(byte[] bArr) {
        return (Wi) MessageNano.mergeFrom(new Wi(), bArr);
    }
}
