package com.squareup.protos.lending.sync_values;

import com.squareup.protos.lending.sync_values.BorrowAppletBulletinsTile;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class BorrowAppletBulletinsTile$Data$Bulletin$InfoSheet$Bullet$Icon$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.Bullet.Icon.Companion.getClass();
        if (i == 0) {
            return BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.Bullet.Icon.TIME;
        }
        if (i != 1) {
            return null;
        }
        return BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.Bullet.Icon.DEPOSIT;
    }
}
