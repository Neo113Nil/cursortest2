package ru.rustore.sdk.pay.internal;

import androidx.fragment.app.FragmentManager;
import java.lang.ref.WeakReference;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.R;

/* loaded from: classes3.dex */
public final class qi implements FragmentManager.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FragmentManager f44849a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WeakReference<li> f44850b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hf f44851c;

    public qi(FragmentManager fragmentManager, WeakReference<li> weakReference, hf hfVar) {
        this.f44849a = fragmentManager;
        this.f44850b = weakReference;
        this.f44851c = hfVar;
    }

    @Override // androidx.fragment.app.FragmentManager.k
    public final void onBackStackChanged() {
        this.f44849a.d1(this);
        if (this.f44850b.get() != null) {
            hf result = this.f44851c;
            FragmentManager fragmentManager = this.f44849a;
            int i4 = lf.f44544r;
            Intrinsics.checkNotNullParameter(result, "result");
            lf lfVar = new lf();
            lfVar.setArguments(androidx.core.os.d.a(TuplesKt.to("purchaseResult", result)));
            androidx.fragment.app.z o4 = fragmentManager.o();
            o4.o(R.id.pay_container, lfVar, lf.class.getSimpleName());
            o4.h();
        }
    }
}
