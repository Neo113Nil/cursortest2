package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.go, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0650go extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0650go[] f11958c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f11959a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f11960b;

    public C0650go() {
        a();
    }

    public static C0650go[] b() {
        if (f11958c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f11958c == null) {
                        f11958c = new C0650go[0];
                    }
                } finally {
                }
            }
        }
        return f11958c;
    }

    public final C0650go a() {
        this.f11959a = false;
        this.f11960b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z = this.f11959a;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z);
        }
        boolean z4 = this.f11960b;
        return z4 ? CodedOutputByteBufferNano.computeBoolSize(2, z4) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z = this.f11959a;
        if (z) {
            codedOutputByteBufferNano.writeBool(1, z);
        }
        boolean z4 = this.f11960b;
        if (z4) {
            codedOutputByteBufferNano.writeBool(2, z4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0650go mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f11959a = codedInputByteBufferNano.readBool();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f11960b = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static C0650go b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0650go().mergeFrom(codedInputByteBufferNano);
    }

    public static C0650go a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0650go) MessageNano.mergeFrom(new C0650go(), bArr);
    }
}
