package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.s8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0822s8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0822s8[] f8299c;

    /* renamed from: a, reason: collision with root package name */
    public C0564i8 f8300a;

    /* renamed from: b, reason: collision with root package name */
    public C0564i8[] f8301b;

    public C0822s8() {
        a();
    }

    public static C0822s8[] b() {
        if (f8299c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8299c == null) {
                        f8299c = new C0822s8[0];
                    }
                } finally {
                }
            }
        }
        return f8299c;
    }

    public final C0822s8 a() {
        this.f8300a = null;
        this.f8301b = C0564i8.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0564i8 c0564i8 = this.f8300a;
        if (c0564i8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0564i8);
        }
        C0564i8[] c0564i8Arr = this.f8301b;
        if (c0564i8Arr != null && c0564i8Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C0564i8[] c0564i8Arr2 = this.f8301b;
                if (i3 >= c0564i8Arr2.length) {
                    break;
                }
                C0564i8 c0564i82 = c0564i8Arr2[i3];
                if (c0564i82 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c0564i82) + computeSerializedSize;
                }
                i3++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0564i8 c0564i8 = this.f8300a;
        if (c0564i8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0564i8);
        }
        C0564i8[] c0564i8Arr = this.f8301b;
        if (c0564i8Arr != null && c0564i8Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C0564i8[] c0564i8Arr2 = this.f8301b;
                if (i3 >= c0564i8Arr2.length) {
                    break;
                }
                C0564i8 c0564i82 = c0564i8Arr2[i3];
                if (c0564i82 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c0564i82);
                }
                i3++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0822s8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f8300a == null) {
                    this.f8300a = new C0564i8();
                }
                codedInputByteBufferNano.readMessage(this.f8300a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C0564i8[] c0564i8Arr = this.f8301b;
                int length = c0564i8Arr == null ? 0 : c0564i8Arr.length;
                int i3 = repeatedFieldArrayLength + length;
                C0564i8[] c0564i8Arr2 = new C0564i8[i3];
                if (length != 0) {
                    System.arraycopy(c0564i8Arr, 0, c0564i8Arr2, 0, length);
                }
                while (length < i3 - 1) {
                    C0564i8 c0564i8 = new C0564i8();
                    c0564i8Arr2[length] = c0564i8;
                    codedInputByteBufferNano.readMessage(c0564i8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0564i8 c0564i82 = new C0564i8();
                c0564i8Arr2[length] = c0564i82;
                codedInputByteBufferNano.readMessage(c0564i82);
                this.f8301b = c0564i8Arr2;
            }
        }
        return this;
    }

    public static C0822s8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0822s8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0822s8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0822s8) MessageNano.mergeFrom(new C0822s8(), bArr);
    }
}
