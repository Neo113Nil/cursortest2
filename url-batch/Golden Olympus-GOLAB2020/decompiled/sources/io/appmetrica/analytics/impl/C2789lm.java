package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.lm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2789lm extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C2789lm[] f39409b;

    /* renamed from: a, reason: collision with root package name */
    public String f39410a;

    public C2789lm() {
        a();
    }

    public static C2789lm[] b() {
        if (f39409b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f39409b == null) {
                        f39409b = new C2789lm[0];
                    }
                } finally {
                }
            }
        }
        return f39409b;
    }

    public final C2789lm a() {
        this.f39410a = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        return !this.f39410a.equals("") ? CodedOutputByteBufferNano.computeStringSize(1, this.f39410a) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f39410a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f39410a);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2789lm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
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
                this.f39410a = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static C2789lm a(byte[] bArr) {
        return (C2789lm) MessageNano.mergeFrom(new C2789lm(), bArr);
    }

    public static C2789lm b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2789lm().mergeFrom(codedInputByteBufferNano);
    }
}
