package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.ho, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0554ho extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static final int f7483e = 0;
    public static final int f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f7484g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final int f7485h = 3;

    /* renamed from: i, reason: collision with root package name */
    public static volatile C0554ho[] f7486i;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f7487a;

    /* renamed from: b, reason: collision with root package name */
    public int f7488b;

    /* renamed from: c, reason: collision with root package name */
    public C0579io f7489c;

    /* renamed from: d, reason: collision with root package name */
    public C0605jo f7490d;

    public C0554ho() {
        a();
    }

    public static C0554ho[] b() {
        if (f7486i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7486i == null) {
                        f7486i = new C0554ho[0];
                    }
                } finally {
                }
            }
        }
        return f7486i;
    }

    public final C0554ho a() {
        this.f7487a = WireFormatNano.EMPTY_BYTES;
        this.f7488b = 0;
        this.f7489c = null;
        this.f7490d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeInt32Size = CodedOutputByteBufferNano.computeInt32Size(2, this.f7488b) + CodedOutputByteBufferNano.computeBytesSize(1, this.f7487a) + super.computeSerializedSize();
        C0579io c0579io = this.f7489c;
        if (c0579io != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(3, c0579io);
        }
        C0605jo c0605jo = this.f7490d;
        return c0605jo != null ? CodedOutputByteBufferNano.computeMessageSize(4, c0605jo) + computeInt32Size : computeInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBytes(1, this.f7487a);
        codedOutputByteBufferNano.writeInt32(2, this.f7488b);
        C0579io c0579io = this.f7489c;
        if (c0579io != null) {
            codedOutputByteBufferNano.writeMessage(3, c0579io);
        }
        C0605jo c0605jo = this.f7490d;
        if (c0605jo != null) {
            codedOutputByteBufferNano.writeMessage(4, c0605jo);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0554ho mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f7487a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 16) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.f7488b = readInt32;
                }
            } else if (readTag == 26) {
                if (this.f7489c == null) {
                    this.f7489c = new C0579io();
                }
                codedInputByteBufferNano.readMessage(this.f7489c);
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f7490d == null) {
                    this.f7490d = new C0605jo();
                }
                codedInputByteBufferNano.readMessage(this.f7490d);
            }
        }
        return this;
    }

    public static C0554ho b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0554ho().mergeFrom(codedInputByteBufferNano);
    }

    public static C0554ho a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0554ho) MessageNano.mergeFrom(new C0554ho(), bArr);
    }
}
