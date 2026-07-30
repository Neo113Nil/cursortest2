package defpackage;

import java.util.List;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class c2 {
    public static final List a;

    static {
        d2 d2Var = new d2("first_dash", "First Jump", "Start the first run", e2.d, 1, 50);
        d2 d2Var2 = new d2("first_victory", "Safe Jump", "Save feathers for the first time", e2.e, 1, 100);
        e2 e2Var = e2.g;
        d2 d2Var3 = new d2("dash_5_sections", "Tiny Jumper", "Jump over 5 cars in one run", e2Var, 5, 100);
        d2 d2Var4 = new d2("dash_15_sections", "Car Jumper", "Jump over 15 cars in one run", e2Var, 15, 200);
        d2 d2Var5 = new d2("dash_30_sections", "Feather Jumper", "Jump over 30 cars in one run", e2Var, 30, 400);
        e2 e2Var2 = e2.h;
        d2 d2Var6 = new d2("earn_500_feathers", "Golden Start", "Earn 500 golden feathers total", e2Var2, 500, 150);
        d2 d2Var7 = new d2("earn_2000_feathers", "Feather Hoarder", "Earn 2,000 golden feathers total", e2Var2, 2000, 300);
        d2 d2Var8 = new d2("hard_victory", "Brave Bird", "Finish a Victory run on Hard", e2.i, 1, 250);
        d2 d2Var9 = new d2("daily_claim_3", "Daily Habit", "Claim daily reward 3 times", e2.j, 3, 150);
        d2 d2Var10 = new d2("daily_claim_7", "Full Streak", "Complete a full 7-day streak", e2.k, 1, 400);
        e2 e2Var3 = e2.l;
        a = zh.e(d2Var, d2Var2, d2Var3, d2Var4, d2Var5, d2Var6, d2Var7, d2Var8, d2Var9, d2Var10, new d2("attempts_10", "Persistent Rooster", "Finish 10 attempts", e2Var3, 10, 200), new d2("attempts_20", "Jump Veteran", "Finish 20 attempts", e2Var3, 20, 350));
    }
}
