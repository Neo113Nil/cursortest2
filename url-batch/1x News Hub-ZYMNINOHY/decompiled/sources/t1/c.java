package t1;

import android.text.TextUtils;
import f0.C0322a;
import j1.i;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;
import q1.AbstractC1180a;

/* loaded from: classes.dex */
public final class c extends AbstractAsyncTaskC1190a {

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f10372c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONObject f10373d;

    /* renamed from: e, reason: collision with root package name */
    public final long f10374e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(C0322a c0322a, HashSet hashSet, JSONObject jSONObject, long j3, int i3) {
        super(c0322a);
        this.f = i3;
        this.f10372c = new HashSet(hashSet);
        this.f10373d = jSONObject;
        this.f10374e = j3;
    }

    @Override // t1.AbstractAsyncTaskC1190a
    /* renamed from: a */
    public final void onPostExecute(String str) {
        n1.c cVar;
        switch (this.f) {
            case 0:
                n1.c cVar2 = n1.c.f10148c;
                if (cVar2 != null) {
                    for (i iVar : Collections.unmodifiableCollection(cVar2.f10149a)) {
                        if (this.f10372c.contains(iVar.f9546h)) {
                            AbstractC1180a abstractC1180a = iVar.f9544e;
                            if (this.f10374e >= abstractC1180a.f && abstractC1180a.f10233e != 3) {
                                abstractC1180a.f10233e = 3;
                                n1.i.f10160a.a(abstractC1180a.g(), "setNativeViewHierarchy", str, abstractC1180a.f10229a);
                            }
                        }
                    }
                }
                super.onPostExecute(str);
                break;
            default:
                if (!TextUtils.isEmpty(str) && (cVar = n1.c.f10148c) != null) {
                    for (i iVar2 : Collections.unmodifiableCollection(cVar.f10149a)) {
                        if (this.f10372c.contains(iVar2.f9546h)) {
                            AbstractC1180a abstractC1180a2 = iVar2.f9544e;
                            if (this.f10374e >= abstractC1180a2.f) {
                                abstractC1180a2.f10233e = 2;
                                n1.i.f10160a.a(abstractC1180a2.g(), "setNativeViewHierarchy", str, abstractC1180a2.f10229a);
                            }
                        }
                    }
                }
                super.onPostExecute(str);
                break;
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        switch (this.f) {
            case 0:
                return this.f10373d.toString();
            default:
                C0322a c0322a = this.f10371b;
                JSONObject jSONObject = (JSONObject) c0322a.f4977b;
                JSONObject jSONObject2 = this.f10373d;
                if (r1.b.f(jSONObject2, jSONObject)) {
                    return null;
                }
                c0322a.f4977b = jSONObject2;
                return jSONObject2.toString();
        }
    }

    @Override // t1.AbstractAsyncTaskC1190a, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        switch (this.f) {
            case 0:
                onPostExecute((String) obj);
                break;
            default:
                onPostExecute((String) obj);
                break;
        }
    }
}
