package com.google.android.exoplayer2.video.spherical;

import com.google.android.exoplayer2.util.Assertions;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Deprecated
/* loaded from: classes3.dex */
final class Projection {
    public static final int DRAW_MODE_TRIANGLES = 0;
    public static final int DRAW_MODE_TRIANGLES_FAN = 2;
    public static final int DRAW_MODE_TRIANGLES_STRIP = 1;
    public static final int POSITION_COORDS_PER_VERTEX = 3;
    public static final int TEXTURE_COORDS_PER_VERTEX = 2;
    public final Mesh leftMesh;
    public final Mesh rightMesh;
    public final boolean singleMesh;
    public final int stereoMode;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DrawMode {
    }

    public static final class Mesh {
        private final SubMesh[] subMeshes;

        public Mesh(SubMesh... subMeshArr) {
            this.subMeshes = subMeshArr;
        }

        public SubMesh getSubMesh(int i8) {
            return this.subMeshes[i8];
        }

        public int getSubMeshCount() {
            return this.subMeshes.length;
        }
    }

    public static final class SubMesh {
        public static final int VIDEO_TEXTURE_ID = 0;
        public final int mode;
        public final float[] textureCoords;
        public final int textureId;
        public final float[] vertices;

        public SubMesh(int i8, float[] fArr, float[] fArr2, int i9) {
            this.textureId = i8;
            Assertions.checkArgument(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.vertices = fArr;
            this.textureCoords = fArr2;
            this.mode = i9;
        }

        public int getVertexCount() {
            return this.vertices.length / 3;
        }
    }

    public Projection(Mesh mesh, int i8) {
        this(mesh, mesh, i8);
    }

    public static Projection createEquirectangular(int i8) {
        return createEquirectangular(50.0f, 36, 72, 180.0f, 360.0f, i8);
    }

    public Projection(Mesh mesh, Mesh mesh2, int i8) {
        this.leftMesh = mesh;
        this.rightMesh = mesh2;
        this.stereoMode = i8;
        this.singleMesh = mesh == mesh2;
    }

    public static Projection createEquirectangular(float f8, int i8, int i9, float f9, float f10, int i10) {
        int i11;
        float f11;
        int i12;
        int i13;
        int i14;
        float[] fArr;
        int i15 = i8;
        int i16 = i9;
        Assertions.checkArgument(f8 > 0.0f);
        Assertions.checkArgument(i15 >= 1);
        Assertions.checkArgument(i16 >= 1);
        Assertions.checkArgument(f9 > 0.0f && f9 <= 180.0f);
        Assertions.checkArgument(f10 > 0.0f && f10 <= 360.0f);
        float radians = (float) Math.toRadians(f9);
        float radians2 = (float) Math.toRadians(f10);
        float f12 = radians / i15;
        float f13 = radians2 / i16;
        int i17 = i16 + 1;
        int i18 = ((i17 * 2) + 2) * i15;
        float[] fArr2 = new float[i18 * 3];
        float[] fArr3 = new float[i18 * 2];
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        while (i19 < i15) {
            float f14 = radians / 2.0f;
            float f15 = (i19 * f12) - f14;
            int i22 = i19 + 1;
            float f16 = (i22 * f12) - f14;
            int i23 = 0;
            while (i23 < i17) {
                float f17 = f15;
                int i24 = i22;
                int i25 = 2;
                int i26 = 0;
                while (i26 < i25) {
                    if (i26 == 0) {
                        f11 = f17;
                        i11 = i17;
                    } else {
                        i11 = i17;
                        f11 = f16;
                    }
                    float f18 = i23 * f13;
                    float f19 = f13;
                    int i27 = i23;
                    double d8 = f8;
                    float f20 = f12;
                    double d9 = (f18 + 3.1415927f) - (radians2 / 2.0f);
                    int i28 = i26;
                    double d10 = f11;
                    float[] fArr4 = fArr3;
                    float f21 = f16;
                    fArr2[i20] = -((float) (Math.sin(d9) * d8 * Math.cos(d10)));
                    float f22 = radians;
                    float f23 = radians2;
                    fArr2[i20 + 1] = (float) (d8 * Math.sin(d10));
                    int i29 = i20 + 3;
                    fArr2[i20 + 2] = (float) (d8 * Math.cos(d9) * Math.cos(d10));
                    fArr4[i21] = f18 / f23;
                    int i30 = i21 + 2;
                    fArr4[i21 + 1] = ((i19 + i28) * f20) / f22;
                    if (i27 == 0 && i28 == 0) {
                        i12 = i9;
                        i13 = i27;
                        i14 = i28;
                    } else {
                        i12 = i9;
                        i13 = i27;
                        i14 = i28;
                        if (i13 != i12 || i14 != 1) {
                            fArr = fArr4;
                            i25 = 2;
                            i21 = i30;
                            i20 = i29;
                            i26 = i14 + 1;
                            i16 = i12;
                            i23 = i13;
                            fArr3 = fArr;
                            radians = f22;
                            i17 = i11;
                            f13 = f19;
                            f12 = f20;
                            radians2 = f23;
                            f16 = f21;
                        }
                    }
                    System.arraycopy(fArr2, i20, fArr2, i29, 3);
                    i20 += 6;
                    fArr = fArr4;
                    i25 = 2;
                    System.arraycopy(fArr, i21, fArr, i30, 2);
                    i21 += 4;
                    i26 = i14 + 1;
                    i16 = i12;
                    i23 = i13;
                    fArr3 = fArr;
                    radians = f22;
                    i17 = i11;
                    f13 = f19;
                    f12 = f20;
                    radians2 = f23;
                    f16 = f21;
                }
                float f24 = radians2;
                int i31 = i23;
                int i32 = i16;
                int i33 = i31 + 1;
                f15 = f17;
                i22 = i24;
                f12 = f12;
                radians2 = f24;
                f16 = f16;
                i16 = i32;
                i23 = i33;
            }
            i15 = i8;
            i19 = i22;
        }
        return new Projection(new Mesh(new SubMesh(0, fArr2, fArr3, 1)), i10);
    }
}
