package androidx.activity;

import a.a0;
import androidx.lifecycle.l;
import androidx.lifecycle.p;
import androidx.lifecycle.r;
import z2.b;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class ImmLeaksCleaner implements p {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f117f = 0;

    static {
        new b(new a0(0));
    }

    @Override // androidx.lifecycle.p
    public final void b(r rVar, l lVar) {
        if (lVar == l.ON_DESTROY) {
            throw null;
        }
    }
}
