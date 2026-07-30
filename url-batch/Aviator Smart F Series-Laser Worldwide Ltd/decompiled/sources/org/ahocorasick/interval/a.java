package org.ahocorasick.interval;

/* loaded from: classes5.dex */
public class a implements c {
    private int end;
    private int start;

    public a(int i8, int i9) {
        this.start = i8;
        this.end = i9;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (!(obj instanceof c)) {
            return -1;
        }
        c cVar = (c) obj;
        int start = this.start - cVar.getStart();
        return start != 0 ? start : this.end - cVar.getEnd();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.start == cVar.getStart() && this.end == cVar.getEnd();
    }

    @Override // org.ahocorasick.interval.c
    public int getEnd() {
        return this.end;
    }

    @Override // org.ahocorasick.interval.c
    public int getStart() {
        return this.start;
    }

    public int hashCode() {
        return (this.start % 100) + (this.end % 100);
    }

    public boolean overlapsWith(int i8) {
        return this.start <= i8 && i8 <= this.end;
    }

    @Override // org.ahocorasick.interval.c
    public int size() {
        return (this.end - this.start) + 1;
    }

    public String toString() {
        return this.start + ":" + this.end;
    }

    public boolean overlapsWith(a aVar) {
        return this.start <= aVar.getEnd() && this.end >= aVar.getStart();
    }
}
