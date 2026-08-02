package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.rm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0810rm extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0810rm[] f8257b;

    /* renamed from: a, reason: collision with root package name */
    public C0785qm[] f8258a;

    public C0810rm() {
        a();
    }

    public static C0810rm[] b() {
        if (f8257b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8257b == null) {
                        f8257b = new C0810rm[0];
                    }
                } finally {
                }
            }
        }
        return f8257b;
    }

    public final C0810rm a() {
        this.f8258a = C0785qm.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0785qm[] c0785qmArr = this.f8258a;
        if (c0785qmArr != null && c0785qmArr.length > 0) {
            int i3 = 0;
            while (true) {
                C0785qm[] c0785qmArr2 = this.f8258a;
                if (i3 >= c0785qmArr2.length) {
                    break;
                }
                C0785qm c0785qm = c0785qmArr2[i3];
                if (c0785qm != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c0785qm) + computeSerializedSize;
                }
                i3++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0785qm[] c0785qmArr = this.f8258a;
        if (c0785qmArr != null && c0785qmArr.length > 0) {
            int i3 = 0;
            while (true) {
                C0785qm[] c0785qmArr2 = this.f8258a;
                if (i3 >= c0785qmArr2.length) {
                    break;
                }
                C0785qm c0785qm = c0785qmArr2[i3];
                if (c0785qm != null) {
                    codedOutputByteBufferNano.writeMessage(1, c0785qm);
                }
                i3++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0810rm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C0785qm[] c0785qmArr = this.f8258a;
                int length = c0785qmArr == null ? 0 : c0785qmArr.length;
                int i3 = repeatedFieldArrayLength + length;
                C0785qm[] c0785qmArr2 = new C0785qm[i3];
                if (length != 0) {
                    System.arraycopy(c0785qmArr, 0, c0785qmArr2, 0, length);
                }
                while (length < i3 - 1) {
                    C0785qm c0785qm = new C0785qm();
                    c0785qmArr2[length] = c0785qm;
                    codedInputByteBufferNano.readMessage(c0785qm);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0785qm c0785qm2 = new C0785qm();
                c0785qmArr2[length] = c0785qm2;
                codedInputByteBufferNano.readMessage(c0785qm2);
                this.f8258a = c0785qmArr2;
            }
        }
        return this;
    }

    public static C0810rm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0810rm().mergeFrom(codedInputByteBufferNano);
    }

    public static C0810rm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0810rm) MessageNano.mergeFrom(new C0810rm(), bArr);
    }
}
