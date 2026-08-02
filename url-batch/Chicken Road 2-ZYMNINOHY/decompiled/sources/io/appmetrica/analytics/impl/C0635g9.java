package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.g9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0635g9 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static final int f11913d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f11914e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f11915f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final int f11916g = 3;

    /* renamed from: h, reason: collision with root package name */
    public static final int f11917h = 4;

    /* renamed from: i, reason: collision with root package name */
    public static final int f11918i = 5;

    /* renamed from: j, reason: collision with root package name */
    public static final int f11919j = 6;

    /* renamed from: k, reason: collision with root package name */
    public static final int f11920k = 7;

    /* renamed from: l, reason: collision with root package name */
    public static final int f11921l = 8;

    /* renamed from: m, reason: collision with root package name */
    public static final int f11922m = 9;
    public static final int n = 10;
    public static final int o = 11;

    /* renamed from: p, reason: collision with root package name */
    public static final int f11923p = 12;

    /* renamed from: q, reason: collision with root package name */
    public static volatile C0635g9[] f11924q;

    /* renamed from: a, reason: collision with root package name */
    public long f11925a;

    /* renamed from: b, reason: collision with root package name */
    public C0609f9 f11926b;

    /* renamed from: c, reason: collision with root package name */
    public C0583e9[] f11927c;

    public C0635g9() {
        a();
    }

    public static C0635g9[] b() {
        if (f11924q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f11924q == null) {
                        f11924q = new C0635g9[0];
                    }
                } finally {
                }
            }
        }
        return f11924q;
    }

    public final C0635g9 a() {
        this.f11925a = 0L;
        this.f11926b = null;
        this.f11927c = C0583e9.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeUInt64Size = CodedOutputByteBufferNano.computeUInt64Size(1, this.f11925a) + super.computeSerializedSize();
        C0609f9 c0609f9 = this.f11926b;
        if (c0609f9 != null) {
            computeUInt64Size += CodedOutputByteBufferNano.computeMessageSize(2, c0609f9);
        }
        C0583e9[] c0583e9Arr = this.f11927c;
        if (c0583e9Arr != null && c0583e9Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C0583e9[] c0583e9Arr2 = this.f11927c;
                if (i4 >= c0583e9Arr2.length) {
                    break;
                }
                C0583e9 c0583e9 = c0583e9Arr2[i4];
                if (c0583e9 != null) {
                    computeUInt64Size = CodedOutputByteBufferNano.computeMessageSize(3, c0583e9) + computeUInt64Size;
                }
                i4++;
            }
        }
        return computeUInt64Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeUInt64(1, this.f11925a);
        C0609f9 c0609f9 = this.f11926b;
        if (c0609f9 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0609f9);
        }
        C0583e9[] c0583e9Arr = this.f11927c;
        if (c0583e9Arr != null && c0583e9Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C0583e9[] c0583e9Arr2 = this.f11927c;
                if (i4 >= c0583e9Arr2.length) {
                    break;
                }
                C0583e9 c0583e9 = c0583e9Arr2[i4];
                if (c0583e9 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c0583e9);
                }
                i4++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0635g9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f11925a = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 18) {
                if (this.f11926b == null) {
                    this.f11926b = new C0609f9();
                }
                codedInputByteBufferNano.readMessage(this.f11926b);
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C0583e9[] c0583e9Arr = this.f11927c;
                int length = c0583e9Arr == null ? 0 : c0583e9Arr.length;
                int i4 = repeatedFieldArrayLength + length;
                C0583e9[] c0583e9Arr2 = new C0583e9[i4];
                if (length != 0) {
                    System.arraycopy(c0583e9Arr, 0, c0583e9Arr2, 0, length);
                }
                while (length < i4 - 1) {
                    C0583e9 c0583e9 = new C0583e9();
                    c0583e9Arr2[length] = c0583e9;
                    codedInputByteBufferNano.readMessage(c0583e9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0583e9 c0583e92 = new C0583e9();
                c0583e9Arr2[length] = c0583e92;
                codedInputByteBufferNano.readMessage(c0583e92);
                this.f11927c = c0583e9Arr2;
            }
        }
        return this;
    }

    public static C0635g9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0635g9().mergeFrom(codedInputByteBufferNano);
    }

    public static C0635g9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0635g9) MessageNano.mergeFrom(new C0635g9(), bArr);
    }
}
