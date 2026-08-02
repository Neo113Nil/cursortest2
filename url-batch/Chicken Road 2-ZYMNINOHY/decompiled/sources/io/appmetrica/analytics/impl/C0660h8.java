package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.h8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0660h8 extends MessageNano {

    /* renamed from: f, reason: collision with root package name */
    public static volatile C0660h8[] f11980f;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f11981a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f11982b;

    /* renamed from: c, reason: collision with root package name */
    public C0763l8 f11983c;

    /* renamed from: d, reason: collision with root package name */
    public C0686i8[] f11984d;

    /* renamed from: e, reason: collision with root package name */
    public int f11985e;

    public C0660h8() {
        a();
    }

    public static C0660h8[] b() {
        if (f11980f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f11980f == null) {
                        f11980f = new C0660h8[0];
                    }
                } finally {
                }
            }
        }
        return f11980f;
    }

    public final C0660h8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f11981a = bArr;
        this.f11982b = bArr;
        this.f11983c = null;
        this.f11984d = C0686i8.b();
        this.f11985e = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f11981a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f11981a);
        }
        if (!Arrays.equals(this.f11982b, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f11982b);
        }
        C0763l8 c0763l8 = this.f11983c;
        if (c0763l8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c0763l8);
        }
        C0686i8[] c0686i8Arr = this.f11984d;
        if (c0686i8Arr != null && c0686i8Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C0686i8[] c0686i8Arr2 = this.f11984d;
                if (i4 >= c0686i8Arr2.length) {
                    break;
                }
                C0686i8 c0686i8 = c0686i8Arr2[i4];
                if (c0686i8 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(4, c0686i8) + computeSerializedSize;
                }
                i4++;
            }
        }
        int i5 = this.f11985e;
        return i5 != 0 ? CodedOutputByteBufferNano.computeUInt32Size(5, i5) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f11981a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f11981a);
        }
        if (!Arrays.equals(this.f11982b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f11982b);
        }
        C0763l8 c0763l8 = this.f11983c;
        if (c0763l8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c0763l8);
        }
        C0686i8[] c0686i8Arr = this.f11984d;
        if (c0686i8Arr != null && c0686i8Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C0686i8[] c0686i8Arr2 = this.f11984d;
                if (i4 >= c0686i8Arr2.length) {
                    break;
                }
                C0686i8 c0686i8 = c0686i8Arr2[i4];
                if (c0686i8 != null) {
                    codedOutputByteBufferNano.writeMessage(4, c0686i8);
                }
                i4++;
            }
        }
        int i5 = this.f11985e;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i5);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0660h8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0660h8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0660h8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f11981a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                this.f11982b = codedInputByteBufferNano.readBytes();
            } else if (readTag == 26) {
                if (this.f11983c == null) {
                    this.f11983c = new C0763l8();
                }
                codedInputByteBufferNano.readMessage(this.f11983c);
            } else if (readTag == 34) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                C0686i8[] c0686i8Arr = this.f11984d;
                int length = c0686i8Arr == null ? 0 : c0686i8Arr.length;
                int i4 = repeatedFieldArrayLength + length;
                C0686i8[] c0686i8Arr2 = new C0686i8[i4];
                if (length != 0) {
                    System.arraycopy(c0686i8Arr, 0, c0686i8Arr2, 0, length);
                }
                while (length < i4 - 1) {
                    C0686i8 c0686i8 = new C0686i8();
                    c0686i8Arr2[length] = c0686i8;
                    codedInputByteBufferNano.readMessage(c0686i8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0686i8 c0686i82 = new C0686i8();
                c0686i8Arr2[length] = c0686i82;
                codedInputByteBufferNano.readMessage(c0686i82);
                this.f11984d = c0686i8Arr2;
            } else if (readTag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f11985e = codedInputByteBufferNano.readUInt32();
            }
        }
        return this;
    }

    public static C0660h8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0660h8) MessageNano.mergeFrom(new C0660h8(), bArr);
    }
}
