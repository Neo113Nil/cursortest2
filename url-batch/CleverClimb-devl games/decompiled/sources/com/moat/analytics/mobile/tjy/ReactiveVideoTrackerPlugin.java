package com.moat.analytics.mobile.tjy;

/* loaded from: classes2.dex */
public class ReactiveVideoTrackerPlugin implements ac {

    /* renamed from: a, reason: collision with root package name */
    private final String f7213a;

    public ReactiveVideoTrackerPlugin(String str) {
        this.f7213a = str;
    }

    @Override // com.moat.analytics.mobile.tjy.ac
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ReactiveVideoTracker a() {
        return new bg();
    }

    @Override // com.moat.analytics.mobile.tjy.ac
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ReactiveVideoTracker a(a aVar, ap apVar) {
        return (ReactiveVideoTracker) ay.a(apVar, new bf(this, aVar, apVar), new be());
    }
}
