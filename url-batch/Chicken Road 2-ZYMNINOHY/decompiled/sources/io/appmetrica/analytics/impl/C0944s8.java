package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.s8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0944s8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0944s8[] f12722c;

    /* renamed from: a, reason: collision with root package name */
    public C0815n8 f12723a;

    /* renamed from: b, reason: collision with root package name */
    public C0867p8 f12724b;

    public C0944s8() {
        a();
    }

    public static C0944s8[] b() {
        if (f12722c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f12722c == null) {
                        f12722c = new C0944s8[0];
                    }
                } finally {
                }
            }
        }
        return f12722c;
    }

    public final C0944s8 a() {
        this.f12723a = null;
        this.f12724b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0815n8 c0815n8 = this.f12723a;
        if (c0815n8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0815n8);
        }
        C0867p8 c0867p8 = this.f12724b;
        return c0867p8 != null ? CodedOutputByteBufferNano.computeMessageSize(2, c0867p8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0815n8 c0815n8 = this.f12723a;
        if (c0815n8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0815n8);
        }
        C0867p8 c0867p8 = this.f12724b;
        if (c0867p8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0867p8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0944s8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f12723a == null) {
                    this.f12723a = new C0815n8();
                }
                codedInputByteBufferNano.readMessage(this.f12723a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f12724b == null) {
                    this.f12724b = new C0867p8();
                }
                codedInputByteBufferNano.readMessage(this.f12724b);
            }
        }
        return this;
    }

    public static C0944s8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0944s8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0944s8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0944s8) MessageNano.mergeFrom(new C0944s8(), bArr);
    }
}
