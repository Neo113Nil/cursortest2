package com.manholeroboramprush.cardestroy.data.database;

import a1.b;
import a4.j;
import h9.c;
import hd.h;
import hd.q;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.j0;
import wd.c0;
import z4.f;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010\r\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\u00100\u000eH\u0014J\u0016\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u000f0\u0012H\u0016J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00102\u001a\u0010\u0016\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u000f\u0012\u0004\u0012\u00020\u00130\u000eH\u0016J\b\u0010\u0017\u001a\u00020\u0006H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000Ê\u0001\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0018"}, d2 = {"Lcom/manholeroboramprush/cardestroy/data/database/RecipeVault_Impl;", "Lcom/manholeroboramprush/cardestroy/data/database/RecipeVault;", "<init>", "()V", "_trophyShelf", "Lkotlin/Lazy;", "Lcom/manholeroboramprush/cardestroy/data/database/TrophyShelf;", "createOpenDelegate", "Landroidx/room/RoomOpenDelegate;", "createInvalidationTracker", "Landroidx/room/InvalidationTracker;", "clearAllTables", "", "getRequiredTypeConverterClasses", "", "Lkotlin/reflect/KClass;", "", "getRequiredAutoMigrationSpecClasses", "", "Landroidx/room/migration/AutoMigrationSpec;", "createAutoMigrations", "Landroidx/room/migration/Migration;", "autoMigrationSpecs", "accessTrophies", "app", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, j.LONG_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RecipeVault_Impl extends RecipeVault {

    /* renamed from: l, reason: collision with root package name */
    public final q f3195l = h.b(new b(11, this));

    @Override // z4.u
    public final List d(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // z4.u
    public final f e() {
        return new f(this, new LinkedHashMap(), new LinkedHashMap(), "high_scores");
    }

    @Override // z4.u
    public final c4.h f() {
        return new h9.b(this);
    }

    @Override // z4.u
    public final Set l() {
        return new LinkedHashSet();
    }

    @Override // z4.u
    public final LinkedHashMap n() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(c0.a(c.class), j0.f5574d);
        return linkedHashMap;
    }

    @Override // com.manholeroboramprush.cardestroy.data.database.RecipeVault
    public final c w() {
        return (c) this.f3195l.getValue();
    }
}
