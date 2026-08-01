package defpackage;

import com.trembin.nirefon.betfury.data.Note;
import com.trembin.nirefon.betfury.data.NoteDao;
import com.trembin.nirefon.betfury.viewmodel.NotesViewModel;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class d40 extends tg0 implements xr {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ NotesViewModel l;
    public final /* synthetic */ Note m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d40(NotesViewModel notesViewModel, Note note, dg dgVar, int i) {
        super(dgVar);
        this.j = i;
        this.l = notesViewModel;
        this.m = note;
    }

    @Override // defpackage.xr
    public final Object g(Object obj, Object obj2) {
        int i = this.j;
        sk0 sk0Var = sk0.a;
        ah ahVar = (ah) obj;
        dg dgVar = (dg) obj2;
        switch (i) {
        }
        return ((d40) i(dgVar, ahVar)).l(sk0Var);
    }

    @Override // defpackage.f8
    public final dg i(dg dgVar, Object obj) {
        int i = this.j;
        Note note = this.m;
        NotesViewModel notesViewModel = this.l;
        switch (i) {
            case 0:
                return new d40(notesViewModel, note, dgVar, 0);
            default:
                return new d40(notesViewModel, note, dgVar, 1);
        }
    }

    @Override // defpackage.f8
    public final Object l(Object obj) {
        NoteDao noteDao;
        NoteDao noteDao2;
        int i = this.j;
        sk0 sk0Var = sk0.a;
        Note note = this.m;
        NotesViewModel notesViewModel = this.l;
        switch (i) {
            case 0:
                bh bhVar = bh.COROUTINE_SUSPENDED;
                int i2 = this.k;
                if (i2 == 0) {
                    mv.O(obj);
                    noteDao = notesViewModel.dao;
                    this.k = 1;
                    return noteDao.delete(note, this) == bhVar ? bhVar : sk0Var;
                }
                if (i2 == 1) {
                    mv.O(obj);
                    return sk0Var;
                }
                s9.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                bh bhVar2 = bh.COROUTINE_SUSPENDED;
                int i3 = this.k;
                if (i3 == 0) {
                    mv.O(obj);
                    noteDao2 = notesViewModel.dao;
                    this.k = 1;
                    return noteDao2.update(note, this) == bhVar2 ? bhVar2 : sk0Var;
                }
                if (i3 == 1) {
                    mv.O(obj);
                    return sk0Var;
                }
                s9.u("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
