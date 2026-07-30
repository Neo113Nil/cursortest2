package com.baidu.ar;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

/* loaded from: classes.dex */
public class he {

    /* renamed from: m, reason: collision with root package name */
    public static final float[] f2407m;

    /* renamed from: n, reason: collision with root package name */
    public static final short[] f2408n = {0, 1, 2, 0, 2, 3};

    /* renamed from: o, reason: collision with root package name */
    public static final float[] f2409o = {-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f};

    /* renamed from: p, reason: collision with root package name */
    public static final float[] f2410p = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f};

    /* renamed from: a, reason: collision with root package name */
    public FloatBuffer f2411a;

    /* renamed from: b, reason: collision with root package name */
    public FloatBuffer f2412b;

    /* renamed from: c, reason: collision with root package name */
    public ShortBuffer f2413c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2414d;

    /* renamed from: e, reason: collision with root package name */
    public int f2415e;

    /* renamed from: f, reason: collision with root package name */
    public int f2416f;

    /* renamed from: g, reason: collision with root package name */
    public int f2417g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f2418h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f2419i;

    /* renamed from: j, reason: collision with root package name */
    public int f2420j;

    /* renamed from: k, reason: collision with root package name */
    public int f2421k;

    /* renamed from: l, reason: collision with root package name */
    public int f2422l;

    static {
        float[] fArr = new float[16];
        f2407m = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    public he(int i8, int i9) {
        String str;
        this.f2420j = i8;
        float[] fArr = f2409o;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        this.f2411a = asFloatBuffer;
        asFloatBuffer.put(fArr);
        this.f2411a.position(0);
        short[] sArr = f2408n;
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(sArr.length * 2);
        allocateDirect2.order(ByteOrder.nativeOrder());
        ShortBuffer asShortBuffer = allocateDirect2.asShortBuffer();
        this.f2413c = asShortBuffer;
        asShortBuffer.put(sArr);
        this.f2413c.position(0);
        float[] fArr2 = f2410p;
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(fArr2.length * 4);
        allocateDirect3.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect3.asFloatBuffer();
        this.f2412b = asFloatBuffer2;
        asFloatBuffer2.put(fArr2);
        this.f2412b.position(0);
        int a8 = a(35633, "attribute vec4 vPosition;\nuniform mat4 uMVPMatrix;uniform mat4 uTextureMatrix;\nattribute vec4 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nvoid main()\n{\n  gl_Position = uMVPMatrix * vPosition;\n  textureCoordinate = (uTextureMatrix * inputTextureCoordinate).xy;\n}");
        if (i9 != 0) {
            if (i9 == 1) {
                str = "precision mediump float;\nuniform sampler2D s_texture;\nvarying vec2 textureCoordinate;\nvoid main()\n{\n  gl_FragColor = texture2D(s_texture, textureCoordinate);\n}";
            } else if (i9 == 2) {
                str = "precision mediump float;\nuniform sampler2D s_texture;\nvarying vec2 textureCoordinate;\nvoid main()\n{\n  vec4 vCameraColor = texture2D(s_texture, textureCoordinate);\n  float fGrayColor = (0.3*vCameraColor.r + 0.59*vCameraColor.g + 0.11*vCameraColor.b);\n  gl_FragColor = vec4(fGrayColor, fGrayColor, fGrayColor, 1.0);\n}";
            }
            int a9 = a(35632, str);
            int glCreateProgram = GLES20.glCreateProgram();
            this.f2414d = glCreateProgram;
            GLES20.glAttachShader(glCreateProgram, a8);
            GLES20.glAttachShader(glCreateProgram, a9);
            GLES20.glLinkProgram(glCreateProgram);
        }
        str = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;varying vec2 textureCoordinate;\nuniform samplerExternalOES s_texture;\nvoid main() {  gl_FragColor = texture2D( s_texture, textureCoordinate );\n}";
        int a92 = a(35632, str);
        int glCreateProgram2 = GLES20.glCreateProgram();
        this.f2414d = glCreateProgram2;
        GLES20.glAttachShader(glCreateProgram2, a8);
        GLES20.glAttachShader(glCreateProgram2, a92);
        GLES20.glLinkProgram(glCreateProgram2);
    }

    public final int a(int i8, String str) {
        int glCreateShader = GLES20.glCreateShader(i8);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        return glCreateShader;
    }

    public void a(int i8, int i9) {
        this.f2421k = i8;
        this.f2422l = i9;
    }

    public void a(float[] fArr, float[] fArr2, int i8, int i9) {
        if (fArr == null) {
            fArr = f2407m;
        }
        if (fArr2 == null) {
            fArr2 = f2407m;
        }
        GLES20.glBindFramebuffer(36160, i9);
        GLES20.glViewport(0, 0, this.f2421k, this.f2422l);
        GLES20.glClear(16384);
        GLES20.glClearColor(1.0f, 1.0f, 0.0f, 1.0f);
        if (-1 == i8) {
            return;
        }
        GLES20.glUseProgram(this.f2414d);
        this.f2417g = GLES20.glGetUniformLocation(this.f2414d, "uTextureMatrix");
        this.f2418h = GLES20.glGetUniformLocation(this.f2414d, "s_texture");
        this.f2419i = GLES20.glGetUniformLocation(this.f2414d, "uMVPMatrix");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(this.f2420j, i8);
        GLES20.glUniform1i(this.f2418h, 0);
        int i10 = this.f2419i;
        if (i10 >= 0) {
            GLES20.glUniformMatrix4fv(i10, 1, false, fArr, 0);
        }
        int i11 = this.f2417g;
        if (i11 >= 0) {
            GLES20.glUniformMatrix4fv(i11, 1, false, fArr2, 0);
        }
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.f2414d, "vPosition");
        this.f2415e = glGetAttribLocation;
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        GLES20.glVertexAttribPointer(this.f2415e, 2, 5126, false, 8, (Buffer) this.f2411a);
        int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.f2414d, "inputTextureCoordinate");
        this.f2416f = glGetAttribLocation2;
        GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
        GLES20.glVertexAttribPointer(this.f2416f, 2, 5126, false, 8, (Buffer) this.f2412b);
        GLES20.glDrawElements(4, f2408n.length, 5123, this.f2413c);
        GLES20.glDisableVertexAttribArray(this.f2415e);
        GLES20.glDisableVertexAttribArray(this.f2416f);
        GLES20.glBindTexture(this.f2420j, 0);
        GLES20.glUseProgram(0);
        GLES20.glBindFramebuffer(36160, 0);
    }
}
