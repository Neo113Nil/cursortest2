package com.squareup.wire;

import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.time.DurationKt;
import okio.Buffer;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public final class ProtoReader32AsProtoReader extends ProtoReader {
    public final ByteArrayProtoReader32 delegate;

    public ProtoReader32AsProtoReader(ByteArrayProtoReader32 byteArrayProtoReader32) {
        super(new Buffer());
        this.delegate = byteArrayProtoReader32;
    }

    @Override // com.squareup.wire.ProtoReader
    public final void addUnknownField(int i, FieldEncoding fieldEncoding, Object obj) {
        this.delegate.addUnknownField(i, fieldEncoding, obj);
    }

    @Override // com.squareup.wire.ProtoReader
    public final boolean beforePossiblyPackedScalar$wire_runtime() {
        return this.delegate.beforePossiblyPackedScalar();
    }

    @Override // com.squareup.wire.ProtoReader
    public final long beginMessage() {
        return this.delegate.beginMessage();
    }

    @Override // com.squareup.wire.ProtoReader
    public final ByteString endMessageAndGetUnknownFields(long j) {
        return this.delegate.endMessageAndGetUnknownFields((int) j);
    }

    @Override // com.squareup.wire.ProtoReader
    public final int nextTag() {
        return this.delegate.nextTag();
    }

    @Override // com.squareup.wire.ProtoReader
    public final FieldEncoding peekFieldEncoding() {
        return (FieldEncoding) this.delegate.nextFieldEncoding;
    }

    @Override // com.squareup.wire.ProtoReader
    public final ByteString readBytes() {
        ByteArrayProtoReader32 byteArrayProtoReader32 = this.delegate;
        int beforeLengthDelimitedScalar = byteArrayProtoReader32.beforeLengthDelimitedScalar();
        int i = byteArrayProtoReader32.pos;
        int i2 = i + beforeLengthDelimitedScalar;
        if (i2 > byteArrayProtoReader32.limit) {
            Path$$ExternalSyntheticBUOutline0.m$1();
            return null;
        }
        ByteString.Companion companion = ByteString.Companion;
        byte[] bArr = (byte[]) byteArrayProtoReader32.source;
        bArr.getClass();
        DurationKt.checkOffsetAndCount(bArr.length, i, beforeLengthDelimitedScalar);
        ByteString byteString = new ByteString(ArraysKt___ArraysJvmKt.copyOfRange(bArr, i, i2));
        byteArrayProtoReader32.pos = i2;
        return byteString;
    }

    @Override // com.squareup.wire.ProtoReader
    public final int readFixed32() {
        return this.delegate.readFixed32();
    }

    @Override // com.squareup.wire.ProtoReader
    public final long readFixed64() {
        return this.delegate.readFixed64();
    }

    @Override // com.squareup.wire.ProtoReader
    public final String readString() {
        ByteArrayProtoReader32 byteArrayProtoReader32 = this.delegate;
        int beforeLengthDelimitedScalar = byteArrayProtoReader32.beforeLengthDelimitedScalar();
        int i = byteArrayProtoReader32.pos;
        int i2 = beforeLengthDelimitedScalar + i;
        if (i2 > byteArrayProtoReader32.limit) {
            Path$$ExternalSyntheticBUOutline0.m$1();
            return null;
        }
        String decodeToString$default = StringsKt__StringsJVMKt.decodeToString$default(i, i2, 4, (byte[]) byteArrayProtoReader32.source);
        byteArrayProtoReader32.pos = i2;
        return decodeToString$default;
    }

    @Override // com.squareup.wire.ProtoReader
    public final void readUnknownField(int i) {
        this.delegate.readUnknownField(i);
    }

    @Override // com.squareup.wire.ProtoReader
    public final int readVarint32() {
        return this.delegate.readVarint32();
    }

    @Override // com.squareup.wire.ProtoReader
    public final long readVarint64() {
        return this.delegate.readVarint64();
    }

    @Override // com.squareup.wire.ProtoReader
    public final void skip() {
        this.delegate.skip();
    }
}
