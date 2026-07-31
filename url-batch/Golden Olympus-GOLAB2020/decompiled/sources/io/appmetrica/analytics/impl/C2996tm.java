package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.tm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2996tm extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C2996tm[] f39875c;

    /* renamed from: a, reason: collision with root package name */
    public String f39876a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f39877b;

    public C2996tm() {
        a();
    }

    public static C2996tm[] b() {
        if (f39875c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f39875c == null) {
                        f39875c = new C2996tm[0];
                    }
                } finally {
                }
            }
        }
        return f39875c;
    }

    public final C2996tm a() {
        this.f39876a = "";
        this.f39877b = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f39876a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f39876a);
        }
        return !Arrays.equals(this.f39877b, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f39877b) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f39876a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f39876a);
        }
        if (!Arrays.equals(this.f39877b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f39877b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2996tm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f39876a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f39877b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static C2996tm b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2996tm().mergeFrom(codedInputByteBufferNano);
    }

    public static C2996tm a(byte[] bArr) {
        return (C2996tm) MessageNano.mergeFrom(new C2996tm(), bArr);
    }
}
