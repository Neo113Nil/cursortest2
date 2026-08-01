package defpackage;

import android.view.View;
import com.moontiko.really.admiralcasino.MainActivity2;
import com.moontiko.really.admiralcasino.data.Note;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final /* synthetic */ class lu implements View.OnClickListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ lu(Object obj, Object obj2, int i) {
        this.f = i;
        this.h = obj;
        this.g = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f;
        int i2 = 1;
        Object obj = this.g;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                Note note = (Note) obj;
                int i3 = MainActivity2.H;
                ry r = ((MainActivity2) obj2).r();
                r.getClass();
                note.getClass();
                tb E = kr.E(r);
                og ogVar = zh.a;
                mz.z(E, eg.h, new py(r, note, null, i2));
                break;
            case 1:
                ((ny) obj2).e.g((Note) obj);
                break;
            default:
                ((lu) obj).onClick(view);
                ((y50) obj2).a(1);
                break;
        }
    }
}
