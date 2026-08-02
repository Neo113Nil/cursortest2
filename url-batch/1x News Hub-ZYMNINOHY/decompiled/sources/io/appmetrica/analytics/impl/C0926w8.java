package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.w8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0926w8 extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C0926w8[] f8555e;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f8556a;

    /* renamed from: b, reason: collision with root package name */
    public C0641l8 f8557b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f8558c;

    /* renamed from: d, reason: collision with root package name */
    public C0796r8 f8559d;

    public C0926w8() {
        a();
    }

    public static C0926w8[] b() {
        if (f8555e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8555e == null) {
                        f8555e = new C0926w8[0];
                    }
                } finally {
                }
            }
        }
        return f8555e;
    }

    public final C0926w8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f8556a = bArr;
        this.f8557b = null;
        this.f8558c = bArr;
        this.f8559d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f8556a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f8556a);
        }
        C0641l8 c0641l8 = this.f8557b;
        if (c0641l8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c0641l8);
        }
        if (!Arrays.equals(this.f8558c, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.f8558c);
        }
        C0796r8 c0796r8 = this.f8559d;
        return c0796r8 != null ? CodedOutputByteBufferNano.computeMessageSize(4, c0796r8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f8556a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f8556a);
        }
        C0641l8 c0641l8 = this.f8557b;
        if (c0641l8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0641l8);
        }
        if (!Arrays.equals(this.f8558c, bArr2)) {
            codedOutputByteBufferNano.writeBytes(3, this.f8558c);
        }
        C0796r8 c0796r8 = this.f8559d;
        if (c0796r8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0796r8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0926w8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f8556a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                if (this.f8557b == null) {
                    this.f8557b = new C0641l8();
                }
                codedInputByteBufferNano.readMessage(this.f8557b);
            } else if (readTag == 26) {
                this.f8558c = codedInputByteBufferNano.readBytes();
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f8559d == null) {
                    this.f8559d = new C0796r8();
                }
                codedInputByteBufferNano.readMessage(this.f8559d);
            }
        }
        return this;
    }

    public static C0926w8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0926w8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0926w8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0926w8) MessageNano.mergeFrom(new C0926w8(), bArr);
    }
}
