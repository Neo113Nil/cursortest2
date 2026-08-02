package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.g2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0506g2 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C0506g2[] f7348d;

    /* renamed from: a, reason: collision with root package name */
    public C0480f2[] f7349a;

    /* renamed from: b, reason: collision with root package name */
    public C0454e2 f7350b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f7351c;

    public C0506g2() {
        a();
    }

    public static C0506g2[] b() {
        if (f7348d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7348d == null) {
                        f7348d = new C0506g2[0];
                    }
                } finally {
                }
            }
        }
        return f7348d;
    }

    public final C0506g2 a() {
        this.f7349a = C0480f2.b();
        this.f7350b = null;
        this.f7351c = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0480f2[] c0480f2Arr = this.f7349a;
        int i3 = 0;
        if (c0480f2Arr != null && c0480f2Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C0480f2[] c0480f2Arr2 = this.f7349a;
                if (i4 >= c0480f2Arr2.length) {
                    break;
                }
                C0480f2 c0480f2 = c0480f2Arr2[i4];
                if (c0480f2 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c0480f2) + computeSerializedSize;
                }
                i4++;
            }
        }
        C0454e2 c0454e2 = this.f7350b;
        if (c0454e2 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c0454e2);
        }
        String[] strArr = this.f7351c;
        if (strArr == null || strArr.length <= 0) {
            return computeSerializedSize;
        }
        int i5 = 0;
        int i6 = 0;
        while (true) {
            String[] strArr2 = this.f7351c;
            if (i3 >= strArr2.length) {
                return computeSerializedSize + i5 + i6;
            }
            String str = strArr2[i3];
            if (str != null) {
                i6++;
                i5 = CodedOutputByteBufferNano.computeStringSizeNoTag(str) + i5;
            }
            i3++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0480f2[] c0480f2Arr = this.f7349a;
        int i3 = 0;
        if (c0480f2Arr != null && c0480f2Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C0480f2[] c0480f2Arr2 = this.f7349a;
                if (i4 >= c0480f2Arr2.length) {
                    break;
                }
                C0480f2 c0480f2 = c0480f2Arr2[i4];
                if (c0480f2 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c0480f2);
                }
                i4++;
            }
        }
        C0454e2 c0454e2 = this.f7350b;
        if (c0454e2 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0454e2);
        }
        String[] strArr = this.f7351c;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.f7351c;
                if (i3 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i3];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(3, str);
                }
                i3++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0506g2 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C0480f2[] c0480f2Arr = this.f7349a;
                int length = c0480f2Arr == null ? 0 : c0480f2Arr.length;
                int i3 = repeatedFieldArrayLength + length;
                C0480f2[] c0480f2Arr2 = new C0480f2[i3];
                if (length != 0) {
                    System.arraycopy(c0480f2Arr, 0, c0480f2Arr2, 0, length);
                }
                while (length < i3 - 1) {
                    C0480f2 c0480f2 = new C0480f2();
                    c0480f2Arr2[length] = c0480f2;
                    codedInputByteBufferNano.readMessage(c0480f2);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0480f2 c0480f22 = new C0480f2();
                c0480f2Arr2[length] = c0480f22;
                codedInputByteBufferNano.readMessage(c0480f22);
                this.f7349a = c0480f2Arr2;
            } else if (readTag == 18) {
                if (this.f7350b == null) {
                    this.f7350b = new C0454e2();
                }
                codedInputByteBufferNano.readMessage(this.f7350b);
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                String[] strArr = this.f7351c;
                int length2 = strArr == null ? 0 : strArr.length;
                int i4 = repeatedFieldArrayLength2 + length2;
                String[] strArr2 = new String[i4];
                if (length2 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length2);
                }
                while (length2 < i4 - 1) {
                    strArr2[length2] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                strArr2[length2] = codedInputByteBufferNano.readString();
                this.f7351c = strArr2;
            }
        }
        return this;
    }

    public static C0506g2 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0506g2().mergeFrom(codedInputByteBufferNano);
    }

    public static C0506g2 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0506g2) MessageNano.mergeFrom(new C0506g2(), bArr);
    }
}
