package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.qm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0785qm extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0785qm[] f8182c;

    /* renamed from: a, reason: collision with root package name */
    public String f8183a;

    /* renamed from: b, reason: collision with root package name */
    public C0759pm f8184b;

    public C0785qm() {
        a();
    }

    public static C0785qm[] b() {
        if (f8182c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8182c == null) {
                        f8182c = new C0785qm[0];
                    }
                } finally {
                }
            }
        }
        return f8182c;
    }

    public final C0785qm a() {
        this.f8183a = "";
        this.f8184b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f8183a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f8183a);
        }
        C0759pm c0759pm = this.f8184b;
        return c0759pm != null ? CodedOutputByteBufferNano.computeMessageSize(2, c0759pm) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f8183a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f8183a);
        }
        C0759pm c0759pm = this.f8184b;
        if (c0759pm != null) {
            codedOutputByteBufferNano.writeMessage(2, c0759pm);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0785qm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f8183a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f8184b == null) {
                    this.f8184b = new C0759pm();
                }
                codedInputByteBufferNano.readMessage(this.f8184b);
            }
        }
        return this;
    }

    public static C0785qm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0785qm().mergeFrom(codedInputByteBufferNano);
    }

    public static C0785qm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0785qm) MessageNano.mergeFrom(new C0785qm(), bArr);
    }
}
