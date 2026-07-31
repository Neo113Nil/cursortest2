package androidx.appcompat.app;

import java.util.LinkedHashSet;
import java.util.Locale;

/* loaded from: classes.dex */
abstract class w {
    private static androidx.core.os.i a(androidx.core.os.i iVar, androidx.core.os.i iVar2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i4 = 0;
        while (i4 < iVar.f() + iVar2.f()) {
            Locale c4 = i4 < iVar.f() ? iVar.c(i4) : iVar2.c(i4 - iVar.f());
            if (c4 != null) {
                linkedHashSet.add(c4);
            }
            i4++;
        }
        return androidx.core.os.i.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    static androidx.core.os.i b(androidx.core.os.i iVar, androidx.core.os.i iVar2) {
        return (iVar == null || iVar.e()) ? androidx.core.os.i.d() : a(iVar, iVar2);
    }
}
