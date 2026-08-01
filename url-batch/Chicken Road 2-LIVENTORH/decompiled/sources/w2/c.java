package w2;

import android.widget.Toast;
import androidx.fragment.app.k0;
import androidx.fragment.app.r0;
import androidx.fragment.app.u;
import e3.l;
import java.util.ArrayList;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements l {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x2.a f3603f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u f3604g;

    public /* synthetic */ c(x2.a aVar, u uVar) {
        this.f3603f = aVar;
        this.f3604g = uVar;
    }

    public void a(Object obj, String str) {
        d dVar = (d) this.f3604g;
        y2.b bVar = (y2.b) obj;
        String str2 = bVar.f3804b;
        int i = bVar.f3803a;
        boolean equals = str.equals("purchase");
        x2.a aVar = this.f3603f;
        if (!equals) {
            if (str.equals("select")) {
                y2.e f2 = aVar.f();
                f2.f3823e = i;
                aVar.g(f2);
                Toast.makeText(dVar.h(), "✅ " + str2 + " selected!", 0).show();
                dVar.G();
                return;
            }
            return;
        }
        if (!aVar.h(bVar.f3808g)) {
            Toast.makeText(dVar.h(), "❌ Not enough credits!", 0).show();
            return;
        }
        y2.e f4 = aVar.f();
        ArrayList arrayList = f4.d;
        if (!arrayList.contains(Integer.valueOf(i))) {
            arrayList.add(Integer.valueOf(i));
            aVar.g(f4);
        }
        Toast.makeText(dVar.h(), "✅ " + str2 + " purchased!", 0).show();
        dVar.G();
    }

    @Override // e3.l
    public Object b(Object obj) {
        h hVar = (h) this.f3604g;
        y2.j jVar = (y2.j) obj;
        f3.d.e(jVar, "item");
        if (this.f3603f.h(jVar.f3845e)) {
            Toast.makeText(hVar.h(), "✅ " + jVar.f3843b + " purchased!", 0).show();
            u uVar = hVar.f554z;
            if (uVar != null) {
                k0 g4 = uVar.g();
                g4.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(g4);
                aVar.e(hVar);
                aVar.b(new r0(7, hVar));
                aVar.d(false);
            }
        } else {
            Toast.makeText(hVar.h(), "❌ Not enough credits!", 0).show();
        }
        return z2.d.f3888c;
    }
}
