package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.om, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2867om extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C2867om[] f39589c;

    /* renamed from: a, reason: collision with root package name */
    public int f39590a;

    /* renamed from: b, reason: collision with root package name */
    public int f39591b;

    public C2867om() {
        a();
    }

    public static C2867om[] b() {
        if (f39589c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f39589c == null) {
                        f39589c = new C2867om[0];
                    }
                } finally {
                }
            }
        }
        return f39589c;
    }

    public final C2867om a() {
        this.f39590a = 86400;
        this.f39591b = 86400;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i4 = this.f39590a;
        if (i4 != 86400) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i4);
        }
        int i5 = this.f39591b;
        return i5 != 86400 ? CodedOutputByteBufferNano.computeInt32Size(2, i5) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i4 = this.f39590a;
        if (i4 != 86400) {
            codedOutputByteBufferNano.writeInt32(1, i4);
        }
        int i5 = this.f39591b;
        if (i5 != 86400) {
            codedOutputByteBufferNano.writeInt32(2, i5);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2867om mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f39590a = codedInputByteBufferNano.readInt32();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f39591b = codedInputByteBufferNano.readInt32();
            }
        }
        return this;
    }

    public static C2867om b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2867om().mergeFrom(codedInputByteBufferNano);
    }

    public static C2867om a(byte[] bArr) {
        return (C2867om) MessageNano.mergeFrom(new C2867om(), bArr);
    }
}
