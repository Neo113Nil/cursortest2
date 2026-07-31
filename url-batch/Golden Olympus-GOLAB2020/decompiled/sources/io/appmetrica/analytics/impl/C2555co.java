package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.co, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2555co extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static final int f38796e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f38797f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f38798g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final int f38799h = 3;

    /* renamed from: i, reason: collision with root package name */
    public static volatile C2555co[] f38800i;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f38801a;

    /* renamed from: b, reason: collision with root package name */
    public int f38802b;

    /* renamed from: c, reason: collision with root package name */
    public Cdo f38803c;

    /* renamed from: d, reason: collision with root package name */
    public C2608eo f38804d;

    public C2555co() {
        a();
    }

    public static C2555co[] b() {
        if (f38800i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f38800i == null) {
                        f38800i = new C2555co[0];
                    }
                } finally {
                }
            }
        }
        return f38800i;
    }

    public final C2555co a() {
        this.f38801a = WireFormatNano.EMPTY_BYTES;
        this.f38802b = 0;
        this.f38803c = null;
        this.f38804d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeInt32Size = CodedOutputByteBufferNano.computeInt32Size(2, this.f38802b) + CodedOutputByteBufferNano.computeBytesSize(1, this.f38801a) + super.computeSerializedSize();
        Cdo cdo = this.f38803c;
        if (cdo != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(3, cdo);
        }
        C2608eo c2608eo = this.f38804d;
        return c2608eo != null ? CodedOutputByteBufferNano.computeMessageSize(4, c2608eo) + computeInt32Size : computeInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeBytes(1, this.f38801a);
        codedOutputByteBufferNano.writeInt32(2, this.f38802b);
        Cdo cdo = this.f38803c;
        if (cdo != null) {
            codedOutputByteBufferNano.writeMessage(3, cdo);
        }
        C2608eo c2608eo = this.f38804d;
        if (c2608eo != null) {
            codedOutputByteBufferNano.writeMessage(4, c2608eo);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2555co mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f38801a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 16) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.f38802b = readInt32;
                }
            } else if (readTag == 26) {
                if (this.f38803c == null) {
                    this.f38803c = new Cdo();
                }
                codedInputByteBufferNano.readMessage(this.f38803c);
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f38804d == null) {
                    this.f38804d = new C2608eo();
                }
                codedInputByteBufferNano.readMessage(this.f38804d);
            }
        }
        return this;
    }

    public static C2555co b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C2555co().mergeFrom(codedInputByteBufferNano);
    }

    public static C2555co a(byte[] bArr) {
        return (C2555co) MessageNano.mergeFrom(new C2555co(), bArr);
    }
}
