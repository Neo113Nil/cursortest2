package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.xm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0966xm extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0966xm[] f8624c;

    /* renamed from: a, reason: collision with root package name */
    public long f8625a;

    /* renamed from: b, reason: collision with root package name */
    public long f8626b;

    public C0966xm() {
        a();
    }

    public static C0966xm[] b() {
        if (f8624c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8624c == null) {
                        f8624c = new C0966xm[0];
                    }
                } finally {
                }
            }
        }
        return f8624c;
    }

    public final C0966xm a() {
        this.f8625a = 86400L;
        this.f8626b = 432000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt64Size(2, this.f8626b) + CodedOutputByteBufferNano.computeInt64Size(1, this.f8625a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt64(1, this.f8625a);
        codedOutputByteBufferNano.writeInt64(2, this.f8626b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0966xm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f8625a = codedInputByteBufferNano.readInt64();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f8626b = codedInputByteBufferNano.readInt64();
            }
        }
        return this;
    }

    public static C0966xm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0966xm().mergeFrom(codedInputByteBufferNano);
    }

    public static C0966xm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0966xm) MessageNano.mergeFrom(new C0966xm(), bArr);
    }
}
