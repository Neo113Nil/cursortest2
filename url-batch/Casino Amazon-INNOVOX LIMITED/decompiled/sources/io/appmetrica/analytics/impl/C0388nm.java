package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.nm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0388nm extends MessageNano {
    public static volatile C0388nm[] c;

    /* renamed from: a, reason: collision with root package name */
    public String f1402a;
    public C0363mm b;

    public C0388nm() {
        a();
    }

    public static C0388nm[] b() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (c == null) {
                    c = new C0388nm[0];
                }
            }
        }
        return c;
    }

    public final C0388nm a() {
        this.f1402a = "";
        this.b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f1402a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f1402a);
        }
        C0363mm c0363mm = this.b;
        return c0363mm != null ? CodedOutputByteBufferNano.computeMessageSize(2, c0363mm) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f1402a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f1402a);
        }
        C0363mm c0363mm = this.b;
        if (c0363mm != null) {
            codedOutputByteBufferNano.writeMessage(2, c0363mm);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0388nm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f1402a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.b == null) {
                    this.b = new C0363mm();
                }
                codedInputByteBufferNano.readMessage(this.b);
            }
        }
        return this;
    }

    public static C0388nm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0388nm().mergeFrom(codedInputByteBufferNano);
    }

    public static C0388nm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0388nm) MessageNano.mergeFrom(new C0388nm(), bArr);
    }
}
