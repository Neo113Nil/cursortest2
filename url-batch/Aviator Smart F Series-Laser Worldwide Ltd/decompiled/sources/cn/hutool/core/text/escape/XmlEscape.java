package cn.hutool.core.text.escape;

import cn.hutool.core.text.replacer.LookupReplacer;
import cn.hutool.core.text.replacer.ReplacerChain;
import cn.hutool.core.text.replacer.StrReplacer;
import cn.hutool.core.util.i1;

/* loaded from: classes.dex */
public class XmlEscape extends ReplacerChain {
    protected static final String[][] BASIC_ESCAPE = {new String[]{"\"", i1.QUOTE}, new String[]{"&", i1.AMP}, new String[]{"<", i1.LT}, new String[]{">", i1.GT}};
    private static final long serialVersionUID = 1;

    public XmlEscape() {
        super(new StrReplacer[0]);
        addChain((StrReplacer) new LookupReplacer(BASIC_ESCAPE));
    }
}
