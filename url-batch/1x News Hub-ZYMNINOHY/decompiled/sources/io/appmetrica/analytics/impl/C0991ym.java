package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.ym, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0991ym extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0991ym[] f8647b;

    /* renamed from: a, reason: collision with root package name */
    public int f8648a;

    public C0991ym() {
        a();
    }

    public static C0991ym[] b() {
        if (f8647b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8647b == null) {
                        f8647b = new C0991ym[0];
                    }
                } finally {
                }
            }
        }
        return f8647b;
    }

    public final C0991ym a() {
        this.f8648a = 86400;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i3 = this.f8648a;
        return i3 != 86400 ? CodedOutputByteBufferNano.computeUInt32Size(1, i3) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i3 = this.f8648a;
        if (i3 != 86400) {
            codedOutputByteBufferNano.writeUInt32(1, i3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0991ym mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                this.f8648a = codedInputByteBufferNano.readUInt32();
            }
        }
        return this;
    }

    public static C0991ym a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0991ym) MessageNano.mergeFrom(new C0991ym(), bArr);
    }

    public static C0991ym b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0991ym().mergeFrom(codedInputByteBufferNano);
    }
}
