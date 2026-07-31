package com.yandex.mobile.ads.impl;

import android.opengl.GLES20;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class ee0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f25261a;

    /* renamed from: b, reason: collision with root package name */
    private final a[] f25262b;

    /* renamed from: c, reason: collision with root package name */
    private final b[] f25263c;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f25264d;

    /* renamed from: e, reason: collision with root package name */
    private final HashMap f25265e;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f25266a;

        private a(String str) {
            this.f25266a = str;
        }

        public static a a(int i4, int i5) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i4, 35722, iArr, 0);
            int i6 = iArr[0];
            byte[] bArr = new byte[i6];
            GLES20.glGetActiveAttrib(i4, i5, i6, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            int i7 = 0;
            while (true) {
                if (i7 >= i6) {
                    break;
                }
                if (bArr[i7] == 0) {
                    i6 = i7;
                    break;
                }
                i7++;
            }
            String str = new String(bArr, 0, i6);
            GLES20.glGetAttribLocation(i4, str);
            return new a(str);
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f25267a;

        private b(String str) {
            this.f25267a = str;
        }

        public static b a(int i4, int i5) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i4, 35719, iArr, 0);
            int i6 = iArr[0];
            byte[] bArr = new byte[i6];
            GLES20.glGetActiveUniform(i4, i5, i6, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            int i7 = 0;
            while (true) {
                if (i7 >= i6) {
                    break;
                }
                if (bArr[i7] == 0) {
                    i6 = i7;
                    break;
                }
                i7++;
            }
            String str = new String(bArr, 0, i6);
            GLES20.glGetUniformLocation(i4, str);
            return new b(str);
        }
    }

    public ee0() {
        int glCreateProgram = GLES20.glCreateProgram();
        this.f25261a = glCreateProgram;
        fe0.a();
        a(glCreateProgram, 35633, "uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n");
        a(glCreateProgram, 35632, "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            fe0.a("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(glCreateProgram));
        }
        GLES20.glUseProgram(glCreateProgram);
        this.f25264d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35721, iArr2, 0);
        this.f25262b = new a[iArr2[0]];
        for (int i4 = 0; i4 < iArr2[0]; i4++) {
            a a4 = a.a(this.f25261a, i4);
            this.f25262b[i4] = a4;
            this.f25264d.put(a4.f25266a, a4);
        }
        this.f25265e = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.f25261a, 35718, iArr3, 0);
        this.f25263c = new b[iArr3[0]];
        for (int i5 = 0; i5 < iArr3[0]; i5++) {
            b a5 = b.a(this.f25261a, i5);
            this.f25263c[i5] = a5;
            this.f25265e.put(a5.f25267a, a5);
        }
        fe0.a();
    }

    private static void a(int i4, int i5, String str) {
        int glCreateShader = GLES20.glCreateShader(i5);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            String str2 = GLES20.glGetShaderInfoLog(glCreateShader) + ", source: " + str;
            int i6 = fe0.f25763b;
            ms0.b("GlUtil", str2);
        }
        GLES20.glAttachShader(i4, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        fe0.a();
    }

    public final int b(String str) {
        return GLES20.glGetUniformLocation(this.f25261a, str);
    }

    public final int a(String str) {
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.f25261a, str);
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        fe0.a();
        return glGetAttribLocation;
    }
}
