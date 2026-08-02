package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.i8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0686i8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0686i8[] f12029c;

    /* renamed from: a, reason: collision with root package name */
    public int f12030a;

    /* renamed from: b, reason: collision with root package name */
    public C0582e8 f12031b;

    public C0686i8() {
        a();
    }

    public static C0686i8[] b() {
        if (f12029c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f12029c == null) {
                        f12029c = new C0686i8[0];
                    }
                } finally {
                }
            }
        }
        return f12029c;
    }

    public final C0686i8 a() {
        this.f12030a = 0;
        this.f12031b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i4 = this.f12030a;
        if (i4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i4);
        }
        C0582e8 c0582e8 = this.f12031b;
        return c0582e8 != null ? CodedOutputByteBufferNano.computeMessageSize(2, c0582e8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i4 = this.f12030a;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i4);
        }
        C0582e8 c0582e8 = this.f12031b;
        if (c0582e8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0582e8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0686i8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f12030a = codedInputByteBufferNano.readUInt32();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f12031b == null) {
                    this.f12031b = new C0582e8();
                }
                codedInputByteBufferNano.readMessage(this.f12031b);
            }
        }
        return this;
    }

    public static C0686i8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0686i8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0686i8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0686i8) MessageNano.mergeFrom(new C0686i8(), bArr);
    }
}
