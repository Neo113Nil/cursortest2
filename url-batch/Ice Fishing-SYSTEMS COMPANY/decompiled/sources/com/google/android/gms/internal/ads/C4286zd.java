package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.zd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4286zd implements w2.o {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f35556a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f35557b;

    /* renamed from: c, reason: collision with root package name */
    public final int f35558c;

    /* renamed from: d, reason: collision with root package name */
    public final C3261gb f35559d;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f35561f;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f35560e = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f35562g = new HashMap();

    public C4286zd(HashSet hashSet, boolean z8, int i, C3261gb c3261gb, ArrayList arrayList, boolean z9) {
        this.f35556a = hashSet;
        this.f35557b = z8;
        this.f35558c = i;
        this.f35559d = c3261gb;
        this.f35561f = z9;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str.startsWith("custom:")) {
                    String[] split = str.split(":", 3);
                    if (split.length == 3) {
                        String str2 = split[2];
                        if ("true".equals(str2)) {
                            this.f35562g.put(split[1], Boolean.TRUE);
                        } else if ("false".equals(str2)) {
                            this.f35562g.put(split[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.f35560e.add(str);
                }
            }
        }
    }

    @Override // w2.InterfaceC5156d
    public final int a() {
        return this.f35558c;
    }

    @Override // w2.InterfaceC5156d
    public final boolean b() {
        return this.f35561f;
    }

    @Override // w2.InterfaceC5156d
    public final boolean c() {
        return this.f35557b;
    }

    @Override // w2.InterfaceC5156d
    public final Set d() {
        return this.f35556a;
    }
}
