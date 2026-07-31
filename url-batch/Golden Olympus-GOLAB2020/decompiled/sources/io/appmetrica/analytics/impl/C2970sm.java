package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.sm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2970sm extends MessageNano {

    /* renamed from: g, reason: collision with root package name */
    public static volatile C2970sm[] f39811g;

    /* renamed from: a, reason: collision with root package name */
    public boolean f39812a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f39813b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f39814c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f39815d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f39816e;

    /* renamed from: f, reason: collision with root package name */
    public int f39817f;

    public C2970sm() {
        a();
    }

    public static C2970sm[] b() {
        if (f39811g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f39811g == null) {
                        f39811g = new C2970sm[0];
                    }
                } finally {
                }
            }
        }
        return f39811g;
    }

    public final C2970sm a() {
        this.f39812a = false;
        this.f39813b = false;
        this.f39814c = false;
        this.f39815d = false;
        this.f39816e = false;
        this.f39817f = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeBoolSize = CodedOutputByteBufferNano.computeBoolSize(4, this.f39815d) + CodedOutputByteBufferNano.computeBoolSize(3, this.f39814c) + CodedOutputByteBufferNano.computeBoolSize(2, this.f39813b) + CodedOutputByteBufferNano.computeBoolSize(1, this.f39812a) + super.computeSerializedSize();
        boolean z4 = this.f39816e;
        if (z4) {
            computeBoolSize += CodedOutputByteBufferNano.computeBoolSize(5, z4);
        }
        int i4 = this.f39817f;
        return i4 != -1 ? CodedOutputByteBufferNano.computeInt32Size(6, i4) + computeBoolSize : computeBoolSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeBool(1, this.f39812a);
        codedOutputByteBufferNano.writeBool(2, this.f39813b);
        codedOutputByteBufferNano.writeBool(3, this.f39814c);
        codedOutputByteBufferNano.writeBool(4, this.f39815d);
        boolean z4 = this.f39816e;
        if (z4) {
            codedOutputByteBufferNano.writeBool(5, z4);
        }
        int i4 = this.f39817f;
        if (i4 != -1) {
            codedOutputByteBufferNano.writeInt32(6, i4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C2970sm b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2970sm().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2970sm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f39812a = codedInputByteBufferNano.readBool();
            } else if (readTag == 16) {
                this.f39813b = codedInputByteBufferNano.readBool();
            } else if (readTag == 24) {
                this.f39814c = codedInputByteBufferNano.readBool();
            } else if (readTag == 32) {
                this.f39815d = codedInputByteBufferNano.readBool();
            } else if (readTag == 40) {
                this.f39816e = codedInputByteBufferNano.readBool();
            } else if (readTag != 48) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == -1 || readInt32 == 0 || readInt32 == 1) {
                    this.f39817f = readInt32;
                }
            }
        }
        return this;
    }

    public static C2970sm a(byte[] bArr) {
        return (C2970sm) MessageNano.mergeFrom(new C2970sm(), bArr);
    }
}
