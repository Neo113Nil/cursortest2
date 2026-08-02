package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.mm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0803mm extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0803mm[] f12378c;

    /* renamed from: a, reason: collision with root package name */
    public String f12379a;

    /* renamed from: b, reason: collision with root package name */
    public C0777lm f12380b;

    public C0803mm() {
        a();
    }

    public static C0803mm[] b() {
        if (f12378c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f12378c == null) {
                        f12378c = new C0803mm[0];
                    }
                } finally {
                }
            }
        }
        return f12378c;
    }

    public final C0803mm a() {
        this.f12379a = "";
        this.f12380b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f12379a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f12379a);
        }
        C0777lm c0777lm = this.f12380b;
        return c0777lm != null ? CodedOutputByteBufferNano.computeMessageSize(2, c0777lm) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f12379a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f12379a);
        }
        C0777lm c0777lm = this.f12380b;
        if (c0777lm != null) {
            codedOutputByteBufferNano.writeMessage(2, c0777lm);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0803mm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f12379a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f12380b == null) {
                    this.f12380b = new C0777lm();
                }
                codedInputByteBufferNano.readMessage(this.f12380b);
            }
        }
        return this;
    }

    public static C0803mm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0803mm().mergeFrom(codedInputByteBufferNano);
    }

    public static C0803mm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0803mm) MessageNano.mergeFrom(new C0803mm(), bArr);
    }
}
