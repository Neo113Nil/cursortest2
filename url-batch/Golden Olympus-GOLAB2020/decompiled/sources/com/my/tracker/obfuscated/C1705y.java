package com.my.tracker.obfuscated;

import android.util.SparseArray;
import java.util.ArrayList;

/* renamed from: com.my.tracker.obfuscated.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1705y {

    /* renamed from: a, reason: collision with root package name */
    final SparseArray f21576a = new SparseArray(50);

    private InterfaceC1693v c(int i4) {
        C1701x c1701x = new C1701x(i4);
        this.f21576a.put(i4, c1701x);
        return c1701x;
    }

    public ArrayList a() {
        AbstractC1708y2.a("TimeSpentCore: CountBasedTimeSpentsManager: onTick: start collecting count based TimeSpents");
        int size = this.f21576a.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add((InterfaceC1697w) this.f21576a.valueAt(i4));
        }
        this.f21576a.clear();
        AbstractC1708y2.a("TimeSpentCore: CountBasedTimeSpentsManager: onTick: collected " + arrayList.size() + " count based TimeSpents");
        return arrayList;
    }

    public void b(int i4) {
        InterfaceC1693v interfaceC1693v = (InterfaceC1693v) this.f21576a.get(i4);
        if (interfaceC1693v != null) {
            AbstractC1708y2.a("TimeSpentCore: CountBasedTimeSpentsManager: found existed count based record with id = " + i4);
        } else {
            AbstractC1708y2.a("TimeSpentCore: CountBasedTimeSpentsManager: not found existed count based record with id = " + i4 + ", creating new");
            interfaceC1693v = c(i4);
        }
        interfaceC1693v.f();
        AbstractC1708y2.c("TimeSpent: incremented count based TimeSpent, id = " + i4 + ", count = " + interfaceC1693v.d());
    }

    public boolean a(int i4) {
        return this.f21576a.get(i4) != null;
    }
}
