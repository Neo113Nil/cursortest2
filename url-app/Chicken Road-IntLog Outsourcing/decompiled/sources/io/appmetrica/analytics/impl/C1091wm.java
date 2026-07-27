package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.wm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1091wm extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C1091wm[] f9552c;

    /* renamed from: a, reason: collision with root package name */
    public String f9553a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f9554b;

    public C1091wm() {
        a();
    }

    public static C1091wm[] b() {
        if (f9552c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9552c == null) {
                        f9552c = new C1091wm[0];
                    }
                } finally {
                }
            }
        }
        return f9552c;
    }

    public final C1091wm a() {
        this.f9553a = "";
        this.f9554b = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f9553a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f9553a);
        }
        return !Arrays.equals(this.f9554b, WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f9554b) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f9553a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f9553a);
        }
        if (!Arrays.equals(this.f9554b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f9554b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1091wm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f9553a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f9554b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static C1091wm b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1091wm().mergeFrom(codedInputByteBufferNano);
    }

    public static C1091wm a(byte[] bArr) {
        return (C1091wm) MessageNano.mergeFrom(new C1091wm(), bArr);
    }
}
