package com.majelw.libystne.data;

import com.majelw.libystne.data.MaxLineDatabase_Impl;
import defpackage.ah0;
import defpackage.aj1;
import defpackage.d82;
import defpackage.gu;
import defpackage.hk;
import defpackage.xf0;
import defpackage.y91;
import defpackage.ya1;
import defpackage.z41;
import defpackage.z51;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class MaxLineDatabase_Impl extends MaxLineDatabase {
    public final y91 m;
    public final y91 n;

    public MaxLineDatabase_Impl() {
        final int i = 0;
        this.m = ya1.b(new Function0(this) { // from class: zi1
            public final /* synthetic */ MaxLineDatabase_Impl n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                MaxLineDatabase_Impl maxLineDatabase_Impl = this.n;
                switch (i2) {
                    case 0:
                        return new hk(maxLineDatabase_Impl);
                    default:
                        return new z51(maxLineDatabase_Impl);
                }
            }
        });
        final int i2 = 1;
        this.n = ya1.b(new Function0(this) { // from class: zi1
            public final /* synthetic */ MaxLineDatabase_Impl n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                MaxLineDatabase_Impl maxLineDatabase_Impl = this.n;
                switch (i22) {
                    case 0:
                        return new hk(maxLineDatabase_Impl);
                    default:
                        return new z51(maxLineDatabase_Impl);
                }
            }
        });
    }

    @Override // defpackage.lb2
    public final List a(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // defpackage.lb2
    public final z41 b() {
        return new z41(this, new LinkedHashMap(), new LinkedHashMap(), "atlas_entry", "atlas_progress", "jewelry_item", "item_stone");
    }

    @Override // defpackage.lb2
    public final xf0 c() {
        return new aj1(this);
    }

    @Override // defpackage.lb2
    public final Set e() {
        return new LinkedHashSet();
    }

    @Override // defpackage.lb2
    public final LinkedHashMap f() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        gu a = d82.a(hk.class);
        ah0 ah0Var = ah0.m;
        linkedHashMap.put(a, ah0Var);
        linkedHashMap.put(d82.a(z51.class), ah0Var);
        return linkedHashMap;
    }

    @Override // com.majelw.libystne.data.MaxLineDatabase
    public final hk j() {
        return (hk) this.m.getValue();
    }

    @Override // com.majelw.libystne.data.MaxLineDatabase
    public final z51 k() {
        return (z51) this.n.getValue();
    }
}
