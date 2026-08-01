package defpackage;

import com.trembin.nirefon.betfury.data.Note;
import com.trembin.nirefon.betfury.data.NoteDao_Impl;
import java.util.List;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final /* synthetic */ class y30 implements tr {
    public final /* synthetic */ int f;
    public final /* synthetic */ NoteDao_Impl g;
    public final /* synthetic */ Object h;

    public /* synthetic */ y30(String str, NoteDao_Impl noteDao_Impl) {
        this.f = 3;
        this.h = str;
        this.g = noteDao_Impl;
    }

    @Override // defpackage.tr
    public final Object h(Object obj) {
        sk0 delete$lambda$1;
        long insert$lambda$0;
        sk0 update$lambda$2;
        List searchNotes$lambda$4;
        int i = this.f;
        NoteDao_Impl noteDao_Impl = this.g;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                delete$lambda$1 = NoteDao_Impl.delete$lambda$1(noteDao_Impl, (Note) obj2, (cb0) obj);
                return delete$lambda$1;
            case 1:
                insert$lambda$0 = NoteDao_Impl.insert$lambda$0(noteDao_Impl, (Note) obj2, (cb0) obj);
                return Long.valueOf(insert$lambda$0);
            case 2:
                update$lambda$2 = NoteDao_Impl.update$lambda$2(noteDao_Impl, (Note) obj2, (cb0) obj);
                return update$lambda$2;
            default:
                searchNotes$lambda$4 = NoteDao_Impl.searchNotes$lambda$4("SELECT * FROM notes WHERE title LIKE ? OR content LIKE ? ORDER BY isPinned DESC, updatedAt DESC", (String) obj2, noteDao_Impl, (cb0) obj);
                return searchNotes$lambda$4;
        }
    }

    public /* synthetic */ y30(NoteDao_Impl noteDao_Impl, Note note, int i) {
        this.f = i;
        this.g = noteDao_Impl;
        this.h = note;
    }
}
