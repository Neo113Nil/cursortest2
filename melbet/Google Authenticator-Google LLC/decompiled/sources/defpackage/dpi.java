package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class dpi implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ dpi(dpk dpkVar, ees eesVar, int i, String str, int i2) {
        this.e = i2;
        this.b = dpkVar;
        this.c = eesVar;
        this.a = i;
        this.d = str;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [hac, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        if (i == 0) {
            Object obj = this.d;
            final dpk dpkVar = (dpk) this.b;
            final String str = (String) obj;
            eer eerVar = new eer() { // from class: dpg
                @Override // defpackage.eer
                public final void a(Bitmap bitmap) {
                    dpk dpkVar2 = dpk.this;
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(dpkVar2.a(bitmap));
                    dpl.b.put(str, bitmapDrawable);
                    dih.W(new dgc(dpkVar2, bitmapDrawable, 18, null));
                }
            };
            Object obj2 = dpkVar.b;
            dpe dpeVar = (dpe) this.c;
            dov dovVar = dpeVar.a;
            Map map = dpl.a;
            eerVar.a(dpeVar.b.j(eet.a(obj2, dovVar), this.a));
            return;
        }
        if (i == 1) {
            ((es) this.b).b.execute(new at(this, fd.a(new er(this)), 9, (byte[]) null));
            return;
        }
        if (i != 2) {
            if (i != 3) {
                Object obj3 = this.d;
                gaj.f(this.b, this.a, (String) this.c, (Object[]) obj3);
                return;
            } else {
                efq efqVar = ((efp) this.c).d;
                efqVar.a.e((View) this.b, this.a, this.d);
                return;
            }
        }
        eff effVar = (eff) this.c;
        String str2 = effVar.a;
        if (str2 == null) {
            str2 = "Unknown";
        }
        ((fea) ((efn) ((fwm) this.d).b.bB()).i.bB()).b(str2, Integer.valueOf(Math.min(effVar.b, 3)), Integer.valueOf(Math.min(effVar.c, 3)), Integer.valueOf(Math.min(effVar.d, 3)), Integer.valueOf(Math.min(effVar.e, 3)), Integer.valueOf(Math.min(effVar.f, 3)), Integer.valueOf(Math.min(effVar.g, 3)), effVar.h, ((efe) this.b).c, dih.Q(this.a));
    }

    public /* synthetic */ dpi(efp efpVar, View view, int i, Object obj, int i2) {
        this.e = i2;
        this.c = efpVar;
        this.b = view;
        this.a = i;
        this.d = obj;
    }

    public dpi(es esVar, List list, List list2, int i, int i2) {
        this.e = i2;
        this.b = esVar;
        this.d = list;
        this.c = list2;
        this.a = i;
    }

    public /* synthetic */ dpi(fwm fwmVar, eff effVar, efe efeVar, int i, int i2) {
        this.e = i2;
        this.d = fwmVar;
        this.c = effVar;
        this.b = efeVar;
        this.a = i;
    }

    public /* synthetic */ dpi(hvi hviVar, int i, String str, Object[] objArr, int i2) {
        this.e = i2;
        this.b = hviVar;
        this.a = i;
        this.c = str;
        this.d = objArr;
    }
}
