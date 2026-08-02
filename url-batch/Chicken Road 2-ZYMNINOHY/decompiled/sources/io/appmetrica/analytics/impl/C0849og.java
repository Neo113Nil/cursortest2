package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.og, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0849og extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static final int f12517e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f12518f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f12519g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static volatile C0849og[] f12520h;

    /* renamed from: a, reason: collision with root package name */
    public String f12521a;

    /* renamed from: b, reason: collision with root package name */
    public long f12522b;

    /* renamed from: c, reason: collision with root package name */
    public long f12523c;

    /* renamed from: d, reason: collision with root package name */
    public int f12524d;

    public C0849og() {
        a();
    }

    public static C0849og[] b() {
        if (f12520h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f12520h == null) {
                        f12520h = new C0849og[0];
                    }
                } finally {
                }
            }
        }
        return f12520h;
    }

    public final C0849og a() {
        this.f12521a = "";
        this.f12522b = 0L;
        this.f12523c = 0L;
        this.f12524d = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f12521a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f12521a);
        }
        long j4 = this.f12522b;
        if (j4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j4);
        }
        long j5 = this.f12523c;
        if (j5 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(3, j5);
        }
        int i4 = this.f12524d;
        return i4 != 0 ? CodedOutputByteBufferNano.computeInt32Size(4, i4) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f12521a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f12521a);
        }
        long j4 = this.f12522b;
        if (j4 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j4);
        }
        long j5 = this.f12523c;
        if (j5 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j5);
        }
        int i4 = this.f12524d;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeInt32(4, i4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0849og mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f12521a = codedInputByteBufferNano.readString();
            } else if (readTag == 16) {
                this.f12522b = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 24) {
                this.f12523c = codedInputByteBufferNano.readUInt64();
            } else if (readTag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f12524d = readInt32;
                }
            }
        }
        return this;
    }

    public static C0849og b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0849og().mergeFrom(codedInputByteBufferNano);
    }

    public static C0849og a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0849og) MessageNano.mergeFrom(new C0849og(), bArr);
    }
}
