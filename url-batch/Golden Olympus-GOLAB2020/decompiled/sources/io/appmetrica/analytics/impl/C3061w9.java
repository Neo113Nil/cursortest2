package io.appmetrica.analytics.impl;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.w9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3061w9 extends MessageNano {

    /* renamed from: n, reason: collision with root package name */
    public static volatile C3061w9[] f40021n;

    /* renamed from: a, reason: collision with root package name */
    public String f40022a;

    /* renamed from: b, reason: collision with root package name */
    public String f40023b;

    /* renamed from: c, reason: collision with root package name */
    public String f40024c;

    /* renamed from: d, reason: collision with root package name */
    public int f40025d;

    /* renamed from: e, reason: collision with root package name */
    public String f40026e;

    /* renamed from: f, reason: collision with root package name */
    public String f40027f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f40028g;

    /* renamed from: h, reason: collision with root package name */
    public int f40029h;

    /* renamed from: i, reason: collision with root package name */
    public String f40030i;

    /* renamed from: j, reason: collision with root package name */
    public String f40031j;

    /* renamed from: k, reason: collision with root package name */
    public int f40032k;

    /* renamed from: l, reason: collision with root package name */
    public C3035v9[] f40033l;

    /* renamed from: m, reason: collision with root package name */
    public String f40034m;

    public C3061w9() {
        a();
    }

    public static C3061w9[] b() {
        if (f40021n == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f40021n == null) {
                        f40021n = new C3061w9[0];
                    }
                } finally {
                }
            }
        }
        return f40021n;
    }

    public final C3061w9 a() {
        this.f40022a = "";
        this.f40023b = "";
        this.f40024c = "";
        this.f40025d = 0;
        this.f40026e = "";
        this.f40027f = "";
        this.f40028g = false;
        this.f40029h = 0;
        this.f40030i = "";
        this.f40031j = "";
        this.f40032k = 0;
        this.f40033l = C3035v9.b();
        this.f40034m = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f40022a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f40022a);
        }
        if (!this.f40023b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f40023b);
        }
        if (!this.f40024c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.f40024c);
        }
        int i4 = this.f40025d;
        if (i4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(5, i4);
        }
        if (!this.f40026e.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(10, this.f40026e);
        }
        if (!this.f40027f.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(15, this.f40027f);
        }
        boolean z4 = this.f40028g;
        if (z4) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(17, z4);
        }
        int i5 = this.f40029h;
        if (i5 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(18, i5);
        }
        if (!this.f40030i.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(19, this.f40030i);
        }
        if (!this.f40031j.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(21, this.f40031j);
        }
        int i6 = this.f40032k;
        if (i6 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(22, i6);
        }
        C3035v9[] c3035v9Arr = this.f40033l;
        if (c3035v9Arr != null && c3035v9Arr.length > 0) {
            int i7 = 0;
            while (true) {
                C3035v9[] c3035v9Arr2 = this.f40033l;
                if (i7 >= c3035v9Arr2.length) {
                    break;
                }
                C3035v9 c3035v9 = c3035v9Arr2[i7];
                if (c3035v9 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(23, c3035v9) + computeSerializedSize;
                }
                i7++;
            }
        }
        return !this.f40034m.equals("") ? CodedOutputByteBufferNano.computeStringSize(24, this.f40034m) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f40022a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f40022a);
        }
        if (!this.f40023b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f40023b);
        }
        if (!this.f40024c.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f40024c);
        }
        int i4 = this.f40025d;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i4);
        }
        if (!this.f40026e.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f40026e);
        }
        if (!this.f40027f.equals("")) {
            codedOutputByteBufferNano.writeString(15, this.f40027f);
        }
        boolean z4 = this.f40028g;
        if (z4) {
            codedOutputByteBufferNano.writeBool(17, z4);
        }
        int i5 = this.f40029h;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeUInt32(18, i5);
        }
        if (!this.f40030i.equals("")) {
            codedOutputByteBufferNano.writeString(19, this.f40030i);
        }
        if (!this.f40031j.equals("")) {
            codedOutputByteBufferNano.writeString(21, this.f40031j);
        }
        int i6 = this.f40032k;
        if (i6 != 0) {
            codedOutputByteBufferNano.writeUInt32(22, i6);
        }
        C3035v9[] c3035v9Arr = this.f40033l;
        if (c3035v9Arr != null && c3035v9Arr.length > 0) {
            int i7 = 0;
            while (true) {
                C3035v9[] c3035v9Arr2 = this.f40033l;
                if (i7 >= c3035v9Arr2.length) {
                    break;
                }
                C3035v9 c3035v9 = c3035v9Arr2[i7];
                if (c3035v9 != null) {
                    codedOutputByteBufferNano.writeMessage(23, c3035v9);
                }
                i7++;
            }
        }
        if (!this.f40034m.equals("")) {
            codedOutputByteBufferNano.writeString(24, this.f40034m);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C3061w9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C3061w9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3061w9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 10:
                    this.f40022a = codedInputByteBufferNano.readString();
                    break;
                case 18:
                    this.f40023b = codedInputByteBufferNano.readString();
                    break;
                case 34:
                    this.f40024c = codedInputByteBufferNano.readString();
                    break;
                case 40:
                    this.f40025d = codedInputByteBufferNano.readUInt32();
                    break;
                case IronSourceConstants.TROUBLESHOOTING_AD_QUALITY_SDK_WAS_ALREADY_INITIALIZED_EVENT /* 82 */:
                    this.f40026e = codedInputByteBufferNano.readString();
                    break;
                case 122:
                    this.f40027f = codedInputByteBufferNano.readString();
                    break;
                case 136:
                    this.f40028g = codedInputByteBufferNano.readBool();
                    break;
                case 144:
                    this.f40029h = codedInputByteBufferNano.readUInt32();
                    break;
                case 154:
                    this.f40030i = codedInputByteBufferNano.readString();
                    break;
                case 170:
                    this.f40031j = codedInputByteBufferNano.readString();
                    break;
                case 176:
                    this.f40032k = codedInputByteBufferNano.readUInt32();
                    break;
                case 186:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 186);
                    C3035v9[] c3035v9Arr = this.f40033l;
                    int length = c3035v9Arr == null ? 0 : c3035v9Arr.length;
                    int i4 = repeatedFieldArrayLength + length;
                    C3035v9[] c3035v9Arr2 = new C3035v9[i4];
                    if (length != 0) {
                        System.arraycopy(c3035v9Arr, 0, c3035v9Arr2, 0, length);
                    }
                    while (length < i4 - 1) {
                        C3035v9 c3035v9 = new C3035v9();
                        c3035v9Arr2[length] = c3035v9;
                        codedInputByteBufferNano.readMessage(c3035v9);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C3035v9 c3035v92 = new C3035v9();
                    c3035v9Arr2[length] = c3035v92;
                    codedInputByteBufferNano.readMessage(c3035v92);
                    this.f40033l = c3035v9Arr2;
                    break;
                case 194:
                    this.f40034m = codedInputByteBufferNano.readString();
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

    public static C3061w9 a(byte[] bArr) {
        return (C3061w9) MessageNano.mergeFrom(new C3061w9(), bArr);
    }
}
