package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.tm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0984tm extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0984tm[] f12789c;

    /* renamed from: a, reason: collision with root package name */
    public long f12790a;

    /* renamed from: b, reason: collision with root package name */
    public long f12791b;

    public C0984tm() {
        a();
    }

    public static C0984tm[] b() {
        if (f12789c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f12789c == null) {
                        f12789c = new C0984tm[0];
                    }
                } finally {
                }
            }
        }
        return f12789c;
    }

    public final C0984tm a() {
        this.f12790a = 86400L;
        this.f12791b = 432000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt64Size(2, this.f12791b) + CodedOutputByteBufferNano.computeInt64Size(1, this.f12790a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt64(1, this.f12790a);
        codedOutputByteBufferNano.writeInt64(2, this.f12791b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0984tm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f12790a = codedInputByteBufferNano.readInt64();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f12791b = codedInputByteBufferNano.readInt64();
            }
        }
        return this;
    }

    public static C0984tm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0984tm().mergeFrom(codedInputByteBufferNano);
    }

    public static C0984tm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0984tm) MessageNano.mergeFrom(new C0984tm(), bArr);
    }
}
