package org.bouncycastle.util;

import java.util.Iterator;

/* loaded from: classes5.dex */
public interface k extends f {
    boolean add(String str);

    String get(int i8);

    @Override // org.bouncycastle.util.f, java.lang.Iterable
    /* synthetic */ Iterator iterator();

    int size();

    String[] toStringArray();

    String[] toStringArray(int i8, int i9);
}
