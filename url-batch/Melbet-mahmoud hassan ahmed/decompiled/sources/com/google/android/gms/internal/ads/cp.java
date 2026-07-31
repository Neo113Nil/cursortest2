package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes.dex */
final class cp implements Comparator<ip> {
    cp(ep epVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(ip ipVar, ip ipVar2) {
        ip ipVar3 = ipVar;
        ip ipVar4 = ipVar2;
        int i7 = ipVar3.f6733c - ipVar4.f6733c;
        return i7 != 0 ? i7 : (int) (ipVar3.f6731a - ipVar4.f6731a);
    }
}
