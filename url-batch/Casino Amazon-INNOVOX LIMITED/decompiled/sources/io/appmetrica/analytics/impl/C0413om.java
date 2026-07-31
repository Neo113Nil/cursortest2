package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.om, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0413om extends MessageNano {
    public static volatile C0413om[] b;

    /* renamed from: a, reason: collision with root package name */
    public C0388nm[] f1421a;

    public C0413om() {
        a();
    }

    public static C0413om[] b() {
        if (b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (b == null) {
                    b = new C0413om[0];
                }
            }
        }
        return b;
    }

    public final C0413om a() {
        this.f1421a = C0388nm.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0388nm[] c0388nmArr = this.f1421a;
        if (c0388nmArr != null && c0388nmArr.length > 0) {
            int i = 0;
            while (true) {
                C0388nm[] c0388nmArr2 = this.f1421a;
                if (i >= c0388nmArr2.length) {
                    break;
                }
                C0388nm c0388nm = c0388nmArr2[i];
                if (c0388nm != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c0388nm) + computeSerializedSize;
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0388nm[] c0388nmArr = this.f1421a;
        if (c0388nmArr != null && c0388nmArr.length > 0) {
            int i = 0;
            while (true) {
                C0388nm[] c0388nmArr2 = this.f1421a;
                if (i >= c0388nmArr2.length) {
                    break;
                }
                C0388nm c0388nm = c0388nmArr2[i];
                if (c0388nm != null) {
                    codedOutputByteBufferNano.writeMessage(1, c0388nm);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0413om mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                C0388nm[] c0388nmArr = this.f1421a;
                int length = c0388nmArr == null ? 0 : c0388nmArr.length;
                int i = repeatedFieldArrayLength + length;
                C0388nm[] c0388nmArr2 = new C0388nm[i];
                if (length != 0) {
                    System.arraycopy(c0388nmArr, 0, c0388nmArr2, 0, length);
                }
                while (length < i - 1) {
                    C0388nm c0388nm = new C0388nm();
                    c0388nmArr2[length] = c0388nm;
                    codedInputByteBufferNano.readMessage(c0388nm);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0388nm c0388nm2 = new C0388nm();
                c0388nmArr2[length] = c0388nm2;
                codedInputByteBufferNano.readMessage(c0388nm2);
                this.f1421a = c0388nmArr2;
            }
        }
        return this;
    }

    public static C0413om b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0413om().mergeFrom(codedInputByteBufferNano);
    }

    public static C0413om a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0413om) MessageNano.mergeFrom(new C0413om(), bArr);
    }
}
