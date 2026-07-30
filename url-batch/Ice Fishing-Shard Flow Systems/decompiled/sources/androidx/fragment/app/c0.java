package androidx.fragment.app;

import android.view.ViewGroup;
import d.C0351b;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3717a;

    public abstract void a(ViewGroup viewGroup);

    public void b(C0351b backEvent, ViewGroup container) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        Intrinsics.checkNotNullParameter(container, "container");
    }

    public void c(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
    }
}
