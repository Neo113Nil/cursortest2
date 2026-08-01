package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ch implements x40 {
    public final /* synthetic */ int a;
    public final Object b;
    public final po c;

    public /* synthetic */ ch(Object obj, po poVar, int i) {
        this.a = i;
        this.b = obj;
        this.c = poVar;
    }

    @Override // defpackage.x40
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new bh(this);
            default:
                return new vo(this);
        }
    }
}
