package com.baidu.ar;

import com.baidu.ar.recg.ImgRecognitionClient;
import com.baidu.ar.recg.RecognitionResult;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class j7 {

    /* renamed from: c, reason: collision with root package name */
    public static j7 f2534c;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2536b = false;

    /* renamed from: a, reason: collision with root package name */
    public ImgRecognitionClient f2535a = new ImgRecognitionClient();

    public static synchronized j7 a() {
        j7 j7Var;
        synchronized (j7.class) {
            try {
                if (f2534c == null) {
                    f2534c = new j7();
                }
                j7Var = f2534c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j7Var;
    }

    public boolean b() {
        if (this.f2535a != null && !this.f2536b) {
            this.f2536b = ImgRecognitionClient.release();
        }
        this.f2535a = null;
        f2534c = null;
        return this.f2536b;
    }

    public RecognitionResult a(ByteBuffer byteBuffer, int i8, int i9) {
        String str;
        if (this.f2535a == null) {
            return null;
        }
        RecognitionResult recogniseImageByteBuffer = ImgRecognitionClient.recogniseImageByteBuffer(byteBuffer, i8, i9);
        int i10 = recogniseImageByteBuffer.errCode;
        if (i10 != 1) {
            if (i10 == 0) {
                str = "model process fail!";
            }
            this.f2536b = false;
            return recogniseImageByteBuffer;
        }
        str = "model process success! process score = " + recogniseImageByteBuffer.score + " process time = " + recogniseImageByteBuffer.time;
        h.a("AlgoRecg", str);
        this.f2536b = false;
        return recogniseImageByteBuffer;
    }

    public boolean a(String[] strArr) {
        if (this.f2535a == null || strArr == null) {
            return false;
        }
        return ImgRecognitionClient.init(strArr);
    }
}
