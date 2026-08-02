package p1;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f14757a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f14758b;

    public j(View view, ArrayList arrayList) {
        this.f14757a = view;
        this.f14758b = arrayList;
    }

    @Override // p1.p
    public final void a(q qVar) {
        qVar.w(this);
        this.f14757a.setVisibility(8);
        ArrayList arrayList = this.f14758b;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((View) arrayList.get(i4)).setVisibility(0);
        }
    }

    @Override // p1.p
    public final void e(q qVar) {
        qVar.w(this);
        qVar.a(this);
    }

    @Override // p1.p
    public final void b() {
    }

    @Override // p1.p
    public final void c() {
    }

    @Override // p1.p
    public final void d() {
    }
}
