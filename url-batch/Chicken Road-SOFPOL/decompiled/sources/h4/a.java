package h4;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3163a;

    /* renamed from: b, reason: collision with root package name */
    public int f3164b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3165c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3166d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3167e;

    public a(j jVar) {
        this.f3163a = 0;
        jVar.getClass();
        this.f3166d = new ArrayList();
        this.f3164b = -1;
        this.f3167e = jVar;
    }

    public void a(int i) {
        switch (this.f3163a) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f3167e;
                WeakReference weakReference = bottomSheetBehavior.W;
                if (weakReference != null && weakReference.get() != null) {
                    this.f3164b = i;
                    if (!this.f3165c) {
                        ((View) bottomSheetBehavior.W.get()).postOnAnimation((b) this.f3166d);
                        this.f3165c = true;
                        break;
                    }
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f3167e;
                WeakReference weakReference2 = sideSheetBehavior.f1950p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f3164b = i;
                    if (!this.f3165c) {
                        ((View) sideSheetBehavior.f1950p.get()).postOnAnimation((a1.a) this.f3166d);
                        this.f3165c = true;
                        break;
                    }
                }
                break;
        }
    }

    public String toString() {
        switch (this.f3163a) {
            case 0:
                StringBuilder sb = new StringBuilder(128);
                sb.append("BackStackEntry{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                if (this.f3164b >= 0) {
                    sb.append(" #");
                    sb.append(this.f3164b);
                }
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public a(SideSheetBehavior sideSheetBehavior) {
        this.f3163a = 2;
        this.f3167e = sideSheetBehavior;
        this.f3166d = new a1.a(13, this);
    }

    public a(BottomSheetBehavior bottomSheetBehavior) {
        this.f3163a = 1;
        this.f3167e = bottomSheetBehavior;
        this.f3166d = new b(2, this);
    }
}
