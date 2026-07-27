package io.appmetrica.analytics.impl;

import com.yandex.varioqub.config.model.ConfigValue;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.g9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0664g9 extends MessageNano {

    /* renamed from: j, reason: collision with root package name */
    public static final int f8251j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static final int f8252k = 1;

    /* renamed from: l, reason: collision with root package name */
    public static final int f8253l = 2;

    /* renamed from: m, reason: collision with root package name */
    public static volatile C0664g9[] f8254m;

    /* renamed from: a, reason: collision with root package name */
    public double f8255a;

    /* renamed from: b, reason: collision with root package name */
    public double f8256b;

    /* renamed from: c, reason: collision with root package name */
    public long f8257c;

    /* renamed from: d, reason: collision with root package name */
    public int f8258d;

    /* renamed from: e, reason: collision with root package name */
    public int f8259e;

    /* renamed from: f, reason: collision with root package name */
    public int f8260f;

    /* renamed from: g, reason: collision with root package name */
    public int f8261g;

    /* renamed from: h, reason: collision with root package name */
    public int f8262h;

    /* renamed from: i, reason: collision with root package name */
    public String f8263i;

    public C0664g9() {
        a();
    }

    public static C0664g9[] b() {
        if (f8254m == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8254m == null) {
                        f8254m = new C0664g9[0];
                    }
                } finally {
                }
            }
        }
        return f8254m;
    }

    public final C0664g9 a() {
        this.f8255a = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.f8256b = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.f8257c = 0L;
        this.f8258d = 0;
        this.f8259e = 0;
        this.f8260f = 0;
        this.f8261g = 0;
        this.f8262h = 0;
        this.f8263i = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeDoubleSize = CodedOutputByteBufferNano.computeDoubleSize(2, this.f8256b) + CodedOutputByteBufferNano.computeDoubleSize(1, this.f8255a) + super.computeSerializedSize();
        long j2 = this.f8257c;
        if (j2 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeUInt64Size(3, j2);
        }
        int i2 = this.f8258d;
        if (i2 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(4, i2);
        }
        int i3 = this.f8259e;
        if (i3 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(5, i3);
        }
        int i6 = this.f8260f;
        if (i6 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(6, i6);
        }
        int i7 = this.f8261g;
        if (i7 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeInt32Size(7, i7);
        }
        int i8 = this.f8262h;
        if (i8 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeInt32Size(8, i8);
        }
        return !this.f8263i.equals("") ? computeDoubleSize + CodedOutputByteBufferNano.computeStringSize(9, this.f8263i) : computeDoubleSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeDouble(1, this.f8255a);
        codedOutputByteBufferNano.writeDouble(2, this.f8256b);
        long j2 = this.f8257c;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j2);
        }
        int i2 = this.f8258d;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(4, i2);
        }
        int i3 = this.f8259e;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i3);
        }
        int i6 = this.f8260f;
        if (i6 != 0) {
            codedOutputByteBufferNano.writeUInt32(6, i6);
        }
        int i7 = this.f8261g;
        if (i7 != 0) {
            codedOutputByteBufferNano.writeInt32(7, i7);
        }
        int i8 = this.f8262h;
        if (i8 != 0) {
            codedOutputByteBufferNano.writeInt32(8, i8);
        }
        if (!this.f8263i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.f8263i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0664g9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0664g9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0664g9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 9) {
                this.f8255a = codedInputByteBufferNano.readDouble();
            } else if (readTag == 17) {
                this.f8256b = codedInputByteBufferNano.readDouble();
            } else if (readTag == 24) {
                this.f8257c = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 32) {
                this.f8258d = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 40) {
                this.f8259e = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 48) {
                this.f8260f = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 56) {
                this.f8261g = codedInputByteBufferNano.readInt32();
            } else if (readTag == 64) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f8262h = readInt32;
                }
            } else if (readTag != 74) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f8263i = codedInputByteBufferNano.readString();
            }
        }
    }

    public static C0664g9 a(byte[] bArr) {
        return (C0664g9) MessageNano.mergeFrom(new C0664g9(), bArr);
    }
}
