package io.appmetrica.analytics.impl;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.t6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2980t6 extends MessageNano {

    /* renamed from: l, reason: collision with root package name */
    public static final int f39827l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f39828m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static volatile C2980t6[] f39829n;

    /* renamed from: o, reason: collision with root package name */
    public static byte[] f39830o;

    /* renamed from: p, reason: collision with root package name */
    public static volatile boolean f39831p;

    /* renamed from: a, reason: collision with root package name */
    public C3084x6 f39832a;

    /* renamed from: b, reason: collision with root package name */
    public C2825n6 f39833b;

    /* renamed from: c, reason: collision with root package name */
    public String f39834c;

    /* renamed from: d, reason: collision with root package name */
    public int f39835d;

    /* renamed from: e, reason: collision with root package name */
    public C3032v6[] f39836e;

    /* renamed from: f, reason: collision with root package name */
    public String f39837f;

    /* renamed from: g, reason: collision with root package name */
    public int f39838g;

    /* renamed from: h, reason: collision with root package name */
    public C2954s6 f39839h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f39840i;

    /* renamed from: j, reason: collision with root package name */
    public byte[] f39841j;

    /* renamed from: k, reason: collision with root package name */
    public C2877p6[] f39842k;

    public C2980t6() {
        if (!f39831p) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!f39831p) {
                        f39830o = InternalNano.bytesDefaultValue("JVM");
                        f39831p = true;
                    }
                } finally {
                }
            }
        }
        a();
    }

    public static C2980t6[] b() {
        if (f39829n == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f39829n == null) {
                        f39829n = new C2980t6[0];
                    }
                } finally {
                }
            }
        }
        return f39829n;
    }

    public final C2980t6 a() {
        this.f39832a = null;
        this.f39833b = null;
        this.f39834c = "";
        this.f39835d = -1;
        this.f39836e = C3032v6.b();
        this.f39837f = "";
        this.f39838g = 0;
        this.f39839h = null;
        this.f39840i = (byte[]) f39830o.clone();
        this.f39841j = WireFormatNano.EMPTY_BYTES;
        this.f39842k = C2877p6.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C3084x6 c3084x6 = this.f39832a;
        if (c3084x6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c3084x6);
        }
        C2825n6 c2825n6 = this.f39833b;
        if (c2825n6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c2825n6);
        }
        if (!this.f39834c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f39834c);
        }
        int i4 = this.f39835d;
        if (i4 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i4);
        }
        C3032v6[] c3032v6Arr = this.f39836e;
        int i5 = 0;
        if (c3032v6Arr != null && c3032v6Arr.length > 0) {
            int i6 = 0;
            while (true) {
                C3032v6[] c3032v6Arr2 = this.f39836e;
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
        if (!this.f39837f.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.f39837f);
        }
        int i7 = this.f39838g;
        if (i7 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(7, i7);
        }
        C2954s6 c2954s6 = this.f39839h;
        if (c2954s6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(8, c2954s6);
        }
        if (!Arrays.equals(this.f39840i, f39830o)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f39840i);
        }
        if (!Arrays.equals(this.f39841j, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(10, this.f39841j);
        }
        C2877p6[] c2877p6Arr = this.f39842k;
        if (c2877p6Arr != null && c2877p6Arr.length > 0) {
            while (true) {
                C2877p6[] c2877p6Arr2 = this.f39842k;
                if (i5 >= c2877p6Arr2.length) {
                    break;
                }
                C2877p6 c2877p6 = c2877p6Arr2[i5];
                if (c2877p6 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(11, c2877p6) + computeSerializedSize;
                }
                i5++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C3084x6 c3084x6 = this.f39832a;
        if (c3084x6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c3084x6);
        }
        C2825n6 c2825n6 = this.f39833b;
        if (c2825n6 != null) {
            codedOutputByteBufferNano.writeMessage(2, c2825n6);
        }
        if (!this.f39834c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f39834c);
        }
        int i4 = this.f39835d;
        if (i4 != -1) {
            codedOutputByteBufferNano.writeInt32(4, i4);
        }
        C3032v6[] c3032v6Arr = this.f39836e;
        int i5 = 0;
        if (c3032v6Arr != null && c3032v6Arr.length > 0) {
            int i6 = 0;
            while (true) {
                C3032v6[] c3032v6Arr2 = this.f39836e;
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
        if (!this.f39837f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f39837f);
        }
        int i7 = this.f39838g;
        if (i7 != 0) {
            codedOutputByteBufferNano.writeInt32(7, i7);
        }
        C2954s6 c2954s6 = this.f39839h;
        if (c2954s6 != null) {
            codedOutputByteBufferNano.writeMessage(8, c2954s6);
        }
        if (!Arrays.equals(this.f39840i, f39830o)) {
            codedOutputByteBufferNano.writeBytes(9, this.f39840i);
        }
        if (!Arrays.equals(this.f39841j, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(10, this.f39841j);
        }
        C2877p6[] c2877p6Arr = this.f39842k;
        if (c2877p6Arr != null && c2877p6Arr.length > 0) {
            while (true) {
                C2877p6[] c2877p6Arr2 = this.f39842k;
                if (i5 >= c2877p6Arr2.length) {
                    break;
                }
                C2877p6 c2877p6 = c2877p6Arr2[i5];
                if (c2877p6 != null) {
                    codedOutputByteBufferNano.writeMessage(11, c2877p6);
                }
                i5++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C2980t6 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2980t6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2980t6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 10:
                    if (this.f39832a == null) {
                        this.f39832a = new C3084x6();
                    }
                    codedInputByteBufferNano.readMessage(this.f39832a);
                    break;
                case 18:
                    if (this.f39833b == null) {
                        this.f39833b = new C2825n6();
                    }
                    codedInputByteBufferNano.readMessage(this.f39833b);
                    break;
                case 26:
                    this.f39834c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != -1 && readInt32 != 0 && readInt32 != 1) {
                        break;
                    } else {
                        this.f39835d = readInt32;
                        break;
                    }
                case 42:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                    C3032v6[] c3032v6Arr = this.f39836e;
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
                    this.f39836e = c3032v6Arr2;
                    break;
                case 50:
                    this.f39837f = codedInputByteBufferNano.readString();
                    break;
                case IronSourceConstants.REGISTER_TRIGGER_FAIL /* 56 */:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != 0 && readInt322 != 1) {
                        break;
                    } else {
                        this.f39838g = readInt322;
                        break;
                    }
                case 66:
                    if (this.f39839h == null) {
                        this.f39839h = new C2954s6();
                    }
                    codedInputByteBufferNano.readMessage(this.f39839h);
                    break;
                case IronSourceConstants.TEST_SUITE_WEB_CONTROLLER_FAILED_TO_LOAD /* 74 */:
                    this.f39840i = codedInputByteBufferNano.readBytes();
                    break;
                case IronSourceConstants.TROUBLESHOOTING_AD_QUALITY_SDK_WAS_ALREADY_INITIALIZED_EVENT /* 82 */:
                    this.f39841j = codedInputByteBufferNano.readBytes();
                    break;
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                    C2877p6[] c2877p6Arr = this.f39842k;
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
                    this.f39842k = c2877p6Arr2;
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

    public static C2980t6 a(byte[] bArr) {
        return (C2980t6) MessageNano.mergeFrom(new C2980t6(), bArr);
    }
}
