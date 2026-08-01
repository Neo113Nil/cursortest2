package z3;

import a4.k;
import a4.l;
import android.content.Context;
import android.content.SharedPreferences;
import hd.h;
import hd.q;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final l f10694a;

    /* renamed from: b, reason: collision with root package name */
    public final k f10695b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f10696c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10697d;

    /* renamed from: e, reason: collision with root package name */
    public final q f10698e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f10699f;

    public b(Context context, String str, Set set, l lVar, k kVar) {
        context.getClass();
        set.getClass();
        a4.a aVar = new a4.a(15, context, str);
        this.f10694a = lVar;
        this.f10695b = kVar;
        this.f10696c = context;
        this.f10697d = str;
        this.f10698e = h.b(aVar);
        this.f10699f = set == c.f10700a ? null : CollectionsKt.S(set);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (r6.isEmpty() == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, nd.c cVar) {
        a aVar;
        Object obj2;
        int i3;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i10 = aVar.f10693i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f10693i = i10 - Integer.MIN_VALUE;
                obj2 = aVar.f10691d;
                md.a aVar2 = md.a.f6622d;
                i3 = aVar.f10693i;
                boolean z10 = true;
                if (i3 != 0) {
                    cf.c.M(obj2);
                    aVar.f10693i = 1;
                    obj2 = this.f10694a.invoke(obj, aVar);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj2);
                }
                if (((Boolean) obj2).booleanValue()) {
                    return Boolean.FALSE;
                }
                LinkedHashSet linkedHashSet = this.f10699f;
                q qVar = this.f10698e;
                if (linkedHashSet != null) {
                    SharedPreferences sharedPreferences = (SharedPreferences) qVar.getValue();
                    if (!linkedHashSet.isEmpty()) {
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            if (sharedPreferences.contains((String) it.next())) {
                                break;
                            }
                        }
                    }
                    z10 = false;
                    return Boolean.valueOf(z10);
                }
                Map<String, ?> all = ((SharedPreferences) qVar.getValue()).getAll();
                all.getClass();
            }
        }
        aVar = new a(this, cVar);
        obj2 = aVar.f10691d;
        md.a aVar22 = md.a.f6622d;
        i3 = aVar.f10693i;
        boolean z102 = true;
        if (i3 != 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
        }
    }
}
