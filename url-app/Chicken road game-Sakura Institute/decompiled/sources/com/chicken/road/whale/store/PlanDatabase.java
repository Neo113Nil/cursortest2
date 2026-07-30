package com.chicken.road.whale.store;

import android.app.ActivityManager;
import android.content.Context;
import androidx.room.g;
import androidx.room.u;
import b6.c;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import m4.f;
import r6.e;
import r6.k;
import z6.h;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class PlanDatabase extends u {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    /* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final PlanDatabase build(Context context) {
            String str;
            k.f(context, "context");
            if (h.G("platora.db")) {
                throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            c cVar = new c(4);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            SeedCallback seedCallback = SeedCallback.INSTANCE;
            k.f(seedCallback, "callback");
            arrayList.add(seedCallback);
            f fVar = new f();
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            g gVar = new g(context, fVar, cVar, arrayList, (activityManager == null || activityManager.isLowRamDevice()) ? 2 : 3, linkedHashSet, arrayList2, arrayList3);
            Package r02 = PlanDatabase.class.getPackage();
            k.c(r02);
            String name = r02.getName();
            String canonicalName = PlanDatabase.class.getCanonicalName();
            k.c(canonicalName);
            k.e(name, "fullPackage");
            if (name.length() != 0) {
                canonicalName = canonicalName.substring(name.length() + 1);
                k.e(canonicalName, "this as java.lang.String).substring(startIndex)");
            }
            String replace = canonicalName.replace('.', '_');
            k.e(replace, "replace(...)");
            String concat = replace.concat("_Impl");
            try {
                if (name.length() == 0) {
                    str = concat;
                } else {
                    str = name + '.' + concat;
                }
                Class<?> cls = Class.forName(str, true, PlanDatabase.class.getClassLoader());
                k.d(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
                u uVar = (u) cls.getDeclaredConstructor(null).newInstance(null);
                uVar.init(gVar);
                return (PlanDatabase) uVar;
            } catch (ClassNotFoundException unused) {
                throw new RuntimeException("Cannot find implementation for " + PlanDatabase.class.getCanonicalName() + ". " + concat + " does not exist");
            } catch (IllegalAccessException unused2) {
                throw new RuntimeException("Cannot access the constructor " + PlanDatabase.class.getCanonicalName());
            } catch (InstantiationException unused3) {
                throw new RuntimeException("Failed to create an instance of " + PlanDatabase.class.getCanonicalName());
            }
        }

        private Companion() {
        }
    }

    public abstract GroceryDao groceryDao();

    public abstract MealDao mealDao();

    public abstract PlanDao planDao();
}
