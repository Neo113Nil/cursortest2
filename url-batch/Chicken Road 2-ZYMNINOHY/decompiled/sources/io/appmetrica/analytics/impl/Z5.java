package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class Z5 extends MessageNano {

    /* renamed from: g, reason: collision with root package name */
    public static volatile Z5[] f11339g;

    /* renamed from: a, reason: collision with root package name */
    public String f11340a;

    /* renamed from: b, reason: collision with root package name */
    public String f11341b;

    /* renamed from: c, reason: collision with root package name */
    public int f11342c;

    /* renamed from: d, reason: collision with root package name */
    public String f11343d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11344e;

    /* renamed from: f, reason: collision with root package name */
    public int f11345f;

    public Z5() {
        a();
    }

    public static Z5[] b() {
        if (f11339g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f11339g == null) {
                        f11339g = new Z5[0];
                    }
                } finally {
                }
            }
        }
        return f11339g;
    }

    public final Z5 a() {
        this.f11340a = "";
        this.f11341b = "";
        this.f11342c = -1;
        this.f11343d = "";
        this.f11344e = false;
        this.f11345f = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f11340a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f11340a);
        }
        if (!this.f11341b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f11341b);
        }
        int i4 = this.f11342c;
        if (i4 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeSInt32Size(3, i4);
        }
        if (!this.f11343d.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.f11343d);
        }
        boolean z = this.f11344e;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(5, z);
        }
        int i5 = this.f11345f;
        return i5 != -1 ? CodedOutputByteBufferNano.computeSInt32Size(6, i5) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f11340a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f11340a);
        }
        if (!this.f11341b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f11341b);
        }
        int i4 = this.f11342c;
        if (i4 != -1) {
            codedOutputByteBufferNano.writeSInt32(3, i4);
        }
        if (!this.f11343d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f11343d);
        }
        boolean z = this.f11344e;
        if (z) {
            codedOutputByteBufferNano.writeBool(5, z);
        }
        int i5 = this.f11345f;
        if (i5 != -1) {
            codedOutputByteBufferNano.writeSInt32(6, i5);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Z5 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Z5().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Z5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f11340a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.f11341b = codedInputByteBufferNano.readString();
            } else if (readTag == 24) {
                this.f11342c = codedInputByteBufferNano.readSInt32();
            } else if (readTag == 34) {
                this.f11343d = codedInputByteBufferNano.readString();
            } else if (readTag == 40) {
                this.f11344e = codedInputByteBufferNano.readBool();
            } else if (readTag != 48) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f11345f = codedInputByteBufferNano.readSInt32();
            }
        }
        return this;
    }

    public static Z5 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Z5) MessageNano.mergeFrom(new Z5(), bArr);
    }
}
