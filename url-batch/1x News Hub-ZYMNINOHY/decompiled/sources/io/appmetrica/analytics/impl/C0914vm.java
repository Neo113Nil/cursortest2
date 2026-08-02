package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.vm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0914vm extends MessageNano {

    /* renamed from: g, reason: collision with root package name */
    public static volatile C0914vm[] f8530g;

    /* renamed from: a, reason: collision with root package name */
    public boolean f8531a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8532b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8533c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8534d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8535e;
    public int f;

    public C0914vm() {
        a();
    }

    public static C0914vm[] b() {
        if (f8530g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8530g == null) {
                        f8530g = new C0914vm[0];
                    }
                } finally {
                }
            }
        }
        return f8530g;
    }

    public final C0914vm a() {
        this.f8531a = false;
        this.f8532b = false;
        this.f8533c = false;
        this.f8534d = false;
        this.f8535e = false;
        this.f = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeBoolSize = CodedOutputByteBufferNano.computeBoolSize(4, this.f8534d) + CodedOutputByteBufferNano.computeBoolSize(3, this.f8533c) + CodedOutputByteBufferNano.computeBoolSize(2, this.f8532b) + CodedOutputByteBufferNano.computeBoolSize(1, this.f8531a) + super.computeSerializedSize();
        boolean z = this.f8535e;
        if (z) {
            computeBoolSize += CodedOutputByteBufferNano.computeBoolSize(5, z);
        }
        int i3 = this.f;
        return i3 != -1 ? CodedOutputByteBufferNano.computeInt32Size(6, i3) + computeBoolSize : computeBoolSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBool(1, this.f8531a);
        codedOutputByteBufferNano.writeBool(2, this.f8532b);
        codedOutputByteBufferNano.writeBool(3, this.f8533c);
        codedOutputByteBufferNano.writeBool(4, this.f8534d);
        boolean z = this.f8535e;
        if (z) {
            codedOutputByteBufferNano.writeBool(5, z);
        }
        int i3 = this.f;
        if (i3 != -1) {
            codedOutputByteBufferNano.writeInt32(6, i3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0914vm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0914vm().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0914vm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f8531a = codedInputByteBufferNano.readBool();
            } else if (readTag == 16) {
                this.f8532b = codedInputByteBufferNano.readBool();
            } else if (readTag == 24) {
                this.f8533c = codedInputByteBufferNano.readBool();
            } else if (readTag == 32) {
                this.f8534d = codedInputByteBufferNano.readBool();
            } else if (readTag == 40) {
                this.f8535e = codedInputByteBufferNano.readBool();
            } else if (readTag != 48) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == -1 || readInt32 == 0 || readInt32 == 1) {
                    this.f = readInt32;
                }
            }
        }
        return this;
    }

    public static C0914vm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0914vm) MessageNano.mergeFrom(new C0914vm(), bArr);
    }
}
