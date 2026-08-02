package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.lm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0777lm extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0777lm[] f12308b;

    /* renamed from: a, reason: collision with root package name */
    public String f12309a;

    public C0777lm() {
        a();
    }

    public static C0777lm[] b() {
        if (f12308b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f12308b == null) {
                        f12308b = new C0777lm[0];
                    }
                } finally {
                }
            }
        }
        return f12308b;
    }

    public final C0777lm a() {
        this.f12309a = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        return !this.f12309a.equals("") ? CodedOutputByteBufferNano.computeStringSize(1, this.f12309a) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f12309a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f12309a);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0777lm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                this.f12309a = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static C0777lm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0777lm) MessageNano.mergeFrom(new C0777lm(), bArr);
    }

    public static C0777lm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0777lm().mergeFrom(codedInputByteBufferNano);
    }
}
