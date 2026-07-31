package q1;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class n extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Z1.p f6927e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f6928f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Z1.r f6929g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0775D f6930h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Bundle f6931i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Z1.p pVar, ArrayList arrayList, Z1.r rVar, C0775D c0775d, Bundle bundle) {
        super(1);
        this.f6927e = pVar;
        this.f6928f = arrayList;
        this.f6929g = rVar;
        this.f6930h = c0775d;
        this.f6931i = bundle;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        List list;
        C0784h c0784h = (C0784h) obj;
        Z1.i.f(c0784h, "entry");
        this.f6927e.f3476d = true;
        ArrayList arrayList = this.f6928f;
        int indexOf = arrayList.indexOf(c0784h);
        if (indexOf != -1) {
            Z1.r rVar = this.f6929g;
            int i3 = indexOf + 1;
            list = arrayList.subList(rVar.f3478d, i3);
            rVar.f3478d = i3;
        } else {
            list = M1.u.f2803d;
        }
        this.f6930h.a(c0784h.f6895e, this.f6931i, c0784h, list);
        return L1.z.f2729a;
    }
}
