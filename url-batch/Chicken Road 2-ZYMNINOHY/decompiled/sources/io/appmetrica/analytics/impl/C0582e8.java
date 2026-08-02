package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.e8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0582e8 extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C0582e8[] f11736e;

    /* renamed from: a, reason: collision with root package name */
    public C0815n8 f11737a;

    /* renamed from: b, reason: collision with root package name */
    public C0867p8 f11738b;

    /* renamed from: c, reason: collision with root package name */
    public C0634g8 f11739c;

    /* renamed from: d, reason: collision with root package name */
    public C0789m8 f11740d;

    public C0582e8() {
        a();
    }

    public static C0582e8[] b() {
        if (f11736e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f11736e == null) {
                        f11736e = new C0582e8[0];
                    }
                } finally {
                }
            }
        }
        return f11736e;
    }

    public final C0582e8 a() {
        this.f11737a = null;
        this.f11738b = null;
        this.f11739c = null;
        this.f11740d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0815n8 c0815n8 = this.f11737a;
        if (c0815n8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0815n8);
        }
        C0867p8 c0867p8 = this.f11738b;
        if (c0867p8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c0867p8);
        }
        C0634g8 c0634g8 = this.f11739c;
        if (c0634g8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c0634g8);
        }
        C0789m8 c0789m8 = this.f11740d;
        return c0789m8 != null ? CodedOutputByteBufferNano.computeMessageSize(4, c0789m8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0815n8 c0815n8 = this.f11737a;
        if (c0815n8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0815n8);
        }
        C0867p8 c0867p8 = this.f11738b;
        if (c0867p8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0867p8);
        }
        C0634g8 c0634g8 = this.f11739c;
        if (c0634g8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c0634g8);
        }
        C0789m8 c0789m8 = this.f11740d;
        if (c0789m8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0789m8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0582e8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f11737a == null) {
                    this.f11737a = new C0815n8();
                }
                codedInputByteBufferNano.readMessage(this.f11737a);
            } else if (readTag == 18) {
                if (this.f11738b == null) {
                    this.f11738b = new C0867p8();
                }
                codedInputByteBufferNano.readMessage(this.f11738b);
            } else if (readTag == 26) {
                if (this.f11739c == null) {
                    this.f11739c = new C0634g8();
                }
                codedInputByteBufferNano.readMessage(this.f11739c);
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f11740d == null) {
                    this.f11740d = new C0789m8();
                }
                codedInputByteBufferNano.readMessage(this.f11740d);
            }
        }
        return this;
    }

    public static C0582e8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0582e8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0582e8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0582e8) MessageNano.mergeFrom(new C0582e8(), bArr);
    }
}
