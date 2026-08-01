package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class dc implements x40 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.x40
    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((List) obj).iterator();
            default:
                return (Iterator) obj;
        }
    }
}
