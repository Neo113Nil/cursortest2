package com.squareup.cash.wallet.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class TagFormFactor {
    public static final /* synthetic */ TagFormFactor[] $VALUES;
    public static final TagFormFactor HEART;
    public static final TagFormFactor HEART_FIRST_EDITION;
    public static final TagFormFactor MINI_CARD;
    public static final TagFormFactor MINI_CARD_FIRST_EDITION;
    public static final TagFormFactor WAND;
    public static final TagFormFactor WAND_FIRST_EDITION;

    static {
        TagFormFactor tagFormFactor = new TagFormFactor("WAND", 0);
        WAND = tagFormFactor;
        TagFormFactor tagFormFactor2 = new TagFormFactor("HEART", 1);
        HEART = tagFormFactor2;
        TagFormFactor tagFormFactor3 = new TagFormFactor("MINI_CARD", 2);
        MINI_CARD = tagFormFactor3;
        TagFormFactor tagFormFactor4 = new TagFormFactor("WAND_FIRST_EDITION", 3);
        WAND_FIRST_EDITION = tagFormFactor4;
        TagFormFactor tagFormFactor5 = new TagFormFactor("HEART_FIRST_EDITION", 4);
        HEART_FIRST_EDITION = tagFormFactor5;
        TagFormFactor tagFormFactor6 = new TagFormFactor("MINI_CARD_FIRST_EDITION", 5);
        MINI_CARD_FIRST_EDITION = tagFormFactor6;
        $VALUES = new TagFormFactor[]{tagFormFactor, tagFormFactor2, tagFormFactor3, tagFormFactor4, tagFormFactor5, tagFormFactor6};
    }

    public static TagFormFactor valueOf(String str) {
        return (TagFormFactor) Enum.valueOf(TagFormFactor.class, str);
    }

    public static TagFormFactor[] values() {
        return (TagFormFactor[]) $VALUES.clone();
    }
}
