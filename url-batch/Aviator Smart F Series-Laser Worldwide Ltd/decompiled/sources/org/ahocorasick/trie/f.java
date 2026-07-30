package org.ahocorasick.trie;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes5.dex */
public class f {
    private d rootState;
    private g trieConfig;

    public static class b {
        private f trie;
        private g trieConfig;

        public b addKeyword(String str) {
            this.trie.addKeyword(str);
            return this;
        }

        public f build() {
            this.trie.constructFailureStates();
            return this.trie;
        }

        public b caseInsensitive() {
            this.trieConfig.setCaseInsensitive(true);
            return this;
        }

        public b onlyWholeWords() {
            this.trieConfig.setOnlyWholeWords(true);
            return this;
        }

        public b onlyWholeWordsWhiteSpaceSeparated() {
            this.trieConfig.setOnlyWholeWordsWhiteSpaceSeparated(true);
            return this;
        }

        public b removeOverlaps() {
            this.trieConfig.setAllowOverlaps(false);
            return this;
        }

        public b stopOnHit() {
            this.trie.trieConfig.setStopOnHit(true);
            return this;
        }

        private b() {
            g gVar = new g();
            this.trieConfig = gVar;
            this.trie = new f(gVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addKeyword(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        d dVar = this.rootState;
        for (char c8 : str.toCharArray()) {
            Character valueOf = Character.valueOf(c8);
            if (this.trieConfig.isCaseInsensitive()) {
                valueOf = Character.valueOf(Character.toLowerCase(valueOf.charValue()));
            }
            dVar = dVar.addState(valueOf);
        }
        if (this.trieConfig.isCaseInsensitive()) {
            str = str.toLowerCase();
        }
        dVar.addEmit(str);
    }

    public static b builder() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void constructFailureStates() {
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
        for (d dVar : this.rootState.getStates()) {
            dVar.setFailure(this.rootState);
            linkedBlockingDeque.add(dVar);
        }
        while (!linkedBlockingDeque.isEmpty()) {
            d dVar2 = (d) linkedBlockingDeque.remove();
            for (Character ch : dVar2.getTransitions()) {
                d nextState = dVar2.nextState(ch);
                linkedBlockingDeque.add(nextState);
                d failure = dVar2.failure();
                while (failure.nextState(ch) == null) {
                    failure = failure.failure();
                }
                d nextState2 = failure.nextState(ch);
                nextState.setFailure(nextState2);
                nextState.addEmit(nextState2.emit());
            }
        }
    }

    private e createFragment(org.ahocorasick.trie.a aVar, String str, int i8) {
        return new org.ahocorasick.trie.b(str.substring(i8 + 1, aVar == null ? str.length() : aVar.getStart()));
    }

    private e createMatch(org.ahocorasick.trie.a aVar, String str) {
        return new c(str.substring(aVar.getStart(), aVar.getEnd() + 1), aVar);
    }

    private d getState(d dVar, Character ch) {
        d nextState = dVar.nextState(ch);
        while (nextState == null) {
            dVar = dVar.failure();
            nextState = dVar.nextState(ch);
        }
        return nextState;
    }

    private boolean isPartialMatch(CharSequence charSequence, org.ahocorasick.trie.a aVar) {
        if (aVar.getStart() == 0 || !Character.isAlphabetic(charSequence.charAt(aVar.getStart() - 1))) {
            return aVar.getEnd() + 1 != charSequence.length() && Character.isAlphabetic(charSequence.charAt(aVar.getEnd() + 1));
        }
        return true;
    }

    private void removePartialMatches(CharSequence charSequence, List<org.ahocorasick.trie.a> list) {
        ArrayList arrayList = new ArrayList();
        for (org.ahocorasick.trie.a aVar : list) {
            if (isPartialMatch(charSequence, aVar)) {
                arrayList.add(aVar);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            list.remove((org.ahocorasick.trie.a) it.next());
        }
    }

    private void removePartialMatchesWhiteSpaceSeparated(CharSequence charSequence, List<org.ahocorasick.trie.a> list) {
        long length = charSequence.length();
        ArrayList arrayList = new ArrayList();
        for (org.ahocorasick.trie.a aVar : list) {
            if ((aVar.getStart() != 0 && !Character.isWhitespace(charSequence.charAt(aVar.getStart() - 1))) || (aVar.getEnd() + 1 != length && !Character.isWhitespace(charSequence.charAt(aVar.getEnd() + 1)))) {
                arrayList.add(aVar);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            list.remove((org.ahocorasick.trie.a) it.next());
        }
    }

    private boolean storeEmits(int i8, d dVar, o6.b bVar) {
        Collection<String> emit = dVar.emit();
        boolean z7 = false;
        if (emit != null && !emit.isEmpty()) {
            for (String str : emit) {
                bVar.emit(new org.ahocorasick.trie.a((i8 - str.length()) + 1, i8, str));
                z7 = true;
            }
        }
        return z7;
    }

    public boolean containsMatch(CharSequence charSequence) {
        return firstMatch(charSequence) != null;
    }

    public org.ahocorasick.trie.a firstMatch(CharSequence charSequence) {
        if (!this.trieConfig.isAllowOverlaps()) {
            Collection<org.ahocorasick.trie.a> parseText = parseText(charSequence);
            if (parseText == null || parseText.isEmpty()) {
                return null;
            }
            return parseText.iterator().next();
        }
        d dVar = this.rootState;
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            Character valueOf = Character.valueOf(charSequence.charAt(i8));
            if (this.trieConfig.isCaseInsensitive()) {
                valueOf = Character.valueOf(Character.toLowerCase(valueOf.charValue()));
            }
            dVar = getState(dVar, valueOf);
            Collection<String> emit = dVar.emit();
            if (emit != null && !emit.isEmpty()) {
                for (String str : emit) {
                    org.ahocorasick.trie.a aVar = new org.ahocorasick.trie.a((i8 - str.length()) + 1, i8, str);
                    if (!this.trieConfig.isOnlyWholeWords() || !isPartialMatch(charSequence, aVar)) {
                        return aVar;
                    }
                }
            }
        }
        return null;
    }

    public Collection<org.ahocorasick.trie.a> parseText(CharSequence charSequence) {
        o6.a aVar = new o6.a();
        parseText(charSequence, aVar);
        List<org.ahocorasick.trie.a> emits = aVar.getEmits();
        if (this.trieConfig.isOnlyWholeWords()) {
            removePartialMatches(charSequence, emits);
        }
        if (this.trieConfig.isOnlyWholeWordsWhiteSpaceSeparated()) {
            removePartialMatchesWhiteSpaceSeparated(charSequence, emits);
        }
        if (!this.trieConfig.isAllowOverlaps()) {
            new org.ahocorasick.interval.b(emits).removeOverlaps(emits);
        }
        return emits;
    }

    public Collection<e> tokenize(String str) {
        ArrayList arrayList = new ArrayList();
        int i8 = -1;
        for (org.ahocorasick.trie.a aVar : parseText(str)) {
            if (aVar.getStart() - i8 > 1) {
                arrayList.add(createFragment(aVar, str, i8));
            }
            arrayList.add(createMatch(aVar, str));
            i8 = aVar.getEnd();
        }
        if (str.length() - i8 > 1) {
            arrayList.add(createFragment(null, str, i8));
        }
        return arrayList;
    }

    private f(g gVar) {
        this.trieConfig = gVar;
        this.rootState = new d();
    }

    public void parseText(CharSequence charSequence, o6.b bVar) {
        d dVar = this.rootState;
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            Character valueOf = Character.valueOf(charSequence.charAt(i8));
            if (this.trieConfig.isCaseInsensitive()) {
                valueOf = Character.valueOf(Character.toLowerCase(valueOf.charValue()));
            }
            dVar = getState(dVar, valueOf);
            if (storeEmits(i8, dVar, bVar) && this.trieConfig.isStopOnHit()) {
                return;
            }
        }
    }
}
