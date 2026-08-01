package com.bytedance.sdk.openadsdk.core.yiw;

import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.Ju;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.AdSessionConfiguration;
import com.iab.omid.library.bytedance2.adsession.AdSessionContext;
import com.iab.omid.library.bytedance2.adsession.CreativeType;
import com.iab.omid.library.bytedance2.adsession.ImpressionType;
import com.iab.omid.library.bytedance2.adsession.Owner;
import com.iab.omid.library.bytedance2.adsession.Partner;
import com.iab.omid.library.bytedance2.adsession.VerificationScriptResource;
import com.iab.omid.library.bytedance2.adsession.media.MediaEvents;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: ViewabilityTrackerFactory.java */
/* loaded from: classes2.dex */
public class so {
    public static yiw pvs(View view, Set<Wyp> set) {
        AdSession pvs = pvs(CreativeType.VIDEO, set, Owner.NATIVE);
        return new Mxy(pvs, AdEvents.createAdEvents(pvs), view, MediaEvents.createMediaEvents(pvs));
    }

    public static yiw pvs(WebView webView) {
        Partner pvs = NB.pvs();
        if (pvs == null) {
            throw new IllegalArgumentException("Parameter 'partner' may not be null.");
        }
        AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false), AdSessionContext.createHtmlAdSessionContext(pvs, webView, "", ""));
        return new yiw(createAdSession, AdEvents.createAdEvents(createAdSession), webView);
    }

    private static AdSession pvs(CreativeType creativeType, Set<Wyp> set, Owner owner) {
        List<VerificationScriptResource> pvs = pvs(set);
        if (pvs.isEmpty()) {
            Ju.icD("verificationScriptResources is empty");
        }
        Partner pvs2 = NB.pvs();
        if (pvs2 == null) {
            return null;
        }
        return AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, owner, false), AdSessionContext.createNativeAdSessionContext(pvs2, NB.icD(), pvs, "", ""));
    }

    private static List<VerificationScriptResource> pvs(Set<Wyp> set) {
        ArrayList arrayList = new ArrayList();
        for (Wyp wyp : set) {
            if (!TextUtils.isEmpty(wyp.pvs()) && !TextUtils.isEmpty(wyp.icD())) {
                arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(wyp.pvs(), wyp.vG(), wyp.icD()));
            }
            arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithoutParameters(wyp.vG()));
        }
        return arrayList;
    }
}
