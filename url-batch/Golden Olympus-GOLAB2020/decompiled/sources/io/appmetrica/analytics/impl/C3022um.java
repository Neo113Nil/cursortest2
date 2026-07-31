package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.um, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3022um extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C3022um[] f39947c;

    /* renamed from: a, reason: collision with root package name */
    public long f39948a;

    /* renamed from: b, reason: collision with root package name */
    public long f39949b;

    public C3022um() {
        a();
    }

    public static C3022um[] b() {
        if (f39947c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f39947c == null) {
                        f39947c = new C3022um[0];
                    }
                } finally {
                }
            }
        }
        return f39947c;
    }

    public final C3022um a() {
        this.f39948a = 86400L;
        this.f39949b = 432000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt64Size(2, this.f39949b) + CodedOutputByteBufferNano.computeInt64Size(1, this.f39948a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeInt64(1, this.f39948a);
        codedOutputByteBufferNano.writeInt64(2, this.f39949b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3022um mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f39948a = codedInputByteBufferNano.readInt64();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f39949b = codedInputByteBufferNano.readInt64();
            }
        }
        return this;
    }

    public static C3022um b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C3022um().mergeFrom(codedInputByteBufferNano);
    }

    public static C3022um a(byte[] bArr) {
        return (C3022um) MessageNano.mergeFrom(new C3022um(), bArr);
    }
}
