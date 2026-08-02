package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.wm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0940wm extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0940wm[] f8596c;

    /* renamed from: a, reason: collision with root package name */
    public String f8597a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f8598b;

    public C0940wm() {
        a();
    }

    public static C0940wm[] b() {
        if (f8596c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8596c == null) {
                        f8596c = new C0940wm[0];
                    }
                } finally {
                }
            }
        }
        return f8596c;
    }

    public final C0940wm a() {
        this.f8597a = "";
        this.f8598b = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f8597a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f8597a);
        }
        return !Arrays.equals(this.f8598b, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f8598b) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f8597a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f8597a);
        }
        if (!Arrays.equals(this.f8598b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f8598b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0940wm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f8597a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f8598b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static C0940wm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0940wm().mergeFrom(codedInputByteBufferNano);
    }

    public static C0940wm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0940wm) MessageNano.mergeFrom(new C0940wm(), bArr);
    }
}
