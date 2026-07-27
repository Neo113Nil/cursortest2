package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.ho, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0705ho extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static final int f8364e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f8365f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f8366g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final int f8367h = 3;

    /* renamed from: i, reason: collision with root package name */
    public static volatile C0705ho[] f8368i;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f8369a;

    /* renamed from: b, reason: collision with root package name */
    public int f8370b;

    /* renamed from: c, reason: collision with root package name */
    public C0730io f8371c;

    /* renamed from: d, reason: collision with root package name */
    public C0756jo f8372d;

    public C0705ho() {
        a();
    }

    public static C0705ho[] b() {
        if (f8368i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8368i == null) {
                        f8368i = new C0705ho[0];
                    }
                } finally {
                }
            }
        }
        return f8368i;
    }

    public final C0705ho a() {
        this.f8369a = WireFormatNano.EMPTY_BYTES;
        this.f8370b = 0;
        this.f8371c = null;
        this.f8372d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeInt32Size = CodedOutputByteBufferNano.computeInt32Size(2, this.f8370b) + CodedOutputByteBufferNano.computeBytesSize(1, this.f8369a) + super.computeSerializedSize();
        C0730io c0730io = this.f8371c;
        if (c0730io != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(3, c0730io);
        }
        C0756jo c0756jo = this.f8372d;
        return c0756jo != null ? computeInt32Size + CodedOutputByteBufferNano.computeMessageSize(4, c0756jo) : computeInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeBytes(1, this.f8369a);
        codedOutputByteBufferNano.writeInt32(2, this.f8370b);
        C0730io c0730io = this.f8371c;
        if (c0730io != null) {
            codedOutputByteBufferNano.writeMessage(3, c0730io);
        }
        C0756jo c0756jo = this.f8372d;
        if (c0756jo != null) {
            codedOutputByteBufferNano.writeMessage(4, c0756jo);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0705ho mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f8369a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 16) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.f8370b = readInt32;
                }
            } else if (readTag == 26) {
                if (this.f8371c == null) {
                    this.f8371c = new C0730io();
                }
                codedInputByteBufferNano.readMessage(this.f8371c);
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f8372d == null) {
                    this.f8372d = new C0756jo();
                }
                codedInputByteBufferNano.readMessage(this.f8372d);
            }
        }
    }

    public static C0705ho b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0705ho().mergeFrom(codedInputByteBufferNano);
    }

    public static C0705ho a(byte[] bArr) {
        return (C0705ho) MessageNano.mergeFrom(new C0705ho(), bArr);
    }
}
