package io.noties.markwon.core;

import io.noties.markwon.o;

/* loaded from: classes4.dex */
public abstract class CoreProps {
    public static final o LIST_ITEM_TYPE = o.of("list-item-type");
    public static final o BULLET_LIST_ITEM_LEVEL = o.of("bullet-list-item-level");
    public static final o ORDERED_LIST_ITEM_NUMBER = o.of("ordered-list-item-number");
    public static final o HEADING_LEVEL = o.of("heading-level");
    public static final o LINK_DESTINATION = o.of("link-destination");
    public static final o PARAGRAPH_IS_IN_TIGHT_LIST = o.of("paragraph-is-in-tight-list");
    public static final o CODE_BLOCK_INFO = o.of("code-block-info");

    public enum ListItemType {
        BULLET,
        ORDERED
    }

    private CoreProps() {
    }
}
