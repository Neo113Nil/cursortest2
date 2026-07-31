package io.appmetrica.analytics.impl;

import androidx.work.WorkRequest;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.wm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0612wm extends MessageNano {
    public static volatile C0612wm[] b;

    /* renamed from: a, reason: collision with root package name */
    public long f1553a;

    public C0612wm() {
        a();
    }

    public static C0612wm[] b() {
        if (b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (b == null) {
                    b = new C0612wm[0];
                }
            }
        }
        return b;
    }

    public final C0612wm a() {
        this.f1553a = WorkRequest.MAX_BACKOFF_MILLIS;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt64Size(1, this.f1553a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt64(1, this.f1553a);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0612wm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag != 8) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f1553a = codedInputByteBufferNano.readInt64();
            }
        }
        return this;
    }

    public static C0612wm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0612wm().mergeFrom(codedInputByteBufferNano);
    }

    public static C0612wm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0612wm) MessageNano.mergeFrom(new C0612wm(), bArr);
    }
}
