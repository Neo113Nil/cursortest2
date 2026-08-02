package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.w7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0925w7 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C0925w7[] f8551d;

    /* renamed from: a, reason: collision with root package name */
    public long f8552a;

    /* renamed from: b, reason: collision with root package name */
    public long f8553b;

    /* renamed from: c, reason: collision with root package name */
    public int f8554c;

    public C0925w7() {
        a();
    }

    public static C0925w7[] b() {
        if (f8551d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8551d == null) {
                        f8551d = new C0925w7[0];
                    }
                } finally {
                }
            }
        }
        return f8551d;
    }

    public final C0925w7 a() {
        this.f8552a = -1L;
        this.f8553b = -1L;
        this.f8554c = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j3 = this.f8552a;
        if (j3 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j3);
        }
        long j4 = this.f8553b;
        if (j4 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(2, j4);
        }
        int i3 = this.f8554c;
        return i3 != -1 ? CodedOutputByteBufferNano.computeInt32Size(3, i3) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j3 = this.f8552a;
        if (j3 != -1) {
            codedOutputByteBufferNano.writeInt64(1, j3);
        }
        long j4 = this.f8553b;
        if (j4 != -1) {
            codedOutputByteBufferNano.writeInt64(2, j4);
        }
        int i3 = this.f8554c;
        if (i3 != -1) {
            codedOutputByteBufferNano.writeInt32(3, i3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0925w7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f8552a = codedInputByteBufferNano.readInt64();
            } else if (readTag == 16) {
                this.f8553b = codedInputByteBufferNano.readInt64();
            } else if (readTag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == -1 || readInt32 == 0 || readInt32 == 1) {
                    this.f8554c = readInt32;
                }
            }
        }
        return this;
    }

    public static C0925w7 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0925w7().mergeFrom(codedInputByteBufferNano);
    }

    public static C0925w7 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0925w7) MessageNano.mergeFrom(new C0925w7(), bArr);
    }
}
