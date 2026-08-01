package defpackage;

import android.view.View;
import com.trembin.nirefon.betfury.MainActivity2;
import com.trembin.nirefon.betfury.data.Note;
import com.trembin.nirefon.betfury.viewmodel.NotesViewModel;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final /* synthetic */ class mz implements View.OnClickListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ mz(Object obj, Object obj2, int i) {
        this.f = i;
        this.h = obj;
        this.g = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f;
        Object obj = this.g;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                MainActivity2 mainActivity2 = (MainActivity2) obj2;
                Note note = (Note) obj;
                NotesViewModel.insert$default(mainActivity2.l(), note, null, 2, null);
                if (note.getReminderTime() != null && note.getReminderTime().longValue() > System.currentTimeMillis()) {
                    gk0.M(mainActivity2, note);
                    break;
                }
                break;
            case 1:
                ((c40) obj2).e.h((Note) obj);
                break;
            default:
                ((mz) obj).onClick(view);
                ((be0) obj2).a(1);
                break;
        }
    }
}
