package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.qf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0778qf extends MessageNano {
    public static volatile C0778qf[] f;

    /* renamed from: a, reason: collision with root package name */
    public String f8164a;

    /* renamed from: b, reason: collision with root package name */
    public String f8165b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8166c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8167d;

    /* renamed from: e, reason: collision with root package name */
    public int f8168e;

    public C0778qf() {
        a();
    }

    public static C0778qf[] b() {
        if (f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f == null) {
                        f = new C0778qf[0];
                    }
                } finally {
                }
            }
        }
        return f;
    }

    public final C0778qf a() {
        this.f8164a = "";
        this.f8165b = "";
        this.f8166c = false;
        this.f8167d = false;
        this.f8168e = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f8164a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f8164a);
        }
        if (!this.f8165b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f8165b);
        }
        boolean z = this.f8166c;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(3, z);
        }
        boolean z2 = this.f8167d;
        if (z2) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(4, z2);
        }
        return CodedOutputByteBufferNano.computeInt32Size(5, this.f8168e) + computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f8164a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f8164a);
        }
        if (!this.f8165b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f8165b);
        }
        boolean z = this.f8166c;
        if (z) {
            codedOutputByteBufferNano.writeBool(3, z);
        }
        boolean z2 = this.f8167d;
        if (z2) {
            codedOutputByteBufferNano.writeBool(4, z2);
        }
        codedOutputByteBufferNano.writeInt32(5, this.f8168e);
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0778qf b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0778qf().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0778qf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f8164a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.f8165b = codedInputByteBufferNano.readString();
            } else if (readTag == 24) {
                this.f8166c = codedInputByteBufferNano.readBool();
            } else if (readTag == 32) {
                this.f8167d = codedInputByteBufferNano.readBool();
            } else if (readTag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.f8168e = readInt32;
                }
            }
        }
        return this;
    }

    public static C0778qf a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0778qf) MessageNano.mergeFrom(new C0778qf(), bArr);
    }
}
