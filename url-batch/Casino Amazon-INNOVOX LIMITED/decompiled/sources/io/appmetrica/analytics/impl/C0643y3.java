package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.y3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0643y3 extends MessageNano {
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    public static volatile C0643y3[] g;

    /* renamed from: a, reason: collision with root package name */
    public C0568v3 f1576a;
    public C0568v3[] b;

    public C0643y3() {
        a();
    }

    public static C0643y3[] b() {
        if (g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (g == null) {
                    g = new C0643y3[0];
                }
            }
        }
        return g;
    }

    public final C0643y3 a() {
        this.f1576a = null;
        this.b = C0568v3.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0568v3 c0568v3 = this.f1576a;
        if (c0568v3 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0568v3);
        }
        C0568v3[] c0568v3Arr = this.b;
        if (c0568v3Arr != null && c0568v3Arr.length > 0) {
            int i = 0;
            while (true) {
                C0568v3[] c0568v3Arr2 = this.b;
                if (i >= c0568v3Arr2.length) {
                    break;
                }
                C0568v3 c0568v32 = c0568v3Arr2[i];
                if (c0568v32 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c0568v32) + computeSerializedSize;
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0568v3 c0568v3 = this.f1576a;
        if (c0568v3 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0568v3);
        }
        C0568v3[] c0568v3Arr = this.b;
        if (c0568v3Arr != null && c0568v3Arr.length > 0) {
            int i = 0;
            while (true) {
                C0568v3[] c0568v3Arr2 = this.b;
                if (i >= c0568v3Arr2.length) {
                    break;
                }
                C0568v3 c0568v32 = c0568v3Arr2[i];
                if (c0568v32 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c0568v32);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0643y3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f1576a == null) {
                    this.f1576a = new C0568v3();
                }
                codedInputByteBufferNano.readMessage(this.f1576a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C0568v3[] c0568v3Arr = this.b;
                int length = c0568v3Arr == null ? 0 : c0568v3Arr.length;
                int i = repeatedFieldArrayLength + length;
                C0568v3[] c0568v3Arr2 = new C0568v3[i];
                if (length != 0) {
                    System.arraycopy(c0568v3Arr, 0, c0568v3Arr2, 0, length);
                }
                while (length < i - 1) {
                    C0568v3 c0568v3 = new C0568v3();
                    c0568v3Arr2[length] = c0568v3;
                    codedInputByteBufferNano.readMessage(c0568v3);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0568v3 c0568v32 = new C0568v3();
                c0568v3Arr2[length] = c0568v32;
                codedInputByteBufferNano.readMessage(c0568v32);
                this.b = c0568v3Arr2;
            }
        }
        return this;
    }

    public static C0643y3 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0643y3().mergeFrom(codedInputByteBufferNano);
    }

    public static C0643y3 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0643y3) MessageNano.mergeFrom(new C0643y3(), bArr);
    }
}
