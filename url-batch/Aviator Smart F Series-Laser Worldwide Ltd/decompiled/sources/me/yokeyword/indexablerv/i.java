package me.yokeyword.indexablerv;

import androidx.annotation.NonNull;
import java.util.Comparator;

/* loaded from: classes5.dex */
class i implements Comparator {
    i() {
    }

    private int compareIndexName(String str, String str2) {
        int i8 = 0;
        String word = getWord(str, 0);
        String word2 = getWord(str2, 0);
        while (word.equals(word2) && !word.equals("")) {
            i8++;
            word = getWord(str, i8);
            word2 = getWord(str2, i8);
        }
        return word.compareTo(word2);
    }

    @NonNull
    private String getWord(String str, int i8) {
        int i9 = i8 + 1;
        return str.length() < i9 ? "" : j.matchingPolyphone(str) ? j.getPingYin(j.getPolyphoneRealHanzi(str).substring(i8, i9)) : j.getPingYin(str.substring(i8, i9));
    }

    @Override // java.util.Comparator
    public int compare(b bVar, b bVar2) {
        String indexByField = bVar.getIndexByField();
        String indexByField2 = bVar2.getIndexByField();
        if (indexByField == null) {
            indexByField = "";
        }
        if (indexByField2 == null) {
            indexByField2 = "";
        }
        return compareIndexName(indexByField.trim(), indexByField2.trim());
    }
}
