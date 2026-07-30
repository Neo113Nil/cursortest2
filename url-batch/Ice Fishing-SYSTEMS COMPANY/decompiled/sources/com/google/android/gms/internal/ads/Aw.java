package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Aw extends AbstractAsyncTaskC4251yw {

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f23928c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONObject f23929d;

    /* renamed from: e, reason: collision with root package name */
    public final long f23930e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f23931f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Aw(C2593Hm c2593Hm, HashSet hashSet, JSONObject jSONObject, long j9, int i) {
        super(c2593Hm);
        this.f23931f = i;
        this.f23928c = new HashSet(hashSet);
        this.f23929d = jSONObject;
        this.f23930e = j9;
    }

    @Override // com.google.android.gms.internal.ads.AbstractAsyncTaskC4251yw
    /* renamed from: a */
    public final void onPostExecute(String str) {
        C3282gw c3282gw;
        switch (this.f23931f) {
            case 0:
                b(str);
                super.onPostExecute(str);
                break;
            default:
                if (!TextUtils.isEmpty(str) && (c3282gw = C3282gw.f31116c) != null) {
                    for (Wv wv : Collections.unmodifiableCollection(c3282gw.f31117a)) {
                        if (this.f23928c.contains(wv.f28532g)) {
                            AbstractC3712ow abstractC3712ow = wv.f28529d;
                            if (this.f23930e >= abstractC3712ow.f33236c) {
                                abstractC3712ow.f33237d = 2;
                                T2.f27692z.C(abstractC3712ow.c(), "setNativeViewHierarchy", str, abstractC3712ow.f33234a);
                            }
                        }
                    }
                }
                super.onPostExecute(str);
                break;
        }
    }

    public void b(String str) {
        C3282gw c3282gw = C3282gw.f31116c;
        if (c3282gw != null) {
            for (Wv wv : Collections.unmodifiableCollection(c3282gw.f31117a)) {
                if (this.f23928c.contains(wv.f28532g)) {
                    AbstractC3712ow abstractC3712ow = wv.f28529d;
                    if (this.f23930e >= abstractC3712ow.f33236c && abstractC3712ow.f33237d != 3) {
                        abstractC3712ow.f33237d = 3;
                        T2.f27692z.C(abstractC3712ow.c(), "setNativeViewHierarchy", str, abstractC3712ow.f33234a);
                    }
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        switch (this.f23931f) {
            case 0:
                return this.f23929d.toString();
            default:
                C2593Hm c2593Hm = this.f35426b;
                JSONObject jSONObject = (JSONObject) c2593Hm.f25417v;
                JSONObject jSONObject2 = this.f23929d;
                if (AbstractC3981tw.e(jSONObject2, jSONObject)) {
                    return null;
                }
                c2593Hm.f25417v = jSONObject2;
                return jSONObject2.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractAsyncTaskC4251yw, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        switch (this.f23931f) {
            case 0:
                String str = (String) obj;
                b(str);
                super.onPostExecute(str);
                break;
            default:
                onPostExecute((String) obj);
                break;
        }
    }
}
