package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.o6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2851o6 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C2851o6[] f39556d;

    /* renamed from: a, reason: collision with root package name */
    public C2825n6 f39557a;

    /* renamed from: b, reason: collision with root package name */
    public String f39558b;

    /* renamed from: c, reason: collision with root package name */
    public int f39559c;

    public C2851o6() {
        a();
    }

    public static C2851o6[] b() {
        if (f39556d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f39556d == null) {
                        f39556d = new C2851o6[0];
                    }
                } finally {
                }
            }
        }
        return f39556d;
    }

    public final C2851o6 a() {
        this.f39557a = null;
        this.f39558b = "";
        this.f39559c = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C2825n6 c2825n6 = this.f39557a;
        if (c2825n6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c2825n6);
        }
        if (!this.f39558b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f39558b);
        }
        int i4 = this.f39559c;
        return i4 != -1 ? CodedOutputByteBufferNano.computeInt32Size(3, i4) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C2825n6 c2825n6 = this.f39557a;
        if (c2825n6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c2825n6);
        }
        if (!this.f39558b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f39558b);
        }
        int i4 = this.f39559c;
        if (i4 != -1) {
            codedOutputByteBufferNano.writeInt32(3, i4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2851o6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f39557a == null) {
                    this.f39557a = new C2825n6();
                }
                codedInputByteBufferNano.readMessage(this.f39557a);
            } else if (readTag == 18) {
                this.f39558b = codedInputByteBufferNano.readString();
            } else if (readTag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == -1 || readInt32 == 0 || readInt32 == 1) {
                    this.f39559c = readInt32;
                }
            }
        }
        return this;
    }

    public static C2851o6 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2851o6().mergeFrom(codedInputByteBufferNano);
    }

    public static C2851o6 a(byte[] bArr) {
        return (C2851o6) MessageNano.mergeFrom(new C2851o6(), bArr);
    }
}
