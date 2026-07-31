package io.appmetrica.analytics.impl;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.r6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2928r6 extends MessageNano {

    /* renamed from: k, reason: collision with root package name */
    public static final int f39701k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static final int f39702l = 1;

    /* renamed from: m, reason: collision with root package name */
    public static volatile C2928r6[] f39703m;

    /* renamed from: n, reason: collision with root package name */
    public static byte[] f39704n;

    /* renamed from: o, reason: collision with root package name */
    public static volatile boolean f39705o;

    /* renamed from: a, reason: collision with root package name */
    public C3084x6 f39706a;

    /* renamed from: b, reason: collision with root package name */
    public C2825n6 f39707b;

    /* renamed from: c, reason: collision with root package name */
    public String f39708c;

    /* renamed from: d, reason: collision with root package name */
    public int f39709d;

    /* renamed from: e, reason: collision with root package name */
    public C3032v6[] f39710e;

    /* renamed from: f, reason: collision with root package name */
    public int f39711f;

    /* renamed from: g, reason: collision with root package name */
    public C2903q6 f39712g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f39713h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f39714i;

    /* renamed from: j, reason: collision with root package name */
    public C2877p6[] f39715j;

    public C2928r6() {
        if (!f39705o) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!f39705o) {
                        f39704n = InternalNano.bytesDefaultValue("JVM");
                        f39705o = true;
                    }
                } finally {
                }
            }
        }
        a();
    }

    public static C2928r6[] b() {
        if (f39703m == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f39703m == null) {
                        f39703m = new C2928r6[0];
                    }
                } finally {
                }
            }
        }
        return f39703m;
    }

    public final C2928r6 a() {
        this.f39706a = null;
        this.f39707b = null;
        this.f39708c = "";
        this.f39709d = -1;
        this.f39710e = C3032v6.b();
        this.f39711f = 0;
        this.f39712g = null;
        this.f39713h = (byte[]) f39704n.clone();
        this.f39714i = WireFormatNano.EMPTY_BYTES;
        this.f39715j = C2877p6.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C3084x6 c3084x6 = this.f39706a;
        if (c3084x6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c3084x6);
        }
        C2825n6 c2825n6 = this.f39707b;
        if (c2825n6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c2825n6);
        }
        if (!this.f39708c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f39708c);
        }
        int i4 = this.f39709d;
        if (i4 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i4);
        }
        C3032v6[] c3032v6Arr = this.f39710e;
        int i5 = 0;
        if (c3032v6Arr != null && c3032v6Arr.length > 0) {
            int i6 = 0;
            while (true) {
                C3032v6[] c3032v6Arr2 = this.f39710e;
                if (i6 >= c3032v6Arr2.length) {
                    break;
                }
                C3032v6 c3032v6 = c3032v6Arr2[i6];
                if (c3032v6 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(5, c3032v6) + computeSerializedSize;
                }
                i6++;
            }
        }
        int i7 = this.f39711f;
        if (i7 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, i7);
        }
        C2903q6 c2903q6 = this.f39712g;
        if (c2903q6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(7, c2903q6);
        }
        if (!Arrays.equals(this.f39713h, f39704n)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(8, this.f39713h);
        }
        if (!Arrays.equals(this.f39714i, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f39714i);
        }
        C2877p6[] c2877p6Arr = this.f39715j;
        if (c2877p6Arr != null && c2877p6Arr.length > 0) {
            while (true) {
                C2877p6[] c2877p6Arr2 = this.f39715j;
                if (i5 >= c2877p6Arr2.length) {
                    break;
                }
                C2877p6 c2877p6 = c2877p6Arr2[i5];
                if (c2877p6 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(10, c2877p6) + computeSerializedSize;
                }
                i5++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C3084x6 c3084x6 = this.f39706a;
        if (c3084x6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c3084x6);
        }
        C2825n6 c2825n6 = this.f39707b;
        if (c2825n6 != null) {
            codedOutputByteBufferNano.writeMessage(2, c2825n6);
        }
        if (!this.f39708c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f39708c);
        }
        int i4 = this.f39709d;
        if (i4 != -1) {
            codedOutputByteBufferNano.writeInt32(4, i4);
        }
        C3032v6[] c3032v6Arr = this.f39710e;
        int i5 = 0;
        if (c3032v6Arr != null && c3032v6Arr.length > 0) {
            int i6 = 0;
            while (true) {
                C3032v6[] c3032v6Arr2 = this.f39710e;
                if (i6 >= c3032v6Arr2.length) {
                    break;
                }
                C3032v6 c3032v6 = c3032v6Arr2[i6];
                if (c3032v6 != null) {
                    codedOutputByteBufferNano.writeMessage(5, c3032v6);
                }
                i6++;
            }
        }
        int i7 = this.f39711f;
        if (i7 != 0) {
            codedOutputByteBufferNano.writeInt32(6, i7);
        }
        C2903q6 c2903q6 = this.f39712g;
        if (c2903q6 != null) {
            codedOutputByteBufferNano.writeMessage(7, c2903q6);
        }
        if (!Arrays.equals(this.f39713h, f39704n)) {
            codedOutputByteBufferNano.writeBytes(8, this.f39713h);
        }
        if (!Arrays.equals(this.f39714i, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(9, this.f39714i);
        }
        C2877p6[] c2877p6Arr = this.f39715j;
        if (c2877p6Arr != null && c2877p6Arr.length > 0) {
            while (true) {
                C2877p6[] c2877p6Arr2 = this.f39715j;
                if (i5 >= c2877p6Arr2.length) {
                    break;
                }
                C2877p6 c2877p6 = c2877p6Arr2[i5];
                if (c2877p6 != null) {
                    codedOutputByteBufferNano.writeMessage(10, c2877p6);
                }
                i5++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C2928r6 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2928r6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2928r6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 10:
                    if (this.f39706a == null) {
                        this.f39706a = new C3084x6();
                    }
                    codedInputByteBufferNano.readMessage(this.f39706a);
                    break;
                case 18:
                    if (this.f39707b == null) {
                        this.f39707b = new C2825n6();
                    }
                    codedInputByteBufferNano.readMessage(this.f39707b);
                    break;
                case 26:
                    this.f39708c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != -1 && readInt32 != 0 && readInt32 != 1) {
                        break;
                    } else {
                        this.f39709d = readInt32;
                        break;
                    }
                case 42:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                    C3032v6[] c3032v6Arr = this.f39710e;
                    int length = c3032v6Arr == null ? 0 : c3032v6Arr.length;
                    int i4 = repeatedFieldArrayLength + length;
                    C3032v6[] c3032v6Arr2 = new C3032v6[i4];
                    if (length != 0) {
                        System.arraycopy(c3032v6Arr, 0, c3032v6Arr2, 0, length);
                    }
                    while (length < i4 - 1) {
                        C3032v6 c3032v6 = new C3032v6();
                        c3032v6Arr2[length] = c3032v6;
                        codedInputByteBufferNano.readMessage(c3032v6);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C3032v6 c3032v62 = new C3032v6();
                    c3032v6Arr2[length] = c3032v62;
                    codedInputByteBufferNano.readMessage(c3032v62);
                    this.f39710e = c3032v6Arr2;
                    break;
                case 48:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != 0 && readInt322 != 1) {
                        break;
                    } else {
                        this.f39711f = readInt322;
                        break;
                    }
                case 58:
                    if (this.f39712g == null) {
                        this.f39712g = new C2903q6();
                    }
                    codedInputByteBufferNano.readMessage(this.f39712g);
                    break;
                case 66:
                    this.f39713h = codedInputByteBufferNano.readBytes();
                    break;
                case IronSourceConstants.TEST_SUITE_WEB_CONTROLLER_FAILED_TO_LOAD /* 74 */:
                    this.f39714i = codedInputByteBufferNano.readBytes();
                    break;
                case IronSourceConstants.TROUBLESHOOTING_AD_QUALITY_SDK_WAS_ALREADY_INITIALIZED_EVENT /* 82 */:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                    C2877p6[] c2877p6Arr = this.f39715j;
                    int length2 = c2877p6Arr == null ? 0 : c2877p6Arr.length;
                    int i5 = repeatedFieldArrayLength2 + length2;
                    C2877p6[] c2877p6Arr2 = new C2877p6[i5];
                    if (length2 != 0) {
                        System.arraycopy(c2877p6Arr, 0, c2877p6Arr2, 0, length2);
                    }
                    while (length2 < i5 - 1) {
                        C2877p6 c2877p6 = new C2877p6();
                        c2877p6Arr2[length2] = c2877p6;
                        codedInputByteBufferNano.readMessage(c2877p6);
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    C2877p6 c2877p62 = new C2877p6();
                    c2877p6Arr2[length2] = c2877p62;
                    codedInputByteBufferNano.readMessage(c2877p62);
                    this.f39715j = c2877p6Arr2;
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

    public static C2928r6 a(byte[] bArr) {
        return (C2928r6) MessageNano.mergeFrom(new C2928r6(), bArr);
    }
}
