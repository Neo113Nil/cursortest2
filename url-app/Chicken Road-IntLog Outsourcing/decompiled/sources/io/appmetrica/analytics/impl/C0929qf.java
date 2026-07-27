package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.qf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0929qf extends MessageNano {

    /* renamed from: f, reason: collision with root package name */
    public static volatile C0929qf[] f9097f;

    /* renamed from: a, reason: collision with root package name */
    public String f9098a;

    /* renamed from: b, reason: collision with root package name */
    public String f9099b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9100c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9101d;

    /* renamed from: e, reason: collision with root package name */
    public int f9102e;

    public C0929qf() {
        a();
    }

    public static C0929qf[] b() {
        if (f9097f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9097f == null) {
                        f9097f = new C0929qf[0];
                    }
                } finally {
                }
            }
        }
        return f9097f;
    }

    public final C0929qf a() {
        this.f9098a = "";
        this.f9099b = "";
        this.f9100c = false;
        this.f9101d = false;
        this.f9102e = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f9098a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f9098a);
        }
        if (!this.f9099b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f9099b);
        }
        boolean z = this.f9100c;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(3, z);
        }
        boolean z5 = this.f9101d;
        if (z5) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(4, z5);
        }
        return CodedOutputByteBufferNano.computeInt32Size(5, this.f9102e) + computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f9098a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f9098a);
        }
        if (!this.f9099b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f9099b);
        }
        boolean z = this.f9100c;
        if (z) {
            codedOutputByteBufferNano.writeBool(3, z);
        }
        boolean z5 = this.f9101d;
        if (z5) {
            codedOutputByteBufferNano.writeBool(4, z5);
        }
        codedOutputByteBufferNano.writeInt32(5, this.f9102e);
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0929qf b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0929qf().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0929qf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f9098a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.f9099b = codedInputByteBufferNano.readString();
            } else if (readTag == 24) {
                this.f9100c = codedInputByteBufferNano.readBool();
            } else if (readTag == 32) {
                this.f9101d = codedInputByteBufferNano.readBool();
            } else if (readTag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.f9102e = readInt32;
                }
            }
        }
    }

    public static C0929qf a(byte[] bArr) {
        return (C0929qf) MessageNano.mergeFrom(new C0929qf(), bArr);
    }
}
