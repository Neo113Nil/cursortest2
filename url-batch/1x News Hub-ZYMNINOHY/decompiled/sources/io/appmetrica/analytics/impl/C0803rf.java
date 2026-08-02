package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.rf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0803rf extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C0803rf[] f8234d;

    /* renamed from: a, reason: collision with root package name */
    public String f8235a;

    /* renamed from: b, reason: collision with root package name */
    public String f8236b;

    /* renamed from: c, reason: collision with root package name */
    public int f8237c;

    public C0803rf() {
        a();
    }

    public static C0803rf[] b() {
        if (f8234d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8234d == null) {
                        f8234d = new C0803rf[0];
                    }
                } finally {
                }
            }
        }
        return f8234d;
    }

    public final C0803rf a() {
        this.f8235a = "";
        this.f8236b = "";
        this.f8237c = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f8235a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f8235a);
        }
        if (!this.f8236b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f8236b);
        }
        return CodedOutputByteBufferNano.computeInt32Size(3, this.f8237c) + computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f8235a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f8235a);
        }
        if (!this.f8236b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f8236b);
        }
        codedOutputByteBufferNano.writeInt32(3, this.f8237c);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0803rf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f8235a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.f8236b = codedInputByteBufferNano.readString();
            } else if (readTag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.f8237c = readInt32;
                }
            }
        }
        return this;
    }

    public static C0803rf b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0803rf().mergeFrom(codedInputByteBufferNano);
    }

    public static C0803rf a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0803rf) MessageNano.mergeFrom(new C0803rf(), bArr);
    }
}
