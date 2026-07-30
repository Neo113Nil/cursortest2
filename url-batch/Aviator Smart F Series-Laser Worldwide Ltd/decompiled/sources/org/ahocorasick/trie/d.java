package org.ahocorasick.trie;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* loaded from: classes5.dex */
public class d {
    private final int depth;
    private Set<String> emits;
    private d failure;
    private final d rootState;
    private Map<Character, d> success;

    public d() {
        this(0);
    }

    private d nextState(Character ch, boolean z7) {
        d dVar;
        d dVar2 = this.success.get(ch);
        return (z7 || dVar2 != null || (dVar = this.rootState) == null) ? dVar2 : dVar;
    }

    public void addEmit(String str) {
        if (this.emits == null) {
            this.emits = new TreeSet();
        }
        this.emits.add(str);
    }

    public d addState(Character ch) {
        d nextStateIgnoreRootState = nextStateIgnoreRootState(ch);
        if (nextStateIgnoreRootState != null) {
            return nextStateIgnoreRootState;
        }
        d dVar = new d(this.depth + 1);
        this.success.put(ch, dVar);
        return dVar;
    }

    public Collection<String> emit() {
        Set<String> set = this.emits;
        return set == null ? Collections.emptyList() : set;
    }

    public d failure() {
        return this.failure;
    }

    public int getDepth() {
        return this.depth;
    }

    public Collection<d> getStates() {
        return this.success.values();
    }

    public Collection<Character> getTransitions() {
        return this.success.keySet();
    }

    public d nextStateIgnoreRootState(Character ch) {
        return nextState(ch, true);
    }

    public void setFailure(d dVar) {
        this.failure = dVar;
    }

    public d(int i8) {
        this.success = new HashMap();
        this.failure = null;
        this.emits = null;
        this.depth = i8;
        this.rootState = i8 == 0 ? this : null;
    }

    public d nextState(Character ch) {
        return nextState(ch, false);
    }

    public void addEmit(Collection<String> collection) {
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            addEmit(it.next());
        }
    }
}
