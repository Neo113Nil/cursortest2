package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.vm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0587vm extends MessageNano {
    public static volatile C0587vm[] b;

    /* renamed from: a, reason: collision with root package name */
    public int f1540a;

    public C0587vm() {
        a();
    }

    public static C0587vm[] b() {
        if (b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (b == null) {
                    b = new C0587vm[0];
                }
            }
        }
        return b;
    }

    public final C0587vm a() {
        this.f1540a = 86400;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f1540a;
        return i != 86400 ? CodedOutputByteBufferNano.computeUInt32Size(1, i) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.f1540a;
        if (i != 86400) {
            codedOutputByteBufferNano.writeUInt32(1, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0587vm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                this.f1540a = codedInputByteBufferNano.readUInt32();
            }
        }
        return this;
    }

    public static C0587vm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0587vm().mergeFrom(codedInputByteBufferNano);
    }

    public static C0587vm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0587vm) MessageNano.mergeFrom(new C0587vm(), bArr);
    }
}
