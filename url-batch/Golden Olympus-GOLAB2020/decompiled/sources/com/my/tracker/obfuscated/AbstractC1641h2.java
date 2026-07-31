package com.my.tracker.obfuscated;

import android.util.SparseArray;
import java.util.ArrayList;

/* renamed from: com.my.tracker.obfuscated.h2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1641h2 {

    /* renamed from: a, reason: collision with root package name */
    final SparseArray f21360a = new SparseArray(20);

    /* renamed from: b, reason: collision with root package name */
    final SparseArray f21361b = new SparseArray(20);

    final ArrayList a() {
        int size = this.f21361b.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add((InterfaceC1633f2) this.f21361b.valueAt(i4));
        }
        return arrayList;
    }

    public final int b() {
        return this.f21360a.size();
    }

    final String a(boolean z4) {
        return z4 ? "[FOREGROUND] " : "[BACKGROUND] ";
    }

    public final boolean b(int i4) {
        return this.f21360a.get(i4) != null;
    }

    final InterfaceC1629e2 a(int i4) {
        InterfaceC1629e2 interfaceC1629e2 = (InterfaceC1629e2) this.f21361b.get(i4);
        if (interfaceC1629e2 != null) {
            return interfaceC1629e2;
        }
        C1637g2 c1637g2 = new C1637g2(i4);
        this.f21361b.put(i4, c1637g2);
        return c1637g2;
    }

    final void a(long j4) {
        for (int i4 = 0; i4 < this.f21360a.size(); i4++) {
            ((InterfaceC1695v1) this.f21360a.valueAt(i4)).b(j4);
        }
    }
}
