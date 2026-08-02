package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.m8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0667m8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0667m8[] f7864c;

    /* renamed from: a, reason: collision with root package name */
    public long f7865a;

    /* renamed from: b, reason: collision with root package name */
    public int f7866b;

    public C0667m8() {
        a();
    }

    public static C0667m8[] b() {
        if (f7864c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7864c == null) {
                        f7864c = new C0667m8[0];
                    }
                } finally {
                }
            }
        }
        return f7864c;
    }

    public final C0667m8 a() {
        this.f7865a = 0L;
        this.f7866b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j3 = this.f7865a;
        if (j3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j3);
        }
        int i3 = this.f7866b;
        return i3 != 0 ? CodedOutputByteBufferNano.computeInt32Size(2, i3) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j3 = this.f7865a;
        if (j3 != 0) {
            codedOutputByteBufferNano.writeInt64(1, j3);
        }
        int i3 = this.f7866b;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeInt32(2, i3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0667m8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f7865a = codedInputByteBufferNano.readInt64();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f7866b = codedInputByteBufferNano.readInt32();
            }
        }
        return this;
    }

    public static C0667m8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0667m8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0667m8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0667m8) MessageNano.mergeFrom(new C0667m8(), bArr);
    }
}
