package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.d6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0433d6 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0433d6[] f7173b;

    /* renamed from: a, reason: collision with root package name */
    public String f7174a;

    public C0433d6() {
        a();
    }

    public static C0433d6[] b() {
        if (f7173b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7173b == null) {
                        f7173b = new C0433d6[0];
                    }
                } finally {
                }
            }
        }
        return f7173b;
    }

    public final C0433d6 a() {
        this.f7174a = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeStringSize(1, this.f7174a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f7174a);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0433d6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                this.f7174a = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static C0433d6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0433d6) MessageNano.mergeFrom(new C0433d6(), bArr);
    }

    public static C0433d6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0433d6().mergeFrom(codedInputByteBufferNano);
    }
}
