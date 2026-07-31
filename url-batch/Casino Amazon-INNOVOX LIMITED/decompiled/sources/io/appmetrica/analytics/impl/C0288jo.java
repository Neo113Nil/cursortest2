package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.jo, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0288jo extends MessageNano {
    public static volatile C0288jo[] b;

    /* renamed from: a, reason: collision with root package name */
    public C0211go[] f1329a;

    public C0288jo() {
        a();
    }

    public static C0288jo[] b() {
        if (b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (b == null) {
                    b = new C0288jo[0];
                }
            }
        }
        return b;
    }

    public final C0288jo a() {
        this.f1329a = C0211go.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0211go[] c0211goArr = this.f1329a;
        if (c0211goArr != null && c0211goArr.length > 0) {
            int i = 0;
            while (true) {
                C0211go[] c0211goArr2 = this.f1329a;
                if (i >= c0211goArr2.length) {
                    break;
                }
                C0211go c0211go = c0211goArr2[i];
                if (c0211go != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c0211go) + computeSerializedSize;
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0211go[] c0211goArr = this.f1329a;
        if (c0211goArr != null && c0211goArr.length > 0) {
            int i = 0;
            while (true) {
                C0211go[] c0211goArr2 = this.f1329a;
                if (i >= c0211goArr2.length) {
                    break;
                }
                C0211go c0211go = c0211goArr2[i];
                if (c0211go != null) {
                    codedOutputByteBufferNano.writeMessage(1, c0211go);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0288jo mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                C0211go[] c0211goArr = this.f1329a;
                int length = c0211goArr == null ? 0 : c0211goArr.length;
                int i = repeatedFieldArrayLength + length;
                C0211go[] c0211goArr2 = new C0211go[i];
                if (length != 0) {
                    System.arraycopy(c0211goArr, 0, c0211goArr2, 0, length);
                }
                while (length < i - 1) {
                    C0211go c0211go = new C0211go();
                    c0211goArr2[length] = c0211go;
                    codedInputByteBufferNano.readMessage(c0211go);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0211go c0211go2 = new C0211go();
                c0211goArr2[length] = c0211go2;
                codedInputByteBufferNano.readMessage(c0211go2);
                this.f1329a = c0211goArr2;
            }
        }
        return this;
    }

    public static C0288jo b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0288jo().mergeFrom(codedInputByteBufferNano);
    }

    public static C0288jo a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0288jo) MessageNano.mergeFrom(new C0288jo(), bArr);
    }
}
