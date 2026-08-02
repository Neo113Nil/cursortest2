package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.n9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0694n9 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static final int f7931d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f7932e = 1;
    public static final int f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final int f7933g = 3;

    /* renamed from: h, reason: collision with root package name */
    public static final int f7934h = 4;

    /* renamed from: i, reason: collision with root package name */
    public static final int f7935i = 5;

    /* renamed from: j, reason: collision with root package name */
    public static final int f7936j = 6;

    /* renamed from: k, reason: collision with root package name */
    public static final int f7937k = 7;

    /* renamed from: l, reason: collision with root package name */
    public static final int f7938l = 8;

    /* renamed from: m, reason: collision with root package name */
    public static final int f7939m = 9;

    /* renamed from: n, reason: collision with root package name */
    public static final int f7940n = 10;
    public static final int o = 11;

    /* renamed from: p, reason: collision with root package name */
    public static final int f7941p = 12;

    /* renamed from: q, reason: collision with root package name */
    public static volatile C0694n9[] f7942q;

    /* renamed from: a, reason: collision with root package name */
    public long f7943a;

    /* renamed from: b, reason: collision with root package name */
    public C0668m9 f7944b;

    /* renamed from: c, reason: collision with root package name */
    public C0642l9[] f7945c;

    public C0694n9() {
        a();
    }

    public static C0694n9[] b() {
        if (f7942q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7942q == null) {
                        f7942q = new C0694n9[0];
                    }
                } finally {
                }
            }
        }
        return f7942q;
    }

    public final C0694n9 a() {
        this.f7943a = 0L;
        this.f7944b = null;
        this.f7945c = C0642l9.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeUInt64Size = CodedOutputByteBufferNano.computeUInt64Size(1, this.f7943a) + super.computeSerializedSize();
        C0668m9 c0668m9 = this.f7944b;
        if (c0668m9 != null) {
            computeUInt64Size += CodedOutputByteBufferNano.computeMessageSize(2, c0668m9);
        }
        C0642l9[] c0642l9Arr = this.f7945c;
        if (c0642l9Arr != null && c0642l9Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C0642l9[] c0642l9Arr2 = this.f7945c;
                if (i3 >= c0642l9Arr2.length) {
                    break;
                }
                C0642l9 c0642l9 = c0642l9Arr2[i3];
                if (c0642l9 != null) {
                    computeUInt64Size = CodedOutputByteBufferNano.computeMessageSize(3, c0642l9) + computeUInt64Size;
                }
                i3++;
            }
        }
        return computeUInt64Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeUInt64(1, this.f7943a);
        C0668m9 c0668m9 = this.f7944b;
        if (c0668m9 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0668m9);
        }
        C0642l9[] c0642l9Arr = this.f7945c;
        if (c0642l9Arr != null && c0642l9Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C0642l9[] c0642l9Arr2 = this.f7945c;
                if (i3 >= c0642l9Arr2.length) {
                    break;
                }
                C0642l9 c0642l9 = c0642l9Arr2[i3];
                if (c0642l9 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c0642l9);
                }
                i3++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0694n9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f7943a = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 18) {
                if (this.f7944b == null) {
                    this.f7944b = new C0668m9();
                }
                codedInputByteBufferNano.readMessage(this.f7944b);
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C0642l9[] c0642l9Arr = this.f7945c;
                int length = c0642l9Arr == null ? 0 : c0642l9Arr.length;
                int i3 = repeatedFieldArrayLength + length;
                C0642l9[] c0642l9Arr2 = new C0642l9[i3];
                if (length != 0) {
                    System.arraycopy(c0642l9Arr, 0, c0642l9Arr2, 0, length);
                }
                while (length < i3 - 1) {
                    C0642l9 c0642l9 = new C0642l9();
                    c0642l9Arr2[length] = c0642l9;
                    codedInputByteBufferNano.readMessage(c0642l9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0642l9 c0642l92 = new C0642l9();
                c0642l9Arr2[length] = c0642l92;
                codedInputByteBufferNano.readMessage(c0642l92);
                this.f7945c = c0642l9Arr2;
            }
        }
        return this;
    }

    public static C0694n9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0694n9().mergeFrom(codedInputByteBufferNano);
    }

    public static C0694n9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0694n9) MessageNano.mergeFrom(new C0694n9(), bArr);
    }
}
