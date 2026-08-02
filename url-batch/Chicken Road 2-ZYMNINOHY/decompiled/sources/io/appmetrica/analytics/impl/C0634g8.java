package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.g8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0634g8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0634g8[] f11910c;

    /* renamed from: a, reason: collision with root package name */
    public long f11911a;

    /* renamed from: b, reason: collision with root package name */
    public int f11912b;

    public C0634g8() {
        a();
    }

    public static C0634g8[] b() {
        if (f11910c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f11910c == null) {
                        f11910c = new C0634g8[0];
                    }
                } finally {
                }
            }
        }
        return f11910c;
    }

    public final C0634g8 a() {
        this.f11911a = 0L;
        this.f11912b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j4 = this.f11911a;
        if (j4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j4);
        }
        int i4 = this.f11912b;
        return i4 != 0 ? CodedOutputByteBufferNano.computeInt32Size(2, i4) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j4 = this.f11911a;
        if (j4 != 0) {
            codedOutputByteBufferNano.writeInt64(1, j4);
        }
        int i4 = this.f11912b;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeInt32(2, i4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0634g8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f11911a = codedInputByteBufferNano.readInt64();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f11912b = codedInputByteBufferNano.readInt32();
            }
        }
        return this;
    }

    public static C0634g8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0634g8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0634g8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0634g8) MessageNano.mergeFrom(new C0634g8(), bArr);
    }
}
