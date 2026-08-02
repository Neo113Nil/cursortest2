package c;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.B;
import androidx.lifecycle.EnumC0165g;
import androidx.lifecycle.F;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: c.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0199d implements androidx.lifecycle.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2563a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2564b;

    public /* synthetic */ C0199d(int i3, Object obj) {
        this.f2563a = i3;
        this.f2564b = obj;
    }

    @Override // androidx.lifecycle.l
    public final void a(androidx.lifecycle.m mVar, EnumC0165g enumC0165g) {
        Window window;
        View peekDecorView;
        switch (this.f2563a) {
            case 0:
                m this$0 = (m) this.f2564b;
                kotlin.jvm.internal.j.e(this$0, "this$0");
                if (enumC0165g != EnumC0165g.ON_STOP || (window = this$0.getWindow()) == null || (peekDecorView = window.peekDecorView()) == null) {
                    return;
                }
                peekDecorView.cancelPendingInputEvents();
                return;
            case 1:
                m this$02 = (m) this.f2564b;
                kotlin.jvm.internal.j.e(this$02, "this$0");
                if (enumC0165g == EnumC0165g.ON_DESTROY) {
                    this$02.f2584b.f4907b = null;
                    if (!this$02.isChangingConfigurations()) {
                        F d3 = this$02.d();
                        for (B b3 : d3.f2375a.values()) {
                            b3.getClass();
                            HashMap hashMap = b3.f2370a;
                            if (hashMap != null) {
                                synchronized (hashMap) {
                                    try {
                                        Iterator it = b3.f2370a.values().iterator();
                                        while (it.hasNext()) {
                                            B.a(it.next());
                                        }
                                    } finally {
                                    }
                                }
                            }
                            LinkedHashSet linkedHashSet = b3.f2371b;
                            if (linkedHashSet != null) {
                                synchronized (linkedHashSet) {
                                    try {
                                        Iterator it2 = b3.f2371b.iterator();
                                        while (it2.hasNext()) {
                                            B.a((Closeable) it2.next());
                                        }
                                    } finally {
                                    }
                                }
                                b3.f2371b.clear();
                            }
                            b3.b();
                        }
                        d3.f2375a.clear();
                    }
                    j jVar = this$02.f;
                    m mVar2 = jVar.f2574d;
                    mVar2.getWindow().getDecorView().removeCallbacks(jVar);
                    mVar2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(jVar);
                    return;
                }
                return;
            default:
                O1.k this$03 = (O1.k) this.f2564b;
                kotlin.jvm.internal.j.e(this$03, "this$0");
                if (enumC0165g == EnumC0165g.ON_START) {
                    this$03.f1182c = true;
                    return;
                } else {
                    if (enumC0165g == EnumC0165g.ON_STOP) {
                        this$03.f1182c = false;
                        return;
                    }
                    return;
                }
        }
    }
}
