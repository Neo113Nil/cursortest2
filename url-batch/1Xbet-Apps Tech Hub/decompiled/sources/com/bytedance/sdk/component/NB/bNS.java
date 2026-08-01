package com.bytedance.sdk.component.NB;

import com.bytedance.sdk.openadsdk.ats.ATSApi;
import com.bytedance.sdk.openadsdk.ats.ATSMethod;
import java.io.InputStream;

/* compiled from: ILoaderCenter.java */
@ATSApi("img_service")
/* loaded from: classes.dex */
public interface bNS {
    @ATSMethod(1)
    Wyp pvs(String str);

    @ATSMethod(6)
    InputStream pvs(String str, String str2);

    @ATSMethod(8)
    boolean pvs(String str, String str2, String str3);
}
