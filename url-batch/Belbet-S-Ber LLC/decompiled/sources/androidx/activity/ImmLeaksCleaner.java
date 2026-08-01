package androidx.activity;

import a.a0;
import androidx.lifecycle.l;
import androidx.lifecycle.p;
import androidx.lifecycle.r;
import w2.c;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class ImmLeaksCleaner implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f250a = 0;

    static {
        new c(new a0(0));
    }

    @Override // androidx.lifecycle.p
    public final void a(r rVar, l lVar) {
        if (lVar == l.ON_DESTROY) {
            throw null;
        }
    }
}
