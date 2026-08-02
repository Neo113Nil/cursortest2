package j0;

import E1.AbstractC0033i;
import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import c2.m;
import d0.C0294a;
import d0.C0295b;
import g0.C0330b;
import g0.C0331c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f9499b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f9500a;

    public f() {
        AbstractC0033i.n(3, "verificationMode");
        this.f9500a = 3;
    }

    public static boolean a(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (kotlin.jvm.internal.j.a(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return kotlin.jvm.internal.j.a(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public static boolean b(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list.size() == list2.size()) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (a((SidecarDisplayFeature) list.get(i3), (SidecarDisplayFeature) list2.get(i3))) {
                }
            }
            return true;
        }
        return false;
    }

    public final g0.j c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        if (sidecarWindowLayoutInfo == null) {
            return new g0.j(m.f2637a);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        AbstractC1051a.d(sidecarDeviceState2, AbstractC1051a.b(sidecarDeviceState));
        return new g0.j(d(AbstractC1051a.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final ArrayList d(List list, SidecarDeviceState sidecarDeviceState) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0331c e3 = e((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (e3 != null) {
                arrayList.add(e3);
            }
        }
        return arrayList;
    }

    public final C0331c e(SidecarDisplayFeature feature, SidecarDeviceState sidecarDeviceState) {
        C0330b c0330b;
        C0330b c0330b2;
        kotlin.jvm.internal.j.e(feature, "feature");
        C0294a c0294a = C0294a.f4908a;
        int i3 = this.f9500a;
        AbstractC0033i.n(i3, "verificationMode");
        SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) new d0.g(feature, i3, c0294a).B("Type must be either TYPE_FOLD or TYPE_HINGE", b.f9495e).B("Feature bounds must not be 0", c.f9496e).B("TYPE_FOLD must have 0 area", d.f9497e).B("Feature be pinned to either left or top", e.f9498e).b();
        if (sidecarDisplayFeature == null) {
            return null;
        }
        int type = sidecarDisplayFeature.getType();
        if (type == 1) {
            c0330b = C0330b.f5013g;
        } else {
            if (type != 2) {
                return null;
            }
            c0330b = C0330b.f5014h;
        }
        int b3 = AbstractC1051a.b(sidecarDeviceState);
        if (b3 == 0 || b3 == 1) {
            return null;
        }
        if (b3 != 2) {
            c0330b2 = C0330b.f5012e;
            if (b3 != 3 && b3 == 4) {
                return null;
            }
        } else {
            c0330b2 = C0330b.f;
        }
        Rect rect = feature.getRect();
        kotlin.jvm.internal.j.d(rect, "feature.rect");
        return new C0331c(new C0295b(rect), c0330b, c0330b2);
    }
}
