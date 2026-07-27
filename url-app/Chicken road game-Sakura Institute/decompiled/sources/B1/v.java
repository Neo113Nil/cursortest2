package B1;

import P0.C0260b;
import android.util.Log;
import android.webkit.WebView;
import b.C0487b;
import com.chicken.road.kedro.laqer.village.VillagePageActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m1.C0856a;
import m1.C0857b;
import s1.C1183B;
import z2.C1400D;
import z2.C1403G;

/* loaded from: classes.dex */
public final class v extends b.v {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1026e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i2, Object obj) {
        super(false);
        this.f1025d = i2;
        this.f1026e = obj;
    }

    @Override // b.v
    public void a() {
        switch (this.f1025d) {
            case 2:
                boolean isLoggable = Log.isLoggable("FragmentManager", 3);
                m1.k kVar = (m1.k) this.f1026e;
                if (isLoggable) {
                    Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + kVar);
                }
                kVar.getClass();
                if (Log.isLoggable("FragmentManager", 3)) {
                    Log.d("FragmentManager", "cancelBackStackTransition for transition " + ((C0856a) kVar.f8285g));
                }
                C0856a c0856a = (C0856a) kVar.f8285g;
                if (c0856a != null) {
                    c0856a.f8251d = false;
                    ArrayList arrayList = c0856a.f8248a;
                    int size = arrayList.size() - 1;
                    while (size >= 0) {
                        m1.m mVar = (m1.m) arrayList.get(size);
                        if (mVar.f8290c) {
                            if (mVar.f8288a == 8) {
                                mVar.f8290c = false;
                                arrayList.remove(size - 1);
                                size--;
                            } else {
                                mVar.f8289b.getClass();
                                mVar.f8288a = 2;
                                mVar.f8290c = false;
                                for (int i2 = size - 1; i2 >= 0; i2--) {
                                    m1.m mVar2 = (m1.m) arrayList.get(i2);
                                    if (mVar2.f8290c) {
                                        mVar2.f8289b.getClass();
                                        arrayList.remove(i2);
                                        size--;
                                    }
                                }
                            }
                        }
                        size--;
                    }
                    C0856a c0856a2 = (C0856a) kVar.f8285g;
                    C.t tVar = new C.t(11, kVar);
                    if (c0856a2.f8249b == null) {
                        c0856a2.f8249b = new ArrayList();
                    }
                    c0856a2.f8249b.add(tVar);
                    ((C0856a) kVar.f8285g).a(false);
                    kVar.m();
                    throw null;
                }
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [M2.m, kotlin.jvm.functions.Function0] */
    @Override // b.v
    public final void b() {
        switch (this.f1025d) {
            case 0:
                VillagePageActivity villagePageActivity = (VillagePageActivity) this.f1026e;
                if (villagePageActivity.f6012E) {
                    villagePageActivity.l();
                    return;
                }
                WebView webView = villagePageActivity.f6010C;
                if (webView == null) {
                    Intrinsics.g("web");
                    throw null;
                }
                if (webView.canGoBack()) {
                    WebView webView2 = villagePageActivity.f6010C;
                    if (webView2 != null) {
                        webView2.goBack();
                        return;
                    } else {
                        Intrinsics.g("web");
                        throw null;
                    }
                }
                this.f5586a = false;
                ?? r12 = this.f5588c;
                if (r12 != 0) {
                    r12.invoke();
                }
                villagePageActivity.finish();
                return;
            case 1:
                ((C0260b) this.f1026e).invoke(this);
                return;
            case 2:
                boolean isLoggable = Log.isLoggable("FragmentManager", 3);
                m1.k kVar = (m1.k) this.f1026e;
                if (isLoggable) {
                    Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + kVar);
                }
                kVar.getClass();
                kVar.m();
                throw null;
            default:
                ((C1183B) this.f1026e).m();
                return;
        }
    }

    @Override // b.v
    public void c(C0487b backEvent) {
        switch (this.f1025d) {
            case 2:
                boolean isLoggable = Log.isLoggable("FragmentManager", 2);
                m1.k kVar = (m1.k) this.f1026e;
                if (isLoggable) {
                    Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + kVar);
                }
                if (((C0856a) kVar.f8285g) != null) {
                    ArrayList arrayList = new ArrayList(Collections.singletonList((C0856a) kVar.f8285g));
                    HashSet hashSet = new HashSet();
                    Iterator it = ((C0856a) arrayList.get(0)).f8248a.iterator();
                    while (it.hasNext()) {
                        m1.g gVar = ((m1.m) it.next()).f8289b;
                    }
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        C0857b c0857b = (C0857b) it2.next();
                        c0857b.getClass();
                        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + backEvent.f5531c);
                        }
                        ArrayList arrayList2 = c0857b.f8255c;
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            ((m1.p) it3.next()).getClass();
                            C1400D.j(null, arrayList3);
                        }
                        List H3 = C1403G.H(C1403G.K(arrayList3));
                        int size = H3.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            ((m1.o) H3.get(i2)).a(backEvent, c0857b.f8253a);
                        }
                    }
                    Iterator it4 = ((ArrayList) kVar.f8283e).iterator();
                    if (it4.hasNext()) {
                        it4.next().getClass();
                        throw new ClassCastException();
                    }
                    return;
                }
                return;
            default:
                super.c(backEvent);
                return;
        }
    }

    @Override // b.v
    public void d(C0487b c0487b) {
        switch (this.f1025d) {
            case 2:
                boolean isLoggable = Log.isLoggable("FragmentManager", 3);
                m1.k kVar = (m1.k) this.f1026e;
                if (isLoggable) {
                    Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + kVar);
                }
                kVar.getClass();
                HashSet hashSet = new HashSet();
                l2.g gVar = (l2.g) kVar.f8284f;
                gVar.getClass();
                ArrayList arrayList = new ArrayList();
                for (m1.l lVar : ((HashMap) gVar.f7977c).values()) {
                }
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    ((m1.l) it.next()).getClass();
                    throw null;
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    C0857b c0857b = (C0857b) it2.next();
                    c0857b.getClass();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
                    }
                    boolean isAttachedToWindow = c0857b.f8253a.isAttachedToWindow();
                    synchronized (c0857b.f8254b) {
                        try {
                            Iterator it3 = c0857b.f8254b.iterator();
                            while (it3.hasNext()) {
                                ((m1.p) it3.next()).getClass();
                            }
                            c0857b.a(c0857b.f8254b);
                            ArrayList I3 = C1403G.I(c0857b.f8255c);
                            Iterator it4 = I3.iterator();
                            while (it4.hasNext()) {
                                ((m1.p) it4.next()).getClass();
                            }
                            Iterator it5 = I3.iterator();
                            while (it5.hasNext()) {
                                m1.p pVar = (m1.p) it5.next();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: " + (isAttachedToWindow ? "" : "Container " + c0857b.f8253a + " is not attached to window. ") + "Cancelling running operation " + pVar);
                                }
                                pVar.a(c0857b.f8253a);
                            }
                            ArrayList I4 = C1403G.I(c0857b.f8254b);
                            Iterator it6 = I4.iterator();
                            while (it6.hasNext()) {
                                ((m1.p) it6.next()).getClass();
                            }
                            Iterator it7 = I4.iterator();
                            while (it7.hasNext()) {
                                m1.p pVar2 = (m1.p) it7.next();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: " + (isAttachedToWindow ? "" : "Container " + c0857b.f8253a + " is not attached to window. ") + "Cancelling pending operation " + pVar2);
                                }
                                pVar2.a(c0857b.f8253a);
                            }
                            Unit unit = Unit.f7487a;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            default:
                super.d(c0487b);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(VillagePageActivity villagePageActivity) {
        super(true);
        this.f1025d = 0;
        this.f1026e = villagePageActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(boolean z4, C0260b c0260b) {
        super(z4);
        this.f1025d = 1;
        this.f1026e = c0260b;
    }
}
