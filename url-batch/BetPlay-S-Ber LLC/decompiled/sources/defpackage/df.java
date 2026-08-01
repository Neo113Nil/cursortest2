package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class df implements i20 {
    public final /* synthetic */ int a;
    public final Object b;
    public final gm c;

    public /* synthetic */ df(Object obj, gm gmVar, int i) {
        this.a = i;
        this.b = obj;
        this.c = gmVar;
    }

    @Override // defpackage.i20
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new cf(this);
            default:
                return new wm(this);
        }
    }
}
