package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.w3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1043w3 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C1043w3[] f12916b;

    /* renamed from: a, reason: collision with root package name */
    public C1017v3[] f12917a;

    public C1043w3() {
        a();
    }

    public static C1043w3[] b() {
        if (f12916b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f12916b == null) {
                        f12916b = new C1043w3[0];
                    }
                } finally {
                }
            }
        }
        return f12916b;
    }

    public final C1043w3 a() {
        this.f12917a = C1017v3.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C1017v3[] c1017v3Arr = this.f12917a;
        if (c1017v3Arr != null && c1017v3Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C1017v3[] c1017v3Arr2 = this.f12917a;
                if (i4 >= c1017v3Arr2.length) {
                    break;
                }
                C1017v3 c1017v3 = c1017v3Arr2[i4];
                if (c1017v3 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c1017v3) + computeSerializedSize;
                }
                i4++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C1017v3[] c1017v3Arr = this.f12917a;
        if (c1017v3Arr != null && c1017v3Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C1017v3[] c1017v3Arr2 = this.f12917a;
                if (i4 >= c1017v3Arr2.length) {
                    break;
                }
                C1017v3 c1017v3 = c1017v3Arr2[i4];
                if (c1017v3 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c1017v3);
                }
                i4++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1043w3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                C1017v3[] c1017v3Arr = this.f12917a;
                int length = c1017v3Arr == null ? 0 : c1017v3Arr.length;
                int i4 = repeatedFieldArrayLength + length;
                C1017v3[] c1017v3Arr2 = new C1017v3[i4];
                if (length != 0) {
                    System.arraycopy(c1017v3Arr, 0, c1017v3Arr2, 0, length);
                }
                while (length < i4 - 1) {
                    C1017v3 c1017v3 = new C1017v3();
                    c1017v3Arr2[length] = c1017v3;
                    codedInputByteBufferNano.readMessage(c1017v3);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C1017v3 c1017v32 = new C1017v3();
                c1017v3Arr2[length] = c1017v32;
                codedInputByteBufferNano.readMessage(c1017v32);
                this.f12917a = c1017v3Arr2;
            }
        }
        return this;
    }

    public static C1043w3 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C1043w3().mergeFrom(codedInputByteBufferNano);
    }

    public static C1043w3 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C1043w3) MessageNano.mergeFrom(new C1043w3(), bArr);
    }
}
