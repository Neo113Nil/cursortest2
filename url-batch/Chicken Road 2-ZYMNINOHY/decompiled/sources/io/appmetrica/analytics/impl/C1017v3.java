package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.v3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1017v3 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C1017v3[] f12866c;

    /* renamed from: a, reason: collision with root package name */
    public String f12867a;

    /* renamed from: b, reason: collision with root package name */
    public String f12868b;

    public C1017v3() {
        a();
    }

    public static C1017v3[] b() {
        if (f12866c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f12866c == null) {
                        f12866c = new C1017v3[0];
                    }
                } finally {
                }
            }
        }
        return f12866c;
    }

    public final C1017v3 a() {
        this.f12867a = "";
        this.f12868b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f12867a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f12867a);
        }
        return !this.f12868b.equals("") ? CodedOutputByteBufferNano.computeStringSize(2, this.f12868b) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f12867a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f12867a);
        }
        if (!this.f12868b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f12868b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1017v3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f12867a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f12868b = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static C1017v3 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C1017v3().mergeFrom(codedInputByteBufferNano);
    }

    public static C1017v3 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C1017v3) MessageNano.mergeFrom(new C1017v3(), bArr);
    }
}
