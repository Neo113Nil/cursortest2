package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.y8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1128y8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C1128y8[] f9593c;

    /* renamed from: a, reason: collision with root package name */
    public C0999t8 f9594a;

    /* renamed from: b, reason: collision with root package name */
    public C1051v8 f9595b;

    public C1128y8() {
        a();
    }

    public static C1128y8[] b() {
        if (f9593c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9593c == null) {
                        f9593c = new C1128y8[0];
                    }
                } finally {
                }
            }
        }
        return f9593c;
    }

    public final C1128y8 a() {
        this.f9594a = null;
        this.f9595b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0999t8 c0999t8 = this.f9594a;
        if (c0999t8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0999t8);
        }
        C1051v8 c1051v8 = this.f9595b;
        return c1051v8 != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c1051v8) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C0999t8 c0999t8 = this.f9594a;
        if (c0999t8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0999t8);
        }
        C1051v8 c1051v8 = this.f9595b;
        if (c1051v8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c1051v8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1128y8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f9594a == null) {
                    this.f9594a = new C0999t8();
                }
                codedInputByteBufferNano.readMessage(this.f9594a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f9595b == null) {
                    this.f9595b = new C1051v8();
                }
                codedInputByteBufferNano.readMessage(this.f9595b);
            }
        }
    }

    public static C1128y8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1128y8().mergeFrom(codedInputByteBufferNano);
    }

    public static C1128y8 a(byte[] bArr) {
        return (C1128y8) MessageNano.mergeFrom(new C1128y8(), bArr);
    }
}
