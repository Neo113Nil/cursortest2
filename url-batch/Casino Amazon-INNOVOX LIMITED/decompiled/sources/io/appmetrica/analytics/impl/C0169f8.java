package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.f8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0169f8 extends MessageNano {
    public static volatile C0169f8[] e;

    /* renamed from: a, reason: collision with root package name */
    public C0399o8 f1253a;
    public C0449q8 b;
    public C0221h8 c;
    public C0374n8 d;

    public C0169f8() {
        a();
    }

    public static C0169f8[] b() {
        if (e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (e == null) {
                    e = new C0169f8[0];
                }
            }
        }
        return e;
    }

    public final C0169f8 a() {
        this.f1253a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0399o8 c0399o8 = this.f1253a;
        if (c0399o8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0399o8);
        }
        C0449q8 c0449q8 = this.b;
        if (c0449q8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c0449q8);
        }
        C0221h8 c0221h8 = this.c;
        if (c0221h8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c0221h8);
        }
        C0374n8 c0374n8 = this.d;
        return c0374n8 != null ? CodedOutputByteBufferNano.computeMessageSize(4, c0374n8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0399o8 c0399o8 = this.f1253a;
        if (c0399o8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0399o8);
        }
        C0449q8 c0449q8 = this.b;
        if (c0449q8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0449q8);
        }
        C0221h8 c0221h8 = this.c;
        if (c0221h8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c0221h8);
        }
        C0374n8 c0374n8 = this.d;
        if (c0374n8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0374n8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0169f8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f1253a == null) {
                    this.f1253a = new C0399o8();
                }
                codedInputByteBufferNano.readMessage(this.f1253a);
            } else if (readTag == 18) {
                if (this.b == null) {
                    this.b = new C0449q8();
                }
                codedInputByteBufferNano.readMessage(this.b);
            } else if (readTag == 26) {
                if (this.c == null) {
                    this.c = new C0221h8();
                }
                codedInputByteBufferNano.readMessage(this.c);
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.d == null) {
                    this.d = new C0374n8();
                }
                codedInputByteBufferNano.readMessage(this.d);
            }
        }
        return this;
    }

    public static C0169f8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0169f8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0169f8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0169f8) MessageNano.mergeFrom(new C0169f8(), bArr);
    }
}
