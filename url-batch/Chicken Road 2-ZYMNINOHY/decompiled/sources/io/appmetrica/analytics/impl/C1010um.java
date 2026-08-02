package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.um, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1010um extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C1010um[] f12854b;

    /* renamed from: a, reason: collision with root package name */
    public int f12855a;

    public C1010um() {
        a();
    }

    public static C1010um[] b() {
        if (f12854b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f12854b == null) {
                        f12854b = new C1010um[0];
                    }
                } finally {
                }
            }
        }
        return f12854b;
    }

    public final C1010um a() {
        this.f12855a = 86400;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i4 = this.f12855a;
        return i4 != 86400 ? CodedOutputByteBufferNano.computeUInt32Size(1, i4) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i4 = this.f12855a;
        if (i4 != 86400) {
            codedOutputByteBufferNano.writeUInt32(1, i4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1010um mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                this.f12855a = codedInputByteBufferNano.readUInt32();
            }
        }
        return this;
    }

    public static C1010um a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C1010um) MessageNano.mergeFrom(new C1010um(), bArr);
    }

    public static C1010um b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C1010um().mergeFrom(codedInputByteBufferNano);
    }
}
