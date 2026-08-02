package defpackage;

import android.content.ContentResolver;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bgn implements bgf, bgo {
    private final ContentResolver a;
    private final boolean b;
    private final /* synthetic */ int c;

    public bgn(ContentResolver contentResolver, boolean z, int i) {
        this.c = i;
        this.a = contentResolver;
        this.b = z;
    }

    @Override // defpackage.bgo
    public final bbu a(Uri uri) {
        int i = this.c;
        return i != 0 ? i != 1 ? new bck(this.a, uri, this.b) : new bbq(this.a, uri, this.b) : new bcc(this.a, uri, this.b);
    }

    @Override // defpackage.bgf
    public final bge b(bgj bgjVar) {
        int i = this.c;
        return i != 0 ? i != 1 ? new bgp(this) : new bgp(this) : new bgp(this);
    }
}
