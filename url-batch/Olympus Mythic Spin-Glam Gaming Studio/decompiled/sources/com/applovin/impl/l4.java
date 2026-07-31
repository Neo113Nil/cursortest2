package com.applovin.impl;

import android.text.TextUtils;
import android.webkit.WebView;
import com.applovin.impl.sdk.utils.StringUtils;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.adsession.media.InteractionType;
import com.iab.omid.library.applovin.adsession.media.MediaEvents;
import com.iab.omid.library.applovin.adsession.media.Position;
import com.iab.omid.library.applovin.adsession.media.VastProperties;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public class l4 extends f4 {
    static final /* synthetic */ boolean p = true;
    private final o7 h;
    private final AtomicBoolean i;
    private MediaEvents j;
    private final VastProperties k;
    private final AtomicBoolean l;
    private final AtomicBoolean m;
    private final AtomicBoolean n;
    private final AtomicBoolean o;

    public l4(o7 o7Var) {
        super(o7Var);
        this.i = new AtomicBoolean();
        this.l = new AtomicBoolean();
        this.m = new AtomicBoolean();
        this.n = new AtomicBoolean();
        this.o = new AtomicBoolean();
        this.h = o7Var;
        float m1 = o7Var.m1();
        if (o7Var.m1() == -1) {
            this.k = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
        } else {
            this.k = VastProperties.createVastPropertiesForSkippableMedia(m1, true, Position.STANDALONE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        this.j.bufferFinish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        this.j.bufferStart();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        this.j.adUserInteraction(InteractionType.CLICK);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n() {
        this.j.complete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        this.j.firstQuartile();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() {
        this.g.loaded(this.k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        this.j.midpoint();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        this.j.pause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        this.j.resume();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        this.j.skipped();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        this.j.thirdQuartile();
    }

    public void A() {
        b("track resumed", new Runnable() { // from class: com.applovin.impl.l4$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                l4.this.s();
            }
        });
    }

    public void B() {
        b("track skipped", new Runnable() { // from class: com.applovin.impl.l4$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                l4.this.t();
            }
        });
    }

    public void C() {
        if (this.o.compareAndSet(false, true)) {
            b("track third quartile", new Runnable() { // from class: com.applovin.impl.l4$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    l4.this.u();
                }
            });
        }
    }

    @Override // com.applovin.impl.f4
    protected AdSessionContext a(WebView webView) {
        if (!p && this.h.e1() == null) {
            throw new AssertionError();
        }
        ArrayList arrayList = new ArrayList();
        for (p7 p7Var : this.h.e1().b()) {
            List<v7> c = p7Var.c();
            if (c.isEmpty()) {
                a8.a(p7Var.b(), t7.FAILED_TO_LOAD_RESOURCE, this.b);
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (v7 v7Var : c) {
                    if (CampaignEx.KEY_OMID.equalsIgnoreCase(v7Var.b())) {
                        arrayList2.add(v7Var);
                    }
                }
                if (arrayList2.isEmpty()) {
                    a8.a(p7Var.b(), t7.API_FRAMEWORK_OR_LANGUAGE_TYPE_NOT_SUPPORTED, this.b);
                } else {
                    ArrayList<URL> arrayList3 = new ArrayList();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        try {
                            arrayList3.add(new URL(((v7) it.next()).c()));
                        } catch (Throwable th) {
                            if (com.applovin.impl.sdk.o.a()) {
                                this.c.a(this.d, "Failed to parse JavaScript resource url", th);
                            }
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        a8.a(p7Var.b(), t7.FAILED_TO_LOAD_RESOURCE, this.b);
                    } else {
                        String e = p7Var.e();
                        String d = p7Var.d();
                        if (!StringUtils.isValidString(e) || StringUtils.isValidString(d)) {
                            for (URL url : arrayList3) {
                                arrayList.add(StringUtils.isValidString(e) ? VerificationScriptResource.createVerificationScriptResourceWithParameters(d, url, e) : VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url));
                            }
                        } else {
                            a8.a(p7Var.b(), t7.FAILED_TO_LOAD_RESOURCE, this.b);
                        }
                    }
                }
            }
        }
        String a = this.b.e0().a();
        if (TextUtils.isEmpty(a)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.b(this.d, "JavaScript SDK content not loaded successfully");
            }
            return null;
        }
        try {
            return AdSessionContext.createNativeAdSessionContext(this.b.e0().b(), a, arrayList, this.h.getOpenMeasurementContentUrl(), this.h.getOpenMeasurementCustomReferenceData());
        } catch (Throwable th2) {
            if (!com.applovin.impl.sdk.o.a()) {
                return null;
            }
            this.c.a(this.d, "Failed to create ad session context", th2);
            return null;
        }
    }

    public void b(final float f, final boolean z) {
        if (this.l.compareAndSet(false, true)) {
            b("track started", new Runnable() { // from class: com.applovin.impl.l4$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    l4.this.a(f, z);
                }
            });
        }
    }

    @Override // com.applovin.impl.f4
    public void h() {
        b("track loaded", new Runnable() { // from class: com.applovin.impl.l4$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                l4.this.p();
            }
        });
    }

    public void i() {
        if (this.i.compareAndSet(true, false)) {
            b("buffer finished", new Runnable() { // from class: com.applovin.impl.l4$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    l4.this.k();
                }
            });
        }
    }

    public void j() {
        if (this.i.compareAndSet(false, true)) {
            b("buffer started", new Runnable() { // from class: com.applovin.impl.l4$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    l4.this.l();
                }
            });
        }
    }

    public void v() {
        b("track clicked", new Runnable() { // from class: com.applovin.impl.l4$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                l4.this.m();
            }
        });
    }

    public void w() {
        b("track completed", new Runnable() { // from class: com.applovin.impl.l4$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                l4.this.n();
            }
        });
    }

    public void x() {
        if (this.m.compareAndSet(false, true)) {
            b("track first quartile", new Runnable() { // from class: com.applovin.impl.l4$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    l4.this.o();
                }
            });
        }
    }

    public void y() {
        if (this.n.compareAndSet(false, true)) {
            b("track midpoint", new Runnable() { // from class: com.applovin.impl.l4$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    l4.this.q();
                }
            });
        }
    }

    public void z() {
        b("track paused", new Runnable() { // from class: com.applovin.impl.l4$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                l4.this.r();
            }
        });
    }

    public void b(final boolean z) {
        b("track volume changed", new Runnable() { // from class: com.applovin.impl.l4$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                l4.this.a(z);
            }
        });
    }

    @Override // com.applovin.impl.f4
    protected AdSessionConfiguration a() {
        try {
            CreativeType creativeType = CreativeType.VIDEO;
            ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
            Owner owner = Owner.NATIVE;
            return AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.d, "Failed to create ad session configuration", th);
            }
            return null;
        }
    }

    @Override // com.applovin.impl.f4
    protected void a(AdSession adSession) {
        try {
            this.j = MediaEvents.createMediaEvents(adSession);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.d, "Failed to create media events", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(float f, boolean z) {
        this.j.start(f, z ? 0.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z) {
        this.j.volumeChange(z ? 0.0f : 1.0f);
    }
}
