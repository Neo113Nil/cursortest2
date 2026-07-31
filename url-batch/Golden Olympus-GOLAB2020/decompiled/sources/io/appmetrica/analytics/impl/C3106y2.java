package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.y2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3106y2 extends MessageNano {

    /* renamed from: f, reason: collision with root package name */
    public static volatile C3106y2[] f40245f;

    /* renamed from: a, reason: collision with root package name */
    public int f40246a;

    /* renamed from: b, reason: collision with root package name */
    public String f40247b;

    /* renamed from: c, reason: collision with root package name */
    public String f40248c;

    /* renamed from: d, reason: collision with root package name */
    public long f40249d;

    /* renamed from: e, reason: collision with root package name */
    public long f40250e;

    public C3106y2() {
        a();
    }

    public static C3106y2[] b() {
        if (f40245f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f40245f == null) {
                        f40245f = new C3106y2[0];
                    }
                } finally {
                }
            }
        }
        return f40245f;
    }

    public final C3106y2 a() {
        this.f40246a = 1;
        this.f40247b = "";
        this.f40248c = "";
        this.f40249d = 0L;
        this.f40250e = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeUInt64Size(5, this.f40250e) + CodedOutputByteBufferNano.computeUInt64Size(4, this.f40249d) + CodedOutputByteBufferNano.computeStringSize(3, this.f40248c) + CodedOutputByteBufferNano.computeStringSize(2, this.f40247b) + CodedOutputByteBufferNano.computeInt32Size(1, this.f40246a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeInt32(1, this.f40246a);
        codedOutputByteBufferNano.writeString(2, this.f40247b);
        codedOutputByteBufferNano.writeString(3, this.f40248c);
        codedOutputByteBufferNano.writeUInt64(4, this.f40249d);
        codedOutputByteBufferNano.writeUInt64(5, this.f40250e);
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C3106y2 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C3106y2().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3106y2 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.f40246a = readInt32;
                }
            } else if (readTag == 18) {
                this.f40247b = codedInputByteBufferNano.readString();
            } else if (readTag == 26) {
                this.f40248c = codedInputByteBufferNano.readString();
            } else if (readTag == 32) {
                this.f40249d = codedInputByteBufferNano.readUInt64();
            } else if (readTag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f40250e = codedInputByteBufferNano.readUInt64();
            }
        }
        return this;
    }

    public static C3106y2 a(byte[] bArr) {
        return (C3106y2) MessageNano.mergeFrom(new C3106y2(), bArr);
    }
}
