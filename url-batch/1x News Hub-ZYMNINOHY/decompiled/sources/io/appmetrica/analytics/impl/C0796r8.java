package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.r8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0796r8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0796r8[] f8211c;

    /* renamed from: a, reason: collision with root package name */
    public C0771q8[] f8212a;

    /* renamed from: b, reason: collision with root package name */
    public int f8213b;

    public C0796r8() {
        a();
    }

    public static C0796r8[] b() {
        if (f8211c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8211c == null) {
                        f8211c = new C0796r8[0];
                    }
                } finally {
                }
            }
        }
        return f8211c;
    }

    public final C0796r8 a() {
        this.f8212a = C0771q8.b();
        this.f8213b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0771q8[] c0771q8Arr = this.f8212a;
        if (c0771q8Arr != null && c0771q8Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C0771q8[] c0771q8Arr2 = this.f8212a;
                if (i3 >= c0771q8Arr2.length) {
                    break;
                }
                C0771q8 c0771q8 = c0771q8Arr2[i3];
                if (c0771q8 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c0771q8) + computeSerializedSize;
                }
                i3++;
            }
        }
        int i4 = this.f8213b;
        return i4 != 0 ? CodedOutputByteBufferNano.computeUInt32Size(2, i4) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0771q8[] c0771q8Arr = this.f8212a;
        if (c0771q8Arr != null && c0771q8Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C0771q8[] c0771q8Arr2 = this.f8212a;
                if (i3 >= c0771q8Arr2.length) {
                    break;
                }
                C0771q8 c0771q8 = c0771q8Arr2[i3];
                if (c0771q8 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c0771q8);
                }
                i3++;
            }
        }
        int i4 = this.f8213b;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeUInt32(2, i4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0796r8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C0771q8[] c0771q8Arr = this.f8212a;
                int length = c0771q8Arr == null ? 0 : c0771q8Arr.length;
                int i3 = repeatedFieldArrayLength + length;
                C0771q8[] c0771q8Arr2 = new C0771q8[i3];
                if (length != 0) {
                    System.arraycopy(c0771q8Arr, 0, c0771q8Arr2, 0, length);
                }
                while (length < i3 - 1) {
                    C0771q8 c0771q8 = new C0771q8();
                    c0771q8Arr2[length] = c0771q8;
                    codedInputByteBufferNano.readMessage(c0771q8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0771q8 c0771q82 = new C0771q8();
                c0771q8Arr2[length] = c0771q82;
                codedInputByteBufferNano.readMessage(c0771q82);
                this.f8212a = c0771q8Arr2;
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f8213b = codedInputByteBufferNano.readUInt32();
            }
        }
        return this;
    }

    public static C0796r8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0796r8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0796r8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0796r8) MessageNano.mergeFrom(new C0796r8(), bArr);
    }
}
