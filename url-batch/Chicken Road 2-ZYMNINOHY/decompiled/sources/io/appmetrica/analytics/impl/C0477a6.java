package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.a6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0477a6 extends MessageNano {

    /* renamed from: g, reason: collision with root package name */
    public static volatile C0477a6[] f11423g;

    /* renamed from: a, reason: collision with root package name */
    public String f11424a;

    /* renamed from: b, reason: collision with root package name */
    public int f11425b;

    /* renamed from: c, reason: collision with root package name */
    public long f11426c;

    /* renamed from: d, reason: collision with root package name */
    public String f11427d;

    /* renamed from: e, reason: collision with root package name */
    public int f11428e;

    /* renamed from: f, reason: collision with root package name */
    public Z5[] f11429f;

    public C0477a6() {
        a();
    }

    public static C0477a6[] b() {
        if (f11423g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f11423g == null) {
                        f11423g = new C0477a6[0];
                    }
                } finally {
                }
            }
        }
        return f11423g;
    }

    public final C0477a6 a() {
        this.f11424a = "";
        this.f11425b = 0;
        this.f11426c = 0L;
        this.f11427d = "";
        this.f11428e = 0;
        this.f11429f = Z5.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSInt64Size = CodedOutputByteBufferNano.computeSInt64Size(3, this.f11426c) + CodedOutputByteBufferNano.computeSInt32Size(2, this.f11425b) + CodedOutputByteBufferNano.computeStringSize(1, this.f11424a) + super.computeSerializedSize();
        if (!this.f11427d.equals("")) {
            computeSInt64Size += CodedOutputByteBufferNano.computeStringSize(4, this.f11427d);
        }
        int i4 = this.f11428e;
        if (i4 != 0) {
            computeSInt64Size += CodedOutputByteBufferNano.computeUInt32Size(5, i4);
        }
        Z5[] z5Arr = this.f11429f;
        if (z5Arr != null && z5Arr.length > 0) {
            int i5 = 0;
            while (true) {
                Z5[] z5Arr2 = this.f11429f;
                if (i5 >= z5Arr2.length) {
                    break;
                }
                Z5 z5 = z5Arr2[i5];
                if (z5 != null) {
                    computeSInt64Size = CodedOutputByteBufferNano.computeMessageSize(6, z5) + computeSInt64Size;
                }
                i5++;
            }
        }
        return computeSInt64Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f11424a);
        codedOutputByteBufferNano.writeSInt32(2, this.f11425b);
        codedOutputByteBufferNano.writeSInt64(3, this.f11426c);
        if (!this.f11427d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f11427d);
        }
        int i4 = this.f11428e;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i4);
        }
        Z5[] z5Arr = this.f11429f;
        if (z5Arr != null && z5Arr.length > 0) {
            int i5 = 0;
            while (true) {
                Z5[] z5Arr2 = this.f11429f;
                if (i5 >= z5Arr2.length) {
                    break;
                }
                Z5 z5 = z5Arr2[i5];
                if (z5 != null) {
                    codedOutputByteBufferNano.writeMessage(6, z5);
                }
                i5++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0477a6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0477a6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0477a6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f11424a = codedInputByteBufferNano.readString();
            } else if (readTag == 16) {
                this.f11425b = codedInputByteBufferNano.readSInt32();
            } else if (readTag == 24) {
                this.f11426c = codedInputByteBufferNano.readSInt64();
            } else if (readTag == 34) {
                this.f11427d = codedInputByteBufferNano.readString();
            } else if (readTag == 40) {
                this.f11428e = codedInputByteBufferNano.readUInt32();
            } else if (readTag != 50) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                Z5[] z5Arr = this.f11429f;
                int length = z5Arr == null ? 0 : z5Arr.length;
                int i4 = repeatedFieldArrayLength + length;
                Z5[] z5Arr2 = new Z5[i4];
                if (length != 0) {
                    System.arraycopy(z5Arr, 0, z5Arr2, 0, length);
                }
                while (length < i4 - 1) {
                    Z5 z5 = new Z5();
                    z5Arr2[length] = z5;
                    codedInputByteBufferNano.readMessage(z5);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                Z5 z52 = new Z5();
                z5Arr2[length] = z52;
                codedInputByteBufferNano.readMessage(z52);
                this.f11429f = z5Arr2;
            }
        }
        return this;
    }

    public static C0477a6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0477a6) MessageNano.mergeFrom(new C0477a6(), bArr);
    }
}
