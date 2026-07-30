package com.chicken.road.whale.store;

import androidx.room.s;
import r6.k;
import y3.a;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
final class SeedCallback extends s {
    public static final SeedCallback INSTANCE = new SeedCallback();

    private SeedCallback() {
    }

    private static final void onCreate$grocery(a aVar, String str) {
        aVar.B("INSERT INTO grocery_items (name, checked, manual) VALUES (?, 0, 1)", new Object[]{str});
    }

    private static final void onCreate$meal(a aVar, String str, String str2, String str3, String str4) {
        aVar.B("INSERT INTO meals (name, category, ingredients, notes) VALUES (?, ?, ?, ?)", new Object[]{str, str2, str3, str4});
    }

    private static final void onCreate$plan(a aVar, int i7, String str, int i8) {
        aVar.B("INSERT INTO plan_entries (dayIndex, slot, mealId) VALUES (?, ?, ?)", new Object[]{Integer.valueOf(i7), str, Integer.valueOf(i8)});
    }

    @Override // androidx.room.s
    public void onCreate(a aVar) {
        k.f(aVar, "db");
        onCreate$meal(aVar, "Avocado Toast", "Breakfast", "bread, avocado, eggs, lemon, chili flakes", "Quick and filling");
        onCreate$meal(aVar, "Greek Salad", "Salad", "cucumber, tomato, feta, olives, red onion, olive oil", "");
        onCreate$meal(aVar, "Chicken Stir-Fry", "Main", "chicken, bell pepper, broccoli, soy sauce, garlic, rice", "20 min on high heat");
        onCreate$meal(aVar, "Tomato Basil Soup", "Soup", "tomatoes, basil, onion, garlic, cream, stock", "");
        onCreate$meal(aVar, "Veggie Pasta", "Main", "pasta, zucchini, tomato, parmesan, olive oil, garlic", "");
        onCreate$meal(aVar, "Overnight Oats", "Breakfast", "oats, milk, yogurt, honey, berries, chia seeds", "Prep the night before");
        onCreate$plan(aVar, 0, "Breakfast", 6);
        onCreate$plan(aVar, 0, "Dinner", 3);
        onCreate$plan(aVar, 1, "Lunch", 2);
        onCreate$plan(aVar, 2, "Dinner", 5);
        onCreate$plan(aVar, 3, "Breakfast", 1);
        onCreate$plan(aVar, 4, "Dinner", 4);
        onCreate$grocery(aVar, "Olive oil");
        onCreate$grocery(aVar, "Coffee");
    }
}
