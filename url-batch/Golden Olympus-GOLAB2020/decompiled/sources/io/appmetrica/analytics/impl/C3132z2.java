package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.z2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3132z2 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f40295c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f40296d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f40297e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static volatile C3132z2[] f40298f;

    /* renamed from: a, reason: collision with root package name */
    public C3106y2[] f40299a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f40300b;

    public C3132z2() {
        a();
    }

    public static C3132z2[] b() {
        if (f40298f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f40298f == null) {
                        f40298f = new C3132z2[0];
                    }
                } finally {
                }
            }
        }
        return f40298f;
    }

    public final C3132z2 a() {
        this.f40299a = C3106y2.b();
        this.f40300b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C3106y2[] c3106y2Arr = this.f40299a;
        if (c3106y2Arr != null && c3106y2Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C3106y2[] c3106y2Arr2 = this.f40299a;
                if (i4 >= c3106y2Arr2.length) {
                    break;
                }
                C3106y2 c3106y2 = c3106y2Arr2[i4];
                if (c3106y2 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c3106y2) + computeSerializedSize;
                }
                i4++;
            }
        }
        return CodedOutputByteBufferNano.computeBoolSize(2, this.f40300b) + computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C3106y2[] c3106y2Arr = this.f40299a;
        if (c3106y2Arr != null && c3106y2Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C3106y2[] c3106y2Arr2 = this.f40299a;
                if (i4 >= c3106y2Arr2.length) {
                    break;
                }
                C3106y2 c3106y2 = c3106y2Arr2[i4];
                if (c3106y2 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c3106y2);
                }
                i4++;
            }
        }
        codedOutputByteBufferNano.writeBool(2, this.f40300b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3132z2 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C3106y2[] c3106y2Arr = this.f40299a;
                int length = c3106y2Arr == null ? 0 : c3106y2Arr.length;
                int i4 = repeatedFieldArrayLength + length;
                C3106y2[] c3106y2Arr2 = new C3106y2[i4];
                if (length != 0) {
                    System.arraycopy(c3106y2Arr, 0, c3106y2Arr2, 0, length);
                }
                while (length < i4 - 1) {
                    C3106y2 c3106y2 = new C3106y2();
                    c3106y2Arr2[length] = c3106y2;
                    codedInputByteBufferNano.readMessage(c3106y2);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C3106y2 c3106y22 = new C3106y2();
                c3106y2Arr2[length] = c3106y22;
                codedInputByteBufferNano.readMessage(c3106y22);
                this.f40299a = c3106y2Arr2;
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f40300b = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static C3132z2 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C3132z2().mergeFrom(codedInputByteBufferNano);
    }

    public static C3132z2 a(byte[] bArr) {
        return (C3132z2) MessageNano.mergeFrom(new C3132z2(), bArr);
    }
}
