package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class k03 extends f03 {
    /* JADX WARN: Multi-variable type inference failed */
    public k03(yz2 yz2Var, yz2 yz2Var2, HashSet<String> hashSet, JSONObject jSONObject, long j7) {
        super(yz2Var, yz2Var2, hashSet, jSONObject, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.g03
    /* renamed from: a */
    public final void onPostExecute(String str) {
        az2 a7;
        if (!TextUtils.isEmpty(str) && (a7 = az2.a()) != null) {
            for (py2 py2Var : a7.c()) {
                if (this.f4932c.contains(py2Var.h())) {
                    py2Var.g().e(str, this.f4934e);
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ String doInBackground(Object[] objArr) {
        if (sz2.i(this.f4933d, this.f5406b.a())) {
            return null;
        }
        this.f5406b.e(this.f4933d);
        return this.f4933d.toString();
    }

    @Override // com.google.android.gms.internal.ads.g03, android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(String str) {
        onPostExecute(str);
    }
}
