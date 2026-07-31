package com.google.firebase.util;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.E;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.e;
import kotlin.ranges.IntRange;
import kotlin.ranges.g;
import kotlin.text.StringsKt;

@Metadata
/* loaded from: classes.dex */
public final class RandomUtilKt {
    private static final String ALPHANUMERIC_ALPHABET = "23456789abcdefghjkmnpqrstvwxyz";

    private static /* synthetic */ void getALPHANUMERIC_ALPHABET$annotations() {
    }

    public static final String nextAlphanumericString(e eVar, int i4) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        if (i4 < 0) {
            throw new IllegalArgumentException(("invalid length: " + i4).toString());
        }
        IntRange p4 = g.p(0, i4);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(p4, 10));
        Iterator it = p4.iterator();
        while (it.hasNext()) {
            ((E) it).a();
            arrayList.add(Character.valueOf(StringsKt.f1(ALPHANUMERIC_ALPHABET, eVar)));
        }
        return CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
    }
}
