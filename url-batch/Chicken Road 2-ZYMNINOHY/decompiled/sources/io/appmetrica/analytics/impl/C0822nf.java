package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.nf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0822nf extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f12457c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f12458d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f12459e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f12460f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static volatile C0822nf[] f12461g;

    /* renamed from: a, reason: collision with root package name */
    public C0770lf f12462a;

    /* renamed from: b, reason: collision with root package name */
    public C0796mf[] f12463b;

    public C0822nf() {
        a();
    }

    public static C0822nf[] b() {
        if (f12461g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f12461g == null) {
                        f12461g = new C0822nf[0];
                    }
                } finally {
                }
            }
        }
        return f12461g;
    }

    public final C0822nf a() {
        this.f12462a = null;
        this.f12463b = C0796mf.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0770lf c0770lf = this.f12462a;
        if (c0770lf != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0770lf);
        }
        C0796mf[] c0796mfArr = this.f12463b;
        if (c0796mfArr != null && c0796mfArr.length > 0) {
            int i4 = 0;
            while (true) {
                C0796mf[] c0796mfArr2 = this.f12463b;
                if (i4 >= c0796mfArr2.length) {
                    break;
                }
                C0796mf c0796mf = c0796mfArr2[i4];
                if (c0796mf != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c0796mf) + computeSerializedSize;
                }
                i4++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0770lf c0770lf = this.f12462a;
        if (c0770lf != null) {
            codedOutputByteBufferNano.writeMessage(1, c0770lf);
        }
        C0796mf[] c0796mfArr = this.f12463b;
        if (c0796mfArr != null && c0796mfArr.length > 0) {
            int i4 = 0;
            while (true) {
                C0796mf[] c0796mfArr2 = this.f12463b;
                if (i4 >= c0796mfArr2.length) {
                    break;
                }
                C0796mf c0796mf = c0796mfArr2[i4];
                if (c0796mf != null) {
                    codedOutputByteBufferNano.writeMessage(2, c0796mf);
                }
                i4++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0822nf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f12462a == null) {
                    this.f12462a = new C0770lf();
                }
                codedInputByteBufferNano.readMessage(this.f12462a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C0796mf[] c0796mfArr = this.f12463b;
                int length = c0796mfArr == null ? 0 : c0796mfArr.length;
                int i4 = repeatedFieldArrayLength + length;
                C0796mf[] c0796mfArr2 = new C0796mf[i4];
                if (length != 0) {
                    System.arraycopy(c0796mfArr, 0, c0796mfArr2, 0, length);
                }
                while (length < i4 - 1) {
                    C0796mf c0796mf = new C0796mf();
                    c0796mfArr2[length] = c0796mf;
                    codedInputByteBufferNano.readMessage(c0796mf);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0796mf c0796mf2 = new C0796mf();
                c0796mfArr2[length] = c0796mf2;
                codedInputByteBufferNano.readMessage(c0796mf2);
                this.f12463b = c0796mfArr2;
            }
        }
        return this;
    }

    public static C0822nf b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0822nf().mergeFrom(codedInputByteBufferNano);
    }

    public static C0822nf a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0822nf) MessageNano.mergeFrom(new C0822nf(), bArr);
    }
}
