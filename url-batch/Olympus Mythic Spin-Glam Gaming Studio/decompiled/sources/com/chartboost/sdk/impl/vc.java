package com.chartboost.sdk.impl;

import android.view.View;
import android.webkit.WebView;
import com.iab.omid.library.chartboost.adsession.AdEvents;
import com.iab.omid.library.chartboost.adsession.AdSession;
import com.iab.omid.library.chartboost.adsession.AdSessionConfiguration;
import com.iab.omid.library.chartboost.adsession.AdSessionContext;
import com.iab.omid.library.chartboost.adsession.CreativeType;
import com.iab.omid.library.chartboost.adsession.ImpressionType;
import com.iab.omid.library.chartboost.adsession.Owner;
import com.iab.omid.library.chartboost.adsession.VerificationScriptResource;
import com.iab.omid.library.chartboost.adsession.media.MediaEvents;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class vc implements jl {
    public static final a a = new a(null);

    public AdSession a(el manager, CreativeType creativeType, Set viewabilityVendors, Owner mediaEventsOwner) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(creativeType, "creativeType");
        Intrinsics.checkNotNullParameter(viewabilityVendors, "viewabilityVendors");
        Intrinsics.checkNotNullParameter(mediaEventsOwner, "mediaEventsOwner");
        List a2 = a(viewabilityVendors);
        if (a2.isEmpty()) {
            throw new IllegalArgumentException("verificationScriptResources is empty");
        }
        AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, mediaEventsOwner, false), AdSessionContext.createNativeAdSessionContext(manager.a(), manager.c(), a2, "", ""));
        Intrinsics.checkNotNullExpressionValue(createAdSession, "createAdSession(...)");
        return createAdSession;
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.chartboost.sdk.impl.jl
    public ll a(el manager, View videoView, Set viewabilityVendors, Integer num) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        Intrinsics.checkNotNullParameter(viewabilityVendors, "viewabilityVendors");
        AdSession a2 = a(manager, CreativeType.VIDEO, viewabilityVendors, Owner.NATIVE);
        AdEvents createAdEvents = AdEvents.createAdEvents(a2);
        MediaEvents createMediaEvents = MediaEvents.createMediaEvents(a2);
        Intrinsics.checkNotNull(createAdEvents);
        Intrinsics.checkNotNull(createMediaEvents);
        return new wc(manager, a2, createAdEvents, createMediaEvents, videoView, num);
    }

    public final List a(Set set) {
        String c;
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ml mlVar = (ml) it.next();
            String b = mlVar.b();
            if (b != null && b.length() != 0 && (c = mlVar.c()) != null && c.length() != 0) {
                VerificationScriptResource createVerificationScriptResourceWithParameters = VerificationScriptResource.createVerificationScriptResourceWithParameters(mlVar.b(), mlVar.a(), mlVar.c());
                Intrinsics.checkNotNullExpressionValue(createVerificationScriptResourceWithParameters, "createVerificationScript…sourceWithParameters(...)");
                arrayList.add(createVerificationScriptResourceWithParameters);
            } else {
                VerificationScriptResource createVerificationScriptResourceWithoutParameters = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(mlVar.a());
                Intrinsics.checkNotNullExpressionValue(createVerificationScriptResourceWithoutParameters, "createVerificationScript…rceWithoutParameters(...)");
                arrayList.add(createVerificationScriptResourceWithoutParameters);
            }
        }
        return arrayList;
    }

    @Override // com.chartboost.sdk.impl.jl
    public il a(el manager, WebView webView) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(webView, "webView");
        AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false), AdSessionContext.createHtmlAdSessionContext(manager.a(), webView, "", ""));
        AdEvents createAdEvents = AdEvents.createAdEvents(createAdSession);
        Intrinsics.checkNotNull(createAdSession);
        Intrinsics.checkNotNull(createAdEvents);
        return new uc(manager, createAdSession, createAdEvents, webView);
    }
}
