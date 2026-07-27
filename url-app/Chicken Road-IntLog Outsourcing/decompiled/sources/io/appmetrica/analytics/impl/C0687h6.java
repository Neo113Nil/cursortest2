package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.h6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0687h6 extends MessageNano {

    /* renamed from: g, reason: collision with root package name */
    public static volatile C0687h6[] f8305g;

    /* renamed from: a, reason: collision with root package name */
    public String f8306a;

    /* renamed from: b, reason: collision with root package name */
    public int f8307b;

    /* renamed from: c, reason: collision with root package name */
    public long f8308c;

    /* renamed from: d, reason: collision with root package name */
    public String f8309d;

    /* renamed from: e, reason: collision with root package name */
    public int f8310e;

    /* renamed from: f, reason: collision with root package name */
    public C0661g6[] f8311f;

    public C0687h6() {
        a();
    }

    public static C0687h6[] b() {
        if (f8305g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8305g == null) {
                        f8305g = new C0687h6[0];
                    }
                } finally {
                }
            }
        }
        return f8305g;
    }

    public final C0687h6 a() {
        this.f8306a = "";
        this.f8307b = 0;
        this.f8308c = 0L;
        this.f8309d = "";
        this.f8310e = 0;
        this.f8311f = C0661g6.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSInt64Size = CodedOutputByteBufferNano.computeSInt64Size(3, this.f8308c) + CodedOutputByteBufferNano.computeSInt32Size(2, this.f8307b) + CodedOutputByteBufferNano.computeStringSize(1, this.f8306a) + super.computeSerializedSize();
        if (!this.f8309d.equals("")) {
            computeSInt64Size += CodedOutputByteBufferNano.computeStringSize(4, this.f8309d);
        }
        int i2 = this.f8310e;
        if (i2 != 0) {
            computeSInt64Size += CodedOutputByteBufferNano.computeUInt32Size(5, i2);
        }
        C0661g6[] c0661g6Arr = this.f8311f;
        if (c0661g6Arr != null && c0661g6Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C0661g6[] c0661g6Arr2 = this.f8311f;
                if (i3 >= c0661g6Arr2.length) {
                    break;
                }
                C0661g6 c0661g6 = c0661g6Arr2[i3];
                if (c0661g6 != null) {
                    computeSInt64Size = CodedOutputByteBufferNano.computeMessageSize(6, c0661g6) + computeSInt64Size;
                }
                i3++;
            }
        }
        return computeSInt64Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeString(1, this.f8306a);
        codedOutputByteBufferNano.writeSInt32(2, this.f8307b);
        codedOutputByteBufferNano.writeSInt64(3, this.f8308c);
        if (!this.f8309d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f8309d);
        }
        int i2 = this.f8310e;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i2);
        }
        C0661g6[] c0661g6Arr = this.f8311f;
        if (c0661g6Arr != null && c0661g6Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C0661g6[] c0661g6Arr2 = this.f8311f;
                if (i3 >= c0661g6Arr2.length) {
                    break;
                }
                C0661g6 c0661g6 = c0661g6Arr2[i3];
                if (c0661g6 != null) {
                    codedOutputByteBufferNano.writeMessage(6, c0661g6);
                }
                i3++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0687h6 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0687h6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0687h6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f8306a = codedInputByteBufferNano.readString();
            } else if (readTag == 16) {
                this.f8307b = codedInputByteBufferNano.readSInt32();
            } else if (readTag == 24) {
                this.f8308c = codedInputByteBufferNano.readSInt64();
            } else if (readTag == 34) {
                this.f8309d = codedInputByteBufferNano.readString();
            } else if (readTag == 40) {
                this.f8310e = codedInputByteBufferNano.readUInt32();
            } else if (readTag != 50) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                C0661g6[] c0661g6Arr = this.f8311f;
                int length = c0661g6Arr == null ? 0 : c0661g6Arr.length;
                int i2 = repeatedFieldArrayLength + length;
                C0661g6[] c0661g6Arr2 = new C0661g6[i2];
                if (length != 0) {
                    System.arraycopy(c0661g6Arr, 0, c0661g6Arr2, 0, length);
                }
                while (length < i2 - 1) {
                    C0661g6 c0661g6 = new C0661g6();
                    c0661g6Arr2[length] = c0661g6;
                    codedInputByteBufferNano.readMessage(c0661g6);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0661g6 c0661g62 = new C0661g6();
                c0661g6Arr2[length] = c0661g62;
                codedInputByteBufferNano.readMessage(c0661g62);
                this.f8311f = c0661g6Arr2;
            }
        }
    }

    public static C0687h6 a(byte[] bArr) {
        return (C0687h6) MessageNano.mergeFrom(new C0687h6(), bArr);
    }
}
