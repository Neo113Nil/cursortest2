package com.iab.omid.library.ironsrc.walking.async;

import android.text.TextUtils;
import com.iab.omid.library.ironsrc.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f extends a {
    public f(b.InterfaceC0144b interfaceC0144b, HashSet<String> hashSet, JSONObject jSONObject, long j4) {
        super(interfaceC0144b, hashSet, jSONObject, j4);
    }

    private void b(String str) {
        com.iab.omid.library.ironsrc.internal.c c4 = com.iab.omid.library.ironsrc.internal.c.c();
        if (c4 != null) {
            for (com.iab.omid.library.ironsrc.adsession.a aVar : c4.b()) {
                if (this.f14620c.contains(aVar.getAdSessionId())) {
                    aVar.getAdSessionStatePublisher().b(str, this.f14622e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        if (com.iab.omid.library.ironsrc.utils.c.h(this.f14621d, this.f14624b.a())) {
            return null;
        }
        this.f14624b.a(this.f14621d);
        return this.f14621d.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.ironsrc.walking.async.b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            b(str);
        }
        super.onPostExecute(str);
    }
}
