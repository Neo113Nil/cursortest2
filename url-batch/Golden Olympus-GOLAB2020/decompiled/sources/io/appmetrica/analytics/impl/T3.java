package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes3.dex */
public final class T3 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f38287c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f38288d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f38289e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f38290f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static volatile T3[] f38291g;

    /* renamed from: a, reason: collision with root package name */
    public Q3 f38292a;

    /* renamed from: b, reason: collision with root package name */
    public Q3[] f38293b;

    public T3() {
        a();
    }

    public static T3[] b() {
        if (f38291g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f38291g == null) {
                        f38291g = new T3[0];
                    }
                } finally {
                }
            }
        }
        return f38291g;
    }

    public final T3 a() {
        this.f38292a = null;
        this.f38293b = Q3.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Q3 q32 = this.f38292a;
        if (q32 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, q32);
        }
        Q3[] q3Arr = this.f38293b;
        if (q3Arr != null && q3Arr.length > 0) {
            int i4 = 0;
            while (true) {
                Q3[] q3Arr2 = this.f38293b;
                if (i4 >= q3Arr2.length) {
                    break;
                }
                Q3 q33 = q3Arr2[i4];
                if (q33 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, q33) + computeSerializedSize;
                }
                i4++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        Q3 q32 = this.f38292a;
        if (q32 != null) {
            codedOutputByteBufferNano.writeMessage(1, q32);
        }
        Q3[] q3Arr = this.f38293b;
        if (q3Arr != null && q3Arr.length > 0) {
            int i4 = 0;
            while (true) {
                Q3[] q3Arr2 = this.f38293b;
                if (i4 >= q3Arr2.length) {
                    break;
                }
                Q3 q33 = q3Arr2[i4];
                if (q33 != null) {
                    codedOutputByteBufferNano.writeMessage(2, q33);
                }
                i4++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final T3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f38292a == null) {
                    this.f38292a = new Q3();
                }
                codedInputByteBufferNano.readMessage(this.f38292a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                Q3[] q3Arr = this.f38293b;
                int length = q3Arr == null ? 0 : q3Arr.length;
                int i4 = repeatedFieldArrayLength + length;
                Q3[] q3Arr2 = new Q3[i4];
                if (length != 0) {
                    System.arraycopy(q3Arr, 0, q3Arr2, 0, length);
                }
                while (length < i4 - 1) {
                    Q3 q32 = new Q3();
                    q3Arr2[length] = q32;
                    codedInputByteBufferNano.readMessage(q32);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                Q3 q33 = new Q3();
                q3Arr2[length] = q33;
                codedInputByteBufferNano.readMessage(q33);
                this.f38293b = q3Arr2;
            }
        }
        return this;
    }

    public static T3 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new T3().mergeFrom(codedInputByteBufferNano);
    }

    public static T3 a(byte[] bArr) {
        return (T3) MessageNano.mergeFrom(new T3(), bArr);
    }
}
