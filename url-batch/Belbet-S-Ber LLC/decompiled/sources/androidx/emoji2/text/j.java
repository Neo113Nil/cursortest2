package androidx.emoji2.text;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f451f;

    /* renamed from: g, reason: collision with root package name */
    public final int f452g;
    public final Object h;

    public /* synthetic */ j(int i, int i4, Object obj) {
        this.f451f = i4;
        this.h = obj;
        this.f452g = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f451f) {
            case 0:
                ArrayList arrayList = (ArrayList) this.h;
                int size = arrayList.size();
                int i = 0;
                if (this.f452g == 1) {
                    while (i < size) {
                        ((i) arrayList.get(i)).a();
                        i++;
                    }
                    break;
                } else {
                    while (i < size) {
                        ((i) arrayList.get(i)).getClass();
                        i++;
                    }
                    break;
                }
            case 1:
                ((com.google.android.material.datepicker.q) this.h).f1091g0.j0(this.f452g);
                break;
            default:
                e0.b bVar = (e0.b) ((a0.a) this.h).f79g;
                if (bVar != null) {
                    bVar.g(this.f452g);
                    break;
                }
                break;
        }
    }

    public j(List list, int i, Throwable th) {
        this.f451f = 0;
        b4.l.h(list, "initCallbacks cannot be null");
        this.h = new ArrayList(list);
        this.f452g = i;
    }
}
