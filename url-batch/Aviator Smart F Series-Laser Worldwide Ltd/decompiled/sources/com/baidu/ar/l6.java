package com.baidu.ar;

import android.content.Context;
import com.baidu.ar.record.EncoderParams;
import com.baidu.ar.record.MovieRecorderCallback;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface l6 {
    void onAudioFrameAvailable(ByteBuffer byteBuffer, int i8, long j8);

    void onVideoFrameAvailable(long j8);

    void startRecorder(Context context, EncoderParams encoderParams, MovieRecorderCallback movieRecorderCallback);

    void stopRecorder();
}
