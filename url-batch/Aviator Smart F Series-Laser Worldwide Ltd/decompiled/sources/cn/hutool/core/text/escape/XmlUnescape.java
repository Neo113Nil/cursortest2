package cn.hutool.core.text.escape;

import cn.hutool.core.text.replacer.LookupReplacer;
import cn.hutool.core.text.replacer.ReplacerChain;
import cn.hutool.core.text.replacer.StrReplacer;
import cn.hutool.core.util.i1;

/* loaded from: classes.dex */
public class XmlUnescape extends ReplacerChain {
    protected static final String[][] BASIC_UNESCAPE = a.invert(XmlEscape.BASIC_ESCAPE);
    protected static final String[][] OTHER_UNESCAPE = {new String[]{i1.APOS, "'"}};
    private static final long serialVersionUID = 1;

    public XmlUnescape() {
        super(new StrReplacer[0]);
        addChain((StrReplacer) new LookupReplacer(BASIC_UNESCAPE));
        addChain((StrReplacer) new NumericEntityUnescaper());
        addChain((StrReplacer) new LookupReplacer(OTHER_UNESCAPE));
    }
}
