package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes.dex */
public final /* synthetic */ class Ko implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10544a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10545b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f10546c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10547d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f10548e;

    public /* synthetic */ Ko(Object obj, String str, String str2, Object obj2, int i4) {
        this.f10544a = i4;
        this.f10547d = obj;
        this.f10545b = str;
        this.f10546c = str2;
        this.f10548e = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10544a) {
            case 0:
                F0.a((F0) this.f10547d, this.f10545b, this.f10546c, (String) this.f10548e);
                break;
            default:
                L0.a((L0) this.f10547d, this.f10545b, this.f10546c, (PluginErrorDetails) this.f10548e);
                break;
        }
    }
}
