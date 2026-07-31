package com.bytedance.sdk.openadsdk.core.rt;

import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.NonNull;
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

/* loaded from: classes5.dex */
public class zg {
    @NonNull
    public static nps zmn(@NonNull View view, @NonNull Set<iv> set) {
        AdSession zmn = zmn(CreativeType.VIDEO, set, Owner.NATIVE);
        return new bvs(zmn, AdEvents.createAdEvents(zmn), view, MediaEvents.createMediaEvents(zmn));
    }

    public static nps zmn(WebView webView) {
        Partner zmn = btk.zmn();
        if (zmn == null) {
            throw new IllegalArgumentException("Parameter 'partner' may not be null.");
        }
        AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false), AdSessionContext.createHtmlAdSessionContext(zmn, webView, "", ""));
        return new nps(createAdSession, AdEvents.createAdEvents(createAdSession), webView);
    }

    private static AdSession zmn(CreativeType creativeType, Set<iv> set, Owner owner) {
        List<VerificationScriptResource> zmn = zmn(set);
        zmn.isEmpty();
        Partner zmn2 = btk.zmn();
        if (zmn2 == null) {
            return null;
        }
        return AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, owner, false), AdSessionContext.createNativeAdSessionContext(zmn2, btk.fs(), zmn, "", ""));
    }

    private static List<VerificationScriptResource> zmn(Set<iv> set) {
        ArrayList arrayList = new ArrayList();
        for (iv ivVar : set) {
            if (!TextUtils.isEmpty(ivVar.zmn()) && !TextUtils.isEmpty(ivVar.fs())) {
                arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(ivVar.zmn(), ivVar.zn(), ivVar.fs()));
            }
            arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithoutParameters(ivVar.zn()));
        }
        return arrayList;
    }
}
