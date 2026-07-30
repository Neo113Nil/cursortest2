package cn.hutool.core.text.replacer;

import cn.hutool.core.text.StrBuilder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class LookupReplacer extends StrReplacer {
    private static final long serialVersionUID = 1;
    private final int maxLength;
    private final int minLength;
    private final Map<String, String> lookupMap = new HashMap();
    private final Set<Character> prefixSet = new HashSet();

    public LookupReplacer(String[]... strArr) {
        int i8 = Integer.MAX_VALUE;
        int i9 = 0;
        for (String[] strArr2 : strArr) {
            String str = strArr2[0];
            this.lookupMap.put(str, strArr2[1]);
            this.prefixSet.add(Character.valueOf(str.charAt(0)));
            int length = str.length();
            i9 = length > i9 ? length : i9;
            if (length < i8) {
                i8 = length;
            }
        }
        this.maxLength = i9;
        this.minLength = i8;
    }

    @Override // cn.hutool.core.text.replacer.StrReplacer
    protected int replace(CharSequence charSequence, int i8, StrBuilder strBuilder) {
        if (!this.prefixSet.contains(Character.valueOf(charSequence.charAt(i8)))) {
            return 0;
        }
        int i9 = this.maxLength;
        if (i8 + i9 > charSequence.length()) {
            i9 = charSequence.length() - i8;
        }
        while (i9 >= this.minLength) {
            String str = this.lookupMap.get(charSequence.subSequence(i8, i8 + i9).toString());
            if (str != null) {
                strBuilder.append((CharSequence) str);
                return i9;
            }
            i9--;
        }
        return 0;
    }
}
