package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.y8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0977y8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0977y8[] f8637c;

    /* renamed from: a, reason: collision with root package name */
    public C0848t8 f8638a;

    /* renamed from: b, reason: collision with root package name */
    public C0900v8 f8639b;

    public C0977y8() {
        a();
    }

    public static C0977y8[] b() {
        if (f8637c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8637c == null) {
                        f8637c = new C0977y8[0];
                    }
                } finally {
                }
            }
        }
        return f8637c;
    }

    public final C0977y8 a() {
        this.f8638a = null;
        this.f8639b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0848t8 c0848t8 = this.f8638a;
        if (c0848t8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0848t8);
        }
        C0900v8 c0900v8 = this.f8639b;
        return c0900v8 != null ? CodedOutputByteBufferNano.computeMessageSize(2, c0900v8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0848t8 c0848t8 = this.f8638a;
        if (c0848t8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0848t8);
        }
        C0900v8 c0900v8 = this.f8639b;
        if (c0900v8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0900v8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0977y8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f8638a == null) {
                    this.f8638a = new C0848t8();
                }
                codedInputByteBufferNano.readMessage(this.f8638a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f8639b == null) {
                    this.f8639b = new C0900v8();
                }
                codedInputByteBufferNano.readMessage(this.f8639b);
            }
        }
        return this;
    }

    public static C0977y8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0977y8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0977y8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0977y8) MessageNano.mergeFrom(new C0977y8(), bArr);
    }
}
