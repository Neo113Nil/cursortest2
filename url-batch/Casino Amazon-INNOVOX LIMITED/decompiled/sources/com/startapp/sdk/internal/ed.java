package com.startapp.sdk.internal;

import android.content.Context;
import android.webkit.WebView;
import com.iab.omid.library.startio.Omid;
import com.iab.omid.library.startio.adsession.AdEvents;
import com.iab.omid.library.startio.adsession.AdSession;
import com.iab.omid.library.startio.adsession.AdSessionConfiguration;
import com.iab.omid.library.startio.adsession.AdSessionContext;
import com.iab.omid.library.startio.adsession.CreativeType;
import com.iab.omid.library.startio.adsession.ImpressionType;
import com.iab.omid.library.startio.adsession.Owner;
import com.iab.omid.library.startio.adsession.Partner;
import com.iab.omid.library.startio.adsession.media.MediaEvents;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class ed {

    /* renamed from: a, reason: collision with root package name */
    public final AdSession f228a;
    public final AdEvents b;
    public final MediaEvents c;
    public final AtomicBoolean d = new AtomicBoolean();
    public final AtomicBoolean e = new AtomicBoolean();

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ed(WebView webView) {
        AdSession adSession;
        AdEvents createAdEvents;
        Context context;
        try {
            context = webView.getContext();
        } catch (Throwable th) {
            n8.a(th);
        }
        try {
            if (!Omid.isActive()) {
                Omid.activate(context);
            }
            adSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.VIEWABLE, Owner.NATIVE, Owner.NONE, false), AdSessionContext.createHtmlAdSessionContext(Partner.createPartner("Startio", "5.3.2"), webView, null, ""));
        } catch (Throwable th2) {
            n8.a(th2);
            adSession = null;
            this.f228a = adSession;
            webView.getContext();
            if (adSession != null) {
            }
            createAdEvents = null;
            this.b = createAdEvents;
            this.c = null;
        }
        this.f228a = adSession;
        webView.getContext();
        if (adSession != null) {
            try {
                createAdEvents = AdEvents.createAdEvents(adSession);
            } catch (Throwable th3) {
                n8.a(th3);
            }
            this.b = createAdEvents;
            this.c = null;
        }
        createAdEvents = null;
        this.b = createAdEvents;
        this.c = null;
    }

    public final void a() {
        if (this.b == null || !this.d.compareAndSet(false, true)) {
            return;
        }
        this.b.impressionOccurred();
    }

    public ed(Context context, List list, boolean z) {
        AdSession adSession;
        AdEvents createAdEvents;
        MediaEvents mediaEvents = null;
        try {
            adSession = c0.a(context, list, z);
        } catch (Throwable th) {
            n8.a(th);
            adSession = null;
        }
        this.f228a = adSession;
        if (adSession != null) {
            try {
                createAdEvents = AdEvents.createAdEvents(adSession);
            } catch (Throwable th2) {
                n8.a(th2);
            }
            this.b = createAdEvents;
            if (z && adSession != null) {
                try {
                    mediaEvents = MediaEvents.createMediaEvents(adSession);
                } catch (Throwable th3) {
                    n8.a(th3);
                }
            }
            this.c = mediaEvents;
        }
        createAdEvents = null;
        this.b = createAdEvents;
        if (z) {
            mediaEvents = MediaEvents.createMediaEvents(adSession);
        }
        this.c = mediaEvents;
    }
}
