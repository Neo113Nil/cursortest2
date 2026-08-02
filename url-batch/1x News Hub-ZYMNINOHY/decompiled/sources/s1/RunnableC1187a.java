package s1;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.view.View;
import b0.r;
import b0.s;
import f0.C0322a;
import j1.i;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import n1.f;
import n1.l;
import org.json.JSONException;
import org.json.JSONObject;
import t1.AbstractAsyncTaskC1190a;

/* renamed from: s1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1187a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10294a;

    public /* synthetic */ RunnableC1187a(int i3) {
        this.f10294a = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0161  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        HashSet hashSet;
        boolean z;
        Throwable th;
        KeyguardManager keyguardManager;
        Iterator it;
        Iterator it2;
        HashSet hashSet2;
        Activity activity;
        Boolean bool;
        String str;
        switch (this.f10294a) {
            case 0:
                b bVar = b.f10295g;
                bVar.getClass();
                bVar.f10301b.clear();
                Iterator it3 = Collections.unmodifiableCollection(n1.c.f10148c.f10150b).iterator();
                while (it3.hasNext()) {
                    ((i) it3.next()).getClass();
                }
                bVar.f = System.nanoTime();
                d dVar = bVar.f10303d;
                dVar.getClass();
                n1.c cVar = n1.c.f10148c;
                HashMap hashMap = dVar.f10308b;
                HashMap hashMap2 = dVar.f10307a;
                HashSet hashSet3 = dVar.f10310d;
                HashSet hashSet4 = dVar.f10313h;
                HashMap hashMap3 = dVar.f10309c;
                HashMap hashMap4 = dVar.f10312g;
                HashSet hashSet5 = dVar.f10311e;
                HashSet hashSet6 = dVar.f;
                if (cVar != null) {
                    Iterator it4 = Collections.unmodifiableCollection(cVar.f10150b).iterator();
                    while (it4.hasNext()) {
                        i iVar = (i) it4.next();
                        View view = (View) iVar.f9543d.get();
                        if (!iVar.f || iVar.f9545g) {
                            it2 = it4;
                            hashSet2 = hashSet4;
                        } else {
                            String str2 = iVar.f9546h;
                            if (view != null) {
                                Context context = view.getContext();
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
                                boolean z2 = isInPictureInPictureMode;
                                if (view.isAttachedToWindow()) {
                                    boolean hasWindowFocus = view.hasWindowFocus();
                                    it2 = it4;
                                    WeakHashMap weakHashMap = dVar.f10314i;
                                    if (hasWindowFocus) {
                                        weakHashMap.remove(view);
                                        bool = Boolean.FALSE;
                                    } else if (weakHashMap.containsKey(view)) {
                                        bool = (Boolean) weakHashMap.get(view);
                                    } else {
                                        Boolean bool2 = Boolean.FALSE;
                                        weakHashMap.put(view, bool2);
                                        bool = bool2;
                                    }
                                    if (!bool.booleanValue() || z2) {
                                        HashSet hashSet7 = new HashSet();
                                        View view2 = view;
                                        while (view2 != null) {
                                            String a3 = android.support.v4.media.session.a.a(view2);
                                            if (a3 != null) {
                                                str = a3;
                                            } else {
                                                hashSet7.add(view2);
                                                Object parent = view2.getParent();
                                                HashSet hashSet8 = hashSet4;
                                                if (parent instanceof View) {
                                                    view2 = (View) parent;
                                                    hashSet4 = hashSet8;
                                                } else {
                                                    hashSet4 = hashSet8;
                                                    view2 = null;
                                                }
                                            }
                                        }
                                        hashSet2 = hashSet4;
                                        hashSet3.addAll(hashSet7);
                                        str = null;
                                        if (str != null) {
                                            hashSet5.add(str2);
                                            hashMap2.put(view, str2);
                                            Iterator it5 = iVar.f9542c.f10157a.iterator();
                                            while (it5.hasNext()) {
                                                f fVar = (f) it5.next();
                                                View view3 = (View) fVar.f10154a.get();
                                                if (view3 != null) {
                                                    c cVar2 = (c) hashMap.get(view3);
                                                    if (cVar2 != null) {
                                                        cVar2.f10306b.add(str2);
                                                    } else {
                                                        hashMap.put(view3, new c(fVar, str2));
                                                    }
                                                }
                                            }
                                        } else if (str != "noWindowFocus") {
                                            hashSet6.add(str2);
                                            hashMap3.put(str2, view);
                                            hashMap4.put(str2, str);
                                        }
                                    } else {
                                        str = "noWindowFocus";
                                    }
                                } else {
                                    str = "notAttached";
                                    it2 = it4;
                                }
                                hashSet2 = hashSet4;
                                if (str != null) {
                                }
                            } else {
                                hashSet6.add(str2);
                                hashMap4.put(str2, "noAdView");
                            }
                        }
                        hashSet4 = hashSet2;
                        it4 = it2;
                    }
                }
                HashSet hashSet9 = hashSet4;
                long nanoTime = System.nanoTime();
                C0322a c0322a = bVar.f10302c;
                s sVar = (s) c0322a.f4978c;
                int size = hashSet6.size();
                C0322a c0322a2 = bVar.f10304e;
                if (size > 0) {
                    Iterator it6 = hashSet6.iterator();
                    while (it6.hasNext()) {
                        String str3 = (String) it6.next();
                        JSONObject d3 = sVar.d(null);
                        View view4 = (View) hashMap3.get(str3);
                        HashMap hashMap5 = hashMap;
                        String str4 = (String) hashMap4.get(str3);
                        HashMap hashMap6 = hashMap2;
                        if (str4 != null) {
                            JSONObject g3 = ((r) c0322a.f4977b).g(view4);
                            try {
                                g3.put("adSessionId", str3);
                            } catch (JSONException unused) {
                            }
                            try {
                                g3.put("notVisibleReason", str4);
                            } catch (JSONException unused2) {
                            }
                            r1.b.c(d3, g3);
                        }
                        r1.b.e(d3);
                        HashSet hashSet10 = new HashSet();
                        hashSet10.add(str3);
                        c0322a2.getClass();
                        t1.c cVar3 = new t1.c(c0322a2, hashSet10, d3, nanoTime, 0);
                        A0.f fVar2 = (A0.f) c0322a2.f4978c;
                        cVar3.f10370a = fVar2;
                        ((ArrayDeque) fVar2.f24c).add(cVar3);
                        if (((AbstractAsyncTaskC1190a) fVar2.f25d) == null) {
                            fVar2.s();
                        }
                        hashMap2 = hashMap6;
                        hashMap = hashMap5;
                    }
                }
                HashMap hashMap7 = hashMap;
                HashMap hashMap8 = hashMap2;
                if (hashSet5.size() > 0) {
                    JSONObject d4 = sVar.d(null);
                    sVar.getClass();
                    ArrayList arrayList = new ArrayList();
                    n1.c cVar4 = n1.c.f10148c;
                    if (cVar4 != null) {
                        Collection unmodifiableCollection = Collections.unmodifiableCollection(cVar4.f10150b);
                        IdentityHashMap identityHashMap = new IdentityHashMap((unmodifiableCollection.size() << 1) + 3);
                        Iterator it7 = unmodifiableCollection.iterator();
                        while (it7.hasNext()) {
                            View view5 = (View) ((i) it7.next()).f9543d.get();
                            if (view5 != null && view5.isAttachedToWindow() && view5.isShown()) {
                                View view6 = view5;
                                while (true) {
                                    if (view6 == null) {
                                        View rootView = view5.getRootView();
                                        if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                            identityHashMap.put(rootView, rootView);
                                            float z3 = rootView.getZ();
                                            int size2 = arrayList.size();
                                            while (true) {
                                                if (size2 > 0) {
                                                    it = it7;
                                                    if (((View) arrayList.get(size2 - 1)).getZ() > z3) {
                                                        size2--;
                                                        it7 = it;
                                                    }
                                                } else {
                                                    it = it7;
                                                }
                                            }
                                            arrayList.add(size2, rootView);
                                            it7 = it;
                                        }
                                    } else {
                                        if (view6.getAlpha() == 0.0f) {
                                            break;
                                        }
                                        Object parent2 = view6.getParent();
                                        view6 = parent2 instanceof View ? (View) parent2 : null;
                                    }
                                }
                            }
                        }
                    }
                    Iterator it8 = arrayList.iterator();
                    while (it8.hasNext()) {
                        bVar.a((View) it8.next(), (r) sVar.f2544a, d4, false);
                    }
                    r1.b.e(d4);
                    c0322a2.getClass();
                    hashSet = hashSet6;
                    z = false;
                    th = null;
                    t1.c cVar5 = new t1.c(c0322a2, hashSet5, d4, nanoTime, 1);
                    A0.f fVar3 = (A0.f) c0322a2.f4978c;
                    cVar5.f10370a = fVar3;
                    ((ArrayDeque) fVar3.f24c).add(cVar5);
                    if (((AbstractAsyncTaskC1190a) fVar3.f25d) == null) {
                        fVar3.s();
                    }
                } else {
                    hashSet = hashSet6;
                    z = false;
                    th = null;
                    c0322a2.getClass();
                    t1.b bVar2 = new t1.b(c0322a2);
                    A0.f fVar4 = (A0.f) c0322a2.f4978c;
                    bVar2.f10370a = fVar4;
                    ((ArrayDeque) fVar4.f24c).add(bVar2);
                    if (((AbstractAsyncTaskC1190a) fVar4.f25d) == null) {
                        fVar4.s();
                    }
                }
                hashMap8.clear();
                hashMap7.clear();
                hashMap3.clear();
                hashSet3.clear();
                hashSet5.clear();
                hashSet.clear();
                hashMap4.clear();
                dVar.f10315j = z;
                hashSet9.clear();
                long nanoTime2 = System.nanoTime() - bVar.f;
                ArrayList arrayList2 = bVar.f10300a;
                if (arrayList2.size() > 0) {
                    Iterator it9 = arrayList2.iterator();
                    if (it9.hasNext()) {
                        if (it9.next() != null) {
                            throw new ClassCastException();
                        }
                        TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                        throw th;
                    }
                }
                l lVar = l.f10167d;
                Context context2 = (Context) lVar.f10168a.get();
                if (context2 == null || (keyguardManager = (KeyguardManager) context2.getSystemService("keyguard")) == null) {
                    return;
                }
                boolean isDeviceLocked = keyguardManager.isDeviceLocked();
                lVar.a(lVar.f10169b, isDeviceLocked);
                lVar.f10170c = isDeviceLocked;
                return;
            default:
                Handler handler = b.f10297i;
                if (handler != null) {
                    handler.post(b.f10298j);
                    b.f10297i.postDelayed(b.f10299k, 200L);
                    return;
                }
                return;
        }
    }
}
