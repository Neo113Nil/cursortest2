package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.i9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0565i9 extends MessageNano {

    /* renamed from: n, reason: collision with root package name */
    public static volatile C0565i9[] f7514n;

    /* renamed from: a, reason: collision with root package name */
    public String f7515a;

    /* renamed from: b, reason: collision with root package name */
    public String f7516b;

    /* renamed from: c, reason: collision with root package name */
    public String f7517c;

    /* renamed from: d, reason: collision with root package name */
    public int f7518d;

    /* renamed from: e, reason: collision with root package name */
    public String f7519e;
    public String f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7520g;

    /* renamed from: h, reason: collision with root package name */
    public int f7521h;

    /* renamed from: i, reason: collision with root package name */
    public String f7522i;

    /* renamed from: j, reason: collision with root package name */
    public String f7523j;

    /* renamed from: k, reason: collision with root package name */
    public int f7524k;

    /* renamed from: l, reason: collision with root package name */
    public C0539h9[] f7525l;

    /* renamed from: m, reason: collision with root package name */
    public String f7526m;

    public C0565i9() {
        a();
    }

    public static C0565i9[] b() {
        if (f7514n == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7514n == null) {
                        f7514n = new C0565i9[0];
                    }
                } finally {
                }
            }
        }
        return f7514n;
    }

    public final C0565i9 a() {
        this.f7515a = "";
        this.f7516b = "";
        this.f7517c = "";
        this.f7518d = 0;
        this.f7519e = "";
        this.f = "";
        this.f7520g = false;
        this.f7521h = 0;
        this.f7522i = "";
        this.f7523j = "";
        this.f7524k = 0;
        this.f7525l = C0539h9.b();
        this.f7526m = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f7515a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f7515a);
        }
        if (!this.f7516b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f7516b);
        }
        if (!this.f7517c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.f7517c);
        }
        int i3 = this.f7518d;
        if (i3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(5, i3);
        }
        if (!this.f7519e.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(10, this.f7519e);
        }
        if (!this.f.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(15, this.f);
        }
        boolean z = this.f7520g;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(17, z);
        }
        int i4 = this.f7521h;
        if (i4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(18, i4);
        }
        if (!this.f7522i.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(19, this.f7522i);
        }
        if (!this.f7523j.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(21, this.f7523j);
        }
        int i5 = this.f7524k;
        if (i5 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(22, i5);
        }
        C0539h9[] c0539h9Arr = this.f7525l;
        if (c0539h9Arr != null && c0539h9Arr.length > 0) {
            int i6 = 0;
            while (true) {
                C0539h9[] c0539h9Arr2 = this.f7525l;
                if (i6 >= c0539h9Arr2.length) {
                    break;
                }
                C0539h9 c0539h9 = c0539h9Arr2[i6];
                if (c0539h9 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(23, c0539h9) + computeSerializedSize;
                }
                i6++;
            }
        }
        return !this.f7526m.equals("") ? CodedOutputByteBufferNano.computeStringSize(24, this.f7526m) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f7515a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f7515a);
        }
        if (!this.f7516b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f7516b);
        }
        if (!this.f7517c.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f7517c);
        }
        int i3 = this.f7518d;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i3);
        }
        if (!this.f7519e.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f7519e);
        }
        if (!this.f.equals("")) {
            codedOutputByteBufferNano.writeString(15, this.f);
        }
        boolean z = this.f7520g;
        if (z) {
            codedOutputByteBufferNano.writeBool(17, z);
        }
        int i4 = this.f7521h;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeUInt32(18, i4);
        }
        if (!this.f7522i.equals("")) {
            codedOutputByteBufferNano.writeString(19, this.f7522i);
        }
        if (!this.f7523j.equals("")) {
            codedOutputByteBufferNano.writeString(21, this.f7523j);
        }
        int i5 = this.f7524k;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeUInt32(22, i5);
        }
        C0539h9[] c0539h9Arr = this.f7525l;
        if (c0539h9Arr != null && c0539h9Arr.length > 0) {
            int i6 = 0;
            while (true) {
                C0539h9[] c0539h9Arr2 = this.f7525l;
                if (i6 >= c0539h9Arr2.length) {
                    break;
                }
                C0539h9 c0539h9 = c0539h9Arr2[i6];
                if (c0539h9 != null) {
                    codedOutputByteBufferNano.writeMessage(23, c0539h9);
                }
                i6++;
            }
        }
        if (!this.f7526m.equals("")) {
            codedOutputByteBufferNano.writeString(24, this.f7526m);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0565i9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0565i9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0565i9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 10:
                    this.f7515a = codedInputByteBufferNano.readString();
                    break;
                case 18:
                    this.f7516b = codedInputByteBufferNano.readString();
                    break;
                case 34:
                    this.f7517c = codedInputByteBufferNano.readString();
                    break;
                case C0642l9.L /* 40 */:
                    this.f7518d = codedInputByteBufferNano.readUInt32();
                    break;
                case 82:
                    this.f7519e = codedInputByteBufferNano.readString();
                    break;
                case 122:
                    this.f = codedInputByteBufferNano.readString();
                    break;
                case 136:
                    this.f7520g = codedInputByteBufferNano.readBool();
                    break;
                case 144:
                    this.f7521h = codedInputByteBufferNano.readUInt32();
                    break;
                case 154:
                    this.f7522i = codedInputByteBufferNano.readString();
                    break;
                case 170:
                    this.f7523j = codedInputByteBufferNano.readString();
                    break;
                case 176:
                    this.f7524k = codedInputByteBufferNano.readUInt32();
                    break;
                case 186:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 186);
                    C0539h9[] c0539h9Arr = this.f7525l;
                    int length = c0539h9Arr == null ? 0 : c0539h9Arr.length;
                    int i3 = repeatedFieldArrayLength + length;
                    C0539h9[] c0539h9Arr2 = new C0539h9[i3];
                    if (length != 0) {
                        System.arraycopy(c0539h9Arr, 0, c0539h9Arr2, 0, length);
                    }
                    while (length < i3 - 1) {
                        C0539h9 c0539h9 = new C0539h9();
                        c0539h9Arr2[length] = c0539h9;
                        codedInputByteBufferNano.readMessage(c0539h9);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C0539h9 c0539h92 = new C0539h9();
                    c0539h9Arr2[length] = c0539h92;
                    codedInputByteBufferNano.readMessage(c0539h92);
                    this.f7525l = c0539h9Arr2;
                    break;
                case 194:
                    this.f7526m = codedInputByteBufferNano.readString();
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

    public static C0565i9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0565i9) MessageNano.mergeFrom(new C0565i9(), bArr);
    }
}
