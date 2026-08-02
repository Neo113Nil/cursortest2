package com.squareup.util.emojis;

import com.squareup.cash.arcade.Emojis;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.ArrayIterator;

/* loaded from: classes6.dex */
public final class EmojiEmbeddedImageResolver {
    public static final ArrayList supportedEmoji;

    static {
        EnumEntriesList enumEntriesList = Emojis.$ENTRIES;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(enumEntriesList, 10));
        ArrayIterator arrayIterator = new ArrayIterator(enumEntriesList);
        while (arrayIterator.hasNext()) {
            arrayList.add(((Emojis) arrayIterator.next()).id);
        }
        supportedEmoji = arrayList;
    }
}
