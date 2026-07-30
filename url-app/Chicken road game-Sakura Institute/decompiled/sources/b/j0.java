package b;

import android.util.Log;
import android.webkit.WebView;
import androidx.lifecycle.q0;
import com.android.installreferrer.api.InstallReferrerClient;
import com.chicken.road.whale.plate.PlatePageActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j0 extends y {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1169d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1170e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(int i7, Object obj) {
        super(true);
        this.f1169d = i7;
        this.f1170e = obj;
    }

    @Override // b.y
    public void a() {
        switch (this.f1169d) {
            case 2:
                n3.k kVar = (n3.k) this.f1170e;
                if (n3.k.m(3)) {
                    Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + kVar);
                }
                if (n3.k.m(3)) {
                    Log.d("FragmentManager", "cancelBackStackTransition for transition " + ((n3.a) kVar.f6541g));
                }
                n3.a aVar = (n3.a) kVar.f6541g;
                if (aVar != null) {
                    aVar.f6507d = false;
                    ArrayList arrayList = aVar.f6504a;
                    int size = arrayList.size() - 1;
                    while (size >= 0) {
                        n3.m mVar = (n3.m) arrayList.get(size);
                        if (mVar.f6546c) {
                            if (mVar.f6544a == 8) {
                                mVar.f6546c = false;
                                arrayList.remove(size - 1);
                                size--;
                            } else {
                                mVar.f6545b.getClass();
                                mVar.f6544a = 2;
                                mVar.f6546c = false;
                                for (int i7 = size - 1; i7 >= 0; i7--) {
                                    n3.m mVar2 = (n3.m) arrayList.get(i7);
                                    if (mVar2.f6546c) {
                                        mVar2.f6545b.getClass();
                                        arrayList.remove(i7);
                                        size--;
                                    }
                                }
                            }
                        }
                        size--;
                    }
                    n3.a aVar2 = (n3.a) kVar.f6541g;
                    androidx.lifecycle.c0 c0Var = new androidx.lifecycle.c0(9, kVar);
                    if (aVar2.f6505b == null) {
                        aVar2.f6505b = new ArrayList();
                    }
                    aVar2.f6505b.add(c0Var);
                    ((n3.a) kVar.f6541g).a(false);
                    kVar.l();
                    throw null;
                }
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [q6.a, r6.h] */
    @Override // b.y
    public final void b() {
        switch (this.f1169d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((p2.a) this.f1170e).f(this);
                return;
            case 1:
                PlatePageActivity platePageActivity = (PlatePageActivity) this.f1170e;
                h6.d dVar = null;
                if (platePageActivity.D) {
                    c7.a0.p(q0.h(platePageActivity), null, null, new f4.c(platePageActivity, dVar, 1), 3);
                    return;
                }
                WebView webView = platePageActivity.B;
                if (webView == null) {
                    r6.k.j("web");
                    throw null;
                }
                if (webView.canGoBack()) {
                    WebView webView2 = platePageActivity.B;
                    if (webView2 != null) {
                        webView2.goBack();
                        return;
                    } else {
                        r6.k.j("web");
                        throw null;
                    }
                }
                this.f1220a = false;
                ?? r12 = this.f1222c;
                if (r12 != 0) {
                    r12.a();
                }
                platePageActivity.finish();
                return;
            case 2:
                n3.k kVar = (n3.k) this.f1170e;
                if (n3.k.m(3)) {
                    Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + kVar);
                }
                kVar.l();
                throw null;
            default:
                t3.b0 b0Var = (t3.b0) this.f1170e;
                e6.j jVar = b0Var.f8751g;
                if (jVar.isEmpty()) {
                    return;
                }
                t3.h hVar = (t3.h) jVar.y();
                t3.v vVar = hVar != null ? hVar.f8792g : null;
                r6.k.c(vVar);
                if (b0Var.k(vVar.f8862k, true, false)) {
                    b0Var.b();
                    return;
                }
                return;
        }
    }

    @Override // b.y
    public void c(b bVar) {
        switch (this.f1169d) {
            case 2:
                n3.k kVar = (n3.k) this.f1170e;
                if (n3.k.m(2)) {
                    Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + kVar);
                }
                if (((n3.a) kVar.f6541g) != null) {
                    ArrayList arrayList = new ArrayList(Collections.singletonList((n3.a) kVar.f6541g));
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList2 = ((n3.a) arrayList.get(0)).f6504a;
                    int size = arrayList2.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList2.get(i7);
                        i7++;
                        n3.g gVar = ((n3.m) obj).f6545b;
                    }
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        n3.b bVar2 = (n3.b) it.next();
                        bVar2.getClass();
                        r6.k.f(bVar, "backEvent");
                        if (n3.k.m(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + bVar.f1136c);
                        }
                        ArrayList arrayList3 = bVar2.f6511c;
                        ArrayList arrayList4 = new ArrayList();
                        int size2 = arrayList3.size();
                        int i8 = 0;
                        while (i8 < size2) {
                            Object obj2 = arrayList3.get(i8);
                            i8++;
                            ((n3.p) obj2).getClass();
                            e6.r.c0(null, arrayList4);
                        }
                        List w02 = e6.l.w0(e6.l.z0(arrayList4));
                        int size3 = w02.size();
                        for (int i9 = 0; i9 < size3; i9++) {
                            ((n3.o) w02.get(i9)).a(bVar, bVar2.f6509a);
                        }
                    }
                    Iterator it2 = ((ArrayList) kVar.f6539e).iterator();
                    if (it2.hasNext()) {
                        it2.next().getClass();
                        throw new ClassCastException();
                    }
                    return;
                }
                return;
            default:
                super.c(bVar);
                return;
        }
    }

    @Override // b.y
    public void d(b bVar) {
        switch (this.f1169d) {
            case 2:
                n3.k kVar = (n3.k) this.f1170e;
                if (n3.k.m(3)) {
                    Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + kVar);
                }
                kVar.getClass();
                HashSet hashSet = new HashSet();
                androidx.room.c cVar = (androidx.room.c) kVar.f6540f;
                cVar.getClass();
                ArrayList arrayList = new ArrayList();
                for (n3.l lVar : ((HashMap) cVar.f1070h).values()) {
                }
                if (arrayList.size() > 0) {
                    ((n3.l) arrayList.get(0)).getClass();
                    throw null;
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    n3.b bVar2 = (n3.b) it.next();
                    bVar2.getClass();
                    if (n3.k.m(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
                    }
                    boolean isAttachedToWindow = bVar2.f6509a.isAttachedToWindow();
                    synchronized (bVar2.f6510b) {
                        try {
                            ArrayList arrayList2 = bVar2.f6510b;
                            int size = arrayList2.size();
                            int i7 = 0;
                            while (i7 < size) {
                                Object obj = arrayList2.get(i7);
                                i7++;
                                ((n3.p) obj).getClass();
                            }
                            bVar2.a(bVar2.f6510b);
                            ArrayList x02 = e6.l.x0(bVar2.f6511c);
                            int size2 = x02.size();
                            int i8 = 0;
                            int i9 = 0;
                            while (i9 < size2) {
                                Object obj2 = x02.get(i9);
                                i9++;
                                ((n3.p) obj2).getClass();
                            }
                            int size3 = x02.size();
                            int i10 = 0;
                            while (i10 < size3) {
                                Object obj3 = x02.get(i10);
                                i10++;
                                n3.p pVar = (n3.p) obj3;
                                if (n3.k.m(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: " + (isAttachedToWindow ? "" : "Container " + bVar2.f6509a + " is not attached to window. ") + "Cancelling running operation " + pVar);
                                }
                                pVar.a(bVar2.f6509a);
                            }
                            ArrayList x03 = e6.l.x0(bVar2.f6510b);
                            int size4 = x03.size();
                            int i11 = 0;
                            while (i11 < size4) {
                                Object obj4 = x03.get(i11);
                                i11++;
                                ((n3.p) obj4).getClass();
                            }
                            int size5 = x03.size();
                            while (i8 < size5) {
                                Object obj5 = x03.get(i8);
                                i8++;
                                n3.p pVar2 = (n3.p) obj5;
                                if (n3.k.m(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: " + (isAttachedToWindow ? "" : "Container " + bVar2.f6509a + " is not attached to window. ") + "Cancelling pending operation " + pVar2);
                                }
                                pVar2.a(bVar2.f6509a);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            default:
                super.d(bVar);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(int i7, Object obj, boolean z8) {
        super(false);
        this.f1169d = i7;
        this.f1170e = obj;
    }
}
