package com.winpower.neonfit.data;

import W0.i;
import a1.d;
import android.content.Context;
import b1.EnumC0098a;
import c1.AbstractC0106c;
import c1.InterfaceC0108e;
import j1.e;
import j1.h;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import u1.b;
import u1.c;

/* loaded from: classes.dex */
public final class NutritionRepository {
    public static final Companion Companion = new Companion(null);
    private static volatile NutritionRepository instance;
    private final FoodDao dao;
    private final UserPreferences prefs;
    private final UserPreferences userPreferences;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final NutritionRepository getInstance(Context context) {
            h.e(context, "context");
            NutritionRepository nutritionRepository = NutritionRepository.instance;
            if (nutritionRepository == null) {
                synchronized (this) {
                    nutritionRepository = NutritionRepository.instance;
                    if (nutritionRepository == null) {
                        Context applicationContext = context.getApplicationContext();
                        h.d(applicationContext, "getApplicationContext(...)");
                        nutritionRepository = new NutritionRepository(applicationContext);
                        NutritionRepository.instance = nutritionRepository;
                    }
                }
            }
            return nutritionRepository;
        }

        private Companion() {
        }
    }

    public NutritionRepository(Context context) {
        h.e(context, "context");
        this.dao = AppDatabase.Companion.getInstance(context).foodDao();
        UserPreferences userPreferences = new UserPreferences(context);
        this.prefs = userPreferences;
        this.userPreferences = userPreferences;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DailyTotals totalsFrom(List<FoodEntry> list) {
        int i = 0;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        for (FoodEntry foodEntry : list) {
            i += foodEntry.getCalories();
            f2 += foodEntry.getProtein();
            f3 += foodEntry.getFat();
            f4 += foodEntry.getCarbs();
        }
        return new DailyTotals(i, f2, f3, f4);
    }

    public final Object deleteFood(FoodEntry foodEntry, d dVar) {
        Object delete = this.dao.delete(foodEntry, dVar);
        return delete == EnumC0098a.f2223a ? delete : i.f1345a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getTodayTotals(d dVar) {
        NutritionRepository$getTodayTotals$1 nutritionRepository$getTodayTotals$1;
        int i;
        NutritionRepository nutritionRepository;
        if (dVar instanceof NutritionRepository$getTodayTotals$1) {
            nutritionRepository$getTodayTotals$1 = (NutritionRepository$getTodayTotals$1) dVar;
            int i2 = nutritionRepository$getTodayTotals$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nutritionRepository$getTodayTotals$1.label = i2 - Integer.MIN_VALUE;
                NutritionRepository$getTodayTotals$1 nutritionRepository$getTodayTotals$12 = nutritionRepository$getTodayTotals$1;
                Object obj = nutritionRepository$getTodayTotals$12.result;
                EnumC0098a enumC0098a = EnumC0098a.f2223a;
                i = nutritionRepository$getTodayTotals$12.label;
                if (i != 0) {
                    H1.d.i0(obj);
                    FoodDao foodDao = this.dao;
                    Calendar calendar = Calendar.getInstance();
                    calendar.set(11, 0);
                    calendar.set(12, 0);
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                    long timeInMillis = calendar.getTimeInMillis();
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.set(11, 0);
                    calendar2.set(12, 0);
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                    calendar2.add(6, 1);
                    long timeInMillis2 = calendar2.getTimeInMillis();
                    nutritionRepository$getTodayTotals$12.L$0 = this;
                    nutritionRepository$getTodayTotals$12.label = 1;
                    obj = foodDao.getEntriesBetween(timeInMillis, timeInMillis2, nutritionRepository$getTodayTotals$12);
                    if (obj == enumC0098a) {
                        return enumC0098a;
                    }
                    nutritionRepository = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    nutritionRepository = (NutritionRepository) nutritionRepository$getTodayTotals$12.L$0;
                    H1.d.i0(obj);
                }
                return nutritionRepository.totalsFrom((List) obj);
            }
        }
        nutritionRepository$getTodayTotals$1 = new NutritionRepository$getTodayTotals$1(this, dVar);
        NutritionRepository$getTodayTotals$1 nutritionRepository$getTodayTotals$122 = nutritionRepository$getTodayTotals$1;
        Object obj2 = nutritionRepository$getTodayTotals$122.result;
        EnumC0098a enumC0098a2 = EnumC0098a.f2223a;
        i = nutritionRepository$getTodayTotals$122.label;
        if (i != 0) {
        }
        return nutritionRepository.totalsFrom((List) obj2);
    }

    public final UserPreferences getUserPreferences() {
        return this.userPreferences;
    }

    public final Object insertFood(FoodEntry foodEntry, d dVar) {
        return this.dao.insert(foodEntry, dVar);
    }

    public final void markCrashShown() {
        UserPreferences userPreferences = this.prefs;
        Calendar calendar = Calendar.getInstance();
        userPreferences.setCrashShownDate(String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(5))}, 3)));
    }

    public final b observeTodayEntries() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        calendar2.add(6, 1);
        return this.dao.observeEntriesBetween(timeInMillis, calendar2.getTimeInMillis());
    }

    public final b observeTodayTotals() {
        final b observeTodayEntries = observeTodayEntries();
        return new b() { // from class: com.winpower.neonfit.data.NutritionRepository$observeTodayTotals$$inlined$map$1

            /* renamed from: com.winpower.neonfit.data.NutritionRepository$observeTodayTotals$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements c {
                final /* synthetic */ c $this_unsafeFlow;
                final /* synthetic */ NutritionRepository this$0;

                @InterfaceC0108e(c = "com.winpower.neonfit.data.NutritionRepository$observeTodayTotals$$inlined$map$1$2", f = "NutritionRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.winpower.neonfit.data.NutritionRepository$observeTodayTotals$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends AbstractC0106c {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // c1.AbstractC0104a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(c cVar, NutritionRepository nutritionRepository) {
                    this.$this_unsafeFlow = cVar;
                    this.this$0 = nutritionRepository;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // u1.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    DailyTotals dailyTotals;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i2 = anonymousClass1.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            EnumC0098a enumC0098a = EnumC0098a.f2223a;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                H1.d.i0(obj2);
                                c cVar = this.$this_unsafeFlow;
                                dailyTotals = this.this$0.totalsFrom((List) obj);
                                anonymousClass1.label = 1;
                                if (cVar.emit(dailyTotals, anonymousClass1) == enumC0098a) {
                                    return enumC0098a;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                H1.d.i0(obj2);
                            }
                            return i.f1345a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    EnumC0098a enumC0098a2 = EnumC0098a.f2223a;
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return i.f1345a;
                }
            }

            @Override // u1.b
            public Object collect(c cVar, d dVar) {
                Object collect = b.this.collect(new AnonymousClass2(cVar, this), dVar);
                return collect == EnumC0098a.f2223a ? collect : i.f1345a;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object resetToday(d dVar) {
        NutritionRepository$resetToday$1 nutritionRepository$resetToday$1;
        int i;
        NutritionRepository nutritionRepository;
        if (dVar instanceof NutritionRepository$resetToday$1) {
            nutritionRepository$resetToday$1 = (NutritionRepository$resetToday$1) dVar;
            int i2 = nutritionRepository$resetToday$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nutritionRepository$resetToday$1.label = i2 - Integer.MIN_VALUE;
                NutritionRepository$resetToday$1 nutritionRepository$resetToday$12 = nutritionRepository$resetToday$1;
                Object obj = nutritionRepository$resetToday$12.result;
                EnumC0098a enumC0098a = EnumC0098a.f2223a;
                i = nutritionRepository$resetToday$12.label;
                if (i != 0) {
                    H1.d.i0(obj);
                    FoodDao foodDao = this.dao;
                    Calendar calendar = Calendar.getInstance();
                    calendar.set(11, 0);
                    calendar.set(12, 0);
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                    long timeInMillis = calendar.getTimeInMillis();
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.set(11, 0);
                    calendar2.set(12, 0);
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                    calendar2.add(6, 1);
                    long timeInMillis2 = calendar2.getTimeInMillis();
                    nutritionRepository$resetToday$12.L$0 = this;
                    nutritionRepository$resetToday$12.label = 1;
                    if (foodDao.deleteEntriesBetween(timeInMillis, timeInMillis2, nutritionRepository$resetToday$12) == enumC0098a) {
                        return enumC0098a;
                    }
                    nutritionRepository = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    nutritionRepository = (NutritionRepository) nutritionRepository$resetToday$12.L$0;
                    H1.d.i0(obj);
                }
                nutritionRepository.prefs.setCrashShownDate("");
                return i.f1345a;
            }
        }
        nutritionRepository$resetToday$1 = new NutritionRepository$resetToday$1(this, dVar);
        NutritionRepository$resetToday$1 nutritionRepository$resetToday$122 = nutritionRepository$resetToday$1;
        Object obj2 = nutritionRepository$resetToday$122.result;
        EnumC0098a enumC0098a2 = EnumC0098a.f2223a;
        i = nutritionRepository$resetToday$122.label;
        if (i != 0) {
        }
        nutritionRepository.prefs.setCrashShownDate("");
        return i.f1345a;
    }

    public final boolean shouldCelebrateCrash(int i) {
        if (!this.prefs.getCelebrateCrash() || i != this.prefs.getDailyCalorieGoal()) {
            return false;
        }
        String crashShownDate = this.prefs.getCrashShownDate();
        Calendar calendar = Calendar.getInstance();
        return !h.a(crashShownDate, String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(5))}, 3)));
    }
}
