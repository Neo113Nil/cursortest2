package defpackage;

import android.content.pm.PackageManager;
import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewm {
    public final String a;
    final hac b;
    final hac c;
    Resources d;
    public final /* synthetic */ ifn e;

    public ewm(ifn ifnVar, String str, hac hacVar) {
        this.e = ifnVar;
        this.a = str;
        this.b = new ewi(new ewj(this, ifnVar, str, 0));
        this.c = hacVar;
    }

    public final Resources a() {
        Resources resources = this.d;
        if (resources != null) {
            return resources;
        }
        ifn ifnVar = this.e;
        Resources resourcesForApplication = ((PackageManager) ifnVar.a).getResourcesForApplication(this.a);
        this.d = resourcesForApplication;
        return resourcesForApplication;
    }
}
