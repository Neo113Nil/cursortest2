package com.squareup.wire;

import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* loaded from: classes.dex */
public final class IntArrayProtoAdapter extends ProtoAdapter {
    public final /* synthetic */ int $r8$classId;
    public final ProtoAdapter originalAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntArrayProtoAdapter(ProtoAdapter protoAdapter, int i) {
        super(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(int[].class), (String) null, protoAdapter.getSyntax(), new int[0], 32);
        this.$r8$classId = i;
        switch (i) {
            case 1:
                super(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(long[].class), (String) null, protoAdapter.getSyntax(), new long[0], 32);
                this.originalAdapter = protoAdapter;
                break;
            default:
                this.originalAdapter = protoAdapter;
                break;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader32 protoReader32) {
        int i = this.$r8$classId;
        ProtoAdapter protoAdapter = this.originalAdapter;
        switch (i) {
            case 0:
                protoReader32.getClass();
                return new int[]{((Number) protoAdapter.decode(protoReader32)).intValue()};
            case 1:
                protoReader32.getClass();
                return new long[]{((Number) protoAdapter.decode(protoReader32)).longValue()};
            default:
                protoReader32.getClass();
                Object identity = protoAdapter.getIdentity();
                ByteArrayProtoReader32 byteArrayProtoReader32 = (ByteArrayProtoReader32) protoReader32;
                int beginMessage = byteArrayProtoReader32.beginMessage();
                while (true) {
                    int nextTag = byteArrayProtoReader32.nextTag();
                    if (nextTag == -1) {
                        byteArrayProtoReader32.endMessageAndGetUnknownFields(beginMessage);
                        return identity;
                    }
                    if (nextTag == 1) {
                        identity = protoAdapter.decode(byteArrayProtoReader32);
                    } else {
                        byteArrayProtoReader32.readUnknownField(nextTag);
                    }
                }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        int i = this.$r8$classId;
        ProtoAdapter protoAdapter = this.originalAdapter;
        switch (i) {
            case 0:
                int[] iArr = (int[]) obj;
                reverseProtoWriter.getClass();
                iArr.getClass();
                for (int length = iArr.length - 1; -1 < length; length--) {
                    protoAdapter.encode(reverseProtoWriter, Integer.valueOf(iArr[length]));
                }
                break;
            case 1:
                long[] jArr = (long[]) obj;
                reverseProtoWriter.getClass();
                jArr.getClass();
                for (int length2 = jArr.length - 1; -1 < length2; length2--) {
                    protoAdapter.encode(reverseProtoWriter, Long.valueOf(jArr[length2]));
                }
                break;
            default:
                reverseProtoWriter.getClass();
                if (obj != null && !obj.equals(protoAdapter.getIdentity())) {
                    protoAdapter.encodeWithTag(reverseProtoWriter, 1, obj);
                    break;
                }
                break;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encodeWithTag(ProtoWriter protoWriter, int i, Object obj) {
        switch (this.$r8$classId) {
            case 0:
                int[] iArr = (int[]) obj;
                protoWriter.getClass();
                if (iArr != null && iArr.length != 0) {
                    super.encodeWithTag(protoWriter, i, iArr);
                    break;
                }
                break;
            case 1:
                long[] jArr = (long[]) obj;
                protoWriter.getClass();
                if (jArr != null && jArr.length != 0) {
                    super.encodeWithTag(protoWriter, i, jArr);
                    break;
                }
                break;
            default:
                super.encodeWithTag(protoWriter, i, obj);
                break;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int i = this.$r8$classId;
        int i2 = 0;
        ProtoAdapter protoAdapter = this.originalAdapter;
        switch (i) {
            case 0:
                int[] iArr = (int[]) obj;
                iArr.getClass();
                int length = iArr.length;
                int i3 = 0;
                while (i2 < length) {
                    i3 += protoAdapter.encodedSize(Integer.valueOf(iArr[i2]));
                    i2++;
                }
                return i3;
            case 1:
                long[] jArr = (long[]) obj;
                jArr.getClass();
                int length2 = jArr.length;
                int i4 = 0;
                while (i2 < length2) {
                    i4 += protoAdapter.encodedSize(Long.valueOf(jArr[i2]));
                    i2++;
                }
                return i4;
            default:
                if (obj == null || obj.equals(protoAdapter.getIdentity())) {
                    return 0;
                }
                return protoAdapter.encodedSizeWithTag(1, obj);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSizeWithTag(int i, Object obj) {
        switch (this.$r8$classId) {
            case 0:
                int[] iArr = (int[]) obj;
                if (iArr == null || iArr.length == 0) {
                    return 0;
                }
                return super.encodedSizeWithTag(i, iArr);
            case 1:
                long[] jArr = (long[]) obj;
                if (jArr == null || jArr.length == 0) {
                    return 0;
                }
                return super.encodedSizeWithTag(i, jArr);
            default:
                return super.encodedSizeWithTag(i, obj);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((int[]) obj).getClass();
                return new int[0];
            case 1:
                ((long[]) obj).getClass();
                return new long[0];
            default:
                if (obj == null) {
                    return null;
                }
                return this.originalAdapter.redact(obj);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encodeWithTag(ReverseProtoWriter reverseProtoWriter, int i, Object obj) {
        switch (this.$r8$classId) {
            case 0:
                int[] iArr = (int[]) obj;
                reverseProtoWriter.getClass();
                if (iArr != null && iArr.length != 0) {
                    super.encodeWithTag(reverseProtoWriter, i, iArr);
                    break;
                }
                break;
            case 1:
                long[] jArr = (long[]) obj;
                reverseProtoWriter.getClass();
                if (jArr != null && jArr.length != 0) {
                    super.encodeWithTag(reverseProtoWriter, i, jArr);
                    break;
                }
                break;
            default:
                super.encodeWithTag(reverseProtoWriter, i, obj);
                break;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IntArrayProtoAdapter(String str, ProtoAdapter protoAdapter, KClass kClass, Object obj) {
        super(r2, kClass, str, r5, obj, 32);
        this.$r8$classId = 2;
        FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        Syntax syntax = Syntax.PROTO_3;
        this.originalAdapter = protoAdapter;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        int i = this.$r8$classId;
        int i2 = 0;
        ProtoAdapter protoAdapter = this.originalAdapter;
        switch (i) {
            case 0:
                int[] iArr = (int[]) obj;
                iArr.getClass();
                int length = iArr.length;
                while (i2 < length) {
                    protoAdapter.encode(protoWriter, Integer.valueOf(iArr[i2]));
                    i2++;
                }
                break;
            case 1:
                long[] jArr = (long[]) obj;
                jArr.getClass();
                int length2 = jArr.length;
                while (i2 < length2) {
                    protoAdapter.encode(protoWriter, Long.valueOf(jArr[i2]));
                    i2++;
                }
                break;
            default:
                if (obj != null && !obj.equals(protoAdapter.getIdentity())) {
                    protoAdapter.encodeWithTag(protoWriter, 1, obj);
                    break;
                }
                break;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        int i = this.$r8$classId;
        ProtoAdapter protoAdapter = this.originalAdapter;
        switch (i) {
            case 0:
                protoReader.getClass();
                return new int[]{((Number) protoAdapter.decode(protoReader)).intValue()};
            case 1:
                protoReader.getClass();
                return new long[]{((Number) protoAdapter.decode(protoReader)).longValue()};
            default:
                protoReader.getClass();
                Object identity = protoAdapter.getIdentity();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessageAndGetUnknownFields(beginMessage);
                        return identity;
                    }
                    if (nextTag == 1) {
                        identity = protoAdapter.decode(protoReader);
                    } else {
                        protoReader.readUnknownField(nextTag);
                    }
                }
        }
    }
}
