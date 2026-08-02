package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class Pi extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile Pi[] f6468d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f6469a;

    /* renamed from: b, reason: collision with root package name */
    public Oi f6470b;

    /* renamed from: c, reason: collision with root package name */
    public Ni f6471c;

    public Pi() {
        a();
    }

    public static Pi[] b() {
        if (f6468d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6468d == null) {
                        f6468d = new Pi[0];
                    }
                } finally {
                }
            }
        }
        return f6468d;
    }

    public final Pi a() {
        this.f6469a = false;
        this.f6470b = null;
        this.f6471c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z = this.f6469a;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z);
        }
        Oi oi = this.f6470b;
        if (oi != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, oi);
        }
        Ni ni = this.f6471c;
        return ni != null ? CodedOutputByteBufferNano.computeMessageSize(3, ni) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z = this.f6469a;
        if (z) {
            codedOutputByteBufferNano.writeBool(1, z);
        }
        Oi oi = this.f6470b;
        if (oi != null) {
            codedOutputByteBufferNano.writeMessage(2, oi);
        }
        Ni ni = this.f6471c;
        if (ni != null) {
            codedOutputByteBufferNano.writeMessage(3, ni);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Pi mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f6469a = codedInputByteBufferNano.readBool();
            } else if (readTag == 18) {
                if (this.f6470b == null) {
                    this.f6470b = new Oi();
                }
                codedInputByteBufferNano.readMessage(this.f6470b);
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f6471c == null) {
                    this.f6471c = new Ni();
                }
                codedInputByteBufferNano.readMessage(this.f6471c);
            }
        }
        return this;
    }

    public static Pi b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Pi().mergeFrom(codedInputByteBufferNano);
    }

    public static Pi a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Pi) MessageNano.mergeFrom(new Pi(), bArr);
    }
}
