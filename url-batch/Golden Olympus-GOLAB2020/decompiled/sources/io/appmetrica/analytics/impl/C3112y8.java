package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.y8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3112y8 extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C3112y8[] f40262e;

    /* renamed from: a, reason: collision with root package name */
    public H8 f40263a;

    /* renamed from: b, reason: collision with root package name */
    public J8 f40264b;

    /* renamed from: c, reason: collision with root package name */
    public A8 f40265c;

    /* renamed from: d, reason: collision with root package name */
    public G8 f40266d;

    public C3112y8() {
        a();
    }

    public static C3112y8[] b() {
        if (f40262e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f40262e == null) {
                        f40262e = new C3112y8[0];
                    }
                } finally {
                }
            }
        }
        return f40262e;
    }

    public final C3112y8 a() {
        this.f40263a = null;
        this.f40264b = null;
        this.f40265c = null;
        this.f40266d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        H8 h8 = this.f40263a;
        if (h8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, h8);
        }
        J8 j8 = this.f40264b;
        if (j8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, j8);
        }
        A8 a8 = this.f40265c;
        if (a8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, a8);
        }
        G8 g8 = this.f40266d;
        return g8 != null ? CodedOutputByteBufferNano.computeMessageSize(4, g8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        H8 h8 = this.f40263a;
        if (h8 != null) {
            codedOutputByteBufferNano.writeMessage(1, h8);
        }
        J8 j8 = this.f40264b;
        if (j8 != null) {
            codedOutputByteBufferNano.writeMessage(2, j8);
        }
        A8 a8 = this.f40265c;
        if (a8 != null) {
            codedOutputByteBufferNano.writeMessage(3, a8);
        }
        G8 g8 = this.f40266d;
        if (g8 != null) {
            codedOutputByteBufferNano.writeMessage(4, g8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3112y8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f40263a == null) {
                    this.f40263a = new H8();
                }
                codedInputByteBufferNano.readMessage(this.f40263a);
            } else if (readTag == 18) {
                if (this.f40264b == null) {
                    this.f40264b = new J8();
                }
                codedInputByteBufferNano.readMessage(this.f40264b);
            } else if (readTag == 26) {
                if (this.f40265c == null) {
                    this.f40265c = new A8();
                }
                codedInputByteBufferNano.readMessage(this.f40265c);
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f40266d == null) {
                    this.f40266d = new G8();
                }
                codedInputByteBufferNano.readMessage(this.f40266d);
            }
        }
        return this;
    }

    public static C3112y8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C3112y8().mergeFrom(codedInputByteBufferNano);
    }

    public static C3112y8 a(byte[] bArr) {
        return (C3112y8) MessageNano.mergeFrom(new C3112y8(), bArr);
    }
}
