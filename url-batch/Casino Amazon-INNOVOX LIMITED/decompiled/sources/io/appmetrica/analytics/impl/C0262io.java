package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.io, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0262io extends MessageNano {
    public static volatile C0262io[] e;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f1312a;
    public double b;
    public double c;
    public boolean d;

    public C0262io() {
        a();
    }

    public static C0262io[] b() {
        if (e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (e == null) {
                    e = new C0262io[0];
                }
            }
        }
        return e;
    }

    public final C0262io a() {
        this.f1312a = WireFormatNano.EMPTY_BYTES;
        this.b = 0.0d;
        this.c = 0.0d;
        this.d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f1312a, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f1312a);
        }
        if (Double.doubleToLongBits(this.b) != Double.doubleToLongBits(0.0d)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(2, this.b);
        }
        if (Double.doubleToLongBits(this.c) != Double.doubleToLongBits(0.0d)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(3, this.c);
        }
        boolean z = this.d;
        return z ? CodedOutputByteBufferNano.computeBoolSize(4, z) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f1312a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f1312a);
        }
        if (Double.doubleToLongBits(this.b) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.writeDouble(2, this.b);
        }
        if (Double.doubleToLongBits(this.c) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.writeDouble(3, this.c);
        }
        boolean z = this.d;
        if (z) {
            codedOutputByteBufferNano.writeBool(4, z);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0262io mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f1312a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 17) {
                this.b = codedInputByteBufferNano.readDouble();
            } else if (readTag == 25) {
                this.c = codedInputByteBufferNano.readDouble();
            } else if (readTag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.d = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static C0262io b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0262io().mergeFrom(codedInputByteBufferNano);
    }

    public static C0262io a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0262io) MessageNano.mergeFrom(new C0262io(), bArr);
    }
}
