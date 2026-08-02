package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class m extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f9940c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f9941d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static volatile m[] f9942e;

    /* renamed from: a, reason: collision with root package name */
    public boolean f9943a;

    /* renamed from: b, reason: collision with root package name */
    public l f9944b;

    public m() {
        a();
    }

    public static m[] b() {
        if (f9942e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9942e == null) {
                        f9942e = new m[0];
                    }
                } finally {
                }
            }
        }
        return f9942e;
    }

    public final m a() {
        this.f9943a = false;
        this.f9944b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z = this.f9943a;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z);
        }
        l lVar = this.f9944b;
        return lVar != null ? CodedOutputByteBufferNano.computeMessageSize(2, lVar) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z = this.f9943a;
        if (z) {
            codedOutputByteBufferNano.writeBool(1, z);
        }
        l lVar = this.f9944b;
        if (lVar != null) {
            codedOutputByteBufferNano.writeMessage(2, lVar);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final m mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f9943a = codedInputByteBufferNano.readBool();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f9944b == null) {
                    this.f9944b = new l();
                }
                codedInputByteBufferNano.readMessage(this.f9944b);
            }
        }
        return this;
    }

    public static m b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new m().mergeFrom(codedInputByteBufferNano);
    }

    public static m a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (m) MessageNano.mergeFrom(new m(), bArr);
    }
}
