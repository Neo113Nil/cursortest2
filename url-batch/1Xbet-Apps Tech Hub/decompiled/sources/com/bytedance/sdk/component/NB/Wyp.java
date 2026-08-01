package com.bytedance.sdk.component.NB;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.ats.ATSApi;
import com.bytedance.sdk.openadsdk.ats.ATSMethod;

/* compiled from: IImageLoader.java */
@ATSApi
/* loaded from: classes.dex */
public interface Wyp {
    @ATSMethod(18)
    Wyp Jd(int i);

    @ATSMethod(19)
    Wyp NB(int i);

    @ATSMethod(11)
    Wyp icD(int i);

    @ATSMethod(7)
    Wyp icD(String str);

    @ATSMethod(3)
    Mxy pvs(ImageView imageView);

    @ATSMethod(2)
    Mxy pvs(mnm mnmVar);

    @ATSMethod(1)
    Mxy pvs(mnm mnmVar, int i);

    @ATSMethod(10)
    Wyp pvs(int i);

    @ATSMethod(9)
    Wyp pvs(Bitmap.Config config);

    @ATSMethod(8)
    Wyp pvs(ImageView.ScaleType scaleType);

    @ATSMethod(17)
    Wyp pvs(so soVar);

    @ATSMethod(13)
    Wyp pvs(uc ucVar);

    @ATSMethod(5)
    Wyp pvs(String str);

    @ATSMethod(15)
    Wyp pvs(boolean z);

    @ATSMethod(12)
    Wyp vG(int i);
}
