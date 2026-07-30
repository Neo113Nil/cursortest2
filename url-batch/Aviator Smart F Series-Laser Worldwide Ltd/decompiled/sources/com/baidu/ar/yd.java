package com.baidu.ar;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.baidu.ar.record.EncoderParams;

/* loaded from: classes.dex */
public class yd extends e1 {

    /* renamed from: k, reason: collision with root package name */
    public static final String f3776k = "yd";

    /* renamed from: j, reason: collision with root package name */
    public Surface f3777j;

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(EncoderParams encoderParams, z8 z8Var) {
        boolean z7;
        p3 p3Var;
        if (encoderParams != null && z8Var != null) {
            this.f2125c = z8Var;
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat(encoderParams.getVideoCodec(), encoderParams.getVideoWidth(), encoderParams.getVideoHeight());
            createVideoFormat.setInteger("color-format", 2130708361);
            createVideoFormat.setInteger("bitrate", encoderParams.getVideoBitrate());
            createVideoFormat.setInteger("frame-rate", encoderParams.getVideoFrameRate());
            createVideoFormat.setInteger("i-frame-interval", encoderParams.getVideoIFrameInterval());
            try {
                MediaCodec createEncoderByType = MediaCodec.createEncoderByType(encoderParams.getVideoCodec());
                this.f2126d = createEncoderByType;
                z7 = true;
                createEncoderByType.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
                this.f3777j = this.f2126d.createInputSurface();
                this.f2129g = true;
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            p3Var = this.f2128f;
            if (p3Var == null) {
                p3Var.a(z7, this.f3777j);
                return;
            }
            return;
        }
        z7 = false;
        p3Var = this.f2128f;
        if (p3Var == null) {
        }
    }

    @Override // com.baidu.ar.e1
    public void d() {
        if (this.f2130h == 0) {
            this.f2130h = this.f2127e.presentationTimeUs;
        }
        this.f2127e.presentationTimeUs -= this.f2130h;
        h.a(f3776k, "syncTimestamp mVideoEncoder = " + this.f2127e.size + b5.b.VERTICAL + this.f2127e.presentationTimeUs);
    }
}
