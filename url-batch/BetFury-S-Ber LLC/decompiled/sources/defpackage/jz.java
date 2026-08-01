package defpackage;

import com.trembin.nirefon.betfury.MainActivity2;
import com.trembin.nirefon.betfury.data.Note;
import com.trembin.nirefon.betfury.databinding.ActivityMain2Binding;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final /* synthetic */ class jz implements tr {
    public final /* synthetic */ int f;
    public final /* synthetic */ MainActivity2 g;

    public /* synthetic */ jz(MainActivity2 mainActivity2, int i) {
        this.f = i;
        this.g = mainActivity2;
    }

    @Override // defpackage.tr
    public final Object h(Object obj) {
        int i = this.f;
        sk0 sk0Var = sk0.a;
        MainActivity2 mainActivity2 = this.g;
        switch (i) {
            case 0:
                List list = (List) obj;
                ActivityMain2Binding activityMain2Binding = mainActivity2.F;
                if (activityMain2Binding == null) {
                    mv.P("binding");
                    throw null;
                }
                z70 adapter = activityMain2Binding.recyclerView.getAdapter();
                adapter.getClass();
                m7 m7Var = ((c40) adapter).d;
                o0 o0Var = m7Var.a;
                int i2 = m7Var.g + 1;
                m7Var.g = i2;
                List list2 = m7Var.e;
                if (list != list2) {
                    if (list == null) {
                        int size = list2.size();
                        m7Var.e = null;
                        m7Var.f = Collections.EMPTY_LIST;
                        o0Var.d(0, size);
                        m7Var.a();
                    } else if (list2 == null) {
                        m7Var.e = list;
                        m7Var.f = Collections.unmodifiableList(list);
                        o0Var.n(0, list.size());
                        m7Var.a();
                    } else {
                        ((Executor) m7Var.b.g).execute(new k7(m7Var, list2, list, i2));
                    }
                }
                boolean isEmpty = list.isEmpty();
                ActivityMain2Binding activityMain2Binding2 = mainActivity2.F;
                if (activityMain2Binding2 == null) {
                    mv.P("binding");
                    throw null;
                }
                activityMain2Binding2.emptyState.setVisibility(isEmpty ? 0 : 8);
                ActivityMain2Binding activityMain2Binding3 = mainActivity2.F;
                if (activityMain2Binding3 != null) {
                    activityMain2Binding3.recyclerView.setVisibility(isEmpty ? 8 : 0);
                    return sk0Var;
                }
                mv.P("binding");
                throw null;
            case 1:
                Note note = (Note) obj;
                int i3 = MainActivity2.I;
                note.getClass();
                m2 D = n9.D(note);
                kq kqVar = ((xp) mainActivity2.z.g).r;
                D.l0 = false;
                D.m0 = true;
                kqVar.getClass();
                a8 a8Var = new a8(kqVar);
                a8Var.o = true;
                a8Var.e(0, D, "AddEditNoteSheet", 1);
                a8Var.d(false);
                return sk0Var;
            default:
                Note note2 = (Note) obj;
                int i4 = MainActivity2.I;
                note2.getClass();
                mainActivity2.l().togglePin(note2);
                String str = note2.isPinned() ? "Unpinned" : "Pinned";
                ActivityMain2Binding activityMain2Binding4 = mainActivity2.F;
                if (activityMain2Binding4 != null) {
                    be0.f(activityMain2Binding4.getRoot(), str, -1).g();
                    return sk0Var;
                }
                mv.P("binding");
                throw null;
        }
    }
}
