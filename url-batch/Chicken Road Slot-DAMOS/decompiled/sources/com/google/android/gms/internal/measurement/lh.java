package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class lh {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2507a;

    public /* synthetic */ lh(int i3) {
        this.f2507a = i3;
    }

    public final void a(vg vgVar, Iterator it, hh hhVar) {
        switch (this.f2507a) {
            case 0:
                break;
            default:
                if (!vgVar.f2900c) {
                    kotlin.collections.i0.l("non repeating key");
                    break;
                } else if (vgVar.f2901d && ((h0) h0.f2353e.get()).f2354d > 20) {
                    while (it.hasNext()) {
                        hhVar.a(it.next(), vgVar.f2898a);
                    }
                    break;
                } else {
                    vgVar.a(it, hhVar);
                    break;
                }
                break;
        }
    }

    private final void b(vg vgVar, Iterator it, hh hhVar) {
    }
}
