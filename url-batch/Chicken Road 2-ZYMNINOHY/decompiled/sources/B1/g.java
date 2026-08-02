package B1;

import E.AbstractC0005f;
import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import d3.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import v1.C1451a;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f196b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f197a;

    public g() {
        AbstractC0005f.t(3, "verificationMode");
        this.f197a = 3;
    }

    public static boolean a(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (kotlin.jvm.internal.i.a(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return kotlin.jvm.internal.i.a(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public static boolean b(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list.size() == list2.size()) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (a((SidecarDisplayFeature) list.get(i4), (SidecarDisplayFeature) list2.get(i4))) {
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
            y1.c e4 = e((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (e4 != null) {
                arrayList.add(e4);
            }
        }
        return arrayList;
    }

    public final y1.k d(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        if (sidecarWindowLayoutInfo == null) {
            return new y1.k(q.f8333a);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        b.d(sidecarDeviceState2, b.b(sidecarDeviceState));
        return new y1.k(c(b.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final y1.c e(SidecarDisplayFeature feature, SidecarDeviceState sidecarDeviceState) {
        y1.b bVar;
        y1.b bVar2 = y1.b.f16231f;
        kotlin.jvm.internal.i.e(feature, "feature");
        int i4 = this.f197a;
        AbstractC0005f.t(i4, "verificationMode");
        SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) new v1.g(feature, i4, C1451a.f15535a).z("Type must be either TYPE_FOLD or TYPE_HINGE", c.f192e).z("Feature bounds must not be 0", d.f193e).z("TYPE_FOLD must have 0 area", e.f194e).z("Feature be pinned to either left or top", f.f195e).g();
        if (sidecarDisplayFeature == null) {
            return null;
        }
        int type = sidecarDisplayFeature.getType();
        if (type == 1) {
            bVar = y1.b.f16233h;
        } else {
            if (type != 2) {
                return null;
            }
            bVar = y1.b.f16234i;
        }
        int b4 = b.b(sidecarDeviceState);
        if (b4 == 0 || b4 == 1) {
            return null;
        }
        if (b4 == 2) {
            bVar2 = y1.b.f16232g;
        } else if (b4 != 3 && b4 == 4) {
            return null;
        }
        Rect rect = feature.getRect();
        kotlin.jvm.internal.i.d(rect, "feature.rect");
        return new y1.c(new v1.b(rect), bVar, bVar2);
    }
}
