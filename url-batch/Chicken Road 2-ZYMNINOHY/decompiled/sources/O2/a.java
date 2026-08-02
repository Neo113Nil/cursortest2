package O2;

import B1.j;
import F2.i;
import J2.f;
import J2.l;
import a.AbstractC0124a;
import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.view.View;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import l2.e;
import org.json.JSONException;
import org.json.JSONObject;
import t1.h;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2032a;

    public /* synthetic */ a(int i4) {
        this.f2032a = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010f  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        HashMap hashMap;
        HashSet hashSet;
        Throwable th;
        boolean z;
        b bVar;
        KeyguardManager keyguardManager;
        d dVar;
        HashSet hashSet2;
        Iterator it;
        Activity activity;
        boolean z4;
        Boolean bool;
        View view;
        String str;
        switch (this.f2032a) {
            case 0:
                b bVar2 = b.f2033g;
                bVar2.getClass();
                bVar2.f2039b.clear();
                Iterator it2 = Collections.unmodifiableCollection(J2.c.f1173c.f1175b).iterator();
                while (it2.hasNext()) {
                    ((i) it2.next()).getClass();
                }
                bVar2.f2043f = System.nanoTime();
                e eVar = bVar2.f2040c;
                e eVar2 = bVar2.f2042e;
                d dVar2 = bVar2.f2041d;
                HashMap hashMap2 = (HashMap) dVar2.f2050e;
                HashMap hashMap3 = (HashMap) dVar2.f2048c;
                HashMap hashMap4 = (HashMap) dVar2.f2047b;
                HashSet hashSet3 = (HashSet) dVar2.f2051f;
                HashSet hashSet4 = (HashSet) dVar2.f2054i;
                HashMap hashMap5 = (HashMap) dVar2.f2049d;
                HashSet hashSet5 = (HashSet) dVar2.f2052g;
                HashSet hashSet6 = (HashSet) dVar2.f2053h;
                J2.c cVar = J2.c.f1173c;
                if (cVar != null) {
                    Iterator it3 = Collections.unmodifiableCollection(cVar.f1175b).iterator();
                    while (it3.hasNext()) {
                        i iVar = (i) it3.next();
                        View view2 = (View) iVar.f784d.get();
                        String str2 = iVar.f788h;
                        b bVar3 = bVar2;
                        if (!iVar.f786f || iVar.f787g) {
                            dVar = dVar2;
                            hashSet2 = hashSet4;
                            it = it3;
                        } else if (view2 != null) {
                            Context context = view2.getContext();
                            it = it3;
                            while (true) {
                                if (!(context instanceof ContextWrapper)) {
                                    activity = null;
                                } else if (context instanceof Activity) {
                                    activity = (Activity) context;
                                } else {
                                    context = ((ContextWrapper) context).getBaseContext();
                                }
                            }
                            boolean isInPictureInPictureMode = activity != null ? activity.isInPictureInPictureMode() : false;
                            if (isInPictureInPictureMode) {
                                hashSet4.add(str2);
                            }
                            hashSet2 = hashSet4;
                            if (view2.isAttachedToWindow()) {
                                WeakHashMap weakHashMap = (WeakHashMap) dVar2.f2055j;
                                if (view2.hasWindowFocus()) {
                                    weakHashMap.remove(view2);
                                    bool = Boolean.FALSE;
                                } else if (weakHashMap.containsKey(view2)) {
                                    bool = (Boolean) weakHashMap.get(view2);
                                } else {
                                    z4 = isInPictureInPictureMode;
                                    Boolean bool2 = Boolean.FALSE;
                                    weakHashMap.put(view2, bool2);
                                    bool = bool2;
                                    if (bool.booleanValue() || z4) {
                                        HashSet hashSet7 = new HashSet();
                                        view = view2;
                                        while (view != null) {
                                            String a3 = AbstractC0124a.a(view);
                                            if (a3 != null) {
                                                str = a3;
                                            } else {
                                                hashSet7.add(view);
                                                Object parent = view.getParent();
                                                d dVar3 = dVar2;
                                                if (parent instanceof View) {
                                                    view = (View) parent;
                                                    dVar2 = dVar3;
                                                } else {
                                                    dVar2 = dVar3;
                                                    view = null;
                                                }
                                            }
                                        }
                                        dVar = dVar2;
                                        hashSet3.addAll(hashSet7);
                                        str = null;
                                    } else {
                                        dVar = dVar2;
                                        str = "noWindowFocus";
                                    }
                                    if (str == null) {
                                        hashSet5.add(str2);
                                        hashMap4.put(view2, str2);
                                        ArrayList arrayList = iVar.f783c.f1182a;
                                        int size = arrayList.size();
                                        int i4 = 0;
                                        while (i4 < size) {
                                            Object obj = arrayList.get(i4);
                                            i4++;
                                            f fVar = (f) obj;
                                            View view3 = (View) fVar.f1179a.get();
                                            if (view3 != null) {
                                                c cVar2 = (c) hashMap3.get(view3);
                                                if (cVar2 != null) {
                                                    cVar2.f2045b.add(str2);
                                                } else {
                                                    hashMap3.put(view3, new c(fVar, str2));
                                                }
                                            }
                                        }
                                    } else if (str != "noWindowFocus") {
                                        hashSet6.add(str2);
                                        hashMap5.put(str2, view2);
                                        hashMap2.put(str2, str);
                                    }
                                }
                                z4 = isInPictureInPictureMode;
                                if (bool.booleanValue()) {
                                }
                                HashSet hashSet72 = new HashSet();
                                view = view2;
                                while (view != null) {
                                }
                                dVar = dVar2;
                                hashSet3.addAll(hashSet72);
                                str = null;
                                if (str == null) {
                                }
                            } else {
                                str = "notAttached";
                            }
                            dVar = dVar2;
                            if (str == null) {
                            }
                        } else {
                            dVar = dVar2;
                            hashSet6.add(str2);
                            hashMap2.put(str2, "noAdView");
                            bVar2 = bVar3;
                            dVar2 = dVar;
                        }
                        bVar2 = bVar3;
                        it3 = it;
                        hashSet4 = hashSet2;
                        dVar2 = dVar;
                    }
                }
                d dVar4 = dVar2;
                HashSet hashSet8 = hashSet4;
                b bVar4 = bVar2;
                long nanoTime = System.nanoTime();
                h hVar = (h) eVar.f14271c;
                if (hashSet6.size() > 0) {
                    Iterator it4 = hashSet6.iterator();
                    while (it4.hasNext()) {
                        String str3 = (String) it4.next();
                        HashSet hashSet9 = hashSet6;
                        JSONObject d4 = hVar.d(null);
                        View view4 = (View) hashMap5.get(str3);
                        Iterator it5 = it4;
                        h hVar2 = (h) eVar.f14270b;
                        e eVar3 = eVar;
                        String str4 = (String) hashMap2.get(str3);
                        if (str4 != null) {
                            JSONObject d5 = hVar2.d(view4);
                            try {
                                d5.put("adSessionId", str3);
                            } catch (JSONException unused) {
                            }
                            try {
                                d5.put("notVisibleReason", str4);
                            } catch (JSONException unused2) {
                            }
                            N2.b.c(d4, d5);
                        }
                        N2.b.e(d4);
                        HashSet hashSet10 = hashSet5;
                        HashSet hashSet11 = new HashSet();
                        hashSet11.add(str3);
                        j jVar = (j) eVar2.f14271c;
                        HashMap hashMap6 = hashMap5;
                        P2.c cVar3 = new P2.c(eVar2, hashSet11, d4, nanoTime, 0);
                        e eVar4 = eVar2;
                        cVar3.f2087a = jVar;
                        ((ArrayDeque) jVar.f202c).add(cVar3);
                        if (((P2.a) jVar.f203d) == null) {
                            jVar.g();
                        }
                        hashMap5 = hashMap6;
                        eVar2 = eVar4;
                        it4 = it5;
                        hashSet5 = hashSet10;
                        hashSet6 = hashSet9;
                        eVar = eVar3;
                    }
                }
                HashMap hashMap7 = hashMap5;
                HashSet hashSet12 = hashSet5;
                HashSet hashSet13 = hashSet6;
                e eVar5 = eVar2;
                if (hashSet12.size() > 0) {
                    JSONObject d6 = hVar.d(null);
                    hashSet = hashSet3;
                    hashMap = hashMap4;
                    th = null;
                    bVar = bVar4;
                    hVar.g(null, d6, bVar, true, false);
                    N2.b.e(d6);
                    j jVar2 = (j) eVar5.f14271c;
                    z = false;
                    P2.c cVar4 = new P2.c(eVar5, hashSet12, d6, nanoTime, 1);
                    cVar4.f2087a = jVar2;
                    ((ArrayDeque) jVar2.f202c).add(cVar4);
                    if (((P2.a) jVar2.f203d) == null) {
                        jVar2.g();
                    }
                } else {
                    hashMap = hashMap4;
                    hashSet = hashSet3;
                    th = null;
                    z = false;
                    bVar = bVar4;
                    j jVar3 = (j) eVar5.f14271c;
                    P2.b bVar5 = new P2.b(eVar5);
                    bVar5.f2087a = jVar3;
                    ((ArrayDeque) jVar3.f202c).add(bVar5);
                    if (((P2.a) jVar3.f203d) == null) {
                        jVar3.g();
                    }
                }
                hashMap.clear();
                hashMap3.clear();
                hashMap7.clear();
                hashSet.clear();
                hashSet12.clear();
                hashSet13.clear();
                hashMap2.clear();
                dVar4.f2046a = z;
                hashSet8.clear();
                long nanoTime2 = System.nanoTime() - bVar.f2043f;
                ArrayList arrayList2 = bVar.f2038a;
                if (arrayList2.size() > 0) {
                    Iterator it6 = arrayList2.iterator();
                    if (it6.hasNext()) {
                        if (it6.next() != null) {
                            throw new ClassCastException();
                        }
                        TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                        throw th;
                    }
                }
                l lVar = l.f1192d;
                Context context2 = (Context) lVar.f1193a.get();
                if (context2 == null || (keyguardManager = (KeyguardManager) context2.getSystemService("keyguard")) == null) {
                    return;
                }
                boolean isDeviceLocked = keyguardManager.isDeviceLocked();
                lVar.a(lVar.f1194b, isDeviceLocked);
                lVar.f1195c = isDeviceLocked;
                return;
            default:
                Handler handler = b.f2035i;
                if (handler != null) {
                    handler.post(b.f2036j);
                    b.f2035i.postDelayed(b.f2037k, 200L);
                    return;
                }
                return;
        }
    }
}
