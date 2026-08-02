package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.g6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0510g6 extends MessageNano {

    /* renamed from: g, reason: collision with root package name */
    public static volatile C0510g6[] f7357g;

    /* renamed from: a, reason: collision with root package name */
    public String f7358a;

    /* renamed from: b, reason: collision with root package name */
    public String f7359b;

    /* renamed from: c, reason: collision with root package name */
    public int f7360c;

    /* renamed from: d, reason: collision with root package name */
    public String f7361d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7362e;
    public int f;

    public C0510g6() {
        a();
    }

    public static C0510g6[] b() {
        if (f7357g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7357g == null) {
                        f7357g = new C0510g6[0];
                    }
                } finally {
                }
            }
        }
        return f7357g;
    }

    public final C0510g6 a() {
        this.f7358a = "";
        this.f7359b = "";
        this.f7360c = -1;
        this.f7361d = "";
        this.f7362e = false;
        this.f = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f7358a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f7358a);
        }
        if (!this.f7359b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f7359b);
        }
        int i3 = this.f7360c;
        if (i3 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeSInt32Size(3, i3);
        }
        if (!this.f7361d.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.f7361d);
        }
        boolean z = this.f7362e;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(5, z);
        }
        int i4 = this.f;
        return i4 != -1 ? CodedOutputByteBufferNano.computeSInt32Size(6, i4) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f7358a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f7358a);
        }
        if (!this.f7359b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f7359b);
        }
        int i3 = this.f7360c;
        if (i3 != -1) {
            codedOutputByteBufferNano.writeSInt32(3, i3);
        }
        if (!this.f7361d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f7361d);
        }
        boolean z = this.f7362e;
        if (z) {
            codedOutputByteBufferNano.writeBool(5, z);
        }
        int i4 = this.f;
        if (i4 != -1) {
            codedOutputByteBufferNano.writeSInt32(6, i4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0510g6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0510g6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0510g6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f7358a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.f7359b = codedInputByteBufferNano.readString();
            } else if (readTag == 24) {
                this.f7360c = codedInputByteBufferNano.readSInt32();
            } else if (readTag == 34) {
                this.f7361d = codedInputByteBufferNano.readString();
            } else if (readTag == 40) {
                this.f7362e = codedInputByteBufferNano.readBool();
            } else if (readTag != 48) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f = codedInputByteBufferNano.readSInt32();
            }
        }
        return this;
    }

    public static C0510g6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0510g6) MessageNano.mergeFrom(new C0510g6(), bArr);
    }
}
