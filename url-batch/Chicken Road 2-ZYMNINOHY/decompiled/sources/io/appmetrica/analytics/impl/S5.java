package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class S5 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile S5[] f10928d;

    /* renamed from: a, reason: collision with root package name */
    public R5 f10929a;

    /* renamed from: b, reason: collision with root package name */
    public String f10930b;

    /* renamed from: c, reason: collision with root package name */
    public int f10931c;

    public S5() {
        a();
    }

    public static S5[] b() {
        if (f10928d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f10928d == null) {
                        f10928d = new S5[0];
                    }
                } finally {
                }
            }
        }
        return f10928d;
    }

    public final S5 a() {
        this.f10929a = null;
        this.f10930b = "";
        this.f10931c = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        R5 r5 = this.f10929a;
        if (r5 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, r5);
        }
        if (!this.f10930b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f10930b);
        }
        int i4 = this.f10931c;
        return i4 != -1 ? CodedOutputByteBufferNano.computeInt32Size(3, i4) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        R5 r5 = this.f10929a;
        if (r5 != null) {
            codedOutputByteBufferNano.writeMessage(1, r5);
        }
        if (!this.f10930b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f10930b);
        }
        int i4 = this.f10931c;
        if (i4 != -1) {
            codedOutputByteBufferNano.writeInt32(3, i4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final S5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f10929a == null) {
                    this.f10929a = new R5();
                }
                codedInputByteBufferNano.readMessage(this.f10929a);
            } else if (readTag == 18) {
                this.f10930b = codedInputByteBufferNano.readString();
            } else if (readTag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == -1 || readInt32 == 0 || readInt32 == 1) {
                    this.f10931c = readInt32;
                }
            }
        }
        return this;
    }

    public static S5 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new S5().mergeFrom(codedInputByteBufferNano);
    }

    public static S5 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (S5) MessageNano.mergeFrom(new S5(), bArr);
    }
}
