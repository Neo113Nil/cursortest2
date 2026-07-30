package com.google.thirdparty.publicsuffix;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Queues;
import java.util.Deque;

@GwtCompatible
/* loaded from: classes4.dex */
final class TrieParser {
    private static final Joiner PREFIX_JOINER = Joiner.on("");

    TrieParser() {
    }

    private static int doParseTrieToBuilder(Deque<CharSequence> deque, CharSequence charSequence, int i8, ImmutableMap.Builder<String, PublicSuffixType> builder) {
        int length = charSequence.length();
        char c8 = 0;
        int i9 = i8;
        while (i9 < length && (c8 = charSequence.charAt(i9)) != '&' && c8 != '?' && c8 != '!' && c8 != ':' && c8 != ',') {
            i9++;
        }
        deque.push(reverse(charSequence.subSequence(i8, i9)));
        if (c8 == '!' || c8 == '?' || c8 == ':' || c8 == ',') {
            String join = PREFIX_JOINER.join(deque);
            if (join.length() > 0) {
                builder.put(join, PublicSuffixType.fromCode(c8));
            }
        }
        int i10 = i9 + 1;
        if (c8 != '?' && c8 != ',') {
            while (i10 < length) {
                i10 += doParseTrieToBuilder(deque, charSequence, i10, builder);
                if (charSequence.charAt(i10) == '?' || charSequence.charAt(i10) == ',') {
                    i10++;
                    break;
                }
            }
        }
        deque.pop();
        return i10 - i8;
    }

    static ImmutableMap<String, PublicSuffixType> parseTrie(CharSequence charSequence) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        int length = charSequence.length();
        int i8 = 0;
        while (i8 < length) {
            i8 += doParseTrieToBuilder(Queues.newArrayDeque(), charSequence, i8, builder);
        }
        return builder.buildOrThrow();
    }

    private static CharSequence reverse(CharSequence charSequence) {
        return new StringBuilder(charSequence).reverse();
    }
}
