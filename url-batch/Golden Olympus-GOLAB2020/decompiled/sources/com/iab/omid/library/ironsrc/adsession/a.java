package com.iab.omid.library.ironsrc.adsession;

import android.view.View;
import com.iab.omid.library.ironsrc.internal.c;
import com.iab.omid.library.ironsrc.internal.e;
import com.iab.omid.library.ironsrc.internal.f;
import com.iab.omid.library.ironsrc.internal.i;
import com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher;
import com.iab.omid.library.ironsrc.publisher.b;
import com.iab.omid.library.ironsrc.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a extends AdSession {

    /* renamed from: a, reason: collision with root package name */
    private final AdSessionContext f14501a;

    /* renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f14502b;

    /* renamed from: c, reason: collision with root package name */
    private final f f14503c;

    /* renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.ironsrc.weakreference.a f14504d;

    /* renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f14505e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f14506f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f14507g;

    /* renamed from: h, reason: collision with root package name */
    private final String f14508h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f14509i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f14510j;

    /* renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f14511k;

    a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f14509i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f14510j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f14507g) {
            return;
        }
        this.f14503c.a(view, friendlyObstructionPurpose, str);
    }

    public View c() {
        return this.f14504d.get();
    }

    public List<e> d() {
        return this.f14503c.a();
    }

    public boolean e() {
        return this.f14511k != null;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f14507g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f14506f && !this.f14507g;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void finish() {
        if (this.f14507g) {
            return;
        }
        this.f14504d.clear();
        removeAllFriendlyObstructions();
        this.f14507g = true;
        getAdSessionStatePublisher().f();
        c.c().b(this);
        getAdSessionStatePublisher().b();
        this.f14505e = null;
        this.f14511k = null;
    }

    public boolean g() {
        return this.f14507g;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public String getAdSessionId() {
        return this.f14508h;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f14505e;
    }

    public boolean h() {
        return this.f14502b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f14502b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f14506f;
    }

    void k() {
        a();
        getAdSessionStatePublisher().g();
        this.f14509i = true;
    }

    void l() {
        b();
        getAdSessionStatePublisher().h();
        this.f14510j = true;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f14507g || c() == view) {
            return;
        }
        b(view);
        getAdSessionStatePublisher().a();
        a(view);
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f14507g) {
            return;
        }
        this.f14503c.b();
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f14507g) {
            return;
        }
        this.f14503c.c(view);
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f14511k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void start() {
        if (this.f14506f || this.f14505e == null) {
            return;
        }
        this.f14506f = true;
        c.c().c(this);
        this.f14505e.a(i.c().b());
        this.f14505e.a(com.iab.omid.library.ironsrc.internal.a.a().b());
        this.f14505e.a(this, this.f14501a);
    }

    a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f14503c = new f();
        this.f14506f = false;
        this.f14507g = false;
        this.f14502b = adSessionConfiguration;
        this.f14501a = adSessionContext;
        this.f14508h = str;
        b(null);
        this.f14505e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.ironsrc.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f14505e.i();
        c.c().a(this);
        this.f14505e.a(adSessionConfiguration);
    }

    private void a(View view) {
        Collection<a> b4 = c.c().b();
        if (b4 == null || b4.isEmpty()) {
            return;
        }
        for (a aVar : b4) {
            if (aVar != this && aVar.c() == view) {
                aVar.f14504d.clear();
            }
        }
    }

    private void b(View view) {
        this.f14504d = new com.iab.omid.library.ironsrc.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.ironsrc.weakreference.a> list) {
        if (e()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.ironsrc.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f14511k.onPossibleObstructionsDetected(this.f14508h, arrayList);
        }
    }

    void a(JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.f14510j = true;
    }
}
