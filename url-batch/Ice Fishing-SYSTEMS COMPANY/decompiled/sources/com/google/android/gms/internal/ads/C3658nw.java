package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.nw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3658nw {

    /* renamed from: d, reason: collision with root package name */
    public static final C3658nw f33065d;

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f33066a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f33067b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f33068c;

    static {
        C3658nw c3658nw = new C3658nw();
        c3658nw.f33067b = false;
        c3658nw.f33068c = false;
        f33065d = c3658nw;
    }

    public final void a(boolean z8, boolean z9) {
        if ((z9 || z8) == (this.f33068c || this.f33067b)) {
            return;
        }
        Iterator it = Collections.unmodifiableCollection(C3282gw.f31116c.f31117a).iterator();
        while (it.hasNext()) {
            AbstractC3712ow abstractC3712ow = ((Wv) it.next()).f28529d;
            boolean z10 = z9 || z8;
            if (abstractC3712ow.f33235b.get() != 0) {
                T2.f27692z.C(abstractC3712ow.c(), "setDeviceLockState", true != z10 ? "unlocked" : "locked");
            }
        }
    }
}
