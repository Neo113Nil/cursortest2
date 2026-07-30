package cn.hutool.core.text.replacer;

import cn.hutool.core.lang.r;
import cn.hutool.core.text.StrBuilder;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public class ReplacerChain extends StrReplacer implements r {
    private static final long serialVersionUID = 1;
    private final List<StrReplacer> replacers = new LinkedList();

    public ReplacerChain(StrReplacer... strReplacerArr) {
        for (StrReplacer strReplacer : strReplacerArr) {
            addChain(strReplacer);
        }
    }

    @Override // java.lang.Iterable
    public Iterator<StrReplacer> iterator() {
        return this.replacers.iterator();
    }

    @Override // cn.hutool.core.text.replacer.StrReplacer
    protected int replace(CharSequence charSequence, int i8, StrBuilder strBuilder) {
        Iterator<StrReplacer> it = this.replacers.iterator();
        int i9 = 0;
        while (it.hasNext() && (i9 = it.next().replace(charSequence, i8, strBuilder)) == 0) {
        }
        return i9;
    }

    @Override // cn.hutool.core.lang.r
    public ReplacerChain addChain(StrReplacer strReplacer) {
        this.replacers.add(strReplacer);
        return this;
    }
}
