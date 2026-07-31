package com.bytedance.sdk.openadsdk.core.rt.zn;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.utils.jy;
import io.bidmachine.util.MimeTypes;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes13.dex */
public class zmn {
    public static final Set<String> zmn = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.rt.zn.zmn.1
        {
            add("image/jpeg");
            add("image/png");
            add("image/bmp");
            add(MimeTypes.IMAGE_GIF);
            add("image/jpg");
        }
    };
    public static Set<String> fs = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.rt.zn.zmn.2
        {
            add("application/x-javascript");
        }
    };

    public enum fs {
        HTML_RESOURCE,
        STATIC_RESOURCE,
        IFRAME_RESOURCE
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.rt.zn.zmn$zmn, reason: collision with other inner class name */
    public enum EnumC0182zmn {
        NONE,
        IMAGE,
        JAVASCRIPT
    }

    @NonNull
    public static Point zmn(Context context, int i, int i2, fs fsVar) {
        if (context == null) {
            context = kgc.zmn();
        }
        Point point = new Point(i, i2);
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        int width = defaultDisplay.getWidth();
        int height = defaultDisplay.getHeight();
        int fs2 = jy.fs(context, i);
        int fs3 = jy.fs(context, i2);
        if (fs2 <= width && fs3 <= height) {
            return point;
        }
        Point point2 = new Point();
        if (fs.HTML_RESOURCE == fsVar) {
            point2.x = Math.min(width, fs2);
            point2.y = Math.min(height, fs3);
        } else {
            float f = fs2;
            float f2 = f / width;
            float f3 = fs3;
            float f4 = f3 / height;
            if (f2 >= f4) {
                point2.x = width;
                point2.y = (int) (f3 / f2);
            } else {
                point2.x = (int) (f / f4);
                point2.y = height;
            }
        }
        int i3 = point2.x;
        if (i3 < 0 || point2.y < 0) {
            return point;
        }
        point2.x = jy.zn(context, i3);
        point2.y = jy.zn(context, point2.y);
        return point2;
    }
}
