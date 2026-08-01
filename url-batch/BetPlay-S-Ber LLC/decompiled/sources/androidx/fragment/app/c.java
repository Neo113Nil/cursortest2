package androidx.fragment.app;

import defpackage.o30;
import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class c implements Runnable {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ s g;
    public final /* synthetic */ Object h;

    public c(f fVar, ArrayList arrayList, s sVar) {
        this.h = arrayList;
        this.g = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        s sVar = this.g;
        Object obj = this.h;
        switch (i) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList.contains(sVar)) {
                    arrayList.remove(sVar);
                    o30.a(sVar.c.mView, sVar.a);
                    break;
                }
                break;
            default:
                if (((f) obj).b.contains(sVar)) {
                    o30.a(sVar.c.mView, sVar.a);
                    break;
                }
                break;
        }
    }

    public c(f fVar, s sVar) {
        this.h = fVar;
        this.g = sVar;
    }
}
