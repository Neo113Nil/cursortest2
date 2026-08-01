package defpackage;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class wu extends jw {
    public final ru o;

    public wu(ru ruVar) {
        ruVar.getClass();
        this.o = ruVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && wu.class == obj.getClass() && zo.b(this.o, ((wu) obj).o);
    }

    public final int hashCode() {
        return this.o.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.o + ", direction=-1)";
    }
}
