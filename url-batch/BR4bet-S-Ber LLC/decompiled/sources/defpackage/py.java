package defpackage;

import com.moontiko.really.admiralcasino.data.Note;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class py extends x70 implements ho {
    public final /* synthetic */ int j;
    public final /* synthetic */ ry k;
    public final /* synthetic */ Note l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ py(ry ryVar, Note note, le leVar, int i) {
        super(leVar);
        this.j = i;
        this.k = ryVar;
        this.l = note;
    }

    @Override // defpackage.ho
    public final Object f(Object obj, Object obj2) {
        le leVar = (le) obj2;
        switch (this.j) {
            case 0:
                py pyVar = (py) h(leVar);
                ej ejVar = ej.q;
                pyVar.i(ejVar);
                return ejVar;
            case 1:
                py pyVar2 = (py) h(leVar);
                ej ejVar2 = ej.q;
                pyVar2.i(ejVar2);
                return ejVar2;
            default:
                py pyVar3 = (py) h(leVar);
                ej ejVar3 = ej.q;
                pyVar3.i(ejVar3);
                return ejVar3;
        }
    }

    @Override // defpackage.x70
    public final le h(le leVar) {
        int i = this.j;
        Note note = this.l;
        ry ryVar = this.k;
        switch (i) {
            case 0:
                return new py(ryVar, note, leVar, 0);
            case 1:
                return new py(ryVar, note, leVar, 1);
            default:
                return new py(ryVar, note, leVar, 2);
        }
    }

    @Override // defpackage.x70
    public final Object i(Object obj) {
        int i = this.j;
        Note note = this.l;
        ry ryVar = this.k;
        switch (i) {
            case 0:
                xf.M(obj);
                oy oyVar = ryVar.b;
                oyVar.getClass();
                note.getClass();
                oyVar.getWritableDatabase().delete("notes", "id = ?", new String[]{String.valueOf(note.getId())});
                ryVar.d();
                break;
            case 1:
                xf.M(obj);
                oy oyVar2 = ryVar.b;
                oyVar2.getClass();
                note.getClass();
                oyVar2.getWritableDatabase().insert("notes", null, oy.f(note));
                ryVar.d();
                break;
            default:
                xf.M(obj);
                oy oyVar3 = ryVar.b;
                oyVar3.getClass();
                oyVar3.getWritableDatabase().update("notes", oy.f(note), "id = ?", new String[]{String.valueOf(note.getId())});
                ryVar.d();
                break;
        }
        return ej.q;
    }
}
