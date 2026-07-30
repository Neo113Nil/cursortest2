package kotlinx.coroutines.internal;

/* loaded from: classes5.dex */
public final class g0 {
    public final String symbol;

    public g0(String str) {
        this.symbol = str;
    }

    public String toString() {
        return '<' + this.symbol + '>';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T unbox(Object obj) {
        if (obj == this) {
            return null;
        }
        return obj;
    }
}
