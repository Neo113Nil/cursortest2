package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.o9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0720o9 extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C0720o9[] f7994e;

    /* renamed from: a, reason: collision with root package name */
    public int f7995a;

    /* renamed from: b, reason: collision with root package name */
    public int f7996b;

    /* renamed from: c, reason: collision with root package name */
    public String f7997c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7998d;

    public C0720o9() {
        a();
    }

    public static C0720o9[] b() {
        if (f7994e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7994e == null) {
                        f7994e = new C0720o9[0];
                    }
                } finally {
                }
            }
        }
        return f7994e;
    }

    public final C0720o9 a() {
        this.f7995a = 0;
        this.f7996b = 0;
        this.f7997c = "";
        this.f7998d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i3 = this.f7995a;
        if (i3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i3);
        }
        int i4 = this.f7996b;
        if (i4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(2, i4);
        }
        if (!this.f7997c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f7997c);
        }
        boolean z = this.f7998d;
        return z ? CodedOutputByteBufferNano.computeBoolSize(4, z) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i3 = this.f7995a;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i3);
        }
        int i4 = this.f7996b;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeUInt32(2, i4);
        }
        if (!this.f7997c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f7997c);
        }
        boolean z = this.f7998d;
        if (z) {
            codedOutputByteBufferNano.writeBool(4, z);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0720o9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f7995a = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 16) {
                this.f7996b = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 26) {
                this.f7997c = codedInputByteBufferNano.readString();
            } else if (readTag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f7998d = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static C0720o9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0720o9().mergeFrom(codedInputByteBufferNano);
    }

    public static C0720o9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0720o9) MessageNano.mergeFrom(new C0720o9(), bArr);
    }
}
