package O2;

import B1.j;
import J2.f;
import a.AbstractC0124a;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;
import l2.e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t1.h;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: g, reason: collision with root package name */
    public static final b f2033g = new b();

    /* renamed from: h, reason: collision with root package name */
    public static final Handler f2034h = new Handler(Looper.getMainLooper());

    /* renamed from: i, reason: collision with root package name */
    public static Handler f2035i = null;

    /* renamed from: j, reason: collision with root package name */
    public static final a f2036j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f2037k = new a(1);

    /* renamed from: f, reason: collision with root package name */
    public long f2043f;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2038a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2039b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final d f2041d = new d();

    /* renamed from: c, reason: collision with root package name */
    public final e f2040c = new e(10);

    /* renamed from: e, reason: collision with root package name */
    public final e f2042e = new e(new j(7));

    public static void b() {
        if (f2035i == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f2035i = handler;
            handler.post(f2036j);
            f2035i.postDelayed(f2037k, 200L);
        }
    }

    public final void a(View view, h hVar, JSONObject jSONObject, boolean z) {
        Object obj;
        boolean z4;
        if (AbstractC0124a.a(view) == null) {
            d dVar = this.f2041d;
            char c4 = ((HashSet) dVar.f2051f).contains(view) ? (char) 1 : dVar.f2046a ? (char) 2 : (char) 3;
            if (c4 == 3) {
                return;
            }
            JSONObject d4 = hVar.d(view);
            N2.b.c(jSONObject, d4);
            HashMap hashMap = (HashMap) dVar.f2047b;
            if (hashMap.size() == 0) {
                obj = null;
            } else {
                obj = (String) hashMap.get(view);
                if (obj != null) {
                    hashMap.remove(view);
                }
            }
            boolean z5 = false;
            if (obj != null) {
                try {
                    d4.put("adSessionId", obj);
                } catch (JSONException unused) {
                }
                WeakHashMap weakHashMap = (WeakHashMap) dVar.f2055j;
                if (weakHashMap.containsKey(view)) {
                    weakHashMap.put(view, Boolean.TRUE);
                } else {
                    z5 = true;
                }
                try {
                    d4.put("hasWindowFocus", Boolean.valueOf(z5));
                } catch (JSONException unused2) {
                }
                boolean contains = ((HashSet) dVar.f2054i).contains(obj);
                Object valueOf = Boolean.valueOf(contains);
                if (contains) {
                    try {
                        d4.put("isPipActive", valueOf);
                    } catch (JSONException unused3) {
                    }
                }
                dVar.f2046a = true;
                return;
            }
            HashMap hashMap2 = (HashMap) dVar.f2048c;
            c cVar = (c) hashMap2.get(view);
            if (cVar != null) {
                hashMap2.remove(view);
            }
            if (cVar != null) {
                f fVar = cVar.f2044a;
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayList = cVar.f2045b;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj2 = arrayList.get(i4);
                    i4++;
                    jSONArray.put((String) obj2);
                }
                try {
                    d4.put("isFriendlyObstructionFor", jSONArray);
                    d4.put("friendlyObstructionClass", fVar.f1180b);
                    d4.put("friendlyObstructionPurpose", fVar.f1181c);
                    d4.put("friendlyObstructionReason", (Object) null);
                } catch (JSONException unused4) {
                }
                z4 = true;
            } else {
                z4 = false;
            }
            hVar.g(view, d4, this, c4 == 1, z || z4);
        }
    }
}
