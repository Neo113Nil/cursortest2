package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.do, reason: invalid class name */
/* loaded from: classes3.dex */
public final class Cdo extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile Cdo[] f38883c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f38884a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f38885b;

    public Cdo() {
        a();
    }

    public static Cdo[] b() {
        if (f38883c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f38883c == null) {
                        f38883c = new Cdo[0];
                    }
                } finally {
                }
            }
        }
        return f38883c;
    }

    public final Cdo a() {
        this.f38884a = false;
        this.f38885b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z4 = this.f38884a;
        if (z4) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z4);
        }
        boolean z5 = this.f38885b;
        return z5 ? CodedOutputByteBufferNano.computeBoolSize(2, z5) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        boolean z4 = this.f38884a;
        if (z4) {
            codedOutputByteBufferNano.writeBool(1, z4);
        }
        boolean z5 = this.f38885b;
        if (z5) {
            codedOutputByteBufferNano.writeBool(2, z5);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Cdo mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f38884a = codedInputByteBufferNano.readBool();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f38885b = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static Cdo b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Cdo().mergeFrom(codedInputByteBufferNano);
    }

    public static Cdo a(byte[] bArr) {
        return (Cdo) MessageNano.mergeFrom(new Cdo(), bArr);
    }
}
