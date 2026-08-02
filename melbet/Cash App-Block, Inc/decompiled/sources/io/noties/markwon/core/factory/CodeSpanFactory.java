package io.noties.markwon.core.factory;

import io.noties.markwon.LinkResolverDef;
import io.noties.markwon.MarkwonConfiguration;
import io.noties.markwon.RenderPropsImpl;
import io.noties.markwon.core.CoreProps;
import io.noties.markwon.core.MarkwonTheme;
import io.noties.markwon.core.spans.BlockQuoteSpan;
import io.noties.markwon.core.spans.BulletListItemSpan;
import io.noties.markwon.core.spans.CodeBlockSpan;
import io.noties.markwon.core.spans.CodeSpan;
import io.noties.markwon.core.spans.EmphasisSpan;
import io.noties.markwon.core.spans.HeadingSpan;
import io.noties.markwon.core.spans.LinkSpan;
import io.noties.markwon.core.spans.OrderedListItemSpan;

/* loaded from: classes9.dex */
public final class CodeSpanFactory {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ CodeSpanFactory(int i) {
        this.$r8$classId = i;
    }

    public final Object getSpans(MarkwonConfiguration markwonConfiguration, RenderPropsImpl renderPropsImpl) {
        switch (this.$r8$classId) {
            case 0:
                return new CodeSpan((MarkwonTheme) markwonConfiguration.theme, 0);
            case 1:
                return new BlockQuoteSpan((MarkwonTheme) markwonConfiguration.theme, 0);
            case 2:
                return new CodeBlockSpan((MarkwonTheme) markwonConfiguration.theme);
            case 3:
                return new EmphasisSpan(0);
            case 4:
                return new HeadingSpan((MarkwonTheme) markwonConfiguration.theme, ((Integer) CoreProps.HEADING_LEVEL.require(renderPropsImpl)).intValue());
            case 5:
                return new LinkSpan((MarkwonTheme) markwonConfiguration.theme, (String) CoreProps.LINK_DESTINATION.require(renderPropsImpl), (LinkResolverDef) markwonConfiguration.linkResolver);
            case 6:
                MarkwonTheme markwonTheme = (MarkwonTheme) markwonConfiguration.theme;
                return CoreProps.ListItemType.BULLET == CoreProps.LIST_ITEM_TYPE.require(renderPropsImpl) ? new BulletListItemSpan(markwonTheme, ((Integer) CoreProps.BULLET_LIST_ITEM_LEVEL.require(renderPropsImpl)).intValue()) : new OrderedListItemSpan(markwonTheme, String.valueOf(CoreProps.ORDERED_LIST_ITEM_NUMBER.require(renderPropsImpl)).concat(". "));
            case 7:
                return new EmphasisSpan(1);
            default:
                return new BlockQuoteSpan((MarkwonTheme) markwonConfiguration.theme, 1);
        }
    }
}
