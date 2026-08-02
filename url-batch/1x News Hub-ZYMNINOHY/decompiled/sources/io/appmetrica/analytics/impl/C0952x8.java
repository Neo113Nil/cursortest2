package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.x8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0952x8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0952x8[] f8613c;

    /* renamed from: a, reason: collision with root package name */
    public C0848t8 f8614a;

    /* renamed from: b, reason: collision with root package name */
    public C0926w8 f8615b;

    public C0952x8() {
        a();
    }

    public static C0952x8[] b() {
        if (f8613c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8613c == null) {
                        f8613c = new C0952x8[0];
                    }
                } finally {
                }
            }
        }
        return f8613c;
    }

    public final C0952x8 a() {
        this.f8614a = null;
        this.f8615b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0848t8 c0848t8 = this.f8614a;
        if (c0848t8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0848t8);
        }
        C0926w8 c0926w8 = this.f8615b;
        return c0926w8 != null ? CodedOutputByteBufferNano.computeMessageSize(2, c0926w8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0848t8 c0848t8 = this.f8614a;
        if (c0848t8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0848t8);
        }
        C0926w8 c0926w8 = this.f8615b;
        if (c0926w8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0926w8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0952x8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f8614a == null) {
                    this.f8614a = new C0848t8();
                }
                codedInputByteBufferNano.readMessage(this.f8614a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f8615b == null) {
                    this.f8615b = new C0926w8();
                }
                codedInputByteBufferNano.readMessage(this.f8615b);
            }
        }
        return this;
    }

    public static C0952x8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0952x8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0952x8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0952x8) MessageNano.mergeFrom(new C0952x8(), bArr);
    }
}
