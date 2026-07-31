package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.eo, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2608eo extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C2608eo[] f38940e;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f38941a;

    /* renamed from: b, reason: collision with root package name */
    public double f38942b;

    /* renamed from: c, reason: collision with root package name */
    public double f38943c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f38944d;

    public C2608eo() {
        a();
    }

    public static C2608eo[] b() {
        if (f38940e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f38940e == null) {
                        f38940e = new C2608eo[0];
                    }
                } finally {
                }
            }
        }
        return f38940e;
    }

    public final C2608eo a() {
        this.f38941a = WireFormatNano.EMPTY_BYTES;
        this.f38942b = 0.0d;
        this.f38943c = 0.0d;
        this.f38944d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f38941a, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f38941a);
        }
        if (Double.doubleToLongBits(this.f38942b) != Double.doubleToLongBits(0.0d)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(2, this.f38942b);
        }
        if (Double.doubleToLongBits(this.f38943c) != Double.doubleToLongBits(0.0d)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(3, this.f38943c);
        }
        boolean z4 = this.f38944d;
        return z4 ? CodedOutputByteBufferNano.computeBoolSize(4, z4) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!Arrays.equals(this.f38941a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f38941a);
        }
        if (Double.doubleToLongBits(this.f38942b) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.writeDouble(2, this.f38942b);
        }
        if (Double.doubleToLongBits(this.f38943c) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.writeDouble(3, this.f38943c);
        }
        boolean z4 = this.f38944d;
        if (z4) {
            codedOutputByteBufferNano.writeBool(4, z4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2608eo mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f38941a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 17) {
                this.f38942b = codedInputByteBufferNano.readDouble();
            } else if (readTag == 25) {
                this.f38943c = codedInputByteBufferNano.readDouble();
            } else if (readTag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f38944d = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static C2608eo b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2608eo().mergeFrom(codedInputByteBufferNano);
    }

    public static C2608eo a(byte[] bArr) {
        return (C2608eo) MessageNano.mergeFrom(new C2608eo(), bArr);
    }
}
