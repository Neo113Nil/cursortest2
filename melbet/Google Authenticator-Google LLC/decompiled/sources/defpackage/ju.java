package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.Comparator;
import org.chromium.net.CronetProvider;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ju implements Comparator {
    private final /* synthetic */ int a;

    public ju(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                jw jwVar = (jw) obj;
                jw jwVar2 = (jw) obj2;
                RecyclerView recyclerView = jwVar.d;
                if ((recyclerView == null) != (jwVar2.d == null)) {
                    return recyclerView == null ? 1 : -1;
                }
                boolean z = jwVar.a;
                if (z != jwVar2.a) {
                    return z ? -1 : 1;
                }
                int i = jwVar2.b - jwVar.b;
                if (i == 0 && (i = jwVar.c - jwVar2.c) == 0) {
                    return 0;
                }
                return i;
            case 1:
                return ((gui) obj).b - ((gui) obj2).b;
            case 2:
                return ((ry) obj).c - ((ry) obj2).c;
            case 3:
                int i2 = yq.a;
                float z2 = ((View) obj).getZ();
                float z3 = ((View) obj2).getZ();
                if (z2 > z3) {
                    return -1;
                }
                return z2 < z3 ? 1 : 0;
            case 4:
                return ((int[]) obj)[0] - ((int[]) obj2)[0];
            case 5:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 6:
                lhj lhjVar = (lhj) obj;
                lhj lhjVar2 = (lhj) obj2;
                if (CronetProvider.PROVIDER_NAME_FALLBACK.equals(lhjVar.a.getName())) {
                    return 1;
                }
                if (CronetProvider.PROVIDER_NAME_FALLBACK.equals(lhjVar2.a.getName())) {
                    return -1;
                }
                return -CronetProvider.compareVersions(lhjVar.a.getVersion(), lhjVar2.a.getVersion());
            default:
                return -Integer.compare(((lhj) obj).b, ((lhj) obj2).b);
        }
    }
}
