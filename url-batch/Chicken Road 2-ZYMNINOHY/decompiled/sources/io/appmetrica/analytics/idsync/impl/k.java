package io.appmetrica.analytics.idsync.impl;

import com.startapp.simple.bloomfilter.codec.BaseNCodec;
import io.appmetrica.analytics.impl.C0583e9;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import io.flutter.Build;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class k extends MessageNano {

    /* renamed from: j, reason: collision with root package name */
    public static volatile k[] f9927j;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f9928a;

    /* renamed from: b, reason: collision with root package name */
    public j f9929b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f9930c;

    /* renamed from: d, reason: collision with root package name */
    public i[] f9931d;

    /* renamed from: e, reason: collision with root package name */
    public long f9932e;

    /* renamed from: f, reason: collision with root package name */
    public long f9933f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f9934g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9935h;

    /* renamed from: i, reason: collision with root package name */
    public String f9936i;

    public k() {
        a();
    }

    public static k[] b() {
        if (f9927j == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9927j == null) {
                        f9927j = new k[0];
                    }
                } finally {
                }
            }
        }
        return f9927j;
    }

    public final k a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f9928a = bArr;
        this.f9929b = null;
        this.f9930c = bArr;
        this.f9931d = i.b();
        this.f9932e = 86400000L;
        this.f9933f = 3600000L;
        this.f9934g = WireFormatNano.EMPTY_INT_ARRAY;
        this.f9935h = true;
        this.f9936i = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int[] iArr;
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f9928a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f9928a);
        }
        j jVar = this.f9929b;
        if (jVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, jVar);
        }
        if (!Arrays.equals(this.f9930c, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.f9930c);
        }
        i[] iVarArr = this.f9931d;
        int i4 = 0;
        if (iVarArr != null && iVarArr.length > 0) {
            int i5 = 0;
            while (true) {
                i[] iVarArr2 = this.f9931d;
                if (i5 >= iVarArr2.length) {
                    break;
                }
                i iVar = iVarArr2[i5];
                if (iVar != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(4, iVar) + computeSerializedSize;
                }
                i5++;
            }
        }
        long j4 = this.f9932e;
        if (j4 != 86400000) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(5, j4);
        }
        long j5 = this.f9933f;
        if (j5 != 3600000) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(6, j5);
        }
        int[] iArr2 = this.f9934g;
        if (iArr2 != null && iArr2.length > 0) {
            int i6 = 0;
            while (true) {
                iArr = this.f9934g;
                if (i4 >= iArr.length) {
                    break;
                }
                i6 += CodedOutputByteBufferNano.computeUInt32SizeNoTag(iArr[i4]);
                i4++;
            }
            computeSerializedSize = computeSerializedSize + i6 + iArr.length;
        }
        boolean z = this.f9935h;
        if (!z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(8, z);
        }
        return !this.f9936i.equals("") ? CodedOutputByteBufferNano.computeStringSize(9, this.f9936i) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f9928a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f9928a);
        }
        j jVar = this.f9929b;
        if (jVar != null) {
            codedOutputByteBufferNano.writeMessage(2, jVar);
        }
        if (!Arrays.equals(this.f9930c, bArr2)) {
            codedOutputByteBufferNano.writeBytes(3, this.f9930c);
        }
        i[] iVarArr = this.f9931d;
        int i4 = 0;
        if (iVarArr != null && iVarArr.length > 0) {
            int i5 = 0;
            while (true) {
                i[] iVarArr2 = this.f9931d;
                if (i5 >= iVarArr2.length) {
                    break;
                }
                i iVar = iVarArr2[i5];
                if (iVar != null) {
                    codedOutputByteBufferNano.writeMessage(4, iVar);
                }
                i5++;
            }
        }
        long j4 = this.f9932e;
        if (j4 != 86400000) {
            codedOutputByteBufferNano.writeUInt64(5, j4);
        }
        long j5 = this.f9933f;
        if (j5 != 3600000) {
            codedOutputByteBufferNano.writeUInt64(6, j5);
        }
        int[] iArr = this.f9934g;
        if (iArr != null && iArr.length > 0) {
            while (true) {
                int[] iArr2 = this.f9934g;
                if (i4 >= iArr2.length) {
                    break;
                }
                codedOutputByteBufferNano.writeUInt32(7, iArr2[i4]);
                i4++;
            }
        }
        boolean z = this.f9935h;
        if (!z) {
            codedOutputByteBufferNano.writeBool(8, z);
        }
        if (!this.f9936i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.f9936i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static k b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new k().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final k mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 10:
                    this.f9928a = codedInputByteBufferNano.readBytes();
                    break;
                case 18:
                    if (this.f9929b == null) {
                        this.f9929b = new j();
                    }
                    codedInputByteBufferNano.readMessage(this.f9929b);
                    break;
                case 26:
                    this.f9930c = codedInputByteBufferNano.readBytes();
                    break;
                case Build.API_LEVELS.API_34 /* 34 */:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                    i[] iVarArr = this.f9931d;
                    int length = iVarArr == null ? 0 : iVarArr.length;
                    int i4 = repeatedFieldArrayLength + length;
                    i[] iVarArr2 = new i[i4];
                    if (length != 0) {
                        System.arraycopy(iVarArr, 0, iVarArr2, 0, length);
                    }
                    while (length < i4 - 1) {
                        i iVar = new i();
                        iVarArr2[length] = iVar;
                        codedInputByteBufferNano.readMessage(iVar);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    i iVar2 = new i();
                    iVarArr2[length] = iVar2;
                    codedInputByteBufferNano.readMessage(iVar2);
                    this.f9931d = iVarArr2;
                    break;
                case C0583e9.L /* 40 */:
                    this.f9932e = codedInputByteBufferNano.readUInt64();
                    break;
                case 48:
                    this.f9933f = codedInputByteBufferNano.readUInt64();
                    break;
                case 56:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 56);
                    int[] iArr = this.f9934g;
                    int length2 = iArr == null ? 0 : iArr.length;
                    int i5 = repeatedFieldArrayLength2 + length2;
                    int[] iArr2 = new int[i5];
                    if (length2 != 0) {
                        System.arraycopy(iArr, 0, iArr2, 0, length2);
                    }
                    while (length2 < i5 - 1) {
                        iArr2[length2] = codedInputByteBufferNano.readUInt32();
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    iArr2[length2] = codedInputByteBufferNano.readUInt32();
                    this.f9934g = iArr2;
                    break;
                case 58:
                    int pushLimit = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                    int position = codedInputByteBufferNano.getPosition();
                    int i6 = 0;
                    while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                        codedInputByteBufferNano.readUInt32();
                        i6++;
                    }
                    codedInputByteBufferNano.rewindToPosition(position);
                    int[] iArr3 = this.f9934g;
                    int length3 = iArr3 == null ? 0 : iArr3.length;
                    int i7 = i6 + length3;
                    int[] iArr4 = new int[i7];
                    if (length3 != 0) {
                        System.arraycopy(iArr3, 0, iArr4, 0, length3);
                    }
                    while (length3 < i7) {
                        iArr4[length3] = codedInputByteBufferNano.readUInt32();
                        length3++;
                    }
                    this.f9934g = iArr4;
                    codedInputByteBufferNano.popLimit(pushLimit);
                    break;
                case BaseNCodec.PEM_CHUNK_SIZE /* 64 */:
                    this.f9935h = codedInputByteBufferNano.readBool();
                    break;
                case 74:
                    this.f9936i = codedInputByteBufferNano.readString();
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }

    public static k a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (k) MessageNano.mergeFrom(new k(), bArr);
    }
}
