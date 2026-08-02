package s1;

import A0.f;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import b0.r;
import f0.C0322a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: g, reason: collision with root package name */
    public static final b f10295g = new b();

    /* renamed from: h, reason: collision with root package name */
    public static final Handler f10296h = new Handler(Looper.getMainLooper());

    /* renamed from: i, reason: collision with root package name */
    public static Handler f10297i = null;

    /* renamed from: j, reason: collision with root package name */
    public static final RunnableC1187a f10298j = new RunnableC1187a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final RunnableC1187a f10299k = new RunnableC1187a(1);
    public long f;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f10300a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f10301b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final d f10303d = new d();

    /* renamed from: c, reason: collision with root package name */
    public final C0322a f10302c = new C0322a();

    /* renamed from: e, reason: collision with root package name */
    public final C0322a f10304e = new C0322a(new f(22));

    public static void b() {
        if (f10297i == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f10297i = handler;
            handler.post(f10298j);
            f10297i.postDelayed(f10299k, 200L);
        }
    }

    public final void a(View view, r rVar, JSONObject jSONObject, boolean z) {
        Object obj;
        boolean z2;
        if (android.support.v4.media.session.a.a(view) == null) {
            d dVar = this.f10303d;
            char c3 = dVar.f10310d.contains(view) ? (char) 1 : dVar.f10315j ? (char) 2 : (char) 3;
            if (c3 == 3) {
                return;
            }
            JSONObject g3 = rVar.g(view);
            r1.b.c(jSONObject, g3);
            HashMap hashMap = dVar.f10307a;
            if (hashMap.size() == 0) {
                obj = null;
            } else {
                obj = (String) hashMap.get(view);
                if (obj != null) {
                    hashMap.remove(view);
                }
            }
            boolean z3 = false;
            if (obj != null) {
                try {
                    g3.put("adSessionId", obj);
                } catch (JSONException unused) {
                }
                WeakHashMap weakHashMap = dVar.f10314i;
                if (weakHashMap.containsKey(view)) {
                    weakHashMap.put(view, Boolean.TRUE);
                } else {
                    z3 = true;
                }
                try {
                    g3.put("hasWindowFocus", Boolean.valueOf(z3));
                } catch (JSONException unused2) {
                }
                boolean contains = dVar.f10313h.contains(obj);
                Object valueOf = Boolean.valueOf(contains);
                if (contains) {
                    try {
                        g3.put("isPipActive", valueOf);
                    } catch (JSONException unused3) {
                    }
                }
                dVar.f10315j = true;
                return;
            }
            HashMap hashMap2 = dVar.f10308b;
            c cVar = (c) hashMap2.get(view);
            if (cVar != null) {
                hashMap2.remove(view);
            }
            if (cVar != null) {
                n1.f fVar = cVar.f10305a;
                JSONArray jSONArray = new JSONArray();
                Iterator it = cVar.f10306b.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
                try {
                    g3.put("isFriendlyObstructionFor", jSONArray);
                    g3.put("friendlyObstructionClass", fVar.f10155b);
                    g3.put("friendlyObstructionPurpose", fVar.f10156c);
                    g3.put("friendlyObstructionReason", (Object) null);
                } catch (JSONException unused4) {
                }
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z4 = z || z2;
            boolean z5 = c3 == 1;
            rVar.getClass();
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int i3 = 0;
                if (!z5) {
                    while (i3 < viewGroup.getChildCount()) {
                        a(viewGroup.getChildAt(i3), rVar, g3, z4);
                        i3++;
                    }
                    return;
                }
                HashMap hashMap3 = new HashMap();
                while (i3 < viewGroup.getChildCount()) {
                    View childAt = viewGroup.getChildAt(i3);
                    ArrayList arrayList = (ArrayList) hashMap3.get(Float.valueOf(childAt.getZ()));
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        hashMap3.put(Float.valueOf(childAt.getZ()), arrayList);
                    }
                    arrayList.add(childAt);
                    i3++;
                }
                ArrayList arrayList2 = new ArrayList(hashMap3.keySet());
                Collections.sort(arrayList2);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Iterator it3 = ((ArrayList) hashMap3.get((Float) it2.next())).iterator();
                    while (it3.hasNext()) {
                        a((View) it3.next(), rVar, g3, z4);
                    }
                }
            }
        }
    }
}
