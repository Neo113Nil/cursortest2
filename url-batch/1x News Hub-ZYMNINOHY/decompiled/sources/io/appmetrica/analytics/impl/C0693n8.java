package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.n8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0693n8 extends MessageNano {
    public static volatile C0693n8[] f;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f7926a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f7927b;

    /* renamed from: c, reason: collision with root package name */
    public C0796r8 f7928c;

    /* renamed from: d, reason: collision with root package name */
    public C0719o8[] f7929d;

    /* renamed from: e, reason: collision with root package name */
    public int f7930e;

    public C0693n8() {
        a();
    }

    public static C0693n8[] b() {
        if (f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f == null) {
                        f = new C0693n8[0];
                    }
                } finally {
                }
            }
        }
        return f;
    }

    public final C0693n8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f7926a = bArr;
        this.f7927b = bArr;
        this.f7928c = null;
        this.f7929d = C0719o8.b();
        this.f7930e = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f7926a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f7926a);
        }
        if (!Arrays.equals(this.f7927b, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f7927b);
        }
        C0796r8 c0796r8 = this.f7928c;
        if (c0796r8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c0796r8);
        }
        C0719o8[] c0719o8Arr = this.f7929d;
        if (c0719o8Arr != null && c0719o8Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C0719o8[] c0719o8Arr2 = this.f7929d;
                if (i3 >= c0719o8Arr2.length) {
                    break;
                }
                C0719o8 c0719o8 = c0719o8Arr2[i3];
                if (c0719o8 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(4, c0719o8) + computeSerializedSize;
                }
                i3++;
            }
        }
        int i4 = this.f7930e;
        return i4 != 0 ? CodedOutputByteBufferNano.computeUInt32Size(5, i4) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f7926a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f7926a);
        }
        if (!Arrays.equals(this.f7927b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f7927b);
        }
        C0796r8 c0796r8 = this.f7928c;
        if (c0796r8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c0796r8);
        }
        C0719o8[] c0719o8Arr = this.f7929d;
        if (c0719o8Arr != null && c0719o8Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C0719o8[] c0719o8Arr2 = this.f7929d;
                if (i3 >= c0719o8Arr2.length) {
                    break;
                }
                C0719o8 c0719o8 = c0719o8Arr2[i3];
                if (c0719o8 != null) {
                    codedOutputByteBufferNano.writeMessage(4, c0719o8);
                }
                i3++;
            }
        }
        int i4 = this.f7930e;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0693n8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0693n8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0693n8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f7926a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                this.f7927b = codedInputByteBufferNano.readBytes();
            } else if (readTag == 26) {
                if (this.f7928c == null) {
                    this.f7928c = new C0796r8();
                }
                codedInputByteBufferNano.readMessage(this.f7928c);
            } else if (readTag == 34) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                C0719o8[] c0719o8Arr = this.f7929d;
                int length = c0719o8Arr == null ? 0 : c0719o8Arr.length;
                int i3 = repeatedFieldArrayLength + length;
                C0719o8[] c0719o8Arr2 = new C0719o8[i3];
                if (length != 0) {
                    System.arraycopy(c0719o8Arr, 0, c0719o8Arr2, 0, length);
                }
                while (length < i3 - 1) {
                    C0719o8 c0719o8 = new C0719o8();
                    c0719o8Arr2[length] = c0719o8;
                    codedInputByteBufferNano.readMessage(c0719o8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0719o8 c0719o82 = new C0719o8();
                c0719o8Arr2[length] = c0719o82;
                codedInputByteBufferNano.readMessage(c0719o82);
                this.f7929d = c0719o8Arr2;
            } else if (readTag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f7930e = codedInputByteBufferNano.readUInt32();
            }
        }
        return this;
    }

    public static C0693n8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0693n8) MessageNano.mergeFrom(new C0693n8(), bArr);
    }
}
