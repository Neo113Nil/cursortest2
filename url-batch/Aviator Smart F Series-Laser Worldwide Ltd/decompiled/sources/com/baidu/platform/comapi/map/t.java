package com.baidu.platform.comapi.map;

import android.content.Context;
import android.view.SurfaceView;
import com.baidu.platform.comapi.util.EglConfigUtils;

/* loaded from: classes2.dex */
public class t {

    public enum a {
        OPENGL_ES,
        VULKAN,
        AUTO
    }

    public static s a(SurfaceView surfaceView, a aVar, boolean z7, Context context) {
        int i8;
        int i9;
        f fVar = new f(surfaceView);
        fVar.a(3);
        if (z7) {
            i8 = 1;
            i9 = 4;
        } else {
            i8 = 0;
            i9 = 0;
        }
        try {
            if (EglConfigUtils.isSupportConfig(8, 8, 8, 8, 24, 8, i8, i9)) {
                fVar.a(8, 8, 8, 8, 24, 8, i8, i9);
            } else {
                fVar.a(true);
            }
        } catch (IllegalArgumentException unused) {
            fVar.a(true);
        }
        fVar.b(true);
        return fVar;
    }
}
