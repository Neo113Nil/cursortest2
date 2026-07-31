package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.m8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0349m8 extends MessageNano {
    public static volatile C0349m8[] c;

    /* renamed from: a, reason: collision with root package name */
    public C0324l8[] f1373a;
    public int b;

    public C0349m8() {
        a();
    }

    public static C0349m8[] b() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (c == null) {
                    c = new C0349m8[0];
                }
            }
        }
        return c;
    }

    public final C0349m8 a() {
        this.f1373a = C0324l8.b();
        this.b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0324l8[] c0324l8Arr = this.f1373a;
        if (c0324l8Arr != null && c0324l8Arr.length > 0) {
            int i = 0;
            while (true) {
                C0324l8[] c0324l8Arr2 = this.f1373a;
                if (i >= c0324l8Arr2.length) {
                    break;
                }
                C0324l8 c0324l8 = c0324l8Arr2[i];
                if (c0324l8 != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0324l8);
                }
                i++;
            }
        }
        int i2 = this.b;
        return i2 != 0 ? CodedOutputByteBufferNano.computeUInt32Size(2, i2) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0324l8[] c0324l8Arr = this.f1373a;
        if (c0324l8Arr != null && c0324l8Arr.length > 0) {
            int i = 0;
            while (true) {
                C0324l8[] c0324l8Arr2 = this.f1373a;
                if (i >= c0324l8Arr2.length) {
                    break;
                }
                C0324l8 c0324l8 = c0324l8Arr2[i];
                if (c0324l8 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c0324l8);
                }
                i++;
            }
        }
        int i2 = this.b;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(2, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0349m8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C0324l8[] c0324l8Arr = this.f1373a;
                int length = c0324l8Arr == null ? 0 : c0324l8Arr.length;
                int i = repeatedFieldArrayLength + length;
                C0324l8[] c0324l8Arr2 = new C0324l8[i];
                if (length != 0) {
                    System.arraycopy(c0324l8Arr, 0, c0324l8Arr2, 0, length);
                }
                while (length < i - 1) {
                    C0324l8 c0324l8 = new C0324l8();
                    c0324l8Arr2[length] = c0324l8;
                    codedInputByteBufferNano.readMessage(c0324l8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0324l8 c0324l82 = new C0324l8();
                c0324l8Arr2[length] = c0324l82;
                codedInputByteBufferNano.readMessage(c0324l82);
                this.f1373a = c0324l8Arr2;
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.b = codedInputByteBufferNano.readUInt32();
            }
        }
        return this;
    }

    public static C0349m8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0349m8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0349m8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0349m8) MessageNano.mergeFrom(new C0349m8(), bArr);
    }
}
