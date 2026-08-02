package defpackage;

import android.accounts.Account;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cpr {
    public final Account a;
    public final Set b;
    public final Set c;
    public final String d;
    public final String e;
    public final dcp f;
    public Integer g;
    private final Map h;

    public cpr(Account account, Set set, String str, String str2, dcp dcpVar) {
        this.a = account;
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        this.b = unmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.h = map;
        this.d = str;
        this.e = str2;
        this.f = dcpVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            Object obj = ((bst) it.next()).a;
            hashSet.addAll(null);
        }
        this.c = DesugarCollections.unmodifiableSet(hashSet);
    }
}
