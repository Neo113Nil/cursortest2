package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.c8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0531c8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0531c8[] f11593c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f11594a;

    /* renamed from: b, reason: collision with root package name */
    public C0634g8 f11595b;

    public C0531c8() {
        a();
    }

    public static C0531c8[] b() {
        if (f11593c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f11593c == null) {
                        f11593c = new C0531c8[0];
                    }
                } finally {
                }
            }
        }
        return f11593c;
    }

    public final C0531c8 a() {
        this.f11594a = WireFormatNano.EMPTY_BYTES;
        this.f11595b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f11594a, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f11594a);
        }
        C0634g8 c0634g8 = this.f11595b;
        return c0634g8 != null ? CodedOutputByteBufferNano.computeMessageSize(2, c0634g8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f11594a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f11594a);
        }
        C0634g8 c0634g8 = this.f11595b;
        if (c0634g8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0634g8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0531c8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f11594a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f11595b == null) {
                    this.f11595b = new C0634g8();
                }
                codedInputByteBufferNano.readMessage(this.f11595b);
            }
        }
        return this;
    }

    public static C0531c8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0531c8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0531c8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0531c8) MessageNano.mergeFrom(new C0531c8(), bArr);
    }
}
