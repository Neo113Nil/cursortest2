package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.n6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2825n6 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C2825n6[] f39489d;

    /* renamed from: a, reason: collision with root package name */
    public C3058w6 f39490a;

    /* renamed from: b, reason: collision with root package name */
    public C3058w6[] f39491b;

    /* renamed from: c, reason: collision with root package name */
    public String f39492c;

    public C2825n6() {
        a();
    }

    public static C2825n6[] b() {
        if (f39489d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f39489d == null) {
                        f39489d = new C2825n6[0];
                    }
                } finally {
                }
            }
        }
        return f39489d;
    }

    public final C2825n6 a() {
        this.f39490a = null;
        this.f39491b = C3058w6.b();
        this.f39492c = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C3058w6 c3058w6 = this.f39490a;
        if (c3058w6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c3058w6);
        }
        C3058w6[] c3058w6Arr = this.f39491b;
        if (c3058w6Arr != null && c3058w6Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C3058w6[] c3058w6Arr2 = this.f39491b;
                if (i4 >= c3058w6Arr2.length) {
                    break;
                }
                C3058w6 c3058w62 = c3058w6Arr2[i4];
                if (c3058w62 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c3058w62) + computeSerializedSize;
                }
                i4++;
            }
        }
        return !this.f39492c.equals("") ? CodedOutputByteBufferNano.computeStringSize(3, this.f39492c) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C3058w6 c3058w6 = this.f39490a;
        if (c3058w6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c3058w6);
        }
        C3058w6[] c3058w6Arr = this.f39491b;
        if (c3058w6Arr != null && c3058w6Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C3058w6[] c3058w6Arr2 = this.f39491b;
                if (i4 >= c3058w6Arr2.length) {
                    break;
                }
                C3058w6 c3058w62 = c3058w6Arr2[i4];
                if (c3058w62 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c3058w62);
                }
                i4++;
            }
        }
        if (!this.f39492c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f39492c);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2825n6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f39490a == null) {
                    this.f39490a = new C3058w6();
                }
                codedInputByteBufferNano.readMessage(this.f39490a);
            } else if (readTag == 18) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C3058w6[] c3058w6Arr = this.f39491b;
                int length = c3058w6Arr == null ? 0 : c3058w6Arr.length;
                int i4 = repeatedFieldArrayLength + length;
                C3058w6[] c3058w6Arr2 = new C3058w6[i4];
                if (length != 0) {
                    System.arraycopy(c3058w6Arr, 0, c3058w6Arr2, 0, length);
                }
                while (length < i4 - 1) {
                    C3058w6 c3058w6 = new C3058w6();
                    c3058w6Arr2[length] = c3058w6;
                    codedInputByteBufferNano.readMessage(c3058w6);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C3058w6 c3058w62 = new C3058w6();
                c3058w6Arr2[length] = c3058w62;
                codedInputByteBufferNano.readMessage(c3058w62);
                this.f39491b = c3058w6Arr2;
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f39492c = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static C2825n6 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2825n6().mergeFrom(codedInputByteBufferNano);
    }

    public static C2825n6 a(byte[] bArr) {
        return (C2825n6) MessageNano.mergeFrom(new C2825n6(), bArr);
    }
}
