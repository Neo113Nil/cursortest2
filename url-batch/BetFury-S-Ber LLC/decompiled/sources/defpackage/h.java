package defpackage;

import com.trembin.nirefon.betfury.data.NoteDao_Impl;
import com.trembin.nirefon.betfury.viewmodel.NotesViewModel;
import java.util.List;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements tr {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ h(e30 e30Var, d30 d30Var) {
        this.f = 1;
        this.g = e30Var;
    }

    @Override // defpackage.tr
    public final Object h(Object obj) {
        List allNotes$lambda$3;
        ty notes$lambda$0;
        int i = this.f;
        sk0 sk0Var = sk0.a;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                return obj == ((n) obj2) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                ((e30) obj2).i(null);
                return sk0Var;
            case 2:
                allNotes$lambda$3 = NoteDao_Impl.getAllNotes$lambda$3("SELECT * FROM notes ORDER BY isPinned DESC, updatedAt DESC", (NoteDao_Impl) obj2, (cb0) obj);
                return allNotes$lambda$3;
            case 3:
                notes$lambda$0 = NotesViewModel.notes$lambda$0((NotesViewModel) obj2, (String) obj);
                return notes$lambda$0;
            case 4:
                ig0 ig0Var = (ig0) obj;
                ig0Var.getClass();
                ((ea0) obj2).g = ig0Var;
                return sk0Var;
            case 5:
                vh vhVar = (vh) obj;
                vhVar.getClass();
                return ((ma0) obj2).createOpenHelper(vhVar);
            case 6:
                ((cb0) obj).getClass();
                return ((ir) obj2).a();
            case 7:
                obj.getClass();
                return ((z1) obj2).a();
            case 8:
                String str = (String) obj2;
                String str2 = (String) obj;
                str2.getClass();
                return mf0.y(str2) ? str2.length() < str.length() ? str : str2 : str.concat(str2);
            default:
                ((n10) obj2).h(obj);
                return sk0Var;
        }
    }

    public /* synthetic */ h(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }
}
