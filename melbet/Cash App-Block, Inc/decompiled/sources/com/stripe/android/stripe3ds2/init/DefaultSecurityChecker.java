package com.stripe.android.stripe3ds2.init;

import com.stripe.android.stripe3ds2.init.SecurityCheck;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;

/* loaded from: classes8.dex */
public final class DefaultSecurityChecker {
    public static final List DEFAULT_CHECKS = CollectionsKt__CollectionsKt.listOf((Object[]) new SecurityCheck[]{new SecurityCheck.RootedCheck(SecurityCheck.RootedCheck.WARNING), new SecurityCheck.Tampered(SecurityCheck.Tampered.WARNING), new SecurityCheck.Emulator(SecurityCheck.Emulator.WARNING), new SecurityCheck.DebuggerAttached(), new SecurityCheck.UnsupportedOS(SecurityCheck.UnsupportedOS.WARNING)});
    public final List securityChecks;

    public DefaultSecurityChecker() {
        List list = DEFAULT_CHECKS;
        list.getClass();
        this.securityChecks = list;
    }

    public final ArrayList getWarnings() {
        List list = this.securityChecks;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((SecurityCheck) obj).check()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((SecurityCheck) it.next()).warning);
        }
        return arrayList2;
    }
}
