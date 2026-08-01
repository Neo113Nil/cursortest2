package defpackage;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class nv extends ov {
    public final fv a;

    public nv(fv fvVar) {
        fvVar.getClass();
        this.a = fvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nv) && zo.b(this.a, ((nv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NoteItem(note=" + this.a + ")";
    }
}
