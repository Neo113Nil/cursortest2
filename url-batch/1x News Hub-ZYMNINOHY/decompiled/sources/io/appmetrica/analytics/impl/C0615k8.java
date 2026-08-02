package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.k8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0615k8 extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C0615k8[] f7706e;

    /* renamed from: a, reason: collision with root package name */
    public C0848t8 f7707a;

    /* renamed from: b, reason: collision with root package name */
    public C0900v8 f7708b;

    /* renamed from: c, reason: collision with root package name */
    public C0667m8 f7709c;

    /* renamed from: d, reason: collision with root package name */
    public C0822s8 f7710d;

    public C0615k8() {
        a();
    }

    public static C0615k8[] b() {
        if (f7706e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7706e == null) {
                        f7706e = new C0615k8[0];
                    }
                } finally {
                }
            }
        }
        return f7706e;
    }

    public final C0615k8 a() {
        this.f7707a = null;
        this.f7708b = null;
        this.f7709c = null;
        this.f7710d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0848t8 c0848t8 = this.f7707a;
        if (c0848t8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0848t8);
        }
        C0900v8 c0900v8 = this.f7708b;
        if (c0900v8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c0900v8);
        }
        C0667m8 c0667m8 = this.f7709c;
        if (c0667m8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c0667m8);
        }
        C0822s8 c0822s8 = this.f7710d;
        return c0822s8 != null ? CodedOutputByteBufferNano.computeMessageSize(4, c0822s8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0848t8 c0848t8 = this.f7707a;
        if (c0848t8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0848t8);
        }
        C0900v8 c0900v8 = this.f7708b;
        if (c0900v8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0900v8);
        }
        C0667m8 c0667m8 = this.f7709c;
        if (c0667m8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c0667m8);
        }
        C0822s8 c0822s8 = this.f7710d;
        if (c0822s8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0822s8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0615k8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f7707a == null) {
                    this.f7707a = new C0848t8();
                }
                codedInputByteBufferNano.readMessage(this.f7707a);
            } else if (readTag == 18) {
                if (this.f7708b == null) {
                    this.f7708b = new C0900v8();
                }
                codedInputByteBufferNano.readMessage(this.f7708b);
            } else if (readTag == 26) {
                if (this.f7709c == null) {
                    this.f7709c = new C0667m8();
                }
                codedInputByteBufferNano.readMessage(this.f7709c);
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f7710d == null) {
                    this.f7710d = new C0822s8();
                }
                codedInputByteBufferNano.readMessage(this.f7710d);
            }
        }
        return this;
    }

    public static C0615k8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0615k8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0615k8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0615k8) MessageNano.mergeFrom(new C0615k8(), bArr);
    }
}
