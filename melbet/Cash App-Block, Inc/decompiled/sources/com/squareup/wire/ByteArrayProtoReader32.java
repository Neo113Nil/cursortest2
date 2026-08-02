package com.squareup.wire;

import android.view.View;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.contour.constraints.Constraint;
import com.squareup.contour.constraints.PositionConstraint;
import com.squareup.contour.utils.XYIntUtilsKt$unwrapXIntLambda$1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class ByteArrayProtoReader32 implements ProtoReader32 {
    public final Object bufferStack;
    public int limit;
    public Object nextFieldEncoding;
    public int pos;
    public Object protoReader;
    public int pushedLimit;
    public int recursionDepth;
    public Object source;
    public int state;
    public int tag;

    public ByteArrayProtoReader32(int i, Function1 function1) {
        CameraSelector$$ExternalSyntheticOutline0.checkNotZero(i);
        this.nextFieldEncoding = new PositionConstraint(i, function1);
        this.bufferStack = new PositionConstraint(1, null);
        this.protoReader = new Constraint();
        this.pos = PKIFailureInfo.systemUnavail;
        this.limit = PKIFailureInfo.systemUnavail;
        this.recursionDepth = PKIFailureInfo.systemUnavail;
        this.state = PKIFailureInfo.systemUnavail;
        this.tag = PKIFailureInfo.systemUnavail;
        this.pushedLimit = PKIFailureInfo.systemUnavail;
    }

    public void addUnknownField(int i, FieldEncoding fieldEncoding, Object obj) {
        fieldEncoding.getClass();
        ProtoWriter protoWriter = new ProtoWriter((BufferedSink) ((ArrayList) this.bufferStack).get(this.recursionDepth - 1));
        ProtoAdapter rawProtoAdapter = fieldEncoding.rawProtoAdapter();
        rawProtoAdapter.getClass();
        rawProtoAdapter.encodeWithTag(protoWriter, i, obj);
    }

    public void afterPackableScalar(int i) {
        if (this.state == i) {
            this.state = 6;
            return;
        }
        int i2 = this.pos;
        int i3 = this.limit;
        if (i2 <= i3) {
            if (i2 != i3) {
                this.state = 7;
                return;
            }
            this.limit = this.pushedLimit;
            this.pushedLimit = -1;
            this.state = 6;
            return;
        }
        throw new IOException("Expected to end at " + this.limit + " but was " + this.pos);
    }

    public int beforeLengthDelimitedScalar() {
        if (this.state == 2) {
            int i = this.limit - this.pos;
            this.state = 6;
            this.limit = this.pushedLimit;
            this.pushedLimit = -1;
            return i;
        }
        StringBuilder sb = new StringBuilder("Expected LENGTH_DELIMITED but was ");
        sb.append(this.state);
        sb.append(". Reader position: ");
        sb.append(this.pos);
        sb.append(". Last read tag: ");
        throw new ProtocolException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.tag, '.'));
    }

    public boolean beforePossiblyPackedScalar() {
        int i = this.state;
        if (i != 0 && i != 1) {
            if (i != 2) {
                if (i != 5) {
                    StringBuilder sb = new StringBuilder("unexpected state: ");
                    sb.append(this.state);
                    sb.append(". Reader position: ");
                    sb.append(this.pos);
                    sb.append(". Last read tag: ");
                    throw new ProtocolException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.tag, '.'));
                }
            } else if (this.pos >= this.limit) {
                this.limit = this.pushedLimit;
                this.pushedLimit = -1;
                this.state = 6;
                return false;
            }
        }
        return true;
    }

    public int beginMessage() {
        ArrayList arrayList = (ArrayList) this.bufferStack;
        if (this.state != 2) {
            a$$ExternalSyntheticBUOutline0.m$1("Unexpected call to beginMessage()");
            return 0;
        }
        int i = this.recursionDepth + 1;
        this.recursionDepth = i;
        if (i > 100) {
            a$$ExternalSyntheticBUOutline0.m$4("Wire recursion limit exceeded");
            return 0;
        }
        if (i > arrayList.size()) {
            arrayList.add(new Buffer());
        }
        int i2 = this.pushedLimit;
        this.pushedLimit = -1;
        this.state = 6;
        return i2;
    }

    public ByteString endMessageAndGetUnknownFields(int i) {
        if (this.state != 6) {
            a$$ExternalSyntheticBUOutline0.m$1("Unexpected call to endMessage()");
            return null;
        }
        int i2 = this.recursionDepth - 1;
        this.recursionDepth = i2;
        if (i2 < 0 || this.pushedLimit != -1) {
            a$$ExternalSyntheticBUOutline0.m$1("No corresponding call to beginMessage()");
            return null;
        }
        if (this.pos == this.limit || i2 == 0) {
            this.limit = i;
            Buffer buffer = (Buffer) ((ArrayList) this.bufferStack).get(i2);
            long j = buffer.size;
            return j > 0 ? buffer.readByteString(j) : ByteString.EMPTY;
        }
        throw new IOException("Expected to end at " + this.limit + " but was " + this.pos);
    }

    public ByteArrayProtoReader32 heightOf(int i, Function1 function1) {
        CameraSelector$$ExternalSyntheticOutline0.checkNotZero(i);
        Constraint constraint = (Constraint) this.protoReader;
        constraint.setMode(i);
        constraint.lambda = new XYIntUtilsKt$unwrapXIntLambda$1(1, function1);
        return this;
    }

    public int internalReadVarint32() {
        int i;
        byte readByte = readByte();
        if (readByte >= 0) {
            return readByte;
        }
        int i2 = readByte & Byte.MAX_VALUE;
        byte readByte2 = readByte();
        if (readByte2 >= 0) {
            i = readByte2 << 7;
        } else {
            i2 |= (readByte2 & Byte.MAX_VALUE) << 7;
            byte readByte3 = readByte();
            if (readByte3 >= 0) {
                i = readByte3 << 14;
            } else {
                i2 |= (readByte3 & Byte.MAX_VALUE) << 14;
                byte readByte4 = readByte();
                if (readByte4 < 0) {
                    int i3 = i2 | ((readByte4 & Byte.MAX_VALUE) << 21);
                    byte readByte5 = readByte();
                    int i4 = i3 | (readByte5 << 28);
                    if (readByte5 < 0) {
                        for (int i5 = 0; i5 < 5; i5++) {
                            if (readByte() < 0) {
                            }
                        }
                        StringBuilder sb = new StringBuilder("Malformed VARINT. Reader position: ");
                        sb.append(this.pos);
                        sb.append(". Last read tag: ");
                        throw new ProtocolException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.tag, '.'));
                    }
                    return i4;
                }
                i = readByte4 << 21;
            }
        }
        return i | i2;
    }

    public void leftTo(int i, Function1 function1) {
        CameraSelector$$ExternalSyntheticOutline0.checkNotZero(i);
        PositionConstraint positionConstraint = (PositionConstraint) this.bufferStack;
        positionConstraint.getClass();
        positionConstraint.point = 1;
        positionConstraint.setMode(i);
        positionConstraint.lambda = new XYIntUtilsKt$unwrapXIntLambda$1(0, function1);
        this.pushedLimit = 0;
    }

    public int max() {
        if (this.state == Integer.MIN_VALUE) {
            PositionConstraint positionConstraint = (PositionConstraint) this.nextFieldEncoding;
            if (positionConstraint.point == 4) {
                this.state = positionConstraint.resolve();
            } else {
                resolveRange();
                resolveAxis();
            }
        }
        return this.state;
    }

    public int measureSpec() {
        Constraint constraint = (Constraint) this.protoReader;
        PositionConstraint positionConstraint = (PositionConstraint) this.bufferStack;
        if (positionConstraint.lambda != null) {
            return View.MeasureSpec.makeMeasureSpec(Math.abs(((PositionConstraint) this.nextFieldEncoding).resolve() - positionConstraint.resolve()), SizeMode$EnumUnboxingLocalUtility.getMask(positionConstraint.mode));
        }
        if (constraint.lambda != null) {
            return View.MeasureSpec.makeMeasureSpec(constraint.resolve(), SizeMode$EnumUnboxingLocalUtility.getMask(constraint.mode));
        }
        return 0;
    }

    public int mid() {
        if (this.limit == Integer.MIN_VALUE) {
            PositionConstraint positionConstraint = (PositionConstraint) this.nextFieldEncoding;
            if (positionConstraint.point == 2) {
                this.limit = positionConstraint.resolve();
            } else {
                resolveRange();
                resolveAxis();
            }
        }
        return this.limit;
    }

    public int min() {
        if (this.pos == Integer.MIN_VALUE) {
            PositionConstraint positionConstraint = (PositionConstraint) this.nextFieldEncoding;
            if (positionConstraint.point == 1) {
                this.pos = positionConstraint.resolve();
            } else {
                resolveRange();
                resolveAxis();
            }
        }
        return this.pos;
    }

    public int nextTag() {
        int i = this.state;
        if (i == 7) {
            this.state = 2;
            return this.tag;
        }
        if (i != 6) {
            a$$ExternalSyntheticBUOutline0.m$1("Unexpected call to nextTag()");
            return 0;
        }
        while (this.pos < this.limit) {
            int internalReadVarint32 = internalReadVarint32();
            if (internalReadVarint32 == 0) {
                StringBuilder sb = new StringBuilder("Unexpected tag 0. Reader position: ");
                sb.append(this.pos);
                sb.append(". Last read tag: ");
                throw new ProtocolException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.tag, '.'));
            }
            int i2 = internalReadVarint32 >>> 3;
            this.tag = i2;
            int i3 = internalReadVarint32 & 7;
            if (i3 == 0) {
                this.nextFieldEncoding = FieldEncoding.VARINT;
                this.state = 0;
                return i2;
            }
            if (i3 == 1) {
                this.nextFieldEncoding = FieldEncoding.FIXED64;
                this.state = 1;
                return i2;
            }
            if (i3 == 2) {
                this.nextFieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                this.state = 2;
                int internalReadVarint322 = internalReadVarint32();
                if (internalReadVarint322 < 0) {
                    StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(internalReadVarint322, "Negative length: ", ". Reader position: ");
                    m2m.append(this.pos);
                    m2m.append(". Last read tag: ");
                    throw new ProtocolException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m2m, this.tag, '.'));
                }
                if (this.pushedLimit != -1) {
                    Path$$ExternalSyntheticBUOutline0.m();
                    return 0;
                }
                int i4 = this.limit;
                this.pushedLimit = i4;
                int i5 = this.pos + internalReadVarint322;
                this.limit = i5;
                if (i5 <= i4) {
                    return this.tag;
                }
                Path$$ExternalSyntheticBUOutline0.m$1();
                return 0;
            }
            if (i3 != 3) {
                if (i3 == 4) {
                    StringBuilder sb2 = new StringBuilder("Unexpected end group. Reader position: ");
                    sb2.append(this.pos);
                    sb2.append(". Last read tag: ");
                    throw new ProtocolException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb2, this.tag, '.'));
                }
                if (i3 == 5) {
                    this.nextFieldEncoding = FieldEncoding.FIXED32;
                    this.state = 5;
                    return i2;
                }
                StringBuilder m2m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i3, "Unexpected field encoding: ", ". Reader position: ");
                m2m2.append(this.pos);
                m2m2.append(". Last read tag: ");
                throw new ProtocolException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m2m2, this.tag, '.'));
            }
            skipGroup(i2);
        }
        return -1;
    }

    public byte readByte() {
        int i = this.pos;
        if (i == this.limit) {
            Path$$ExternalSyntheticBUOutline0.m$1();
            return (byte) 0;
        }
        byte[] bArr = (byte[]) this.source;
        this.pos = i + 1;
        return bArr[i];
    }

    public int readFixed32() {
        int i = this.state;
        if (i != 5 && i != 2) {
            StringBuilder sb = new StringBuilder("Expected FIXED32 or LENGTH_DELIMITED but was ");
            sb.append(this.state);
            sb.append(". Reader position: ");
            sb.append(this.pos);
            sb.append(". Last read tag: ");
            throw new ProtocolException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.tag, '.'));
        }
        int i2 = this.pos;
        int i3 = i2 + 4;
        if (i3 > this.limit) {
            Path$$ExternalSyntheticBUOutline0.m$1();
            return 0;
        }
        byte[] bArr = (byte[]) this.source;
        int i4 = i2 + 1;
        this.pos = i4;
        int i5 = bArr[i2] & 255;
        int i6 = i2 + 2;
        this.pos = i6;
        int i7 = ((bArr[i4] & 255) << 8) | i5;
        int i8 = i2 + 3;
        this.pos = i8;
        int i9 = i7 | ((bArr[i6] & 255) << 16);
        this.pos = i3;
        int i10 = ((bArr[i8] & 255) << 24) | i9;
        afterPackableScalar(5);
        return i10;
    }

    public long readFixed64() {
        int i = this.state;
        if (i != 1 && i != 2) {
            StringBuilder sb = new StringBuilder("Expected FIXED64 or LENGTH_DELIMITED but was ");
            sb.append(this.state);
            sb.append(". Reader position: ");
            sb.append(this.pos);
            sb.append(". Last read tag: ");
            throw new ProtocolException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.tag, '.'));
        }
        int i2 = this.pos;
        int i3 = i2 + 8;
        if (i3 > this.limit) {
            Path$$ExternalSyntheticBUOutline0.m$1();
            return 0L;
        }
        byte[] bArr = (byte[]) this.source;
        this.pos = i2 + 1;
        this.pos = i2 + 2;
        this.pos = i2 + 3;
        long j = (bArr[i2] & 255) | ((bArr[r4] & 255) << 8) | ((bArr[r9] & 255) << 16);
        this.pos = i2 + 4;
        long j2 = j | ((bArr[r6] & 255) << 24);
        this.pos = i2 + 5;
        long j3 = j2 | ((bArr[r9] & 255) << 32);
        this.pos = i2 + 6;
        this.pos = i2 + 7;
        this.pos = i3;
        long j4 = ((bArr[r0] & 255) << 56) | j3 | ((bArr[r6] & 255) << 40) | ((bArr[r9] & 255) << 48);
        afterPackableScalar(1);
        return j4;
    }

    public void readUnknownField(int i) {
        FieldEncoding fieldEncoding = (FieldEncoding) this.nextFieldEncoding;
        fieldEncoding.getClass();
        addUnknownField(i, fieldEncoding, fieldEncoding.rawProtoAdapter().decode(this));
    }

    public int readVarint32() {
        int i = this.state;
        if (i == 0 || i == 2) {
            int internalReadVarint32 = internalReadVarint32();
            afterPackableScalar(0);
            return internalReadVarint32;
        }
        StringBuilder sb = new StringBuilder("Expected VARINT or LENGTH_DELIMITED but was ");
        sb.append(this.state);
        sb.append(". Reader position: ");
        sb.append(this.pos);
        sb.append(". Last read tag: ");
        throw new ProtocolException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.tag, '.'));
    }

    public long readVarint64() {
        int i = this.state;
        if (i != 0 && i != 2) {
            StringBuilder sb = new StringBuilder("Expected VARINT or LENGTH_DELIMITED but was ");
            sb.append(this.state);
            sb.append(". Reader position: ");
            sb.append(this.pos);
            sb.append(". Last read tag: ");
            throw new ProtocolException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.tag, '.'));
        }
        long j = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            j |= (r6 & Byte.MAX_VALUE) << i2;
            if ((readByte() & 128) == 0) {
                afterPackableScalar(0);
                return j;
            }
        }
        StringBuilder sb2 = new StringBuilder("WireInput encountered a malformed varint. Reader position: ");
        sb2.append(this.pos);
        sb2.append(". Last read tag: ");
        throw new ProtocolException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb2, this.tag, '.'));
    }

    public void resolveAxis() {
        int i;
        PositionConstraint positionConstraint = (PositionConstraint) this.nextFieldEncoding;
        int i2 = this.tag;
        if (i2 == Integer.MIN_VALUE) {
            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
            return;
        }
        int i3 = i2 / 2;
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(positionConstraint.point);
        if (ordinal == 0) {
            int resolve = positionConstraint.resolve();
            this.pos = resolve;
            this.limit = i3 + resolve;
            this.state = resolve + this.tag;
        } else if (ordinal == 1) {
            int resolve2 = positionConstraint.resolve();
            this.limit = resolve2;
            this.pos = resolve2 - i3;
            this.state = resolve2 + i3;
        } else if (ordinal != 2) {
            if (ordinal == 3) {
                int resolve3 = positionConstraint.resolve();
                this.state = resolve3;
                this.limit = resolve3 - i3;
                this.pos = resolve3 - this.tag;
            }
        } else {
            if (this.pushedLimit == Integer.MIN_VALUE) {
                a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                return;
            }
            int resolve4 = positionConstraint.resolve();
            this.recursionDepth = resolve4;
            int i4 = resolve4 - this.pushedLimit;
            this.pos = i4;
            this.limit = i3 + i4;
            this.state = i4 + this.tag;
        }
        if (positionConstraint.point == 3 || (i = this.pushedLimit) == Integer.MIN_VALUE) {
            return;
        }
        this.recursionDepth = this.pos + i;
    }

    public void resolveRange() {
        Constraint constraint = (Constraint) this.protoReader;
        PositionConstraint positionConstraint = (PositionConstraint) this.nextFieldEncoding;
        PositionConstraint positionConstraint2 = (PositionConstraint) this.bufferStack;
        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) this.source;
        if (layoutSpec == null) {
            Intrinsics.throwUninitializedPropertyAccessException("parent");
            throw null;
        }
        View view = layoutSpec.view;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            throw null;
        }
        if (view.getVisibility() == 8) {
            this.tag = 0;
            this.pushedLimit = 0;
            return;
        }
        if (positionConstraint.point == 3 && this.pushedLimit == Integer.MIN_VALUE) {
            ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) this.source;
            if (layoutSpec2 != null) {
                layoutSpec2.measureSelf$contour_release();
                return;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("parent");
                throw null;
            }
        }
        if (positionConstraint2.lambda != null && positionConstraint2.mode == 1) {
            this.tag = Math.abs(positionConstraint.resolve() - positionConstraint2.resolve());
            return;
        }
        if (constraint.lambda != null && constraint.mode == 1) {
            this.tag = constraint.resolve();
            return;
        }
        ContourLayout.LayoutSpec layoutSpec3 = (ContourLayout.LayoutSpec) this.source;
        if (layoutSpec3 != null) {
            layoutSpec3.measureSelf$contour_release();
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("parent");
            throw null;
        }
    }

    public void rightTo(int i, Function1 function1) {
        CameraSelector$$ExternalSyntheticOutline0.checkNotZero(i);
        PositionConstraint positionConstraint = (PositionConstraint) this.bufferStack;
        positionConstraint.getClass();
        positionConstraint.point = 4;
        positionConstraint.setMode(i);
        positionConstraint.lambda = new XYIntUtilsKt$unwrapXIntLambda$1(0, function1);
        this.pushedLimit = 0;
    }

    public void skip() {
        int i = this.state;
        if (i == 0) {
            readVarint64();
            return;
        }
        if (i == 1) {
            readFixed64();
            return;
        }
        if (i != 2) {
            if (i == 5) {
                readFixed32();
                return;
            } else {
                a$$ExternalSyntheticBUOutline0.m$1("Unexpected call to skip()");
                return;
            }
        }
        int beforeLengthDelimitedScalar = this.pos + beforeLengthDelimitedScalar();
        if (beforeLengthDelimitedScalar <= this.limit) {
            this.pos = beforeLengthDelimitedScalar;
        } else {
            Path$$ExternalSyntheticBUOutline0.m$1();
        }
    }

    public void skipGroup(int i) {
        while (this.pos < this.limit) {
            int internalReadVarint32 = internalReadVarint32();
            if (internalReadVarint32 == 0) {
                StringBuilder sb = new StringBuilder("Unexpected tag 0. Reader position: ");
                sb.append(this.pos);
                sb.append(". Last read tag: ");
                throw new ProtocolException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.tag, '.'));
            }
            int i2 = internalReadVarint32 >>> 3;
            int i3 = internalReadVarint32 & 7;
            if (i3 == 0) {
                this.state = 0;
                readVarint64();
            } else if (i3 == 1) {
                this.state = 1;
                readFixed64();
            } else if (i3 == 2) {
                int internalReadVarint322 = internalReadVarint32();
                if (internalReadVarint322 < 0) {
                    StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(internalReadVarint322, "Negative length: ", ". Reader position: ");
                    m2m.append(this.pos);
                    m2m.append(". Last read tag: ");
                    m2m.append(i2);
                    m2m.append('.');
                    throw new ProtocolException(m2m.toString());
                }
                int i4 = this.pos + internalReadVarint322;
                if (i4 > this.limit) {
                    Path$$ExternalSyntheticBUOutline0.m$1();
                    return;
                }
                this.pos = i4;
            } else {
                if (i3 == 3) {
                    int i5 = this.recursionDepth + 1;
                    this.recursionDepth = i5;
                    if (i5 > 100) {
                        throw new IOException("Wire recursion limit exceeded");
                    }
                    try {
                        skipGroup(i2);
                    } finally {
                    }
                    this.recursionDepth--;
                }
                if (i3 == 4) {
                    if (i2 == i) {
                        return;
                    }
                    throw new ProtocolException("Unexpected end group. Reader position: " + this.pos + ". Last read tag: " + i2 + '.');
                }
                if (i3 != 5) {
                    StringBuilder m2m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i3, "Unexpected field encoding: ", ". Reader position: ");
                    m2m2.append(this.pos);
                    m2m2.append(". Last read tag: ");
                    m2m2.append(i2);
                    m2m2.append('.');
                    throw new ProtocolException(m2m2.toString());
                }
                this.state = 5;
                readFixed32();
            }
        }
        Path$$ExternalSyntheticBUOutline0.m$1();
    }

    public ByteArrayProtoReader32 widthOf(int i, Function1 function1) {
        CameraSelector$$ExternalSyntheticOutline0.checkNotZero(i);
        Constraint constraint = (Constraint) this.protoReader;
        constraint.setMode(i);
        constraint.lambda = new XYIntUtilsKt$unwrapXIntLambda$1(0, function1);
        this.pushedLimit = 0;
        return this;
    }

    public ByteArrayProtoReader32(byte[] bArr, int i) {
        bArr.getClass();
        this.source = bArr;
        this.pos = 0;
        this.limit = i;
        this.state = 2;
        this.tag = -1;
        this.pushedLimit = -1;
        this.bufferStack = new ArrayList();
    }
}
