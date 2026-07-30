package com.chicken.road.whale.store;

import r6.e;
import r6.i;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class Meal {
    public static final int $stable = 0;
    private final String category;
    private final long id;
    private final String ingredients;
    private final String name;
    private final String notes;

    public Meal(long j8, String str, String str2, String str3, String str4) {
        k.f(str, "name");
        k.f(str2, "category");
        k.f(str3, "ingredients");
        k.f(str4, "notes");
        this.id = j8;
        this.name = str;
        this.category = str2;
        this.ingredients = str3;
        this.notes = str4;
    }

    public static /* synthetic */ Meal copy$default(Meal meal, long j8, String str, String str2, String str3, String str4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j8 = meal.id;
        }
        long j9 = j8;
        if ((i7 & 2) != 0) {
            str = meal.name;
        }
        String str5 = str;
        if ((i7 & 4) != 0) {
            str2 = meal.category;
        }
        String str6 = str2;
        if ((i7 & 8) != 0) {
            str3 = meal.ingredients;
        }
        String str7 = str3;
        if ((i7 & 16) != 0) {
            str4 = meal.notes;
        }
        return meal.copy(j9, str5, str6, str7, str4);
    }

    public final long component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.category;
    }

    public final String component4() {
        return this.ingredients;
    }

    public final String component5() {
        return this.notes;
    }

    public final Meal copy(long j8, String str, String str2, String str3, String str4) {
        k.f(str, "name");
        k.f(str2, "category");
        k.f(str3, "ingredients");
        k.f(str4, "notes");
        return new Meal(j8, str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Meal)) {
            return false;
        }
        Meal meal = (Meal) obj;
        return this.id == meal.id && k.a(this.name, meal.name) && k.a(this.category, meal.category) && k.a(this.ingredients, meal.ingredients) && k.a(this.notes, meal.notes);
    }

    public final String getCategory() {
        return this.category;
    }

    public final long getId() {
        return this.id;
    }

    public final String getIngredients() {
        return this.ingredients;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNotes() {
        return this.notes;
    }

    public int hashCode() {
        return this.notes.hashCode() + i.a(i.a(i.a(Long.hashCode(this.id) * 31, 31, this.name), 31, this.category), 31, this.ingredients);
    }

    public String toString() {
        return "Meal(id=" + this.id + ", name=" + this.name + ", category=" + this.category + ", ingredients=" + this.ingredients + ", notes=" + this.notes + ")";
    }

    public /* synthetic */ Meal(long j8, String str, String str2, String str3, String str4, int i7, e eVar) {
        this((i7 & 1) != 0 ? 0L : j8, str, str2, str3, (i7 & 16) != 0 ? "" : str4);
    }
}
