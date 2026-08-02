package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class d extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f9452c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f9453d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f9454e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static volatile d[] f9455f;

    /* renamed from: a, reason: collision with root package name */
    public c[] f9456a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9457b;

    public d() {
        a();
    }

    public static d[] b() {
        if (f9455f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9455f == null) {
                        f9455f = new d[0];
                    }
                } finally {
                }
            }
        }
        return f9455f;
    }

    public final d a() {
        this.f9456a = c.b();
        this.f9457b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        c[] cVarArr = this.f9456a;
        if (cVarArr != null && cVarArr.length > 0) {
            int i4 = 0;
            while (true) {
                c[] cVarArr2 = this.f9456a;
                if (i4 >= cVarArr2.length) {
                    break;
                }
                c cVar = cVarArr2[i4];
                if (cVar != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, cVar) + computeSerializedSize;
                }
                i4++;
            }
        }
        return CodedOutputByteBufferNano.computeBoolSize(2, this.f9457b) + computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        c[] cVarArr = this.f9456a;
        if (cVarArr != null && cVarArr.length > 0) {
            int i4 = 0;
            while (true) {
                c[] cVarArr2 = this.f9456a;
                if (i4 >= cVarArr2.length) {
                    break;
                }
                c cVar = cVarArr2[i4];
                if (cVar != null) {
                    codedOutputByteBufferNano.writeMessage(1, cVar);
                }
                i4++;
            }
        }
        codedOutputByteBufferNano.writeBool(2, this.f9457b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final d mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                c[] cVarArr = this.f9456a;
                int length = cVarArr == null ? 0 : cVarArr.length;
                int i4 = repeatedFieldArrayLength + length;
                c[] cVarArr2 = new c[i4];
                if (length != 0) {
                    System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
                }
                while (length < i4 - 1) {
                    c cVar = new c();
                    cVarArr2[length] = cVar;
                    codedInputByteBufferNano.readMessage(cVar);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                c cVar2 = new c();
                cVarArr2[length] = cVar2;
                codedInputByteBufferNano.readMessage(cVar2);
                this.f9456a = cVarArr2;
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f9457b = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static d b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new d().mergeFrom(codedInputByteBufferNano);
    }

    public static d a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (d) MessageNano.mergeFrom(new d(), bArr);
    }
}
