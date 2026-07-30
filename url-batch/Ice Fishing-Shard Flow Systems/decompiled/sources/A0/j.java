package A0;

import A6.AbstractC0091c;
import A6.u;
import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f73d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f74e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f75i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj, int i2, Object obj2) {
        super(0);
        this.f73d = i2;
        this.f74e = obj;
        this.f75i = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String[] names;
        switch (this.f73d) {
            case 0:
                ((B0.a) ((b) this.f74e).f57e).a((i) this.f75i);
                return Unit.f6114a;
            case 1:
                x6.e eVar = (x6.e) this.f74e;
                AbstractC0091c abstractC0091c = (AbstractC0091c) this.f75i;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                A6.j jVar = abstractC0091c.f97a;
                B6.m.h(abstractC0091c, eVar);
                int d7 = eVar.d();
                for (int i2 = 0; i2 < d7; i2++) {
                    List h7 = eVar.h(i2);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : h7) {
                        if (obj instanceof u) {
                            arrayList.add(obj);
                        }
                    }
                    Intrinsics.checkNotNullParameter(arrayList, "<this>");
                    u uVar = (u) (arrayList.size() == 1 ? arrayList.get(0) : null);
                    if (uVar != null && (names = uVar.names()) != null) {
                        for (String str : names) {
                            String str2 = Intrinsics.a(eVar.c(), x6.h.f8441c) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str)) {
                                throw new B6.l("The suggested name '" + str + "' for " + str2 + ' ' + eVar.e(i2) + " is already one of the names for " + str2 + ' ' + eVar.e(((Number) I.d(linkedHashMap, str)).intValue()) + " in " + eVar);
                            }
                            linkedHashMap.put(str, Integer.valueOf(i2));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? I.c() : linkedHashMap;
            case 2:
                SharedPreferences sharedPreferences = ((Context) this.f74e).getSharedPreferences((String) this.f75i, 0);
                Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
                return sharedPreferences;
            default:
                Context applicationContext = (Context) this.f74e;
                Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                String name = ((S.b) this.f75i).f2445a;
                Intrinsics.checkNotNullParameter(applicationContext, "<this>");
                Intrinsics.checkNotNullParameter(name, "name");
                String fileName = name + ".preferences_pb";
                Intrinsics.checkNotNullParameter(applicationContext, "<this>");
                Intrinsics.checkNotNullParameter(fileName, "fileName");
                return new File(applicationContext.getApplicationContext().getFilesDir(), r4.f.i("datastore/", fileName));
        }
    }
}
