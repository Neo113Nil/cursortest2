package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eeg {
    public final eef a;
    public final eej b;

    public eeg(eef eefVar, eej eejVar) {
        this.a = eefVar;
        this.b = eejVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eeg) {
            eeg eegVar = (eeg) obj;
            if (this.a.equals(eegVar.a) && this.b.equals(eegVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        return this.b.hashCode() ^ (hashCode * 1000003);
    }

    public final String toString() {
        eej eejVar = this.b;
        return "ExpressSignInSpec{onContinueWithAccountListenerWithAsyncCallback=" + String.valueOf(this.a) + ", features=" + String.valueOf(eejVar) + "}";
    }

    public eeg() {
        throw null;
    }
}
