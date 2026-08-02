package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class S extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile S[] f9008c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f9009a;

    /* renamed from: b, reason: collision with root package name */
    public Q f9010b;

    public S() {
        a();
    }

    public static S[] b() {
        if (f9008c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9008c == null) {
                        f9008c = new S[0];
                    }
                } finally {
                }
            }
        }
        return f9008c;
    }

    public final S a() {
        this.f9009a = true;
        this.f9010b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z = this.f9009a;
        if (!z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z);
        }
        Q q3 = this.f9010b;
        return q3 != null ? CodedOutputByteBufferNano.computeMessageSize(2, q3) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z = this.f9009a;
        if (!z) {
            codedOutputByteBufferNano.writeBool(1, z);
        }
        Q q3 = this.f9010b;
        if (q3 != null) {
            codedOutputByteBufferNano.writeMessage(2, q3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final S mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f9009a = codedInputByteBufferNano.readBool();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f9010b == null) {
                    this.f9010b = new Q();
                }
                codedInputByteBufferNano.readMessage(this.f9010b);
            }
        }
        return this;
    }

    public static S b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new S().mergeFrom(codedInputByteBufferNano);
    }

    public static S a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (S) MessageNano.mergeFrom(new S(), bArr);
    }
}
