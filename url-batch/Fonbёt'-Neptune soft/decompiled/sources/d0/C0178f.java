package d0;

import G0.l;
import a0.C0134b;
import a0.C0135c;
import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: d0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0178f {

    /* renamed from: a, reason: collision with root package name */
    public final int f2044a;

    public C0178f() {
        A0.b.i("verificationMode", 3);
        this.f2044a = 3;
    }

    public static boolean a(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        if (Q0.h.a(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        return (sidecarDeviceState == null || sidecarDeviceState2 == null || AbstractC0173a.b(sidecarDeviceState) != AbstractC0173a.b(sidecarDeviceState2)) ? false : true;
    }

    public static boolean b(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (Q0.h.a(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return Q0.h.a(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public static boolean c(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!b((SidecarDisplayFeature) list.get(i2), (SidecarDisplayFeature) list2.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (Q0.h.a(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        return c(AbstractC0173a.c(sidecarWindowLayoutInfo), AbstractC0173a.c(sidecarWindowLayoutInfo2));
    }

    public final a0.k e(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        Q0.h.e(sidecarDeviceState, "state");
        if (sidecarWindowLayoutInfo == null) {
            return new a0.k(l.f490e);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        AbstractC0173a.d(sidecarDeviceState2, AbstractC0173a.b(sidecarDeviceState));
        return new a0.k(f(AbstractC0173a.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final ArrayList f(List list, SidecarDeviceState sidecarDeviceState) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0135c g2 = g((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (g2 != null) {
                arrayList.add(g2);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r6 == 4) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0135c g(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
        C0134b c0134b;
        C0134b c0134b2;
        Q0.h.e(sidecarDisplayFeature, "feature");
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) X.a.a(this.f2044a, sidecarDisplayFeature).d("Type must be either TYPE_FOLD or TYPE_HINGE", C0174b.f2040f).d("Feature bounds must not be 0", C0175c.f2041f).d("TYPE_FOLD must have 0 area", C0176d.f2042f).d("Feature be pinned to either left or top", C0177e.f2043f).a();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        int type = sidecarDisplayFeature2.getType();
        if (type == 1) {
            c0134b = C0134b.f1259k;
        } else {
            if (type != 2) {
                return null;
            }
            c0134b = C0134b.f1260l;
        }
        int b2 = AbstractC0173a.b(sidecarDeviceState);
        if (b2 != 0 && b2 != 1) {
            if (b2 != 2) {
                c0134b2 = C0134b.f1257i;
                if (b2 != 3) {
                }
            } else {
                c0134b2 = C0134b.f1258j;
            }
            Rect rect = sidecarDisplayFeature.getRect();
            Q0.h.d(rect, "feature.rect");
            return new C0135c(new X.b(rect), c0134b, c0134b2);
        }
        return null;
    }
}
