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
public final class C0815n8 extends MessageNano {

    /* renamed from: h, reason: collision with root package name */
    public static volatile C0815n8[] f12407h;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f12408a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f12409b;

    /* renamed from: c, reason: collision with root package name */
    public C0608f8 f12410c;

    /* renamed from: d, reason: collision with root package name */
    public C0763l8 f12411d;

    /* renamed from: e, reason: collision with root package name */
    public C0789m8 f12412e;

    /* renamed from: f, reason: collision with root package name */
    public C0789m8 f12413f;

    /* renamed from: g, reason: collision with root package name */
    public C0841o8[] f12414g;

    public C0815n8() {
        a();
    }

    public static C0815n8[] b() {
        if (f12407h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f12407h == null) {
                        f12407h = new C0815n8[0];
                    }
                } finally {
                }
            }
        }
        return f12407h;
    }

    public final C0815n8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f12408a = bArr;
        this.f12409b = bArr;
        this.f12410c = null;
        this.f12411d = null;
        this.f12412e = null;
        this.f12413f = null;
        this.f12414g = C0841o8.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f12408a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f12408a);
        }
        if (!Arrays.equals(this.f12409b, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f12409b);
        }
        C0608f8 c0608f8 = this.f12410c;
        if (c0608f8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c0608f8);
        }
        C0763l8 c0763l8 = this.f12411d;
        if (c0763l8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c0763l8);
        }
        C0789m8 c0789m8 = this.f12412e;
        if (c0789m8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c0789m8);
        }
        C0789m8 c0789m82 = this.f12413f;
        if (c0789m82 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(6, c0789m82);
        }
        C0841o8[] c0841o8Arr = this.f12414g;
        if (c0841o8Arr != null && c0841o8Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C0841o8[] c0841o8Arr2 = this.f12414g;
                if (i4 >= c0841o8Arr2.length) {
                    break;
                }
                C0841o8 c0841o8 = c0841o8Arr2[i4];
                if (c0841o8 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(7, c0841o8) + computeSerializedSize;
                }
                i4++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f12408a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f12408a);
        }
        if (!Arrays.equals(this.f12409b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f12409b);
        }
        C0608f8 c0608f8 = this.f12410c;
        if (c0608f8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c0608f8);
        }
        C0763l8 c0763l8 = this.f12411d;
        if (c0763l8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0763l8);
        }
        C0789m8 c0789m8 = this.f12412e;
        if (c0789m8 != null) {
            codedOutputByteBufferNano.writeMessage(5, c0789m8);
        }
        C0789m8 c0789m82 = this.f12413f;
        if (c0789m82 != null) {
            codedOutputByteBufferNano.writeMessage(6, c0789m82);
        }
        C0841o8[] c0841o8Arr = this.f12414g;
        if (c0841o8Arr != null && c0841o8Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C0841o8[] c0841o8Arr2 = this.f12414g;
                if (i4 >= c0841o8Arr2.length) {
                    break;
                }
                C0841o8 c0841o8 = c0841o8Arr2[i4];
                if (c0841o8 != null) {
                    codedOutputByteBufferNano.writeMessage(7, c0841o8);
                }
                i4++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0815n8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0815n8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0815n8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f12408a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                this.f12409b = codedInputByteBufferNano.readBytes();
            } else if (readTag == 26) {
                if (this.f12410c == null) {
                    this.f12410c = new C0608f8();
                }
                codedInputByteBufferNano.readMessage(this.f12410c);
            } else if (readTag == 34) {
                if (this.f12411d == null) {
                    this.f12411d = new C0763l8();
                }
                codedInputByteBufferNano.readMessage(this.f12411d);
            } else if (readTag == 42) {
                if (this.f12412e == null) {
                    this.f12412e = new C0789m8();
                }
                codedInputByteBufferNano.readMessage(this.f12412e);
            } else if (readTag == 50) {
                if (this.f12413f == null) {
                    this.f12413f = new C0789m8();
                }
                codedInputByteBufferNano.readMessage(this.f12413f);
            } else if (readTag != 58) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                C0841o8[] c0841o8Arr = this.f12414g;
                int length = c0841o8Arr == null ? 0 : c0841o8Arr.length;
                int i4 = repeatedFieldArrayLength + length;
                C0841o8[] c0841o8Arr2 = new C0841o8[i4];
                if (length != 0) {
                    System.arraycopy(c0841o8Arr, 0, c0841o8Arr2, 0, length);
                }
                while (length < i4 - 1) {
                    C0841o8 c0841o8 = new C0841o8();
                    c0841o8Arr2[length] = c0841o8;
                    codedInputByteBufferNano.readMessage(c0841o8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0841o8 c0841o82 = new C0841o8();
                c0841o8Arr2[length] = c0841o82;
                codedInputByteBufferNano.readMessage(c0841o82);
                this.f12414g = c0841o8Arr2;
            }
        }
        return this;
    }

    public static C0815n8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0815n8) MessageNano.mergeFrom(new C0815n8(), bArr);
    }
}
