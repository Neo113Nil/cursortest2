package com.chartboost.sdk.impl;

import com.iab.omid.library.chartboost.adsession.AdEvents;
import com.iab.omid.library.chartboost.adsession.AdSession;
import com.iab.omid.library.chartboost.adsession.AdSessionConfiguration;
import com.iab.omid.library.chartboost.adsession.AdSessionContext;
import com.iab.omid.library.chartboost.adsession.CreativeType;
import com.iab.omid.library.chartboost.adsession.ImpressionType;
import com.iab.omid.library.chartboost.adsession.Owner;
import com.iab.omid.library.chartboost.adsession.Partner;
import com.iab.omid.library.chartboost.adsession.VerificationScriptResource;
import com.iab.omid.library.chartboost.adsession.media.MediaEvents;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class je {

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[jc.values().length];
            try {
                iArr[jc.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[jc.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[jc.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[jc.f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[jc.g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
        }
    }

    public final CreativeType b(jc jcVar) {
        int i = b.a[jcVar.ordinal()];
        if (i == 1) {
            return CreativeType.NATIVE_DISPLAY;
        }
        if (i == 2) {
            return CreativeType.HTML_DISPLAY;
        }
        if (i == 3) {
            return CreativeType.VIDEO;
        }
        if (i == 4) {
            return CreativeType.AUDIO;
        }
        if (i == 5) {
            return CreativeType.NATIVE_DISPLAY;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Owner c(jc jcVar) {
        int i = b.a[jcVar.ordinal()];
        if (i == 1) {
            return Owner.NATIVE;
        }
        if (i == 2) {
            return Owner.NONE;
        }
        if (i == 3) {
            return Owner.NATIVE;
        }
        if (i == 4) {
            return Owner.NATIVE;
        }
        if (i == 5) {
            return Owner.NATIVE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final List a(List list, List list2, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.addAll(a(list2));
        }
        arrayList.addAll(list);
        return arrayList;
    }

    public static final class a {
        public AdSession a;
        public AdEvents b;
        public MediaEvents c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.a, aVar.a) && Intrinsics.areEqual(this.b, aVar.b) && Intrinsics.areEqual(this.c, aVar.c);
        }

        public int hashCode() {
            AdSession adSession = this.a;
            int hashCode = (adSession == null ? 0 : adSession.hashCode()) * 31;
            AdEvents adEvents = this.b;
            int hashCode2 = (hashCode + (adEvents == null ? 0 : adEvents.hashCode())) * 31;
            MediaEvents mediaEvents = this.c;
            return hashCode2 + (mediaEvents != null ? mediaEvents.hashCode() : 0);
        }

        public String toString() {
            return "OMSessionHolder(omSession=" + this.a + ", omAdEvents=" + this.b + ", mediaEvents=" + this.c + ")";
        }

        public a(AdSession adSession, AdEvents adEvents, MediaEvents mediaEvents) {
            this.a = adSession;
            this.b = adEvents;
            this.c = mediaEvents;
        }

        public final AdSession c() {
            return this.a;
        }

        public final AdEvents b() {
            return this.b;
        }

        public final MediaEvents a() {
            return this.c;
        }

        public final void a(AdEvents adEvents) {
            this.b = adEvents;
        }

        public final void a(AdSession adSession) {
            this.a = adSession;
        }
    }

    public final AdSessionConfiguration a(jc jcVar) {
        try {
            return AdSessionConfiguration.createAdSessionConfiguration(b(jcVar), ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, c(jcVar), false);
        } catch (IllegalArgumentException e) {
            xb.a("buildAdSessionVideoConfig error", e);
            return null;
        }
    }

    public final AdSessionContext a(Partner partner, r3 r3Var) {
        try {
            return AdSessionContext.createHtmlAdSessionContext(partner, r3Var, null, null);
        } catch (IllegalArgumentException e) {
            xb.a("buildHtmlContext error", e);
            return null;
        }
    }

    public final AdSessionContext a(Partner partner, String str, List list, boolean z, List list2) {
        try {
            return AdSessionContext.createNativeAdSessionContext(partner, str, a(list, list2, z), null, null);
        } catch (IllegalArgumentException e) {
            xb.a("buildNativeContext error", e);
            return null;
        }
    }

    public final List a(List list) {
        try {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                fk fkVar = (fk) it.next();
                arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(fkVar.c(), a(fkVar.b()), fkVar.a()));
            }
            return arrayList;
        } catch (Exception e) {
            xb.a("buildVerificationResources error", e);
            return CollectionsKt.emptyList();
        }
    }

    public final MediaEvents a(jc jcVar, AdSession adSession) {
        if (jcVar == jc.d) {
            return null;
        }
        return MediaEvents.createMediaEvents(adSession);
    }

    public final a a(r3 webView, jc mtype, Partner partner, String str, List verificationScriptResourcesList, boolean z, List verificationListConfig) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(mtype, "mtype");
        Intrinsics.checkNotNullParameter(verificationScriptResourcesList, "verificationScriptResourcesList");
        Intrinsics.checkNotNullParameter(verificationListConfig, "verificationListConfig");
        try {
            AdSession createAdSession = AdSession.createAdSession(a(mtype), a(partner, str, verificationScriptResourcesList, z, verificationListConfig, mtype, webView));
            createAdSession.registerAdView(webView);
            AdEvents createAdEvents = AdEvents.createAdEvents(createAdSession);
            Intrinsics.checkNotNull(createAdSession);
            return new a(createAdSession, createAdEvents, a(mtype, createAdSession));
        } catch (Exception e) {
            xb.b("OMSDK create session exception", e);
            return null;
        }
    }

    public final AdSessionContext a(Partner partner, String str, List list, boolean z, List list2, jc jcVar, r3 r3Var) {
        if (jcVar == jc.d) {
            return a(partner, r3Var);
        }
        return a(partner, str, list, z, list2);
    }

    public final URL a(String str) {
        try {
            return new URL(str);
        } catch (Exception e) {
            xb.a("buildVerificationResources invalid url", e);
            return null;
        }
    }
}
