package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class U6 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ U6 f27929u = new U6(2);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f27930n;

    public /* synthetic */ U6(int i) {
        this.f27930n = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0173  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        CountDownLatch countDownLatch;
        HashSet hashSet;
        KeyguardManager keyguardManager;
        C2593Hm c2593Hm;
        HashMap hashMap;
        Iterator it;
        HashSet hashSet2;
        Activity activity;
        Boolean bool;
        String str;
        switch (this.f27930n) {
            case 0:
                try {
                    V6.f28213b = MessageDigest.getInstance("MD5");
                    countDownLatch = V6.f28216e;
                } catch (NoSuchAlgorithmException unused) {
                    countDownLatch = V6.f28216e;
                } catch (Throwable th) {
                    V6.f28216e.countDown();
                    throw th;
                }
                countDownLatch.countDown();
                return;
            case 1:
                return;
            case 2:
                List list = C4072vf.f34819l;
                AbstractC3194fG.g("Pinged SB successfully.");
                return;
            case 3:
                Looper.myLooper().quit();
                return;
            case 4:
            case 5:
            case 6:
                return;
            case 7:
                C4197xw c4197xw = C4197xw.f35273g;
                c4197xw.getClass();
                c4197xw.f35278b.clear();
                for (Wv wv : Collections.unmodifiableCollection(C3282gw.f31116c.f31118b)) {
                }
                c4197xw.f35282f = System.nanoTime();
                C2631Jq c2631Jq = c4197xw.f35280d;
                c2631Jq.getClass();
                C3282gw c3282gw = C3282gw.f31116c;
                HashMap hashMap2 = (HashMap) c2631Jq.f25825w;
                HashMap hashMap3 = (HashMap) c2631Jq.f25819A;
                HashSet hashSet3 = (HashSet) c2631Jq.f25828z;
                HashMap hashMap4 = (HashMap) c2631Jq.f25824v;
                HashMap hashMap5 = (HashMap) c2631Jq.f25823u;
                HashSet hashSet4 = (HashSet) c2631Jq.f25826x;
                HashSet hashSet5 = (HashSet) c2631Jq.f25820B;
                HashSet hashSet6 = (HashSet) c2631Jq.f25827y;
                if (c3282gw != null) {
                    Iterator it2 = Collections.unmodifiableCollection(c3282gw.f31118b).iterator();
                    while (it2.hasNext()) {
                        Wv wv2 = (Wv) it2.next();
                        View view = (View) wv2.f28528c.get();
                        if (!wv2.f28530e || wv2.f28531f) {
                            it = it2;
                            hashSet2 = hashSet5;
                        } else {
                            String str2 = wv2.f28532g;
                            if (view != null) {
                                Context context = view.getContext();
                                it = it2;
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
                                    hashSet5.add(str2);
                                }
                                boolean z8 = isInPictureInPictureMode;
                                if (view.isAttachedToWindow()) {
                                    boolean hasWindowFocus = view.hasWindowFocus();
                                    WeakHashMap weakHashMap = (WeakHashMap) c2631Jq.f25821C;
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
                                    if (!bool.booleanValue() || z8) {
                                        HashSet hashSet7 = new HashSet();
                                        View view2 = view;
                                        while (true) {
                                            if (view2 == null) {
                                                hashSet2 = hashSet5;
                                                hashSet4.addAll(hashSet7);
                                                str = null;
                                            } else {
                                                String i = AbstractC3217fl.i(view2);
                                                if (i != null) {
                                                    hashSet2 = hashSet5;
                                                    str = i;
                                                } else {
                                                    hashSet7.add(view2);
                                                    Object parent = view2.getParent();
                                                    HashSet hashSet8 = hashSet5;
                                                    if (parent instanceof View) {
                                                        view2 = (View) parent;
                                                        hashSet5 = hashSet8;
                                                    } else {
                                                        hashSet5 = hashSet8;
                                                        view2 = null;
                                                    }
                                                }
                                            }
                                        }
                                        if (str != null) {
                                            hashSet6.add(str2);
                                            hashMap5.put(view, str2);
                                            Iterator it3 = wv2.f28527b.f32487a.iterator();
                                            while (it3.hasNext()) {
                                                C3442jw c3442jw = (C3442jw) it3.next();
                                                View view3 = (View) c3442jw.f32218a.get();
                                                if (view3 != null) {
                                                    C4089vw c4089vw = (C4089vw) hashMap4.get(view3);
                                                    if (c4089vw != null) {
                                                        c4089vw.f34903b.add(str2);
                                                    } else {
                                                        hashMap4.put(view3, new C4089vw(c3442jw, str2));
                                                    }
                                                }
                                            }
                                        } else if (str != "noWindowFocus") {
                                            hashSet3.add(str2);
                                            hashMap2.put(str2, view);
                                            hashMap3.put(str2, str);
                                        }
                                    } else {
                                        str = "noWindowFocus";
                                    }
                                } else {
                                    str = "notAttached";
                                }
                                hashSet2 = hashSet5;
                                if (str != null) {
                                }
                            } else {
                                hashSet3.add(str2);
                                hashMap3.put(str2, "noAdView");
                                it2 = it2;
                            }
                        }
                        it2 = it;
                        hashSet5 = hashSet2;
                    }
                }
                HashSet hashSet9 = hashSet5;
                long nanoTime = System.nanoTime();
                C2593Hm c2593Hm2 = c4197xw.f35279c;
                Mt mt = (Mt) c2593Hm2.f25416u;
                int size = hashSet3.size();
                C2593Hm c2593Hm3 = c4197xw.f35281e;
                if (size > 0) {
                    Iterator it4 = hashSet3.iterator();
                    while (it4.hasNext()) {
                        String str3 = (String) it4.next();
                        Iterator it5 = it4;
                        JSONObject k6 = mt.k(null);
                        View view4 = (View) hashMap2.get(str3);
                        String str4 = (String) hashMap3.get(str3);
                        if (str4 != null) {
                            hashMap = hashMap2;
                            JSONObject c4 = ((Mu) c2593Hm2.f25417v).c(view4);
                            try {
                                c4.put("adSessionId", str3);
                                c2593Hm = c2593Hm2;
                            } catch (JSONException e6) {
                                c2593Hm = c2593Hm2;
                                AbstractC2720Pd.j("Error with setting ad session id", e6);
                            }
                            try {
                                c4.put("notVisibleReason", str4);
                            } catch (JSONException e9) {
                                AbstractC2720Pd.j("Error with setting not visible reason", e9);
                            }
                            AbstractC3981tw.c(k6, c4);
                        } else {
                            c2593Hm = c2593Hm2;
                            hashMap = hashMap2;
                        }
                        AbstractC3981tw.d(k6);
                        HashSet hashSet10 = new HashSet();
                        hashSet10.add(str3);
                        c2593Hm3.getClass();
                        Aw aw = new Aw(c2593Hm3, hashSet10, k6, nanoTime, 0);
                        C4017ue c4017ue = (C4017ue) c2593Hm3.f25416u;
                        aw.f35425a = c4017ue;
                        ArrayDeque arrayDeque = (ArrayDeque) c4017ue.f34631v;
                        arrayDeque.add(aw);
                        if (((AbstractAsyncTaskC4251yw) c4017ue.f34632w) == null) {
                            AbstractAsyncTaskC4251yw abstractAsyncTaskC4251yw = (AbstractAsyncTaskC4251yw) arrayDeque.poll();
                            c4017ue.f34632w = abstractAsyncTaskC4251yw;
                            if (abstractAsyncTaskC4251yw != null) {
                                abstractAsyncTaskC4251yw.executeOnExecutor((ThreadPoolExecutor) c4017ue.f34630u, new Object[0]);
                            }
                        }
                        it4 = it5;
                        c2593Hm2 = c2593Hm;
                        hashMap2 = hashMap;
                    }
                }
                HashMap hashMap6 = hashMap2;
                if (hashSet6.size() > 0) {
                    JSONObject k9 = mt.k(null);
                    mt.getClass();
                    ArrayList arrayList = new ArrayList();
                    C3282gw c3282gw2 = C3282gw.f31116c;
                    if (c3282gw2 != null) {
                        Collection unmodifiableCollection = Collections.unmodifiableCollection(c3282gw2.f31118b);
                        int size2 = unmodifiableCollection.size();
                        IdentityHashMap identityHashMap = new IdentityHashMap(size2 + size2 + 3);
                        Iterator it6 = unmodifiableCollection.iterator();
                        while (it6.hasNext()) {
                            View view5 = (View) ((Wv) it6.next()).f28528c.get();
                            if (view5 != null && view5.isAttachedToWindow() && view5.isShown()) {
                                View view6 = view5;
                                while (true) {
                                    if (view6 == null) {
                                        Iterator it7 = it6;
                                        View rootView = view5.getRootView();
                                        if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                            identityHashMap.put(rootView, rootView);
                                            float z9 = rootView.getZ();
                                            int size3 = arrayList.size();
                                            while (size3 > 0) {
                                                float f6 = z9;
                                                int i4 = size3 - 1;
                                                if (((View) arrayList.get(i4)).getZ() > f6) {
                                                    size3 = i4;
                                                    z9 = f6;
                                                } else {
                                                    arrayList.add(size3, rootView);
                                                }
                                            }
                                            arrayList.add(size3, rootView);
                                        }
                                        it6 = it7;
                                    } else {
                                        if (view6.getAlpha() == 0.0f) {
                                            break;
                                        }
                                        Object parent2 = view6.getParent();
                                        Iterator it8 = it6;
                                        if (parent2 instanceof View) {
                                            view6 = (View) parent2;
                                            it6 = it8;
                                        } else {
                                            it6 = it8;
                                            view6 = null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    int size4 = arrayList.size();
                    int i9 = 0;
                    while (i9 < size4) {
                        c4197xw.a((View) arrayList.get(i9), (Mu) mt.f26393u, k9, false);
                        i9++;
                        arrayList = arrayList;
                    }
                    AbstractC3981tw.d(k9);
                    c2593Hm3.getClass();
                    hashSet = hashSet6;
                    Aw aw2 = new Aw(c2593Hm3, hashSet, k9, nanoTime, 1);
                    C4017ue c4017ue2 = (C4017ue) c2593Hm3.f25416u;
                    aw2.f35425a = c4017ue2;
                    ArrayDeque arrayDeque2 = (ArrayDeque) c4017ue2.f34631v;
                    arrayDeque2.add(aw2);
                    if (((AbstractAsyncTaskC4251yw) c4017ue2.f34632w) == null) {
                        AbstractAsyncTaskC4251yw abstractAsyncTaskC4251yw2 = (AbstractAsyncTaskC4251yw) arrayDeque2.poll();
                        c4017ue2.f34632w = abstractAsyncTaskC4251yw2;
                        if (abstractAsyncTaskC4251yw2 != null) {
                            abstractAsyncTaskC4251yw2.executeOnExecutor((ThreadPoolExecutor) c4017ue2.f34630u, new Object[0]);
                        }
                    }
                } else {
                    hashSet = hashSet6;
                    c2593Hm3.getClass();
                    AsyncTaskC4305zw asyncTaskC4305zw = new AsyncTaskC4305zw(c2593Hm3);
                    C4017ue c4017ue3 = (C4017ue) c2593Hm3.f25416u;
                    asyncTaskC4305zw.f35425a = c4017ue3;
                    ArrayDeque arrayDeque3 = (ArrayDeque) c4017ue3.f34631v;
                    arrayDeque3.add(asyncTaskC4305zw);
                    if (((AbstractAsyncTaskC4251yw) c4017ue3.f34632w) == null) {
                        AbstractAsyncTaskC4251yw abstractAsyncTaskC4251yw3 = (AbstractAsyncTaskC4251yw) arrayDeque3.poll();
                        c4017ue3.f34632w = abstractAsyncTaskC4251yw3;
                        if (abstractAsyncTaskC4251yw3 != null) {
                            abstractAsyncTaskC4251yw3.executeOnExecutor((ThreadPoolExecutor) c4017ue3.f34630u, new Object[0]);
                        }
                    }
                }
                hashMap5.clear();
                hashMap4.clear();
                hashMap6.clear();
                hashSet4.clear();
                hashSet.clear();
                hashSet3.clear();
                hashMap3.clear();
                c2631Jq.f25822n = false;
                hashSet9.clear();
                long nanoTime2 = System.nanoTime() - c4197xw.f35282f;
                ArrayList arrayList2 = c4197xw.f35277a;
                if (arrayList2.size() > 0) {
                    Iterator it9 = arrayList2.iterator();
                    if (it9.hasNext()) {
                        if (it9.next() != null) {
                            throw new ClassCastException();
                        }
                        TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                        throw null;
                    }
                }
                C3658nw c3658nw = C3658nw.f33065d;
                Context context2 = (Context) c3658nw.f33066a.get();
                if (context2 == null || (keyguardManager = (KeyguardManager) context2.getSystemService("keyguard")) == null) {
                    return;
                }
                boolean isDeviceLocked = keyguardManager.isDeviceLocked();
                c3658nw.a(c3658nw.f33067b, isDeviceLocked);
                c3658nw.f33068c = isDeviceLocked;
                return;
            case 8:
                Handler handler = C4197xw.i;
                if (handler != null) {
                    handler.post(C4197xw.f35275j);
                    C4197xw.i.postDelayed(C4197xw.f35276k, 200L);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void b() {
    }

    private final /* synthetic */ void c() {
    }

    private final /* synthetic */ void d() {
    }

    private final void e() {
    }
}
