package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.o8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0719o8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0719o8[] f7991c;

    /* renamed from: a, reason: collision with root package name */
    public int f7992a;

    /* renamed from: b, reason: collision with root package name */
    public C0615k8 f7993b;

    public C0719o8() {
        a();
    }

    public static C0719o8[] b() {
        if (f7991c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7991c == null) {
                        f7991c = new C0719o8[0];
                    }
                } finally {
                }
            }
        }
        return f7991c;
    }

    public final C0719o8 a() {
        this.f7992a = 0;
        this.f7993b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i3 = this.f7992a;
        if (i3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i3);
        }
        C0615k8 c0615k8 = this.f7993b;
        return c0615k8 != null ? CodedOutputByteBufferNano.computeMessageSize(2, c0615k8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i3 = this.f7992a;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i3);
        }
        C0615k8 c0615k8 = this.f7993b;
        if (c0615k8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0615k8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0719o8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f7992a = codedInputByteBufferNano.readUInt32();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f7993b == null) {
                    this.f7993b = new C0615k8();
                }
                codedInputByteBufferNano.readMessage(this.f7993b);
            }
        }
        return this;
    }

    public static C0719o8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0719o8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0719o8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0719o8) MessageNano.mergeFrom(new C0719o8(), bArr);
    }
}
