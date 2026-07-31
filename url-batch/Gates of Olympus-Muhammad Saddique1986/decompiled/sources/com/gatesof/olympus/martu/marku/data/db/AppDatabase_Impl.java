package com.gatesof.olympus.martu.marku.data.db;

import A1.h;
import A1.i;
import B.C0011l;
import B.Y;
import G1.b;
import G1.g;
import G1.j;
import G1.m;
import com.gatesof.olympus.martu.marku.App;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import w1.q;
import z1.InterfaceC1263a;

/* loaded from: classes.dex */
public final class AppDatabase_Impl extends AppDatabase {

    /* renamed from: l, reason: collision with root package name */
    public volatile g f5625l;

    /* renamed from: m, reason: collision with root package name */
    public volatile m f5626m;

    @Override // w1.z
    public final q c() {
        return new q(this, new HashMap(0), new HashMap(0), "clients", "haircuts");
    }

    @Override // w1.z
    public final InterfaceC1263a d(G2.m mVar) {
        m mVar2 = new m((App) mVar.f2209e, "salon_ledger.db", new C0011l(mVar, new Y(this)));
        ((i) mVar.f2210f).getClass();
        return new h((App) mVar2.f2116b, (String) mVar2.f2117c, (C0011l) mVar2.f2118d);
    }

    @Override // w1.z
    public final List f(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // w1.z
    public final Set h() {
        return new HashSet();
    }

    @Override // w1.z
    public final Map i() {
        HashMap hashMap = new HashMap();
        hashMap.put(b.class, Collections.emptyList());
        hashMap.put(j.class, Collections.emptyList());
        return hashMap;
    }

    @Override // com.gatesof.olympus.martu.marku.data.db.AppDatabase
    public final b m() {
        g gVar;
        if (this.f5625l != null) {
            return this.f5625l;
        }
        synchronized (this) {
            try {
                if (this.f5625l == null) {
                    this.f5625l = new g(this);
                }
                gVar = this.f5625l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    @Override // com.gatesof.olympus.martu.marku.data.db.AppDatabase
    public final j n() {
        m mVar;
        if (this.f5626m != null) {
            return this.f5626m;
        }
        synchronized (this) {
            try {
                if (this.f5626m == null) {
                    this.f5626m = new m(this);
                }
                mVar = this.f5626m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mVar;
    }
}
