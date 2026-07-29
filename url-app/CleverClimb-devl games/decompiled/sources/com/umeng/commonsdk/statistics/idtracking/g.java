package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;

/* compiled from: NewUMIDTracker.java */
/* loaded from: classes2.dex */
public class g extends a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9172a = "newumid";

    /* renamed from: b, reason: collision with root package name */
    private Context f9173b;

    public g(Context context) {
        super(f9172a);
        this.f9173b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public String f() {
        return UMEnvelopeBuild.imprintProperty(this.f9173b, com.umeng.commonsdk.proguard.d.f, null);
    }
}
