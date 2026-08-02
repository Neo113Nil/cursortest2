package defpackage;

import com.google.android.libraries.onegoogle.accountmenu.cards.db.CardsDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ebk extends aka {
    final /* synthetic */ CardsDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ebk(CardsDatabase_Impl cardsDatabase_Impl) {
        super(4, "cf66d89d29f160a56452e1ec819be807", "c5e7d25a0e7030289897dda2ecd46001");
        this.d = cardsDatabase_Impl;
    }

    @Override // defpackage.aka
    public final void a(ana anaVar) {
        yj.o(anaVar, "CREATE TABLE IF NOT EXISTS `StorageCardDecorationState` (`accountIdentifier` TEXT NOT NULL, `storageState` TEXT NOT NULL, `lastDecorationConsumedTime` INTEGER NOT NULL, `totalTimesConsumed` INTEGER NOT NULL, PRIMARY KEY(`accountIdentifier`))");
        yj.o(anaVar, "CREATE TABLE IF NOT EXISTS `BackupSyncCardDecorationState` (`accountIdentifier` TEXT NOT NULL, `backupSyncState` TEXT NOT NULL, `lastDecorationConsumedTime` INTEGER NOT NULL, `totalTimesConsumed` INTEGER NOT NULL, PRIMARY KEY(`accountIdentifier`))");
        yj.o(anaVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        yj.o(anaVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'cf66d89d29f160a56452e1ec819be807')");
    }

    @Override // defpackage.aka
    public final void b(ana anaVar) {
        yj.o(anaVar, "DROP TABLE IF EXISTS `StorageCardDecorationState`");
        yj.o(anaVar, "DROP TABLE IF EXISTS `BackupSyncCardDecorationState`");
    }

    @Override // defpackage.aka
    public final void c(ana anaVar) {
        this.d.t(anaVar);
    }

    @Override // defpackage.aka
    public final void d(ana anaVar) {
        abf.h(anaVar);
    }

    @Override // defpackage.aka
    public final jxu g(ana anaVar) {
        HashMap hashMap = new HashMap(4);
        hashMap.put("accountIdentifier", new alv("accountIdentifier", "TEXT", true, 1, null, 1));
        hashMap.put("storageState", new alv("storageState", "TEXT", true, 0, null, 1));
        hashMap.put("lastDecorationConsumedTime", new alv("lastDecorationConsumedTime", "INTEGER", true, 0, null, 1));
        hashMap.put("totalTimesConsumed", new alv("totalTimesConsumed", "INTEGER", true, 0, null, 1));
        aly alyVar = new aly("StorageCardDecorationState", hashMap, new HashSet(0), new HashSet(0));
        aly d = afn.d(anaVar, "StorageCardDecorationState");
        if (!ajz.h(alyVar, d)) {
            return new jxu(false, "StorageCardDecorationState(com.google.android.libraries.onegoogle.accountmenu.cards.db.StorageCardDecorationState).\n Expected:\n" + ajz.f(alyVar) + "\n Found:\n" + ajz.f(d));
        }
        HashMap hashMap2 = new HashMap(4);
        hashMap2.put("accountIdentifier", new alv("accountIdentifier", "TEXT", true, 1, null, 1));
        hashMap2.put("backupSyncState", new alv("backupSyncState", "TEXT", true, 0, null, 1));
        hashMap2.put("lastDecorationConsumedTime", new alv("lastDecorationConsumedTime", "INTEGER", true, 0, null, 1));
        hashMap2.put("totalTimesConsumed", new alv("totalTimesConsumed", "INTEGER", true, 0, null, 1));
        aly alyVar2 = new aly("BackupSyncCardDecorationState", hashMap2, new HashSet(0), new HashSet(0));
        aly d2 = afn.d(anaVar, "BackupSyncCardDecorationState");
        if (ajz.h(alyVar2, d2)) {
            return new jxu(true, (String) null);
        }
        return new jxu(false, "BackupSyncCardDecorationState(com.google.android.libraries.onegoogle.accountmenu.cards.db.BackupSyncCardDecorationState).\n Expected:\n" + ajz.f(alyVar2) + "\n Found:\n" + ajz.f(d2));
    }

    @Override // defpackage.aka
    public final void e() {
    }

    @Override // defpackage.aka
    public final void f() {
    }
}
