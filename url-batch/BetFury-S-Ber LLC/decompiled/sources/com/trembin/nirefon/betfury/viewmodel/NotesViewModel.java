package com.trembin.nirefon.betfury.viewmodel;

import com.trembin.nirefon.betfury.data.Note;
import com.trembin.nirefon.betfury.data.NoteDao;
import defpackage.a90;
import defpackage.b30;
import defpackage.bi;
import defpackage.d40;
import defpackage.dg;
import defpackage.gk0;
import defpackage.h;
import defpackage.he;
import defpackage.j2;
import defpackage.jb0;
import defpackage.lz;
import defpackage.mf0;
import defpackage.n10;
import defpackage.om0;
import defpackage.rg;
import defpackage.sk0;
import defpackage.tr;
import defpackage.ty;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class NotesViewModel extends om0 {
    private final NoteDao dao;
    private final ty notes;
    private final b30 searchQuery;

    public NotesViewModel(NoteDao noteDao) {
        n10 n10Var;
        noteDao.getClass();
        this.dao = noteDao;
        b30 b30Var = new b30("");
        this.searchQuery = b30Var;
        h hVar = new h(3, this);
        a90 a90Var = new a90();
        Object obj = b30Var.e;
        Object obj2 = ty.k;
        if (obj != obj2) {
            Object obj3 = b30Var.e;
            ty tyVar = (ty) hVar.h(obj3 == obj2 ? null : obj3);
            if (tyVar == null || tyVar.e == obj2) {
                n10Var = new n10();
            } else {
                Object obj4 = tyVar.e;
                n10Var = new n10(obj4 != obj2 ? obj4 : null);
                n10Var.l = new jb0();
            }
        } else {
            n10Var = new n10();
        }
        int i = 1;
        n10Var.i(b30Var, new lz(new j2(hVar, a90Var, n10Var, i), i));
        this.notes = n10Var;
    }

    public static /* synthetic */ void insert$default(NotesViewModel notesViewModel, Note note, tr trVar, int i, Object obj) {
        if ((i & 2) != 0) {
            trVar = new rg(1);
        }
        notesViewModel.insert(note, trVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sk0 insert$lambda$1(long j) {
        return sk0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ty notes$lambda$0(NotesViewModel notesViewModel, String str) {
        if (str == null || mf0.y(str)) {
            return notesViewModel.dao.getAllNotes();
        }
        return notesViewModel.dao.searchNotes("%" + str + "%");
    }

    public final void delete(Note note) {
        note.getClass();
        gk0.y(bi.F(this), null, new d40(this, note, null, 0), 3);
    }

    public final ty getNotes() {
        return this.notes;
    }

    public final void insert(Note note, tr trVar) {
        note.getClass();
        trVar.getClass();
        gk0.y(bi.F(this), null, new he(this, note, trVar, (dg) null), 3);
    }

    public final void setSearchQuery(String str) {
        str.getClass();
        this.searchQuery.h(str);
    }

    public final void togglePin(Note note) {
        note.getClass();
        update(Note.copy$default(note, 0, null, null, null, !note.isPinned(), null, 0L, System.currentTimeMillis(), 111, null));
    }

    public final void update(Note note) {
        note.getClass();
        gk0.y(bi.F(this), null, new d40(this, note, null, 1), 3);
    }
}
