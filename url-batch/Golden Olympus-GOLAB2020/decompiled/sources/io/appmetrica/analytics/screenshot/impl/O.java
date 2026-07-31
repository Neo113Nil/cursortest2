package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes3.dex */
public final class O extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile O[] f40716c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f40717a;

    /* renamed from: b, reason: collision with root package name */
    public N f40718b;

    public O() {
        a();
    }

    public static O[] b() {
        if (f40716c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f40716c == null) {
                        f40716c = new O[0];
                    }
                } finally {
                }
            }
        }
        return f40716c;
    }

    public final O a() {
        this.f40717a = true;
        this.f40718b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z4 = this.f40717a;
        if (!z4) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z4);
        }
        N n4 = this.f40718b;
        return n4 != null ? CodedOutputByteBufferNano.computeMessageSize(2, n4) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        boolean z4 = this.f40717a;
        if (!z4) {
            codedOutputByteBufferNano.writeBool(1, z4);
        }
        N n4 = this.f40718b;
        if (n4 != null) {
            codedOutputByteBufferNano.writeMessage(2, n4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final O mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f40717a = codedInputByteBufferNano.readBool();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f40718b == null) {
                    this.f40718b = new N();
                }
                codedInputByteBufferNano.readMessage(this.f40718b);
            }
        }
        return this;
    }

    public static O b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new O().mergeFrom(codedInputByteBufferNano);
    }

    public static O a(byte[] bArr) {
        return (O) MessageNano.mergeFrom(new O(), bArr);
    }
}
