package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.rm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0932rm extends MessageNano {

    /* renamed from: g, reason: collision with root package name */
    public static volatile C0932rm[] f12684g;

    /* renamed from: a, reason: collision with root package name */
    public boolean f12685a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12686b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12687c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12688d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12689e;

    /* renamed from: f, reason: collision with root package name */
    public int f12690f;

    public C0932rm() {
        a();
    }

    public static C0932rm[] b() {
        if (f12684g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f12684g == null) {
                        f12684g = new C0932rm[0];
                    }
                } finally {
                }
            }
        }
        return f12684g;
    }

    public final C0932rm a() {
        this.f12685a = false;
        this.f12686b = false;
        this.f12687c = false;
        this.f12688d = false;
        this.f12689e = false;
        this.f12690f = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeBoolSize = CodedOutputByteBufferNano.computeBoolSize(4, this.f12688d) + CodedOutputByteBufferNano.computeBoolSize(3, this.f12687c) + CodedOutputByteBufferNano.computeBoolSize(2, this.f12686b) + CodedOutputByteBufferNano.computeBoolSize(1, this.f12685a) + super.computeSerializedSize();
        boolean z = this.f12689e;
        if (z) {
            computeBoolSize += CodedOutputByteBufferNano.computeBoolSize(5, z);
        }
        int i4 = this.f12690f;
        return i4 != -1 ? CodedOutputByteBufferNano.computeInt32Size(6, i4) + computeBoolSize : computeBoolSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBool(1, this.f12685a);
        codedOutputByteBufferNano.writeBool(2, this.f12686b);
        codedOutputByteBufferNano.writeBool(3, this.f12687c);
        codedOutputByteBufferNano.writeBool(4, this.f12688d);
        boolean z = this.f12689e;
        if (z) {
            codedOutputByteBufferNano.writeBool(5, z);
        }
        int i4 = this.f12690f;
        if (i4 != -1) {
            codedOutputByteBufferNano.writeInt32(6, i4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0932rm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0932rm().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0932rm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f12685a = codedInputByteBufferNano.readBool();
            } else if (readTag == 16) {
                this.f12686b = codedInputByteBufferNano.readBool();
            } else if (readTag == 24) {
                this.f12687c = codedInputByteBufferNano.readBool();
            } else if (readTag == 32) {
                this.f12688d = codedInputByteBufferNano.readBool();
            } else if (readTag == 40) {
                this.f12689e = codedInputByteBufferNano.readBool();
            } else if (readTag != 48) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == -1 || readInt32 == 0 || readInt32 == 1) {
                    this.f12690f = readInt32;
                }
            }
        }
        return this;
    }

    public static C0932rm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0932rm) MessageNano.mergeFrom(new C0932rm(), bArr);
    }
}
