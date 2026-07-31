package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j03 extends f03 {
    /* JADX WARN: Multi-variable type inference failed */
    public j03(yz2 yz2Var, yz2 yz2Var2, HashSet<String> hashSet, JSONObject jSONObject, long j7) {
        super(yz2Var, yz2Var2, hashSet, jSONObject, null);
    }

    private final void c(String str) {
        az2 a7 = az2.a();
        if (a7 != null) {
            for (py2 py2Var : a7.c()) {
                if (this.f4932c.contains(py2Var.h())) {
                    py2Var.g().d(str, this.f4934e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.g03
    /* renamed from: a */
    public final void onPostExecute(String str) {
        c(str);
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ String doInBackground(Object[] objArr) {
        return this.f4933d.toString();
    }

    @Override // com.google.android.gms.internal.ads.g03, android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(String str) {
        String str2 = str;
        c(str2);
        super.onPostExecute(str2);
    }
}
