package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.r8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0918r8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0918r8[] f12653c;

    /* renamed from: a, reason: collision with root package name */
    public C0815n8 f12654a;

    /* renamed from: b, reason: collision with root package name */
    public C0893q8 f12655b;

    public C0918r8() {
        a();
    }

    public static C0918r8[] b() {
        if (f12653c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f12653c == null) {
                        f12653c = new C0918r8[0];
                    }
                } finally {
                }
            }
        }
        return f12653c;
    }

    public final C0918r8 a() {
        this.f12654a = null;
        this.f12655b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0815n8 c0815n8 = this.f12654a;
        if (c0815n8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0815n8);
        }
        C0893q8 c0893q8 = this.f12655b;
        return c0893q8 != null ? CodedOutputByteBufferNano.computeMessageSize(2, c0893q8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0815n8 c0815n8 = this.f12654a;
        if (c0815n8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0815n8);
        }
        C0893q8 c0893q8 = this.f12655b;
        if (c0893q8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0893q8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0918r8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f12654a == null) {
                    this.f12654a = new C0815n8();
                }
                codedInputByteBufferNano.readMessage(this.f12654a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f12655b == null) {
                    this.f12655b = new C0893q8();
                }
                codedInputByteBufferNano.readMessage(this.f12655b);
            }
        }
        return this;
    }

    public static C0918r8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0918r8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0918r8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0918r8) MessageNano.mergeFrom(new C0918r8(), bArr);
    }
}
