package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class Ab extends MessageNano {

    /* renamed from: f, reason: collision with root package name */
    public static volatile Ab[] f10034f;

    /* renamed from: a, reason: collision with root package name */
    public String f10035a;

    /* renamed from: b, reason: collision with root package name */
    public String f10036b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10037c;

    /* renamed from: d, reason: collision with root package name */
    public String f10038d;

    /* renamed from: e, reason: collision with root package name */
    public String f10039e;

    public Ab() {
        a();
    }

    public static Ab[] b() {
        if (f10034f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f10034f == null) {
                        f10034f = new Ab[0];
                    }
                } finally {
                }
            }
        }
        return f10034f;
    }

    public final Ab a() {
        this.f10035a = "";
        this.f10036b = "";
        this.f10037c = false;
        this.f10038d = "";
        this.f10039e = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f10035a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f10035a);
        }
        if (!this.f10036b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(19, this.f10036b);
        }
        boolean z = this.f10037c;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(22, z);
        }
        if (!this.f10038d.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(25, this.f10038d);
        }
        return !this.f10039e.equals("") ? CodedOutputByteBufferNano.computeStringSize(26, this.f10039e) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f10035a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f10035a);
        }
        if (!this.f10036b.equals("")) {
            codedOutputByteBufferNano.writeString(19, this.f10036b);
        }
        boolean z = this.f10037c;
        if (z) {
            codedOutputByteBufferNano.writeBool(22, z);
        }
        if (!this.f10038d.equals("")) {
            codedOutputByteBufferNano.writeString(25, this.f10038d);
        }
        if (!this.f10039e.equals("")) {
            codedOutputByteBufferNano.writeString(26, this.f10039e);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Ab b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Ab().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ab mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f10035a = codedInputByteBufferNano.readString();
            } else if (readTag == 154) {
                this.f10036b = codedInputByteBufferNano.readString();
            } else if (readTag == 176) {
                this.f10037c = codedInputByteBufferNano.readBool();
            } else if (readTag == 202) {
                this.f10038d = codedInputByteBufferNano.readString();
            } else if (readTag != 210) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f10039e = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static Ab a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Ab) MessageNano.mergeFrom(new Ab(), bArr);
    }
}
