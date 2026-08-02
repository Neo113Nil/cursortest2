package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.lf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0770lf extends MessageNano {

    /* renamed from: f, reason: collision with root package name */
    public static volatile C0770lf[] f12292f;

    /* renamed from: a, reason: collision with root package name */
    public String f12293a;

    /* renamed from: b, reason: collision with root package name */
    public String f12294b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12295c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12296d;

    /* renamed from: e, reason: collision with root package name */
    public int f12297e;

    public C0770lf() {
        a();
    }

    public static C0770lf[] b() {
        if (f12292f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f12292f == null) {
                        f12292f = new C0770lf[0];
                    }
                } finally {
                }
            }
        }
        return f12292f;
    }

    public final C0770lf a() {
        this.f12293a = "";
        this.f12294b = "";
        this.f12295c = false;
        this.f12296d = false;
        this.f12297e = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f12293a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f12293a);
        }
        if (!this.f12294b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f12294b);
        }
        boolean z = this.f12295c;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(3, z);
        }
        boolean z4 = this.f12296d;
        if (z4) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(4, z4);
        }
        return CodedOutputByteBufferNano.computeInt32Size(5, this.f12297e) + computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f12293a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f12293a);
        }
        if (!this.f12294b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f12294b);
        }
        boolean z = this.f12295c;
        if (z) {
            codedOutputByteBufferNano.writeBool(3, z);
        }
        boolean z4 = this.f12296d;
        if (z4) {
            codedOutputByteBufferNano.writeBool(4, z4);
        }
        codedOutputByteBufferNano.writeInt32(5, this.f12297e);
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0770lf b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0770lf().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0770lf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f12293a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.f12294b = codedInputByteBufferNano.readString();
            } else if (readTag == 24) {
                this.f12295c = codedInputByteBufferNano.readBool();
            } else if (readTag == 32) {
                this.f12296d = codedInputByteBufferNano.readBool();
            } else if (readTag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.f12297e = readInt32;
                }
            }
        }
        return this;
    }

    public static C0770lf a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0770lf) MessageNano.mergeFrom(new C0770lf(), bArr);
    }
}
