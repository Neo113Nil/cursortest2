package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.jo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0605jo extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C0605jo[] f7690e;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f7691a;

    /* renamed from: b, reason: collision with root package name */
    public double f7692b;

    /* renamed from: c, reason: collision with root package name */
    public double f7693c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7694d;

    public C0605jo() {
        a();
    }

    public static C0605jo[] b() {
        if (f7690e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7690e == null) {
                        f7690e = new C0605jo[0];
                    }
                } finally {
                }
            }
        }
        return f7690e;
    }

    public final C0605jo a() {
        this.f7691a = WireFormatNano.EMPTY_BYTES;
        this.f7692b = 0.0d;
        this.f7693c = 0.0d;
        this.f7694d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f7691a, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f7691a);
        }
        if (Double.doubleToLongBits(this.f7692b) != Double.doubleToLongBits(0.0d)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(2, this.f7692b);
        }
        if (Double.doubleToLongBits(this.f7693c) != Double.doubleToLongBits(0.0d)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(3, this.f7693c);
        }
        boolean z = this.f7694d;
        return z ? CodedOutputByteBufferNano.computeBoolSize(4, z) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f7691a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f7691a);
        }
        if (Double.doubleToLongBits(this.f7692b) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.writeDouble(2, this.f7692b);
        }
        if (Double.doubleToLongBits(this.f7693c) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.writeDouble(3, this.f7693c);
        }
        boolean z = this.f7694d;
        if (z) {
            codedOutputByteBufferNano.writeBool(4, z);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0605jo mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f7691a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 17) {
                this.f7692b = codedInputByteBufferNano.readDouble();
            } else if (readTag == 25) {
                this.f7693c = codedInputByteBufferNano.readDouble();
            } else if (readTag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f7694d = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static C0605jo b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0605jo().mergeFrom(codedInputByteBufferNano);
    }

    public static C0605jo a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0605jo) MessageNano.mergeFrom(new C0605jo(), bArr);
    }
}
