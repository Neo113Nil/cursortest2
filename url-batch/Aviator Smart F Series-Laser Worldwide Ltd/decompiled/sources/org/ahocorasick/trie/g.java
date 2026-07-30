package org.ahocorasick.trie;

/* loaded from: classes5.dex */
public class g {
    private boolean allowOverlaps = true;
    private boolean onlyWholeWords = false;
    private boolean onlyWholeWordsWhiteSpaceSeparated = false;
    private boolean caseInsensitive = false;
    private boolean stopOnHit = false;

    public boolean isAllowOverlaps() {
        return this.allowOverlaps;
    }

    public boolean isCaseInsensitive() {
        return this.caseInsensitive;
    }

    public boolean isOnlyWholeWords() {
        return this.onlyWholeWords;
    }

    public boolean isOnlyWholeWordsWhiteSpaceSeparated() {
        return this.onlyWholeWordsWhiteSpaceSeparated;
    }

    public boolean isStopOnHit() {
        return this.stopOnHit;
    }

    public void setAllowOverlaps(boolean z7) {
        this.allowOverlaps = z7;
    }

    public void setCaseInsensitive(boolean z7) {
        this.caseInsensitive = z7;
    }

    public void setOnlyWholeWords(boolean z7) {
        this.onlyWholeWords = z7;
    }

    public void setOnlyWholeWordsWhiteSpaceSeparated(boolean z7) {
        this.onlyWholeWordsWhiteSpaceSeparated = z7;
    }

    public void setStopOnHit(boolean z7) {
        this.stopOnHit = z7;
    }
}
