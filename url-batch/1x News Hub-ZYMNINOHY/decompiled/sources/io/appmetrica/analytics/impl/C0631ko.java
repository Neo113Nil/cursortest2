package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.ko, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0631ko extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0631ko[] f7745b;

    /* renamed from: a, reason: collision with root package name */
    public C0554ho[] f7746a;

    public C0631ko() {
        a();
    }

    public static C0631ko[] b() {
        if (f7745b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7745b == null) {
                        f7745b = new C0631ko[0];
                    }
                } finally {
                }
            }
        }
        return f7745b;
    }

    public final C0631ko a() {
        this.f7746a = C0554ho.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0554ho[] c0554hoArr = this.f7746a;
        if (c0554hoArr != null && c0554hoArr.length > 0) {
            int i3 = 0;
            while (true) {
                C0554ho[] c0554hoArr2 = this.f7746a;
                if (i3 >= c0554hoArr2.length) {
                    break;
                }
                C0554ho c0554ho = c0554hoArr2[i3];
                if (c0554ho != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c0554ho) + computeSerializedSize;
                }
                i3++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0554ho[] c0554hoArr = this.f7746a;
        if (c0554hoArr != null && c0554hoArr.length > 0) {
            int i3 = 0;
            while (true) {
                C0554ho[] c0554hoArr2 = this.f7746a;
                if (i3 >= c0554hoArr2.length) {
                    break;
                }
                C0554ho c0554ho = c0554hoArr2[i3];
                if (c0554ho != null) {
                    codedOutputByteBufferNano.writeMessage(1, c0554ho);
                }
                i3++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0631ko mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                C0554ho[] c0554hoArr = this.f7746a;
                int length = c0554hoArr == null ? 0 : c0554hoArr.length;
                int i3 = repeatedFieldArrayLength + length;
                C0554ho[] c0554hoArr2 = new C0554ho[i3];
                if (length != 0) {
                    System.arraycopy(c0554hoArr, 0, c0554hoArr2, 0, length);
                }
                while (length < i3 - 1) {
                    C0554ho c0554ho = new C0554ho();
                    c0554hoArr2[length] = c0554ho;
                    codedInputByteBufferNano.readMessage(c0554ho);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0554ho c0554ho2 = new C0554ho();
                c0554hoArr2[length] = c0554ho2;
                codedInputByteBufferNano.readMessage(c0554ho2);
                this.f7746a = c0554hoArr2;
            }
        }
        return this;
    }

    public static C0631ko b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0631ko().mergeFrom(codedInputByteBufferNano);
    }

    public static C0631ko a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0631ko) MessageNano.mergeFrom(new C0631ko(), bArr);
    }
}
