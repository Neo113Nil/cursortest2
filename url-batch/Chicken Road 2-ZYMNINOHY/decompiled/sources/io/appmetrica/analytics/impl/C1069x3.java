package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.x3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1069x3 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f12992c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f12993d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f12994e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f12995f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static volatile C1069x3[] f12996g;

    /* renamed from: a, reason: collision with root package name */
    public C0991u3 f12997a;

    /* renamed from: b, reason: collision with root package name */
    public C0991u3[] f12998b;

    public C1069x3() {
        a();
    }

    public static C1069x3[] b() {
        if (f12996g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f12996g == null) {
                        f12996g = new C1069x3[0];
                    }
                } finally {
                }
            }
        }
        return f12996g;
    }

    public final C1069x3 a() {
        this.f12997a = null;
        this.f12998b = C0991u3.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0991u3 c0991u3 = this.f12997a;
        if (c0991u3 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0991u3);
        }
        C0991u3[] c0991u3Arr = this.f12998b;
        if (c0991u3Arr != null && c0991u3Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C0991u3[] c0991u3Arr2 = this.f12998b;
                if (i4 >= c0991u3Arr2.length) {
                    break;
                }
                C0991u3 c0991u32 = c0991u3Arr2[i4];
                if (c0991u32 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c0991u32) + computeSerializedSize;
                }
                i4++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0991u3 c0991u3 = this.f12997a;
        if (c0991u3 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0991u3);
        }
        C0991u3[] c0991u3Arr = this.f12998b;
        if (c0991u3Arr != null && c0991u3Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C0991u3[] c0991u3Arr2 = this.f12998b;
                if (i4 >= c0991u3Arr2.length) {
                    break;
                }
                C0991u3 c0991u32 = c0991u3Arr2[i4];
                if (c0991u32 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c0991u32);
                }
                i4++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1069x3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f12997a == null) {
                    this.f12997a = new C0991u3();
                }
                codedInputByteBufferNano.readMessage(this.f12997a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C0991u3[] c0991u3Arr = this.f12998b;
                int length = c0991u3Arr == null ? 0 : c0991u3Arr.length;
                int i4 = repeatedFieldArrayLength + length;
                C0991u3[] c0991u3Arr2 = new C0991u3[i4];
                if (length != 0) {
                    System.arraycopy(c0991u3Arr, 0, c0991u3Arr2, 0, length);
                }
                while (length < i4 - 1) {
                    C0991u3 c0991u3 = new C0991u3();
                    c0991u3Arr2[length] = c0991u3;
                    codedInputByteBufferNano.readMessage(c0991u3);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0991u3 c0991u32 = new C0991u3();
                c0991u3Arr2[length] = c0991u32;
                codedInputByteBufferNano.readMessage(c0991u32);
                this.f12998b = c0991u3Arr2;
            }
        }
        return this;
    }

    public static C1069x3 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C1069x3().mergeFrom(codedInputByteBufferNano);
    }

    public static C1069x3 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C1069x3) MessageNano.mergeFrom(new C1069x3(), bArr);
    }
}
