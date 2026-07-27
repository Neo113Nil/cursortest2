package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.i9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0716i9 extends MessageNano {

    /* renamed from: n, reason: collision with root package name */
    public static volatile C0716i9[] f8398n;

    /* renamed from: a, reason: collision with root package name */
    public String f8399a;

    /* renamed from: b, reason: collision with root package name */
    public String f8400b;

    /* renamed from: c, reason: collision with root package name */
    public String f8401c;

    /* renamed from: d, reason: collision with root package name */
    public int f8402d;

    /* renamed from: e, reason: collision with root package name */
    public String f8403e;

    /* renamed from: f, reason: collision with root package name */
    public String f8404f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8405g;

    /* renamed from: h, reason: collision with root package name */
    public int f8406h;

    /* renamed from: i, reason: collision with root package name */
    public String f8407i;

    /* renamed from: j, reason: collision with root package name */
    public String f8408j;

    /* renamed from: k, reason: collision with root package name */
    public int f8409k;

    /* renamed from: l, reason: collision with root package name */
    public C0690h9[] f8410l;

    /* renamed from: m, reason: collision with root package name */
    public String f8411m;

    public C0716i9() {
        a();
    }

    public static C0716i9[] b() {
        if (f8398n == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8398n == null) {
                        f8398n = new C0716i9[0];
                    }
                } finally {
                }
            }
        }
        return f8398n;
    }

    public final C0716i9 a() {
        this.f8399a = "";
        this.f8400b = "";
        this.f8401c = "";
        this.f8402d = 0;
        this.f8403e = "";
        this.f8404f = "";
        this.f8405g = false;
        this.f8406h = 0;
        this.f8407i = "";
        this.f8408j = "";
        this.f8409k = 0;
        this.f8410l = C0690h9.b();
        this.f8411m = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f8399a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f8399a);
        }
        if (!this.f8400b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f8400b);
        }
        if (!this.f8401c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.f8401c);
        }
        int i2 = this.f8402d;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(5, i2);
        }
        if (!this.f8403e.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(10, this.f8403e);
        }
        if (!this.f8404f.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(15, this.f8404f);
        }
        boolean z = this.f8405g;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(17, z);
        }
        int i3 = this.f8406h;
        if (i3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(18, i3);
        }
        if (!this.f8407i.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(19, this.f8407i);
        }
        if (!this.f8408j.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(21, this.f8408j);
        }
        int i6 = this.f8409k;
        if (i6 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(22, i6);
        }
        C0690h9[] c0690h9Arr = this.f8410l;
        if (c0690h9Arr != null && c0690h9Arr.length > 0) {
            int i7 = 0;
            while (true) {
                C0690h9[] c0690h9Arr2 = this.f8410l;
                if (i7 >= c0690h9Arr2.length) {
                    break;
                }
                C0690h9 c0690h9 = c0690h9Arr2[i7];
                if (c0690h9 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(23, c0690h9) + computeSerializedSize;
                }
                i7++;
            }
        }
        return !this.f8411m.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(24, this.f8411m) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f8399a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f8399a);
        }
        if (!this.f8400b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f8400b);
        }
        if (!this.f8401c.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f8401c);
        }
        int i2 = this.f8402d;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i2);
        }
        if (!this.f8403e.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f8403e);
        }
        if (!this.f8404f.equals("")) {
            codedOutputByteBufferNano.writeString(15, this.f8404f);
        }
        boolean z = this.f8405g;
        if (z) {
            codedOutputByteBufferNano.writeBool(17, z);
        }
        int i3 = this.f8406h;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeUInt32(18, i3);
        }
        if (!this.f8407i.equals("")) {
            codedOutputByteBufferNano.writeString(19, this.f8407i);
        }
        if (!this.f8408j.equals("")) {
            codedOutputByteBufferNano.writeString(21, this.f8408j);
        }
        int i6 = this.f8409k;
        if (i6 != 0) {
            codedOutputByteBufferNano.writeUInt32(22, i6);
        }
        C0690h9[] c0690h9Arr = this.f8410l;
        if (c0690h9Arr != null && c0690h9Arr.length > 0) {
            int i7 = 0;
            while (true) {
                C0690h9[] c0690h9Arr2 = this.f8410l;
                if (i7 >= c0690h9Arr2.length) {
                    break;
                }
                C0690h9 c0690h9 = c0690h9Arr2[i7];
                if (c0690h9 != null) {
                    codedOutputByteBufferNano.writeMessage(23, c0690h9);
                }
                i7++;
            }
        }
        if (!this.f8411m.equals("")) {
            codedOutputByteBufferNano.writeString(24, this.f8411m);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0716i9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0716i9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0716i9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 10:
                    this.f8399a = codedInputByteBufferNano.readString();
                    break;
                case 18:
                    this.f8400b = codedInputByteBufferNano.readString();
                    break;
                case 34:
                    this.f8401c = codedInputByteBufferNano.readString();
                    break;
                case C0793l9.f8690L /* 40 */:
                    this.f8402d = codedInputByteBufferNano.readUInt32();
                    break;
                case 82:
                    this.f8403e = codedInputByteBufferNano.readString();
                    break;
                case 122:
                    this.f8404f = codedInputByteBufferNano.readString();
                    break;
                case 136:
                    this.f8405g = codedInputByteBufferNano.readBool();
                    break;
                case 144:
                    this.f8406h = codedInputByteBufferNano.readUInt32();
                    break;
                case 154:
                    this.f8407i = codedInputByteBufferNano.readString();
                    break;
                case 170:
                    this.f8408j = codedInputByteBufferNano.readString();
                    break;
                case 176:
                    this.f8409k = codedInputByteBufferNano.readUInt32();
                    break;
                case 186:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 186);
                    C0690h9[] c0690h9Arr = this.f8410l;
                    int length = c0690h9Arr == null ? 0 : c0690h9Arr.length;
                    int i2 = repeatedFieldArrayLength + length;
                    C0690h9[] c0690h9Arr2 = new C0690h9[i2];
                    if (length != 0) {
                        System.arraycopy(c0690h9Arr, 0, c0690h9Arr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        C0690h9 c0690h9 = new C0690h9();
                        c0690h9Arr2[length] = c0690h9;
                        codedInputByteBufferNano.readMessage(c0690h9);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C0690h9 c0690h92 = new C0690h9();
                    c0690h9Arr2[length] = c0690h92;
                    codedInputByteBufferNano.readMessage(c0690h92);
                    this.f8410l = c0690h9Arr2;
                    break;
                case 194:
                    this.f8411m = codedInputByteBufferNano.readString();
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        return this;
                    }
                    break;
            }
        }
    }

    public static C0716i9 a(byte[] bArr) {
        return (C0716i9) MessageNano.mergeFrom(new C0716i9(), bArr);
    }
}
