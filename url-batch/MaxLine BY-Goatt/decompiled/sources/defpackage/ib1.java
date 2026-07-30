package defpackage;

import java.util.Comparator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ib1 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ yf b;

    public /* synthetic */ ib1(yf yfVar, int i) {
        this.a = i;
        this.b = yfVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        yf yfVar = this.b;
        switch (i) {
            case 0:
                return bx.a(Integer.valueOf(yfVar.a(((oa1) obj).b)), Integer.valueOf(yfVar.a(((oa1) obj2).b)));
            default:
                return bx.a(Integer.valueOf(yfVar.a(((oa1) obj2).b)), Integer.valueOf(yfVar.a(((oa1) obj).b)));
        }
    }
}
