package com.baidu.ar.camera;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

/* loaded from: classes.dex */
public class DuMixDrawer {

    /* renamed from: n, reason: collision with root package name */
    public static float[] f1933n = {-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f};

    /* renamed from: o, reason: collision with root package name */
    public static float[] f1934o = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f};

    /* renamed from: a, reason: collision with root package name */
    public FloatBuffer f1935a;

    /* renamed from: b, reason: collision with root package name */
    public FloatBuffer f1936b;

    /* renamed from: d, reason: collision with root package name */
    public ShortBuffer f1938d;

    /* renamed from: f, reason: collision with root package name */
    public int f1940f;

    /* renamed from: l, reason: collision with root package name */
    public int f1946l;

    /* renamed from: m, reason: collision with root package name */
    public int f1947m;

    /* renamed from: c, reason: collision with root package name */
    public int[] f1937c = new int[1];

    /* renamed from: e, reason: collision with root package name */
    public int[] f1939e = new int[1];

    /* renamed from: g, reason: collision with root package name */
    public int f1941g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f1942h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f1943i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f1944j = -1;

    /* renamed from: k, reason: collision with root package name */
    public short[] f1945k = {0, 1, 2, 0, 2, 3};

    public DuMixDrawer(int i8, int i9) {
        this.f1946l = i8;
        this.f1947m = i9;
        a();
    }

    public final int a(int i8, String str) {
        int glCreateShader = GLES20.glCreateShader(i8);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        return glCreateShader;
    }

    public void destroyGL() {
        GLES20.glUseProgram(0);
        GLES20.glFinish();
        GLES20.glDisableVertexAttribArray(this.f1941g);
        GLES20.glDisableVertexAttribArray(this.f1942h);
        int[] iArr = this.f1937c;
        GLES20.glDeleteBuffers(iArr.length, iArr, 0);
        int[] iArr2 = this.f1939e;
        GLES20.glDeleteBuffers(iArr2.length, iArr2, 0);
    }

    public void draw(float[] fArr) {
        if (this.f1944j == -1) {
            this.f1944j = GLES20.glGetUniformLocation(this.f1940f, "inputTexture");
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(this.f1947m, this.f1946l);
            GLES20.glUniform1i(this.f1944j, 0);
        }
        if (this.f1943i == -1) {
            int glGetUniformLocation = GLES20.glGetUniformLocation(this.f1940f, "uMVPMatrix");
            this.f1943i = glGetUniformLocation;
            GLES20.glUniformMatrix4fv(glGetUniformLocation, 1, false, fArr, 0);
        }
        if (this.f1941g == -1 || this.f1942h == -1) {
            GLES20.glBindBuffer(34962, this.f1937c[0]);
            int glGetAttribLocation = GLES20.glGetAttribLocation(this.f1940f, "vPosition");
            this.f1941g = glGetAttribLocation;
            GLES20.glEnableVertexAttribArray(glGetAttribLocation);
            GLES20.glVertexAttribPointer(this.f1941g, 2, 5126, false, 8, 0);
            int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.f1940f, "inputTextureCoordinate");
            this.f1942h = glGetAttribLocation2;
            GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
            GLES20.glVertexAttribPointer(this.f1942h, 2, 5126, false, 8, f1933n.length * 4);
            GLES20.glBindBuffer(34962, 0);
        }
        GLES20.glBindBuffer(34963, this.f1939e[0]);
        GLES20.glDrawElements(4, this.f1945k.length, 5123, 0);
        GLES20.glBindBuffer(34963, 0);
    }

    public final void a() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(f1933n.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        this.f1935a = asFloatBuffer;
        asFloatBuffer.put(f1933n);
        this.f1935a.position(0);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(f1934o.length * 4);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        this.f1936b = asFloatBuffer2;
        asFloatBuffer2.put(f1934o);
        this.f1936b.position(0);
        GLES20.glGenBuffers(1, this.f1937c, 0);
        GLES20.glBindBuffer(34962, this.f1937c[0]);
        GLES20.glBufferData(34962, (f1933n.length * 4) + (f1934o.length * 4), null, 35044);
        GLES20.glBufferSubData(34962, 0, f1933n.length * 4, this.f1935a);
        GLES20.glBufferSubData(34962, f1933n.length * 4, f1934o.length * 4, this.f1936b);
        GLES20.glBindBuffer(34962, 0);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(this.f1945k.length * 2);
        allocateDirect3.order(ByteOrder.nativeOrder());
        ShortBuffer asShortBuffer = allocateDirect3.asShortBuffer();
        this.f1938d = asShortBuffer;
        asShortBuffer.put(this.f1945k);
        this.f1938d.position(0);
        GLES20.glGenBuffers(1, this.f1939e, 0);
        GLES20.glBindBuffer(34963, this.f1939e[0]);
        GLES20.glBufferData(34963, this.f1945k.length * 2, null, 35044);
        GLES20.glBufferSubData(34963, 0, this.f1945k.length * 2, this.f1938d);
        GLES20.glBindBuffer(34963, 0);
        int a8 = a(35633, "attribute vec4 vPosition;uniform mat4 uMVPMatrix;attribute vec2 inputTextureCoordinate;varying vec2 textureCoordinate;void main(){gl_Position = uMVPMatrix * vPosition;textureCoordinate = inputTextureCoordinate;}");
        int a9 = a(35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;varying vec2 textureCoordinate;\nuniform samplerExternalOES inputTexture;\nvoid main() {  gl_FragColor = texture2D( inputTexture, textureCoordinate );\n}");
        int glCreateProgram = GLES20.glCreateProgram();
        this.f1940f = glCreateProgram;
        GLES20.glAttachShader(glCreateProgram, a8);
        GLES20.glAttachShader(this.f1940f, a9);
        GLES20.glLinkProgram(this.f1940f);
        GLES20.glUseProgram(this.f1940f);
    }
}
