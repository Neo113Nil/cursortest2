package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.sm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0958sm extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0958sm[] f12749c;

    /* renamed from: a, reason: collision with root package name */
    public String f12750a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f12751b;

    public C0958sm() {
        a();
    }

    public static C0958sm[] b() {
        if (f12749c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f12749c == null) {
                        f12749c = new C0958sm[0];
                    }
                } finally {
                }
            }
        }
        return f12749c;
    }

    public final C0958sm a() {
        this.f12750a = "";
        this.f12751b = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f12750a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f12750a);
        }
        return !Arrays.equals(this.f12751b, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f12751b) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f12750a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f12750a);
        }
        if (!Arrays.equals(this.f12751b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f12751b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0958sm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f12750a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f12751b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static C0958sm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0958sm().mergeFrom(codedInputByteBufferNano);
    }

    public static C0958sm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0958sm) MessageNano.mergeFrom(new C0958sm(), bArr);
    }
}
