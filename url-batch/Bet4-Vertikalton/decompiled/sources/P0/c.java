package P0;

import android.content.SharedPreferences;
import com.playbag.tripgear.ChecklistActivity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements c1.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f683a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChecklistActivity f684b;

    public /* synthetic */ c(ChecklistActivity checklistActivity, int i) {
        this.f683a = i;
        this.f684b = checklistActivity;
    }

    @Override // c1.p
    public final Object c(Object obj, Serializable serializable) {
        ChecklistActivity checklistActivity = this.f684b;
        int i = this.f683a;
        h hVar = (h) obj;
        int intValue = ((Integer) serializable).intValue();
        switch (i) {
            case 0:
                int i2 = ChecklistActivity.f1988D;
                d1.d.e(hVar, "row");
                checklistActivity.getClass();
                if (intValue >= 0) {
                    boolean z2 = !hVar.f694b;
                    hVar.f694b = z2;
                    C.g gVar = checklistActivity.f1993z;
                    if (gVar == null) {
                        d1.d.h("repository");
                        throw null;
                    }
                    r rVar = checklistActivity.f1989A;
                    if (rVar == null) {
                        d1.d.h("trip");
                        throw null;
                    }
                    String str = hVar.f693a;
                    d1.d.e(str, "itemName");
                    ((SharedPreferences) gVar.f115b).edit().putBoolean(C.g.D(rVar, str), z2).apply();
                    g gVar2 = checklistActivity.f1990B;
                    if (gVar2 == null) {
                        d1.d.h("adapter");
                        throw null;
                    }
                    gVar2.f2262a.c(intValue);
                    checklistActivity.v();
                }
                return R0.f.f780c;
            default:
                int i3 = ChecklistActivity.f1988D;
                d1.d.e(hVar, "row");
                checklistActivity.getClass();
                if (intValue >= 0 && hVar.f695c) {
                    C.g gVar3 = checklistActivity.f1993z;
                    if (gVar3 == null) {
                        d1.d.h("repository");
                        throw null;
                    }
                    r rVar2 = checklistActivity.f1989A;
                    if (rVar2 == null) {
                        d1.d.h("trip");
                        throw null;
                    }
                    String str2 = hVar.f693a;
                    d1.d.e(str2, "itemName");
                    LinkedHashSet linkedHashSet = new LinkedHashSet(gVar3.z(rVar2));
                    linkedHashSet.remove(str2);
                    SharedPreferences sharedPreferences = (SharedPreferences) gVar3.f115b;
                    sharedPreferences.edit().putStringSet(C.g.v(rVar2), linkedHashSet).apply();
                    sharedPreferences.edit().remove(C.g.D(rVar2, str2)).apply();
                    ArrayList arrayList = checklistActivity.f1991C;
                    if (arrayList == null) {
                        d1.d.h("rows");
                        throw null;
                    }
                    arrayList.remove(intValue);
                    g gVar4 = checklistActivity.f1990B;
                    if (gVar4 == null) {
                        d1.d.h("adapter");
                        throw null;
                    }
                    gVar4.f2262a.e(intValue);
                    checklistActivity.v();
                }
                return R0.f.f780c;
        }
    }
}
