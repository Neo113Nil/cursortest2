package com.manholeroboramprush.cardestroy;

import a1.d;
import android.app.Application;
import b1.j;
import com.appsflyer.AppsFlyerLib;
import v9.c;
import ze.a;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class BreadCrumb extends Application {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f3194d = 0;

    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        d dVar = new d(3, this);
        synchronized (a.f10966a) {
            ye.a aVar = new ye.a();
            if (a.f10967b != null) {
                throw new j("A Koin Application has already been started", 3);
            }
            a.f10967b = aVar.f10684a;
            dVar.invoke(aVar);
            aVar.f10684a.j();
        }
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        appsFlyerLib.init("McE6jkxmHSdD5zmJPysxC4", null, this);
        appsFlyerLib.start(this);
        ((v9.a) c.f9999a.getValue()).initWithContext(this, "471da784-3068-44f3-ad93-c82e573a256e");
    }
}
