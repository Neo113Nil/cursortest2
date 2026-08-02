package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.h6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0536h6 extends MessageNano {

    /* renamed from: g, reason: collision with root package name */
    public static volatile C0536h6[] f7429g;

    /* renamed from: a, reason: collision with root package name */
    public String f7430a;

    /* renamed from: b, reason: collision with root package name */
    public int f7431b;

    /* renamed from: c, reason: collision with root package name */
    public long f7432c;

    /* renamed from: d, reason: collision with root package name */
    public String f7433d;

    /* renamed from: e, reason: collision with root package name */
    public int f7434e;
    public C0510g6[] f;

    public C0536h6() {
        a();
    }

    public static C0536h6[] b() {
        if (f7429g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7429g == null) {
                        f7429g = new C0536h6[0];
                    }
                } finally {
                }
            }
        }
        return f7429g;
    }

    public final C0536h6 a() {
        this.f7430a = "";
        this.f7431b = 0;
        this.f7432c = 0L;
        this.f7433d = "";
        this.f7434e = 0;
        this.f = C0510g6.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSInt64Size = CodedOutputByteBufferNano.computeSInt64Size(3, this.f7432c) + CodedOutputByteBufferNano.computeSInt32Size(2, this.f7431b) + CodedOutputByteBufferNano.computeStringSize(1, this.f7430a) + super.computeSerializedSize();
        if (!this.f7433d.equals("")) {
            computeSInt64Size += CodedOutputByteBufferNano.computeStringSize(4, this.f7433d);
        }
        int i3 = this.f7434e;
        if (i3 != 0) {
            computeSInt64Size += CodedOutputByteBufferNano.computeUInt32Size(5, i3);
        }
        C0510g6[] c0510g6Arr = this.f;
        if (c0510g6Arr != null && c0510g6Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C0510g6[] c0510g6Arr2 = this.f;
                if (i4 >= c0510g6Arr2.length) {
                    break;
                }
                C0510g6 c0510g6 = c0510g6Arr2[i4];
                if (c0510g6 != null) {
                    computeSInt64Size = CodedOutputByteBufferNano.computeMessageSize(6, c0510g6) + computeSInt64Size;
                }
                i4++;
            }
        }
        return computeSInt64Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f7430a);
        codedOutputByteBufferNano.writeSInt32(2, this.f7431b);
        codedOutputByteBufferNano.writeSInt64(3, this.f7432c);
        if (!this.f7433d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f7433d);
        }
        int i3 = this.f7434e;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i3);
        }
        C0510g6[] c0510g6Arr = this.f;
        if (c0510g6Arr != null && c0510g6Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C0510g6[] c0510g6Arr2 = this.f;
                if (i4 >= c0510g6Arr2.length) {
                    break;
                }
                C0510g6 c0510g6 = c0510g6Arr2[i4];
                if (c0510g6 != null) {
                    codedOutputByteBufferNano.writeMessage(6, c0510g6);
                }
                i4++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0536h6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0536h6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0536h6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f7430a = codedInputByteBufferNano.readString();
            } else if (readTag == 16) {
                this.f7431b = codedInputByteBufferNano.readSInt32();
            } else if (readTag == 24) {
                this.f7432c = codedInputByteBufferNano.readSInt64();
            } else if (readTag == 34) {
                this.f7433d = codedInputByteBufferNano.readString();
            } else if (readTag == 40) {
                this.f7434e = codedInputByteBufferNano.readUInt32();
            } else if (readTag != 50) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                C0510g6[] c0510g6Arr = this.f;
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
                this.f = c0510g6Arr2;
            }
        }
        return this;
    }

    public static C0536h6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0536h6) MessageNano.mergeFrom(new C0536h6(), bArr);
    }
}
