package z;

import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f1256b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f1257a = 3;

    public static boolean a(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (d1.h.a(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return d1.h.a(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
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

    public final ArrayList c(List list, SidecarDeviceState sidecarDeviceState) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            w.c e2 = e((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (e2 != null) {
                arrayList.add(e2);
            }
        }
        return arrayList;
    }

    public final w.j d(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        if (sidecarWindowLayoutInfo == null) {
            return new w.j(u0.l.f1186b);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        b.d(sidecarDeviceState2, b.b(sidecarDeviceState));
        return new w.j(c(b.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
    
        if (r7 == 4) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final w.c e(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
        w.b bVar;
        w.b bVar2 = w.b.f1201f;
        sidecarDisplayFeature.getClass();
        int i2 = this.f1257a;
        if (i2 == 0) {
            throw null;
        }
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) new t.g(sidecarDisplayFeature, i2, t.a.f1148a).x("Type must be either TYPE_FOLD or TYPE_HINGE", c.f1252c).x("Feature bounds must not be 0", d.f1253c).x("TYPE_FOLD must have 0 area", e.f1254c).x("Feature be pinned to either left or top", f.f1255c).g();
        if (sidecarDisplayFeature2 != null) {
            int type = sidecarDisplayFeature2.getType();
            if (type == 1) {
                bVar = w.b.f1203h;
            } else if (type == 2) {
                bVar = w.b.f1204i;
            }
            int b2 = b.b(sidecarDeviceState);
            if (b2 != 0 && b2 != 1) {
                if (b2 == 2) {
                    bVar2 = w.b.f1202g;
                } else if (b2 != 3) {
                }
                Rect rect = sidecarDisplayFeature.getRect();
                rect.getClass();
                return new w.c(new t.b(rect), bVar, bVar2);
            }
        }
        return null;
    }
}
