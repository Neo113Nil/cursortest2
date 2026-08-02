package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class W1 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile W1[] f11156c;

    /* renamed from: a, reason: collision with root package name */
    public String f11157a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f11158b;

    public W1() {
        a();
    }

    public static W1[] b() {
        if (f11156c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f11156c == null) {
                        f11156c = new W1[0];
                    }
                } finally {
                }
            }
        }
        return f11156c;
    }

    public final W1 a() {
        this.f11157a = "";
        this.f11158b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeBoolSize(2, this.f11158b) + CodedOutputByteBufferNano.computeStringSize(1, this.f11157a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f11157a);
        codedOutputByteBufferNano.writeBool(2, this.f11158b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final W1 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f11157a = codedInputByteBufferNano.readString();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f11158b = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static W1 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new W1().mergeFrom(codedInputByteBufferNano);
    }

    public static W1 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (W1) MessageNano.mergeFrom(new W1(), bArr);
    }
}
