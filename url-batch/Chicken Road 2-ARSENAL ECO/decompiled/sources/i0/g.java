package i0;

import W4.o;
import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import c0.C0268a;
import c0.C0269b;
import c0.C0274g;
import f0.C0362b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l5.C0512p;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f4399b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f4400a;

    public g() {
        o.f("verificationMode", 3);
        this.f4400a = 3;
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
            for (int i7 = 0; i7 < size; i7++) {
                if (a((SidecarDisplayFeature) list.get(i7), (SidecarDisplayFeature) list2.get(i7))) {
                }
            }
            return true;
        }
        return false;
    }

    public final f0.j c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        if (sidecarWindowLayoutInfo == null) {
            return new f0.j(C0512p.f5303f);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        AbstractC0419b.d(sidecarDeviceState2, AbstractC0419b.b(sidecarDeviceState));
        return new f0.j(d(AbstractC0419b.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final ArrayList d(List list, SidecarDeviceState sidecarDeviceState) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f0.c e4 = e((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (e4 != null) {
                arrayList.add(e4);
            }
        }
        return arrayList;
    }

    public final f0.c e(SidecarDisplayFeature feature, SidecarDeviceState sidecarDeviceState) {
        C0362b c0362b;
        C0362b c0362b2 = C0362b.f4170j;
        kotlin.jvm.internal.i.e(feature, "feature");
        int i7 = this.f4400a;
        o.f("verificationMode", i7);
        SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) new C0274g(feature, i7, C0268a.f3750a).E("Type must be either TYPE_FOLD or TYPE_HINGE", c.f4395f).E("Feature bounds must not be 0", d.f4396f).E("TYPE_FOLD must have 0 area", e.f4397f).E("Feature be pinned to either left or top", f.f4398f).d();
        if (sidecarDisplayFeature == null) {
            return null;
        }
        int type = sidecarDisplayFeature.getType();
        if (type == 1) {
            c0362b = C0362b.f4172l;
        } else {
            if (type != 2) {
                return null;
            }
            c0362b = C0362b.f4173m;
        }
        int b7 = AbstractC0419b.b(sidecarDeviceState);
        if (b7 == 0 || b7 == 1) {
            return null;
        }
        if (b7 == 2) {
            c0362b2 = C0362b.f4171k;
        } else if (b7 != 3 && b7 == 4) {
            return null;
        }
        Rect rect = feature.getRect();
        kotlin.jvm.internal.i.d(rect, "feature.rect");
        return new f0.c(new C0269b(rect), c0362b, c0362b2);
    }
}
