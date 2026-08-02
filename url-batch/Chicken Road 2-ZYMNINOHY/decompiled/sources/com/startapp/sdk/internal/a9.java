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
    public final ib f6652a;

    /* renamed from: b, reason: collision with root package name */
    public final ib f6653b;

    /* renamed from: f, reason: collision with root package name */
    public List3DActivity f6657f;

    /* renamed from: g, reason: collision with root package name */
    public int f6658g = 0;

    /* renamed from: d, reason: collision with root package name */
    public final Hashtable f6655d = new Hashtable();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f6656e = new HashSet();

    /* renamed from: h, reason: collision with root package name */
    public final ConcurrentLinkedQueue f6659h = new ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f6654c = new HashMap();

    public a9(ib ibVar, ib ibVar2) {
        this.f6652a = ibVar;
        this.f6653b = ibVar2;
    }

    public final Bitmap a(String str, int i4, String str2) {
        Bitmap bitmap = (Bitmap) this.f6655d.get(str);
        if (bitmap != null) {
            return bitmap;
        }
        if (this.f6656e.contains(str)) {
            return null;
        }
        this.f6656e.add(str);
        int i5 = this.f6658g;
        if (i5 >= 15) {
            this.f6659h.add(new z8(this, i4, str, str2));
            return null;
        }
        this.f6658g = i5 + 1;
        ((Executor) this.f6652a.a()).execute(new z8(this, i4, str, str2));
        return null;
    }
}
