package P2;

import F2.i;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;
import l2.e;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f2089c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONObject f2090d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2091e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2092f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, HashSet hashSet, JSONObject jSONObject, long j4, int i4) {
        super(eVar);
        this.f2092f = i4;
        this.f2089c = new HashSet(hashSet);
        this.f2090d = jSONObject;
        this.f2091e = j4;
    }

    @Override // P2.a
    /* renamed from: a */
    public final void onPostExecute(String str) {
        J2.c cVar;
        switch (this.f2092f) {
            case 0:
                J2.c cVar2 = J2.c.f1173c;
                if (cVar2 != null) {
                    for (i iVar : Collections.unmodifiableCollection(cVar2.f1174a)) {
                        if (this.f2089c.contains(iVar.f788h)) {
                            M2.a aVar = iVar.f785e;
                            if (this.f2091e >= aVar.f1754f && aVar.f1753e != 3) {
                                aVar.f1753e = 3;
                                J2.i.f1185a.a(aVar.g(), "setNativeViewHierarchy", str, aVar.f1749a);
                            }
                        }
                    }
                }
                super.onPostExecute(str);
                break;
            default:
                if (!TextUtils.isEmpty(str) && (cVar = J2.c.f1173c) != null) {
                    for (i iVar2 : Collections.unmodifiableCollection(cVar.f1174a)) {
                        if (this.f2089c.contains(iVar2.f788h)) {
                            M2.a aVar2 = iVar2.f785e;
                            if (this.f2091e >= aVar2.f1754f) {
                                aVar2.f1753e = 2;
                                J2.i.f1185a.a(aVar2.g(), "setNativeViewHierarchy", str, aVar2.f1749a);
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
        switch (this.f2092f) {
            case 0:
                return this.f2090d.toString();
            default:
                e eVar = this.f2088b;
                JSONObject jSONObject = (JSONObject) eVar.f14270b;
                JSONObject jSONObject2 = this.f2090d;
                if (N2.b.f(jSONObject2, jSONObject)) {
                    return null;
                }
                eVar.f14270b = jSONObject2;
                return jSONObject2.toString();
        }
    }

    @Override // P2.a, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        switch (this.f2092f) {
            case 0:
                onPostExecute((String) obj);
                break;
            default:
                onPostExecute((String) obj);
                break;
        }
    }
}
