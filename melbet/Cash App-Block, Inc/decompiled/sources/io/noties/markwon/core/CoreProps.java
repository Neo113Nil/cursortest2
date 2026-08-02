package io.noties.markwon.core;

import io.noties.markwon.Prop;

/* loaded from: classes9.dex */
public abstract class CoreProps {
    public static final Prop LIST_ITEM_TYPE = new Prop("list-item-type");
    public static final Prop BULLET_LIST_ITEM_LEVEL = new Prop("bullet-list-item-level");
    public static final Prop ORDERED_LIST_ITEM_NUMBER = new Prop("ordered-list-item-number");
    public static final Prop HEADING_LEVEL = new Prop("heading-level");
    public static final Prop LINK_DESTINATION = new Prop("link-destination");
    public static final Prop PARAGRAPH_IS_IN_TIGHT_LIST = new Prop("paragraph-is-in-tight-list");
    public static final Prop CODE_BLOCK_INFO = new Prop("code-block-info");

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ListItemType {
        public static final /* synthetic */ ListItemType[] $VALUES;
        public static final ListItemType BULLET;
        public static final ListItemType ORDERED;

        static {
            ListItemType listItemType = new ListItemType("BULLET", 0);
            BULLET = listItemType;
            ListItemType listItemType2 = new ListItemType("ORDERED", 1);
            ORDERED = listItemType2;
            $VALUES = new ListItemType[]{listItemType, listItemType2};
        }

        public static ListItemType valueOf(String str) {
            return (ListItemType) Enum.valueOf(ListItemType.class, str);
        }

        public static ListItemType[] values() {
            return (ListItemType[]) $VALUES.clone();
        }
    }
}
