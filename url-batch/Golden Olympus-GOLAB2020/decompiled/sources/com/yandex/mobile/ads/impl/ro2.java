package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.yandex.mobile.ads.impl.bo2;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ro2 extends sn2 {
    public ro2(bo2.b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j4) {
        super(bVar, hashSet, jSONObject, j4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.mobile.ads.impl.bo2, android.os.AsyncTask
    /* renamed from: a */
    public final void onPostExecute(String str) {
        mn2 a4;
        if (!TextUtils.isEmpty(str) && (a4 = mn2.a()) != null) {
            for (ln2 ln2Var : a4.b()) {
                if (this.f31883c.contains(ln2Var.i())) {
                    ln2Var.j().a(str, this.f31885e);
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    protected final String doInBackground(Object[] objArr) {
        if (yn2.b(this.f31884d, ((ao2) this.f23888b).b())) {
            return null;
        }
        ((ao2) this.f23888b).a(this.f31884d);
        return this.f31884d.toString();
    }
}
