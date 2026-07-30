package D0;

import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.A;
import kotlin.jvm.internal.Intrinsics;
import x0.C0994a;
import x0.C0995b;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f324a = 0;

    public static boolean a(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (Intrinsics.a(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return Intrinsics.a(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public static boolean b(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list != null && list2 != null && list.size() == list2.size()) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (a((SidecarDisplayFeature) list.get(i2), (SidecarDisplayFeature) list2.get(i2))) {
                }
            }
            return true;
        }
        return false;
    }

    public final A0.l c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (sidecarWindowLayoutInfo == null) {
            return new A0.l(A.f6115d);
        }
        SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
        b.d(sidecarDeviceState, b.b(state));
        return new A0.l(d(b.c(sidecarWindowLayoutInfo), sidecarDeviceState));
    }

    public final ArrayList d(List sidecarDisplayFeatures, SidecarDeviceState deviceState) {
        Intrinsics.checkNotNullParameter(sidecarDisplayFeatures, "sidecarDisplayFeatures");
        Intrinsics.checkNotNullParameter(deviceState, "deviceState");
        ArrayList arrayList = new ArrayList();
        Iterator it = sidecarDisplayFeatures.iterator();
        while (it.hasNext()) {
            A0.c e7 = e((SidecarDisplayFeature) it.next(), deviceState);
            if (e7 != null) {
                arrayList.add(e7);
            }
        }
        return arrayList;
    }

    public final A0.c e(SidecarDisplayFeature feature, SidecarDeviceState deviceState) {
        A0.b bVar;
        A0.b bVar2 = A0.b.f52m;
        Intrinsics.checkNotNullParameter(feature, "feature");
        Intrinsics.checkNotNullParameter(deviceState, "deviceState");
        Intrinsics.checkNotNullExpressionValue("g", "TAG");
        Intrinsics.checkNotNullParameter(feature, "<this>");
        Intrinsics.checkNotNullParameter("g", "tag");
        x0.h verificationMode = x0.h.f8309d;
        Intrinsics.checkNotNullParameter(verificationMode, "verificationMode");
        C0994a logger = C0994a.f8291a;
        Intrinsics.checkNotNullParameter(logger, "logger");
        SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) new x0.g(feature, verificationMode, logger).L("Type must be either TYPE_FOLD or TYPE_HINGE", c.f320d).L("Feature bounds must not be 0", d.f321d).L("TYPE_FOLD must have 0 area", e.f322d).L("Feature be pinned to either left or top", f.f323d).b();
        if (sidecarDisplayFeature == null) {
            return null;
        }
        int type = sidecarDisplayFeature.getType();
        if (type == 1) {
            bVar = A0.b.f54o;
        } else {
            if (type != 2) {
                return null;
            }
            bVar = A0.b.f55p;
        }
        int b7 = b.b(deviceState);
        if (b7 == 0 || b7 == 1) {
            return null;
        }
        if (b7 == 2) {
            bVar2 = A0.b.f53n;
        } else if (b7 != 3 && b7 == 4) {
            return null;
        }
        Rect rect = feature.getRect();
        Intrinsics.checkNotNullExpressionValue(rect, "feature.rect");
        return new A0.c(new C0995b(rect), bVar, bVar2);
    }
}
