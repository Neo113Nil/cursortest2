package com.baidu.ar;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.baidu.ar.record.EncoderParams;

/* loaded from: classes.dex */
public class t0 extends e1 {

    /* renamed from: k, reason: collision with root package name */
    public static final String f3262k = "t0";

    /* renamed from: j, reason: collision with root package name */
    public long f3263j = 0;

    public void a(EncoderParams encoderParams, z8 z8Var) {
        boolean z7 = false;
        if (encoderParams != null && z8Var != null) {
            this.f2125c = z8Var;
            MediaFormat mediaFormat = new MediaFormat();
            mediaFormat.setString("mime", encoderParams.getAudioCodec());
            mediaFormat.setInteger("aac-profile", 2);
            mediaFormat.setInteger("sample-rate", encoderParams.getAudioSampleRate());
            mediaFormat.setInteger("channel-count", encoderParams.getAudioChannel());
            mediaFormat.setInteger("bitrate", encoderParams.getAudioBitrate());
            mediaFormat.setInteger("max-input-size", encoderParams.getAudioFrameSize());
            try {
                MediaCodec createEncoderByType = MediaCodec.createEncoderByType(encoderParams.getAudioCodec());
                this.f2126d = createEncoderByType;
                createEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
                if (encoderParams.isVideoIncluded()) {
                    this.f2129g = false;
                } else {
                    this.f2129g = true;
                }
                z7 = true;
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
        p3 p3Var = this.f2128f;
        if (p3Var != null) {
            p3Var.a(z7, null);
        }
    }

    @Override // com.baidu.ar.e1
    public void d() {
        if (this.f2130h == 0) {
            this.f2130h = this.f2127e.presentationTimeUs;
        }
        MediaCodec.BufferInfo bufferInfo = this.f2127e;
        long j8 = bufferInfo.presentationTimeUs - this.f2130h;
        bufferInfo.presentationTimeUs = j8;
        long j9 = this.f3263j;
        if (j8 < j9) {
            long j10 = j9 + 10000;
            this.f3263j = j10;
            bufferInfo.presentationTimeUs = j10;
        }
        this.f3263j = bufferInfo.presentationTimeUs;
        h.a(f3262k, "syncTimestamp mAudioEncoder = " + this.f2127e.size + b5.b.VERTICAL + this.f2127e.presentationTimeUs);
    }
}
