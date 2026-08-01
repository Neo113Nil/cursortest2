package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class ef implements y10 {
    public final /* synthetic */ int a;
    public final Object b;
    public final xl c;

    public /* synthetic */ ef(Object obj, xl xlVar, int i) {
        this.a = i;
        this.b = obj;
        this.c = xlVar;
    }

    @Override // defpackage.y10
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new df(this);
            default:
                return new mm(this);
        }
    }
}
