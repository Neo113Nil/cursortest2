package com.github.promeg.pinyinhelper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class c {
    static List<h> mPinyinDicts;
    static i mSelector;
    static org.ahocorasick.trie.f mTrieDict;

    public static final class b {
        List<h> mPinyinDicts;
        i mSelector;

        List<h> getPinyinDicts() {
            return this.mPinyinDicts;
        }

        i getSelector() {
            return this.mSelector;
        }

        boolean valid() {
            return (getPinyinDicts() == null || getSelector() == null) ? false : true;
        }

        public b with(h hVar) {
            if (hVar != null) {
                List<h> list = this.mPinyinDicts;
                if (list == null) {
                    ArrayList arrayList = new ArrayList();
                    this.mPinyinDicts = arrayList;
                    arrayList.add(hVar);
                } else if (!list.contains(hVar)) {
                    this.mPinyinDicts.add(hVar);
                }
            }
            return this;
        }

        private b(List<h> list) {
            if (list != null) {
                this.mPinyinDicts = new ArrayList(list);
            }
            this.mSelector = new com.github.promeg.pinyinhelper.b();
        }
    }

    private c() {
    }

    public static void add(h hVar) {
        if (hVar == null || hVar.a() == null || hVar.a().size() == 0) {
            return;
        }
        init(new b(mPinyinDicts).with(hVar));
    }

    private static short decodeIndex(byte[] bArr, byte[] bArr2, int i8) {
        int i9 = i8 % 8;
        short s7 = (short) (bArr2[i8] & 255);
        return (bArr[i8 / 8] & g.BIT_MASKS[i9]) != 0 ? (short) (s7 | 256) : s7;
    }

    private static int getPinyinCode(char c8) {
        int i8 = c8 - 19968;
        return (i8 < 0 || i8 >= 7000) ? (7000 > i8 || i8 >= 14000) ? decodeIndex(f.PINYIN_CODE_PADDING, f.PINYIN_CODE, c8 - 33968) : decodeIndex(e.PINYIN_CODE_PADDING, e.PINYIN_CODE, c8 - 26968) : decodeIndex(d.PINYIN_CODE_PADDING, d.PINYIN_CODE, i8);
    }

    public static void init(b bVar) {
        if (bVar == null) {
            mPinyinDicts = null;
            mTrieDict = null;
            mSelector = null;
        } else if (bVar.valid()) {
            mPinyinDicts = Collections.unmodifiableList(bVar.getPinyinDicts());
            mTrieDict = j.dictsToTrie(bVar.getPinyinDicts());
            mSelector = bVar.getSelector();
        }
    }

    public static boolean isChinese(char c8) {
        return (19968 <= c8 && c8 <= 40869 && getPinyinCode(c8) > 0) || 12295 == c8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static b newConfig() {
        return new b(null);
    }

    public static String toPinyin(String str, String str2) {
        return com.github.promeg.pinyinhelper.a.toPinyin(str, mTrieDict, mPinyinDicts, str2, mSelector);
    }

    public static String toPinyin(char c8) {
        return isChinese(c8) ? c8 == 12295 ? "LING" : g.PINYIN_TABLE[getPinyinCode(c8)] : String.valueOf(c8);
    }
}
