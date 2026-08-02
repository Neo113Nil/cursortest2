package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.f9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0609f9 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static final int f11826d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f11827e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f11828f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static volatile C0609f9[] f11829g;

    /* renamed from: a, reason: collision with root package name */
    public C0687i9 f11830a;

    /* renamed from: b, reason: collision with root package name */
    public String f11831b;

    /* renamed from: c, reason: collision with root package name */
    public int f11832c;

    public C0609f9() {
        a();
    }

    public static C0609f9[] b() {
        if (f11829g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f11829g == null) {
                        f11829g = new C0609f9[0];
                    }
                } finally {
                }
            }
        }
        return f11829g;
    }

    public final C0609f9 a() {
        this.f11830a = null;
        this.f11831b = "";
        this.f11832c = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0687i9 c0687i9 = this.f11830a;
        if (c0687i9 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0687i9);
        }
        int computeStringSize = CodedOutputByteBufferNano.computeStringSize(2, this.f11831b) + computeSerializedSize;
        int i4 = this.f11832c;
        return i4 != 0 ? CodedOutputByteBufferNano.computeInt32Size(5, i4) + computeStringSize : computeStringSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0687i9 c0687i9 = this.f11830a;
        if (c0687i9 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0687i9);
        }
        codedOutputByteBufferNano.writeString(2, this.f11831b);
        int i4 = this.f11832c;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeInt32(5, i4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0609f9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f11830a == null) {
                    this.f11830a = new C0687i9();
                }
                codedInputByteBufferNano.readMessage(this.f11830a);
            } else if (readTag == 18) {
                this.f11831b = codedInputByteBufferNano.readString();
            } else if (readTag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f11832c = readInt32;
                }
            }
        }
        return this;
    }

    public static C0609f9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0609f9().mergeFrom(codedInputByteBufferNano);
    }

    public static C0609f9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0609f9) MessageNano.mergeFrom(new C0609f9(), bArr);
    }
}
