package cn.hutool.core.text.split;

import cn.hutool.core.collection.w;
import cn.hutool.core.lang.q;
import cn.hutool.core.text.finder.TextFinder;
import cn.hutool.core.text.l;
import cn.hutool.core.util.c1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/* loaded from: classes.dex */
public class SplitIter extends w implements Serializable {
    private static final long serialVersionUID = 1;
    private int count;
    private final TextFinder finder;
    private final boolean ignoreEmpty;
    private final int limit;
    private int offset;
    private final String text;

    public SplitIter(CharSequence charSequence, TextFinder textFinder, int i8, boolean z7) {
        q.notNull(charSequence, "Text must be not null!", new Object[0]);
        this.text = charSequence.toString();
        this.finder = textFinder.setText(charSequence);
        this.limit = i8 <= 0 ? Integer.MAX_VALUE : i8;
        this.ignoreEmpty = z7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$toList$0(boolean z7, String str) {
        return z7 ? l.trim(str) : str;
    }

    public void reset() {
        this.finder.reset();
        this.offset = 0;
        this.count = 0;
    }

    public String[] toArray(boolean z7) {
        return (String[]) toList(z7).toArray(new String[0]);
    }

    public List<String> toList(final boolean z7) {
        return toList(new Function() { // from class: cn.hutool.core.text.split.a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String lambda$toList$0;
                lambda$toList$0 = SplitIter.lambda$toList$0(z7, (String) obj);
                return lambda$toList$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.hutool.core.collection.w
    public String computeNext() {
        if (this.count >= this.limit || this.offset > this.text.length()) {
            return null;
        }
        if (this.count == this.limit - 1) {
            if (this.ignoreEmpty && this.offset == this.text.length()) {
                return null;
            }
            this.count++;
            return this.text.substring(this.offset);
        }
        int start = this.finder.start(this.offset);
        if (start < 0) {
            if (this.offset <= this.text.length()) {
                String substring = this.text.substring(this.offset);
                if (!this.ignoreEmpty || !substring.isEmpty()) {
                    this.offset = Integer.MAX_VALUE;
                    return substring;
                }
            }
            return null;
        }
        String substring2 = this.text.substring(this.offset, start);
        this.offset = this.finder.end(start);
        if (this.ignoreEmpty && substring2.isEmpty()) {
            return computeNext();
        }
        this.count++;
        return substring2;
    }

    public <T> List<T> toList(Function<String, T> function) {
        Object apply;
        ArrayList arrayList = new ArrayList();
        while (hasNext()) {
            apply = function.apply(next());
            if (!this.ignoreEmpty || !c1.isEmptyIfStr(apply)) {
                arrayList.add(apply);
            }
        }
        return arrayList.isEmpty() ? new ArrayList(0) : arrayList;
    }
}
