package com.crrepa.x1;

import java.util.Comparator;

/* loaded from: classes3.dex */
public class f implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    private static final String f14023a = "gif";

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(i iVar, i iVar2) {
        int length;
        int length2;
        int compare;
        if (iVar.c().equals(f14023a) && iVar2.c().equals(f14023a)) {
            if (iVar.b().length != iVar2.b().length) {
                length = iVar.b().length;
                length2 = iVar2.b().length;
                compare = Integer.compare(length, length2);
            }
            compare = iVar.d().compareTo(iVar2.d());
        } else {
            if (iVar.c().equals(f14023a)) {
                return 1;
            }
            if (iVar2.c().equals(f14023a)) {
                return -1;
            }
            if (iVar.b().length != iVar2.b().length) {
                length = iVar.b().length;
                length2 = iVar2.b().length;
                compare = Integer.compare(length, length2);
            }
            compare = iVar.d().compareTo(iVar2.d());
        }
        return compare * (-1);
    }
}
