package w2;

import android.widget.Toast;
import androidx.fragment.app.k0;
import androidx.fragment.app.r0;
import androidx.fragment.app.u;
import e3.l;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements l {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y2.e f3605f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g f3606g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x2.a f3607h;

    public /* synthetic */ f(y2.e eVar, g gVar, x2.a aVar) {
        this.f3605f = eVar;
        this.f3606g = gVar;
        this.f3607h = aVar;
    }

    @Override // e3.l
    public final Object b(Object obj) {
        y2.i iVar = (y2.i) obj;
        f3.d.e(iVar, "race");
        long j4 = iVar.f3840g;
        int i = iVar.f3841h;
        int i4 = this.f3605f.f3822c;
        int i5 = iVar.f3838e;
        g gVar = this.f3606g;
        if (i4 < i5) {
            Toast.makeText(gVar.h(), "⚠️ Level " + i5 + " required!", 0).show();
        } else {
            long j5 = iVar.f3839f;
            x2.a aVar = this.f3607h;
            if (aVar.h(j5)) {
                h3.a aVar2 = h3.e.f1808f;
                if (h3.e.f1808f.a().nextInt(100) < 60) {
                    y2.e f2 = aVar.f();
                    f2.f3820a += j4;
                    aVar.g(f2);
                    aVar.a(i);
                    y2.e f4 = aVar.f();
                    f4.f3824f++;
                    f4.f3825g++;
                    aVar.g(f4);
                    Toast.makeText(gVar.h(), "🏆 Victory! +" + j4 + " credits, +" + i + " XP", 1).show();
                } else {
                    y2.e f5 = aVar.f();
                    f5.f3824f++;
                    aVar.g(f5);
                    int i6 = i / 2;
                    aVar.a(i6);
                    Toast.makeText(gVar.h(), "😔 You lost! +" + i6 + " XP", 0).show();
                }
                u uVar = gVar.f554z;
                if (uVar != null) {
                    k0 g4 = uVar.g();
                    g4.getClass();
                    androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(g4);
                    aVar3.e(gVar);
                    aVar3.b(new r0(7, gVar));
                    aVar3.d(false);
                }
            } else {
                Toast.makeText(gVar.h(), "❌ Not enough credits for entry fee!", 0).show();
            }
        }
        return z2.d.f3888c;
    }
}
