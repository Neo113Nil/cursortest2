package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.sf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0829sf extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f8309c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f8310d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f8311e = 2;
    public static final int f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static volatile C0829sf[] f8312g;

    /* renamed from: a, reason: collision with root package name */
    public C0778qf f8313a;

    /* renamed from: b, reason: collision with root package name */
    public C0803rf[] f8314b;

    public C0829sf() {
        a();
    }

    public static C0829sf[] b() {
        if (f8312g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8312g == null) {
                        f8312g = new C0829sf[0];
                    }
                } finally {
                }
            }
        }
        return f8312g;
    }

    public final C0829sf a() {
        this.f8313a = null;
        this.f8314b = C0803rf.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0778qf c0778qf = this.f8313a;
        if (c0778qf != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0778qf);
        }
        C0803rf[] c0803rfArr = this.f8314b;
        if (c0803rfArr != null && c0803rfArr.length > 0) {
            int i3 = 0;
            while (true) {
                C0803rf[] c0803rfArr2 = this.f8314b;
                if (i3 >= c0803rfArr2.length) {
                    break;
                }
                C0803rf c0803rf = c0803rfArr2[i3];
                if (c0803rf != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c0803rf) + computeSerializedSize;
                }
                i3++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0778qf c0778qf = this.f8313a;
        if (c0778qf != null) {
            codedOutputByteBufferNano.writeMessage(1, c0778qf);
        }
        C0803rf[] c0803rfArr = this.f8314b;
        if (c0803rfArr != null && c0803rfArr.length > 0) {
            int i3 = 0;
            while (true) {
                C0803rf[] c0803rfArr2 = this.f8314b;
                if (i3 >= c0803rfArr2.length) {
                    break;
                }
                C0803rf c0803rf = c0803rfArr2[i3];
                if (c0803rf != null) {
                    codedOutputByteBufferNano.writeMessage(2, c0803rf);
                }
                i3++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0829sf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f8313a == null) {
                    this.f8313a = new C0778qf();
                }
                codedInputByteBufferNano.readMessage(this.f8313a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C0803rf[] c0803rfArr = this.f8314b;
                int length = c0803rfArr == null ? 0 : c0803rfArr.length;
                int i3 = repeatedFieldArrayLength + length;
                C0803rf[] c0803rfArr2 = new C0803rf[i3];
                if (length != 0) {
                    System.arraycopy(c0803rfArr, 0, c0803rfArr2, 0, length);
                }
                while (length < i3 - 1) {
                    C0803rf c0803rf = new C0803rf();
                    c0803rfArr2[length] = c0803rf;
                    codedInputByteBufferNano.readMessage(c0803rf);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0803rf c0803rf2 = new C0803rf();
                c0803rfArr2[length] = c0803rf2;
                codedInputByteBufferNano.readMessage(c0803rf2);
                this.f8314b = c0803rfArr2;
            }
        }
        return this;
    }

    public static C0829sf b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0829sf().mergeFrom(codedInputByteBufferNano);
    }

    public static C0829sf a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0829sf) MessageNano.mergeFrom(new C0829sf(), bArr);
    }
}
