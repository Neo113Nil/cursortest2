package com.tapjoy.internal;

import com.tapjoy.internal.dt;
import com.tapjoy.internal.dz;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ec extends dy {
    public ec(dz.b bVar, HashSet hashSet, JSONObject jSONObject, double d2) {
        super(bVar, hashSet, jSONObject, d2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tapjoy.internal.dz, android.os.AsyncTask
    /* renamed from: a */
    public final void onPostExecute(String str) {
        dd a2 = dd.a();
        if (a2 != null) {
            for (cz czVar : Collections.unmodifiableCollection(a2.f7929a)) {
                if (this.f7973a.contains(czVar.f)) {
                    dt dtVar = czVar.f7917c;
                    if (this.f7975c > dtVar.e && dtVar.f7957d != dt.a.f7960c) {
                        dtVar.f7957d = dt.a.f7960c;
                        dg.a().b(dtVar.c(), str);
                    }
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.f7974b.toString();
    }
}
