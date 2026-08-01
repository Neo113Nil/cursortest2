package com.bytedance.sdk.openadsdk.core.yiw.vG;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.utils.Pj;
import java.util.HashSet;
import java.util.Set;

/* compiled from: ResourceHelper.java */
/* loaded from: classes2.dex */
public class pvs {
    public static final Set<String> pvs = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.yiw.vG.pvs.1
        {
            add("image/jpeg");
            add("image/png");
            add("image/bmp");
            add("image/gif");
            add("image/jpg");
        }
    };
    public static Set<String> icD = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.yiw.vG.pvs.2
        {
            add("application/x-javascript");
        }
    };

    /* compiled from: ResourceHelper.java */
    public enum icD {
        HTML_RESOURCE,
        STATIC_RESOURCE,
        IFRAME_RESOURCE
    }

    /* compiled from: ResourceHelper.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.yiw.vG.pvs$pvs, reason: collision with other inner class name */
    public enum EnumC0089pvs {
        NONE,
        IMAGE,
        JAVASCRIPT
    }

    public static Point pvs(Context context, int i, int i2, icD icd) {
        if (context == null) {
            context = mnm.pvs();
        }
        Point point = new Point(i, i2);
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        int width = defaultDisplay.getWidth();
        int height = defaultDisplay.getHeight();
        int icD2 = Pj.icD(context, i);
        int icD3 = Pj.icD(context, i2);
        if (icD2 <= width && icD3 <= height) {
            return point;
        }
        Point point2 = new Point();
        if (icD.HTML_RESOURCE == icd) {
            point2.x = Math.min(width, icD2);
            point2.y = Math.min(height, icD3);
        } else {
            float f = icD2;
            float f2 = f / width;
            float f3 = icD3;
            float f4 = f3 / height;
            if (f2 >= f4) {
                point2.x = width;
                point2.y = (int) (f3 / f2);
            } else {
                point2.x = (int) (f / f4);
                point2.y = height;
            }
        }
        if (point2.x < 0 || point2.y < 0) {
            return point;
        }
        point2.x = Pj.vG(context, point2.x);
        point2.y = Pj.vG(context, point2.y);
        return point2;
    }
}
