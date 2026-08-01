package com.google.android.gms.internal.measurement;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class hg implements yd {

    /* renamed from: d, reason: collision with root package name */
    public static final kh f2382d = new kh(1);

    /* renamed from: e, reason: collision with root package name */
    public static final lh f2383e = new lh(1);

    public static mh b(Set set) {
        mh mhVar = new mh();
        mhVar.f2552d = f2383e;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            vg vgVar = (vg) it.next();
            g1.c(vgVar, "key");
            boolean z10 = vgVar.f2900c;
            HashMap hashMap = mhVar.f2550b;
            HashMap hashMap2 = mhVar.f2549a;
            if (!z10) {
                hashMap.remove(vgVar);
                hashMap2.put(vgVar, mh.f2547e);
            } else {
                if (!z10) {
                    te.a1.e("key must be repeating");
                    return null;
                }
                hashMap2.remove(vgVar);
                hashMap.put(vgVar, mh.f2548f);
            }
        }
        return mhVar;
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final InputStream d(xd xdVar) {
        he a9 = xdVar.f2985a.a(xdVar.f2988d);
        ArrayList arrayList = new ArrayList();
        arrayList.add(a9);
        ArrayList arrayList2 = xdVar.f2987c;
        if (!arrayList2.isEmpty()) {
            int i3 = vd.f2892e;
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                throw v4.a.i(it);
            }
            vd vdVar = !arrayList3.isEmpty() ? new vd(a9, arrayList3) : null;
            if (vdVar != null) {
                arrayList.add(vdVar);
            }
        }
        Iterator it2 = xdVar.f2986b.iterator();
        if (!it2.hasNext()) {
            Collections.reverse(arrayList);
            return (InputStream) arrayList.get(0);
        }
        if (it2.next() != null) {
            kotlin.collections.i0.j();
            return null;
        }
        throw null;
    }

    public static boolean e(byte b10) {
        return b10 > -65;
    }
}
