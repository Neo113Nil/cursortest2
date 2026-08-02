package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.j8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0711j8 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0711j8[] f12105b;

    /* renamed from: a, reason: collision with root package name */
    public C0660h8 f12106a;

    public C0711j8() {
        a();
    }

    public static C0711j8[] b() {
        if (f12105b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f12105b == null) {
                        f12105b = new C0711j8[0];
                    }
                } finally {
                }
            }
        }
        return f12105b;
    }

    public final C0711j8 a() {
        this.f12106a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0660h8 c0660h8 = this.f12106a;
        return c0660h8 != null ? CodedOutputByteBufferNano.computeMessageSize(1, c0660h8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0660h8 c0660h8 = this.f12106a;
        if (c0660h8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0660h8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0711j8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f12106a == null) {
                    this.f12106a = new C0660h8();
                }
                codedInputByteBufferNano.readMessage(this.f12106a);
            }
        }
        return this;
    }

    public static C0711j8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0711j8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0711j8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0711j8) MessageNano.mergeFrom(new C0711j8(), bArr);
    }
}
