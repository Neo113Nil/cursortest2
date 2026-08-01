package com.trembin.nirefon.betfury.data;

import defpackage.bh;
import defpackage.bi;
import defpackage.cb0;
import defpackage.dg;
import defpackage.di;
import defpackage.eb0;
import defpackage.fn;
import defpackage.gn;
import defpackage.h;
import defpackage.i5;
import defpackage.ma0;
import defpackage.na0;
import defpackage.ow;
import defpackage.sk0;
import defpackage.ty;
import defpackage.uv;
import defpackage.wm;
import defpackage.y30;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class NoteDao_Impl implements NoteDao {
    public static final Companion Companion = new Companion(null);
    private final Converters __converters;
    private final ma0 __db;
    private final fn __deleteAdapterOfNote;
    private final gn __insertAdapterOfNote;
    private final fn __updateAdapterOfNote;

    public NoteDao_Impl(ma0 ma0Var) {
        ma0Var.getClass();
        this.__converters = new Converters();
        this.__db = ma0Var;
        this.__insertAdapterOfNote = new gn() { // from class: com.trembin.nirefon.betfury.data.NoteDao_Impl.1
            @Override // defpackage.gn
            public void bind(eb0 eb0Var, Note note) {
                eb0Var.getClass();
                note.getClass();
                eb0Var.b(1, note.getId());
                eb0Var.g(note.getTitle(), 2);
                eb0Var.g(note.getContent(), 3);
                eb0Var.g(NoteDao_Impl.this.__converters.fromPriority(note.getPriority()), 4);
                eb0Var.b(5, note.isPinned() ? 1L : 0L);
                Long reminderTime = note.getReminderTime();
                if (reminderTime == null) {
                    eb0Var.s();
                } else {
                    eb0Var.b(6, reminderTime.longValue());
                }
                eb0Var.b(7, note.getCreatedAt());
                eb0Var.b(8, note.getUpdatedAt());
            }

            @Override // defpackage.gn
            public String createQuery() {
                return "INSERT OR REPLACE INTO `notes` (`id`,`title`,`content`,`priority`,`isPinned`,`reminderTime`,`createdAt`,`updatedAt`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
            }
        };
        this.__deleteAdapterOfNote = new fn() { // from class: com.trembin.nirefon.betfury.data.NoteDao_Impl.2
            @Override // defpackage.fn
            public void bind(eb0 eb0Var, Note note) {
                eb0Var.getClass();
                note.getClass();
                eb0Var.b(1, note.getId());
            }

            @Override // defpackage.fn
            public String createQuery() {
                return "DELETE FROM `notes` WHERE `id` = ?";
            }
        };
        this.__updateAdapterOfNote = new fn() { // from class: com.trembin.nirefon.betfury.data.NoteDao_Impl.3
            @Override // defpackage.fn
            public void bind(eb0 eb0Var, Note note) {
                eb0Var.getClass();
                note.getClass();
                eb0Var.b(1, note.getId());
                eb0Var.g(note.getTitle(), 2);
                eb0Var.g(note.getContent(), 3);
                eb0Var.g(NoteDao_Impl.this.__converters.fromPriority(note.getPriority()), 4);
                eb0Var.b(5, note.isPinned() ? 1L : 0L);
                Long reminderTime = note.getReminderTime();
                if (reminderTime == null) {
                    eb0Var.s();
                } else {
                    eb0Var.b(6, reminderTime.longValue());
                }
                eb0Var.b(7, note.getCreatedAt());
                eb0Var.b(8, note.getUpdatedAt());
                eb0Var.b(9, note.getId());
            }

            @Override // defpackage.fn
            public String createQuery() {
                return "UPDATE OR ABORT `notes` SET `id` = ?,`title` = ?,`content` = ?,`priority` = ?,`isPinned` = ?,`reminderTime` = ?,`createdAt` = ?,`updatedAt` = ? WHERE `id` = ?";
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sk0 delete$lambda$1(NoteDao_Impl noteDao_Impl, Note note, cb0 cb0Var) {
        cb0Var.getClass();
        noteDao_Impl.__deleteAdapterOfNote.handle(cb0Var, note);
        return sk0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getAllNotes$lambda$3(String str, NoteDao_Impl noteDao_Impl, cb0 cb0Var) {
        cb0Var.getClass();
        eb0 N = cb0Var.N(str);
        try {
            int C = bi.C(N, "id");
            int C2 = bi.C(N, "title");
            int C3 = bi.C(N, "content");
            int C4 = bi.C(N, "priority");
            int C5 = bi.C(N, "isPinned");
            int C6 = bi.C(N, "reminderTime");
            int C7 = bi.C(N, "createdAt");
            int C8 = bi.C(N, "updatedAt");
            ArrayList arrayList = new ArrayList();
            while (N.G()) {
                int i = C2;
                int i2 = C3;
                arrayList.add(new Note((int) N.getLong(C), N.h(C2), N.h(C3), noteDao_Impl.__converters.toPriority(N.h(C4)), ((int) N.getLong(C5)) != 0, N.isNull(C6) ? null : Long.valueOf(N.getLong(C6)), N.getLong(C7), N.getLong(C8)));
                C2 = i;
                C3 = i2;
            }
            return arrayList;
        } finally {
            N.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long insert$lambda$0(NoteDao_Impl noteDao_Impl, Note note, cb0 cb0Var) {
        cb0Var.getClass();
        return noteDao_Impl.__insertAdapterOfNote.insertAndReturnId(cb0Var, note);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List searchNotes$lambda$4(String str, String str2, NoteDao_Impl noteDao_Impl, cb0 cb0Var) {
        cb0Var.getClass();
        eb0 N = cb0Var.N(str);
        try {
            N.g(str2, 1);
            N.g(str2, 2);
            int C = bi.C(N, "id");
            int C2 = bi.C(N, "title");
            int C3 = bi.C(N, "content");
            int C4 = bi.C(N, "priority");
            int C5 = bi.C(N, "isPinned");
            int C6 = bi.C(N, "reminderTime");
            int C7 = bi.C(N, "createdAt");
            int C8 = bi.C(N, "updatedAt");
            ArrayList arrayList = new ArrayList();
            while (N.G()) {
                int i = C2;
                arrayList.add(new Note((int) N.getLong(C), N.h(C2), N.h(C3), noteDao_Impl.__converters.toPriority(N.h(C4)), ((int) N.getLong(C5)) != 0, N.isNull(C6) ? null : Long.valueOf(N.getLong(C6)), N.getLong(C7), N.getLong(C8)));
                C2 = i;
            }
            return arrayList;
        } finally {
            N.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sk0 update$lambda$2(NoteDao_Impl noteDao_Impl, Note note, cb0 cb0Var) {
        cb0Var.getClass();
        noteDao_Impl.__updateAdapterOfNote.handle(cb0Var, note);
        return sk0.a;
    }

    @Override // com.trembin.nirefon.betfury.data.NoteDao
    public Object delete(Note note, dg dgVar) {
        Object R = bi.R(dgVar, new y30(this, note, 0), this.__db, false, true);
        return R == bh.COROUTINE_SUSPENDED ? R : sk0.a;
    }

    @Override // com.trembin.nirefon.betfury.data.NoteDao
    public ty getAllNotes() {
        uv invalidationTracker = this.__db.getInvalidationTracker();
        String[] strArr = {"notes"};
        h hVar = new h(2, this);
        invalidationTracker.c.g(strArr);
        i5 i5Var = invalidationTracker.h;
        i5Var.getClass();
        return new na0((NoteDatabase_Impl) i5Var.g, i5Var, strArr, hVar);
    }

    @Override // com.trembin.nirefon.betfury.data.NoteDao
    public Object insert(Note note, dg dgVar) {
        return bi.R(dgVar, new y30(this, note, 1), this.__db, false, true);
    }

    @Override // com.trembin.nirefon.betfury.data.NoteDao
    public ty searchNotes(String str) {
        str.getClass();
        uv invalidationTracker = this.__db.getInvalidationTracker();
        String[] strArr = {"notes"};
        y30 y30Var = new y30(str, this);
        invalidationTracker.c.g(strArr);
        i5 i5Var = invalidationTracker.h;
        i5Var.getClass();
        return new na0((NoteDatabase_Impl) i5Var.g, i5Var, strArr, y30Var);
    }

    @Override // com.trembin.nirefon.betfury.data.NoteDao
    public Object update(Note note, dg dgVar) {
        Object R = bi.R(dgVar, new y30(this, note, 2), this.__db, false, true);
        return R == bh.COROUTINE_SUSPENDED ? R : sk0.a;
    }

    /* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
    public static final class Companion {
        public /* synthetic */ Companion(di diVar) {
            this();
        }

        public final List<ow> getRequiredConverters() {
            return wm.f;
        }

        private Companion() {
        }
    }
}
