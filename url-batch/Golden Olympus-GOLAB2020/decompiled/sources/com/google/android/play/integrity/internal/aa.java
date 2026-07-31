package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class aa extends t {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ IBinder f13611a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ad f13612b;

    aa(ad adVar, IBinder iBinder) {
        this.f13612b = adVar;
        this.f13611a = iBinder;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        z zVar;
        List list;
        List list2;
        zVar = this.f13612b.f13614a.f13624j;
        this.f13612b.f13614a.f13629o = (IInterface) zVar.a(this.f13611a);
        ae.r(this.f13612b.f13614a);
        this.f13612b.f13614a.f13622h = false;
        list = this.f13612b.f13614a.f13619e;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        list2 = this.f13612b.f13614a.f13619e;
        list2.clear();
    }
}
