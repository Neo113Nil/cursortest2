package com.google.android.libraries.onegoogle.accountmenu.cards.db;

import defpackage.ajk;
import defpackage.akb;
import defpackage.ebj;
import defpackage.ebk;
import defpackage.ebl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CardsDatabase_Impl extends CardsDatabase {
    @Override // defpackage.ajw
    public final ajk a() {
        return new ajk(this, new HashMap(0), new HashMap(0), "StorageCardDecorationState", "BackupSyncCardDecorationState");
    }

    @Override // defpackage.ajw
    public final /* synthetic */ akb c() {
        return new ebk(this);
    }

    @Override // defpackage.ajw
    protected final Map h() {
        HashMap hashMap = new HashMap();
        hashMap.put(ebl.class, Collections.EMPTY_LIST);
        hashMap.put(ebj.class, Collections.EMPTY_LIST);
        return hashMap;
    }

    @Override // defpackage.ajw
    public final Set j() {
        return new HashSet();
    }

    @Override // defpackage.ajw
    public final List u() {
        return new ArrayList();
    }
}
