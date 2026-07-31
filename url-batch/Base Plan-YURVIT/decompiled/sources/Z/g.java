package Z;

import E0.o;
import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f1055b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f1056a;

    public g() {
        L.d.i("verificationMode", 3);
        this.f1056a = 3;
    }

    public static boolean a(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (P0.h.a(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return P0.h.a(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public static boolean b(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list.size() == list2.size()) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (a((SidecarDisplayFeature) list.get(i2), (SidecarDisplayFeature) list2.get(i2))) {
                }
            }
            return true;
        }
        return false;
    }

    public final W.k c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        if (sidecarWindowLayoutInfo == null) {
            return new W.k(o.f219e);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        b.d(sidecarDeviceState2, b.b(sidecarDeviceState));
        return new W.k(d(b.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final ArrayList d(List list, SidecarDeviceState sidecarDeviceState) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            W.c e2 = e((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (e2 != null) {
                arrayList.add(e2);
            }
        }
        return arrayList;
    }

    public final W.c e(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
        W.b bVar;
        W.b bVar2 = W.b.f874i;
        P0.h.e(sidecarDisplayFeature, "feature");
        int i2 = this.f1056a;
        L.d.i("verificationMode", i2);
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) new T.g(sidecarDisplayFeature, i2, T.a.f830a).C("Type must be either TYPE_FOLD or TYPE_HINGE", c.f1051f).C("Feature bounds must not be 0", d.f1052f).C("TYPE_FOLD must have 0 area", e.f1053f).C("Feature be pinned to either left or top", f.f1054f).h();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        int type = sidecarDisplayFeature2.getType();
        if (type == 1) {
            bVar = W.b.f876k;
        } else {
            if (type != 2) {
                return null;
            }
            bVar = W.b.f877l;
        }
        int b2 = b.b(sidecarDeviceState);
        if (b2 == 0 || b2 == 1) {
            return null;
        }
        if (b2 == 2) {
            bVar2 = W.b.f875j;
        } else if (b2 != 3 && b2 == 4) {
            return null;
        }
        Rect rect = sidecarDisplayFeature.getRect();
        P0.h.d(rect, "feature.rect");
        return new W.c(new T.b(rect), bVar, bVar2);
    }
}
