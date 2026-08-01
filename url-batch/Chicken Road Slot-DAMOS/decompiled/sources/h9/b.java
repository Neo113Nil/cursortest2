package h9;

import c4.h;
import c7.p0;
import com.manholeroboramprush.cardestroy.data.database.RecipeVault_Impl;
import e5.k;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import z4.w;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b extends h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ RecipeVault_Impl f4492d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(RecipeVault_Impl recipeVault_Impl) {
        super(1, "1edfeee12f5936b1cf7abb73ac31ee8d", "40d9a8a94794e935466501f135fe81fe");
        this.f4492d = recipeVault_Impl;
    }

    @Override // c4.h
    public final void a(i5.a aVar) {
        aVar.getClass();
        g8.b.y(aVar, "CREATE TABLE IF NOT EXISTS `high_scores` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `date` TEXT NOT NULL, `score` INTEGER NOT NULL)");
        g8.b.y(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        g8.b.y(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '1edfeee12f5936b1cf7abb73ac31ee8d')");
    }

    @Override // c4.h
    public final void b(i5.a aVar) {
        aVar.getClass();
        g8.b.y(aVar, "DROP TABLE IF EXISTS `high_scores`");
    }

    @Override // c4.h
    public final void c(i5.a aVar) {
        aVar.getClass();
    }

    @Override // c4.h
    public final void d(i5.a aVar) {
        aVar.getClass();
        this.f4492d.r(aVar);
    }

    @Override // c4.h
    public final void e(i5.a aVar) {
        aVar.getClass();
    }

    @Override // c4.h
    public final void f(i5.a aVar) {
        aVar.getClass();
        cf.c.r(aVar);
    }

    @Override // c4.h
    public final p0 g(i5.a aVar) {
        aVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("id", new e5.h("id", "INTEGER", true, 1, null, 1));
        linkedHashMap.put("date", new e5.h("date", "TEXT", true, 0, null, 1));
        linkedHashMap.put("score", new e5.h("score", "INTEGER", true, 0, null, 1));
        k kVar = new k("high_scores", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
        k H = w.H(aVar, "high_scores");
        if (kVar.equals(H)) {
            return new p0(true, (String) null, 2);
        }
        return new p0(false, "high_scores(com.manholeroboramprush.cardestroy.data.database.MedalEntry).\n Expected:\n" + kVar + "\n Found:\n" + H, 2);
    }
}
