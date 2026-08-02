package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.m9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0668m9 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static final int f7867d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f7868e = 1;
    public static final int f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static volatile C0668m9[] f7869g;

    /* renamed from: a, reason: collision with root package name */
    public C0746p9 f7870a;

    /* renamed from: b, reason: collision with root package name */
    public String f7871b;

    /* renamed from: c, reason: collision with root package name */
    public int f7872c;

    public C0668m9() {
        a();
    }

    public static C0668m9[] b() {
        if (f7869g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7869g == null) {
                        f7869g = new C0668m9[0];
                    }
                } finally {
                }
            }
        }
        return f7869g;
    }

    public final C0668m9 a() {
        this.f7870a = null;
        this.f7871b = "";
        this.f7872c = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0746p9 c0746p9 = this.f7870a;
        if (c0746p9 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0746p9);
        }
        int computeStringSize = CodedOutputByteBufferNano.computeStringSize(2, this.f7871b) + computeSerializedSize;
        int i3 = this.f7872c;
        return i3 != 0 ? CodedOutputByteBufferNano.computeInt32Size(5, i3) + computeStringSize : computeStringSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0746p9 c0746p9 = this.f7870a;
        if (c0746p9 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0746p9);
        }
        codedOutputByteBufferNano.writeString(2, this.f7871b);
        int i3 = this.f7872c;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeInt32(5, i3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0668m9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f7870a == null) {
                    this.f7870a = new C0746p9();
                }
                codedInputByteBufferNano.readMessage(this.f7870a);
            } else if (readTag == 18) {
                this.f7871b = codedInputByteBufferNano.readString();
            } else if (readTag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f7872c = readInt32;
                }
            }
        }
        return this;
    }

    public static C0668m9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0668m9().mergeFrom(codedInputByteBufferNano);
    }

    public static C0668m9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0668m9) MessageNano.mergeFrom(new C0668m9(), bArr);
    }
}
