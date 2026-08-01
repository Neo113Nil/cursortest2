package P0;

import java.util.List;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final List f705a = S0.h.y0("Sunscreen", "Swimsuit", "Flip Flops", "Towel", "Sunglasses", "Beach Hat", "Snorkel", "Water Bottle", "Passport", "Phone Charger");

    /* renamed from: b, reason: collision with root package name */
    public static final List f706b = S0.h.y0("Hiking Boots", "Jacket", "Climbing Rope", "Water Bottle", "Trail Map", "Backpack", "Gloves", "Headlamp", "First Aid Kit", "Compass");

    /* renamed from: c, reason: collision with root package name */
    public static final List f707c = S0.h.y0("Laptop", "Charger", "Suit", "Passport", "Notebook", "Tie", "Business Cards", "Phone", "Power Bank", "Folder");

    public static List a(r rVar) {
        d1.d.e(rVar, "trip");
        int ordinal = rVar.ordinal();
        if (ordinal == 0) {
            return f705a;
        }
        if (ordinal == 1) {
            return f706b;
        }
        if (ordinal == 2) {
            return f707c;
        }
        throw new R0.b();
    }

    public static String b(r rVar) {
        d1.d.e(rVar, "trip");
        int ordinal = rVar.ordinal();
        if (ordinal == 0) {
            return "Sea Trip";
        }
        if (ordinal == 1) {
            return "Mountain Trip";
        }
        if (ordinal == 2) {
            return "Business Trip";
        }
        throw new R0.b();
    }
}
