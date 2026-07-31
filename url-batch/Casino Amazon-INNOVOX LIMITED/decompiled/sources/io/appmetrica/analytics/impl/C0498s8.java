package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.s8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0498s8 extends MessageNano {
    public static volatile C0498s8[] c;

    /* renamed from: a, reason: collision with root package name */
    public C0399o8 f1482a;
    public C0473r8 b;

    public C0498s8() {
        a();
    }

    public static C0498s8[] b() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (c == null) {
                    c = new C0498s8[0];
                }
            }
        }
        return c;
    }

    public final C0498s8 a() {
        this.f1482a = null;
        this.b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0399o8 c0399o8 = this.f1482a;
        if (c0399o8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0399o8);
        }
        C0473r8 c0473r8 = this.b;
        return c0473r8 != null ? CodedOutputByteBufferNano.computeMessageSize(2, c0473r8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0399o8 c0399o8 = this.f1482a;
        if (c0399o8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0399o8);
        }
        C0473r8 c0473r8 = this.b;
        if (c0473r8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0473r8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0498s8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f1482a == null) {
                    this.f1482a = new C0399o8();
                }
                codedInputByteBufferNano.readMessage(this.f1482a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.b == null) {
                    this.b = new C0473r8();
                }
                codedInputByteBufferNano.readMessage(this.b);
            }
        }
        return this;
    }

    public static C0498s8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0498s8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0498s8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0498s8) MessageNano.mergeFrom(new C0498s8(), bArr);
    }
}
