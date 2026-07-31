package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes3.dex */
public final class Lk extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile Lk[] f37931b;

    /* renamed from: a, reason: collision with root package name */
    public Mk[] f37932a;

    public Lk() {
        a();
    }

    public static Lk[] b() {
        if (f37931b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f37931b == null) {
                        f37931b = new Lk[0];
                    }
                } finally {
                }
            }
        }
        return f37931b;
    }

    public final Lk a() {
        this.f37932a = Mk.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Mk[] mkArr = this.f37932a;
        if (mkArr != null && mkArr.length > 0) {
            int i4 = 0;
            while (true) {
                Mk[] mkArr2 = this.f37932a;
                if (i4 >= mkArr2.length) {
                    break;
                }
                Mk mk = mkArr2[i4];
                if (mk != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, mk) + computeSerializedSize;
                }
                i4++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        Mk[] mkArr = this.f37932a;
        if (mkArr != null && mkArr.length > 0) {
            int i4 = 0;
            while (true) {
                Mk[] mkArr2 = this.f37932a;
                if (i4 >= mkArr2.length) {
                    break;
                }
                Mk mk = mkArr2[i4];
                if (mk != null) {
                    codedOutputByteBufferNano.writeMessage(1, mk);
                }
                i4++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Lk mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
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
                Mk[] mkArr = this.f37932a;
                int length = mkArr == null ? 0 : mkArr.length;
                int i4 = repeatedFieldArrayLength + length;
                Mk[] mkArr2 = new Mk[i4];
                if (length != 0) {
                    System.arraycopy(mkArr, 0, mkArr2, 0, length);
                }
                while (length < i4 - 1) {
                    Mk mk = new Mk();
                    mkArr2[length] = mk;
                    codedInputByteBufferNano.readMessage(mk);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                Mk mk2 = new Mk();
                mkArr2[length] = mk2;
                codedInputByteBufferNano.readMessage(mk2);
                this.f37932a = mkArr2;
            }
        }
        return this;
    }

    public static Lk b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Lk().mergeFrom(codedInputByteBufferNano);
    }

    public static Lk a(byte[] bArr) {
        return (Lk) MessageNano.mergeFrom(new Lk(), bArr);
    }
}
