package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.ho, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0676ho extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C0676ho[] f12006e;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f12007a;

    /* renamed from: b, reason: collision with root package name */
    public double f12008b;

    /* renamed from: c, reason: collision with root package name */
    public double f12009c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12010d;

    public C0676ho() {
        a();
    }

    public static C0676ho[] b() {
        if (f12006e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f12006e == null) {
                        f12006e = new C0676ho[0];
                    }
                } finally {
                }
            }
        }
        return f12006e;
    }

    public final C0676ho a() {
        this.f12007a = WireFormatNano.EMPTY_BYTES;
        this.f12008b = 0.0d;
        this.f12009c = 0.0d;
        this.f12010d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f12007a, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f12007a);
        }
        if (Double.doubleToLongBits(this.f12008b) != Double.doubleToLongBits(0.0d)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(2, this.f12008b);
        }
        if (Double.doubleToLongBits(this.f12009c) != Double.doubleToLongBits(0.0d)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(3, this.f12009c);
        }
        boolean z = this.f12010d;
        return z ? CodedOutputByteBufferNano.computeBoolSize(4, z) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f12007a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f12007a);
        }
        if (Double.doubleToLongBits(this.f12008b) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.writeDouble(2, this.f12008b);
        }
        if (Double.doubleToLongBits(this.f12009c) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.writeDouble(3, this.f12009c);
        }
        boolean z = this.f12010d;
        if (z) {
            codedOutputByteBufferNano.writeBool(4, z);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0676ho mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f12007a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 17) {
                this.f12008b = codedInputByteBufferNano.readDouble();
            } else if (readTag == 25) {
                this.f12009c = codedInputByteBufferNano.readDouble();
            } else if (readTag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f12010d = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static C0676ho b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0676ho().mergeFrom(codedInputByteBufferNano);
    }

    public static C0676ho a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0676ho) MessageNano.mergeFrom(new C0676ho(), bArr);
    }
}
