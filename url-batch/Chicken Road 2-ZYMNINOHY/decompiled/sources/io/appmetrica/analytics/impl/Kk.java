package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class Kk extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile Kk[] f10539b;

    /* renamed from: a, reason: collision with root package name */
    public Lk[] f10540a;

    public Kk() {
        a();
    }

    public static Kk[] b() {
        if (f10539b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f10539b == null) {
                        f10539b = new Kk[0];
                    }
                } finally {
                }
            }
        }
        return f10539b;
    }

    public final Kk a() {
        this.f10540a = Lk.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Lk[] lkArr = this.f10540a;
        if (lkArr != null && lkArr.length > 0) {
            int i4 = 0;
            while (true) {
                Lk[] lkArr2 = this.f10540a;
                if (i4 >= lkArr2.length) {
                    break;
                }
                Lk lk = lkArr2[i4];
                if (lk != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, lk) + computeSerializedSize;
                }
                i4++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        Lk[] lkArr = this.f10540a;
        if (lkArr != null && lkArr.length > 0) {
            int i4 = 0;
            while (true) {
                Lk[] lkArr2 = this.f10540a;
                if (i4 >= lkArr2.length) {
                    break;
                }
                Lk lk = lkArr2[i4];
                if (lk != null) {
                    codedOutputByteBufferNano.writeMessage(1, lk);
                }
                i4++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Kk mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                Lk[] lkArr = this.f10540a;
                int length = lkArr == null ? 0 : lkArr.length;
                int i4 = repeatedFieldArrayLength + length;
                Lk[] lkArr2 = new Lk[i4];
                if (length != 0) {
                    System.arraycopy(lkArr, 0, lkArr2, 0, length);
                }
                while (length < i4 - 1) {
                    Lk lk = new Lk();
                    lkArr2[length] = lk;
                    codedInputByteBufferNano.readMessage(lk);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                Lk lk2 = new Lk();
                lkArr2[length] = lk2;
                codedInputByteBufferNano.readMessage(lk2);
                this.f10540a = lkArr2;
            }
        }
        return this;
    }

    public static Kk b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Kk().mergeFrom(codedInputByteBufferNano);
    }

    public static Kk a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Kk) MessageNano.mergeFrom(new Kk(), bArr);
    }
}
