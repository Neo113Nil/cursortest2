package com.squareup.protos.lending.sync_values;

import com.google.android.gms.internal.mlkit_vision_face.zzjg;
import com.squareup.protos.lending.sync_values.BorrowAppletBulletinsTile;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class BorrowAppletBulletinsTile$Data$Bulletin$Routing$InfoSheet extends zzjg {
    public final BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet value;

    public BorrowAppletBulletinsTile$Data$Bulletin$Routing$InfoSheet(BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet infoSheet) {
        infoSheet.getClass();
        this.value = infoSheet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BorrowAppletBulletinsTile$Data$Bulletin$Routing$InfoSheet) && Intrinsics.areEqual(this.value, ((BorrowAppletBulletinsTile$Data$Bulletin$Routing$InfoSheet) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "InfoSheet(value=" + this.value + ")";
    }
}
