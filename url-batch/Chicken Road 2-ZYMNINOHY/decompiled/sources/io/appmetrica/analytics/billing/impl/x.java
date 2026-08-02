package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class x extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile x[] f9496d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f9497a;

    /* renamed from: b, reason: collision with root package name */
    public w f9498b;

    /* renamed from: c, reason: collision with root package name */
    public v f9499c;

    public x() {
        a();
    }

    public static x[] b() {
        if (f9496d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9496d == null) {
                        f9496d = new x[0];
                    }
                } finally {
                }
            }
        }
        return f9496d;
    }

    public final x a() {
        this.f9497a = false;
        this.f9498b = null;
        this.f9499c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z = this.f9497a;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z);
        }
        w wVar = this.f9498b;
        if (wVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, wVar);
        }
        v vVar = this.f9499c;
        return vVar != null ? CodedOutputByteBufferNano.computeMessageSize(3, vVar) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z = this.f9497a;
        if (z) {
            codedOutputByteBufferNano.writeBool(1, z);
        }
        w wVar = this.f9498b;
        if (wVar != null) {
            codedOutputByteBufferNano.writeMessage(2, wVar);
        }
        v vVar = this.f9499c;
        if (vVar != null) {
            codedOutputByteBufferNano.writeMessage(3, vVar);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final x mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f9497a = codedInputByteBufferNano.readBool();
            } else if (readTag == 18) {
                if (this.f9498b == null) {
                    this.f9498b = new w();
                }
                codedInputByteBufferNano.readMessage(this.f9498b);
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f9499c == null) {
                    this.f9499c = new v();
                }
                codedInputByteBufferNano.readMessage(this.f9499c);
            }
        }
        return this;
    }

    public static x b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new x().mergeFrom(codedInputByteBufferNano);
    }

    public static x a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (x) MessageNano.mergeFrom(new x(), bArr);
    }
}
