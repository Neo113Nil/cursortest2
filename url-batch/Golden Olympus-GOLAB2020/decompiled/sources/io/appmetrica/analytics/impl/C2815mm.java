package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.mm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2815mm extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C2815mm[] f39458c;

    /* renamed from: a, reason: collision with root package name */
    public String f39459a;

    /* renamed from: b, reason: collision with root package name */
    public C2789lm f39460b;

    public C2815mm() {
        a();
    }

    public static C2815mm[] b() {
        if (f39458c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f39458c == null) {
                        f39458c = new C2815mm[0];
                    }
                } finally {
                }
            }
        }
        return f39458c;
    }

    public final C2815mm a() {
        this.f39459a = "";
        this.f39460b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f39459a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f39459a);
        }
        C2789lm c2789lm = this.f39460b;
        return c2789lm != null ? CodedOutputByteBufferNano.computeMessageSize(2, c2789lm) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f39459a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f39459a);
        }
        C2789lm c2789lm = this.f39460b;
        if (c2789lm != null) {
            codedOutputByteBufferNano.writeMessage(2, c2789lm);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2815mm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f39459a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f39460b == null) {
                    this.f39460b = new C2789lm();
                }
                codedInputByteBufferNano.readMessage(this.f39460b);
            }
        }
        return this;
    }

    public static C2815mm b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2815mm().mergeFrom(codedInputByteBufferNano);
    }

    public static C2815mm a(byte[] bArr) {
        return (C2815mm) MessageNano.mergeFrom(new C2815mm(), bArr);
    }
}
