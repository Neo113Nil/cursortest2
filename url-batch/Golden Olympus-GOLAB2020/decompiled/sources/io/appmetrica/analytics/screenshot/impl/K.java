package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes3.dex */
public final class K extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile K[] f40703b;

    /* renamed from: a, reason: collision with root package name */
    public boolean f40704a;

    public K() {
        a();
    }

    public static K[] b() {
        if (f40703b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f40703b == null) {
                        f40703b = new K[0];
                    }
                } finally {
                }
            }
        }
        return f40703b;
    }

    public final K a() {
        this.f40704a = true;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z4 = this.f40704a;
        return !z4 ? CodedOutputByteBufferNano.computeBoolSize(1, z4) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        boolean z4 = this.f40704a;
        if (!z4) {
            codedOutputByteBufferNano.writeBool(1, z4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final K mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
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
                this.f40704a = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static K a(byte[] bArr) {
        return (K) MessageNano.mergeFrom(new K(), bArr);
    }

    public static K b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new K().mergeFrom(codedInputByteBufferNano);
    }
}
