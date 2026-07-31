package com.iab.omid.library.startio.internal;

import android.view.View;
import com.iab.omid.library.startio.adsession.FriendlyObstructionPurpose;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.startio.weakreference.a f34a;
    private final String b;
    private final FriendlyObstructionPurpose c;
    private final String d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f34a = new com.iab.omid.library.startio.weakreference.a(view);
        this.b = view.getClass().getCanonicalName();
        this.c = friendlyObstructionPurpose;
        this.d = str;
    }

    public String a() {
        return this.d;
    }

    public FriendlyObstructionPurpose b() {
        return this.c;
    }

    public com.iab.omid.library.startio.weakreference.a c() {
        return this.f34a;
    }

    public String d() {
        return this.b;
    }
}
