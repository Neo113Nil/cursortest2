package com.squareup.wire;

import kotlin.jvm.internal.Reflection;

/* loaded from: classes.dex */
public final class FloatArrayProtoAdapter extends ProtoAdapter {
    public final /* synthetic */ int $r8$classId = 0;
    public final ProtoAdapter originalAdapter;

    public FloatArrayProtoAdapter(FloatProtoAdapter floatProtoAdapter, byte b) {
        super(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(double[].class), (String) null, floatProtoAdapter.getSyntax(), new double[0], 32);
        this.originalAdapter = floatProtoAdapter;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader32 protoReader32) {
        switch (this.$r8$classId) {
            case 0:
                protoReader32.getClass();
                return new float[]{Float.intBitsToFloat(((ByteArrayProtoReader32) protoReader32).readFixed32())};
            default:
                protoReader32.getClass();
                return new double[]{Double.longBitsToDouble(((ByteArrayProtoReader32) protoReader32).readFixed64())};
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        switch (this.$r8$classId) {
            case 0:
                float[] fArr = (float[]) obj;
                reverseProtoWriter.getClass();
                fArr.getClass();
                for (int length = fArr.length - 1; -1 < length; length--) {
                    reverseProtoWriter.writeFixed32(Float.floatToIntBits(fArr[length]));
                }
                break;
            default:
                double[] dArr = (double[]) obj;
                reverseProtoWriter.getClass();
                dArr.getClass();
                for (int length2 = dArr.length - 1; -1 < length2; length2--) {
                    reverseProtoWriter.writeFixed64(Double.doubleToLongBits(dArr[length2]));
                }
                break;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encodeWithTag(ProtoWriter protoWriter, int i, Object obj) {
        switch (this.$r8$classId) {
            case 0:
                float[] fArr = (float[]) obj;
                protoWriter.getClass();
                if (fArr != null && fArr.length != 0) {
                    super.encodeWithTag(protoWriter, i, fArr);
                    break;
                }
                break;
            default:
                double[] dArr = (double[]) obj;
                protoWriter.getClass();
                if (dArr != null && dArr.length != 0) {
                    super.encodeWithTag(protoWriter, i, dArr);
                    break;
                }
                break;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int i = this.$r8$classId;
        ProtoAdapter protoAdapter = this.originalAdapter;
        int i2 = 0;
        switch (i) {
            case 0:
                float[] fArr = (float[]) obj;
                fArr.getClass();
                int length = fArr.length;
                int i3 = 0;
                while (i2 < length) {
                    float f = fArr[i2];
                    ((FloatProtoAdapter) protoAdapter).getClass();
                    i3 += 4;
                    i2++;
                }
                return i3;
            default:
                double[] dArr = (double[]) obj;
                dArr.getClass();
                int length2 = dArr.length;
                int i4 = 0;
                while (i2 < length2) {
                    ((FloatProtoAdapter) protoAdapter).encodedSize(Double.valueOf(dArr[i2]));
                    i4 += 8;
                    i2++;
                }
                return i4;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSizeWithTag(int i, Object obj) {
        switch (this.$r8$classId) {
            case 0:
                float[] fArr = (float[]) obj;
                if (fArr == null || fArr.length == 0) {
                    return 0;
                }
                return super.encodedSizeWithTag(i, fArr);
            default:
                double[] dArr = (double[]) obj;
                if (dArr == null || dArr.length == 0) {
                    return 0;
                }
                return super.encodedSizeWithTag(i, dArr);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((float[]) obj).getClass();
                return new float[0];
            default:
                ((double[]) obj).getClass();
                return new double[0];
        }
    }

    public FloatArrayProtoAdapter(FloatProtoAdapter floatProtoAdapter) {
        super(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(float[].class), (String) null, floatProtoAdapter.getSyntax(), new float[0], 32);
        this.originalAdapter = floatProtoAdapter;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encodeWithTag(ReverseProtoWriter reverseProtoWriter, int i, Object obj) {
        switch (this.$r8$classId) {
            case 0:
                float[] fArr = (float[]) obj;
                reverseProtoWriter.getClass();
                if (fArr != null && fArr.length != 0) {
                    super.encodeWithTag(reverseProtoWriter, i, fArr);
                    break;
                }
                break;
            default:
                double[] dArr = (double[]) obj;
                reverseProtoWriter.getClass();
                if (dArr != null && dArr.length != 0) {
                    super.encodeWithTag(reverseProtoWriter, i, dArr);
                    break;
                }
                break;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        switch (this.$r8$classId) {
            case 0:
                protoReader.getClass();
                return new float[]{Float.intBitsToFloat(protoReader.readFixed32())};
            default:
                protoReader.getClass();
                return new double[]{Double.longBitsToDouble(protoReader.readFixed64())};
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        int i = this.$r8$classId;
        ProtoAdapter protoAdapter = this.originalAdapter;
        int i2 = 0;
        switch (i) {
            case 0:
                float[] fArr = (float[]) obj;
                fArr.getClass();
                int length = fArr.length;
                while (i2 < length) {
                    ((FloatProtoAdapter) protoAdapter).encode(protoWriter, Float.valueOf(fArr[i2]));
                    i2++;
                }
                break;
            default:
                double[] dArr = (double[]) obj;
                dArr.getClass();
                int length2 = dArr.length;
                while (i2 < length2) {
                    ((FloatProtoAdapter) protoAdapter).encode(protoWriter, Double.valueOf(dArr[i2]));
                    i2++;
                }
                break;
        }
    }
}
