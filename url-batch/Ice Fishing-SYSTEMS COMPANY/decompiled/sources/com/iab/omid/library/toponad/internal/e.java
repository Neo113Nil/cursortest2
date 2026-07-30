package com.iab.omid.library.toponad.internal;

import android.view.View;
import com.iab.omid.library.toponad.adsession.FriendlyObstructionPurpose;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.toponad.weakreference.a f36408a;

    /* renamed from: b, reason: collision with root package name */
    private final String f36409b;

    /* renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f36410c;

    /* renamed from: d, reason: collision with root package name */
    private final String f36411d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f36408a = new com.iab.omid.library.toponad.weakreference.a(view);
        this.f36409b = view.getClass().getCanonicalName();
        this.f36410c = friendlyObstructionPurpose;
        this.f36411d = str;
    }

    public String a() {
        return this.f36411d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f36410c;
    }

    public com.iab.omid.library.toponad.weakreference.a c() {
        return this.f36408a;
    }

    public String d() {
        return this.f36409b;
    }
}
