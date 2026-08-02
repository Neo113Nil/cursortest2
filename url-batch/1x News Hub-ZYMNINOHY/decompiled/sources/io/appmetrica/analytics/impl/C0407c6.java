package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.c6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0407c6 extends MessageNano {

    /* renamed from: k, reason: collision with root package name */
    public static final int f7118k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static final int f7119l = 1;

    /* renamed from: m, reason: collision with root package name */
    public static volatile C0407c6[] f7120m;

    /* renamed from: n, reason: collision with root package name */
    public static byte[] f7121n;
    public static volatile boolean o;

    /* renamed from: a, reason: collision with root package name */
    public C0562i6 f7122a;

    /* renamed from: b, reason: collision with root package name */
    public Y5 f7123b;

    /* renamed from: c, reason: collision with root package name */
    public String f7124c;

    /* renamed from: d, reason: collision with root package name */
    public int f7125d;

    /* renamed from: e, reason: collision with root package name */
    public C0510g6[] f7126e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public C0381b6 f7127g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f7128h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f7129i;

    /* renamed from: j, reason: collision with root package name */
    public C0355a6[] f7130j;

    public C0407c6() {
        if (!o) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!o) {
                        f7121n = InternalNano.bytesDefaultValue("JVM");
                        o = true;
                    }
                } finally {
                }
            }
        }
        a();
    }

    public static C0407c6[] b() {
        if (f7120m == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7120m == null) {
                        f7120m = new C0407c6[0];
                    }
                } finally {
                }
            }
        }
        return f7120m;
    }

    public final C0407c6 a() {
        this.f7122a = null;
        this.f7123b = null;
        this.f7124c = "";
        this.f7125d = -1;
        this.f7126e = C0510g6.b();
        this.f = 0;
        this.f7127g = null;
        this.f7128h = (byte[]) f7121n.clone();
        this.f7129i = WireFormatNano.EMPTY_BYTES;
        this.f7130j = C0355a6.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0562i6 c0562i6 = this.f7122a;
        if (c0562i6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0562i6);
        }
        Y5 y5 = this.f7123b;
        if (y5 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, y5);
        }
        if (!this.f7124c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f7124c);
        }
        int i3 = this.f7125d;
        if (i3 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i3);
        }
        C0510g6[] c0510g6Arr = this.f7126e;
        int i4 = 0;
        if (c0510g6Arr != null && c0510g6Arr.length > 0) {
            int i5 = 0;
            while (true) {
                C0510g6[] c0510g6Arr2 = this.f7126e;
                if (i5 >= c0510g6Arr2.length) {
                    break;
                }
                C0510g6 c0510g6 = c0510g6Arr2[i5];
                if (c0510g6 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(5, c0510g6) + computeSerializedSize;
                }
                i5++;
            }
        }
        int i6 = this.f;
        if (i6 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, i6);
        }
        C0381b6 c0381b6 = this.f7127g;
        if (c0381b6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(7, c0381b6);
        }
        if (!Arrays.equals(this.f7128h, f7121n)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(8, this.f7128h);
        }
        if (!Arrays.equals(this.f7129i, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f7129i);
        }
        C0355a6[] c0355a6Arr = this.f7130j;
        if (c0355a6Arr != null && c0355a6Arr.length > 0) {
            while (true) {
                C0355a6[] c0355a6Arr2 = this.f7130j;
                if (i4 >= c0355a6Arr2.length) {
                    break;
                }
                C0355a6 c0355a6 = c0355a6Arr2[i4];
                if (c0355a6 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(10, c0355a6) + computeSerializedSize;
                }
                i4++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0562i6 c0562i6 = this.f7122a;
        if (c0562i6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0562i6);
        }
        Y5 y5 = this.f7123b;
        if (y5 != null) {
            codedOutputByteBufferNano.writeMessage(2, y5);
        }
        if (!this.f7124c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f7124c);
        }
        int i3 = this.f7125d;
        if (i3 != -1) {
            codedOutputByteBufferNano.writeInt32(4, i3);
        }
        C0510g6[] c0510g6Arr = this.f7126e;
        int i4 = 0;
        if (c0510g6Arr != null && c0510g6Arr.length > 0) {
            int i5 = 0;
            while (true) {
                C0510g6[] c0510g6Arr2 = this.f7126e;
                if (i5 >= c0510g6Arr2.length) {
                    break;
                }
                C0510g6 c0510g6 = c0510g6Arr2[i5];
                if (c0510g6 != null) {
                    codedOutputByteBufferNano.writeMessage(5, c0510g6);
                }
                i5++;
            }
        }
        int i6 = this.f;
        if (i6 != 0) {
            codedOutputByteBufferNano.writeInt32(6, i6);
        }
        C0381b6 c0381b6 = this.f7127g;
        if (c0381b6 != null) {
            codedOutputByteBufferNano.writeMessage(7, c0381b6);
        }
        if (!Arrays.equals(this.f7128h, f7121n)) {
            codedOutputByteBufferNano.writeBytes(8, this.f7128h);
        }
        if (!Arrays.equals(this.f7129i, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(9, this.f7129i);
        }
        C0355a6[] c0355a6Arr = this.f7130j;
        if (c0355a6Arr != null && c0355a6Arr.length > 0) {
            while (true) {
                C0355a6[] c0355a6Arr2 = this.f7130j;
                if (i4 >= c0355a6Arr2.length) {
                    break;
                }
                C0355a6 c0355a6 = c0355a6Arr2[i4];
                if (c0355a6 != null) {
                    codedOutputByteBufferNano.writeMessage(10, c0355a6);
                }
                i4++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0407c6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0407c6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0407c6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 10:
                    if (this.f7122a == null) {
                        this.f7122a = new C0562i6();
                    }
                    codedInputByteBufferNano.readMessage(this.f7122a);
                    break;
                case 18:
                    if (this.f7123b == null) {
                        this.f7123b = new Y5();
                    }
                    codedInputByteBufferNano.readMessage(this.f7123b);
                    break;
                case C0642l9.f7781G /* 26 */:
                    this.f7124c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != -1 && readInt32 != 0 && readInt32 != 1) {
                        break;
                    } else {
                        this.f7125d = readInt32;
                        break;
                    }
                case C0642l9.f7786M /* 42 */:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                    C0510g6[] c0510g6Arr = this.f7126e;
                    int length = c0510g6Arr == null ? 0 : c0510g6Arr.length;
                    int i3 = repeatedFieldArrayLength + length;
                    C0510g6[] c0510g6Arr2 = new C0510g6[i3];
                    if (length != 0) {
                        System.arraycopy(c0510g6Arr, 0, c0510g6Arr2, 0, length);
                    }
                    while (length < i3 - 1) {
                        C0510g6 c0510g6 = new C0510g6();
                        c0510g6Arr2[length] = c0510g6;
                        codedInputByteBufferNano.readMessage(c0510g6);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C0510g6 c0510g62 = new C0510g6();
                    c0510g6Arr2[length] = c0510g62;
                    codedInputByteBufferNano.readMessage(c0510g62);
                    this.f7126e = c0510g6Arr2;
                    break;
                case 48:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != 0 && readInt322 != 1) {
                        break;
                    } else {
                        this.f = readInt322;
                        break;
                    }
                case 58:
                    if (this.f7127g == null) {
                        this.f7127g = new C0381b6();
                    }
                    codedInputByteBufferNano.readMessage(this.f7127g);
                    break;
                case 66:
                    this.f7128h = codedInputByteBufferNano.readBytes();
                    break;
                case 74:
                    this.f7129i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                    C0355a6[] c0355a6Arr = this.f7130j;
                    int length2 = c0355a6Arr == null ? 0 : c0355a6Arr.length;
                    int i4 = repeatedFieldArrayLength2 + length2;
                    C0355a6[] c0355a6Arr2 = new C0355a6[i4];
                    if (length2 != 0) {
                        System.arraycopy(c0355a6Arr, 0, c0355a6Arr2, 0, length2);
                    }
                    while (length2 < i4 - 1) {
                        C0355a6 c0355a6 = new C0355a6();
                        c0355a6Arr2[length2] = c0355a6;
                        codedInputByteBufferNano.readMessage(c0355a6);
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    C0355a6 c0355a62 = new C0355a6();
                    c0355a6Arr2[length2] = c0355a62;
                    codedInputByteBufferNano.readMessage(c0355a62);
                    this.f7130j = c0355a6Arr2;
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

    public static C0407c6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0407c6) MessageNano.mergeFrom(new C0407c6(), bArr);
    }
}
