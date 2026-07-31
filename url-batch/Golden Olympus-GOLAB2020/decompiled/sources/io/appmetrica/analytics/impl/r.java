package io.appmetrica.analytics.impl;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class r extends MessageNano {

    /* renamed from: l, reason: collision with root package name */
    public static final int f39671l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f39672m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f39673n = 2;

    /* renamed from: o, reason: collision with root package name */
    public static final int f39674o = 3;

    /* renamed from: p, reason: collision with root package name */
    public static final int f39675p = 4;

    /* renamed from: q, reason: collision with root package name */
    public static final int f39676q = 5;

    /* renamed from: r, reason: collision with root package name */
    public static final int f39677r = 6;

    /* renamed from: s, reason: collision with root package name */
    public static final int f39678s = 7;

    /* renamed from: t, reason: collision with root package name */
    public static volatile r[] f39679t;

    /* renamed from: u, reason: collision with root package name */
    public static byte[] f39680u;

    /* renamed from: v, reason: collision with root package name */
    public static volatile boolean f39681v;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f39682a;

    /* renamed from: b, reason: collision with root package name */
    public C2896q f39683b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f39684c;

    /* renamed from: d, reason: collision with root package name */
    public int f39685d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f39686e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f39687f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f39688g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f39689h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f39690i;

    /* renamed from: j, reason: collision with root package name */
    public byte[] f39691j;

    /* renamed from: k, reason: collision with root package name */
    public byte[] f39692k;

    public r() {
        if (!f39681v) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!f39681v) {
                        f39680u = InternalNano.bytesDefaultValue("manual");
                        f39681v = true;
                    }
                } finally {
                }
            }
        }
        a();
    }

    public static r[] b() {
        if (f39679t == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f39679t == null) {
                        f39679t = new r[0];
                    }
                } finally {
                }
            }
        }
        return f39679t;
    }

    public final r a() {
        this.f39682a = (byte[]) f39680u.clone();
        this.f39683b = null;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f39684c = bArr;
        this.f39685d = 0;
        this.f39686e = bArr;
        this.f39687f = bArr;
        this.f39688g = bArr;
        this.f39689h = bArr;
        this.f39690i = bArr;
        this.f39691j = bArr;
        this.f39692k = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f39682a, f39680u)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f39682a);
        }
        C2896q c2896q = this.f39683b;
        if (c2896q != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c2896q);
        }
        byte[] bArr = this.f39684c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.f39684c);
        }
        int i4 = this.f39685d;
        if (i4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i4);
        }
        if (!Arrays.equals(this.f39686e, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f39686e);
        }
        if (!Arrays.equals(this.f39687f, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(6, this.f39687f);
        }
        if (!Arrays.equals(this.f39688g, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(7, this.f39688g);
        }
        if (!Arrays.equals(this.f39689h, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(8, this.f39689h);
        }
        if (!Arrays.equals(this.f39690i, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f39690i);
        }
        if (!Arrays.equals(this.f39691j, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(10, this.f39691j);
        }
        return !Arrays.equals(this.f39692k, bArr2) ? CodedOutputByteBufferNano.computeBytesSize(11, this.f39692k) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!Arrays.equals(this.f39682a, f39680u)) {
            codedOutputByteBufferNano.writeBytes(1, this.f39682a);
        }
        C2896q c2896q = this.f39683b;
        if (c2896q != null) {
            codedOutputByteBufferNano.writeMessage(2, c2896q);
        }
        byte[] bArr = this.f39684c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(3, this.f39684c);
        }
        int i4 = this.f39685d;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeInt32(4, i4);
        }
        if (!Arrays.equals(this.f39686e, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f39686e);
        }
        if (!Arrays.equals(this.f39687f, bArr2)) {
            codedOutputByteBufferNano.writeBytes(6, this.f39687f);
        }
        if (!Arrays.equals(this.f39688g, bArr2)) {
            codedOutputByteBufferNano.writeBytes(7, this.f39688g);
        }
        if (!Arrays.equals(this.f39689h, bArr2)) {
            codedOutputByteBufferNano.writeBytes(8, this.f39689h);
        }
        if (!Arrays.equals(this.f39690i, bArr2)) {
            codedOutputByteBufferNano.writeBytes(9, this.f39690i);
        }
        if (!Arrays.equals(this.f39691j, bArr2)) {
            codedOutputByteBufferNano.writeBytes(10, this.f39691j);
        }
        if (!Arrays.equals(this.f39692k, bArr2)) {
            codedOutputByteBufferNano.writeBytes(11, this.f39692k);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static r b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new r().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final r mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 10:
                    this.f39682a = codedInputByteBufferNano.readBytes();
                    break;
                case 18:
                    if (this.f39683b == null) {
                        this.f39683b = new C2896q();
                    }
                    codedInputByteBufferNano.readMessage(this.f39683b);
                    break;
                case 26:
                    this.f39684c = codedInputByteBufferNano.readBytes();
                    break;
                case 32:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    switch (readInt32) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            this.f39685d = readInt32;
                            break;
                    }
                case 42:
                    this.f39686e = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    this.f39687f = codedInputByteBufferNano.readBytes();
                    break;
                case 58:
                    this.f39688g = codedInputByteBufferNano.readBytes();
                    break;
                case 66:
                    this.f39689h = codedInputByteBufferNano.readBytes();
                    break;
                case IronSourceConstants.TEST_SUITE_WEB_CONTROLLER_FAILED_TO_LOAD /* 74 */:
                    this.f39690i = codedInputByteBufferNano.readBytes();
                    break;
                case IronSourceConstants.TROUBLESHOOTING_AD_QUALITY_SDK_WAS_ALREADY_INITIALIZED_EVENT /* 82 */:
                    this.f39691j = codedInputByteBufferNano.readBytes();
                    break;
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    this.f39692k = codedInputByteBufferNano.readBytes();
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

    public static r a(byte[] bArr) {
        return (r) MessageNano.mergeFrom(new r(), bArr);
    }
}
