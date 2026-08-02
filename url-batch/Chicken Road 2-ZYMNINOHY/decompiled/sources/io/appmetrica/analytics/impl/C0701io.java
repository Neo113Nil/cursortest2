package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.io, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0701io extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0701io[] f12082b;

    /* renamed from: a, reason: collision with root package name */
    public C0624fo[] f12083a;

    public C0701io() {
        a();
    }

    public static C0701io[] b() {
        if (f12082b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f12082b == null) {
                        f12082b = new C0701io[0];
                    }
                } finally {
                }
            }
        }
        return f12082b;
    }

    public final C0701io a() {
        this.f12083a = C0624fo.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0624fo[] c0624foArr = this.f12083a;
        if (c0624foArr != null && c0624foArr.length > 0) {
            int i4 = 0;
            while (true) {
                C0624fo[] c0624foArr2 = this.f12083a;
                if (i4 >= c0624foArr2.length) {
                    break;
                }
                C0624fo c0624fo = c0624foArr2[i4];
                if (c0624fo != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c0624fo) + computeSerializedSize;
                }
                i4++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0624fo[] c0624foArr = this.f12083a;
        if (c0624foArr != null && c0624foArr.length > 0) {
            int i4 = 0;
            while (true) {
                C0624fo[] c0624foArr2 = this.f12083a;
                if (i4 >= c0624foArr2.length) {
                    break;
                }
                C0624fo c0624fo = c0624foArr2[i4];
                if (c0624fo != null) {
                    codedOutputByteBufferNano.writeMessage(1, c0624fo);
                }
                i4++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0701io mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C0624fo[] c0624foArr = this.f12083a;
                int length = c0624foArr == null ? 0 : c0624foArr.length;
                int i4 = repeatedFieldArrayLength + length;
                C0624fo[] c0624foArr2 = new C0624fo[i4];
                if (length != 0) {
                    System.arraycopy(c0624foArr, 0, c0624foArr2, 0, length);
                }
                while (length < i4 - 1) {
                    C0624fo c0624fo = new C0624fo();
                    c0624foArr2[length] = c0624fo;
                    codedInputByteBufferNano.readMessage(c0624fo);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0624fo c0624fo2 = new C0624fo();
                c0624foArr2[length] = c0624fo2;
                codedInputByteBufferNano.readMessage(c0624fo2);
                this.f12083a = c0624foArr2;
            }
        }
        return this;
    }

    public static C0701io b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0701io().mergeFrom(codedInputByteBufferNano);
    }

    public static C0701io a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0701io) MessageNano.mergeFrom(new C0701io(), bArr);
    }
}
