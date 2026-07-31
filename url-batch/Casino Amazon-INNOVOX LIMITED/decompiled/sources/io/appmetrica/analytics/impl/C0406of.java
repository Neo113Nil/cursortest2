package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.of, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0406of extends MessageNano {
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    public static volatile C0406of[] g;

    /* renamed from: a, reason: collision with root package name */
    public C0356mf f1415a;
    public C0381nf[] b;

    public C0406of() {
        a();
    }

    public static C0406of[] b() {
        if (g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (g == null) {
                    g = new C0406of[0];
                }
            }
        }
        return g;
    }

    public final C0406of a() {
        this.f1415a = null;
        this.b = C0381nf.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0356mf c0356mf = this.f1415a;
        if (c0356mf != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0356mf);
        }
        C0381nf[] c0381nfArr = this.b;
        if (c0381nfArr != null && c0381nfArr.length > 0) {
            int i = 0;
            while (true) {
                C0381nf[] c0381nfArr2 = this.b;
                if (i >= c0381nfArr2.length) {
                    break;
                }
                C0381nf c0381nf = c0381nfArr2[i];
                if (c0381nf != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c0381nf) + computeSerializedSize;
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0356mf c0356mf = this.f1415a;
        if (c0356mf != null) {
            codedOutputByteBufferNano.writeMessage(1, c0356mf);
        }
        C0381nf[] c0381nfArr = this.b;
        if (c0381nfArr != null && c0381nfArr.length > 0) {
            int i = 0;
            while (true) {
                C0381nf[] c0381nfArr2 = this.b;
                if (i >= c0381nfArr2.length) {
                    break;
                }
                C0381nf c0381nf = c0381nfArr2[i];
                if (c0381nf != null) {
                    codedOutputByteBufferNano.writeMessage(2, c0381nf);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0406of mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f1415a == null) {
                    this.f1415a = new C0356mf();
                }
                codedInputByteBufferNano.readMessage(this.f1415a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C0381nf[] c0381nfArr = this.b;
                int length = c0381nfArr == null ? 0 : c0381nfArr.length;
                int i = repeatedFieldArrayLength + length;
                C0381nf[] c0381nfArr2 = new C0381nf[i];
                if (length != 0) {
                    System.arraycopy(c0381nfArr, 0, c0381nfArr2, 0, length);
                }
                while (length < i - 1) {
                    C0381nf c0381nf = new C0381nf();
                    c0381nfArr2[length] = c0381nf;
                    codedInputByteBufferNano.readMessage(c0381nf);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0381nf c0381nf2 = new C0381nf();
                c0381nfArr2[length] = c0381nf2;
                codedInputByteBufferNano.readMessage(c0381nf2);
                this.b = c0381nfArr2;
            }
        }
        return this;
    }

    public static C0406of b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0406of().mergeFrom(codedInputByteBufferNano);
    }

    public static C0406of a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0406of) MessageNano.mergeFrom(new C0406of(), bArr);
    }
}
