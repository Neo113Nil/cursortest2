package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.io, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0579io extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0579io[] f7577c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f7578a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7579b;

    public C0579io() {
        a();
    }

    public static C0579io[] b() {
        if (f7577c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7577c == null) {
                        f7577c = new C0579io[0];
                    }
                } finally {
                }
            }
        }
        return f7577c;
    }

    public final C0579io a() {
        this.f7578a = false;
        this.f7579b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z = this.f7578a;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z);
        }
        boolean z2 = this.f7579b;
        return z2 ? CodedOutputByteBufferNano.computeBoolSize(2, z2) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z = this.f7578a;
        if (z) {
            codedOutputByteBufferNano.writeBool(1, z);
        }
        boolean z2 = this.f7579b;
        if (z2) {
            codedOutputByteBufferNano.writeBool(2, z2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0579io mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f7578a = codedInputByteBufferNano.readBool();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f7579b = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static C0579io b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0579io().mergeFrom(codedInputByteBufferNano);
    }

    public static C0579io a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0579io) MessageNano.mergeFrom(new C0579io(), bArr);
    }
}
