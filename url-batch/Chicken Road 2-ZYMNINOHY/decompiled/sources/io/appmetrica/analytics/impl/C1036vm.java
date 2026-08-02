package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.vm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1036vm extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C1036vm[] f12903b;

    /* renamed from: a, reason: collision with root package name */
    public long f12904a;

    public C1036vm() {
        a();
    }

    public static C1036vm[] b() {
        if (f12903b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f12903b == null) {
                        f12903b = new C1036vm[0];
                    }
                } finally {
                }
            }
        }
        return f12903b;
    }

    public final C1036vm a() {
        this.f12904a = 18000000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt64Size(1, this.f12904a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt64(1, this.f12904a);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1036vm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag != 8) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f12904a = codedInputByteBufferNano.readInt64();
            }
        }
        return this;
    }

    public static C1036vm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C1036vm) MessageNano.mergeFrom(new C1036vm(), bArr);
    }

    public static C1036vm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C1036vm().mergeFrom(codedInputByteBufferNano);
    }
}
