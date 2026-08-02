package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.nm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0829nm extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0829nm[] f12475b;

    /* renamed from: a, reason: collision with root package name */
    public C0803mm[] f12476a;

    public C0829nm() {
        a();
    }

    public static C0829nm[] b() {
        if (f12475b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f12475b == null) {
                        f12475b = new C0829nm[0];
                    }
                } finally {
                }
            }
        }
        return f12475b;
    }

    public final C0829nm a() {
        this.f12476a = C0803mm.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0803mm[] c0803mmArr = this.f12476a;
        if (c0803mmArr != null && c0803mmArr.length > 0) {
            int i4 = 0;
            while (true) {
                C0803mm[] c0803mmArr2 = this.f12476a;
                if (i4 >= c0803mmArr2.length) {
                    break;
                }
                C0803mm c0803mm = c0803mmArr2[i4];
                if (c0803mm != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c0803mm) + computeSerializedSize;
                }
                i4++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0803mm[] c0803mmArr = this.f12476a;
        if (c0803mmArr != null && c0803mmArr.length > 0) {
            int i4 = 0;
            while (true) {
                C0803mm[] c0803mmArr2 = this.f12476a;
                if (i4 >= c0803mmArr2.length) {
                    break;
                }
                C0803mm c0803mm = c0803mmArr2[i4];
                if (c0803mm != null) {
                    codedOutputByteBufferNano.writeMessage(1, c0803mm);
                }
                i4++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0829nm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                C0803mm[] c0803mmArr = this.f12476a;
                int length = c0803mmArr == null ? 0 : c0803mmArr.length;
                int i4 = repeatedFieldArrayLength + length;
                C0803mm[] c0803mmArr2 = new C0803mm[i4];
                if (length != 0) {
                    System.arraycopy(c0803mmArr, 0, c0803mmArr2, 0, length);
                }
                while (length < i4 - 1) {
                    C0803mm c0803mm = new C0803mm();
                    c0803mmArr2[length] = c0803mm;
                    codedInputByteBufferNano.readMessage(c0803mm);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0803mm c0803mm2 = new C0803mm();
                c0803mmArr2[length] = c0803mm2;
                codedInputByteBufferNano.readMessage(c0803mm2);
                this.f12476a = c0803mmArr2;
            }
        }
        return this;
    }

    public static C0829nm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0829nm().mergeFrom(codedInputByteBufferNano);
    }

    public static C0829nm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0829nm) MessageNano.mergeFrom(new C0829nm(), bArr);
    }
}
