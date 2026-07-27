package p0;

import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import b2.AbstractC0279e;
import g4.C0471p;
import j0.C1198a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m0.C1267b;
import m0.C1268c;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f11621a;

    public f() {
        AbstractC0279e.k(3, "verificationMode");
        this.f11621a = 3;
    }

    public static boolean a(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        if (kotlin.jvm.internal.i.a(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        return (sidecarDeviceState == null || sidecarDeviceState2 == null || AbstractC1378a.b(sidecarDeviceState) != AbstractC1378a.b(sidecarDeviceState2)) ? false : true;
    }

    public static boolean b(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (kotlin.jvm.internal.i.a(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return kotlin.jvm.internal.i.a(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
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
        if (kotlin.jvm.internal.i.a(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        return c(AbstractC1378a.c(sidecarWindowLayoutInfo), AbstractC1378a.c(sidecarWindowLayoutInfo2));
    }

    public final ArrayList e(List list, SidecarDeviceState sidecarDeviceState) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1268c g6 = g((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (g6 != null) {
                arrayList.add(g6);
            }
        }
        return arrayList;
    }

    public final m0.k f(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState state) {
        kotlin.jvm.internal.i.e(state, "state");
        if (sidecarWindowLayoutInfo == null) {
            return new m0.k(C0471p.f5750a);
        }
        SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
        AbstractC1378a.d(sidecarDeviceState, AbstractC1378a.b(state));
        return new m0.k(e(AbstractC1378a.c(sidecarWindowLayoutInfo), sidecarDeviceState));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r6 == 4) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1268c g(SidecarDisplayFeature feature, SidecarDeviceState sidecarDeviceState) {
        C1267b c1267b;
        C1267b c1267b2;
        kotlin.jvm.internal.i.e(feature, "feature");
        SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) C1198a.a(this.f11621a, feature).d("Type must be either TYPE_FOLD or TYPE_HINGE", C1379b.f11617e).d("Feature bounds must not be 0", c.f11618e).d("TYPE_FOLD must have 0 area", d.f11619e).d("Feature be pinned to either left or top", e.f11620e).a();
        if (sidecarDisplayFeature == null) {
            return null;
        }
        int type = sidecarDisplayFeature.getType();
        if (type == 1) {
            c1267b = C1267b.f11094g;
        } else {
            if (type != 2) {
                return null;
            }
            c1267b = C1267b.f11095h;
        }
        int b6 = AbstractC1378a.b(sidecarDeviceState);
        if (b6 != 0 && b6 != 1) {
            if (b6 != 2) {
                c1267b2 = C1267b.f11092e;
                if (b6 != 3) {
                }
            } else {
                c1267b2 = C1267b.f11093f;
            }
            Rect rect = feature.getRect();
            kotlin.jvm.internal.i.d(rect, "feature.rect");
            return new C1268c(new j0.b(rect), c1267b, c1267b2);
        }
        return null;
    }
}
