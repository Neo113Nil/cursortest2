package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.v6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3032v6 extends MessageNano {

    /* renamed from: g, reason: collision with root package name */
    public static volatile C3032v6[] f39961g;

    /* renamed from: a, reason: collision with root package name */
    public String f39962a;

    /* renamed from: b, reason: collision with root package name */
    public String f39963b;

    /* renamed from: c, reason: collision with root package name */
    public int f39964c;

    /* renamed from: d, reason: collision with root package name */
    public String f39965d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f39966e;

    /* renamed from: f, reason: collision with root package name */
    public int f39967f;

    public C3032v6() {
        a();
    }

    public static C3032v6[] b() {
        if (f39961g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f39961g == null) {
                        f39961g = new C3032v6[0];
                    }
                } finally {
                }
            }
        }
        return f39961g;
    }

    public final C3032v6 a() {
        this.f39962a = "";
        this.f39963b = "";
        this.f39964c = -1;
        this.f39965d = "";
        this.f39966e = false;
        this.f39967f = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f39962a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f39962a);
        }
        if (!this.f39963b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f39963b);
        }
        int i4 = this.f39964c;
        if (i4 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeSInt32Size(3, i4);
        }
        if (!this.f39965d.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.f39965d);
        }
        boolean z4 = this.f39966e;
        if (z4) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(5, z4);
        }
        int i5 = this.f39967f;
        return i5 != -1 ? CodedOutputByteBufferNano.computeSInt32Size(6, i5) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f39962a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f39962a);
        }
        if (!this.f39963b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f39963b);
        }
        int i4 = this.f39964c;
        if (i4 != -1) {
            codedOutputByteBufferNano.writeSInt32(3, i4);
        }
        if (!this.f39965d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f39965d);
        }
        boolean z4 = this.f39966e;
        if (z4) {
            codedOutputByteBufferNano.writeBool(5, z4);
        }
        int i5 = this.f39967f;
        if (i5 != -1) {
            codedOutputByteBufferNano.writeSInt32(6, i5);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C3032v6 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C3032v6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3032v6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f39962a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.f39963b = codedInputByteBufferNano.readString();
            } else if (readTag == 24) {
                this.f39964c = codedInputByteBufferNano.readSInt32();
            } else if (readTag == 34) {
                this.f39965d = codedInputByteBufferNano.readString();
            } else if (readTag == 40) {
                this.f39966e = codedInputByteBufferNano.readBool();
            } else if (readTag != 48) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f39967f = codedInputByteBufferNano.readSInt32();
            }
        }
        return this;
    }

    public static C3032v6 a(byte[] bArr) {
        return (C3032v6) MessageNano.mergeFrom(new C3032v6(), bArr);
    }
}
