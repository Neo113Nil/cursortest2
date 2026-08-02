package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.u9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0997u9 extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C0997u9[] f12822e;

    /* renamed from: a, reason: collision with root package name */
    public boolean f12823a;

    /* renamed from: b, reason: collision with root package name */
    public int f12824b;

    /* renamed from: c, reason: collision with root package name */
    public int f12825c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f12826d;

    public C0997u9() {
        a();
    }

    public static C0997u9[] b() {
        if (f12822e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f12822e == null) {
                        f12822e = new C0997u9[0];
                    }
                } finally {
                }
            }
        }
        return f12822e;
    }

    public final C0997u9 a() {
        this.f12823a = false;
        this.f12824b = 0;
        this.f12825c = 0;
        this.f12826d = WireFormatNano.EMPTY_INT_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeUInt32Size = CodedOutputByteBufferNano.computeUInt32Size(3, this.f12825c) + CodedOutputByteBufferNano.computeUInt32Size(2, this.f12824b) + CodedOutputByteBufferNano.computeBoolSize(1, this.f12823a) + super.computeSerializedSize();
        int[] iArr = this.f12826d;
        if (iArr == null || iArr.length <= 0) {
            return computeUInt32Size;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr2 = this.f12826d;
            if (i4 >= iArr2.length) {
                return computeUInt32Size + i5 + iArr2.length;
            }
            i5 += CodedOutputByteBufferNano.computeInt32SizeNoTag(iArr2[i4]);
            i4++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBool(1, this.f12823a);
        codedOutputByteBufferNano.writeUInt32(2, this.f12824b);
        codedOutputByteBufferNano.writeUInt32(3, this.f12825c);
        int[] iArr = this.f12826d;
        if (iArr != null && iArr.length > 0) {
            int i4 = 0;
            while (true) {
                int[] iArr2 = this.f12826d;
                if (i4 >= iArr2.length) {
                    break;
                }
                codedOutputByteBufferNano.writeInt32(4, iArr2[i4]);
                i4++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0997u9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f12823a = codedInputByteBufferNano.readBool();
            } else if (readTag == 16) {
                this.f12824b = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 24) {
                this.f12825c = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 32) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 32);
                int[] iArr = this.f12826d;
                int length = iArr == null ? 0 : iArr.length;
                int i4 = repeatedFieldArrayLength + length;
                int[] iArr2 = new int[i4];
                if (length != 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, length);
                }
                while (length < i4 - 1) {
                    iArr2[length] = codedInputByteBufferNano.readInt32();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                iArr2[length] = codedInputByteBufferNano.readInt32();
                this.f12826d = iArr2;
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int pushLimit = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                int position = codedInputByteBufferNano.getPosition();
                int i5 = 0;
                while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                    codedInputByteBufferNano.readInt32();
                    i5++;
                }
                codedInputByteBufferNano.rewindToPosition(position);
                int[] iArr3 = this.f12826d;
                int length2 = iArr3 == null ? 0 : iArr3.length;
                int i6 = i5 + length2;
                int[] iArr4 = new int[i6];
                if (length2 != 0) {
                    System.arraycopy(iArr3, 0, iArr4, 0, length2);
                }
                while (length2 < i6) {
                    iArr4[length2] = codedInputByteBufferNano.readInt32();
                    length2++;
                }
                this.f12826d = iArr4;
                codedInputByteBufferNano.popLimit(pushLimit);
            }
        }
        return this;
    }

    public static C0997u9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0997u9().mergeFrom(codedInputByteBufferNano);
    }

    public static C0997u9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0997u9) MessageNano.mergeFrom(new C0997u9(), bArr);
    }
}
