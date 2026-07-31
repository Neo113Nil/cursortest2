package com.onevcat.uniwebview;

import com.imaginationoverflow.unity.referrer.BuildConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.random.Random;
import kotlin.ranges.CharRange;
import kotlin.ranges.IntRange;

/* loaded from: classes.dex */
public abstract class u {
    public static final String a(StringCompanionObject stringCompanionObject) {
        Intrinsics.checkNotNullParameter(stringCompanionObject, "<this>");
        List plus = CollectionsKt.plus((Collection) CollectionsKt.plus((Iterable) new CharRange('A', 'Z'), (Iterable) new CharRange('a', 'z')), (Iterable) new CharRange('0', '9'));
        IntRange intRange = new IntRange(1, 8);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
        Iterator<Integer> it = intRange.iterator();
        while (it.hasNext()) {
            ((IntIterator) it).nextInt();
            arrayList.add(Character.valueOf(((Character) CollectionsKt.random(plus, Random.INSTANCE)).charValue()));
        }
        return CollectionsKt.joinToString$default(arrayList, BuildConfig.FLAVOR, null, null, 0, null, null, 62, null);
    }
}
