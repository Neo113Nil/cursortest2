package D3;

import D.RunnableC0281a;
import F3.C;
import O.X;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f695a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f696b;

    /* renamed from: c, reason: collision with root package name */
    public int f697c;

    /* renamed from: d, reason: collision with root package name */
    public Object f698d;

    /* renamed from: e, reason: collision with root package name */
    public Object f699e;

    public /* synthetic */ f() {
        this.f695a = 1;
    }

    public void a(int i) {
        switch (this.f695a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f699e;
                WeakReference weakReference = sideSheetBehavior.f36217p;
                if (weakReference != null && weakReference.get() != null) {
                    this.f697c = i;
                    if (!this.f696b) {
                        View view = (View) sideSheetBehavior.f36217p.get();
                        RunnableC0281a runnableC0281a = (RunnableC0281a) this.f698d;
                        WeakHashMap weakHashMap = X.f2240a;
                        view.postOnAnimation(runnableC0281a);
                        this.f696b = true;
                        break;
                    }
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f699e;
                WeakReference weakReference2 = bottomSheetBehavior.f36012U;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f697c = i;
                    if (!this.f696b) {
                        View view2 = (View) bottomSheetBehavior.f36012U.get();
                        C c4 = (C) this.f698d;
                        WeakHashMap weakHashMap2 = X.f2240a;
                        view2.postOnAnimation(c4);
                        this.f696b = true;
                        break;
                    }
                }
                break;
        }
    }

    public f(f fVar, L2.d[] dVarArr, boolean z8, int i) {
        this.f695a = 2;
        this.f699e = fVar;
        this.f698d = dVarArr;
        boolean z9 = false;
        if (dVarArr != null && z8) {
            z9 = true;
        }
        this.f696b = z9;
        this.f697c = i;
    }

    public f(SideSheetBehavior sideSheetBehavior) {
        this.f695a = 0;
        this.f699e = sideSheetBehavior;
        this.f698d = new RunnableC0281a(1, this);
    }

    public f(BottomSheetBehavior bottomSheetBehavior) {
        this.f695a = 3;
        this.f699e = bottomSheetBehavior;
        this.f698d = new C(27, this);
    }
}
