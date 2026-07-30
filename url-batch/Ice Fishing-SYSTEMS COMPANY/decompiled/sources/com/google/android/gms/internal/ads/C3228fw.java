package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.fw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3228fw extends C3388iw {

    /* renamed from: w, reason: collision with root package name */
    public static final C3228fw f30921w = new C3228fw();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.C3388iw
    public final boolean a() {
        Iterator it = Collections.unmodifiableCollection(C3282gw.f31116c.f31118b).iterator();
        while (it.hasNext()) {
            View view = (View) ((Wv) it.next()).f28528c.get();
            if (view != null && view.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.C3388iw
    public final void b(boolean z8) {
        Iterator it = Collections.unmodifiableCollection(C3282gw.f31116c.f31117a).iterator();
        while (it.hasNext()) {
            AbstractC3712ow abstractC3712ow = ((Wv) it.next()).f28529d;
            if (abstractC3712ow.f33235b.get() != 0) {
                T2.f27692z.C(abstractC3712ow.c(), "setState", true != z8 ? "backgrounded" : "foregrounded", abstractC3712ow.f33234a);
            }
        }
    }
}
