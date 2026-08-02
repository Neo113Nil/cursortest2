package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class drz {
    public final dry a;
    public final dry b;
    public final dry c;

    public drz(dry dryVar, dry dryVar2, dry dryVar3) {
        this.a = dryVar;
        this.b = dryVar2;
        this.c = dryVar3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof drz) {
            drz drzVar = (drz) obj;
            if (this.a.equals(drzVar.a) && this.b.equals(drzVar.b) && this.c.equals(drzVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        return this.c.hashCode() ^ (hashCode * 1000003);
    }

    public final String toString() {
        dry dryVar = this.c;
        dry dryVar2 = this.b;
        return "AccountMenuClickListeners{myAccountClickListener=" + String.valueOf(this.a) + ", useAnotherAccountClickListener=" + String.valueOf(dryVar2) + ", manageAccountsClickListener=" + String.valueOf(dryVar) + "}";
    }

    public drz() {
        throw null;
    }
}
