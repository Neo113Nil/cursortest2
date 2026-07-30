package t2;

import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.C2892Zf;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class K extends H {
    @Override // W3.e
    public final void D(final Activity activity) {
        int i;
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31502N1)).booleanValue() && p2.j.f39798C.f39808h.g().q() == null && !activity.isInMultiWindowMode()) {
            Window window = activity.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            i = attributes.layoutInDisplayCutoutMode;
            if (1 != i) {
                attributes.layoutInDisplayCutoutMode = 1;
                window.setAttributes(attributes);
            }
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: t2.I
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    int i4;
                    DisplayCutout displayCutout;
                    List<Rect> boundingRects;
                    p2.j jVar = p2.j.f39798C;
                    if (jVar.f39808h.g().q() == null) {
                        displayCutout = windowInsets.getDisplayCutout();
                        C2892Zf c2892Zf = jVar.f39808h;
                        String str = "";
                        if (displayCutout != null) {
                            E g9 = c2892Zf.g();
                            boundingRects = displayCutout.getBoundingRects();
                            for (Rect rect : boundingRects) {
                                Locale locale = Locale.US;
                                int i9 = rect.left;
                                int i10 = rect.top;
                                int i11 = rect.right;
                                int i12 = rect.bottom;
                                StringBuilder sb = new StringBuilder();
                                sb.append(i9);
                                sb.append(",");
                                sb.append(i10);
                                sb.append(",");
                                sb.append(i11);
                                String j9 = D.y.j(i12, ",", sb);
                                if (!TextUtils.isEmpty(str)) {
                                    str = str.concat(com.anythink.expressad.foundation.g.a.bU);
                                }
                                str = str.concat(j9);
                            }
                            g9.r(str);
                        } else {
                            c2892Zf.g().r("");
                        }
                    }
                    Window window2 = activity.getWindow();
                    WindowManager.LayoutParams attributes2 = window2.getAttributes();
                    i4 = attributes2.layoutInDisplayCutoutMode;
                    if (2 != i4) {
                        attributes2.layoutInDisplayCutoutMode = 2;
                        window2.setAttributes(attributes2);
                    }
                    return view.onApplyWindowInsets(windowInsets);
                }
            });
        }
    }

    @Override // W3.e
    public final int E(AudioManager audioManager) {
        int streamMinVolume;
        streamMinVolume = audioManager.getStreamMinVolume(3);
        return streamMinVolume;
    }
}
