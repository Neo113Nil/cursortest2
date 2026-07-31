package com.iab.omid.library.ironsrc.internal;

import android.view.View;
import com.iab.omid.library.ironsrc.adsession.FriendlyObstructionPurpose;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.ironsrc.weakreference.a f14542a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14543b;

    /* renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f14544c;

    /* renamed from: d, reason: collision with root package name */
    private final String f14545d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f14542a = new com.iab.omid.library.ironsrc.weakreference.a(view);
        this.f14543b = view.getClass().getCanonicalName();
        this.f14544c = friendlyObstructionPurpose;
        this.f14545d = str;
    }

    public String a() {
        return this.f14545d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f14544c;
    }

    public com.iab.omid.library.ironsrc.weakreference.a c() {
        return this.f14542a;
    }

    public String d() {
        return this.f14543b;
    }
}
