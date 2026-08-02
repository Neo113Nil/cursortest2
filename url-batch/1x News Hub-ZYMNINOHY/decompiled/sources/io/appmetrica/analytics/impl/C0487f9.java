package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.f9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0487f9 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0487f9[] f7307c;

    /* renamed from: a, reason: collision with root package name */
    public String f7308a;

    /* renamed from: b, reason: collision with root package name */
    public String f7309b;

    public C0487f9() {
        a();
    }

    public static C0487f9[] b() {
        if (f7307c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7307c == null) {
                        f7307c = new C0487f9[0];
                    }
                } finally {
                }
            }
        }
        return f7307c;
    }

    public final C0487f9 a() {
        this.f7308a = "";
        this.f7309b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeStringSize(2, this.f7309b) + CodedOutputByteBufferNano.computeStringSize(1, this.f7308a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f7308a);
        codedOutputByteBufferNano.writeString(2, this.f7309b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0487f9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f7308a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f7309b = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static C0487f9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0487f9().mergeFrom(codedInputByteBufferNano);
    }

    public static C0487f9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0487f9) MessageNano.mergeFrom(new C0487f9(), bArr);
    }
}
