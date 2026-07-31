package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.w6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3058w6 extends MessageNano {

    /* renamed from: g, reason: collision with root package name */
    public static volatile C3058w6[] f40009g;

    /* renamed from: a, reason: collision with root package name */
    public String f40010a;

    /* renamed from: b, reason: collision with root package name */
    public int f40011b;

    /* renamed from: c, reason: collision with root package name */
    public long f40012c;

    /* renamed from: d, reason: collision with root package name */
    public String f40013d;

    /* renamed from: e, reason: collision with root package name */
    public int f40014e;

    /* renamed from: f, reason: collision with root package name */
    public C3032v6[] f40015f;

    public C3058w6() {
        a();
    }

    public static C3058w6[] b() {
        if (f40009g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f40009g == null) {
                        f40009g = new C3058w6[0];
                    }
                } finally {
                }
            }
        }
        return f40009g;
    }

    public final C3058w6 a() {
        this.f40010a = "";
        this.f40011b = 0;
        this.f40012c = 0L;
        this.f40013d = "";
        this.f40014e = 0;
        this.f40015f = C3032v6.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSInt64Size = CodedOutputByteBufferNano.computeSInt64Size(3, this.f40012c) + CodedOutputByteBufferNano.computeSInt32Size(2, this.f40011b) + CodedOutputByteBufferNano.computeStringSize(1, this.f40010a) + super.computeSerializedSize();
        if (!this.f40013d.equals("")) {
            computeSInt64Size += CodedOutputByteBufferNano.computeStringSize(4, this.f40013d);
        }
        int i4 = this.f40014e;
        if (i4 != 0) {
            computeSInt64Size += CodedOutputByteBufferNano.computeUInt32Size(5, i4);
        }
        C3032v6[] c3032v6Arr = this.f40015f;
        if (c3032v6Arr != null && c3032v6Arr.length > 0) {
            int i5 = 0;
            while (true) {
                C3032v6[] c3032v6Arr2 = this.f40015f;
                if (i5 >= c3032v6Arr2.length) {
                    break;
                }
                C3032v6 c3032v6 = c3032v6Arr2[i5];
                if (c3032v6 != null) {
                    computeSInt64Size = CodedOutputByteBufferNano.computeMessageSize(6, c3032v6) + computeSInt64Size;
                }
                i5++;
            }
        }
        return computeSInt64Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeString(1, this.f40010a);
        codedOutputByteBufferNano.writeSInt32(2, this.f40011b);
        codedOutputByteBufferNano.writeSInt64(3, this.f40012c);
        if (!this.f40013d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f40013d);
        }
        int i4 = this.f40014e;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i4);
        }
        C3032v6[] c3032v6Arr = this.f40015f;
        if (c3032v6Arr != null && c3032v6Arr.length > 0) {
            int i5 = 0;
            while (true) {
                C3032v6[] c3032v6Arr2 = this.f40015f;
                if (i5 >= c3032v6Arr2.length) {
                    break;
                }
                C3032v6 c3032v6 = c3032v6Arr2[i5];
                if (c3032v6 != null) {
                    codedOutputByteBufferNano.writeMessage(6, c3032v6);
                }
                i5++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C3058w6 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C3058w6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3058w6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f40010a = codedInputByteBufferNano.readString();
            } else if (readTag == 16) {
                this.f40011b = codedInputByteBufferNano.readSInt32();
            } else if (readTag == 24) {
                this.f40012c = codedInputByteBufferNano.readSInt64();
            } else if (readTag == 34) {
                this.f40013d = codedInputByteBufferNano.readString();
            } else if (readTag == 40) {
                this.f40014e = codedInputByteBufferNano.readUInt32();
            } else if (readTag != 50) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                C3032v6[] c3032v6Arr = this.f40015f;
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
                this.f40015f = c3032v6Arr2;
            }
        }
        return this;
    }

    public static C3058w6 a(byte[] bArr) {
        return (C3058w6) MessageNano.mergeFrom(new C3058w6(), bArr);
    }
}
