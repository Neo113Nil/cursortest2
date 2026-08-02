package com.startapp.sdk.internal;

import android.graphics.Bitmap;
import com.startapp.sdk.ads.list3d.List3DActivity;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class a9 {

    /* renamed from: a, reason: collision with root package name */
    public final ib f3551a;

    /* renamed from: b, reason: collision with root package name */
    public final ib f3552b;
    public List3DActivity f;

    /* renamed from: g, reason: collision with root package name */
    public int f3556g = 0;

    /* renamed from: d, reason: collision with root package name */
    public final Hashtable f3554d = new Hashtable();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f3555e = new HashSet();

    /* renamed from: h, reason: collision with root package name */
    public final ConcurrentLinkedQueue f3557h = new ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3553c = new HashMap();

    public a9(ib ibVar, ib ibVar2) {
        this.f3551a = ibVar;
        this.f3552b = ibVar2;
    }

    public final Bitmap a(String str, int i3, String str2) {
        Bitmap bitmap = (Bitmap) this.f3554d.get(str);
        if (bitmap != null) {
            return bitmap;
        }
        if (this.f3555e.contains(str)) {
            return null;
        }
        this.f3555e.add(str);
        int i4 = this.f3556g;
        if (i4 >= 15) {
            this.f3557h.add(new z8(this, i3, str, str2));
            return null;
        }
        this.f3556g = i4 + 1;
        ((Executor) this.f3551a.a()).execute(new z8(this, i3, str, str2));
        return null;
    }
}
