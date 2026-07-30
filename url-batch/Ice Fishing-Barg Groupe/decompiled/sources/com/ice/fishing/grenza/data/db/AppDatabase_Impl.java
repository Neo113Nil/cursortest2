package com.ice.fishing.grenza.data.db;

import com.ice.fishing.grenza.data.db.AppDatabase_Impl;
import defpackage.ae0;
import defpackage.bg0;
import defpackage.bu1;
import defpackage.ck;
import defpackage.l9;
import defpackage.ns0;
import defpackage.p50;
import defpackage.qc2;
import defpackage.us0;
import defpackage.v40;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class AppDatabase_Impl extends AppDatabase {
    public final qc2 dgRBjINgWbAK;
    public final qc2 x50lh2ztY7Y5;

    public AppDatabase_Impl() {
        final int i = 0;
        this.dgRBjINgWbAK = new qc2(new ae0(this) { // from class: k9
            public final /* synthetic */ AppDatabase_Impl OPXfSBeufaJ8;

            {
                this.OPXfSBeufaJ8 = this;
            }

            @Override // defpackage.ae0
            public final Object PxuCJdSBwIXG() {
                int i2 = i;
                AppDatabase_Impl appDatabase_Impl = this.OPXfSBeufaJ8;
                switch (i2) {
                    case 0:
                        return new us0(appDatabase_Impl);
                    default:
                        return new bg0(appDatabase_Impl);
                }
            }
        });
        final int i2 = 1;
        this.x50lh2ztY7Y5 = new qc2(new ae0(this) { // from class: k9
            public final /* synthetic */ AppDatabase_Impl OPXfSBeufaJ8;

            {
                this.OPXfSBeufaJ8 = this;
            }

            @Override // defpackage.ae0
            public final Object PxuCJdSBwIXG() {
                int i22 = i2;
                AppDatabase_Impl appDatabase_Impl = this.OPXfSBeufaJ8;
                switch (i22) {
                    case 0:
                        return new us0(appDatabase_Impl);
                    default:
                        return new bg0(appDatabase_Impl);
                }
            }
        });
    }

    @Override // defpackage.ex1
    public final List PxuCJdSBwIXG(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // defpackage.ex1
    public final v40 TSizfFm2Yiuu() {
        return new l9(this);
    }

    @Override // defpackage.ex1
    public final LinkedHashMap a92UlCVFR9N8() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ck PxuCJdSBwIXG = bu1.PxuCJdSBwIXG(us0.class);
        us0.Companion.getClass();
        p50 p50Var = p50.rtx2ld2ELZv4;
        linkedHashMap.put(PxuCJdSBwIXG, p50Var);
        ck PxuCJdSBwIXG2 = bu1.PxuCJdSBwIXG(bg0.class);
        bg0.Companion.getClass();
        linkedHashMap.put(PxuCJdSBwIXG2, p50Var);
        return linkedHashMap;
    }

    @Override // com.ice.fishing.grenza.data.db.AppDatabase
    public final bg0 dgRBjINgWbAK() {
        return (bg0) this.x50lh2ztY7Y5.getValue();
    }

    @Override // defpackage.ex1
    public final Set e9gEMXR7LXtO() {
        return new LinkedHashSet();
    }

    @Override // defpackage.ex1
    public final ns0 lS5Rgt96tfkO() {
        return new ns0(this, new LinkedHashMap(), new LinkedHashMap(), "items", "gate_config");
    }

    @Override // com.ice.fishing.grenza.data.db.AppDatabase
    public final us0 x50lh2ztY7Y5() {
        return (us0) this.dgRBjINgWbAK.getValue();
    }
}
