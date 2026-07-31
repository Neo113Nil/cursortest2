package androidx.collection;

import kotlin.Metadata;

/* compiled from: LongLongPair.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/collection/LongLongPair;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "first", "J", "getFirst", "()J", "second", "getSecond", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LongLongPair {
    private final long first;
    private final long second;

    public boolean equals(Object other) {
        if (!(other instanceof LongLongPair)) {
            return false;
        }
        LongLongPair longLongPair = (LongLongPair) other;
        return longLongPair.first == this.first && longLongPair.second == this.second;
    }

    public int hashCode() {
        return Long.hashCode(this.first) ^ Long.hashCode(this.second);
    }

    public String toString() {
        return '(' + this.first + ", " + this.second + ')';
    }
}
