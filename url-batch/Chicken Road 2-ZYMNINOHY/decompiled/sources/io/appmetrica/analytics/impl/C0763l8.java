package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.l8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0763l8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0763l8[] f12282c;

    /* renamed from: a, reason: collision with root package name */
    public C0737k8[] f12283a;

    /* renamed from: b, reason: collision with root package name */
    public int f12284b;

    public C0763l8() {
        a();
    }

    public static C0763l8[] b() {
        if (f12282c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f12282c == null) {
                        f12282c = new C0763l8[0];
                    }
                } finally {
                }
            }
        }
        return f12282c;
    }

    public final C0763l8 a() {
        this.f12283a = C0737k8.b();
        this.f12284b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0737k8[] c0737k8Arr = this.f12283a;
        if (c0737k8Arr != null && c0737k8Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C0737k8[] c0737k8Arr2 = this.f12283a;
                if (i4 >= c0737k8Arr2.length) {
                    break;
                }
                C0737k8 c0737k8 = c0737k8Arr2[i4];
                if (c0737k8 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c0737k8) + computeSerializedSize;
                }
                i4++;
            }
        }
        int i5 = this.f12284b;
        return i5 != 0 ? CodedOutputByteBufferNano.computeUInt32Size(2, i5) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0737k8[] c0737k8Arr = this.f12283a;
        if (c0737k8Arr != null && c0737k8Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C0737k8[] c0737k8Arr2 = this.f12283a;
                if (i4 >= c0737k8Arr2.length) {
                    break;
                }
                C0737k8 c0737k8 = c0737k8Arr2[i4];
                if (c0737k8 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c0737k8);
                }
                i4++;
            }
        }
        int i5 = this.f12284b;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeUInt32(2, i5);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0763l8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C0737k8[] c0737k8Arr = this.f12283a;
                int length = c0737k8Arr == null ? 0 : c0737k8Arr.length;
                int i4 = repeatedFieldArrayLength + length;
                C0737k8[] c0737k8Arr2 = new C0737k8[i4];
                if (length != 0) {
                    System.arraycopy(c0737k8Arr, 0, c0737k8Arr2, 0, length);
                }
                while (length < i4 - 1) {
                    C0737k8 c0737k8 = new C0737k8();
                    c0737k8Arr2[length] = c0737k8;
                    codedInputByteBufferNano.readMessage(c0737k8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0737k8 c0737k82 = new C0737k8();
                c0737k8Arr2[length] = c0737k82;
                codedInputByteBufferNano.readMessage(c0737k82);
                this.f12283a = c0737k8Arr2;
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f12284b = codedInputByteBufferNano.readUInt32();
            }
        }
        return this;
    }

    public static C0763l8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0763l8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0763l8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0763l8) MessageNano.mergeFrom(new C0763l8(), bArr);
    }
}
