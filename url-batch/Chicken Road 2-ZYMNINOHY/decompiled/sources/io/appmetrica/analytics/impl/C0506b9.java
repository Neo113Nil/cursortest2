package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import io.flutter.Build;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.b9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0506b9 extends MessageNano {
    public static volatile C0506b9[] n;

    /* renamed from: a, reason: collision with root package name */
    public String f11485a;

    /* renamed from: b, reason: collision with root package name */
    public String f11486b;

    /* renamed from: c, reason: collision with root package name */
    public String f11487c;

    /* renamed from: d, reason: collision with root package name */
    public int f11488d;

    /* renamed from: e, reason: collision with root package name */
    public String f11489e;

    /* renamed from: f, reason: collision with root package name */
    public String f11490f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11491g;

    /* renamed from: h, reason: collision with root package name */
    public int f11492h;

    /* renamed from: i, reason: collision with root package name */
    public String f11493i;

    /* renamed from: j, reason: collision with root package name */
    public String f11494j;

    /* renamed from: k, reason: collision with root package name */
    public int f11495k;

    /* renamed from: l, reason: collision with root package name */
    public C0480a9[] f11496l;

    /* renamed from: m, reason: collision with root package name */
    public String f11497m;

    public C0506b9() {
        a();
    }

    public static C0506b9[] b() {
        if (n == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (n == null) {
                        n = new C0506b9[0];
                    }
                } finally {
                }
            }
        }
        return n;
    }

    public final C0506b9 a() {
        this.f11485a = "";
        this.f11486b = "";
        this.f11487c = "";
        this.f11488d = 0;
        this.f11489e = "";
        this.f11490f = "";
        this.f11491g = false;
        this.f11492h = 0;
        this.f11493i = "";
        this.f11494j = "";
        this.f11495k = 0;
        this.f11496l = C0480a9.b();
        this.f11497m = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f11485a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f11485a);
        }
        if (!this.f11486b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f11486b);
        }
        if (!this.f11487c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.f11487c);
        }
        int i4 = this.f11488d;
        if (i4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(5, i4);
        }
        if (!this.f11489e.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(10, this.f11489e);
        }
        if (!this.f11490f.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(15, this.f11490f);
        }
        boolean z = this.f11491g;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(17, z);
        }
        int i5 = this.f11492h;
        if (i5 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(18, i5);
        }
        if (!this.f11493i.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(19, this.f11493i);
        }
        if (!this.f11494j.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(21, this.f11494j);
        }
        int i6 = this.f11495k;
        if (i6 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(22, i6);
        }
        C0480a9[] c0480a9Arr = this.f11496l;
        if (c0480a9Arr != null && c0480a9Arr.length > 0) {
            int i7 = 0;
            while (true) {
                C0480a9[] c0480a9Arr2 = this.f11496l;
                if (i7 >= c0480a9Arr2.length) {
                    break;
                }
                C0480a9 c0480a9 = c0480a9Arr2[i7];
                if (c0480a9 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(23, c0480a9) + computeSerializedSize;
                }
                i7++;
            }
        }
        return !this.f11497m.equals("") ? CodedOutputByteBufferNano.computeStringSize(24, this.f11497m) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f11485a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f11485a);
        }
        if (!this.f11486b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f11486b);
        }
        if (!this.f11487c.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f11487c);
        }
        int i4 = this.f11488d;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i4);
        }
        if (!this.f11489e.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f11489e);
        }
        if (!this.f11490f.equals("")) {
            codedOutputByteBufferNano.writeString(15, this.f11490f);
        }
        boolean z = this.f11491g;
        if (z) {
            codedOutputByteBufferNano.writeBool(17, z);
        }
        int i5 = this.f11492h;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeUInt32(18, i5);
        }
        if (!this.f11493i.equals("")) {
            codedOutputByteBufferNano.writeString(19, this.f11493i);
        }
        if (!this.f11494j.equals("")) {
            codedOutputByteBufferNano.writeString(21, this.f11494j);
        }
        int i6 = this.f11495k;
        if (i6 != 0) {
            codedOutputByteBufferNano.writeUInt32(22, i6);
        }
        C0480a9[] c0480a9Arr = this.f11496l;
        if (c0480a9Arr != null && c0480a9Arr.length > 0) {
            int i7 = 0;
            while (true) {
                C0480a9[] c0480a9Arr2 = this.f11496l;
                if (i7 >= c0480a9Arr2.length) {
                    break;
                }
                C0480a9 c0480a9 = c0480a9Arr2[i7];
                if (c0480a9 != null) {
                    codedOutputByteBufferNano.writeMessage(23, c0480a9);
                }
                i7++;
            }
        }
        if (!this.f11497m.equals("")) {
            codedOutputByteBufferNano.writeString(24, this.f11497m);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0506b9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0506b9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0506b9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 10:
                    this.f11485a = codedInputByteBufferNano.readString();
                    break;
                case 18:
                    this.f11486b = codedInputByteBufferNano.readString();
                    break;
                case Build.API_LEVELS.API_34 /* 34 */:
                    this.f11487c = codedInputByteBufferNano.readString();
                    break;
                case C0583e9.L /* 40 */:
                    this.f11488d = codedInputByteBufferNano.readUInt32();
                    break;
                case 82:
                    this.f11489e = codedInputByteBufferNano.readString();
                    break;
                case 122:
                    this.f11490f = codedInputByteBufferNano.readString();
                    break;
                case 136:
                    this.f11491g = codedInputByteBufferNano.readBool();
                    break;
                case 144:
                    this.f11492h = codedInputByteBufferNano.readUInt32();
                    break;
                case 154:
                    this.f11493i = codedInputByteBufferNano.readString();
                    break;
                case 170:
                    this.f11494j = codedInputByteBufferNano.readString();
                    break;
                case 176:
                    this.f11495k = codedInputByteBufferNano.readUInt32();
                    break;
                case 186:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 186);
                    C0480a9[] c0480a9Arr = this.f11496l;
                    int length = c0480a9Arr == null ? 0 : c0480a9Arr.length;
                    int i4 = repeatedFieldArrayLength + length;
                    C0480a9[] c0480a9Arr2 = new C0480a9[i4];
                    if (length != 0) {
                        System.arraycopy(c0480a9Arr, 0, c0480a9Arr2, 0, length);
                    }
                    while (length < i4 - 1) {
                        C0480a9 c0480a9 = new C0480a9();
                        c0480a9Arr2[length] = c0480a9;
                        codedInputByteBufferNano.readMessage(c0480a9);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C0480a9 c0480a92 = new C0480a9();
                    c0480a9Arr2[length] = c0480a92;
                    codedInputByteBufferNano.readMessage(c0480a92);
                    this.f11496l = c0480a9Arr2;
                    break;
                case 194:
                    this.f11497m = codedInputByteBufferNano.readString();
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }

    public static C0506b9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0506b9) MessageNano.mergeFrom(new C0506b9(), bArr);
    }
}
