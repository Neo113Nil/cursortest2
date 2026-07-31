package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.fo, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2635fo extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C2635fo[] f39011b;

    /* renamed from: a, reason: collision with root package name */
    public C2555co[] f39012a;

    public C2635fo() {
        a();
    }

    public static C2635fo[] b() {
        if (f39011b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f39011b == null) {
                        f39011b = new C2635fo[0];
                    }
                } finally {
                }
            }
        }
        return f39011b;
    }

    public final C2635fo a() {
        this.f39012a = C2555co.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C2555co[] c2555coArr = this.f39012a;
        if (c2555coArr != null && c2555coArr.length > 0) {
            int i4 = 0;
            while (true) {
                C2555co[] c2555coArr2 = this.f39012a;
                if (i4 >= c2555coArr2.length) {
                    break;
                }
                C2555co c2555co = c2555coArr2[i4];
                if (c2555co != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c2555co) + computeSerializedSize;
                }
                i4++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C2555co[] c2555coArr = this.f39012a;
        if (c2555coArr != null && c2555coArr.length > 0) {
            int i4 = 0;
            while (true) {
                C2555co[] c2555coArr2 = this.f39012a;
                if (i4 >= c2555coArr2.length) {
                    break;
                }
                C2555co c2555co = c2555coArr2[i4];
                if (c2555co != null) {
                    codedOutputByteBufferNano.writeMessage(1, c2555co);
                }
                i4++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2635fo mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
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
                C2555co[] c2555coArr = this.f39012a;
                int length = c2555coArr == null ? 0 : c2555coArr.length;
                int i4 = repeatedFieldArrayLength + length;
                C2555co[] c2555coArr2 = new C2555co[i4];
                if (length != 0) {
                    System.arraycopy(c2555coArr, 0, c2555coArr2, 0, length);
                }
                while (length < i4 - 1) {
                    C2555co c2555co = new C2555co();
                    c2555coArr2[length] = c2555co;
                    codedInputByteBufferNano.readMessage(c2555co);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C2555co c2555co2 = new C2555co();
                c2555coArr2[length] = c2555co2;
                codedInputByteBufferNano.readMessage(c2555co2);
                this.f39012a = c2555coArr2;
            }
        }
        return this;
    }

    public static C2635fo b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2635fo().mergeFrom(codedInputByteBufferNano);
    }

    public static C2635fo a(byte[] bArr) {
        return (C2635fo) MessageNano.mergeFrom(new C2635fo(), bArr);
    }
}
