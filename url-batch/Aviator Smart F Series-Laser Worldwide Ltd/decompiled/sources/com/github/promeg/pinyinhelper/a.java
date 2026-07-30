package com.github.promeg.pinyinhelper;

import cn.hutool.core.convert.impl.s;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
final class a {
    static final C0264a EMIT_COMPARATOR = new C0264a();

    /* renamed from: com.github.promeg.pinyinhelper.a$a, reason: collision with other inner class name */
    static final class C0264a implements Comparator {
        C0264a() {
        }

        @Override // java.util.Comparator
        public int compare(org.ahocorasick.trie.a aVar, org.ahocorasick.trie.a aVar2) {
            if (aVar.getStart() == aVar2.getStart()) {
                if (aVar.size() < aVar2.size()) {
                    return 1;
                }
                return aVar.size() == aVar2.size() ? 0 : -1;
            }
            if (aVar.getStart() < aVar2.getStart()) {
                return -1;
            }
            return aVar.getStart() == aVar2.getStart() ? 0 : 1;
        }
    }

    private a() {
    }

    static String[] pinyinFromDict(String str, List<h> list) {
        if (list != null) {
            Iterator<h> it = list.iterator();
            while (it.hasNext()) {
                s.a(it.next());
            }
        }
        throw new IllegalArgumentException("No pinyin dict contains word: " + str);
    }

    static String toPinyin(String str, org.ahocorasick.trie.f fVar, List<h> list, String str2, i iVar) {
        if (str == null || str.length() == 0) {
            return str;
        }
        if (fVar == null || iVar == null) {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i8 = 0; i8 < str.length(); i8++) {
                stringBuffer.append(c.toPinyin(str.charAt(i8)));
                if (i8 != str.length() - 1) {
                    stringBuffer.append(str2);
                }
            }
            return stringBuffer.toString();
        }
        List<org.ahocorasick.trie.a> select = iVar.select(fVar.parseText(str));
        Collections.sort(select, EMIT_COMPARATOR);
        StringBuffer stringBuffer2 = new StringBuffer();
        int i9 = 0;
        int i10 = 0;
        while (i9 < str.length()) {
            if (i10 >= select.size() || i9 != select.get(i10).getStart()) {
                stringBuffer2.append(c.toPinyin(str.charAt(i9)));
                i9++;
            } else {
                String[] pinyinFromDict = pinyinFromDict(select.get(i10).getKeyword(), list);
                for (int i11 = 0; i11 < pinyinFromDict.length; i11++) {
                    stringBuffer2.append(pinyinFromDict[i11].toUpperCase());
                    if (i11 != pinyinFromDict.length - 1) {
                        stringBuffer2.append(str2);
                    }
                }
                i9 += select.get(i10).size();
                i10++;
            }
            if (i9 != str.length()) {
                stringBuffer2.append(str2);
            }
        }
        return stringBuffer2.toString();
    }
}
