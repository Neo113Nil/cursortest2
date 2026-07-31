package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes3.dex */
public final class Bf extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f37240c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f37241d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f37242e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f37243f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static volatile Bf[] f37244g;

    /* renamed from: a, reason: collision with root package name */
    public C3145zf f37245a;

    /* renamed from: b, reason: collision with root package name */
    public Af[] f37246b;

    public Bf() {
        a();
    }

    public static Bf[] b() {
        if (f37244g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f37244g == null) {
                        f37244g = new Bf[0];
                    }
                } finally {
                }
            }
        }
        return f37244g;
    }

    public final Bf a() {
        this.f37245a = null;
        this.f37246b = Af.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C3145zf c3145zf = this.f37245a;
        if (c3145zf != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c3145zf);
        }
        Af[] afArr = this.f37246b;
        if (afArr != null && afArr.length > 0) {
            int i4 = 0;
            while (true) {
                Af[] afArr2 = this.f37246b;
                if (i4 >= afArr2.length) {
                    break;
                }
                Af af = afArr2[i4];
                if (af != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, af) + computeSerializedSize;
                }
                i4++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C3145zf c3145zf = this.f37245a;
        if (c3145zf != null) {
            codedOutputByteBufferNano.writeMessage(1, c3145zf);
        }
        Af[] afArr = this.f37246b;
        if (afArr != null && afArr.length > 0) {
            int i4 = 0;
            while (true) {
                Af[] afArr2 = this.f37246b;
                if (i4 >= afArr2.length) {
                    break;
                }
                Af af = afArr2[i4];
                if (af != null) {
                    codedOutputByteBufferNano.writeMessage(2, af);
                }
                i4++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Bf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f37245a == null) {
                    this.f37245a = new C3145zf();
                }
                codedInputByteBufferNano.readMessage(this.f37245a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                Af[] afArr = this.f37246b;
                int length = afArr == null ? 0 : afArr.length;
                int i4 = repeatedFieldArrayLength + length;
                Af[] afArr2 = new Af[i4];
                if (length != 0) {
                    System.arraycopy(afArr, 0, afArr2, 0, length);
                }
                while (length < i4 - 1) {
                    Af af = new Af();
                    afArr2[length] = af;
                    codedInputByteBufferNano.readMessage(af);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                Af af2 = new Af();
                afArr2[length] = af2;
                codedInputByteBufferNano.readMessage(af2);
                this.f37246b = afArr2;
            }
        }
        return this;
    }

    public static Bf b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Bf().mergeFrom(codedInputByteBufferNano);
    }

    public static Bf a(byte[] bArr) {
        return (Bf) MessageNano.mergeFrom(new Bf(), bArr);
    }
}
