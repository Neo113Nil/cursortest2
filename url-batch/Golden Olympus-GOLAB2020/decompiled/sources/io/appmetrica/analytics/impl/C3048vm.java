package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.vm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3048vm extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C3048vm[] f39986b;

    /* renamed from: a, reason: collision with root package name */
    public int f39987a;

    public C3048vm() {
        a();
    }

    public static C3048vm[] b() {
        if (f39986b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f39986b == null) {
                        f39986b = new C3048vm[0];
                    }
                } finally {
                }
            }
        }
        return f39986b;
    }

    public final C3048vm a() {
        this.f39987a = 86400;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i4 = this.f39987a;
        return i4 != 86400 ? CodedOutputByteBufferNano.computeUInt32Size(1, i4) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i4 = this.f39987a;
        if (i4 != 86400) {
            codedOutputByteBufferNano.writeUInt32(1, i4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3048vm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
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
                this.f39987a = codedInputByteBufferNano.readUInt32();
            }
        }
        return this;
    }

    public static C3048vm a(byte[] bArr) {
        return (C3048vm) MessageNano.mergeFrom(new C3048vm(), bArr);
    }

    public static C3048vm b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C3048vm().mergeFrom(codedInputByteBufferNano);
    }
}
