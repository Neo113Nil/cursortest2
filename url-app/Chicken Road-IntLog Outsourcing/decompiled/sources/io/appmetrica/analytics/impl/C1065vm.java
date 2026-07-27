package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.vm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1065vm extends MessageNano {

    /* renamed from: g, reason: collision with root package name */
    public static volatile C1065vm[] f9482g;

    /* renamed from: a, reason: collision with root package name */
    public boolean f9483a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9484b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9485c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9486d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9487e;

    /* renamed from: f, reason: collision with root package name */
    public int f9488f;

    public C1065vm() {
        a();
    }

    public static C1065vm[] b() {
        if (f9482g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9482g == null) {
                        f9482g = new C1065vm[0];
                    }
                } finally {
                }
            }
        }
        return f9482g;
    }

    public final C1065vm a() {
        this.f9483a = false;
        this.f9484b = false;
        this.f9485c = false;
        this.f9486d = false;
        this.f9487e = false;
        this.f9488f = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeBoolSize = CodedOutputByteBufferNano.computeBoolSize(4, this.f9486d) + CodedOutputByteBufferNano.computeBoolSize(3, this.f9485c) + CodedOutputByteBufferNano.computeBoolSize(2, this.f9484b) + CodedOutputByteBufferNano.computeBoolSize(1, this.f9483a) + super.computeSerializedSize();
        boolean z = this.f9487e;
        if (z) {
            computeBoolSize += CodedOutputByteBufferNano.computeBoolSize(5, z);
        }
        int i2 = this.f9488f;
        return i2 != -1 ? computeBoolSize + CodedOutputByteBufferNano.computeInt32Size(6, i2) : computeBoolSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeBool(1, this.f9483a);
        codedOutputByteBufferNano.writeBool(2, this.f9484b);
        codedOutputByteBufferNano.writeBool(3, this.f9485c);
        codedOutputByteBufferNano.writeBool(4, this.f9486d);
        boolean z = this.f9487e;
        if (z) {
            codedOutputByteBufferNano.writeBool(5, z);
        }
        int i2 = this.f9488f;
        if (i2 != -1) {
            codedOutputByteBufferNano.writeInt32(6, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C1065vm b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1065vm().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1065vm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f9483a = codedInputByteBufferNano.readBool();
            } else if (readTag == 16) {
                this.f9484b = codedInputByteBufferNano.readBool();
            } else if (readTag == 24) {
                this.f9485c = codedInputByteBufferNano.readBool();
            } else if (readTag == 32) {
                this.f9486d = codedInputByteBufferNano.readBool();
            } else if (readTag == 40) {
                this.f9487e = codedInputByteBufferNano.readBool();
            } else if (readTag != 48) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == -1 || readInt32 == 0 || readInt32 == 1) {
                    this.f9488f = readInt32;
                }
            }
        }
    }

    public static C1065vm a(byte[] bArr) {
        return (C1065vm) MessageNano.mergeFrom(new C1065vm(), bArr);
    }
}
