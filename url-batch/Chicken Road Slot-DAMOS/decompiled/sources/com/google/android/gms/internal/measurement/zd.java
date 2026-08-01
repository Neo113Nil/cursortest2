package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class zd {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3046a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3047b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3048c;

    public zd(ArrayList arrayList) {
        List list = Collections.EMPTY_LIST;
        this.f3046a = new HashMap();
        this.f3047b = new HashMap();
        this.f3048c = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            oe oeVar = (oe) it.next();
            if (TextUtils.isEmpty(oeVar.f())) {
                Log.w("MobStore.FileStorage", "Cannot register backend, name empty");
            } else {
                oe oeVar2 = (oe) this.f3046a.put(oeVar.f(), oeVar);
                if (oeVar2 != null) {
                    String canonicalName = oeVar2.getClass().getCanonicalName();
                    String canonicalName2 = oeVar.getClass().getCanonicalName();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 30 + String.valueOf(canonicalName2).length());
                    sb2.append("Cannot override Backend ");
                    sb2.append(canonicalName);
                    sb2.append(" with ");
                    sb2.append(canonicalName2);
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
        }
        Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            throw v4.a.i(it2);
        }
        this.f3048c.addAll(list);
    }

    public final Object a(Uri uri, yd ydVar) {
        return ydVar.a(b(uri));
    }

    public final xd b(Uri uri) {
        List list;
        b8.d dVar = b8.g.f1423e;
        c6.f.n(4, "initialCapacity");
        Object[] objArr = new Object[4];
        c6.f.n(4, "initialCapacity");
        Object[] objArr2 = new Object[4];
        String encodedFragment = uri.getEncodedFragment();
        int i3 = 1;
        if (TextUtils.isEmpty(encodedFragment) || !encodedFragment.startsWith("transform=")) {
            list = b8.s.f1440s;
        } else {
            String substring = encodedFragment.substring(10);
            d9.c cVar = new d9.c(i3, new a8.b("+".charAt(0)));
            a8.l lVar = new a8.l();
            lVar.f359d = cVar;
            lVar.f356a = true;
            lVar.f358c = a8.c.f341r;
            lVar.f357b = Integer.MAX_VALUE;
            list = b8.g.m(new a8.k(lVar, substring));
        }
        int size = list.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            String str = (String) list.get(i10);
            Matcher matcher = le.f2506a.matcher(str);
            if (!matcher.matches()) {
                te.a1.e("Invalid fragment spec: ".concat(String.valueOf(str)));
                return null;
            }
            String group = matcher.group(1);
            group.getClass();
            int i12 = i11 + 1;
            if (objArr2.length < i12) {
                objArr2 = Arrays.copyOf(objArr2, b8.a.b(objArr2.length, i12));
            }
            objArr2[i11] = group;
            i10++;
            i11++;
        }
        b8.s k10 = b8.g.k(i11, objArr2);
        if (k10.f1442r > 0) {
            String str2 = (String) k10.get(0);
            if (this.f3047b.get(str2) != null) {
                kotlin.collections.i0.j();
                return null;
            }
            String valueOf = String.valueOf(uri);
            StringBuilder sb2 = new StringBuilder(str2.length() + 40 + valueOf.length());
            sb2.append("Requested transform isn't registered: ");
            sb2.append(str2);
            sb2.append(": ");
            sb2.append(valueOf);
            throw new androidx.datastore.preferences.protobuf.k(sb2.toString());
        }
        b8.g p4 = b8.g.k(0, objArr).p();
        xd xdVar = new xd();
        String scheme = uri.getScheme();
        oe oeVar = (oe) this.f3046a.get(scheme);
        if (oeVar == null) {
            throw new androidx.datastore.preferences.protobuf.k(v4.a.k("Requested backend isn't registered: ", scheme));
        }
        xdVar.f2985a = oeVar;
        xdVar.f2987c = this.f3048c;
        xdVar.f2986b = p4;
        if (!p4.isEmpty()) {
            ArrayList arrayList = new ArrayList(uri.getPathSegments());
            if (!arrayList.isEmpty() && !uri.getPath().endsWith("/")) {
                String str3 = (String) arrayList.get(arrayList.size() - 1);
                ListIterator listIterator = p4.listIterator(p4.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous() != null) {
                        kotlin.collections.i0.j();
                        return null;
                    }
                }
                arrayList.set(arrayList.size() - 1, str3);
                uri = uri.buildUpon().path(TextUtils.join("/", arrayList)).encodedFragment(null).build();
            }
        }
        xdVar.f2988d = uri;
        xd xdVar2 = new xd();
        xdVar2.f2985a = xdVar.f2985a;
        xdVar2.f2986b = xdVar.f2986b;
        xdVar2.f2987c = xdVar.f2987c;
        xdVar2.f2988d = xdVar.f2988d;
        return xdVar2;
    }
}
