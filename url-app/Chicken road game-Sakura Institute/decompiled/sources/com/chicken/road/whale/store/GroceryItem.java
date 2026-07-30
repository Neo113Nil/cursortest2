package com.chicken.road.whale.store;

import a0.m;
import r6.e;
import r6.i;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class GroceryItem {
    public static final int $stable = 0;
    private final boolean checked;
    private final long id;
    private final boolean manual;
    private final String name;

    public GroceryItem(long j8, String str, boolean z8, boolean z9) {
        k.f(str, "name");
        this.id = j8;
        this.name = str;
        this.checked = z8;
        this.manual = z9;
    }

    public static /* synthetic */ GroceryItem copy$default(GroceryItem groceryItem, long j8, String str, boolean z8, boolean z9, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j8 = groceryItem.id;
        }
        long j9 = j8;
        if ((i7 & 2) != 0) {
            str = groceryItem.name;
        }
        String str2 = str;
        if ((i7 & 4) != 0) {
            z8 = groceryItem.checked;
        }
        boolean z10 = z8;
        if ((i7 & 8) != 0) {
            z9 = groceryItem.manual;
        }
        return groceryItem.copy(j9, str2, z10, z9);
    }

    public final long component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final boolean component3() {
        return this.checked;
    }

    public final boolean component4() {
        return this.manual;
    }

    public final GroceryItem copy(long j8, String str, boolean z8, boolean z9) {
        k.f(str, "name");
        return new GroceryItem(j8, str, z8, z9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroceryItem)) {
            return false;
        }
        GroceryItem groceryItem = (GroceryItem) obj;
        return this.id == groceryItem.id && k.a(this.name, groceryItem.name) && this.checked == groceryItem.checked && this.manual == groceryItem.manual;
    }

    public final boolean getChecked() {
        return this.checked;
    }

    public final long getId() {
        return this.id;
    }

    public final boolean getManual() {
        return this.manual;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return Boolean.hashCode(this.manual) + m.e(i.a(Long.hashCode(this.id) * 31, 31, this.name), 31, this.checked);
    }

    public String toString() {
        return "GroceryItem(id=" + this.id + ", name=" + this.name + ", checked=" + this.checked + ", manual=" + this.manual + ")";
    }

    public /* synthetic */ GroceryItem(long j8, String str, boolean z8, boolean z9, int i7, e eVar) {
        this((i7 & 1) != 0 ? 0L : j8, str, (i7 & 4) != 0 ? false : z8, (i7 & 8) != 0 ? true : z9);
    }
}
