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
    public static volatile S[] f13437c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f13438a;

    /* renamed from: b, reason: collision with root package name */
    public Q f13439b;

    public S() {
        a();
    }

    public static S[] b() {
        if (f13437c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f13437c == null) {
                        f13437c = new S[0];
                    }
                } finally {
                }
            }
        }
        return f13437c;
    }

    public final S a() {
        this.f13438a = true;
        this.f13439b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z = this.f13438a;
        if (!z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z);
        }
        Q q4 = this.f13439b;
        return q4 != null ? CodedOutputByteBufferNano.computeMessageSize(2, q4) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z = this.f13438a;
        if (!z) {
            codedOutputByteBufferNano.writeBool(1, z);
        }
        Q q4 = this.f13439b;
        if (q4 != null) {
            codedOutputByteBufferNano.writeMessage(2, q4);
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
                this.f13438a = codedInputByteBufferNano.readBool();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f13439b == null) {
                    this.f13439b = new Q();
                }
                codedInputByteBufferNano.readMessage(this.f13439b);
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
