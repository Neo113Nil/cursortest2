package com.yandex.mobile.ads.impl;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.n2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2103n2 {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yandex.mobile.ads.impl.n2$a */
    static final class a implements Comparator<ss> {
        @Override // java.util.Comparator
        public final int compare(ss ssVar, ss ssVar2) {
            ss first = ssVar;
            ss second = ssVar2;
            Intrinsics.checkNotNullParameter(first, "first");
            Intrinsics.checkNotNullParameter(second, "second");
            return (int) kotlin.ranges.g.l(first.b().b() - second.b().b(), -1L, 1L);
        }
    }
}
