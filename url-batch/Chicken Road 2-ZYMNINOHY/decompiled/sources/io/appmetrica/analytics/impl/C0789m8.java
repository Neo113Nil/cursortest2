package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.m8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0789m8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0789m8[] f12345c;

    /* renamed from: a, reason: collision with root package name */
    public C0531c8 f12346a;

    /* renamed from: b, reason: collision with root package name */
    public C0531c8[] f12347b;

    public C0789m8() {
        a();
    }

    public static C0789m8[] b() {
        if (f12345c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f12345c == null) {
                        f12345c = new C0789m8[0];
                    }
                } finally {
                }
            }
        }
        return f12345c;
    }

    public final C0789m8 a() {
        this.f12346a = null;
        this.f12347b = C0531c8.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0531c8 c0531c8 = this.f12346a;
        if (c0531c8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0531c8);
        }
        C0531c8[] c0531c8Arr = this.f12347b;
        if (c0531c8Arr != null && c0531c8Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C0531c8[] c0531c8Arr2 = this.f12347b;
                if (i4 >= c0531c8Arr2.length) {
                    break;
                }
                C0531c8 c0531c82 = c0531c8Arr2[i4];
                if (c0531c82 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c0531c82) + computeSerializedSize;
                }
                i4++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0531c8 c0531c8 = this.f12346a;
        if (c0531c8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0531c8);
        }
        C0531c8[] c0531c8Arr = this.f12347b;
        if (c0531c8Arr != null && c0531c8Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C0531c8[] c0531c8Arr2 = this.f12347b;
                if (i4 >= c0531c8Arr2.length) {
                    break;
                }
                C0531c8 c0531c82 = c0531c8Arr2[i4];
                if (c0531c82 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c0531c82);
                }
                i4++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0789m8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f12346a == null) {
                    this.f12346a = new C0531c8();
                }
                codedInputByteBufferNano.readMessage(this.f12346a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C0531c8[] c0531c8Arr = this.f12347b;
                int length = c0531c8Arr == null ? 0 : c0531c8Arr.length;
                int i4 = repeatedFieldArrayLength + length;
                C0531c8[] c0531c8Arr2 = new C0531c8[i4];
                if (length != 0) {
                    System.arraycopy(c0531c8Arr, 0, c0531c8Arr2, 0, length);
                }
                while (length < i4 - 1) {
                    C0531c8 c0531c8 = new C0531c8();
                    c0531c8Arr2[length] = c0531c8;
                    codedInputByteBufferNano.readMessage(c0531c8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0531c8 c0531c82 = new C0531c8();
                c0531c8Arr2[length] = c0531c82;
                codedInputByteBufferNano.readMessage(c0531c82);
                this.f12347b = c0531c8Arr2;
            }
        }
        return this;
    }

    public static C0789m8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0789m8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0789m8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0789m8) MessageNano.mergeFrom(new C0789m8(), bArr);
    }
}
