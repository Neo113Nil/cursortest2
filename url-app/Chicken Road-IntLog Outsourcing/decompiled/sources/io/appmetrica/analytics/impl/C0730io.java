package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.io, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0730io extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0730io[] f8466c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f8467a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8468b;

    public C0730io() {
        a();
    }

    public static C0730io[] b() {
        if (f8466c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8466c == null) {
                        f8466c = new C0730io[0];
                    }
                } finally {
                }
            }
        }
        return f8466c;
    }

    public final C0730io a() {
        this.f8467a = false;
        this.f8468b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z = this.f8467a;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z);
        }
        boolean z5 = this.f8468b;
        return z5 ? computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(2, z5) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        boolean z = this.f8467a;
        if (z) {
            codedOutputByteBufferNano.writeBool(1, z);
        }
        boolean z5 = this.f8468b;
        if (z5) {
            codedOutputByteBufferNano.writeBool(2, z5);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0730io mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f8467a = codedInputByteBufferNano.readBool();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f8468b = codedInputByteBufferNano.readBool();
            }
        }
    }

    public static C0730io b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0730io().mergeFrom(codedInputByteBufferNano);
    }

    public static C0730io a(byte[] bArr) {
        return (C0730io) MessageNano.mergeFrom(new C0730io(), bArr);
    }
}
