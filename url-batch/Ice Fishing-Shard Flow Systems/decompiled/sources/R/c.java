package R;

import A0.j;
import R5.i;
import R5.q;
import S.k;
import S.l;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final l f2361a;

    /* renamed from: b, reason: collision with root package name */
    public final k f2362b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f2363c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2364d;

    /* renamed from: e, reason: collision with root package name */
    public final q f2365e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f2366f;

    public c(Context context, String sharedPreferencesName, Set keysToMigrate, l shouldRunMigration, k migrate) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
        Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        Intrinsics.checkNotNullParameter(shouldRunMigration, "shouldRunMigration");
        Intrinsics.checkNotNullParameter(migrate, "migrate");
        j jVar = new j(context, 2, sharedPreferencesName);
        this.f2361a = shouldRunMigration;
        this.f2362b = migrate;
        this.f2363c = context;
        this.f2364d = sharedPreferencesName;
        this.f2365e = i.b(jVar);
        this.f2366f = keysToMigrate == d.f2367a ? null : CollectionsKt.B(keysToMigrate);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        if (r5.isEmpty() == false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, X5.c cVar) {
        b bVar;
        Object obj2;
        int i2;
        c cVar2;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i5 = bVar.f2360l;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                bVar.f2360l = i5 - Integer.MIN_VALUE;
                obj2 = bVar.f2358e;
                W5.a aVar = W5.a.f2787d;
                i2 = bVar.f2360l;
                boolean z7 = true;
                if (i2 != 0) {
                    V6.b.P(obj2);
                    bVar.f2357d = this;
                    bVar.f2360l = 1;
                    obj2 = this.f2361a.invoke(obj, bVar);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                    cVar2 = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar2 = bVar.f2357d;
                    V6.b.P(obj2);
                }
                if (((Boolean) obj2).booleanValue()) {
                    return Boolean.FALSE;
                }
                LinkedHashSet linkedHashSet = cVar2.f2366f;
                q qVar = cVar2.f2365e;
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
                    z7 = false;
                    return Boolean.valueOf(z7);
                }
                Map<String, ?> all = ((SharedPreferences) qVar.getValue()).getAll();
                Intrinsics.checkNotNullExpressionValue(all, "sharedPrefs.all");
            }
        }
        bVar = new b(this, cVar);
        obj2 = bVar.f2358e;
        W5.a aVar2 = W5.a.f2787d;
        i2 = bVar.f2360l;
        boolean z72 = true;
        if (i2 != 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
        }
    }
}
