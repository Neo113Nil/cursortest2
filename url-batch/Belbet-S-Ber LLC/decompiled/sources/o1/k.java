package o1;

import android.content.DialogInterface;
import com.gdmhkmf.belbet.MainActivity2;
import com.gdmhkmf.belbet.R;
import com.google.android.material.chip.ChipGroup;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements a2.j, h3.l {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2907f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MainActivity2 f2908g;

    public /* synthetic */ k(MainActivity2 mainActivity2, int i) {
        this.f2907f = i;
        this.f2908g = mainActivity2;
    }

    @Override // a2.j
    public void a(ChipGroup chipGroup, ArrayList arrayList) {
        int i = this.f2907f;
        MainActivity2 mainActivity2 = this.f2908g;
        boolean z4 = false;
        switch (i) {
            case 0:
                int i4 = MainActivity2.M;
                Integer num = (Integer) (arrayList.isEmpty() ? null : arrayList.get(0));
                mainActivity2.J = (num != null && num.intValue() == R.id.chipThisMonth) ? m.f2912g : (num != null && num.intValue() == R.id.chipSoon) ? m.h : m.f2911f;
                mainActivity2.s();
                break;
            default:
                int i5 = MainActivity2.M;
                Integer num2 = (Integer) (arrayList.isEmpty() ? null : arrayList.get(0));
                if (num2 != null && num2.intValue() == R.id.chipSortName) {
                    z4 = true;
                }
                mainActivity2.K = z4;
                mainActivity2.s();
                break;
        }
    }

    @Override // h3.l
    public Object b(Object obj) {
        int i = this.f2907f;
        final MainActivity2 mainActivity2 = this.f2908g;
        final h hVar = (h) obj;
        switch (i) {
            case 2:
                int i4 = MainActivity2.M;
                i3.d.e(hVar, "entry");
                new a4.h(mainActivity2, hVar, new k(mainActivity2, 4)).g();
                break;
            case 3:
                int i5 = MainActivity2.M;
                i3.d.e(hVar, "entry");
                c2.b bVar = new c2.b(mainActivity2);
                g.b bVar2 = (g.b) bVar.f168b;
                bVar2.d = bVar2.f1470a.getText(R.string.delete_confirm_title);
                bVar2.f1474f = mainActivity2.getString(R.string.delete_confirm_message, hVar.f2899b);
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: o1.l
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i6) {
                        MainActivity2 mainActivity22 = MainActivity2.this;
                        a0.a aVar = mainActivity22.G;
                        if (aVar == null) {
                            i3.d.h("repository");
                            throw null;
                        }
                        String str = hVar.f2898a;
                        i3.d.e(str, "id");
                        List F = aVar.F();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : F) {
                            if (!i3.d.a(((h) obj2).f2898a, str)) {
                                arrayList.add(obj2);
                            }
                        }
                        aVar.J(arrayList);
                        mainActivity22.r();
                    }
                };
                bVar2.f1475g = bVar2.f1470a.getText(R.string.action_delete);
                bVar2.h = onClickListener;
                bVar2.i = bVar2.f1470a.getText(R.string.action_cancel);
                bVar.b().show();
                break;
            case 4:
                int i6 = MainActivity2.M;
                i3.d.e(hVar, "updated");
                a0.a aVar = mainActivity2.G;
                if (aVar == null) {
                    i3.d.h("repository");
                    throw null;
                }
                List<h> F = aVar.F();
                ArrayList arrayList = new ArrayList(x2.j.C(F));
                for (h hVar2 : F) {
                    if (i3.d.a(hVar2.f2898a, hVar.f2898a)) {
                        hVar2 = hVar;
                    }
                    arrayList.add(hVar2);
                }
                aVar.J(arrayList);
                mainActivity2.r();
                break;
            default:
                int i7 = MainActivity2.M;
                i3.d.e(hVar, "entry");
                a0.a aVar2 = mainActivity2.G;
                if (aVar2 == null) {
                    i3.d.h("repository");
                    throw null;
                }
                List F2 = aVar2.F();
                i3.d.e(F2, "<this>");
                ArrayList arrayList2 = new ArrayList(F2);
                arrayList2.add(hVar);
                aVar2.J(arrayList2);
                mainActivity2.r();
                break;
        }
        return w2.d.f3820c;
    }
}
