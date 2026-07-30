package com.chicken.road.whale.store;

import d6.z;
import e6.n;
import f7.f;
import h6.d;
import i6.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import r6.k;
import z6.b;
import z6.h;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class MealRepository {
    public static final int $stable = 8;
    private final f groceries;
    private final GroceryDao groceryDao;
    private final MealDao mealDao;
    private final f meals;
    private final PlanDao planDao;
    private final f planEntries;

    public MealRepository(MealDao mealDao, PlanDao planDao, GroceryDao groceryDao) {
        k.f(mealDao, "mealDao");
        k.f(planDao, "planDao");
        k.f(groceryDao, "groceryDao");
        this.mealDao = mealDao;
        this.planDao = planDao;
        this.groceryDao = groceryDao;
        this.meals = mealDao.observeAll();
        this.planEntries = planDao.observeAll();
        this.groceries = groceryDao.observeAll();
    }

    public final Object addGrocery(String str, d dVar) {
        Object insert = this.groceryDao.insert(new GroceryItem(0L, str, false, true, 1, null), dVar);
        return insert == a.f4956f ? insert : z.f2639a;
    }

    public final Object addMeal(String str, String str2, String str3, String str4, d dVar) {
        return this.mealDao.insert(new Meal(0L, str, str2, str3, str4, 1, null), dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0081, code lost:
    
        if (r1.insert(r9, r4) != r8) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object assign(int i7, String str, long j8, d dVar) {
        MealRepository$assign$1 mealRepository$assign$1;
        int i8;
        int i9;
        String str2;
        long j9;
        MealRepository mealRepository;
        if (dVar instanceof MealRepository$assign$1) {
            mealRepository$assign$1 = (MealRepository$assign$1) dVar;
            int i10 = mealRepository$assign$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                mealRepository$assign$1.label = i10 - Integer.MIN_VALUE;
                Object obj = mealRepository$assign$1.result;
                i8 = mealRepository$assign$1.label;
                a aVar = a.f4956f;
                if (i8 != 0) {
                    d6.a.e(obj);
                    PlanDao planDao = this.planDao;
                    mealRepository$assign$1.L$0 = this;
                    mealRepository$assign$1.L$1 = str;
                    mealRepository$assign$1.I$0 = i7;
                    mealRepository$assign$1.J$0 = j8;
                    mealRepository$assign$1.label = 1;
                    if (planDao.clearSlot(i7, str, mealRepository$assign$1) != aVar) {
                        i9 = i7;
                        str2 = str;
                        j9 = j8;
                        mealRepository = this;
                    }
                    return aVar;
                }
                if (i8 != 1) {
                    if (i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                    return z.f2639a;
                }
                long j10 = mealRepository$assign$1.J$0;
                int i11 = mealRepository$assign$1.I$0;
                String str3 = (String) mealRepository$assign$1.L$1;
                mealRepository = (MealRepository) mealRepository$assign$1.L$0;
                d6.a.e(obj);
                j9 = j10;
                i9 = i11;
                str2 = str3;
                PlanDao planDao2 = mealRepository.planDao;
                PlanEntry planEntry = new PlanEntry(0L, i9, str2, j9, 1, null);
                mealRepository$assign$1.L$0 = null;
                mealRepository$assign$1.L$1 = null;
                mealRepository$assign$1.label = 2;
            }
        }
        mealRepository$assign$1 = new MealRepository$assign$1(this, dVar);
        Object obj2 = mealRepository$assign$1.result;
        i8 = mealRepository$assign$1.label;
        a aVar2 = a.f4956f;
        if (i8 != 0) {
        }
        PlanDao planDao22 = mealRepository.planDao;
        PlanEntry planEntry2 = new PlanEntry(0L, i9, str2, j9, 1, null);
        mealRepository$assign$1.L$0 = null;
        mealRepository$assign$1.L$1 = null;
        mealRepository$assign$1.label = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x01fc, code lost:
    
        if (r15.insert(r17, r2) == r12) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x011c, code lost:
    
        if (r1 == r12) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d5 A[LOOP:1: B:52:0x00cf->B:54:0x00d5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x018f -> B:14:0x01ff). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x019f -> B:14:0x01ff). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x01fc -> B:14:0x01ff). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0122 -> B:29:0x00fb). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object buildGroceryFromWeek(d dVar) {
        MealRepository$buildGroceryFromWeek$1 mealRepository$buildGroceryFromWeek$1;
        int i7;
        a aVar;
        MealRepository mealRepository;
        GroceryDao groceryDao;
        MealRepository mealRepository2;
        List list;
        MealRepository mealRepository3;
        Iterator it;
        Iterator it2;
        MealRepository mealRepository4;
        Set set;
        Iterator it3;
        Iterator it4;
        if (dVar instanceof MealRepository$buildGroceryFromWeek$1) {
            mealRepository$buildGroceryFromWeek$1 = (MealRepository$buildGroceryFromWeek$1) dVar;
            int i8 = mealRepository$buildGroceryFromWeek$1.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                mealRepository$buildGroceryFromWeek$1.label = i8 - Integer.MIN_VALUE;
                Object obj = mealRepository$buildGroceryFromWeek$1.result;
                i7 = mealRepository$buildGroceryFromWeek$1.label;
                int i9 = 0;
                int i10 = 10;
                int i11 = 4;
                aVar = a.f4956f;
                if (i7 != 0) {
                    d6.a.e(obj);
                    PlanDao planDao = this.planDao;
                    mealRepository$buildGroceryFromWeek$1.L$0 = this;
                    mealRepository$buildGroceryFromWeek$1.label = 1;
                    obj = planDao.all(mealRepository$buildGroceryFromWeek$1);
                    if (obj != aVar) {
                        mealRepository = this;
                    }
                    return aVar;
                }
                if (i7 == 1) {
                    mealRepository = (MealRepository) mealRepository$buildGroceryFromWeek$1.L$0;
                    d6.a.e(obj);
                } else {
                    if (i7 == 2) {
                        list = (List) mealRepository$buildGroceryFromWeek$1.L$1;
                        mealRepository2 = (MealRepository) mealRepository$buildGroceryFromWeek$1.L$0;
                        d6.a.e(obj);
                        GroceryDao groceryDao2 = mealRepository2.groceryDao;
                        mealRepository$buildGroceryFromWeek$1.L$0 = mealRepository2;
                        mealRepository$buildGroceryFromWeek$1.L$1 = list;
                        mealRepository$buildGroceryFromWeek$1.label = 3;
                        obj = groceryDao2.names(mealRepository$buildGroceryFromWeek$1);
                        if (obj != aVar) {
                            mealRepository3 = mealRepository2;
                            Iterable iterable = (Iterable) obj;
                            ArrayList arrayList = new ArrayList(n.a0(iterable, 10));
                            it = iterable.iterator();
                            while (it.hasNext()) {
                            }
                            LinkedHashSet linkedHashSet = new LinkedHashSet(arrayList);
                            it2 = list.iterator();
                            mealRepository4 = mealRepository3;
                            set = linkedHashSet;
                            if (it2.hasNext()) {
                            }
                        }
                        return aVar;
                    }
                    if (i7 == 3) {
                        list = (List) mealRepository$buildGroceryFromWeek$1.L$1;
                        mealRepository3 = (MealRepository) mealRepository$buildGroceryFromWeek$1.L$0;
                        d6.a.e(obj);
                        Iterable iterable2 = (Iterable) obj;
                        ArrayList arrayList2 = new ArrayList(n.a0(iterable2, 10));
                        it = iterable2.iterator();
                        while (it.hasNext()) {
                            String lowerCase = h.W((String) it.next()).toString().toLowerCase(Locale.ROOT);
                            k.e(lowerCase, "toLowerCase(...)");
                            arrayList2.add(lowerCase);
                        }
                        LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList2);
                        it2 = list.iterator();
                        mealRepository4 = mealRepository3;
                        set = linkedHashSet2;
                        if (it2.hasNext()) {
                        }
                    } else if (i7 == 4) {
                        it2 = (Iterator) mealRepository$buildGroceryFromWeek$1.L$2;
                        set = (Set) mealRepository$buildGroceryFromWeek$1.L$1;
                        mealRepository4 = (MealRepository) mealRepository$buildGroceryFromWeek$1.L$0;
                        d6.a.e(obj);
                        Meal meal = (Meal) obj;
                        if (meal != null) {
                            String ingredients = meal.getIngredients();
                            String[] strArr = {","};
                            k.f(ingredients, "<this>");
                            String str = strArr[i9];
                            if (str.length() == 0) {
                                e6.z zVar = new e6.z(1, h.L(ingredients, strArr));
                                ArrayList arrayList3 = new ArrayList(n.a0(zVar, i10));
                                Iterator it5 = zVar.iterator();
                                while (true) {
                                    b bVar = (b) it5;
                                    if (!bVar.hasNext()) {
                                        break;
                                    }
                                    arrayList3.add(h.R(ingredients, (w6.d) bVar.next()));
                                }
                                Iterator it6 = it2;
                                it3 = arrayList3.iterator();
                                it4 = it6;
                            } else {
                                Iterator it7 = it2;
                                it3 = h.P(ingredients, str).iterator();
                                it4 = it7;
                            }
                            if (it3.hasNext()) {
                            }
                        }
                        if (it2.hasNext()) {
                        }
                    } else {
                        if (i7 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it3 = (Iterator) mealRepository$buildGroceryFromWeek$1.L$3;
                        Iterator it8 = (Iterator) mealRepository$buildGroceryFromWeek$1.L$2;
                        Set set2 = (Set) mealRepository$buildGroceryFromWeek$1.L$1;
                        MealRepository mealRepository5 = (MealRepository) mealRepository$buildGroceryFromWeek$1.L$0;
                        d6.a.e(obj);
                        it4 = it8;
                        set = set2;
                        mealRepository4 = mealRepository5;
                        i9 = 0;
                        i10 = 10;
                        i11 = 4;
                        if (it3.hasNext()) {
                            String obj2 = h.W((String) it3.next()).toString();
                            if (obj2.length() != 0) {
                                Locale locale = Locale.ROOT;
                                String lowerCase2 = obj2.toLowerCase(locale);
                                k.e(lowerCase2, "toLowerCase(...)");
                                if (!set.contains(lowerCase2)) {
                                    set.add(lowerCase2);
                                    GroceryDao groceryDao3 = mealRepository4.groceryDao;
                                    if (obj2.length() > 0) {
                                        StringBuilder sb = new StringBuilder();
                                        String valueOf = String.valueOf(obj2.charAt(i9));
                                        k.d(valueOf, "null cannot be cast to non-null type java.lang.String");
                                        String upperCase = valueOf.toUpperCase(locale);
                                        k.e(upperCase, "toUpperCase(...)");
                                        sb.append((Object) upperCase);
                                        String substring = obj2.substring(1);
                                        k.e(substring, "substring(...)");
                                        sb.append(substring);
                                        obj2 = sb.toString();
                                    }
                                    GroceryItem groceryItem = new GroceryItem(0L, obj2, false, false, 1, null);
                                    mealRepository$buildGroceryFromWeek$1.L$0 = mealRepository4;
                                    mealRepository$buildGroceryFromWeek$1.L$1 = set;
                                    mealRepository$buildGroceryFromWeek$1.L$2 = it4;
                                    mealRepository$buildGroceryFromWeek$1.L$3 = it3;
                                    mealRepository$buildGroceryFromWeek$1.label = 5;
                                }
                            }
                            i9 = 0;
                            i10 = 10;
                            i11 = 4;
                            if (it3.hasNext()) {
                                it2 = it4;
                                if (it2.hasNext()) {
                                    return z.f2639a;
                                }
                                PlanEntry planEntry = (PlanEntry) it2.next();
                                MealDao mealDao = mealRepository4.mealDao;
                                long mealId = planEntry.getMealId();
                                mealRepository$buildGroceryFromWeek$1.L$0 = mealRepository4;
                                mealRepository$buildGroceryFromWeek$1.L$1 = set;
                                mealRepository$buildGroceryFromWeek$1.L$2 = it2;
                                mealRepository$buildGroceryFromWeek$1.L$3 = null;
                                mealRepository$buildGroceryFromWeek$1.label = i11;
                                obj = mealDao.byId(mealId, mealRepository$buildGroceryFromWeek$1);
                            }
                        }
                    }
                }
                List list2 = (List) obj;
                groceryDao = mealRepository.groceryDao;
                mealRepository$buildGroceryFromWeek$1.L$0 = mealRepository;
                mealRepository$buildGroceryFromWeek$1.L$1 = list2;
                mealRepository$buildGroceryFromWeek$1.label = 2;
                if (groceryDao.clearGenerated(mealRepository$buildGroceryFromWeek$1) != aVar) {
                    mealRepository2 = mealRepository;
                    list = list2;
                    GroceryDao groceryDao22 = mealRepository2.groceryDao;
                    mealRepository$buildGroceryFromWeek$1.L$0 = mealRepository2;
                    mealRepository$buildGroceryFromWeek$1.L$1 = list;
                    mealRepository$buildGroceryFromWeek$1.label = 3;
                    obj = groceryDao22.names(mealRepository$buildGroceryFromWeek$1);
                    if (obj != aVar) {
                    }
                }
                return aVar;
            }
        }
        mealRepository$buildGroceryFromWeek$1 = new MealRepository$buildGroceryFromWeek$1(this, dVar);
        Object obj3 = mealRepository$buildGroceryFromWeek$1.result;
        i7 = mealRepository$buildGroceryFromWeek$1.label;
        int i92 = 0;
        int i102 = 10;
        int i112 = 4;
        aVar = a.f4956f;
        if (i7 != 0) {
        }
        List list22 = (List) obj3;
        groceryDao = mealRepository.groceryDao;
        mealRepository$buildGroceryFromWeek$1.L$0 = mealRepository;
        mealRepository$buildGroceryFromWeek$1.L$1 = list22;
        mealRepository$buildGroceryFromWeek$1.label = 2;
        if (groceryDao.clearGenerated(mealRepository$buildGroceryFromWeek$1) != aVar) {
        }
        return aVar;
    }

    public final Object clearChecked(d dVar) {
        Object clearChecked = this.groceryDao.clearChecked(dVar);
        return clearChecked == a.f4956f ? clearChecked : z.f2639a;
    }

    public final Object clearSlot(int i7, String str, d dVar) {
        Object clearSlot = this.planDao.clearSlot(i7, str, dVar);
        return clearSlot == a.f4956f ? clearSlot : z.f2639a;
    }

    public final Object deleteGrocery(GroceryItem groceryItem, d dVar) {
        Object delete = this.groceryDao.delete(groceryItem, dVar);
        return delete == a.f4956f ? delete : z.f2639a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
    
        if (r9.delete(r8, r0) != r4) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object deleteMeal(Meal meal, d dVar) {
        MealRepository$deleteMeal$1 mealRepository$deleteMeal$1;
        int i7;
        MealRepository mealRepository;
        if (dVar instanceof MealRepository$deleteMeal$1) {
            mealRepository$deleteMeal$1 = (MealRepository$deleteMeal$1) dVar;
            int i8 = mealRepository$deleteMeal$1.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                mealRepository$deleteMeal$1.label = i8 - Integer.MIN_VALUE;
                Object obj = mealRepository$deleteMeal$1.result;
                i7 = mealRepository$deleteMeal$1.label;
                a aVar = a.f4956f;
                if (i7 != 0) {
                    d6.a.e(obj);
                    PlanDao planDao = this.planDao;
                    long id = meal.getId();
                    mealRepository$deleteMeal$1.L$0 = this;
                    mealRepository$deleteMeal$1.L$1 = meal;
                    mealRepository$deleteMeal$1.label = 1;
                    if (planDao.clearForMeal(id, mealRepository$deleteMeal$1) != aVar) {
                        mealRepository = this;
                    }
                    return aVar;
                }
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                    return z.f2639a;
                }
                meal = (Meal) mealRepository$deleteMeal$1.L$1;
                mealRepository = (MealRepository) mealRepository$deleteMeal$1.L$0;
                d6.a.e(obj);
                MealDao mealDao = mealRepository.mealDao;
                mealRepository$deleteMeal$1.L$0 = null;
                mealRepository$deleteMeal$1.L$1 = null;
                mealRepository$deleteMeal$1.label = 2;
            }
        }
        mealRepository$deleteMeal$1 = new MealRepository$deleteMeal$1(this, dVar);
        Object obj2 = mealRepository$deleteMeal$1.result;
        i7 = mealRepository$deleteMeal$1.label;
        a aVar2 = a.f4956f;
        if (i7 != 0) {
        }
        MealDao mealDao2 = mealRepository.mealDao;
        mealRepository$deleteMeal$1.L$0 = null;
        mealRepository$deleteMeal$1.L$1 = null;
        mealRepository$deleteMeal$1.label = 2;
    }

    public final f getGroceries() {
        return this.groceries;
    }

    public final f getMeals() {
        return this.meals;
    }

    public final f getPlanEntries() {
        return this.planEntries;
    }

    public final Object toggleGrocery(GroceryItem groceryItem, d dVar) {
        Object update = this.groceryDao.update(GroceryItem.copy$default(groceryItem, 0L, null, !groceryItem.getChecked(), false, 11, null), dVar);
        return update == a.f4956f ? update : z.f2639a;
    }

    public final Object updateMeal(Meal meal, d dVar) {
        Object update = this.mealDao.update(meal, dVar);
        return update == a.f4956f ? update : z.f2639a;
    }
}
