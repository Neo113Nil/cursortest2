package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.mf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0796mf extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C0796mf[] f12357d;

    /* renamed from: a, reason: collision with root package name */
    public String f12358a;

    /* renamed from: b, reason: collision with root package name */
    public String f12359b;

    /* renamed from: c, reason: collision with root package name */
    public int f12360c;

    public C0796mf() {
        a();
    }

    public static C0796mf[] b() {
        if (f12357d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f12357d == null) {
                        f12357d = new C0796mf[0];
                    }
                } finally {
                }
            }
        }
        return f12357d;
    }

    public final C0796mf a() {
        this.f12358a = "";
        this.f12359b = "";
        this.f12360c = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f12358a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f12358a);
        }
        if (!this.f12359b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f12359b);
        }
        return CodedOutputByteBufferNano.computeInt32Size(3, this.f12360c) + computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f12358a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f12358a);
        }
        if (!this.f12359b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f12359b);
        }
        codedOutputByteBufferNano.writeInt32(3, this.f12360c);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0796mf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f12358a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.f12359b = codedInputByteBufferNano.readString();
            } else if (readTag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.f12360c = readInt32;
                }
            }
        }
        return this;
    }

    public static C0796mf b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0796mf().mergeFrom(codedInputByteBufferNano);
    }

    public static C0796mf a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0796mf) MessageNano.mergeFrom(new C0796mf(), bArr);
    }
}
