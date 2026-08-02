package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.u3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0991u3 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0991u3[] f12797c;

    /* renamed from: a, reason: collision with root package name */
    public C1043w3 f12798a;

    /* renamed from: b, reason: collision with root package name */
    public int f12799b;

    public C0991u3() {
        a();
    }

    public static C0991u3[] b() {
        if (f12797c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f12797c == null) {
                        f12797c = new C0991u3[0];
                    }
                } finally {
                }
            }
        }
        return f12797c;
    }

    public final C0991u3 a() {
        this.f12798a = null;
        this.f12799b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C1043w3 c1043w3 = this.f12798a;
        if (c1043w3 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c1043w3);
        }
        int i4 = this.f12799b;
        return i4 != 0 ? CodedOutputByteBufferNano.computeInt32Size(2, i4) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C1043w3 c1043w3 = this.f12798a;
        if (c1043w3 != null) {
            codedOutputByteBufferNano.writeMessage(1, c1043w3);
        }
        int i4 = this.f12799b;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeInt32(2, i4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0991u3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f12798a == null) {
                    this.f12798a = new C1043w3();
                }
                codedInputByteBufferNano.readMessage(this.f12798a);
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.f12799b = readInt32;
                }
            }
        }
        return this;
    }

    public static C0991u3 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0991u3().mergeFrom(codedInputByteBufferNano);
    }

    public static C0991u3 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0991u3) MessageNano.mergeFrom(new C0991u3(), bArr);
    }
}
