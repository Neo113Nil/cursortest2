package com.baidu.ar;

import com.baidu.ar.audio.IEasyAudio;

/* loaded from: classes.dex */
public class j {
    public static IEasyAudio a() {
        return (IEasyAudio) ab.a("com.baidu.ar.audio.EasyAudio", "getInstance");
    }

    public static e6 b() {
        return (e6) ab.a("com.baidu.ar.imu.IMUController");
    }

    public static l6 c() {
        return (l6) ab.a("com.baidu.ar.recorder.MovieRecorder", "getInstance");
    }
}
