package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.zf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3145zf extends MessageNano {

    /* renamed from: f, reason: collision with root package name */
    public static volatile C3145zf[] f40378f;

    /* renamed from: a, reason: collision with root package name */
    public String f40379a;

    /* renamed from: b, reason: collision with root package name */
    public String f40380b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f40381c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f40382d;

    /* renamed from: e, reason: collision with root package name */
    public int f40383e;

    public C3145zf() {
        a();
    }

    public static C3145zf[] b() {
        if (f40378f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f40378f == null) {
                        f40378f = new C3145zf[0];
                    }
                } finally {
                }
            }
        }
        return f40378f;
    }

    public final C3145zf a() {
        this.f40379a = "";
        this.f40380b = "";
        this.f40381c = false;
        this.f40382d = false;
        this.f40383e = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f40379a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f40379a);
        }
        if (!this.f40380b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f40380b);
        }
        boolean z4 = this.f40381c;
        if (z4) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(3, z4);
        }
        boolean z5 = this.f40382d;
        if (z5) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(4, z5);
        }
        return CodedOutputByteBufferNano.computeInt32Size(5, this.f40383e) + computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f40379a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f40379a);
        }
        if (!this.f40380b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f40380b);
        }
        boolean z4 = this.f40381c;
        if (z4) {
            codedOutputByteBufferNano.writeBool(3, z4);
        }
        boolean z5 = this.f40382d;
        if (z5) {
            codedOutputByteBufferNano.writeBool(4, z5);
        }
        codedOutputByteBufferNano.writeInt32(5, this.f40383e);
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C3145zf b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C3145zf().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3145zf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f40379a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.f40380b = codedInputByteBufferNano.readString();
            } else if (readTag == 24) {
                this.f40381c = codedInputByteBufferNano.readBool();
            } else if (readTag == 32) {
                this.f40382d = codedInputByteBufferNano.readBool();
            } else if (readTag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.f40383e = readInt32;
                }
            }
        }
        return this;
    }

    public static C3145zf a(byte[] bArr) {
        return (C3145zf) MessageNano.mergeFrom(new C3145zf(), bArr);
    }
}
