package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.h9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0661h9 extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C0661h9[] f11986e;

    /* renamed from: a, reason: collision with root package name */
    public int f11987a;

    /* renamed from: b, reason: collision with root package name */
    public int f11988b;

    /* renamed from: c, reason: collision with root package name */
    public String f11989c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11990d;

    public C0661h9() {
        a();
    }

    public static C0661h9[] b() {
        if (f11986e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f11986e == null) {
                        f11986e = new C0661h9[0];
                    }
                } finally {
                }
            }
        }
        return f11986e;
    }

    public final C0661h9 a() {
        this.f11987a = 0;
        this.f11988b = 0;
        this.f11989c = "";
        this.f11990d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i4 = this.f11987a;
        if (i4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i4);
        }
        int i5 = this.f11988b;
        if (i5 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(2, i5);
        }
        if (!this.f11989c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f11989c);
        }
        boolean z = this.f11990d;
        return z ? CodedOutputByteBufferNano.computeBoolSize(4, z) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i4 = this.f11987a;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i4);
        }
        int i5 = this.f11988b;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeUInt32(2, i5);
        }
        if (!this.f11989c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f11989c);
        }
        boolean z = this.f11990d;
        if (z) {
            codedOutputByteBufferNano.writeBool(4, z);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0661h9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f11987a = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 16) {
                this.f11988b = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 26) {
                this.f11989c = codedInputByteBufferNano.readString();
            } else if (readTag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f11990d = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static C0661h9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0661h9().mergeFrom(codedInputByteBufferNano);
    }

    public static C0661h9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0661h9) MessageNano.mergeFrom(new C0661h9(), bArr);
    }
}
