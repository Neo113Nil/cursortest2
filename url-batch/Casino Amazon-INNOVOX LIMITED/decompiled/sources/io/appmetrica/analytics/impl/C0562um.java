package io.appmetrica.analytics.impl;

import com.onesignal.session.internal.session.impl.SessionListener;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.um, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0562um extends MessageNano {
    public static volatile C0562um[] c;

    /* renamed from: a, reason: collision with root package name */
    public long f1520a;
    public long b;

    public C0562um() {
        a();
    }

    public static C0562um[] b() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (c == null) {
                    c = new C0562um[0];
                }
            }
        }
        return c;
    }

    public final C0562um a() {
        this.f1520a = SessionListener.SECONDS_IN_A_DAY;
        this.b = 432000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt64Size(2, this.b) + CodedOutputByteBufferNano.computeInt64Size(1, this.f1520a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt64(1, this.f1520a);
        codedOutputByteBufferNano.writeInt64(2, this.b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0562um mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f1520a = codedInputByteBufferNano.readInt64();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.b = codedInputByteBufferNano.readInt64();
            }
        }
        return this;
    }

    public static C0562um b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0562um().mergeFrom(codedInputByteBufferNano);
    }

    public static C0562um a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0562um) MessageNano.mergeFrom(new C0562um(), bArr);
    }
}
