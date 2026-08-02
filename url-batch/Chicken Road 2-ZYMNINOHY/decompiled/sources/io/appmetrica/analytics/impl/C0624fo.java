package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.fo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0624fo extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static final int f11885e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f11886f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f11887g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final int f11888h = 3;

    /* renamed from: i, reason: collision with root package name */
    public static volatile C0624fo[] f11889i;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f11890a;

    /* renamed from: b, reason: collision with root package name */
    public int f11891b;

    /* renamed from: c, reason: collision with root package name */
    public C0650go f11892c;

    /* renamed from: d, reason: collision with root package name */
    public C0676ho f11893d;

    public C0624fo() {
        a();
    }

    public static C0624fo[] b() {
        if (f11889i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f11889i == null) {
                        f11889i = new C0624fo[0];
                    }
                } finally {
                }
            }
        }
        return f11889i;
    }

    public final C0624fo a() {
        this.f11890a = WireFormatNano.EMPTY_BYTES;
        this.f11891b = 0;
        this.f11892c = null;
        this.f11893d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeInt32Size = CodedOutputByteBufferNano.computeInt32Size(2, this.f11891b) + CodedOutputByteBufferNano.computeBytesSize(1, this.f11890a) + super.computeSerializedSize();
        C0650go c0650go = this.f11892c;
        if (c0650go != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(3, c0650go);
        }
        C0676ho c0676ho = this.f11893d;
        return c0676ho != null ? CodedOutputByteBufferNano.computeMessageSize(4, c0676ho) + computeInt32Size : computeInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBytes(1, this.f11890a);
        codedOutputByteBufferNano.writeInt32(2, this.f11891b);
        C0650go c0650go = this.f11892c;
        if (c0650go != null) {
            codedOutputByteBufferNano.writeMessage(3, c0650go);
        }
        C0676ho c0676ho = this.f11893d;
        if (c0676ho != null) {
            codedOutputByteBufferNano.writeMessage(4, c0676ho);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0624fo mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f11890a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 16) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.f11891b = readInt32;
                }
            } else if (readTag == 26) {
                if (this.f11892c == null) {
                    this.f11892c = new C0650go();
                }
                codedInputByteBufferNano.readMessage(this.f11892c);
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f11893d == null) {
                    this.f11893d = new C0676ho();
                }
                codedInputByteBufferNano.readMessage(this.f11893d);
            }
        }
        return this;
    }

    public static C0624fo b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0624fo().mergeFrom(codedInputByteBufferNano);
    }

    public static C0624fo a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0624fo) MessageNano.mergeFrom(new C0624fo(), bArr);
    }
}
