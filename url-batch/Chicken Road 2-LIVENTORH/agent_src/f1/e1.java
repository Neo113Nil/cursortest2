package f1;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class e1 extends p0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1341a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f1342b;

    public e1(z zVar) {
        this.f1342b = zVar;
    }

    @Override // f1.p0
    public final void a(int i) {
        if (i == 0 && this.f1341a) {
            this.f1341a = false;
            this.f1342b.f();
        }
    }

    @Override // f1.p0
    public final void b(RecyclerView recyclerView, int i, int i4) {
        if (i == 0 && i4 == 0) {
            return;
        }
        this.f1341a = true;
    }
}
