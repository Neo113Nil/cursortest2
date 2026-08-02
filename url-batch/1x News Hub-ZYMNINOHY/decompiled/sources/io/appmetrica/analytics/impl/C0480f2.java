package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.f2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0480f2 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0480f2[] f7298c;

    /* renamed from: a, reason: collision with root package name */
    public String f7299a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7300b;

    public C0480f2() {
        a();
    }

    public static C0480f2[] b() {
        if (f7298c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7298c == null) {
                        f7298c = new C0480f2[0];
                    }
                } finally {
                }
            }
        }
        return f7298c;
    }

    public final C0480f2 a() {
        this.f7299a = "";
        this.f7300b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeBoolSize(2, this.f7300b) + CodedOutputByteBufferNano.computeStringSize(1, this.f7299a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f7299a);
        codedOutputByteBufferNano.writeBool(2, this.f7300b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0480f2 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f7299a = codedInputByteBufferNano.readString();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f7300b = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static C0480f2 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0480f2().mergeFrom(codedInputByteBufferNano);
    }

    public static C0480f2 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0480f2) MessageNano.mergeFrom(new C0480f2(), bArr);
    }
}
