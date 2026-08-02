package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class Y8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile Y8[] f11293c;

    /* renamed from: a, reason: collision with root package name */
    public String f11294a;

    /* renamed from: b, reason: collision with root package name */
    public String f11295b;

    public Y8() {
        a();
    }

    public static Y8[] b() {
        if (f11293c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f11293c == null) {
                        f11293c = new Y8[0];
                    }
                } finally {
                }
            }
        }
        return f11293c;
    }

    public final Y8 a() {
        this.f11294a = "";
        this.f11295b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeStringSize(2, this.f11295b) + CodedOutputByteBufferNano.computeStringSize(1, this.f11294a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f11294a);
        codedOutputByteBufferNano.writeString(2, this.f11295b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Y8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f11294a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f11295b = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static Y8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Y8().mergeFrom(codedInputByteBufferNano);
    }

    public static Y8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Y8) MessageNano.mergeFrom(new Y8(), bArr);
    }
}
