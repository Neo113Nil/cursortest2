package com.startapp.sdk.internal;

import android.graphics.Bitmap;
import com.startapp.sdk.ads.list3d.List3DActivity;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class l8 {

    /* renamed from: a, reason: collision with root package name */
    public final pa f317a;
    public final pa b;
    public List3DActivity f;
    public int g = 0;
    public final Hashtable d = new Hashtable();
    public final HashSet e = new HashSet();
    public final ConcurrentLinkedQueue h = new ConcurrentLinkedQueue();
    public final HashMap c = new HashMap();

    public l8(pa paVar, pa paVar2) {
        this.f317a = paVar;
        this.b = paVar2;
    }

    public final Bitmap a(String str, int i, String str2) {
        Bitmap bitmap = (Bitmap) this.d.get(str);
        if (bitmap != null) {
            return bitmap;
        }
        if (this.e.contains(str)) {
            return null;
        }
        this.e.add(str);
        int i2 = this.g;
        if (i2 >= 15) {
            this.h.add(new k8(this, i, str, str2));
            return null;
        }
        this.g = i2 + 1;
        ((Executor) this.f317a.a()).execute(new k8(this, i, str, str2));
        return null;
    }
}
